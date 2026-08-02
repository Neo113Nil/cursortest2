package com.nimbusds.jose;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.crypto.impl.BaseJWEProvider;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import java.nio.charset.StandardCharsets;
import java.util.Set;

/* loaded from: classes5.dex */
public final class JWEObject extends JOSEObject {
    public Base64URL authTag;
    public Base64URL cipherText;
    public Base64URL encryptedKey;
    public JWEHeader header;
    public Base64URL iv;
    public int state;

    public JWEObject(JWEHeader jWEHeader, Payload payload) {
        this.header = jWEHeader;
        this.payload = payload;
        this.encryptedKey = null;
        this.cipherText = null;
        this.state = 1;
    }

    public final synchronized void encrypt(JWEEncrypter jWEEncrypter) {
        try {
            if (this.state != 1) {
                throw new IllegalStateException("The JWE object must be in an unencrypted state");
            }
            ensureJWEEncrypterSupport(jWEEncrypter);
            try {
                try {
                    JWEHeader jWEHeader = this.header;
                    Payload payload = this.payload;
                    byte[] bArr = payload.bytes;
                    if (bArr == null) {
                        Base64URL base64URL = payload.base64URL;
                        if (base64URL != null) {
                            bArr = base64URL.decode();
                        } else {
                            String payload2 = payload.toString();
                            bArr = payload2 != null ? payload2.getBytes(StandardCharset.UTF_8) : null;
                        }
                    }
                    JWECryptoParts encrypt = jWEEncrypter.encrypt(jWEHeader, bArr, this.header.toBase64URL().value.getBytes(StandardCharsets.US_ASCII));
                    JWEHeader jWEHeader2 = (JWEHeader) encrypt.header;
                    if (jWEHeader2 != null) {
                        this.header = jWEHeader2;
                    }
                    this.encryptedKey = (Base64URL) encrypt.encryptedKey;
                    this.iv = (Base64URL) encrypt.iv;
                    this.cipherText = (Base64URL) encrypt.cipherText;
                    this.authTag = (Base64URL) encrypt.authenticationTag;
                    this.state = 2;
                } catch (JOSEException e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw new JOSEException(e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ensureJWEEncrypterSupport(JWEEncrypter jWEEncrypter) {
        BaseJWEProvider baseJWEProvider = (BaseJWEProvider) jWEEncrypter;
        Set set = baseJWEProvider.algs;
        if (!set.contains((JWEAlgorithm) this.header.alg)) {
            throw new JOSEException("The " + ((JWEAlgorithm) this.header.alg) + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + set);
        }
        Set set2 = baseJWEProvider.encs;
        if (set2.contains(this.header.enc)) {
            return;
        }
        throw new JOSEException("The " + this.header.enc + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + set2);
    }

    public final String serialize() {
        int i = this.state;
        if (i != 2 && i != 3) {
            a$$ExternalSyntheticBUOutline0.m$1("The JWE object must be in an encrypted or decrypted state");
            return null;
        }
        StringBuilder sb = new StringBuilder(this.header.toBase64URL().value);
        sb.append('.');
        Base64URL base64URL = this.encryptedKey;
        if (base64URL != null) {
            sb.append(base64URL);
        }
        sb.append('.');
        Base64URL base64URL2 = this.iv;
        if (base64URL2 != null) {
            sb.append(base64URL2);
        }
        sb.append('.');
        sb.append(this.cipherText);
        sb.append('.');
        Base64URL base64URL3 = this.authTag;
        if (base64URL3 != null) {
            sb.append(base64URL3);
        }
        return sb.toString();
    }
}
