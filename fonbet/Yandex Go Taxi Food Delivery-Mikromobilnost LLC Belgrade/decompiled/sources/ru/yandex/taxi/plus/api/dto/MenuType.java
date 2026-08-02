package ru.yandex.taxi.plus.api.dto;

import defpackage.g110;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jn10;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/api/dto/MenuType;", "", "Companion", "jn10", "NATIVE", "WEB_VIEW", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MenuType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MenuType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final jn10 Companion;
    public static final MenuType NATIVE;
    public static final MenuType WEB_VIEW;

    static {
        MenuType menuType = new MenuType("NATIVE", 0);
        NATIVE = menuType;
        MenuType menuType2 = new MenuType("WEB_VIEW", 1);
        WEB_VIEW = menuType2;
        MenuType[] menuTypeArr = {menuType, menuType2};
        $VALUES = menuTypeArr;
        $ENTRIES = kotlin.enums.a.a(menuTypeArr);
        Companion = new jn10();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g110(12));
    }

    public static MenuType valueOf(String str) {
        return (MenuType) Enum.valueOf(MenuType.class, str);
    }

    public static MenuType[] values() {
        return (MenuType[]) $VALUES.clone();
    }
}
