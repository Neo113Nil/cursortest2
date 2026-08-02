package ru.yandex.taxi.map_common.style.source.model;

import defpackage.gjx0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.zuy0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/map_common/style/source/model/Theme;", "", "Companion", "zuy0", "LIGHT", "DARK", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Theme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Theme[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final zuy0 Companion;
    public static final Theme DARK;
    public static final Theme LIGHT;

    static {
        Theme theme = new Theme("LIGHT", 0);
        LIGHT = theme;
        Theme theme2 = new Theme("DARK", 1);
        DARK = theme2;
        Theme[] themeArr = {theme, theme2};
        $VALUES = themeArr;
        $ENTRIES = a.a(themeArr);
        Companion = new zuy0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gjx0(23));
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) $VALUES.clone();
    }
}
