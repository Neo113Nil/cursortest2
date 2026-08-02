package com.squareup.cash.data.profile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProfileNotificationsRepository$ThresholdType {
    public static final /* synthetic */ ProfileNotificationsRepository$ThresholdType[] $VALUES;
    public static final ProfileNotificationsRepository$ThresholdType BITCOIN;
    public static final ProfileNotificationsRepository$ThresholdType STOCK;

    static {
        ProfileNotificationsRepository$ThresholdType profileNotificationsRepository$ThresholdType = new ProfileNotificationsRepository$ThresholdType("BITCOIN", 0);
        BITCOIN = profileNotificationsRepository$ThresholdType;
        ProfileNotificationsRepository$ThresholdType profileNotificationsRepository$ThresholdType2 = new ProfileNotificationsRepository$ThresholdType("STOCK", 1);
        STOCK = profileNotificationsRepository$ThresholdType2;
        $VALUES = new ProfileNotificationsRepository$ThresholdType[]{profileNotificationsRepository$ThresholdType, profileNotificationsRepository$ThresholdType2};
    }

    public static ProfileNotificationsRepository$ThresholdType valueOf(String str) {
        return (ProfileNotificationsRepository$ThresholdType) Enum.valueOf(ProfileNotificationsRepository$ThresholdType.class, str);
    }

    public static ProfileNotificationsRepository$ThresholdType[] values() {
        return (ProfileNotificationsRepository$ThresholdType[]) $VALUES.clone();
    }
}
