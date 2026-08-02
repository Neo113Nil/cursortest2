package com.squareup.cash.clientsync.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SyncTrigger {
    public static final /* synthetic */ SyncTrigger[] $VALUES;
    public static final SyncTrigger APP_LAUNCH;
    public static final SyncTrigger BLOCKING_USER_ACTION;
    public static final SyncTrigger DEBUG;
    public static final SyncTrigger DELAYED_NEXT_CALL;
    public static final SyncTrigger IMMEDIATE_NEXT_CALL;
    public static final SyncTrigger POLLING;
    public static final SyncTrigger PUSH_NOTIFICATION;
    public static final SyncTrigger SERVER_PUSH;
    public static final SyncTrigger USER_ACTION;
    public static final SyncTrigger WIDGET;

    static {
        SyncTrigger syncTrigger = new SyncTrigger("APP_LAUNCH", 0);
        APP_LAUNCH = syncTrigger;
        SyncTrigger syncTrigger2 = new SyncTrigger("PUSH_NOTIFICATION", 1);
        PUSH_NOTIFICATION = syncTrigger2;
        SyncTrigger syncTrigger3 = new SyncTrigger("IMMEDIATE_NEXT_CALL", 2);
        IMMEDIATE_NEXT_CALL = syncTrigger3;
        SyncTrigger syncTrigger4 = new SyncTrigger("DELAYED_NEXT_CALL", 3);
        DELAYED_NEXT_CALL = syncTrigger4;
        SyncTrigger syncTrigger5 = new SyncTrigger("SERVER_PUSH", 4);
        SERVER_PUSH = syncTrigger5;
        SyncTrigger syncTrigger6 = new SyncTrigger("POLLING", 5);
        POLLING = syncTrigger6;
        SyncTrigger syncTrigger7 = new SyncTrigger("USER_ACTION", 6);
        USER_ACTION = syncTrigger7;
        SyncTrigger syncTrigger8 = new SyncTrigger("WIDGET", 7);
        WIDGET = syncTrigger8;
        SyncTrigger syncTrigger9 = new SyncTrigger("BLOCKING_USER_ACTION", 8);
        BLOCKING_USER_ACTION = syncTrigger9;
        SyncTrigger syncTrigger10 = new SyncTrigger("DEBUG", 9);
        DEBUG = syncTrigger10;
        $VALUES = new SyncTrigger[]{syncTrigger, syncTrigger2, syncTrigger3, syncTrigger4, syncTrigger5, syncTrigger6, syncTrigger7, syncTrigger8, syncTrigger9, syncTrigger10};
    }

    public static SyncTrigger valueOf(String str) {
        return (SyncTrigger) Enum.valueOf(SyncTrigger.class, str);
    }

    public static SyncTrigger[] values() {
        return (SyncTrigger[]) $VALUES.clone();
    }
}
