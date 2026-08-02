package ru.CryptoPro.JCSP.Key;

/* loaded from: classes4.dex */
public class GostAgreeKey extends GostSecretKey {
    private byte[] a;

    public GostAgreeKey(JCSPSecretKeyInterface jCSPSecretKeyInterface, byte[] bArr) {
        super(jCSPSecretKeyInterface);
        this.a = bArr;
    }

    public void a(byte[] bArr) {
        this.a = bArr;
    }

    public byte[] a() {
        return this.a;
    }

    public GostAgreeKey(JCSPSecretKeyInterface jCSPSecretKeyInterface) {
        super(jCSPSecretKeyInterface);
    }
}
