package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.masstransit.overlay.routes.a;

/* loaded from: classes6.dex */
public final class xx30 implements yx30 {
    public final /* synthetic */ a a;

    public xx30(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.yx30
    public final void U7() {
        a aVar = this.a;
        if (aVar.k || !aVar.l) {
            return;
        }
        aVar.b();
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        dy30 dy30Var = (dy30) obj;
        a aVar = this.a;
        i3y i3yVar = aVar.h;
        aVar.j = dy30Var;
        if (!(dy30Var instanceof by30)) {
            if (!(dy30Var instanceof cy30)) {
                w511.b();
                return;
            }
            cy30 cy30Var = (cy30) dy30Var;
            w4e0 w4e0Var = aVar.i;
            if (w4e0Var != null) {
                w4e0Var.i(false);
            }
            ((fw30) i3yVar.getValue()).d(cy30Var.a, cy30Var.b, cy30Var.c, new q6s0(true, true), null);
            if (aVar.l) {
                aVar.b();
                return;
            }
            return;
        }
        by30 by30Var = (by30) dy30Var;
        ((fw30) i3yVar.getValue()).d(by30Var.a, by30Var.b, EmptyList.a, new q6s0(true, true), null);
        DrivingRoute drivingRoute = by30Var.c;
        if (drivingRoute != null) {
            w4e0 w4e0Var2 = aVar.i;
            if (w4e0Var2 != null) {
                w4e0Var2.o(drivingRoute.getGeometry());
            } else {
                aVar.i = ((xm00) aVar.g.getValue()).s(drivingRoute.getGeometry());
            }
            w4e0 w4e0Var3 = aVar.i;
            if (w4e0Var3 != null) {
                ((bf60) aVar.c.a.getValue()).a(w4e0Var3);
            }
        }
        w4e0 w4e0Var4 = aVar.i;
        if (w4e0Var4 != null) {
            w4e0Var4.i(true);
        }
        if (aVar.l) {
            aVar.b();
        }
    }

    @Override // defpackage.yx30
    public final void w0(boolean z) {
        if (z) {
            this.a.e.attach();
        }
    }
}
