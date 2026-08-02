package com.squareup.cash.sheet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class BottomSheetState {
    public static final /* synthetic */ BottomSheetState[] $VALUES;
    public static final BottomSheetState EXPANDED;
    public static final BottomSheetState PEEKING;
    public static final BottomSheetState SYSTEM_DISMISSED;
    public static final BottomSheetState USER_HIDDEN;

    static {
        BottomSheetState bottomSheetState = new BottomSheetState("EXPANDED", 0);
        EXPANDED = bottomSheetState;
        BottomSheetState bottomSheetState2 = new BottomSheetState("PEEKING", 1);
        PEEKING = bottomSheetState2;
        BottomSheetState bottomSheetState3 = new BottomSheetState("USER_HIDDEN", 2);
        USER_HIDDEN = bottomSheetState3;
        BottomSheetState bottomSheetState4 = new BottomSheetState("SYSTEM_DISMISSED", 3);
        SYSTEM_DISMISSED = bottomSheetState4;
        $VALUES = new BottomSheetState[]{bottomSheetState, bottomSheetState2, bottomSheetState3, bottomSheetState4};
    }

    public static BottomSheetState valueOf(String str) {
        return (BottomSheetState) Enum.valueOf(BottomSheetState.class, str);
    }

    public static BottomSheetState[] values() {
        return (BottomSheetState[]) $VALUES.clone();
    }
}
