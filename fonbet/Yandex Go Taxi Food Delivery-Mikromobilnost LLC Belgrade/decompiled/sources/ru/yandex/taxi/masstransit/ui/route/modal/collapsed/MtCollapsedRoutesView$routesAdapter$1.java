package ru.yandex.taxi.masstransit.ui.route.modal.collapsed;

import defpackage.b611;
import defpackage.c040;
import defpackage.jl40;
import defpackage.py30;
import defpackage.sk91;
import defpackage.smw0;
import defpackage.su30;
import defpackage.tls;
import defpackage.vx30;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardOpenReason;
import ru.yandex.taxi.masstransit.datasource.routing.f;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class MtCollapsedRoutesView$routesAdapter$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object obj2;
        c040 c040Var = (c040) obj;
        d dVar = (d) this.receiver;
        f fVar = dVar.A.a;
        String str = c040Var.e.e;
        if (str == null) {
            str = "";
        }
        r0 r0Var = fVar.i;
        su30 su30Var = ((py30) r0Var.getValue()).b;
        if (jl40.l(su30Var != null ? su30Var.e : null, str)) {
            dVar.Mg(c040Var.e, MtDetailRouteCardOpenReason.SELECTOR_TAP);
            MtRoutesModalView mtRoutesModalView = ((vx30) dVar.x.a).U;
            if (mtRoutesModalView != null) {
                mtRoutesModalView.expand();
            }
        } else {
            while (true) {
                Object value = r0Var.getValue();
                py30 py30Var = (py30) value;
                su30 su30Var2 = py30Var.b;
                List list = py30Var.a;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jl40.l(((su30) obj2).e, str)) {
                        break;
                    }
                }
                su30 su30Var3 = (su30) obj2;
                if (su30Var3 == null) {
                    su30Var3 = (su30) kotlin.collections.a.R(list);
                }
                b611 b611Var = fVar.d.a;
                Integer valueOf = su30Var2 != null ? Integer.valueOf(su30Var2.c.a) : null;
                Integer valueOf2 = su30Var2 != null ? Integer.valueOf(su30Var2.d.a) : null;
                String str2 = su30Var2 != null ? su30Var2.e : null;
                Boolean valueOf3 = su30Var2 != null ? Boolean.valueOf(sk91.a(su30Var2)) : null;
                Integer valueOf4 = su30Var3 != null ? Integer.valueOf(su30Var3.c.a) : null;
                Integer valueOf5 = su30Var3 != null ? Integer.valueOf(su30Var3.d.a) : null;
                String str3 = su30Var3 != null ? su30Var3.e : null;
                Boolean valueOf6 = su30Var3 != null ? Boolean.valueOf(sk91.a(su30Var3)) : null;
                HashMap o = smw0.o(b611Var);
                f fVar2 = fVar;
                if (valueOf != null) {
                    o.put("before_time", valueOf);
                }
                if (valueOf2 != null) {
                    o.put("before_time_on_foot", valueOf2);
                }
                if (str2 != null) {
                    o.put("before_route_id", str2);
                }
                if (valueOf3 != null) {
                    o.put("before_is_only_walking_route", valueOf3);
                }
                if (valueOf4 != null) {
                    o.put("after_time", valueOf4);
                }
                if (valueOf5 != null) {
                    o.put("after_time_on_foot", valueOf5);
                }
                if (str3 != null) {
                    o.put("after_route_id", str3);
                }
                if (valueOf6 != null) {
                    o.put("after_is_only_walking_route", valueOf6);
                }
                b611Var.a.a("TransportRoute.Selection", o, 1, new HashMap());
                if (r0Var.k(value, py30.a(py30Var, su30Var3, null, HProv.PP_DELETE_KEYSET))) {
                    break;
                }
                fVar = fVar2;
            }
        }
        return zy11.a;
    }
}
