package ru.CryptoPro.reprov.array;

import java.util.Comparator;

/* loaded from: classes4.dex */
public class ByteArrayLexOrder implements Comparator {
    @Override // java.util.Comparator
    public final int compare(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length && i < bArr2.length; i++) {
            int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }
}
