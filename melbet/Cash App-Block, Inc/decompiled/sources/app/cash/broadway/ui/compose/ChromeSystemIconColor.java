package app.cash.broadway.ui.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ChromeSystemIconColor {
    public static final /* synthetic */ ChromeSystemIconColor[] $VALUES;
    public static final ChromeSystemIconColor ALWAYS_DARK;
    public static final ChromeSystemIconColor ALWAYS_LIGHT;
    public static final ChromeSystemIconColor STANDARD;

    static {
        ChromeSystemIconColor chromeSystemIconColor = new ChromeSystemIconColor("STANDARD", 0);
        STANDARD = chromeSystemIconColor;
        ChromeSystemIconColor chromeSystemIconColor2 = new ChromeSystemIconColor("ALWAYS_LIGHT", 1);
        ALWAYS_LIGHT = chromeSystemIconColor2;
        ChromeSystemIconColor chromeSystemIconColor3 = new ChromeSystemIconColor("ALWAYS_DARK", 2);
        ALWAYS_DARK = chromeSystemIconColor3;
        $VALUES = new ChromeSystemIconColor[]{chromeSystemIconColor, chromeSystemIconColor2, chromeSystemIconColor3};
    }

    public static ChromeSystemIconColor valueOf(String str) {
        return (ChromeSystemIconColor) Enum.valueOf(ChromeSystemIconColor.class, str);
    }

    public static ChromeSystemIconColor[] values() {
        return (ChromeSystemIconColor[]) $VALUES.clone();
    }
}
