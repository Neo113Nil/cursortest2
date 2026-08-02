package defpackage;

import android.view.View;
import androidx.compose.ui.semantics.f;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;
import com.yandex.mapkit.road_events.EventTag;
import jason.statham.tools.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.masstransit.domain.f0;
import ru.yandex.taxi.masstransit.router.h;
import ru.yandex.taxi.masstransit.router.j;
import ru.yandex.taxi.masstransit.tickets.c;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final /* synthetic */ class t130 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t130(rm40 rm40Var, gy40 gy40Var, ckq0 ckq0Var) {
        this.a = 19;
        this.c = gy40Var;
        this.b = ckq0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        bx20 bx20Var;
        bx20 bx20Var2;
        int i = this.a;
        int i2 = 19;
        int i3 = 5;
        final int i4 = 2;
        final int i5 = 0;
        final int i6 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                a230 a230Var = (a230) obj3;
                ModalView modalView = (ModalView) obj2;
                t1w t1wVar = (t1w) obj;
                View view = (View) a230Var.b.invoke();
                if (view == null) {
                    view = modalView.contentViewInternal();
                }
                view.setPadding(view.getPaddingLeft(), ((Number) a230Var.d.getValue()).intValue() + t1wVar.b, view.getPaddingRight(), view.getPaddingBottom());
                View view2 = (View) a230Var.c.invoke();
                if (view2 != null) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), !t1wVar.f ? ((Number) a230Var.e.getValue()).intValue() + t1wVar.g : view2.getPaddingBottom());
                }
                return zy11Var;
            case 1:
                y130 y130Var = (y130) obj3;
                ModalView modalView2 = (ModalView) obj2;
                t1w t1wVar2 = (t1w) obj;
                View view3 = (View) y130Var.c.invoke();
                if (view3 == null) {
                    view3 = modalView2.contentViewInternal();
                }
                view3.setPadding(view3.getPaddingLeft(), ((Number) y130Var.d.getValue()).intValue() + t1wVar2.b, view3.getPaddingRight(), (y130Var.a || !t1wVar2.f) ? ((Number) y130Var.e.getValue()).intValue() + t1wVar2.g : view3.getPaddingBottom());
                return zy11Var;
            case 2:
                n70 n70Var = (n70) obj;
                n70Var.W(new ynn(26, (fx3) obj3, n70Var, (tls) obj2));
                return zy11Var;
            case 3:
                Map.Entry entry = (Map.Entry) obj3;
                d6x d6xVar = (d6x) obj;
                r5x q = eja1.q(scc.g((String) obj2, (String) entry.getKey()));
                Map i7 = b.i(new Pair("send-to-backend", "*"), new Pair("sync-with-divkit", "*"));
                LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(i7.size()));
                for (Map.Entry entry2 : i7.entrySet()) {
                    linkedHashMap.put(entry2.getKey(), sb2.P(entry2.getValue()));
                }
                return a.d(d6xVar, q, jx81.M((String) entry.getValue()), new s6x(linkedHashMap));
            case 4:
                ((ru.yandex.taxi.masstransit.geopayment.linkcard.a) obj3).c((String) obj, (in30) obj2);
                return zy11Var;
            case 5:
                y50 q1 = ((c0g) ((i3g) ((kv1) obj3).g).a).q1();
                q5z.h(q1);
                ((a60) q1).c((String) obj2, v770.c);
                ((cp30) obj).a();
                return zy11Var;
            case 6:
                h hVar = (h) obj2;
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = ((f0) obj3).b();
                agd agdVar = (agd) yfdVar;
                agdVar.e = new j(hVar, i4);
                agdVar.g = new androidx.compose.runtime.internal.a(-2055170108, new l0(i2, yfdVar, hVar), true);
                return zy11Var;
            case 7:
                g140 g140Var = (g140) obj3;
                List list = g140Var.b;
                ((m6y) ((u6y) obj)).f(list.size(), null, new qc0(list, i2), new androidx.compose.runtime.internal.a(2039820996, new yc0(list, (tls) obj2, 4, g140Var), true));
                return zy11Var;
            case 8:
                w211 w211Var = (w211) obj2;
                ep30 ep30Var = (ep30) obj;
                c4l0 c4l0Var = new c4l0((String) obj3, w211Var.a, w211Var.b);
                b2w b2wVar = ep30Var.a.G;
                if (b2wVar != null) {
                    b2wVar.a.l(new j140(ep30Var.b, c4l0Var));
                }
                return zy11Var;
            case 9:
                List list2 = ((k340) obj3).b;
                ((m6y) ((u6y) obj)).f(list2.size(), null, new qc0(list2, 20), new androidx.compose.runtime.internal.a(2039820996, new zx8(list2, (tls) obj2, i3), true));
                return zy11Var;
            case 10:
                yfd yfdVar2 = (yfd) obj2;
                int intValue = ((Integer) obj).intValue();
                if (gtq0.u((x540) obj3) && (bx20Var = ((w540) ((agd) yfdVar2).a).b) != null) {
                    bx20Var.update(intValue);
                }
                return zy11Var;
            case 11:
                czy0 czy0Var = (czy0) obj3;
                List list3 = czy0Var.a.b;
                ((m6y) ((u6y) obj)).f(list3.size(), null, new qc0(list3, 22), new androidx.compose.runtime.internal.a(2039820996, new yc0(list3, (tls) obj2, i3, czy0Var), true));
                return zy11Var;
            case 12:
                yfd yfdVar3 = (yfd) obj2;
                int intValue2 = ((Integer) obj).intValue();
                if (gtq0.u((p640) obj3) && (bx20Var2 = ((o640) ((agd) yfdVar3).a).c) != null) {
                    bx20Var2.update(intValue2);
                }
                return zy11Var;
            case 13:
                tls tlsVar = (tls) obj2;
                String str = ((k940) ((m940) obj3)).a;
                if (str != null) {
                    tlsVar.invoke(new d940(str));
                }
                return zy11Var;
            case 14:
                m1a0 m1a0Var = (m1a0) obj3;
                CompositePaymentIconsView compositePaymentIconsView = (CompositePaymentIconsView) obj;
                compositePaymentIconsView.setTitleVisible(false);
                CompositePaymentIconsView.update$default(compositePaymentIconsView, m1a0Var, ((c) obj2).b, true, null, 8, null);
                return zy11Var;
            case 15:
                n12 n12Var = (n12) ((uk10) obj2).a;
                v840 v840Var = (v840) obj;
                ((w840) ((n12) obj3).J).getClass();
                int i8 = 9;
                if (jl40.l(v840Var, t840.a)) {
                    n12Var.r(new qu(i8));
                } else {
                    if (!jl40.l(v840Var, u840.a)) {
                        w511.b();
                        return null;
                    }
                    n12Var.r(new qu(i8));
                }
                return zy11Var;
            case 16:
                ((za40) obj).C((CharSequence) obj2, (String) obj3);
                return zy11Var;
            case 17:
                final ud40 ud40Var = (ud40) obj3;
                final tls tlsVar2 = (tls) obj2;
                u6y u6yVar = (u6y) obj;
                u6y.b(u6yVar, null, new androidx.compose.runtime.internal.a(1308040215, new zls() { // from class: bd40
                    @Override // defpackage.zls
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i9 = i5;
                        zy11 zy11Var2 = zy11.a;
                        tls tlsVar3 = tlsVar2;
                        ud40 ud40Var2 = ud40Var;
                        fid fidVar = (fid) obj5;
                        int intValue3 = ((Integer) obj6).intValue();
                        switch (i9) {
                            case 0:
                                bts btsVar = (bts) fidVar;
                                if (!btsVar.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    btsVar.Y();
                                    break;
                                } else {
                                    ed40.J(ud40Var2.c, ud40Var2.d, tlsVar3, btsVar, 0);
                                    break;
                                }
                            case 1:
                                bts btsVar2 = (bts) fidVar;
                                if (!btsVar2.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    ed40.E(ud40Var2.e, tlsVar3, btsVar2, 0);
                                    break;
                                }
                            default:
                                bts btsVar3 = (bts) fidVar;
                                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    ed40.n(ud40Var2.e, tlsVar3, btsVar3, 0);
                                    break;
                                }
                        }
                        return zy11Var2;
                    }
                }, true), 3);
                if (jl40.l(ud40Var.e.c, Boolean.TRUE)) {
                    u6y.b(u6yVar, null, new androidx.compose.runtime.internal.a(1731888284, new zls() { // from class: bd40
                        @Override // defpackage.zls
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i9 = i6;
                            zy11 zy11Var2 = zy11.a;
                            tls tlsVar3 = tlsVar2;
                            ud40 ud40Var2 = ud40Var;
                            fid fidVar = (fid) obj5;
                            int intValue3 = ((Integer) obj6).intValue();
                            switch (i9) {
                                case 0:
                                    bts btsVar = (bts) fidVar;
                                    if (!btsVar.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        btsVar.Y();
                                        break;
                                    } else {
                                        ed40.J(ud40Var2.c, ud40Var2.d, tlsVar3, btsVar, 0);
                                        break;
                                    }
                                case 1:
                                    bts btsVar2 = (bts) fidVar;
                                    if (!btsVar2.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        btsVar2.Y();
                                        break;
                                    } else {
                                        ed40.E(ud40Var2.e, tlsVar3, btsVar2, 0);
                                        break;
                                    }
                                default:
                                    bts btsVar3 = (bts) fidVar;
                                    if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        ed40.n(ud40Var2.e, tlsVar3, btsVar3, 0);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, true), 3);
                }
                u6y.b(u6yVar, null, new androidx.compose.runtime.internal.a(-796967872, new zls() { // from class: bd40
                    @Override // defpackage.zls
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i9 = i4;
                        zy11 zy11Var2 = zy11.a;
                        tls tlsVar3 = tlsVar2;
                        ud40 ud40Var2 = ud40Var;
                        fid fidVar = (fid) obj5;
                        int intValue3 = ((Integer) obj6).intValue();
                        switch (i9) {
                            case 0:
                                bts btsVar = (bts) fidVar;
                                if (!btsVar.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    btsVar.Y();
                                    break;
                                } else {
                                    ed40.J(ud40Var2.c, ud40Var2.d, tlsVar3, btsVar, 0);
                                    break;
                                }
                            case 1:
                                bts btsVar2 = (bts) fidVar;
                                if (!btsVar2.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    ed40.E(ud40Var2.e, tlsVar3, btsVar2, 0);
                                    break;
                                }
                            default:
                                bts btsVar3 = (bts) fidVar;
                                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    ed40.n(ud40Var2.e, tlsVar3, btsVar3, 0);
                                    break;
                                }
                        }
                        return zy11Var2;
                    }
                }, true), 3);
                return zy11Var;
            case 18:
                ((ru.yandex.taxi.masstransit.trains.checkout.h) ((rh40) obj)).n1((String) obj3, (ph40) obj2);
                return zy11Var;
            case 19:
                dfq0 dfq0Var = (dfq0) obj;
                rm40.m((gy40) obj3, (ckq0) obj2, dfq0Var, 0, dfq0Var.f.a.a.b.length());
                return zy11Var;
            case 20:
                ((xm40) obj3).e((ioq0) obj2, obj);
                return zy11Var;
            case 21:
                xm40 xm40Var = (xm40) obj2;
                if (((Set) obj3).contains(obj)) {
                    hz40 hz40Var = xm40Var.b;
                    iz40 iz40Var = xm40Var.d;
                    Object d = hz40Var.d(obj);
                    if (d != null) {
                        if (d instanceof iz40) {
                            iz40 iz40Var2 = (iz40) d;
                            Object[] objArr = iz40Var2.b;
                            long[] jArr = iz40Var2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i9 = 0;
                                while (true) {
                                    long j = jArr[i9];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            if ((255 & j) < 128) {
                                                iz40Var.a((ioq0) objArr[(i9 << 3) + i11]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i10 != 8) {
                                        }
                                    }
                                    if (i9 != length) {
                                        i9++;
                                    }
                                }
                            }
                        } else {
                            iz40Var.a((ioq0) d);
                        }
                    }
                }
                return zy11Var;
            case 22:
                mnq0 mnq0Var = (mnq0) obj;
                f.l(mnq0Var, (String) obj3);
                f.p(mnq0Var, 1);
                f.q(mnq0Var, ((pn40) obj2).a);
                return zy11Var;
            case 23:
                return new mn40((ListItemComponent) obj, (pav) obj3, (wls) obj2);
            case 24:
                xfd xfdVar = (xfd) obj3;
                ks40 ks40Var = (ks40) obj2;
                kt40 kt40Var = (kt40) obj;
                if (jl40.l(kt40Var, it40.a)) {
                    ((bgd) xfdVar).a.invoke(new os40());
                } else {
                    if (!jl40.l(kt40Var, jt40.a)) {
                        w511.b();
                        return null;
                    }
                    ks40Var.Z.p.g(zy11Var);
                }
                return zy11Var;
            case 25:
                nu40 nu40Var = (nu40) obj3;
                nu40Var.a.r(new t130(25, nu40Var, (String) obj2));
                return zy11Var;
            case 26:
                return new te4(12, (wg6) obj3, (mx40) obj2);
            case 27:
                g350 g350Var = (g350) obj3;
                tis0 tis0Var = (tis0) obj2;
                Object value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    ((pep0) g350Var.y).f((m950) g350Var.v.get(), (mip) tis0Var.w, hxx.a);
                }
                return zy11Var;
            case 28:
                com.yandex.go.navigator.ui.b bVar = (com.yandex.go.navigator.ui.b) obj3;
                NavigationLayer navigationLayer = (NavigationLayer) obj;
                navigationLayer.set2DMode(true);
                navigationLayer.getCamera().setAutoZoom(false, com.yandex.go.navigator.ui.b.L);
                navigationLayer.getCamera().setSwitchModesAutomatically(false);
                navigationLayer.addBalloonViewListener(bVar.J);
                com.yandex.go.navigator.ui.b bVar2 = ((ad50) obj2).b;
                NavigationLayer navigationLayer2 = bVar2.I;
                zc50 zc50Var = bVar2.J;
                if (navigationLayer2 != null) {
                    navigationLayer2.removeBalloonViewListener(zc50Var);
                }
                NavigationLayer navigationLayer3 = bVar2.I;
                if (navigationLayer3 != null) {
                    navigationLayer3.addBalloonViewListener(zc50Var);
                }
                navigationLayer.addPlacemarkTapListener(bVar.F);
                navigationLayer.setRoadEventVisibleOnRoute(EventTag.POLICE, true);
                navigationLayer.setRoadEventVisibleOnRoute(EventTag.MOBILE_CONTROL, true);
                navigationLayer.setRoadEventVisibleOnRoute(EventTag.SPEED_CONTROL, true);
                navigationLayer.setRoadEventVisibleOnRoute(EventTag.LANE_CONTROL, true);
                navigationLayer.setRoadEventVisibleOnRoute(EventTag.ROAD_MARKING_CONTROL, true);
                navigationLayer.setRoadEventVisibleOnRoute(EventTag.CROSS_ROAD_CONTROL, true);
                navigationLayer.setRoadEventVisibleOnRoute(EventTag.NO_STOPPING_CONTROL, true);
                navigationLayer.setRoadEventVisibleOnRoute(EventTag.ACCIDENT, true);
                navigationLayer.setRoadEventVisibleOnRoute(EventTag.RECONSTRUCTION, true);
                navigationLayer.setRoadEventVisibleOnRoute(EventTag.CLOSED, true);
                bVar.I = navigationLayer;
                bVar.C.a(navigationLayer);
                return zy11Var;
            default:
                return new com.yandex.go.scooters.qr.unavailable_scooter.ui.c((ListItemComponent) obj, (tls) obj3, (e) obj2);
        }
    }

    public /* synthetic */ t130(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
