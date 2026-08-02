package androidx.compose.foundation.text.input.internal.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TextToolbarState {
    public static final /* synthetic */ TextToolbarState[] $VALUES;
    public static final TextToolbarState Cursor;
    public static final TextToolbarState None;
    public static final TextToolbarState Selection;

    static {
        TextToolbarState textToolbarState = new TextToolbarState("None", 0);
        None = textToolbarState;
        TextToolbarState textToolbarState2 = new TextToolbarState("Cursor", 1);
        Cursor = textToolbarState2;
        TextToolbarState textToolbarState3 = new TextToolbarState("Selection", 2);
        Selection = textToolbarState3;
        $VALUES = new TextToolbarState[]{textToolbarState, textToolbarState2, textToolbarState3};
    }

    public static TextToolbarState valueOf(String str) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, str);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) $VALUES.clone();
    }
}
