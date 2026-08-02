package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Polyline;
import ru.yandex.taxi.preorder.source.DrivingRoutes$Type;

/* loaded from: classes6.dex */
public final class ylm {
    public final boolean a;
    public final DrivingRoute b;
    public final DrivingRoutes$Type c;
    public final String d;
    public final boolean e;
    public final int f;
    public final q6l0 g;

    public ylm(boolean z, DrivingRoute drivingRoute, DrivingRoutes$Type drivingRoutes$Type, String str, boolean z2, int i, q6l0 q6l0Var) {
        this.a = z;
        this.b = drivingRoute;
        this.c = drivingRoutes$Type;
        this.d = str;
        this.e = z2;
        this.f = i;
        this.g = q6l0Var;
    }

    public final Polyline a() {
        Polyline polyline;
        q6l0 q6l0Var = this.g;
        return (q6l0Var == null || (polyline = (Polyline) q6l0Var.j.getValue()) == null) ? this.b.getGeometry() : polyline;
    }

    public final boolean b() {
        return this.b.getMetadata().getFlags().getHasTolls();
    }
}
