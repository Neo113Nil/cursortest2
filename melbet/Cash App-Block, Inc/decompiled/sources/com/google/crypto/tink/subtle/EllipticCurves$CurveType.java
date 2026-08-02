package com.google.crypto.tink.subtle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EllipticCurves$CurveType {
    public static final /* synthetic */ EllipticCurves$CurveType[] $VALUES;
    public static final EllipticCurves$CurveType NIST_P256;
    public static final EllipticCurves$CurveType NIST_P384;
    public static final EllipticCurves$CurveType NIST_P521;

    static {
        EllipticCurves$CurveType ellipticCurves$CurveType = new EllipticCurves$CurveType("NIST_P256", 0);
        NIST_P256 = ellipticCurves$CurveType;
        EllipticCurves$CurveType ellipticCurves$CurveType2 = new EllipticCurves$CurveType("NIST_P384", 1);
        NIST_P384 = ellipticCurves$CurveType2;
        EllipticCurves$CurveType ellipticCurves$CurveType3 = new EllipticCurves$CurveType("NIST_P521", 2);
        NIST_P521 = ellipticCurves$CurveType3;
        $VALUES = new EllipticCurves$CurveType[]{ellipticCurves$CurveType, ellipticCurves$CurveType2, ellipticCurves$CurveType3};
    }

    public static EllipticCurves$CurveType valueOf(String str) {
        return (EllipticCurves$CurveType) Enum.valueOf(EllipticCurves$CurveType.class, str);
    }

    public static EllipticCurves$CurveType[] values() {
        return (EllipticCurves$CurveType[]) $VALUES.clone();
    }
}
