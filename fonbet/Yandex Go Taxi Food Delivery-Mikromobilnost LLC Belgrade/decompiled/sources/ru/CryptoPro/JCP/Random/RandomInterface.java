package ru.CryptoPro.JCP.Random;

/* loaded from: classes4.dex */
public interface RandomInterface {
    public static final int FLAG_BIO = 64;
    public static final int FLAG_IRON = 128;
    public static final int FLAG_KEY = 16;
    public static final int FLAG_LOAD = 32;
    public static final int FLAG_ROOT = 8;

    void getRandomSeed(byte[] bArr);

    byte[] getRandomSeed(int i);

    int getRandomState();

    boolean isReady();

    void makeRandom(byte[] bArr, int i, int i2);

    void makeRandom(int[] iArr, int i, int i2);

    byte[] makeRandomBytes(int i);

    int[] makeRandomInts(int i);

    int nextInt();

    void setRandomSeed(RandomInterface randomInterface);

    void setRandomSeed(byte[] bArr);
}
