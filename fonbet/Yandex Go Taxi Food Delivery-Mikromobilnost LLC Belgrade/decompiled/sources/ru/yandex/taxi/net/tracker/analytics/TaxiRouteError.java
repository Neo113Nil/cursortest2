package ru.yandex.taxi.net.tracker.analytics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/net/tracker/analytics/TaxiRouteError;", "", "NetworkError", "AnotherError", "Lru/yandex/taxi/net/tracker/analytics/TaxiRouteError$AnotherError;", "Lru/yandex/taxi/net/tracker/analytics/TaxiRouteError$NetworkError;", "map_tracker"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TaxiRouteError extends Throwable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/taxi/net/tracker/analytics/TaxiRouteError$AnotherError;", "Lru/yandex/taxi/net/tracker/analytics/TaxiRouteError;", "map_tracker"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class AnotherError extends TaxiRouteError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/taxi/net/tracker/analytics/TaxiRouteError$NetworkError;", "Lru/yandex/taxi/net/tracker/analytics/TaxiRouteError;", "map_tracker"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class NetworkError extends TaxiRouteError {
    }
}
