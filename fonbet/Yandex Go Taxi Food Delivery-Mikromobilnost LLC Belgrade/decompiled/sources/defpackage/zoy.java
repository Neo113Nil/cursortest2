package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class zoy extends uhs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zoy(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void c() {
    }

    private final void f() {
    }

    @Override // defpackage.nlm
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.uhs0
    public final void b(DrivingRoute drivingRoute) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cpy cpyVar = (cpy) obj;
                cpyVar.i = new PolylinePosition();
                ((plm) cpyVar.c).a(new nol0(drivingRoute));
                break;
            default:
                bmp0 bmp0Var = (bmp0) obj;
                Polyline geometry = drivingRoute.getGeometry();
                w4e0 w4e0Var = bmp0Var.d;
                if (w4e0Var == null) {
                    bmp0Var.d = bmp0Var.a.s(geometry);
                } else {
                    w4e0Var.o(geometry);
                }
                w4e0 w4e0Var2 = bmp0Var.d;
                if (w4e0Var2 != null) {
                    bmp0Var.c.a(w4e0Var2);
                    w4e0Var2.x(drivingRoute);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.nlm
    public final void d(IOException iOException) {
        switch (this.a) {
            case 0:
                jst.e.k(iOException, "Error retrieving driving route for LinkedOrderRouteProgressTracker");
                break;
            default:
                jst.e.r("Error retrieving self-driving route for SdcRouteOverlay", iOException);
                break;
        }
    }
}
