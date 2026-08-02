package com.nimbusds.jose.crypto;

import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.crypto.impl.ECDSAProvider;
import com.nimbusds.jose.jca.JCAContext;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECParameterTable;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.Set;
import okio.internal.RealBufferedSource;

/* loaded from: classes5.dex */
public final class ECDSAVerifier extends ECDSAProvider implements JWSVerifier {
    public final zzb critPolicy;
    public final ECPublicKey publicKey;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:19:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ECDSAVerifier(ECPublicKey eCPublicKey) {
        super(Collections.singleton(r0));
        Curve curve;
        JWSAlgorithm jWSAlgorithm;
        ECParameterSpec params = eCPublicKey.getParams();
        Curve curve2 = Curve.P_256;
        ECParameterSpec eCParameterSpec = ECParameterTable.P_256_SPEC;
        if (params != null) {
            int fieldSize = params.getCurve().getField().getFieldSize();
            ECParameterSpec eCParameterSpec2 = ECParameterTable.P_256_SPEC;
            if (fieldSize == eCParameterSpec2.getCurve().getField().getFieldSize() && params.getCurve().getA().equals(eCParameterSpec2.getCurve().getA()) && params.getCurve().getB().equals(eCParameterSpec2.getCurve().getB()) && params.getGenerator().getAffineX().equals(eCParameterSpec2.getGenerator().getAffineX()) && params.getGenerator().getAffineY().equals(eCParameterSpec2.getGenerator().getAffineY()) && params.getOrder().equals(eCParameterSpec2.getOrder()) && params.getCofactor() == eCParameterSpec2.getCofactor()) {
                curve = Curve.P_256;
            } else {
                int fieldSize2 = params.getCurve().getField().getFieldSize();
                ECParameterSpec eCParameterSpec3 = ECParameterTable.SECP256K1_SPEC;
                if (fieldSize2 == eCParameterSpec3.getCurve().getField().getFieldSize() && params.getCurve().getA().equals(eCParameterSpec3.getCurve().getA()) && params.getCurve().getB().equals(eCParameterSpec3.getCurve().getB()) && params.getGenerator().getAffineX().equals(eCParameterSpec3.getGenerator().getAffineX()) && params.getGenerator().getAffineY().equals(eCParameterSpec3.getGenerator().getAffineY()) && params.getOrder().equals(eCParameterSpec3.getOrder()) && params.getCofactor() == eCParameterSpec3.getCofactor()) {
                    curve = Curve.SECP256K1;
                } else {
                    int fieldSize3 = params.getCurve().getField().getFieldSize();
                    ECParameterSpec eCParameterSpec4 = ECParameterTable.P_384_SPEC;
                    if (fieldSize3 == eCParameterSpec4.getCurve().getField().getFieldSize() && params.getCurve().getA().equals(eCParameterSpec4.getCurve().getA()) && params.getCurve().getB().equals(eCParameterSpec4.getCurve().getB()) && params.getGenerator().getAffineX().equals(eCParameterSpec4.getGenerator().getAffineX()) && params.getGenerator().getAffineY().equals(eCParameterSpec4.getGenerator().getAffineY()) && params.getOrder().equals(eCParameterSpec4.getOrder()) && params.getCofactor() == eCParameterSpec4.getCofactor()) {
                        curve = Curve.P_384;
                    } else {
                        int fieldSize4 = params.getCurve().getField().getFieldSize();
                        ECParameterSpec eCParameterSpec5 = ECParameterTable.P_521_SPEC;
                        if (fieldSize4 == eCParameterSpec5.getCurve().getField().getFieldSize() && params.getCurve().getA().equals(eCParameterSpec5.getCurve().getA()) && params.getCurve().getB().equals(eCParameterSpec5.getCurve().getB()) && params.getGenerator().getAffineX().equals(eCParameterSpec5.getGenerator().getAffineX()) && params.getGenerator().getAffineY().equals(eCParameterSpec5.getGenerator().getAffineY()) && params.getOrder().equals(eCParameterSpec5.getOrder()) && params.getCofactor() == eCParameterSpec5.getCofactor()) {
                            curve = Curve.P_521;
                        }
                    }
                }
            }
            if (curve != null) {
                throw new JOSEException("The EC key curve is not supported, must be P-256, P-384 or P-521");
            }
            if (Curve.P_256.equals(curve)) {
                jWSAlgorithm = JWSAlgorithm.ES256;
            } else if (Curve.SECP256K1.equals(curve)) {
                jWSAlgorithm = JWSAlgorithm.ES256K;
            } else if (Curve.P_384.equals(curve)) {
                jWSAlgorithm = JWSAlgorithm.ES384;
            } else {
                if (!Curve.P_521.equals(curve)) {
                    JWK$$ExternalSyntheticBUOutline0.m$2(curve, "Unexpected curve: ");
                    throw null;
                }
                jWSAlgorithm = JWSAlgorithm.ES512;
            }
            if (!ECDSAProvider.SUPPORTED_ALGORITHMS.contains(jWSAlgorithm)) {
                JWK$$ExternalSyntheticBUOutline0.m$2(jWSAlgorithm, "Unsupported EC DSA algorithm: ");
                throw null;
            }
            zzb zzbVar = new zzb(12);
            this.critPolicy = zzbVar;
            this.publicKey = eCPublicKey;
            Curve curve3 = (Curve) Curve.forJWSAlgorithm((JWSAlgorithm) ((Set) this.zza).iterator().next()).iterator().next();
            curve3.getClass();
            ECParameterSpec eCParameterSpec6 = ECParameterTable.get(curve3);
            ECPoint w = eCPublicKey.getW();
            if (!RealBufferedSource.isPointOnCurve(w.getAffineX(), w.getAffineY(), eCParameterSpec6)) {
                throw new JOSEException("Curve / public key parameters mismatch");
            }
            zzbVar.zza = Collections.EMPTY_SET;
            return;
        }
        curve = null;
        if (curve != null) {
        }
    }

