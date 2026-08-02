package ru.CryptoPro.JCP.Random;

import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes4.dex */
public final class ConstRandom extends cl_0 {
    private byte a = PKIBody._CANN;

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final boolean isReady() {
        return true;
    }

    @Override // ru.CryptoPro.JCP.Random.cl_0, ru.CryptoPro.JCP.Random.RandomInterface
    public final void makeRandom(int[] iArr, int i, int i2) {
        byte b = this.a;
        Arrays.fill(iArr, i, i2 + i, b | (b << 24) | (b << PKIBody._CKUANN) | (b << 8));
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final void setRandomSeed(RandomInterface randomInterface) {
        if (randomInterface == null || !randomInterface.isReady()) {
            return;
        }
        this.a = (byte) randomInterface.nextInt();
    }

    public final String toString() {
        return ConstRandom.class.getName();
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final void makeRandom(byte[] bArr, int i, int i2) {
        Arrays.fill(bArr, i, i2 + i, this.a);
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public final void setRandomSeed(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        this.a = bArr[0];
    }
}
