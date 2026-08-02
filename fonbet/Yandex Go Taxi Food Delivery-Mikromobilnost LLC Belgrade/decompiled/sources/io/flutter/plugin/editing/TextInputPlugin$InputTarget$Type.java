package io.flutter.plugin.editing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class TextInputPlugin$InputTarget$Type {
    private static final /* synthetic */ TextInputPlugin$InputTarget$Type[] $VALUES;
    public static final TextInputPlugin$InputTarget$Type FRAMEWORK_CLIENT;
    public static final TextInputPlugin$InputTarget$Type NO_TARGET;
    public static final TextInputPlugin$InputTarget$Type PHYSICAL_DISPLAY_PLATFORM_VIEW;
    public static final TextInputPlugin$InputTarget$Type VIRTUAL_DISPLAY_PLATFORM_VIEW;

    static {
        TextInputPlugin$InputTarget$Type textInputPlugin$InputTarget$Type = new TextInputPlugin$InputTarget$Type("NO_TARGET", 0);
        NO_TARGET = textInputPlugin$InputTarget$Type;
        TextInputPlugin$InputTarget$Type textInputPlugin$InputTarget$Type2 = new TextInputPlugin$InputTarget$Type("FRAMEWORK_CLIENT", 1);
        FRAMEWORK_CLIENT = textInputPlugin$InputTarget$Type2;
        TextInputPlugin$InputTarget$Type textInputPlugin$InputTarget$Type3 = new TextInputPlugin$InputTarget$Type("VIRTUAL_DISPLAY_PLATFORM_VIEW", 2);
        VIRTUAL_DISPLAY_PLATFORM_VIEW = textInputPlugin$InputTarget$Type3;
        TextInputPlugin$InputTarget$Type textInputPlugin$InputTarget$Type4 = new TextInputPlugin$InputTarget$Type("PHYSICAL_DISPLAY_PLATFORM_VIEW", 3);
        PHYSICAL_DISPLAY_PLATFORM_VIEW = textInputPlugin$InputTarget$Type4;
        $VALUES = new TextInputPlugin$InputTarget$Type[]{textInputPlugin$InputTarget$Type, textInputPlugin$InputTarget$Type2, textInputPlugin$InputTarget$Type3, textInputPlugin$InputTarget$Type4};
    }

    public static TextInputPlugin$InputTarget$Type valueOf(String str) {
        return (TextInputPlugin$InputTarget$Type) Enum.valueOf(TextInputPlugin$InputTarget$Type.class, str);
    }

    public static TextInputPlugin$InputTarget$Type[] values() {
        return (TextInputPlugin$InputTarget$Type[]) $VALUES.clone();
    }
}
