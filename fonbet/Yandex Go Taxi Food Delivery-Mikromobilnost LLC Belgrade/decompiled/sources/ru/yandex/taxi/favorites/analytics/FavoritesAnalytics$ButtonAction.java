package ru.yandex.taxi.favorites.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/favorites/analytics/FavoritesAnalytics$ButtonAction", "", "Lru/yandex/taxi/favorites/analytics/FavoritesAnalytics$ButtonAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CreateGeoPoint", "ChangeRegularAddress", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesAnalytics$ButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoritesAnalytics$ButtonAction[] $VALUES;
    public static final FavoritesAnalytics$ButtonAction ChangeRegularAddress;
    public static final FavoritesAnalytics$ButtonAction CreateGeoPoint;
    private final String eventValue;

    static {
        FavoritesAnalytics$ButtonAction favoritesAnalytics$ButtonAction = new FavoritesAnalytics$ButtonAction("CreateGeoPoint", 0, "create_geo_point");
        CreateGeoPoint = favoritesAnalytics$ButtonAction;
        FavoritesAnalytics$ButtonAction favoritesAnalytics$ButtonAction2 = new FavoritesAnalytics$ButtonAction("ChangeRegularAddress", 1, "change_regular_address");
        ChangeRegularAddress = favoritesAnalytics$ButtonAction2;
        FavoritesAnalytics$ButtonAction[] favoritesAnalytics$ButtonActionArr = {favoritesAnalytics$ButtonAction, favoritesAnalytics$ButtonAction2};
        $VALUES = favoritesAnalytics$ButtonActionArr;
        $ENTRIES = a.a(favoritesAnalytics$ButtonActionArr);
    }

    public FavoritesAnalytics$ButtonAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static FavoritesAnalytics$ButtonAction valueOf(String str) {
        return (FavoritesAnalytics$ButtonAction) Enum.valueOf(FavoritesAnalytics$ButtonAction.class, str);
    }

    public static FavoritesAnalytics$ButtonAction[] values() {
        return (FavoritesAnalytics$ButtonAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
