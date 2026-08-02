package com.squareup.cash.cdf.document;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Trigger {
    public static final /* synthetic */ Trigger[] $VALUES;
    public static final Trigger CAMERA;
    public static final Trigger SYSTEM_PICKER;

    static {
        Trigger trigger = new Trigger("CAMERA", 0);
        CAMERA = trigger;
        Trigger trigger2 = new Trigger("SYSTEM_PICKER", 1);
        SYSTEM_PICKER = trigger2;
        $VALUES = new Trigger[]{trigger, trigger2};
    }

    public static Trigger valueOf(String str) {
        return (Trigger) Enum.valueOf(Trigger.class, str);
    }

    public static Trigger[] values() {
        return (Trigger[]) $VALUES.clone();
    }
}
