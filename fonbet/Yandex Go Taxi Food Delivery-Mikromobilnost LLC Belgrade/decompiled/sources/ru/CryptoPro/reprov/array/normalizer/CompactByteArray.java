package ru.CryptoPro.reprov.array.normalizer;

import defpackage.ny61;

/* loaded from: classes4.dex */
public class CompactByteArray implements Cloneable {
    private static final int BLOCKCOUNT = 128;
    private static final int BLOCKMASK = 127;
    private static final int BLOCKSHIFT = 7;
    private static final int INDEXCOUNT = 512;
    private static final int INDEXSHIFT = 9;
    public static final int UNICODECOUNT = 65536;
    private int[] hashes;
    private short[] indices;
    private byte[] values;

    public CompactByteArray(short[] sArr, byte[] bArr) {
        if (sArr.length != 512) {
            ny61.g("Index out of bounds!");
            throw null;
        }
        for (int i = 0; i < 512; i++) {
            short s = sArr[i];
            if (s < 0 || s >= bArr.length + 128) {
                ny61.g("Index out of bounds!");
                throw null;
            }
        }
        this.indices = sArr;
        this.values = bArr;
    }

    public Object clone() {
        try {
            CompactByteArray compactByteArray = (CompactByteArray) super.clone();
            compactByteArray.values = (byte[]) this.values.clone();
            compactByteArray.indices = (short[]) this.indices.clone();
            int[] iArr = this.hashes;
            if (iArr != null) {
                compactByteArray.hashes = (int[]) iArr.clone();
            }
            return compactByteArray;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public byte elementAt(char c) {
        return this.values[(this.indices[c >> 7] & 65535) + (c & 127)];
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CompactByteArray compactByteArray = (CompactByteArray) obj;
        for (int i = 0; i < 65536; i++) {
            char c = (char) i;
            if (elementAt(c) != compactByteArray.elementAt(c)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int min = Math.min(3, this.values.length / 16);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.values;
            if (i >= bArr.length) {
                return i2;
            }
            i2 = (i2 * 37) + bArr[i];
            i += min;
        }
    }

    public CompactByteArray(String str, String str2) {
        this(Utility.RLEStringToShortArray(str), Utility.RLEStringToByteArray(str2));
    }
}
