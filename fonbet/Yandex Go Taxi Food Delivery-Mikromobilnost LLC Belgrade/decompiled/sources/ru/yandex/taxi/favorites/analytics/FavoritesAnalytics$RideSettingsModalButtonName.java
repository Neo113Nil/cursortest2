package ru.yandex.taxi.favorites.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/favorites/analytics/FavoritesAnalytics$RideSettingsModalButtonName", "", "Lru/yandex/taxi/favorites/analytics/FavoritesAnalytics$RideSettingsModalButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Trip", "Delete", "Share", "Edit", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FavoritesAnalytics$RideSettingsModalButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoritesAnalytics$RideSettingsModalButtonName[] $VALUES;
    public static final FavoritesAnalytics$RideSettingsModalButtonName Back;
    public static final FavoritesAnalytics$RideSettingsModalButtonName Delete;
    public static final FavoritesAnalytics$RideSettingsModalButtonName Edit;
    public static final FavoritesAnalytics$RideSettingsModalButtonName Share;
    public static final FavoritesAnalytics$RideSettingsModalButtonName Trip;
    private final String eventValue;

    static {
        FavoritesAnalytics$RideSettingsModalButtonName favoritesAnalytics$RideSettingsModalButtonName = new FavoritesAnalytics$RideSettingsModalButtonName("Back", 0, "back");
        Back = favoritesAnalytics$RideSettingsModalButtonName;
        FavoritesAnalytics$RideSettingsModalButtonName favoritesAnalytics$RideSettingsModalButtonName2 = new FavoritesAnalytics$RideSettingsModalButtonName("Trip", 1, "trip");
        Trip = favoritesAnalytics$RideSettingsModalButtonName2;
        FavoritesAnalytics$RideSettingsModalButtonName favoritesAnalytics$RideSettingsModalButtonName3 = new FavoritesAnalytics$RideSettingsModalButtonName("Delete", 2, "delete");
        Delete = favoritesAnalytics$RideSettingsModalButtonName3;
        FavoritesAnalytics$RideSettingsModalButtonName favoritesAnalytics$RideSettingsModalButtonName4 = new FavoritesAnalytics$RideSettingsModalButtonName("Share", 3, "share");
        Share = favoritesAnalytics$RideSettingsModalButtonName4;
        FavoritesAnalytics$RideSettingsModalButtonName favoritesAnalytics$RideSettingsModalButtonName5 = new FavoritesAnalytics$RideSettingsModalButtonName("Edit", 4, "edit");
        Edit = favoritesAnalytics$RideSettingsModalButtonName5;
        FavoritesAnalytics$RideSettingsModalButtonName[] favoritesAnalytics$RideSettingsModalButtonNameArr = {favoritesAnalytics$RideSettingsModalButtonName, favoritesAnalytics$RideSettingsModalButtonName2, favoritesAnalytics$RideSettingsModalButtonName3, favoritesAnalytics$RideSettingsModalButtonName4, favoritesAnalytics$RideSettingsModalButtonName5};
        $VALUES = favoritesAnalytics$RideSettingsModalButtonNameArr;
        $ENTRIES = a.a(favoritesAnalytics$RideSettingsModalButtonNameArr);
    }

    public FavoritesAnalytics$RideSettingsModalButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static FavoritesAnalytics$RideSettingsModalButtonName valueOf(String str) {
        return (FavoritesAnalytics$RideSettingsModalButtonName) Enum.valueOf(FavoritesAnalytics$RideSettingsModalButtonName.class, str);
    }

    public static FavoritesAnalytics$RideSettingsModalButtonName[] values() {
        return (FavoritesAnalytics$RideSettingsModalButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
