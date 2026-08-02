package com.nimbusds.jose.crypto;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.DirectCryptoProvider;
import com.nimbusds.jose.crypto.impl.ECDH;
import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
public class DirectEncrypter extends DirectCryptoProvider implements JWEEncrypter {
    @Override // com.nimbusds.jose.JWEEncrypter
    public final JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) {
        JWEAlgorithm jWEAlgorithm = (JWEAlgorithm) jWEHeader.alg;
        if (jWEAlgorithm == null) {
            throw new JOSEException("The algorithm \"alg\" header parameter must not be null");
        }
        if (!jWEAlgorithm.equals(JWEAlgorithm.DIR)) {
            throw new JOSEException(ECDH.unsupportedJWEAlgorithm(jWEAlgorithm, DirectCryptoProvider.SUPPORTED_ALGORITHMS));
        }
        SecretKey secretKey = null;
        try {
            secretKey = getCEK(null);
        } catch (Exception unused) {
        }
        return ContentCryptoProvider.encrypt(jWEHeader, bArr, bArr2, secretKey, null, this.jcaContext);
    }
}
