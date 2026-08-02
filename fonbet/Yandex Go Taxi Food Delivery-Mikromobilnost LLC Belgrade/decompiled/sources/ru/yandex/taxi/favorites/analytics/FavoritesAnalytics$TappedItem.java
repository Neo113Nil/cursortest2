package ru.yandex.taxi.favorites.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/favorites/analytics/FavoritesAnalytics$TappedItem", "", "Lru/yandex/taxi/favorites/analytics/FavoritesAnalytics$TappedItem;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Map", "AddressEditButton", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FavoritesAnalytics$TappedItem {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoritesAnalytics$TappedItem[] $VALUES;
    public static final FavoritesAnalytics$TappedItem AddressEditButton;
    public static final FavoritesAnalytics$TappedItem Map;
    private final String eventValue;

    static {
        FavoritesAnalytics$TappedItem favoritesAnalytics$TappedItem = new FavoritesAnalytics$TappedItem("Map", 0, PolicyMappingsExtension.MAP);
        Map = favoritesAnalytics$TappedItem;
        FavoritesAnalytics$TappedItem favoritesAnalytics$TappedItem2 = new FavoritesAnalytics$TappedItem("AddressEditButton", 1, "address_edit_button");
        AddressEditButton = favoritesAnalytics$TappedItem2;
        FavoritesAnalytics$TappedItem[] favoritesAnalytics$TappedItemArr = {favoritesAnalytics$TappedItem, favoritesAnalytics$TappedItem2};
        $VALUES = favoritesAnalytics$TappedItemArr;
        $ENTRIES = a.a(favoritesAnalytics$TappedItemArr);
    }

    public FavoritesAnalytics$TappedItem(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static FavoritesAnalytics$TappedItem valueOf(String str) {
        return (FavoritesAnalytics$TappedItem) Enum.valueOf(FavoritesAnalytics$TappedItem.class, str);
    }

    public static FavoritesAnalytics$TappedItem[] values() {
        return (FavoritesAnalytics$TappedItem[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
