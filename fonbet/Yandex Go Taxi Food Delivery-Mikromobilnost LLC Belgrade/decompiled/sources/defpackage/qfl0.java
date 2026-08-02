package defpackage;

import com.yandex.go.zone.repository.o;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.PolylinePosition;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes5.dex */
public final class qfl0 {
    public static final /* synthetic */ kgx[] l = {new MutablePropertyReference1Impl("isVisible", 0, "isVisible()Z", qfl0.class)};
    public final b2l0 a;
    public final tt2 b;
    public final leh c;
    public final o d;
    public final xm00 e;
    public final oji f = new oji(this);
    public w4e0 g;
    public String h;
    public ike i;
    public PolylinePosition j;
    public DrivingRoute k;

    public qfl0(pdi pdiVar, b2l0 b2l0Var, tt2 tt2Var, leh lehVar, o oVar) {
        this.a = b2l0Var;
        this.b = tt2Var;
        this.c = lehVar;
        this.d = oVar;
        this.e = pdiVar.a;
    }

    public final void a() {
        ike ikeVar = this.i;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        this.i = null;
        w4e0 w4e0Var = this.g;
        if (w4e0Var != null) {
            this.e.o(w4e0Var);
        }
    }

    public final w4e0 b(DrivingRoute drivingRoute) {
        w4e0 w4e0Var = this.g;
        xm00 xm00Var = this.e;
        if (w4e0Var != null) {
            xm00Var.o(w4e0Var);
        }
        w4e0 s = xm00Var.s(drivingRoute.getGeometry());
        this.c.getClass();
        boolean a = leh.a(this.d);
        b2l0 b2l0Var = this.a;
        if (a) {
            b2l0Var.a(s);
            s.x(drivingRoute);
        } else {
            ((bf60) b2l0Var.a.getValue()).a(s);
        }
        this.g = s;
        s.k(5.0f);
        s.i(((Boolean) this.f.getValue(this, l[0])).booleanValue());
        return s;
    }
}
