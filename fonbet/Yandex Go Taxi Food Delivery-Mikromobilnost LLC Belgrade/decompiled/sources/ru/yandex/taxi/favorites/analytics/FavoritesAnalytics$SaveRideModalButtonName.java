package ru.yandex.taxi.favorites.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/favorites/analytics/FavoritesAnalytics$SaveRideModalButtonName", "", "Lru/yandex/taxi/favorites/analytics/FavoritesAnalytics$SaveRideModalButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "NameField", "Save", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FavoritesAnalytics$SaveRideModalButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoritesAnalytics$SaveRideModalButtonName[] $VALUES;
    public static final FavoritesAnalytics$SaveRideModalButtonName Back;
    public static final FavoritesAnalytics$SaveRideModalButtonName NameField;
    public static final FavoritesAnalytics$SaveRideModalButtonName Save;
    private final String eventValue;

    static {
        FavoritesAnalytics$SaveRideModalButtonName favoritesAnalytics$SaveRideModalButtonName = new FavoritesAnalytics$SaveRideModalButtonName("Back", 0, "back");
        Back = favoritesAnalytics$SaveRideModalButtonName;
        FavoritesAnalytics$SaveRideModalButtonName favoritesAnalytics$SaveRideModalButtonName2 = new FavoritesAnalytics$SaveRideModalButtonName("NameField", 1, "name_field");
        NameField = favoritesAnalytics$SaveRideModalButtonName2;
        FavoritesAnalytics$SaveRideModalButtonName favoritesAnalytics$SaveRideModalButtonName3 = new FavoritesAnalytics$SaveRideModalButtonName("Save", 2, "save");
        Save = favoritesAnalytics$SaveRideModalButtonName3;
        FavoritesAnalytics$SaveRideModalButtonName[] favoritesAnalytics$SaveRideModalButtonNameArr = {favoritesAnalytics$SaveRideModalButtonName, favoritesAnalytics$SaveRideModalButtonName2, favoritesAnalytics$SaveRideModalButtonName3};
        $VALUES = favoritesAnalytics$SaveRideModalButtonNameArr;
        $ENTRIES = a.a(favoritesAnalytics$SaveRideModalButtonNameArr);
    }

    public FavoritesAnalytics$SaveRideModalButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static FavoritesAnalytics$SaveRideModalButtonName valueOf(String str) {
        return (FavoritesAnalytics$SaveRideModalButtonName) Enum.valueOf(FavoritesAnalytics$SaveRideModalButtonName.class, str);
    }

    public static FavoritesAnalytics$SaveRideModalButtonName[] values() {
        return (FavoritesAnalytics$SaveRideModalButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
