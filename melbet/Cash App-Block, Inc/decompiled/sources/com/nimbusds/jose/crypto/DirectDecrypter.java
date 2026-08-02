package com.nimbusds.jose.crypto;

import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.DirectCryptoProvider;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.util.Base64URL;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class DirectDecrypter extends DirectCryptoProvider {
    public final zzb critPolicy;

    public DirectDecrypter(byte[] bArr) {
        super(new SecretKeySpec(bArr, "AES"));
        this.critPolicy = new zzb(12);
    }

    public final byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, byte[] bArr) {
        JWEAlgorithm jWEAlgorithm = (JWEAlgorithm) jWEHeader.alg;
        if (jWEAlgorithm == null) {
            throw new JOSEException("The algorithm \"alg\" header parameter must not be null");
        }
        if (!jWEAlgorithm.equals(JWEAlgorithm.DIR)) {
            throw new JOSEException(ECDH.unsupportedJWEAlgorithm(jWEAlgorithm, DirectCryptoProvider.SUPPORTED_ALGORITHMS));
        }
        if (base64URL != null) {
            throw new JOSEException("Unexpected present JWE encrypted key");
        }
        if (base64URL2 == null) {
            throw new JOSEException("Unexpected present JWE initialization vector (IV)");
        }
        if (base64URL4 == null) {
            throw new JOSEException("Missing JWE authentication tag");
        }
        if (!this.critPolicy.headerPasses(jWEHeader)) {
            throw new JOSEException("Unsupported critical header parameter(s)");
        }
        SecretKey secretKey = null;
        try {
            secretKey = getCEK(null);
        } catch (Exception unused) {
        }
        return ContentCryptoProvider.decrypt(jWEHeader, bArr, base64URL2, base64URL3, base64URL4, secretKey, this.jcaContext);
    }
}
