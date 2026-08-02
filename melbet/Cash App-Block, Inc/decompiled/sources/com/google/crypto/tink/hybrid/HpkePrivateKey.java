package com.google.crypto.tink.hybrid;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.hybrid.HpkeParameters;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.subtle.EllipticCurves$PointFormatType;
import com.google.crypto.tink.subtle.Hex;
import com.google.crypto.tink.subtle.X25519;
import com.google.crypto.tink.util.Bytes;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.db.WireAdapter;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class HpkePrivateKey extends HybridPrivateKey {
    public final WireAdapter privateKeyBytes;
    public final HpkePublicKey publicKey;

    public HpkePrivateKey(HpkePublicKey hpkePublicKey, WireAdapter wireAdapter) {
        this.publicKey = hpkePublicKey;
        this.privateKeyBytes = wireAdapter;
    }

    public static HpkePrivateKey create(HpkePublicKey hpkePublicKey, WireAdapter wireAdapter) {
        ECParameterSpec eCParameterSpec;
        HpkeParameters hpkeParameters = hpkePublicKey.parameters;
        Bytes bytes = (Bytes) wireAdapter.adapter;
        HpkeParameters.KemId kemId = hpkeParameters.kem;
        int length = bytes.data.length;
        String str = "Encoded private key byte length for " + kemId + " must be %d, not " + length;
        HpkeParameters.KemId kemId2 = HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256;
        HpkeParameters.KemId kemId3 = HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512;
        HpkeParameters.KemId kemId4 = HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384;
        HpkeParameters.KemId kemId5 = HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256;
        if (kemId == kemId5) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (kemId == kemId4) {
            if (length != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (kemId == kemId3) {
            if (length != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (kemId != kemId2) {
                MacWrapper$$ExternalSyntheticLambda0.m(kemId, "Unable to validate private key length for ");
                return null;
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        byte[] byteArray = hpkePublicKey.publicKeyBytes.toByteArray();
        byte[] byteArray2 = bytes.toByteArray();
        if (kemId == kemId5 || kemId == kemId4 || kemId == kemId3) {
            if (kemId == kemId5) {
                eCParameterSpec = EllipticCurvesUtil.NIST_P256_PARAMS;
            } else if (kemId == kemId4) {
                eCParameterSpec = EllipticCurvesUtil.NIST_P384_PARAMS;
            } else {
                if (kemId != kemId3) {
                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) kemId, "Unable to determine NIST curve params for ");
                    return null;
                }
                eCParameterSpec = EllipticCurvesUtil.NIST_P521_PARAMS;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger fromUnsignedBigEndianBytes = ConscryptUtil.fromUnsignedBigEndianBytes(byteArray2);
            if (fromUnsignedBigEndianBytes.signum() <= 0 || fromUnsignedBigEndianBytes.compareTo(order) >= 0) {
                a$$ExternalSyntheticBUOutline0.m$6("Invalid private key.");
                return null;
            }
            if (!EllipticCurvesUtil.multiplyByGenerator(fromUnsignedBigEndianBytes, eCParameterSpec).equals(Hex.pointDecode(eCParameterSpec.getCurve(), EllipticCurves$PointFormatType.UNCOMPRESSED, byteArray))) {
                a$$ExternalSyntheticBUOutline0.m$6("Invalid private key for public key.");
                return null;
            }
        } else {
            if (kemId != kemId2) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) kemId, "Unable to validate key pair for ");
                return null;
            }
            if (!Arrays.equals(X25519.publicFromPrivate(byteArray2), byteArray)) {
                a$$ExternalSyntheticBUOutline0.m$6("Invalid private key for public key.");
                return null;
            }
        }
        return new HpkePrivateKey(hpkePublicKey, wireAdapter);
    }

    @Override // androidx.room.TransactorKt
    public final Parameters getParameters() {
        return this.publicKey.parameters;
    }

    @Override // com.google.crypto.tink.hybrid.HybridPrivateKey
    public final TransactorKt getPublicKey() {
        return this.publicKey;
    }

    @Override // com.google.crypto.tink.hybrid.HybridPrivateKey
    /* renamed from: getPublicKey */
    public final HybridPublicKey mo2034getPublicKey() {
        return this.publicKey;
    }
}
