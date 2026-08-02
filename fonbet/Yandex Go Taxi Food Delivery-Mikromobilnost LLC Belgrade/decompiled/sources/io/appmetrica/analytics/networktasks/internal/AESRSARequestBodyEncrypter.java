package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;

/* loaded from: classes9.dex */
public class AESRSARequestBodyEncrypter implements RequestBodyEncrypter {
    private final AESRSAEncrypter a;

    public AESRSARequestBodyEncrypter() {
        this(new AESRSAEncrypter());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    public byte[] encrypt(byte[] bArr) {
        return this.a.encrypt(bArr);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    public RequestBodyEncryptionMode getEncryptionMode() {
        return RequestBodyEncryptionMode.AES_RSA;
    }

    public AESRSARequestBodyEncrypter(AESRSAEncrypter aESRSAEncrypter) {
        this.a = aESRSAEncrypter;
    }
}
