package ru.CryptoPro.JCSP.Random;

import java.io.NotSerializableException;
import java.io.ObjectStreamException;
import java.security.SecureRandomSpi;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public abstract class BaseRandom extends SecureRandomSpi implements RandomInterface {
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

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public int getRandomState() {
        return 0;
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public abstract boolean isReady();

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public abstract void makeRandom(byte[] bArr, int i, int i2);

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public void makeRandom(int[] iArr, int i, int i2) {
        int i3 = i2 << 2;
        byte[] bArr = new byte[i3];
        try {
            makeRandom(bArr, 0, i3);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr[i + i4] = Array.getInt(bArr, i4 << 2);
            }
        } finally {
            for (int i5 = 0; i5 < i3; i5++) {
                bArr[i5] = 0;
            }
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

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public abstract void setRandomSeed(RandomInterface randomInterface);

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public abstract void setRandomSeed(byte[] bArr);

    public Object writeReplace() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public byte[] getRandomSeed(int i) {
        return makeRandomBytes(i);
    }
}
