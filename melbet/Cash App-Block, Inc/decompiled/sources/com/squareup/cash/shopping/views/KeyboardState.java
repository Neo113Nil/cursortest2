package com.squareup.cash.shopping.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class KeyboardState {
    public static final /* synthetic */ KeyboardState[] $VALUES;
    public static final KeyboardState Closed;
    public static final KeyboardState Closing;
    public static final KeyboardState Open;

    static {
        KeyboardState keyboardState = new KeyboardState("Closed", 0);
        Closed = keyboardState;
        KeyboardState keyboardState2 = new KeyboardState("Closing", 1);
        Closing = keyboardState2;
        KeyboardState keyboardState3 = new KeyboardState("Open", 2);
        Open = keyboardState3;
        $VALUES = new KeyboardState[]{keyboardState, keyboardState2, keyboardState3};
    }

    public static KeyboardState valueOf(String str) {
        return (KeyboardState) Enum.valueOf(KeyboardState.class, str);
    }

    public static KeyboardState[] values() {
        return (KeyboardState[]) $VALUES.clone();
    }
}
