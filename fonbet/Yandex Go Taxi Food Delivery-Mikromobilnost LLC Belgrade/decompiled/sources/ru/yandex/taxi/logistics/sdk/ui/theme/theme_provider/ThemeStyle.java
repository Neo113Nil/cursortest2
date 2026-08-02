package ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/theme/theme_provider/ThemeStyle;", "", "DEFAULT", "ULTIMA", "sdk-ui-theme"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThemeStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ThemeStyle[] $VALUES;
    public static final ThemeStyle DEFAULT;
    public static final ThemeStyle ULTIMA;

    static {
        ThemeStyle themeStyle = new ThemeStyle("DEFAULT", 0);
        DEFAULT = themeStyle;
        ThemeStyle themeStyle2 = new ThemeStyle("ULTIMA", 1);
        ULTIMA = themeStyle2;
        ThemeStyle[] themeStyleArr = {themeStyle, themeStyle2};
        $VALUES = themeStyleArr;
        $ENTRIES = kotlin.enums.a.a(themeStyleArr);
    }

    public static ThemeStyle valueOf(String str) {
        return (ThemeStyle) Enum.valueOf(ThemeStyle.class, str);
    }

    public static ThemeStyle[] values() {
        return (ThemeStyle[]) $VALUES.clone();
    }
}
