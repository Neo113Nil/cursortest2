package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class vff {
    public final uyd a;
    public final r0 b;
    public final r0 c;

    public vff(uyd uydVar) {
        this.a = uydVar;
        r0 c = bvf0.c(null);
        this.b = c;
        this.c = c;
    }

    public final DrivingRoute a() {
        return (DrivingRoute) this.b.getValue();
    }

    public final r0 b() {
        return this.c;
    }

    public final void c(DrivingRoute drivingRoute) {
        r0 r0Var = this.b;
        DrivingRoute drivingRoute2 = (DrivingRoute) r0Var.getValue();
        uyd uydVar = this.a;
        if (drivingRoute2 != null) {
            drivingRoute2.removeConditionsListener(uydVar);
        }
        if (drivingRoute != null) {
            drivingRoute.addConditionsListener(uydVar);
        } else {
            drivingRoute = null;
        }
        r0Var.l(drivingRoute);
    }
}
