package ru.yandex.taxi.masstransit.detailedroute.ui;

import defpackage.bf30;
import defpackage.e0o;
import defpackage.eay0;
import defpackage.hj5;
import defpackage.i0o;
import defpackage.jar;
import defpackage.jr1;
import defpackage.jt01;
import defpackage.kd01;
import defpackage.liu0;
import defpackage.m1j;
import defpackage.m911;
import defpackage.nra0;
import defpackage.oj5;
import defpackage.pj5;
import defpackage.sn4;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardTappedButtonV2;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class MtDetailedRouteModalView$routeAdapter$1 extends FunctionReferenceImpl implements tls {
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0060  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object value;
        Set set;
        int i;
        boolean contains;
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource;
        int i2;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType;
        m1j m1jVar = (m1j) obj;
        c cVar = (c) this.receiver;
        if (m1jVar instanceof xyy0) {
            cVar.y.c(((xyy0) m1jVar).b);
        } else if (m1jVar instanceof liu0) {
            r0 r0Var = cVar.K;
            do {
                value = r0Var.getValue();
                set = (Set) value;
                i = ((liu0) m1jVar).d;
                contains = set.contains(Integer.valueOf(i));
                yw30 yw30Var = cVar.C;
                TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV2 = contains ? TransportRouteAnalytics$DetailCardTappedButtonV2.TransportStopsCollapse : TransportRouteAnalytics$DetailCardTappedButtonV2.TransportStopsExpand;
                MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = cVar.z;
                int i3 = mtDetailedRouteAnalyticSource == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Hub;
                        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = cVar.A;
                        i2 = mtDetailedRouteAnalyticType != null ? -1 : bf30.b[mtDetailedRouteAnalyticType.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1) {
                                transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Vertical;
                                yw30Var.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(cVar.x.a), null);
                            } else if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                        }
                        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                        yw30Var.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(cVar.x.a), null);
                    } else if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                }
                transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
                MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType2 = cVar.A;
                if (mtDetailedRouteAnalyticType2 != null) {
                }
                if (i2 != -1) {
                }
                transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                yw30Var.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(cVar.x.a), null);
            } while (!r0Var.k(value, contains ? v4r0.f(set, Integer.valueOf(i)) : v4r0.i(set, Integer.valueOf(i))));
        } else {
            cVar.getClass();
            if (!(m1jVar instanceof jr1) && !(m1jVar instanceof yi5) && !(m1jVar instanceof hj5) && !(m1jVar instanceof pj5) && !(m1jVar instanceof sn4) && !(m1jVar instanceof kd01) && !(m1jVar instanceof zj5) && !(m1jVar instanceof i0o) && !(m1jVar instanceof jar) && !(m1jVar instanceof xpw) && !(m1jVar instanceof nra0) && !(m1jVar instanceof oj5) && !(m1jVar instanceof e0o) && !(m1jVar instanceof vs01) && !(m1jVar instanceof jt01) && !(m1jVar instanceof m911) && !(m1jVar instanceof ux11) && !(m1jVar instanceof yx11) && !(m1jVar instanceof eay0)) {
                w511.b();
                return null;
            }
        }
        return zy11.a;
    }
}
