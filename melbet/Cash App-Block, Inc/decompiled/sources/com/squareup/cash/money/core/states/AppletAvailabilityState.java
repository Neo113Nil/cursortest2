package com.squareup.cash.money.core.states;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AppletAvailabilityState {
    public static final /* synthetic */ AppletAvailabilityState[] $VALUES;
    public static final AppletAvailabilityState AVAILABLE;
    public static final AppletAvailabilityState LOADING;
    public static final AppletAvailabilityState UNAVAILABLE;

    static {
        AppletAvailabilityState appletAvailabilityState = new AppletAvailabilityState("AVAILABLE", 0);
        AVAILABLE = appletAvailabilityState;
        AppletAvailabilityState appletAvailabilityState2 = new AppletAvailabilityState("UNAVAILABLE", 1);
        UNAVAILABLE = appletAvailabilityState2;
        AppletAvailabilityState appletAvailabilityState3 = new AppletAvailabilityState("LOADING", 2);
        LOADING = appletAvailabilityState3;
        $VALUES = new AppletAvailabilityState[]{appletAvailabilityState, appletAvailabilityState2, appletAvailabilityState3};
    }

    public static AppletAvailabilityState valueOf(String str) {
        return (AppletAvailabilityState) Enum.valueOf(AppletAvailabilityState.class, str);
    }

    public static AppletAvailabilityState[] values() {
        return (AppletAvailabilityState[]) $VALUES.clone();
    }
}
