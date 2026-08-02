package ru.CryptoPro.JCP.Random;

/* loaded from: classes4.dex */
public class Seeder extends cl_0 {
    private int a;
    private byte[] b;
    private int c = 0;

    public Seeder(byte[] bArr, int i) {
        this.b = bArr;
        this.a = i;
    }

    @Override // ru.CryptoPro.JCP.Random.cl_0, ru.CryptoPro.JCP.Random.RandomInterface
    public final int getRandomState() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final boolean isReady() {
        return this.c < this.b.length;
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final void makeRandom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.b;
        int length = bArr2.length;
        int i3 = this.c;
        if (i2 > length - i3 || bArr.length < i + i2) {
            throw new RandomRefuseException();
        }
        System.arraycopy(bArr2, i3, bArr, i, i2);
        this.c += i2;
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final void setRandomSeed(RandomInterface randomInterface) {
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final void setRandomSeed(byte[] bArr) {
    }
}
