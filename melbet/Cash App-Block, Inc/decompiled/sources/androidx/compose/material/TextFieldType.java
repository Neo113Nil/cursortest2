package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TextFieldType {
    public static final /* synthetic */ TextFieldType[] $VALUES;
    public static final TextFieldType Filled;
    public static final TextFieldType Outlined;

    static {
        TextFieldType textFieldType = new TextFieldType("Filled", 0);
        Filled = textFieldType;
        TextFieldType textFieldType2 = new TextFieldType("Outlined", 1);
        Outlined = textFieldType2;
        $VALUES = new TextFieldType[]{textFieldType, textFieldType2};
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) $VALUES.clone();
    }
}
