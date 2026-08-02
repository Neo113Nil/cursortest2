package ru.yandex.taxi.network.api.annotation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/network/api/annotation/ObserveStrategy;", "", "Default", "OnlyNoInternet", "OnlyServer", "TaxiIsSearching", "Favorites", "ScootersDiscovery", "go-client-android.libs.network:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ObserveStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ObserveStrategy[] $VALUES;
    public static final ObserveStrategy Default;
    public static final ObserveStrategy Favorites;
    public static final ObserveStrategy OnlyNoInternet;
    public static final ObserveStrategy OnlyServer;
    public static final ObserveStrategy ScootersDiscovery;
    public static final ObserveStrategy TaxiIsSearching;

    static {
        ObserveStrategy observeStrategy = new ObserveStrategy("Default", 0);
        Default = observeStrategy;
        ObserveStrategy observeStrategy2 = new ObserveStrategy("OnlyNoInternet", 1);
        OnlyNoInternet = observeStrategy2;
        ObserveStrategy observeStrategy3 = new ObserveStrategy("OnlyServer", 2);
        OnlyServer = observeStrategy3;
        ObserveStrategy observeStrategy4 = new ObserveStrategy("TaxiIsSearching", 3);
        TaxiIsSearching = observeStrategy4;
        ObserveStrategy observeStrategy5 = new ObserveStrategy("Favorites", 4);
        Favorites = observeStrategy5;
        ObserveStrategy observeStrategy6 = new ObserveStrategy("ScootersDiscovery", 5);
        ScootersDiscovery = observeStrategy6;
        ObserveStrategy[] observeStrategyArr = {observeStrategy, observeStrategy2, observeStrategy3, observeStrategy4, observeStrategy5, observeStrategy6};
        $VALUES = observeStrategyArr;
        $ENTRIES = a.a(observeStrategyArr);
    }

    public static ObserveStrategy valueOf(String str) {
        return (ObserveStrategy) Enum.valueOf(ObserveStrategy.class, str);
    }

    public static ObserveStrategy[] values() {
        return (ObserveStrategy[]) $VALUES.clone();
    }
}
