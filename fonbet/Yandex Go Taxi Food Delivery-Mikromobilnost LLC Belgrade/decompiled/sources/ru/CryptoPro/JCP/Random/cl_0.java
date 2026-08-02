package ru.CryptoPro.JCP.Random;

import defpackage.xt61;
import java.io.NotSerializableException;
import java.io.ObjectStreamException;
import java.security.SecureRandomSpi;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class cl_0 extends SecureRandomSpi implements RandomInterface {
    @Override // java.security.SecureRandomSpi
    public byte[] engineGenerateSeed(int i) {
        return getRandomSeed(i);
    }

    @Override // java.security.SecureRandomSpi
    public void engineNextBytes(byte[] bArr) {
        makeRandom(bArr, 0, bArr.length);
    }

    @Override // java.security.SecureRandomSpi
    public void engineSetSeed(byte[] bArr) {
        setRandomSeed(bArr);
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public void getRandomSeed(byte[] bArr) {
        makeRandom(bArr, 0, bArr.length);
    }

    public int getRandomState() {
        return 0;
    }

    public void makeRandom(int[] iArr, int i, int i2) {
        int i3 = i2 << 2;
        byte[] bArr = new byte[i3];
        try {
            makeRandom(bArr, 0, i3);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr[i + i4] = xt61.a(i4 << 2, bArr);
            }
        } finally {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public byte[] makeRandomBytes(int i) {
        byte[] bArr = new byte[i];
        makeRandom(bArr, 0, i);
        return bArr;
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public int[] makeRandomInts(int i) {
        int[] iArr = new int[i];
        makeRandom(iArr, 0, i);
        return iArr;
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public int nextInt() {
        return makeRandomInts(1)[0];
    }

    public Object readResolve() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public Object writeReplace() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public byte[] getRandomSeed(int i) {
        return makeRandomBytes(i);
    }
}
