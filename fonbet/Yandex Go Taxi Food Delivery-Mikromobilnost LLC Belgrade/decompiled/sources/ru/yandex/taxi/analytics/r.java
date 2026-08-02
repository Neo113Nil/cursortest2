package ru.yandex.taxi.analytics;

import defpackage.g8e;

/* loaded from: classes5.dex */
public final class r {
    public final com.yandex.go.analytics.b a;

    public r(com.yandex.go.analytics.b bVar) {
        this.a = bVar;
    }

    public final void a() {
        d(RouteStopsV2DebugAnalytics$PointType.DESTINATION);
    }

    public final void b() {
        d(RouteStopsV2DebugAnalytics$PointType.SOURCE);
    }

    public final void c() {
        d(RouteStopsV2DebugAnalytics$PointType.INTERMEDIATE);
    }

    public final void d(RouteStopsV2DebugAnalytics$PointType routeStopsV2DebugAnalytics$PointType) {
        this.a.b("Summary.IntermediatePoints.MapPointClick", g8e.z("point_type", routeStopsV2DebugAnalytics$PointType.getAnalyticsName()));
    }
}
