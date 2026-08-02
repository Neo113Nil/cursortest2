package com.squareup.cash.money.viewmodels.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SectionAvailabilityState {
    public static final /* synthetic */ SectionAvailabilityState[] $VALUES;
    public static final SectionAvailabilityState AVAILABLE;
    public static final SectionAvailabilityState UNAVAILABLE;

    static {
        SectionAvailabilityState sectionAvailabilityState = new SectionAvailabilityState("AVAILABLE", 0);
        AVAILABLE = sectionAvailabilityState;
        SectionAvailabilityState sectionAvailabilityState2 = new SectionAvailabilityState("UNAVAILABLE", 1);
        UNAVAILABLE = sectionAvailabilityState2;
        $VALUES = new SectionAvailabilityState[]{sectionAvailabilityState, sectionAvailabilityState2};
    }

    public static SectionAvailabilityState valueOf(String str) {
        return (SectionAvailabilityState) Enum.valueOf(SectionAvailabilityState.class, str);
    }

    public static SectionAvailabilityState[] values() {
        return (SectionAvailabilityState[]) $VALUES.clone();
    }
}
