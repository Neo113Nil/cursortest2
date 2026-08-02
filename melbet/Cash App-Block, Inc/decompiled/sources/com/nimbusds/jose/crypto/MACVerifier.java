package com.nimbusds.jose.crypto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.crypto.impl.MACProvider;
import com.nimbusds.jose.jca.JCAContext;
import com.nimbusds.jose.util.Base64URL;
import java.security.Provider;
import java.util.Collections;
import java.util.Set;
import javax.crypto.SecretKey;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class MACVerifier extends MACProvider implements JWSVerifier {
    public final zzb critPolicy;

    public MACVerifier(SecretKey secretKey) {
        super(secretKey);
        zzb zzbVar = new zzb(12);
        this.critPolicy = zzbVar;
        zzbVar.zza = Collections.EMPTY_SET;
    }

    @Override // com.nimbusds.jose.JWSVerifier
    public final boolean verify(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) {
        String str;
        int i;
        JWSAlgorithm jWSAlgorithm = (JWSAlgorithm) jWSHeader.alg;
        SecretKey secretKey = this.secretKey;
        if (secretKey == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected state");
            return false;
        }
        byte[] encoded = secretKey.getEncoded();
        Set set = MACProvider.SUPPORTED_ALGORITHMS;
        if (encoded != null) {
            if (JWSAlgorithm.HS256.equals(jWSAlgorithm)) {
                i = 256;
            } else if (JWSAlgorithm.HS384.equals(jWSAlgorithm)) {
                i = MLKEMEngine.KyberPolyBytes;
            } else {
                if (!JWSAlgorithm.HS512.equals(jWSAlgorithm)) {
                    throw new JOSEException(ECDH.unsupportedJWSAlgorithm(jWSAlgorithm, set));
                }
                i = 512;
            }
            if (secretKey == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Unexpected state");
                return false;
            }
            byte[] encoded2 = secretKey.getEncoded();
            if ((encoded2 == null ? 0 : encoded2.length * 8) < i) {
                throw new KeyLengthException("The secret length for " + jWSAlgorithm + " must be at least " + i + " bits");
            }
        }
        if (!this.critPolicy.headerPasses(jWSHeader)) {
            return false;
        }
        JWSAlgorithm jWSAlgorithm2 = (JWSAlgorithm) jWSHeader.alg;
        if (jWSAlgorithm2.equals(JWSAlgorithm.HS256)) {
            str = "HMACSHA256";
        } else if (jWSAlgorithm2.equals(JWSAlgorithm.HS384)) {
            str = "HMACSHA384";
        } else {
            if (!jWSAlgorithm2.equals(JWSAlgorithm.HS512)) {
                throw new JOSEException(ECDH.unsupportedJWSAlgorithm(jWSAlgorithm2, set));
            }
            str = "HMACSHA512";
        }
        if (secretKey != null) {
            return WebSocketProtocol.areEqual(ECDH.compute(str, secretKey, bArr, (Provider) ((JCAContext) this.zzd).provider), base64URL.decode());
        }
        a$$ExternalSyntheticBUOutline0.m$1("Unexpected state");
        return false;
    }
}
