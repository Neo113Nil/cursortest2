package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TextEditType {
    public static final /* synthetic */ TextEditType[] $VALUES;
    public static final TextEditType Delete;
    public static final TextEditType Insert;
    public static final TextEditType Replace;

    static {
        TextEditType textEditType = new TextEditType("Insert", 0);
        Insert = textEditType;
        TextEditType textEditType2 = new TextEditType("Delete", 1);
        Delete = textEditType2;
        TextEditType textEditType3 = new TextEditType("Replace", 2);
        Replace = textEditType3;
        $VALUES = new TextEditType[]{textEditType, textEditType2, textEditType3};
    }

    public static TextEditType valueOf(String str) {
        return (TextEditType) Enum.valueOf(TextEditType.class, str);
    }

    public static TextEditType[] values() {
        return (TextEditType[]) $VALUES.clone();
    }
}
