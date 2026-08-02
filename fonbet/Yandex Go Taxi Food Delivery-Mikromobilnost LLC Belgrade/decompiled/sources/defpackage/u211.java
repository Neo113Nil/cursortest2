package defpackage;

import com.yandex.mapkit.navigation.transport.GuidanceListener;
import com.yandex.mapkit.navigation.transport.RouteChangeReason;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class u211 implements GuidanceListener {
    public final /* synthetic */ v211 a;

    public u211(v211 v211Var) {
        this.a = v211Var;
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onCurrentRouteChanged(RouteChangeReason routeChangeReason) {
        this.a.c(new pv01(2, routeChangeReason));
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onCurrentRouteFinished() {
        yeo yeoVar;
        v211 v211Var = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onCurrentRouteFinished"));
            if ((e instanceof zy11) || (yeoVar = v211Var.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = v211Var.b;
            if (yeoVar2 != null) {
                yeoVar2.error(v211.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onCurrentRouteLost() {
        yeo yeoVar;
        v211 v211Var = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onCurrentRouteLost"));
            if ((e instanceof zy11) || (yeoVar = v211Var.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = v211Var.b;
            if (yeoVar2 != null) {
                yeoVar2.error(v211.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onGuidanceModeChanged() {
        yeo yeoVar;
        v211 v211Var = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onGuidanceModeChanged"));
            if ((e instanceof zy11) || (yeoVar = v211Var.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = v211Var.b;
            if (yeoVar2 != null) {
                yeoVar2.error(v211.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onLocationChanged() {
        v211 v211Var = this.a;
        try {
            v211Var.e.a(new t211(v211Var, this, 0), false);
        } catch (Throwable th) {
            yeo yeoVar = v211Var.b;
            if (yeoVar != null) {
                yeoVar.error(v211Var.getClass().getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onReachedRequestPoint() {
        yeo yeoVar;
        v211 v211Var = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onReachedRequestPoint"));
            if ((e instanceof zy11) || (yeoVar = v211Var.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = v211Var.b;
            if (yeoVar2 != null) {
                yeoVar2.error(v211.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onReturnedToRoute() {
        yeo yeoVar;
        v211 v211Var = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onReturnedToRoute"));
            if ((e instanceof zy11) || (yeoVar = v211Var.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = v211Var.b;
            if (yeoVar2 != null) {
                yeoVar2.error(v211.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.GuidanceListener
    public final void onVehicleDetection(int i, String str) {
        yeo yeoVar;
        v211 v211Var = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onTransportThreadChanged"));
            if ((e instanceof zy11) || (yeoVar = v211Var.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = v211Var.b;
            if (yeoVar2 != null) {
                yeoVar2.error(v211.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }
}
