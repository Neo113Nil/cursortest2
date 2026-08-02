package com.squareup.cash.moneybot.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FloatingChatInputState {
    public static final /* synthetic */ FloatingChatInputState[] $VALUES;
    public static final FloatingChatInputState EXPANDED;

    /* JADX INFO: Fake field, exist only in values array */
    FloatingChatInputState EF0;

    static {
        FloatingChatInputState floatingChatInputState = new FloatingChatInputState("COLLAPSED", 0);
        FloatingChatInputState floatingChatInputState2 = new FloatingChatInputState("EXPANDED", 1);
        EXPANDED = floatingChatInputState2;
        $VALUES = new FloatingChatInputState[]{floatingChatInputState, floatingChatInputState2};
    }

    public static FloatingChatInputState valueOf(String str) {
        return (FloatingChatInputState) Enum.valueOf(FloatingChatInputState.class, str);
    }

    public static FloatingChatInputState[] values() {
        return (FloatingChatInputState[]) $VALUES.clone();
    }
}
