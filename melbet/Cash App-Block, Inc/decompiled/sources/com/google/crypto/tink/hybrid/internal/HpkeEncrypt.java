package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.hybrid.HpkeParameters;
import com.google.crypto.tink.hybrid.HpkePublicKey;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.google.crypto.tink.subtle.EllipticCurves$PointFormatType;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Hex;
import com.google.crypto.tink.util.Bytes;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.nimbusds.jose.crypto.impl.AuthenticatedCipherText;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.Mac;
import kotlin.reflect.full.KCallables;

/* loaded from: classes4.dex */
public final class HpkeEncrypt implements HybridEncrypt {
    public static final byte[] EMPTY_ASSOCIATED_DATA = new byte[0];
    public final HpkeAead aead;
    public final HkdfHpkeKdf kdf;
    public final Result kem;
    public final byte[] outputPrefix;
    public final byte[] recipientPublicKey;

    public HpkeEncrypt(Bytes bytes, Result result, HkdfHpkeKdf hkdfHpkeKdf, HpkeAead hpkeAead, Bytes bytes2) {
        this.recipientPublicKey = bytes.toByteArray();
        this.kem = result;
        this.kdf = hkdfHpkeKdf;
        this.aead = hpkeAead;
        this.outputPrefix = bytes2.toByteArray();
    }

    public static HpkeEncrypt create(HpkePublicKey hpkePublicKey) {
        HpkeParameters hpkeParameters = hpkePublicKey.parameters;
        return new HpkeEncrypt(hpkePublicKey.publicKeyBytes, KCallables.createKem(hpkeParameters.kem), KCallables.createKdf(hpkeParameters.kdf), KCallables.createAead(hpkeParameters.aead), hpkePublicKey.outputPrefix);
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public final byte[] encrypt(byte[] bArr) {
        AuthenticatedCipherText authenticatedCipherText;
        byte[] bArr2 = new byte[0];
        Result result = this.kem;
        int i = result.$r8$classId;
        byte[] bArr3 = this.recipientPublicKey;
        switch (i) {
            case 10:
                EllipticCurves$CurveType ellipticCurves$CurveType = (EllipticCurves$CurveType) result.text;
                KeyPair generateKeyPair = Hex.generateKeyPair(Hex.getCurveSpec(ellipticCurves$CurveType));
                ECParameterSpec curveSpec = Hex.getCurveSpec(ellipticCurves$CurveType);
                EllipticCurve curve = curveSpec.getCurve();
                EllipticCurves$PointFormatType ellipticCurves$PointFormatType = EllipticCurves$PointFormatType.UNCOMPRESSED;
                byte[] computeSharedSecret = Hex.computeSharedSecret((ECPrivateKey) generateKeyPair.getPrivate(), (ECPublicKey) ((KeyFactory) EngineFactory.KEY_FACTORY.policy.getInstance("EC")).generatePublic(new ECPublicKeySpec(Hex.pointDecode(curve, ellipticCurves$PointFormatType, bArr3), curveSpec)));
                byte[] pointEncode = Hex.pointEncode(Hex.getCurveSpec(ellipticCurves$CurveType).getCurve(), ellipticCurves$PointFormatType, ((ECPublicKey) generateKeyPair.getPublic()).getW());
                byte[] concat = com.google.crypto.tink.subtle.Bytes.concat(pointEncode, bArr3);
                byte[] concat2 = com.google.crypto.tink.subtle.Bytes.concat(HpkeUtil.KEM, result.getKemId());
                HkdfHpkeKdf hkdfHpkeKdf = (HkdfHpkeKdf) result.resultMetadata;
                int macLength = Mac.getInstance((String) hkdfHpkeKdf.macAlgorithm).getMacLength();
                byte[] bArr4 = HpkeUtil.HPKE_V1;
                Charset charset = Util.UTF_8;
                authenticatedCipherText = new AuthenticatedCipherText(hkdfHpkeKdf.expand(hkdfHpkeKdf.extract(com.google.crypto.tink.subtle.Bytes.concat(bArr4, concat2, "eae_prk".getBytes(charset), computeSharedSecret), null), com.google.crypto.tink.subtle.Bytes.concat(HpkeUtil.intToByteArray(2, macLength), bArr4, concat2, "shared_secret".getBytes(charset), concat), macLength), pointEncode, 1);
                break;
            default:
                X25519 x25519 = (X25519) result.resultMetadata;
                BinaryBitmap generateKeyPair2 = x25519.generateKeyPair();
                byte[] bArr5 = (byte[]) generateKeyPair2.binarizer;
                byte[] bArr6 = (byte[]) generateKeyPair2.matrix;
                byte[] computeSharedSecret2 = x25519.computeSharedSecret(bArr5, bArr3);
                byte[] concat3 = com.google.crypto.tink.subtle.Bytes.concat(bArr6, bArr3);
                byte[] concat4 = com.google.crypto.tink.subtle.Bytes.concat(HpkeUtil.KEM, HpkeUtil.X25519_HKDF_SHA256_KEM_ID);
                HkdfHpkeKdf hkdfHpkeKdf2 = (HkdfHpkeKdf) result.text;
                int macLength2 = Mac.getInstance((String) hkdfHpkeKdf2.macAlgorithm).getMacLength();
                byte[] bArr7 = HpkeUtil.HPKE_V1;
                Charset charset2 = Util.UTF_8;
                authenticatedCipherText = new AuthenticatedCipherText(hkdfHpkeKdf2.expand(hkdfHpkeKdf2.extract(com.google.crypto.tink.subtle.Bytes.concat(bArr7, concat4, "eae_prk".getBytes(charset2), computeSharedSecret2), null), com.google.crypto.tink.subtle.Bytes.concat(HpkeUtil.intToByteArray(2, macLength2), bArr7, concat4, "shared_secret".getBytes(charset2), concat3), macLength2), bArr6, 1);
                break;
        }
        HpkeContext createContext = HpkeContext.createContext(HpkeUtil.BASE_MODE, authenticatedCipherText.authenticationTag, authenticatedCipherText.cipherText, result, this.kdf, this.aead, bArr2);
        byte[] bArr8 = createContext.encapsulatedKey;
        byte[] bArr9 = this.outputPrefix;
        int length = bArr9.length + bArr8.length;
        byte[] seal = createContext.aead.seal(createContext.key, createContext.computeNonceAndIncrementSequenceNumber(), length, bArr, EMPTY_ASSOCIATED_DATA);
        System.arraycopy(bArr9, 0, seal, 0, bArr9.length);
        System.arraycopy(bArr8, 0, seal, bArr9.length, bArr8.length);
        return seal;
    }
}
