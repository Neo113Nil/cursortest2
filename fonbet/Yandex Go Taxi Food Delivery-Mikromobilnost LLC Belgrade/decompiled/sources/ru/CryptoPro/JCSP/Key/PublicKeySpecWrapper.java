package ru.CryptoPro.JCSP.Key;

/* loaded from: classes4.dex */
public class PublicKeySpecWrapper extends PublicKeySpecWrapperBase {
    public PublicKeySpecWrapper(PublicKeyBlob publicKeyBlob, boolean z, boolean z2, int i) {
        super(publicKeyBlob, z, z2, i);
        if (!PublicKeySpecWrapperBase.USE_PUBLIC_KEY_PROTECTED) {
            k();
            return;
        }
        try {
            k();
        } catch (Exception unused) {
            k();
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.PublicKeySpecWrapperBase
    public int a() {
        return 0;
    }

    @Override // ru.CryptoPro.JCSP.Key.PublicKeySpecWrapperBase
    public void b() {
        a(a());
    }

    @Override // ru.CryptoPro.JCSP.Key.PublicKeySpecWrapperBase
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public PublicKeySpecWrapper d() throws CloneNotSupportedException {
        return new PublicKeySpecWrapper(this);
    }

    public PublicKeySpecWrapper(PublicKeyBlob publicKeyBlob, boolean z, boolean z2) {
        this(publicKeyBlob, z, z2, 1);
    }

    public PublicKeySpecWrapper(PublicKeySpecWrapper publicKeySpecWrapper) throws CloneNotSupportedException {
        super(publicKeySpecWrapper);
    }
}
