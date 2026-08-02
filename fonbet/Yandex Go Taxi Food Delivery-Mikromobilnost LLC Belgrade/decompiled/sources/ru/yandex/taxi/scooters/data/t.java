package ru.yandex.taxi.scooters.data;

import com.yandex.mapkit.navigation.transport.GuidanceListener;
import com.yandex.mapkit.navigation.transport.RouteChangeReason;
import defpackage.e350;
import defpackage.fva0;
import defpackage.sls;
import defpackage.tzy0;
import defpackage.v0o0;
import defpackage.zy11;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes6.dex */
public final class t implements GuidanceListener {
    public final tzy0 a;
    public boolean b = true;
    public final /* synthetic */ sls c;
    public final /* synthetic */ ScootersNavigationRouteGuidanceRepository$GuidanceEvent d;
    public final /* synthetic */ v0o0 e;

    public t(sls slsVar, ScootersNavigationRouteGuidanceRepository$GuidanceEvent scootersNavigationRouteGuidanceRepository$GuidanceEvent, v0o0 v0o0Var) {
        this.c = slsVar;
        this.d = scootersNavigationRouteGuidanceRepository$GuidanceEvent;
        this.e = v0o0Var;
        this.a = new tzy0(1000, new e350(14, slsVar));
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onCurrentRouteChanged(RouteChangeReason routeChangeReason) {
        boolean z = this.e.c.b() != null;
        if (this.d == ScootersNavigationRouteGuidanceRepository$GuidanceEvent.ROUTE_CHANGED && routeChangeReason == RouteChangeReason.REROUTING && z) {
            this.c.invoke();
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onCurrentRouteFinished() {
        if (this.d == ScootersNavigationRouteGuidanceRepository$GuidanceEvent.ROUTE_FINISH) {
            this.c.invoke();
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onCurrentRouteLost() {
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onGuidanceModeChanged() {
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onLocationChanged() {
        if (this.d == ScootersNavigationRouteGuidanceRepository$GuidanceEvent.LOCATION_CHANGE) {
            this.a.a(zy11.a);
            if (this.b) {
                fva0.b(this.e.b, "ScootersNavigation", PerformanceAnalytics$Type.Loading, null, 4);
                this.b = false;
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onReachedRequestPoint() {
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onReturnedToRoute() {
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onVehicleDetection(int i, String str) {
    }
}
