package com.google.crypto.tink.hybrid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.hybrid.HpkeParameters;
import com.google.crypto.tink.hybrid.HpkePrivateKey;
import com.google.crypto.tink.hybrid.HpkePublicKey;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.google.crypto.tink.subtle.EllipticCurves$PointFormatType;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Hex;
import com.google.crypto.tink.util.Bytes;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.plaid.internal.EnumC0170g;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.Mac;
import kotlin.reflect.full.KCallables;

/* loaded from: classes4.dex */
public final class HpkeDecrypt implements HybridDecrypt {
    public static final byte[] EMPTY_ASSOCIATED_DATA = new byte[0];
    public final HpkeAead aead;
    public final int encapsulatedKeyLength;
    public final HkdfHpkeKdf kdf;
    public final Result kem;
    public final byte[] outputPrefix;
    public final BinaryBitmap recipientPrivateKey;

    public HpkeDecrypt(BinaryBitmap binaryBitmap, Result result, HkdfHpkeKdf hkdfHpkeKdf, HpkeAead hpkeAead, int i, Bytes bytes) {
        this.recipientPrivateKey = binaryBitmap;
        this.kem = result;
        this.kdf = hkdfHpkeKdf;
        this.aead = hpkeAead;
        this.encapsulatedKeyLength = i;
        this.outputPrefix = bytes.toByteArray();
    }

    public static HpkeDecrypt create(HpkePrivateKey hpkePrivateKey) {
        int i;
        HpkePublicKey hpkePublicKey = hpkePrivateKey.publicKey;
        HpkeParameters hpkeParameters = hpkePublicKey.parameters;
        HpkeParameters.KemId kemId = hpkeParameters.kem;
        Result createKem = KCallables.createKem(kemId);
        HkdfHpkeKdf createKdf = KCallables.createKdf(hpkeParameters.kdf);
        HpkeAead createAead = KCallables.createAead(hpkeParameters.aead);
        HpkeParameters.KemId kemId2 = HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256;
        boolean equals = kemId.equals(kemId2);
        HpkeParameters.KemId kemId3 = HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512;
        HpkeParameters.KemId kemId4 = HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384;
        HpkeParameters.KemId kemId5 = HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256;
        if (equals) {
            i = 32;
        } else if (kemId == kemId5) {
            i = 65;
        } else if (kemId == kemId4) {
            i = 97;
        } else {
            if (kemId != kemId3) {
                a$$ExternalSyntheticBUOutline0.m$6("Unrecognized HPKE KEM identifier");
                return null;
            }
            i = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
        }
        HpkeParameters.KemId kemId6 = hpkePublicKey.parameters.kem;
        if (!kemId6.equals(kemId2) && kemId6 != kemId5 && kemId6 != kemId4 && kemId6 != kemId3) {
            a$$ExternalSyntheticBUOutline0.m$6("Unrecognized HPKE KEM identifier");
            return null;
        }
        return new HpkeDecrypt(new BinaryBitmap(5, Bytes.copyFrom(((Bytes) hpkePrivateKey.privateKeyBytes.adapter).toByteArray()), hpkePublicKey.publicKeyBytes), createKem, createKdf, createAead, i, hpkePrivateKey.mo2034getPublicKey().getOutputPrefix());
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        byte[] expand;
        byte[] bArr3 = this.outputPrefix;
        int length = this.encapsulatedKeyLength + bArr3.length;
        if (bArr.length < length) {
            a$$ExternalSyntheticBUOutline0.m$6("Ciphertext is too short.");
            return null;
        }
        if (!Util.isPrefix(bArr3, bArr)) {
            a$$ExternalSyntheticBUOutline0.m$6("Invalid ciphertext (output prefix mismatch)");
            return null;
        }
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr3.length, length);
        Result result = this.kem;
        int i = result.$r8$classId;
        BinaryBitmap binaryBitmap = this.recipientPrivateKey;
        switch (i) {
            case 10:
                EllipticCurves$CurveType ellipticCurves$CurveType = (EllipticCurves$CurveType) result.text;
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(ConscryptUtil.fromUnsignedBigEndianBytes(((Bytes) binaryBitmap.binarizer).toByteArray()), Hex.getCurveSpec(ellipticCurves$CurveType));
                EngineFactory engineFactory = EngineFactory.KEY_FACTORY;
                ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) engineFactory.policy.getInstance("EC")).generatePrivate(eCPrivateKeySpec);
                ECParameterSpec curveSpec = Hex.getCurveSpec(ellipticCurves$CurveType);
                byte[] computeSharedSecret = Hex.computeSharedSecret(eCPrivateKey, (ECPublicKey) ((KeyFactory) engineFactory.policy.getInstance("EC")).generatePublic(new ECPublicKeySpec(Hex.pointDecode(curveSpec.getCurve(), EllipticCurves$PointFormatType.UNCOMPRESSED, copyOfRange), curveSpec)));
                byte[] concat = com.google.crypto.tink.subtle.Bytes.concat(copyOfRange, ((Bytes) binaryBitmap.matrix).toByteArray());
                byte[] concat2 = com.google.crypto.tink.subtle.Bytes.concat(HpkeUtil.KEM, result.getKemId());
                HkdfHpkeKdf hkdfHpkeKdf = (HkdfHpkeKdf) result.resultMetadata;
                int macLength = Mac.getInstance((String) hkdfHpkeKdf.macAlgorithm).getMacLength();
                byte[] bArr5 = HpkeUtil.HPKE_V1;
                Charset charset = Util.UTF_8;
                expand = hkdfHpkeKdf.expand(hkdfHpkeKdf.extract(com.google.crypto.tink.subtle.Bytes.concat(bArr5, concat2, "eae_prk".getBytes(charset), computeSharedSecret), null), com.google.crypto.tink.subtle.Bytes.concat(HpkeUtil.intToByteArray(2, macLength), bArr5, concat2, "shared_secret".getBytes(charset), concat), macLength);
                break;
            default:
                byte[] computeSharedSecret2 = ((X25519) result.resultMetadata).computeSharedSecret(((Bytes) binaryBitmap.binarizer).toByteArray(), copyOfRange);
                byte[] concat3 = com.google.crypto.tink.subtle.Bytes.concat(copyOfRange, ((Bytes) binaryBitmap.matrix).toByteArray());
                byte[] concat4 = com.google.crypto.tink.subtle.Bytes.concat(HpkeUtil.KEM, HpkeUtil.X25519_HKDF_SHA256_KEM_ID);
                HkdfHpkeKdf hkdfHpkeKdf2 = (HkdfHpkeKdf) result.text;
                int macLength2 = Mac.getInstance((String) hkdfHpkeKdf2.macAlgorithm).getMacLength();
                byte[] bArr6 = HpkeUtil.HPKE_V1;
                Charset charset2 = Util.UTF_8;
                expand = hkdfHpkeKdf2.expand(hkdfHpkeKdf2.extract(com.google.crypto.tink.subtle.Bytes.concat(bArr6, concat4, "eae_prk".getBytes(charset2), computeSharedSecret2), null), com.google.crypto.tink.subtle.Bytes.concat(HpkeUtil.intToByteArray(2, macLength2), bArr6, concat4, "shared_secret".getBytes(charset2), concat3), macLength2);
                break;
        }
        HpkeContext createContext = HpkeContext.createContext(HpkeUtil.BASE_MODE, copyOfRange, expand, result, this.kdf, this.aead, bArr4);
        return createContext.aead.open(createContext.key, createContext.computeNonceAndIncrementSequenceNumber(), length, bArr, EMPTY_ASSOCIATED_DATA);
    }
}
