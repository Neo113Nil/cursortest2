package ru.yandex.taxi.masstransit.ui.route.modal.expanded;

import defpackage.e0o;
import defpackage.eay0;
import defpackage.hj5;
import defpackage.i0o;
import defpackage.jar;
import defpackage.jr1;
import defpackage.jt01;
import defpackage.kd01;
import defpackage.liu0;
import defpackage.lj30;
import defpackage.m1j;
import defpackage.m911;
import defpackage.nra0;
import defpackage.oj5;
import defpackage.pj5;
import defpackage.sn4;
import defpackage.su30;
import defpackage.tls;
import defpackage.ux11;
import defpackage.v4r0;
import defpackage.vs01;
import defpackage.w511;
import defpackage.wtb1;
import defpackage.xpw;
import defpackage.xyy0;
import defpackage.yi5;
import defpackage.yw30;
import defpackage.yx11;
import defpackage.zj5;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardTappedButtonV2;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class MtExpandedRoutesView$adapter$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object value;
        Set set;
        int i;
        boolean contains;
        m1j m1jVar = (m1j) obj;
        lj30 lj30Var = (lj30) this.receiver;
        lj30Var.getClass();
        if (!(m1jVar instanceof jr1) && !(m1jVar instanceof hj5) && !(m1jVar instanceof i0o) && !(m1jVar instanceof jar) && !(m1jVar instanceof xpw) && !(m1jVar instanceof nra0) && !(m1jVar instanceof oj5) && !(m1jVar instanceof e0o) && !(m1jVar instanceof vs01) && !(m1jVar instanceof jt01) && !(m1jVar instanceof ux11) && !(m1jVar instanceof yi5) && !(m1jVar instanceof pj5) && !(m1jVar instanceof sn4) && !(m1jVar instanceof kd01) && !(m1jVar instanceof zj5) && !(m1jVar instanceof yx11) && !(m1jVar instanceof xyy0) && !(m1jVar instanceof m911)) {
            if (m1jVar instanceof liu0) {
                r0 r0Var = lj30Var.J;
                do {
                    value = r0Var.getValue();
                    set = (Set) value;
                    i = ((liu0) m1jVar).d;
                    contains = set.contains(Integer.valueOf(i));
                    yw30 yw30Var = lj30Var.B;
                    TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV2 = contains ? TransportRouteAnalytics$DetailCardTappedButtonV2.TransportStopsCollapse : TransportRouteAnalytics$DetailCardTappedButtonV2.TransportStopsExpand;
                    TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
                    TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                    su30 d = lj30Var.A.d();
                    yw30Var.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, d != null ? wtb1.d(d.a) : EmptyList.a, null);
                } while (!r0Var.k(value, contains ? v4r0.f(set, Integer.valueOf(i)) : v4r0.i(set, Integer.valueOf(i))));
            } else if (!(m1jVar instanceof eay0)) {
                w511.b();
                return null;
            }
        }
        return zy11.a;
    }
}
