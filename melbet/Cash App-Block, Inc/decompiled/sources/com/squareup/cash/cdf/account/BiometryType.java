package com.squareup.cash.cdf.account;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BiometryType {
    public static final /* synthetic */ BiometryType[] $VALUES;
    public static final BiometryType STRONG;
    public static final BiometryType WEAK;

    /* JADX INFO: Fake field, exist only in values array */
    BiometryType EF0;

    static {
        BiometryType biometryType = new BiometryType("FINGERPRINT", 0);
        BiometryType biometryType2 = new BiometryType("FACE", 1);
        BiometryType biometryType3 = new BiometryType("STRONG", 2);
        STRONG = biometryType3;
        BiometryType biometryType4 = new BiometryType("WEAK", 3);
        WEAK = biometryType4;
        $VALUES = new BiometryType[]{biometryType, biometryType2, biometryType3, biometryType4, new BiometryType("NONE", 4)};
    }

    public static BiometryType valueOf(String str) {
        return (BiometryType) Enum.valueOf(BiometryType.class, str);
    }

    public static BiometryType[] values() {
        return (BiometryType[]) $VALUES.clone();
    }
}
