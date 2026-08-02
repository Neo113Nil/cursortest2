package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TextDeleteType {
    public static final /* synthetic */ TextDeleteType[] $VALUES;
    public static final TextDeleteType End;
    public static final TextDeleteType Inner;
    public static final TextDeleteType NotByUser;
    public static final TextDeleteType Start;

    static {
        TextDeleteType textDeleteType = new TextDeleteType("Start", 0);
        Start = textDeleteType;
        TextDeleteType textDeleteType2 = new TextDeleteType("End", 1);
        End = textDeleteType2;
        TextDeleteType textDeleteType3 = new TextDeleteType("Inner", 2);
        Inner = textDeleteType3;
        TextDeleteType textDeleteType4 = new TextDeleteType("NotByUser", 3);
        NotByUser = textDeleteType4;
        $VALUES = new TextDeleteType[]{textDeleteType, textDeleteType2, textDeleteType3, textDeleteType4};
    }

    public static TextDeleteType valueOf(String str) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, str);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) $VALUES.clone();
    }
}
