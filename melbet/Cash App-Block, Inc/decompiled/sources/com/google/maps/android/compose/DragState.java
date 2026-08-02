package com.google.maps.android.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DragState {
    public static final /* synthetic */ DragState[] $VALUES;
    public static final DragState DRAG;
    public static final DragState END;
    public static final DragState START;

    static {
        DragState dragState = new DragState("START", 0);
        START = dragState;
        DragState dragState2 = new DragState("DRAG", 1);
        DRAG = dragState2;
        DragState dragState3 = new DragState("END", 2);
        END = dragState3;
        $VALUES = new DragState[]{dragState, dragState2, dragState3};
    }

    public static DragState valueOf(String str) {
        return (DragState) Enum.valueOf(DragState.class, str);
    }

    public static DragState[] values() {
        return (DragState[]) $VALUES.clone();
    }
}
