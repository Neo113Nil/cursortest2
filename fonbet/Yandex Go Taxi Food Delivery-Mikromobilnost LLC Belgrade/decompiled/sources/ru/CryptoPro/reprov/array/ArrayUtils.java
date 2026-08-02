package ru.CryptoPro.reprov.array;

/* loaded from: classes4.dex */
public class ArrayUtils {
    public static byte[] copyOf(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        return bArr2;
    }

    public static BitArray truncate(BitArray bitArray) {
        int length = bitArray.length();
        byte[] bArr = new byte[(length + 7) / 8];
        for (int i = length - 1; i >= 0; i--) {
            if (bitArray.get(i)) {
                return new BitArray(i + 1, copyOf(bArr, (i + 8) / 8));
            }
        }
        return new BitArray(1);
    }
}
