package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ContactSyncTriggerReason {
    public static final /* synthetic */ ContactSyncTriggerReason[] $VALUES;
    public static final ContactSyncTriggerReason APP_LAUNCH;

    static {
        ContactSyncTriggerReason contactSyncTriggerReason = new ContactSyncTriggerReason("APP_LAUNCH", 0);
        APP_LAUNCH = contactSyncTriggerReason;
        $VALUES = new ContactSyncTriggerReason[]{contactSyncTriggerReason, new ContactSyncTriggerReason("ONBOARDING", 1), new ContactSyncTriggerReason("INVITE_FRIENDS", 2), new ContactSyncTriggerReason("FAVORITES", 3), new ContactSyncTriggerReason("FAMILY_SPONSOR", 4), new ContactSyncTriggerReason("RECIPIENT_SELECTOR", 5)};
    }

    public static ContactSyncTriggerReason valueOf(String str) {
        return (ContactSyncTriggerReason) Enum.valueOf(ContactSyncTriggerReason.class, str);
    }

    public static ContactSyncTriggerReason[] values() {
        return (ContactSyncTriggerReason[]) $VALUES.clone();
    }
}
