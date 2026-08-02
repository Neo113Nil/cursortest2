package com.squareup.cash.moneybot.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class KeyboardState {
    public static final /* synthetic */ KeyboardState[] $VALUES;
    public static final KeyboardState AnimatingIn;
    public static final KeyboardState AnimatingOut;
    public static final KeyboardState Closed;
    public static final KeyboardState Open;

    static {
        KeyboardState keyboardState = new KeyboardState("Closed", 0);
        Closed = keyboardState;
        KeyboardState keyboardState2 = new KeyboardState("Open", 1);
        Open = keyboardState2;
        KeyboardState keyboardState3 = new KeyboardState("AnimatingIn", 2);
        AnimatingIn = keyboardState3;
        KeyboardState keyboardState4 = new KeyboardState("AnimatingOut", 3);
        AnimatingOut = keyboardState4;
        $VALUES = new KeyboardState[]{keyboardState, keyboardState2, keyboardState3, keyboardState4};
    }

    public static KeyboardState valueOf(String str) {
        return (KeyboardState) Enum.valueOf(KeyboardState.class, str);
    }

    public static KeyboardState[] values() {
        return (KeyboardState[]) $VALUES.clone();
    }
}
