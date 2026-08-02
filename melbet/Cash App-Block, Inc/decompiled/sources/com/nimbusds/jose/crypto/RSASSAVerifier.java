package com.nimbusds.jose.crypto;

import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.crypto.impl.RSASSAProvider;
import com.nimbusds.jose.jca.JCAContext;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Collections;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public final class RSASSAVerifier extends RSASSAProvider implements JWSVerifier {
    public final zzb critPolicy;
    public final RSAPublicKey publicKey;

    public RSASSAVerifier(RSAPublicKey rSAPublicKey) {
        super(RSASSAProvider.SUPPORTED_ALGORITHMS);
        zzb zzbVar = new zzb(12);
        this.critPolicy = zzbVar;
        this.publicKey = rSAPublicKey;
        zzbVar.zza = Collections.EMPTY_SET;
    }

    @Override // com.nimbusds.jose.JWSVerifier
    public final boolean verify(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) {
        Signature signerAndVerifier;
        Signature signerAndVerifier2;
        if (!this.critPolicy.headerPasses(jWSHeader)) {
            return false;
        }
        JWSAlgorithm jWSAlgorithm = (JWSAlgorithm) jWSHeader.alg;
        Provider provider = (Provider) ((JCAContext) this.zzd).provider;
        if ((!jWSAlgorithm.equals(JWSAlgorithm.RS256) || (signerAndVerifier = ECDH.getSignerAndVerifier("SHA256withRSA", provider, null)) == null) && ((!jWSAlgorithm.equals(JWSAlgorithm.RS384) || (signerAndVerifier = ECDH.getSignerAndVerifier("SHA384withRSA", provider, null)) == null) && (!jWSAlgorithm.equals(JWSAlgorithm.RS512) || (signerAndVerifier = ECDH.getSignerAndVerifier("SHA512withRSA", provider, null)) == null))) {
            JWSAlgorithm jWSAlgorithm2 = JWSAlgorithm.PS256;
            if ((!jWSAlgorithm.equals(jWSAlgorithm2) || (signerAndVerifier2 = ECDH.getSignerAndVerifier("RSASSA-PSS", provider, new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1))) == null) && (!jWSAlgorithm.equals(jWSAlgorithm2) || (signerAndVerifier2 = ECDH.getSignerAndVerifier("SHA256withRSA/PSS", provider, null)) == null)) {
                if (!jWSAlgorithm.equals(jWSAlgorithm2) || (signerAndVerifier = ECDH.getSignerAndVerifier("SHA256withRSAandMGF1", provider, null)) == null) {
                    JWSAlgorithm jWSAlgorithm3 = JWSAlgorithm.PS384;
                    if ((!jWSAlgorithm.equals(jWSAlgorithm3) || (signerAndVerifier2 = ECDH.getSignerAndVerifier("RSASSA-PSS", provider, new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384, "MGF1", MGF1ParameterSpec.SHA384, 48, 1))) == null) && (!jWSAlgorithm.equals(jWSAlgorithm3) || (signerAndVerifier2 = ECDH.getSignerAndVerifier("SHA384withRSA/PSS", provider, null)) == null)) {
                        if (!jWSAlgorithm.equals(jWSAlgorithm3) || (signerAndVerifier = ECDH.getSignerAndVerifier("SHA384withRSAandMGF1", provider, null)) == null) {
                            JWSAlgorithm jWSAlgorithm4 = JWSAlgorithm.PS512;
                            if ((!jWSAlgorithm.equals(jWSAlgorithm4) || (signerAndVerifier2 = ECDH.getSignerAndVerifier("RSASSA-PSS", provider, new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1))) == null) && (!jWSAlgorithm.equals(jWSAlgorithm4) || (signerAndVerifier2 = ECDH.getSignerAndVerifier("SHA512withRSA/PSS", provider, null)) == null)) {
                                if (!jWSAlgorithm.equals(jWSAlgorithm4) || (signerAndVerifier = ECDH.getSignerAndVerifier("SHA512withRSAandMGF1", provider, null)) == null) {
                                    throw new JOSEException(ECDH.unsupportedJWSAlgorithm(jWSAlgorithm, RSASSAProvider.SUPPORTED_ALGORITHMS));
                                }
                            }
                        }
                    }
                }
            }
            signerAndVerifier = signerAndVerifier2;
        }
        try {
            signerAndVerifier.initVerify(this.publicKey);
            try {
                signerAndVerifier.update(bArr);
                return signerAndVerifier.verify(base64URL.decode());
            } catch (SignatureException unused) {
                return false;
            }
        } catch (InvalidKeyException e) {
            throw new JOSEException("Invalid public RSA key: " + e.getMessage(), e);
        }
    }
}
