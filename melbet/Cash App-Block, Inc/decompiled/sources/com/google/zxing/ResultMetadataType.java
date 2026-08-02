package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ResultMetadataType {
    public static final /* synthetic */ ResultMetadataType[] $VALUES;
    public static final ResultMetadataType BYTE_SEGMENTS;
    public static final ResultMetadataType ERRORS_CORRECTED;
    public static final ResultMetadataType ERROR_CORRECTION_LEVEL;
    public static final ResultMetadataType STRUCTURED_APPEND_PARITY;
    public static final ResultMetadataType STRUCTURED_APPEND_SEQUENCE;
    public static final ResultMetadataType SYMBOLOGY_IDENTIFIER;

    /* JADX INFO: Fake field, exist only in values array */
    ResultMetadataType EF0;

    static {
        ResultMetadataType resultMetadataType = new ResultMetadataType("OTHER", 0);
        ResultMetadataType resultMetadataType2 = new ResultMetadataType("ORIENTATION", 1);
        ResultMetadataType resultMetadataType3 = new ResultMetadataType("BYTE_SEGMENTS", 2);
        BYTE_SEGMENTS = resultMetadataType3;
        ResultMetadataType resultMetadataType4 = new ResultMetadataType("ERROR_CORRECTION_LEVEL", 3);
        ERROR_CORRECTION_LEVEL = resultMetadataType4;
        ResultMetadataType resultMetadataType5 = new ResultMetadataType("ERRORS_CORRECTED", 4);
        ERRORS_CORRECTED = resultMetadataType5;
        ResultMetadataType resultMetadataType6 = new ResultMetadataType("ERASURES_CORRECTED", 5);
        ResultMetadataType resultMetadataType7 = new ResultMetadataType("ISSUE_NUMBER", 6);
        ResultMetadataType resultMetadataType8 = new ResultMetadataType("SUGGESTED_PRICE", 7);
        ResultMetadataType resultMetadataType9 = new ResultMetadataType("POSSIBLE_COUNTRY", 8);
        ResultMetadataType resultMetadataType10 = new ResultMetadataType("UPC_EAN_EXTENSION", 9);
        ResultMetadataType resultMetadataType11 = new ResultMetadataType("PDF417_EXTRA_METADATA", 10);
        ResultMetadataType resultMetadataType12 = new ResultMetadataType("STRUCTURED_APPEND_SEQUENCE", 11);
        STRUCTURED_APPEND_SEQUENCE = resultMetadataType12;
        ResultMetadataType resultMetadataType13 = new ResultMetadataType("STRUCTURED_APPEND_PARITY", 12);
        STRUCTURED_APPEND_PARITY = resultMetadataType13;
        ResultMetadataType resultMetadataType14 = new ResultMetadataType("SYMBOLOGY_IDENTIFIER", 13);
        SYMBOLOGY_IDENTIFIER = resultMetadataType14;
        $VALUES = new ResultMetadataType[]{resultMetadataType, resultMetadataType2, resultMetadataType3, resultMetadataType4, resultMetadataType5, resultMetadataType6, resultMetadataType7, resultMetadataType8, resultMetadataType9, resultMetadataType10, resultMetadataType11, resultMetadataType12, resultMetadataType13, resultMetadataType14};
    }

    public static ResultMetadataType valueOf(String str) {
        return (ResultMetadataType) Enum.valueOf(ResultMetadataType.class, str);
    }

    public static ResultMetadataType[] values() {
        return (ResultMetadataType[]) $VALUES.clone();
    }
}
