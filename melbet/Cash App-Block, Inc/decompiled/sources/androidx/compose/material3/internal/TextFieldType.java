package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TextFieldType {
    public static final /* synthetic */ TextFieldType[] $VALUES = {new TextFieldType("Filled", 0), new TextFieldType("Outlined", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    TextFieldType EF5;

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) $VALUES.clone();
    }
}
