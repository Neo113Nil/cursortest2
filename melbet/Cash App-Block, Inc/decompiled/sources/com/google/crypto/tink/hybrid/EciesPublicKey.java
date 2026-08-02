package com.google.crypto.tink.hybrid;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.XAesGcmKey$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.hybrid.EciesParameters;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.internal.OutputPrefixUtil;
import com.google.crypto.tink.util.Bytes;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* loaded from: classes.dex */
public final class EciesPublicKey extends HybridPublicKey {
    public final Integer idRequirement;
    public final ECPoint nistPublicPoint;
    public final Bytes outputPrefix;
    public final EciesParameters parameters;
    public final Bytes x25519PublicPointBytes;

    public EciesPublicKey(EciesParameters eciesParameters, ECPoint eCPoint, Bytes bytes, Bytes bytes2, Integer num) {
        this.parameters = eciesParameters;
        this.nistPublicPoint = eCPoint;
        this.x25519PublicPointBytes = bytes;
        this.outputPrefix = bytes2;
        this.idRequirement = num;
    }

    public static EciesPublicKey createForCurveX25519(EciesParameters eciesParameters, Bytes bytes, Integer num) {
        EciesParameters.CurveType curveType = eciesParameters.curveType;
        EciesParameters.Variant variant = eciesParameters.variant;
        if (!curveType.equals(EciesParameters.CurveType.X25519)) {
            a$$ExternalSyntheticBUOutline0.m$6("createForCurveX25519 may only be called with parameters for curve X25519");
            return null;
        }
        validateIdRequirement(variant, num);
        if (bytes.data.length == 32) {
            return new EciesPublicKey(eciesParameters, null, bytes, createOutputPrefix(variant, num), num);
        }
        a$$ExternalSyntheticBUOutline0.m$6("Encoded public point byte length for X25519 curve must be 32");
        return null;
    }

    public static EciesPublicKey createForNistCurve(EciesParameters eciesParameters, ECPoint eCPoint, Integer num) {
        EllipticCurve curve;
        EciesParameters.CurveType curveType = eciesParameters.curveType;
        EciesParameters.Variant variant = eciesParameters.variant;
        if (curveType.equals(EciesParameters.CurveType.X25519)) {
            a$$ExternalSyntheticBUOutline0.m$6("createForNistCurve may only be called with parameters for NIST curve");
            return null;
        }
        validateIdRequirement(variant, num);
        if (curveType == EciesParameters.CurveType.NIST_P256) {
            curve = EllipticCurvesUtil.NIST_P256_PARAMS.getCurve();
        } else if (curveType == EciesParameters.CurveType.NIST_P384) {
            curve = EllipticCurvesUtil.NIST_P384_PARAMS.getCurve();
        } else {
            if (curveType != EciesParameters.CurveType.NIST_P521) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) curveType, "Unable to determine NIST curve type for ");
                return null;
            }
            curve = EllipticCurvesUtil.NIST_P521_PARAMS.getCurve();
        }
        EllipticCurvesUtil.checkPointOnCurve(eCPoint, curve);
        return new EciesPublicKey(eciesParameters, eCPoint, null, createOutputPrefix(variant, num), num);
    }

    public static Bytes createOutputPrefix(EciesParameters.Variant variant, Integer num) {
        if (variant == EciesParameters.Variant.NO_PREFIX) {
            return OutputPrefixUtil.EMPTY_PREFIX;
        }
        if (num == null) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(variant, "idRequirement must be non-null for EciesParameters.Variant: ");
            return null;
        }
        if (variant == EciesParameters.Variant.CRUNCHY) {
            return OutputPrefixUtil.getLegacyOutputPrefix(num.intValue());
        }
        if (variant == EciesParameters.Variant.TINK) {
            return OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(variant, "Unknown EciesParameters.Variant: ");
        return null;
    }

    public static void validateIdRequirement(EciesParameters.Variant variant, Integer num) {
        EciesParameters.Variant variant2 = EciesParameters.Variant.NO_PREFIX;
        if (!variant.equals(variant2) && num == null) {
            XAesGcmKey$$ExternalSyntheticBUOutline0.m("'idRequirement' must be non-null for ", variant, " variant.");
        } else if (variant == variant2 && num != null) {
            a$$ExternalSyntheticBUOutline0.m$6("'idRequirement' must be null for NO_PREFIX variant.");
        }
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
