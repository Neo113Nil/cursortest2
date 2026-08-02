package com.squareup.cash.cdf.notificationssettings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AliasType {
    public static final /* synthetic */ AliasType[] $VALUES;
    public static final AliasType EMAIL;
    public static final AliasType PUSH;
    public static final AliasType SMS;

    static {
        AliasType aliasType = new AliasType("SMS", 0);
        SMS = aliasType;
        AliasType aliasType2 = new AliasType("EMAIL", 1);
        EMAIL = aliasType2;
        AliasType aliasType3 = new AliasType("PUSH", 2);
        PUSH = aliasType3;
        $VALUES = new AliasType[]{aliasType, aliasType2, aliasType3};
    }

    public static AliasType valueOf(String str) {
        return (AliasType) Enum.valueOf(AliasType.class, str);
    }

    public static AliasType[] values() {
        return (AliasType[]) $VALUES.clone();
    }
}
