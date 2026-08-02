package ru.CryptoPro.reprov.array;

import defpackage.ny61;
import java.io.ByteArrayOutputStream;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes4.dex */
public class BitArray {
    private static final int BITS_PER_UNIT = 8;
    private static final int BYTES_PER_LINE = 8;
    private static final byte[][] NYBBLE = {new byte[]{48, 48, 48, 48}, new byte[]{48, 48, 48, 49}, new byte[]{48, 48, 49, 48}, new byte[]{48, 48, 49, 49}, new byte[]{48, 49, 48, 48}, new byte[]{48, 49, 48, 49}, new byte[]{48, 49, 49, 48}, new byte[]{48, 49, 49, 49}, new byte[]{49, 48, 48, 48}, new byte[]{49, 48, 48, 49}, new byte[]{49, 48, 49, 48}, new byte[]{49, 48, 49, 49}, new byte[]{49, 49, 48, 48}, new byte[]{49, 49, 48, 49}, new byte[]{49, 49, 49, 48}, new byte[]{49, 49, 49, 49}};
    private int length;
    private byte[] repn;

    public BitArray(int i, byte[] bArr) throws IllegalArgumentException {
        if (i < 0) {
            ny61.g("Negative length for BitArray");
            throw null;
        }
        if (bArr.length * 8 < i) {
            ny61.g("Byte array too short to represent bit array of given length");
            throw null;
        }
        this.length = i;
        int i2 = (i + 7) / 8;
        byte b = (byte) (255 << ((i2 * 8) - i));
        byte[] bArr2 = new byte[i2];
        this.repn = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        if (i2 > 0) {
            byte[] bArr3 = this.repn;
            int i3 = i2 - 1;
            bArr3[i3] = (byte) (b & bArr3[i3]);
        }
    }

    private static int position(int i) {
        return 1 << (7 - (i % 8));
    }

    private static int subscript(int i) {
        return i / 8;
    }

    public Object clone() {
        return new BitArray(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        if (bitArray.length != this.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.repn;
            if (i >= bArr.length) {
                return true;
            }
            if (bArr[i] != bitArray.repn[i]) {
                return false;
            }
            i++;
        }
    }

    public boolean get(int i) throws ArrayIndexOutOfBoundsException {
        if (i < 0 || i >= this.length) {
            throw new ArrayIndexOutOfBoundsException(Integer.toString(i));
        }
        return (this.repn[subscript(i)] & position(i)) != 0;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.repn;
            if (i >= bArr.length) {
                return this.length ^ i2;
            }
            i2 = (i2 * 31) + bArr[i];
            i++;
        }
    }

    public int length() {
        return this.length;
    }

    public void set(int i, boolean z) throws ArrayIndexOutOfBoundsException {
        if (i < 0 || i >= this.length) {
            throw new ArrayIndexOutOfBoundsException(Integer.toString(i));
        }
        int subscript = subscript(i);
        int position = position(i);
        byte[] bArr = this.repn;
        if (z) {
            bArr[subscript] = (byte) (position | bArr[subscript]);
        } else {
            bArr[subscript] = (byte) ((~position) & bArr[subscript]);
        }
    }

    public boolean[] toBooleanArray() {
        boolean[] zArr = new boolean[this.length];
        for (int i = 0; i < this.length; i++) {
            zArr[i] = get(i);
        }
        return zArr;
    }

    public byte[] toByteArray() {
        return (byte[]) this.repn.clone();
    }

    public String toString() {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            bArr = this.repn;
            if (i >= bArr.length - 1) {
                break;
            }
            byte[][] bArr2 = NYBBLE;
            byteArrayOutputStream.write(bArr2[(bArr[i] >> 4) & 15], 0, 4);
            byteArrayOutputStream.write(bArr2[this.repn[i] & PKIBody._CCP], 0, 4);
            byteArrayOutputStream.write(i % 8 == 7 ? 10 : 32);
            i++;
        }
        for (int length = (bArr.length - 1) * 8; length < this.length; length++) {
            byteArrayOutputStream.write(get(length) ? 49 : 48);
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    public BitArray truncate() {
        for (int i = this.length - 1; i >= 0; i--) {
            if (get(i)) {
                return new BitArray(i + 1, ArrayUtils.copyOf(this.repn, (i + 8) / 8));
            }
        }
        return new BitArray(1);
    }

    public BitArray(int i) throws IllegalArgumentException {
        if (i < 0) {
            ny61.g("Negative length for BitArray");
            throw null;
        }
        this.length = i;
        this.repn = new byte[(i + 7) / 8];
    }

    private BitArray(BitArray bitArray) {
        this.length = bitArray.length;
        this.repn = (byte[]) bitArray.repn.clone();
    }

    public BitArray(boolean[] zArr) {
        int length = zArr.length;
        this.length = length;
        this.repn = new byte[(length + 7) / 8];
        for (int i = 0; i < this.length; i++) {
            set(i, zArr[i]);
        }
    }
}
