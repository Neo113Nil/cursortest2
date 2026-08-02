package defpackage;

import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.superapp.order_tracking.api.data.OrderTrackingService$Taxi;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class x0y0 {
    public final y5w0 a;
    public final xu70 b;
    public final g c;

    public x0y0(y5w0 y5w0Var, xu70 xu70Var, g gVar) {
        this.a = y5w0Var;
        this.b = xu70Var;
        this.c = gVar;
    }

    public final u4y0 a() {
        o2y0 o2y0Var;
        if (((a6w0) this.a).c().a() != OrderTrackingService$Taxi.PreferredTrackingType.FEED || (o2y0Var = (o2y0) a.b0(this.c.a().a)) == null) {
            return null;
        }
        return new u4y0(o2y0Var.b().b.g0, o2y0Var.b().l.getY(), o2y0Var.b().a, o2y0Var.d());
    }

    public final boolean b(String str) {
        if (str == null || ((a6w0) this.a).c().a() != OrderTrackingService$Taxi.PreferredTrackingType.FEED) {
            return false;
        }
        return this.b.a.a().getB();
    }
}
