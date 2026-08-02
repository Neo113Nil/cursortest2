package ru.yandex.taxi.settings.api.dto.settings.types;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vl10;
import defpackage.w410;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/settings/api/dto/settings/types/MenuItemElementType;", "", "Companion", "vl10", "DEFAULT", "SWITCH", "NAVIGATION", "UNKNOWN", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MenuItemElementType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MenuItemElementType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final vl10 Companion;
    public static final MenuItemElementType DEFAULT;
    public static final MenuItemElementType NAVIGATION;
    public static final MenuItemElementType SWITCH;
    public static final MenuItemElementType UNKNOWN;

    static {
        MenuItemElementType menuItemElementType = new MenuItemElementType("DEFAULT", 0);
        DEFAULT = menuItemElementType;
        MenuItemElementType menuItemElementType2 = new MenuItemElementType("SWITCH", 1);
        SWITCH = menuItemElementType2;
        MenuItemElementType menuItemElementType3 = new MenuItemElementType("NAVIGATION", 2);
        NAVIGATION = menuItemElementType3;
        MenuItemElementType menuItemElementType4 = new MenuItemElementType("UNKNOWN", 3);
        UNKNOWN = menuItemElementType4;
        MenuItemElementType[] menuItemElementTypeArr = {menuItemElementType, menuItemElementType2, menuItemElementType3, menuItemElementType4};
        $VALUES = menuItemElementTypeArr;
        $ENTRIES = a.a(menuItemElementTypeArr);
        Companion = new vl10();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(19));
    }

    public static MenuItemElementType valueOf(String str) {
        return (MenuItemElementType) Enum.valueOf(MenuItemElementType.class, str);
    }

    public static MenuItemElementType[] values() {
        return (MenuItemElementType[]) $VALUES.clone();
    }
}
