package defpackage;

import com.yandex.go.taxi.order.map.overlay.c0;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;
import kotlin.Pair;

/* loaded from: classes14.dex */
public final /* synthetic */ class v080 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ v080(c0 c0Var, int i) {
        this.a = i;
        this.b = c0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        c0 c0Var = this.b;
        switch (i) {
            case 0:
                Boolean valueOf = Boolean.valueOf(((yz70) obj).t != null);
                MapRouteParametersDto o = c0Var.A.b().o();
                return new Pair(valueOf, o != null ? o.c : null);
            default:
                c0Var.y0.f(new fs70(19), "updateWalkRoute");
                ((u080) c0Var.Dg()).ia();
                return zy11.a;
        }
    }
}
