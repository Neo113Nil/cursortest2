package ru.yandex.taxi.favorites.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/favorites/analytics/FavoritesAnalytics$RideSettingsModalCloseReason", "", "Lru/yandex/taxi/favorites/analytics/FavoritesAnalytics$RideSettingsModalCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Trip", "Edit", "Delete", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FavoritesAnalytics$RideSettingsModalCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoritesAnalytics$RideSettingsModalCloseReason[] $VALUES;
    public static final FavoritesAnalytics$RideSettingsModalCloseReason Back;
    public static final FavoritesAnalytics$RideSettingsModalCloseReason Delete;
    public static final FavoritesAnalytics$RideSettingsModalCloseReason Edit;
    public static final FavoritesAnalytics$RideSettingsModalCloseReason Trip;
    private final String eventValue;

    static {
        FavoritesAnalytics$RideSettingsModalCloseReason favoritesAnalytics$RideSettingsModalCloseReason = new FavoritesAnalytics$RideSettingsModalCloseReason("Back", 0, "back");
        Back = favoritesAnalytics$RideSettingsModalCloseReason;
        FavoritesAnalytics$RideSettingsModalCloseReason favoritesAnalytics$RideSettingsModalCloseReason2 = new FavoritesAnalytics$RideSettingsModalCloseReason("Trip", 1, "trip");
        Trip = favoritesAnalytics$RideSettingsModalCloseReason2;
        FavoritesAnalytics$RideSettingsModalCloseReason favoritesAnalytics$RideSettingsModalCloseReason3 = new FavoritesAnalytics$RideSettingsModalCloseReason("Edit", 2, "edit");
        Edit = favoritesAnalytics$RideSettingsModalCloseReason3;
        FavoritesAnalytics$RideSettingsModalCloseReason favoritesAnalytics$RideSettingsModalCloseReason4 = new FavoritesAnalytics$RideSettingsModalCloseReason("Delete", 3, "delete");
        Delete = favoritesAnalytics$RideSettingsModalCloseReason4;
        FavoritesAnalytics$RideSettingsModalCloseReason[] favoritesAnalytics$RideSettingsModalCloseReasonArr = {favoritesAnalytics$RideSettingsModalCloseReason, favoritesAnalytics$RideSettingsModalCloseReason2, favoritesAnalytics$RideSettingsModalCloseReason3, favoritesAnalytics$RideSettingsModalCloseReason4};
        $VALUES = favoritesAnalytics$RideSettingsModalCloseReasonArr;
        $ENTRIES = a.a(favoritesAnalytics$RideSettingsModalCloseReasonArr);
    }

    public FavoritesAnalytics$RideSettingsModalCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static FavoritesAnalytics$RideSettingsModalCloseReason valueOf(String str) {
        return (FavoritesAnalytics$RideSettingsModalCloseReason) Enum.valueOf(FavoritesAnalytics$RideSettingsModalCloseReason.class, str);
    }

    public static FavoritesAnalytics$RideSettingsModalCloseReason[] values() {
        return (FavoritesAnalytics$RideSettingsModalCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
