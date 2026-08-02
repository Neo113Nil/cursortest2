package com.squareup.cash.cdf.integrity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Trigger {
    public static final /* synthetic */ Trigger[] $VALUES;
    public static final Trigger APP_STARTUP_SIGNED_IN;
    public static final Trigger END_OF_ONBOARDING;
    public static final Trigger SWITCH_PROFILE;

    /* JADX INFO: Fake field, exist only in values array */
    Trigger EF0;

    static {
        Trigger trigger = new Trigger("APP_STARTUP_SIGNED_OUT", 0);
        Trigger trigger2 = new Trigger("APP_STARTUP_PARTIALLY_ONBOARDED", 1);
        Trigger trigger3 = new Trigger("APP_STARTUP_SIGNED_IN", 2);
        APP_STARTUP_SIGNED_IN = trigger3;
        Trigger trigger4 = new Trigger("END_OF_ONBOARDING", 3);
        END_OF_ONBOARDING = trigger4;
        Trigger trigger5 = new Trigger("SWITCH_PROFILE", 4);
        SWITCH_PROFILE = trigger5;
        $VALUES = new Trigger[]{trigger, trigger2, trigger3, trigger4, trigger5};
    }

    public static Trigger valueOf(String str) {
        return (Trigger) Enum.valueOf(Trigger.class, str);
    }

    public static Trigger[] values() {
        return (Trigger[]) $VALUES.clone();
    }
}
