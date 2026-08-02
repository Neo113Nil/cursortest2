package ru.yandex.taxi.logistics.sdk.ui.theme.fonts;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/theme/fonts/Style;", "", "NORMAL", "ITALIC", "sdk-ui-theme"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Style {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Style[] $VALUES;
    public static final Style ITALIC;
    public static final Style NORMAL;

    static {
        Style style = new Style("NORMAL", 0);
        NORMAL = style;
        Style style2 = new Style("ITALIC", 1);
        ITALIC = style2;
        Style[] styleArr = {style, style2};
        $VALUES = styleArr;
        $ENTRIES = a.a(styleArr);
    }

    public static Style valueOf(String str) {
        return (Style) Enum.valueOf(Style.class, str);
    }

    public static Style[] values() {
        return (Style[]) $VALUES.clone();
    }
}
