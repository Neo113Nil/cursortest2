package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TextFieldEditUndoBehavior {
    public static final /* synthetic */ TextFieldEditUndoBehavior[] $VALUES;
    public static final TextFieldEditUndoBehavior MergeIfPossible;
    public static final TextFieldEditUndoBehavior NeverMerge;

    static {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = new TextFieldEditUndoBehavior("MergeIfPossible", 0);
        MergeIfPossible = textFieldEditUndoBehavior;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = new TextFieldEditUndoBehavior("ClearHistory", 1);
        TextFieldEditUndoBehavior textFieldEditUndoBehavior3 = new TextFieldEditUndoBehavior("NeverMerge", 2);
        NeverMerge = textFieldEditUndoBehavior3;
        $VALUES = new TextFieldEditUndoBehavior[]{textFieldEditUndoBehavior, textFieldEditUndoBehavior2, textFieldEditUndoBehavior3};
    }

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) $VALUES.clone();
    }
}
