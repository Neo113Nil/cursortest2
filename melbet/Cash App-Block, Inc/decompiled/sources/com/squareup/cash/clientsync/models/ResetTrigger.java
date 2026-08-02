package com.squareup.cash.clientsync.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ResetTrigger {
    public static final /* synthetic */ ResetTrigger[] $VALUES;
    public static final ResetTrigger IllegalStateRecovery;
    public static final ResetTrigger ImmediateForceResync;

    /* JADX INFO: Fake field, exist only in values array */
    ResetTrigger EF0;

    static {
        ResetTrigger resetTrigger = new ResetTrigger("ClearAppData", 0);
        ResetTrigger resetTrigger2 = new ResetTrigger("Debug", 1);
        ResetTrigger resetTrigger3 = new ResetTrigger("IllegalStateRecovery", 2);
        IllegalStateRecovery = resetTrigger3;
        ResetTrigger resetTrigger4 = new ResetTrigger("ImmediateForceResync", 3);
        ImmediateForceResync = resetTrigger4;
        $VALUES = new ResetTrigger[]{resetTrigger, resetTrigger2, resetTrigger3, resetTrigger4, new ResetTrigger("SignOut", 4), new ResetTrigger("UiTest", 5)};
    }

    public static ResetTrigger valueOf(String str) {
        return (ResetTrigger) Enum.valueOf(ResetTrigger.class, str);
    }

    public static ResetTrigger[] values() {
        return (ResetTrigger[]) $VALUES.clone();
    }
}
