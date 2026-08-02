package com.squareup.cash.arcade.components.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class InputState {
    public static final /* synthetic */ InputState[] $VALUES;
    public static final InputState DEFAULT;
    public static final InputState DISABLED;
    public static final InputState ERROR;

    static {
        InputState inputState = new InputState("DEFAULT", 0);
        DEFAULT = inputState;
        InputState inputState2 = new InputState("ERROR", 1);
        ERROR = inputState2;
        InputState inputState3 = new InputState("DISABLED", 2);
        DISABLED = inputState3;
        $VALUES = new InputState[]{inputState, inputState2, inputState3};
    }

    public static InputState valueOf(String str) {
        return (InputState) Enum.valueOf(InputState.class, str);
    }

    public static InputState[] values() {
        return (InputState[]) $VALUES.clone();
    }
}
