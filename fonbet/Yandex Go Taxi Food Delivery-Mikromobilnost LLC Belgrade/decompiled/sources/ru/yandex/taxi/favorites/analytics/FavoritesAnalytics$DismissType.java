package ru.yandex.taxi.favorites.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/favorites/analytics/FavoritesAnalytics$DismissType", "", "Lru/yandex/taxi/favorites/analytics/FavoritesAnalytics$DismissType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CloseButton", "TapOutside", "SystemBack", "CloseAfterButtonTap", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FavoritesAnalytics$DismissType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoritesAnalytics$DismissType[] $VALUES;
    public static final FavoritesAnalytics$DismissType CloseAfterButtonTap;
    public static final FavoritesAnalytics$DismissType CloseButton;
    public static final FavoritesAnalytics$DismissType SystemBack;
    public static final FavoritesAnalytics$DismissType TapOutside;
    private final String eventValue;

    static {
        FavoritesAnalytics$DismissType favoritesAnalytics$DismissType = new FavoritesAnalytics$DismissType("CloseButton", 0, "close_button");
        CloseButton = favoritesAnalytics$DismissType;
        FavoritesAnalytics$DismissType favoritesAnalytics$DismissType2 = new FavoritesAnalytics$DismissType("TapOutside", 1, "tap_outside");
        TapOutside = favoritesAnalytics$DismissType2;
        FavoritesAnalytics$DismissType favoritesAnalytics$DismissType3 = new FavoritesAnalytics$DismissType("SystemBack", 2, "system_back");
        SystemBack = favoritesAnalytics$DismissType3;
        FavoritesAnalytics$DismissType favoritesAnalytics$DismissType4 = new FavoritesAnalytics$DismissType("CloseAfterButtonTap", 3, "close_after_button_tap");
        CloseAfterButtonTap = favoritesAnalytics$DismissType4;
        FavoritesAnalytics$DismissType[] favoritesAnalytics$DismissTypeArr = {favoritesAnalytics$DismissType, favoritesAnalytics$DismissType2, favoritesAnalytics$DismissType3, favoritesAnalytics$DismissType4};
        $VALUES = favoritesAnalytics$DismissTypeArr;
        $ENTRIES = a.a(favoritesAnalytics$DismissTypeArr);
    }

    public FavoritesAnalytics$DismissType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static FavoritesAnalytics$DismissType valueOf(String str) {
        return (FavoritesAnalytics$DismissType) Enum.valueOf(FavoritesAnalytics$DismissType.class, str);
    }

    public static FavoritesAnalytics$DismissType[] values() {
        return (FavoritesAnalytics$DismissType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
