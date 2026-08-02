package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ContactInviteEntryPoint {
    public static final /* synthetic */ ContactInviteEntryPoint[] $VALUES;
    public static final ContactInviteEntryPoint ACTIVITY;
    public static final ContactInviteEntryPoint DISCOVER;
    public static final ContactInviteEntryPoint FAMILIES;
    public static final ContactInviteEntryPoint ONBOARDING;
    public static final ContactInviteEntryPoint PAYMENT;
    public static final ContactInviteEntryPoint PROFILE;
    public static final ContactInviteEntryPoint PROMOTION_HUB;

    static {
        ContactInviteEntryPoint contactInviteEntryPoint = new ContactInviteEntryPoint("ONBOARDING", 0);
        ONBOARDING = contactInviteEntryPoint;
        ContactInviteEntryPoint contactInviteEntryPoint2 = new ContactInviteEntryPoint("PROFILE", 1);
        PROFILE = contactInviteEntryPoint2;
        ContactInviteEntryPoint contactInviteEntryPoint3 = new ContactInviteEntryPoint("ACTIVITY", 2);
        ACTIVITY = contactInviteEntryPoint3;
        ContactInviteEntryPoint contactInviteEntryPoint4 = new ContactInviteEntryPoint("DISCOVER", 3);
        DISCOVER = contactInviteEntryPoint4;
        ContactInviteEntryPoint contactInviteEntryPoint5 = new ContactInviteEntryPoint("PAYMENT", 4);
        PAYMENT = contactInviteEntryPoint5;
        ContactInviteEntryPoint contactInviteEntryPoint6 = new ContactInviteEntryPoint("PROMOTION_HUB", 5);
        PROMOTION_HUB = contactInviteEntryPoint6;
        ContactInviteEntryPoint contactInviteEntryPoint7 = new ContactInviteEntryPoint("FAMILIES", 6);
        FAMILIES = contactInviteEntryPoint7;
        $VALUES = new ContactInviteEntryPoint[]{contactInviteEntryPoint, contactInviteEntryPoint2, contactInviteEntryPoint3, contactInviteEntryPoint4, contactInviteEntryPoint5, contactInviteEntryPoint6, contactInviteEntryPoint7};
    }

    public static ContactInviteEntryPoint valueOf(String str) {
        return (ContactInviteEntryPoint) Enum.valueOf(ContactInviteEntryPoint.class, str);
    }

    public static ContactInviteEntryPoint[] values() {
        return (ContactInviteEntryPoint[]) $VALUES.clone();
    }
}
