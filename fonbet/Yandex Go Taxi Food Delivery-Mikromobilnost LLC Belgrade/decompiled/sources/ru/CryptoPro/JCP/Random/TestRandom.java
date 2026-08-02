package ru.CryptoPro.JCP.Random;

/* loaded from: classes4.dex */
public final class TestRandom extends cl_0 {
    private final byte[] b = new byte[12];
    private int c = 0;

    public TestRandom() {
        a((byte) 0);
    }

    public final void a(byte b) {
        this.c = 0;
        for (int i = 0; i < 12; i++) {
            this.b[i] = (byte) (b + i);
        }
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final boolean isReady() {
        return true;
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final void makeRandom(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.c;
            if (i4 == 12) {
                int i5 = this.b[i4 - 1] + 1;
                this.c = 0;
                for (int i6 = 0; i6 < 12; i6++) {
                    this.b[i6] = (byte) (i5 + i6);
                }
            }
            byte[] bArr2 = this.b;
            int i7 = this.c;
            this.c = i7 + 1;
            bArr[i + i3] = bArr2[i7];
        }
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final void setRandomSeed(RandomInterface randomInterface) {
        if (randomInterface == null || !randomInterface.isReady()) {
            return;
        }
        a((byte) randomInterface.nextInt());
    }

    public final String toString() {
        return TestRandom.class.getName();
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final void setRandomSeed(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        a(bArr[0]);
    }
}
