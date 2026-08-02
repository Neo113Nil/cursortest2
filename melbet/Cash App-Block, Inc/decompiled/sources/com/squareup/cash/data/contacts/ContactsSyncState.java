package com.squareup.cash.data.contacts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ContactsSyncState {
    public static final /* synthetic */ ContactsSyncState[] $VALUES;
    public static final ContactsSyncState DEFAULT;
    public static final ContactsSyncState OFF;
    public static final ContactsSyncState ON;

    static {
        ContactsSyncState contactsSyncState = new ContactsSyncState("DEFAULT", 0);
        DEFAULT = contactsSyncState;
        ContactsSyncState contactsSyncState2 = new ContactsSyncState("ON", 1);
        ON = contactsSyncState2;
        ContactsSyncState contactsSyncState3 = new ContactsSyncState("OFF", 2);
        OFF = contactsSyncState3;
        $VALUES = new ContactsSyncState[]{contactsSyncState, contactsSyncState2, contactsSyncState3};
    }

    public static ContactsSyncState valueOf(String str) {
        return (ContactsSyncState) Enum.valueOf(ContactsSyncState.class, str);
    }

    public static ContactsSyncState[] values() {
        return (ContactsSyncState[]) $VALUES.clone();
    }
}
