package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SelectionHandleAnchor {
    public static final /* synthetic */ SelectionHandleAnchor[] $VALUES;
    public static final SelectionHandleAnchor Left;
    public static final SelectionHandleAnchor Middle;
    public static final SelectionHandleAnchor Right;

    static {
        SelectionHandleAnchor selectionHandleAnchor = new SelectionHandleAnchor("Left", 0);
        Left = selectionHandleAnchor;
        SelectionHandleAnchor selectionHandleAnchor2 = new SelectionHandleAnchor("Middle", 1);
        Middle = selectionHandleAnchor2;
        SelectionHandleAnchor selectionHandleAnchor3 = new SelectionHandleAnchor("Right", 2);
        Right = selectionHandleAnchor3;
        $VALUES = new SelectionHandleAnchor[]{selectionHandleAnchor, selectionHandleAnchor2, selectionHandleAnchor3};
    }

    public static SelectionHandleAnchor valueOf(String str) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, str);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) $VALUES.clone();
    }
}
