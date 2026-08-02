package com.squareup.cash.fidesmo.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SuccessCardImageState {
    public static final /* synthetic */ SuccessCardImageState[] $VALUES;
    public static final SuccessCardImageState Error;
    public static final SuccessCardImageState Loading;
    public static final SuccessCardImageState Success;

    static {
        SuccessCardImageState successCardImageState = new SuccessCardImageState("Loading", 0);
        Loading = successCardImageState;
        SuccessCardImageState successCardImageState2 = new SuccessCardImageState("Error", 1);
        Error = successCardImageState2;
        SuccessCardImageState successCardImageState3 = new SuccessCardImageState("Success", 2);
        Success = successCardImageState3;
        $VALUES = new SuccessCardImageState[]{successCardImageState, successCardImageState2, successCardImageState3};
    }

    public static SuccessCardImageState valueOf(String str) {
        return (SuccessCardImageState) Enum.valueOf(SuccessCardImageState.class, str);
    }

    public static SuccessCardImageState[] values() {
        return (SuccessCardImageState[]) $VALUES.clone();
    }
}
