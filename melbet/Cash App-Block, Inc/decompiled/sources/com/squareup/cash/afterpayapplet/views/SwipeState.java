package com.squareup.cash.afterpayapplet.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class SwipeState {
    public static final /* synthetic */ SwipeState[] $VALUES;
    public static final SwipeState START;
    public static final SwipeState UP;

    static {
        SwipeState swipeState = new SwipeState("UP", 0);
        UP = swipeState;
        SwipeState swipeState2 = new SwipeState("START", 1);
        START = swipeState2;
        $VALUES = new SwipeState[]{swipeState, swipeState2};
    }

    public static SwipeState valueOf(String str) {
        return (SwipeState) Enum.valueOf(SwipeState.class, str);
    }

    public static SwipeState[] values() {
        return (SwipeState[]) $VALUES.clone();
    }
}
