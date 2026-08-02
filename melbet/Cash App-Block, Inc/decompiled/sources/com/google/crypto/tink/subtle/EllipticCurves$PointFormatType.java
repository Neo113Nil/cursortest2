package com.google.crypto.tink.subtle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EllipticCurves$PointFormatType {
    public static final /* synthetic */ EllipticCurves$PointFormatType[] $VALUES;
    public static final EllipticCurves$PointFormatType COMPRESSED;
    public static final EllipticCurves$PointFormatType DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    public static final EllipticCurves$PointFormatType UNCOMPRESSED;

    static {
        EllipticCurves$PointFormatType ellipticCurves$PointFormatType = new EllipticCurves$PointFormatType("UNCOMPRESSED", 0);
        UNCOMPRESSED = ellipticCurves$PointFormatType;
        EllipticCurves$PointFormatType ellipticCurves$PointFormatType2 = new EllipticCurves$PointFormatType("COMPRESSED", 1);
        COMPRESSED = ellipticCurves$PointFormatType2;
        EllipticCurves$PointFormatType ellipticCurves$PointFormatType3 = new EllipticCurves$PointFormatType("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED = ellipticCurves$PointFormatType3;
        $VALUES = new EllipticCurves$PointFormatType[]{ellipticCurves$PointFormatType, ellipticCurves$PointFormatType2, ellipticCurves$PointFormatType3};
    }

    public static EllipticCurves$PointFormatType valueOf(String str) {
        return (EllipticCurves$PointFormatType) Enum.valueOf(EllipticCurves$PointFormatType.class, str);
    }

    public static EllipticCurves$PointFormatType[] values() {
        return (EllipticCurves$PointFormatType[]) $VALUES.clone();
    }
}
