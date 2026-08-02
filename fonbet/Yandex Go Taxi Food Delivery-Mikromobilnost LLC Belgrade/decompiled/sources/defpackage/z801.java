package defpackage;

import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.traffic.TrafficLayer;

/* loaded from: classes7.dex */
public final class z801 extends k45 {
    public final y801 b;
    public final eu00 c;

    public z801(ssr ssrVar, y801 y801Var, eu00 eu00Var) {
        super(ssrVar, "traffic_layer");
        this.b = y801Var;
        this.c = eu00Var;
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        boolean l = jl40.l(str, "initTrafficLayer");
        y801 y801Var = this.b;
        if (l) {
            if (!y801Var.a()) {
                y801Var.a = MapKitFactory.getInstance().createTrafficLayer(((au00) this.c.a).getMapWindow());
            }
            ((ba20) da20Var).success(null);
        } else {
            if (!jl40.l(str, "setTrafficVisible")) {
                ((ba20) da20Var).notImplemented();
                return;
            }
            ((TrafficLayer) y801Var.a).setTrafficVisible(((Boolean) x920Var.b).booleanValue());
            ((ba20) da20Var).success(null);
        }
    }
}
