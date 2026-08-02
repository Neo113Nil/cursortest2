package com.nimbusds.jose.crypto;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.crypto.impl.RSACryptoProvider;
import com.nimbusds.jose.crypto.opts.CipherMode;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class RSAEncrypter extends RSACryptoProvider implements JWEEncrypter {
    public final Set opts;
    public final RSAPublicKey publicKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RSAEncrypter(RSAPublicKey rSAPublicKey) {
        super(RSACryptoProvider.SUPPORTED_ALGORITHMS, ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS, null);
        Set set = Collections.EMPTY_SET;
        Objects.requireNonNull(rSAPublicKey);
        this.publicKey = rSAPublicKey;
        this.opts = set;
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public final JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) {
        Base64URL encode;
        JWEAlgorithm jWEAlgorithm = (JWEAlgorithm) jWEHeader.alg;
        if (jWEAlgorithm == null) {
            throw new JOSEException("The algorithm \"alg\" header parameter must not be null");
        }
        SecretKey cek = getCEK(jWEHeader.enc);
        boolean equals = jWEAlgorithm.equals(JWEAlgorithm.RSA1_5);
        JWEJCAContext jWEJCAContext = this.jcaContext;
        RSAPublicKey rSAPublicKey = this.publicKey;
        if (equals) {
            Provider provider = (Provider) jWEJCAContext.provider;
            try {
                Cipher cipher = provider == null ? Cipher.getInstance("RSA/ECB/PKCS1Padding") : Cipher.getInstance("RSA/ECB/PKCS1Padding", provider);
                cipher.init(1, rSAPublicKey);
                encode = Base64URL.encode(cipher.doFinal(cek.getEncoded()));
            } catch (IllegalBlockSizeException e) {
                throw new JOSEException("RSA block size exception: The RSA key is too short, use a longer one", e);
            } catch (Exception e2) {
                throw new JOSEException(Fragment$5$$ExternalSyntheticOutline0.m(e2, new StringBuilder("Couldn't encrypt Content Encryption Key (CEK): ")), e2);
            }
        } else if (jWEAlgorithm.equals(JWEAlgorithm.RSA_OAEP)) {
            CipherMode resolveCipherModeForOAEP = resolveCipherModeForOAEP();
            Provider provider2 = (Provider) jWEJCAContext.provider;
            try {
                Cipher cipher2 = provider2 == null ? Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding") : Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", provider2);
                cipher2.init(resolveCipherModeForOAEP.modeForEncryption, rSAPublicKey, new SecureRandom());
                encode = Base64URL.encode(resolveCipherModeForOAEP == CipherMode.WRAP_UNWRAP ? cipher2.wrap(cek) : cipher2.doFinal(cek.getEncoded()));
            } catch (InvalidKeyException e3) {
                throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e3);
            } catch (Exception e4) {
                throw new JOSEException(e4.getMessage(), e4);
            }
        } else if (jWEAlgorithm.equals(JWEAlgorithm.RSA_OAEP_256)) {
            encode = Base64URL.encode(ECDH.encryptCEK(rSAPublicKey, cek, 256, resolveCipherModeForOAEP(), (Provider) jWEJCAContext.provider));
        } else if (jWEAlgorithm.equals(JWEAlgorithm.RSA_OAEP_384)) {
            encode = Base64URL.encode(ECDH.encryptCEK(rSAPublicKey, cek, MLKEMEngine.KyberPolyBytes, resolveCipherModeForOAEP(), (Provider) jWEJCAContext.provider));
        } else {
            if (!jWEAlgorithm.equals(JWEAlgorithm.RSA_OAEP_512)) {
                throw new JOSEException(ECDH.unsupportedJWEAlgorithm(jWEAlgorithm, RSACryptoProvider.SUPPORTED_ALGORITHMS));
            }
            encode = Base64URL.encode(ECDH.encryptCEK(rSAPublicKey, cek, 512, resolveCipherModeForOAEP(), (Provider) jWEJCAContext.provider));
        }
        return ContentCryptoProvider.encrypt(jWEHeader, bArr, bArr2, cek, encode, jWEJCAContext);
    }

    public final CipherMode resolveCipherModeForOAEP() {
        Set set = this.opts;
        CipherMode cipherMode = CipherMode.ENCRYPT_DECRYPT;
        return set.contains(cipherMode) ? cipherMode : CipherMode.WRAP_UNWRAP;
    }
}
