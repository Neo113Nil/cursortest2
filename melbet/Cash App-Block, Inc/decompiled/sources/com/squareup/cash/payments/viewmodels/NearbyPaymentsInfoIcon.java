package com.squareup.cash.payments.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class NearbyPaymentsInfoIcon {
    public static final /* synthetic */ NearbyPaymentsInfoIcon[] $VALUES;
    public static final NearbyPaymentsInfoIcon CONTACT_ADD;
    public static final NearbyPaymentsInfoIcon FAST;
    public static final NearbyPaymentsInfoIcon SECURITY_LOCK_OUTLINE;

    static {
        NearbyPaymentsInfoIcon nearbyPaymentsInfoIcon = new NearbyPaymentsInfoIcon("FAST", 0);
        FAST = nearbyPaymentsInfoIcon;
        NearbyPaymentsInfoIcon nearbyPaymentsInfoIcon2 = new NearbyPaymentsInfoIcon("CONTACT_ADD", 1);
        CONTACT_ADD = nearbyPaymentsInfoIcon2;
        NearbyPaymentsInfoIcon nearbyPaymentsInfoIcon3 = new NearbyPaymentsInfoIcon("SECURITY_LOCK_OUTLINE", 2);
        SECURITY_LOCK_OUTLINE = nearbyPaymentsInfoIcon3;
        $VALUES = new NearbyPaymentsInfoIcon[]{nearbyPaymentsInfoIcon, nearbyPaymentsInfoIcon2, nearbyPaymentsInfoIcon3};
    }

    public static NearbyPaymentsInfoIcon valueOf(String str) {
        return (NearbyPaymentsInfoIcon) Enum.valueOf(NearbyPaymentsInfoIcon.class, str);
    }

    public static NearbyPaymentsInfoIcon[] values() {
        return (NearbyPaymentsInfoIcon[]) $VALUES.clone();
    }
}
