package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCP.Util.GetProperty;

/* loaded from: classes4.dex */
public class PublicKeySpecWrapperFast extends PublicKeySpecWrapper {
    public static final int PUBLIC_KEY_FAST_N;
    public static final int PUBLIC_KEY_FAST_N_DEFAULT = 16;
    public static final boolean USE_PUBLIC_KEY_FAST = GetProperty.getBooleanProperty("use_public_key_fast", false);
    private static final int d;

    static {
        int integerProperty = GetProperty.getIntegerProperty("public_key_fast_n", 16);
        PUBLIC_KEY_FAST_N = integerProperty;
        d = integerProperty > 0 ? integerProperty : 16;
    }

    public PublicKeySpecWrapperFast(PublicKeyBlob publicKeyBlob, boolean z, boolean z2) {
        super(publicKeyBlob, z, z2, d);
    }

    @Override // ru.CryptoPro.JCSP.Key.PublicKeySpecWrapper, ru.CryptoPro.JCSP.Key.PublicKeySpecWrapperBase
    public int a() {
        return (int) (Thread.currentThread().getId() & (d - 1));
    }

    @Override // ru.CryptoPro.JCSP.Key.PublicKeySpecWrapper, ru.CryptoPro.JCSP.Key.PublicKeySpecWrapperBase
    public void b() {
        for (int i = 0; i < d; i++) {
            a(i);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.PublicKeySpecWrapper, ru.CryptoPro.JCSP.Key.PublicKeySpecWrapperBase
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public PublicKeySpecWrapperFast d() throws CloneNotSupportedException {
        return new PublicKeySpecWrapperFast(this);
    }

    public PublicKeySpecWrapperFast(PublicKeySpecWrapperFast publicKeySpecWrapperFast) throws CloneNotSupportedException {
        super(publicKeySpecWrapperFast);
    }
}
