package com.squareup.cash.deviceintegrity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IntegrityErrorType {
    public static final /* synthetic */ IntegrityErrorType[] $VALUES;
    public static final IntegrityErrorType INTEGRITY_EXCEPTION;
    public static final IntegrityErrorType REMOTE_EXCEPTION;
    public static final IntegrityErrorType STANDARD_INTEGRITY_EXCEPTION;
    public static final IntegrityErrorType TIMEOUT_EXCEPTION;
    public static final IntegrityErrorType TOO_MANY_RETRIES;

    static {
        IntegrityErrorType integrityErrorType = new IntegrityErrorType("INTEGRITY_EXCEPTION", 0);
        INTEGRITY_EXCEPTION = integrityErrorType;
        IntegrityErrorType integrityErrorType2 = new IntegrityErrorType("TOO_MANY_RETRIES", 1);
        TOO_MANY_RETRIES = integrityErrorType2;
        IntegrityErrorType integrityErrorType3 = new IntegrityErrorType("INTERRUPTED_EXCEPTION", 2);
        IntegrityErrorType integrityErrorType4 = new IntegrityErrorType("TIMEOUT_EXCEPTION", 3);
        TIMEOUT_EXCEPTION = integrityErrorType4;
        IntegrityErrorType integrityErrorType5 = new IntegrityErrorType("PLAY_SERVICES_UNAVAILABLE", 4);
        IntegrityErrorType integrityErrorType6 = new IntegrityErrorType("STANDARD_INTEGRITY_EXCEPTION", 5);
        STANDARD_INTEGRITY_EXCEPTION = integrityErrorType6;
        IntegrityErrorType integrityErrorType7 = new IntegrityErrorType("REMOTE_EXCEPTION", 6);
        REMOTE_EXCEPTION = integrityErrorType7;
        $VALUES = new IntegrityErrorType[]{integrityErrorType, integrityErrorType2, integrityErrorType3, integrityErrorType4, integrityErrorType5, integrityErrorType6, integrityErrorType7};
    }

    public static IntegrityErrorType valueOf(String str) {
        return (IntegrityErrorType) Enum.valueOf(IntegrityErrorType.class, str);
    }

    public static IntegrityErrorType[] values() {
        return (IntegrityErrorType[]) $VALUES.clone();
    }
}
