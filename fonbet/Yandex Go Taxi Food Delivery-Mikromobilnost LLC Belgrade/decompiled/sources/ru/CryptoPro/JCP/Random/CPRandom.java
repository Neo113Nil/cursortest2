package ru.CryptoPro.JCP.Random;

/* loaded from: classes4.dex */
public final class CPRandom extends CertifiedRandom {
    public static final CPRandom I = new CPRandom(null);

    public CPRandom() {
        super(I);
    }

    public static void check() throws RandomRefuseException {
        CPRandom cPRandom = I;
        if (cPRandom == null || !cPRandom.isReady()) {
            throw new RandomRefuseException();
        }
    }

    @Override // ru.CryptoPro.JCP.Random.CertifiedRandom
    public final synchronized RandomInterface a() {
        return I;
    }

    public String toString() {
        return CPRandom.class.getName();
    }
}
