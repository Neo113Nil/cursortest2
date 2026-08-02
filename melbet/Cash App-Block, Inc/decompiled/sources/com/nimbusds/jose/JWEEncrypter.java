package com.nimbusds.jose;

/* loaded from: classes5.dex */
public interface JWEEncrypter {
    JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, byte[] bArr2);
}