    @Override // com.nimbusds.jose.JWSVerifier
    public final boolean verify(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) {
        JWSAlgorithm jWSAlgorithm = (JWSAlgorithm) jWSHeader.alg;
        Set set = (Set) this.zza;
        if (!set.contains(jWSAlgorithm)) {
            throw new JOSEException(ECDH.unsupportedJWSAlgorithm(jWSAlgorithm, set));
        }
        if (this.critPolicy.headerPasses(jWSHeader)) {
            byte[] decode = base64URL.decode();
            try {
                ECDH.ensureLegalSignature(decode, jWSAlgorithm);
                byte[] transcodeSignatureToDER = ECDH.transcodeSignatureToDER(decode);
                Provider provider = (Provider) ((JCAContext) this.zzd).provider;
                String str = "SHA256withECDSA";
                if (!jWSAlgorithm.equals(JWSAlgorithm.ES256) && !jWSAlgorithm.equals(JWSAlgorithm.ES256K)) {
                    if (jWSAlgorithm.equals(JWSAlgorithm.ES384)) {
                        str = "SHA384withECDSA";
                    } else {
                        if (!jWSAlgorithm.equals(JWSAlgorithm.ES512)) {
                            throw new JOSEException(ECDH.unsupportedJWSAlgorithm(jWSAlgorithm, ECDSAProvider.SUPPORTED_ALGORITHMS));
                        }
                        str = "SHA512withECDSA";
                    }
                }
                try {
                    Signature signature = provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
                    try {
                        signature.initVerify(this.publicKey);
                        signature.update(bArr);
                        return signature.verify(transcodeSignatureToDER);
                    } catch (InvalidKeyException e) {
                        throw new JOSEException("Invalid EC public key: " + e.getMessage(), e);
                    } catch (SignatureException unused) {
                    }
                } catch (NoSuchAlgorithmException e2) {
                    throw new JOSEException("Unsupported ECDSA algorithm: " + e2.getMessage(), e2);
                }
            } catch (JOSEException unused2) {
                return false;
            }
        }
        return false;
    }
}
