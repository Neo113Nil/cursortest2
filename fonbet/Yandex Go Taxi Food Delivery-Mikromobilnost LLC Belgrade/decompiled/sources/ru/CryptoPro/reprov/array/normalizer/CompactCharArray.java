package ru.CryptoPro.reprov.array.normalizer;

import defpackage.ny61;

/* loaded from: classes4.dex */
public class CompactCharArray implements Cloneable {
    private static final int BLOCKCOUNT = 32;
    private static final int BLOCKMASK = 31;
    private static final int BLOCKSHIFT = 5;
    private static final int INDEXCOUNT = 2048;
    private static final int INDEXSHIFT = 11;
    public static final int UNICODECOUNT = 65536;
    private int[] hashes;
    private char[] indices;
    private char[] values;

    public CompactCharArray(char[] cArr, char[] cArr2) {
        if (cArr.length != 2048) {
            ny61.g("Index out of bounds.");
            throw null;
        }
        for (int i = 0; i < 2048; i++) {
            char c = cArr[i];
            if (c < 0 || c >= cArr2.length + 32) {
                ny61.g("Index out of bounds.");
                throw null;
            }
        }
        this.indices = cArr;
        this.values = cArr2;
    }

    public Object clone() {
        try {
            CompactCharArray compactCharArray = (CompactCharArray) super.clone();
            compactCharArray.values = (char[]) this.values.clone();
            compactCharArray.indices = (char[]) this.indices.clone();
            int[] iArr = this.hashes;
            if (iArr != null) {
                compactCharArray.hashes = (int[]) iArr.clone();
            }
            return compactCharArray;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public char elementAt(char c) {
        return this.values[(this.indices[c >> 5] & Normalizer.DONE) + (c & 31)];
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
        CompactCharArray compactCharArray = (CompactCharArray) obj;
        for (int i = 0; i < 65536; i++) {
            char c = (char) i;
            if (elementAt(c) != compactCharArray.elementAt(c)) {
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
            char[] cArr = this.values;
            if (i >= cArr.length) {
                return i2;
            }
            i2 = (i2 * 37) + cArr[i];
            i += min;
        }
    }

    public CompactCharArray(String str, String str2) {
        this(Utility.RLEStringToCharArray(str), Utility.RLEStringToCharArray(str2));
    }
}
