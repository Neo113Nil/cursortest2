package ru.yandex.taxi.favorites.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/favorites/analytics/FavoritesAnalytics$TripButtonName", "", "Lru/yandex/taxi/favorites/analytics/FavoritesAnalytics$TripButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Trip", "Settings", "Save", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FavoritesAnalytics$TripButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoritesAnalytics$TripButtonName[] $VALUES;
    public static final FavoritesAnalytics$TripButtonName Save;
    public static final FavoritesAnalytics$TripButtonName Settings;
    public static final FavoritesAnalytics$TripButtonName Trip;
    private final String eventValue;

    static {
        FavoritesAnalytics$TripButtonName favoritesAnalytics$TripButtonName = new FavoritesAnalytics$TripButtonName("Trip", 0, "trip");
        Trip = favoritesAnalytics$TripButtonName;
        FavoritesAnalytics$TripButtonName favoritesAnalytics$TripButtonName2 = new FavoritesAnalytics$TripButtonName("Settings", 1, "settings");
        Settings = favoritesAnalytics$TripButtonName2;
        FavoritesAnalytics$TripButtonName favoritesAnalytics$TripButtonName3 = new FavoritesAnalytics$TripButtonName("Save", 2, "save");
        Save = favoritesAnalytics$TripButtonName3;
        FavoritesAnalytics$TripButtonName[] favoritesAnalytics$TripButtonNameArr = {favoritesAnalytics$TripButtonName, favoritesAnalytics$TripButtonName2, favoritesAnalytics$TripButtonName3};
        $VALUES = favoritesAnalytics$TripButtonNameArr;
        $ENTRIES = a.a(favoritesAnalytics$TripButtonNameArr);
    }

    public FavoritesAnalytics$TripButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static FavoritesAnalytics$TripButtonName valueOf(String str) {
        return (FavoritesAnalytics$TripButtonName) Enum.valueOf(FavoritesAnalytics$TripButtonName.class, str);
    }

    public static FavoritesAnalytics$TripButtonName[] values() {
        return (FavoritesAnalytics$TripButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
