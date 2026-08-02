package com.google.crypto.tink.hybrid;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.XAesGcmKey$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.hybrid.HpkeParameters;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.internal.OutputPrefixUtil;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.subtle.EllipticCurves$PointFormatType;
import com.google.crypto.tink.subtle.Hex;
import com.google.crypto.tink.util.Bytes;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* loaded from: classes.dex */
public final class HpkePublicKey extends HybridPublicKey {
    public final Integer idRequirement;
    public final Bytes outputPrefix;
    public final HpkeParameters parameters;
    public final Bytes publicKeyBytes;

    public HpkePublicKey(HpkeParameters hpkeParameters, Bytes bytes, Bytes bytes2, Integer num) {
        this.parameters = hpkeParameters;
        this.publicKeyBytes = bytes;
        this.outputPrefix = bytes2;
        this.idRequirement = num;
    }

    public static HpkePublicKey create(HpkeParameters hpkeParameters, Bytes bytes, Integer num) {
        EllipticCurve curve;
        Bytes tinkOutputPrefix;
        HpkeParameters.Variant variant = hpkeParameters.variant;
        HpkeParameters.Variant variant2 = HpkeParameters.Variant.NO_PREFIX;
        if (!variant.equals(variant2) && num == null) {
            XAesGcmKey$$ExternalSyntheticBUOutline0.m("'idRequirement' must be non-null for ", variant, " variant.");
            return null;
        }
        if (variant == variant2 && num != null) {
            a$$ExternalSyntheticBUOutline0.m$6("'idRequirement' must be null for NO_PREFIX variant.");
            return null;
        }
        HpkeParameters.KemId kemId = hpkeParameters.kem;
        int length = bytes.data.length;
        String str = "Encoded public key byte length for " + kemId + " must be %d, not " + length;
        HpkeParameters.KemId kemId2 = HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512;
        HpkeParameters.KemId kemId3 = HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384;
        HpkeParameters.KemId kemId4 = HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256;
        if (kemId == kemId4) {
            if (length != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (kemId == kemId3) {
            if (length != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (kemId == kemId2) {
            if (length != 133) {
                throw new GeneralSecurityException(String.format(str, Integer.valueOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE)));
            }
        } else {
            if (kemId != HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256) {
                MacWrapper$$ExternalSyntheticLambda0.m(kemId, "Unable to validate public key length for ");
                return null;
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (kemId == kemId4 || kemId == kemId3 || kemId == kemId2) {
            if (kemId == kemId4) {
                curve = EllipticCurvesUtil.NIST_P256_PARAMS.getCurve();
            } else if (kemId == kemId3) {
                curve = EllipticCurvesUtil.NIST_P384_PARAMS.getCurve();
            } else {
                if (kemId != kemId2) {
                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) kemId, "Unable to determine NIST curve type for ");
                    return null;
                }
                curve = EllipticCurvesUtil.NIST_P521_PARAMS.getCurve();
            }
            EllipticCurvesUtil.checkPointOnCurve(Hex.pointDecode(curve, EllipticCurves$PointFormatType.UNCOMPRESSED, bytes.toByteArray()), curve);
        }
        if (variant == variant2) {
            tinkOutputPrefix = OutputPrefixUtil.EMPTY_PREFIX;
        } else {
            if (num == null) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(variant, "idRequirement must be non-null for HpkeParameters.Variant ");
                return null;
            }
            if (variant == HpkeParameters.Variant.CRUNCHY) {
                tinkOutputPrefix = OutputPrefixUtil.getLegacyOutputPrefix(num.intValue());
            } else {
                if (variant != HpkeParameters.Variant.TINK) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(variant, "Unknown HpkeParameters.Variant: ");
                    return null;
                }
                tinkOutputPrefix = OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
            }
        }
        return new HpkePublicKey(hpkeParameters, bytes, tinkOutputPrefix, num);
    }

    @Override // androidx.room.TransactorKt
    public final Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.hybrid.HybridPublicKey
    public final Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // androidx.room.TransactorKt
    public final Parameters getParameters() {
        return this.parameters;
    }
}
