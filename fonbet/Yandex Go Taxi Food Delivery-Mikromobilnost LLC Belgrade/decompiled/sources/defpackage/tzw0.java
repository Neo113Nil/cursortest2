package defpackage;

import com.yandex.go.navigator.domain.t;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;

/* loaded from: classes12.dex */
public final class tzw0 {
    public final t a;

    public tzw0(t tVar) {
        this.a = tVar;
    }

    public final void a(DrivingRoute drivingRoute) {
        Guidance guidance;
        t tVar = this.a;
        if (!tVar.B) {
            tVar.h(drivingRoute.getRouteId());
            return;
        }
        Navigation navigation = tVar.w;
        if (navigation != null && (guidance = navigation.getGuidance()) != null) {
            guidance.switchToRoute(drivingRoute);
        }
        tVar.q.a(drivingRoute);
    }
}
