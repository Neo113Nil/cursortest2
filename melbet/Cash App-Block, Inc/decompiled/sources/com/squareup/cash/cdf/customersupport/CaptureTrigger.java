package com.squareup.cash.cdf.customersupport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CaptureTrigger {
    public static final /* synthetic */ CaptureTrigger[] $VALUES;
    public static final CaptureTrigger CHAT;
    public static final CaptureTrigger NOTIFICATION;

    static {
        CaptureTrigger captureTrigger = new CaptureTrigger("CHAT", 0);
        CHAT = captureTrigger;
        CaptureTrigger captureTrigger2 = new CaptureTrigger("NOTIFICATION", 1);
        NOTIFICATION = captureTrigger2;
        $VALUES = new CaptureTrigger[]{captureTrigger, captureTrigger2};
    }

    public static CaptureTrigger valueOf(String str) {
        return (CaptureTrigger) Enum.valueOf(CaptureTrigger.class, str);
    }

    public static CaptureTrigger[] values() {
        return (CaptureTrigger[]) $VALUES.clone();
    }
}
