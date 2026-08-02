package defpackage;

import com.yandex.go.address.models.PlainAddress;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.Map;
import defpackage.jl40;
import defpackage.tje;
import defpackage.ugp;
import defpackage.uj00;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class tj00 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj00 b;

    public /* synthetic */ tj00(uj00 uj00Var, int i) {
        this.a = i;
        this.b = uj00Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final uj00 uj00Var = this.b;
        qi80 qi80Var = null;
        switch (i) {
            case 0:
                Point point = (Point) obj;
                ((oj00) uj00Var.n()).a.invoke();
                ((uo21) uj00Var.H.get()).detach();
                Map map = uj00Var.U;
                if (map != null) {
                    map.deselectGeoObject();
                }
                uj00Var.Q.l(null);
                uj00Var.B((m950) uj00Var.I.get(), point, new qj00(uj00Var, null), new n1j0(uj00Var));
                return zy11Var;
            case 1:
                ugp ugpVar = (ugp) obj;
                Map map2 = uj00Var.U;
                if (map2 != null) {
                    map2.deselectGeoObject();
                }
                if (ugpVar instanceof tgp) {
                    tgp tgpVar = (tgp) ugpVar;
                    ((oj00) uj00Var.n()).a.invoke();
                    uj00Var.B((m950) uj00Var.P.get(), new ct6(tgpVar.B(), tgpVar.a().q()), new qj00(uj00Var, new g700(4, uj00Var, tgpVar)), new n1j0(uj00Var));
                    return zy11Var;
                }
                if (!(ugpVar instanceof qgp)) {
                    w511.b();
                    return null;
                }
                final qgp qgpVar = (qgp) ugpVar;
                String str = qgpVar.a;
                if (str != null && !evu0.J(str)) {
                    qi80Var = new qi80(str, null);
                }
                if (qi80Var == null) {
                    return zy11Var;
                }
                uj00Var.P(dpa1.c(PlainAddress.Companion, qgpVar.b, qgpVar.c), qi80Var, eg80.b, new sls() { // from class: com.yandex.go.navigator.map_interactions.a
                    @Override // defpackage.sls
                    public final Object invoke() {
                        Object value;
                        ugp ugpVar2;
                        uj00 uj00Var2 = uj00.this;
                        r0 r0Var = (r0) uj00Var2.Q.a;
                        do {
                            value = r0Var.getValue();
                            ugpVar2 = (ugp) value;
                            if (jl40.l(ugpVar2, qgpVar)) {
                                ugpVar2 = null;
                            }
                        } while (!r0Var.k(value, ugpVar2));
                        tje.N(uj00Var2.o(), null, null, new MapInteractionsRouter$refreshFavoriteOrganizations$1(uj00Var2, null), 3);
                        return zy11.a;
                    }
                });
                return zy11Var;
            default:
                y290 y290Var = (y290) obj;
                ((oj00) uj00Var.n()).a.invoke();
                Map map3 = uj00Var.U;
                if (map3 != null) {
                    map3.deselectGeoObject();
                }
                uj00Var.L.b(new k200(8, y290Var), true);
                uj00Var.Q.l(null);
                uj00Var.B((m950) uj00Var.G.get(), y290Var, new wui(uj00Var, 23), new n1j0(uj00Var));
                return zy11Var;
        }
    }
}
