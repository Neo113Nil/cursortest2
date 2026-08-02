package ru.CryptoPro.JCSP.Random;

import ru.CryptoPro.JCP.Random.RandomInterface;

/* loaded from: classes4.dex */
public final class TestRandom extends BaseRandom {
    private static final int a = 12;
    private final byte[] b = new byte[12];
    private int c = 0;

    public TestRandom() {
        a((byte) 0);
    }

    private void a() {
        int i = this.b[this.c - 1] + 1;
        this.c = 0;
        for (int i2 = 0; i2 < 12; i2++) {
            this.b[i2] = (byte) (i + i2);
        }
    }

    @Override // ru.CryptoPro.JCSP.Random.BaseRandom, ru.CryptoPro.JCP.Random.RandomInterface
    public boolean isReady() {
        return true;
    }

    @Override // ru.CryptoPro.JCSP.Random.BaseRandom, ru.CryptoPro.JCP.Random.RandomInterface
    public void makeRandom(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.c == 12) {
                a();
            }
            byte[] bArr2 = this.b;
            int i4 = this.c;
            this.c = i4 + 1;
            bArr[i + i3] = bArr2[i4];
        }
    }

    @Override // ru.CryptoPro.JCSP.Random.BaseRandom, ru.CryptoPro.JCP.Random.RandomInterface
    public void setRandomSeed(RandomInterface randomInterface) {
        if (randomInterface == null || !randomInterface.isReady()) {
            return;
        }
        a((byte) randomInterface.nextInt());
    }

    public String toString() {
        return TestRandom.class.getName();
    }

    @Override // ru.CryptoPro.JCSP.Random.BaseRandom, ru.CryptoPro.JCP.Random.RandomInterface
    public void setRandomSeed(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        a(bArr[0]);
    }

    private void a(byte b) {
        this.c = 0;
        for (int i = 0; i < 12; i++) {
            this.b[i] = (byte) (b + i);
        }
    }
}
