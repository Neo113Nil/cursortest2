package com.squareup.cash.charting.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SelectionBehavior {
    public static final /* synthetic */ SelectionBehavior[] $VALUES;
    public static final SelectionBehavior EmphasizeLabel;
    public static final SelectionBehavior Focus;
    public static final SelectionBehavior None;

    static {
        SelectionBehavior selectionBehavior = new SelectionBehavior("None", 0);
        None = selectionBehavior;
        SelectionBehavior selectionBehavior2 = new SelectionBehavior("Focus", 1);
        Focus = selectionBehavior2;
        SelectionBehavior selectionBehavior3 = new SelectionBehavior("EmphasizeLabel", 2);
        EmphasizeLabel = selectionBehavior3;
        $VALUES = new SelectionBehavior[]{selectionBehavior, selectionBehavior2, selectionBehavior3};
    }

    public static SelectionBehavior valueOf(String str) {
        return (SelectionBehavior) Enum.valueOf(SelectionBehavior.class, str);
    }

    public static SelectionBehavior[] values() {
        return (SelectionBehavior[]) $VALUES.clone();
    }
}
