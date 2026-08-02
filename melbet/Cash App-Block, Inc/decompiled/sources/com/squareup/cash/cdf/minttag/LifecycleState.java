package com.squareup.cash.cdf.minttag;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class LifecycleState {
    public static final /* synthetic */ LifecycleState[] $VALUES;
    public static final LifecycleState ACTIVE;
    public static final LifecycleState INACTIVE;

    static {
        LifecycleState lifecycleState = new LifecycleState("ACTIVE", 0);
        ACTIVE = lifecycleState;
        LifecycleState lifecycleState2 = new LifecycleState("INACTIVE", 1);
        INACTIVE = lifecycleState2;
        $VALUES = new LifecycleState[]{lifecycleState, lifecycleState2};
    }

    public static LifecycleState valueOf(String str) {
        return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
    }

    public static LifecycleState[] values() {
        return (LifecycleState[]) $VALUES.clone();
    }
}
