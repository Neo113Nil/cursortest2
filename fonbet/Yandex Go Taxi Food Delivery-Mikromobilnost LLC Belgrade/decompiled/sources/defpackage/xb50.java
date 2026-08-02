package defpackage;

import com.yandex.go.navigator.domain.o;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.Location;

/* loaded from: classes12.dex */
public final class xb50 {
    public final liq0 a;
    public final vff b;
    public final o c;
    public final ah00 d;

    public xb50(liq0 liq0Var, vff vffVar, o oVar, ah00 ah00Var, gs7 gs7Var) {
        this.a = liq0Var;
        this.b = vffVar;
        this.c = oVar;
        this.d = ah00Var;
    }

    public final void a(DrivingRoute drivingRoute, boolean z) {
        Location a;
        Point position;
        fi6 fi6Var = new fi6();
        fi6Var.d(drivingRoute.getGeometry());
        if (z && (a = this.c.a()) != null && (position = a.getPosition()) != null) {
            fi6Var.c(position);
        }
        ((gh00) this.d).A(fi6Var.g(), null);
    }
}
