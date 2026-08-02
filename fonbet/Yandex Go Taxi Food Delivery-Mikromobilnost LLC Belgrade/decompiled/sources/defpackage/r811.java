package defpackage;

import com.yandex.mapkit.navigation.transport.layer.NavigationLayer;

/* loaded from: classes7.dex */
public final class r811 extends q35 {
    public final ini0 c;
    public final h311 d;
    public q811 e;

    public r811(ssr ssrVar, ini0 ini0Var, h311 h311Var) {
        super(ssrVar, "transport_route_view_listener");
        this.c = ini0Var;
        this.d = h311Var;
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        q811 q811Var = this.e;
        if (q811Var != null) {
            ((NavigationLayer) this.d.a).removeRouteListener(q811Var);
            this.e = null;
        }
    }

    @Override // defpackage.q35
    public final void b(Object obj) {
        q811 q811Var = new q811(this);
        ((NavigationLayer) this.d.a).addRouteListener(q811Var);
        this.e = q811Var;
    }
}
