package com.squareup.cash.data.profile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Badge {
    public static final /* synthetic */ Badge[] $VALUES;
    public static final Badge BUSINESS;
    public static final Badge VERIFIED;

    static {
        Badge badge = new Badge("VERIFIED", 0);
        VERIFIED = badge;
        Badge badge2 = new Badge("BUSINESS", 1);
        BUSINESS = badge2;
        $VALUES = new Badge[]{badge, badge2};
    }

    public static Badge valueOf(String str) {
        return (Badge) Enum.valueOf(Badge.class, str);
    }

    public static Badge[] values() {
        return (Badge[]) $VALUES.clone();
    }
}
