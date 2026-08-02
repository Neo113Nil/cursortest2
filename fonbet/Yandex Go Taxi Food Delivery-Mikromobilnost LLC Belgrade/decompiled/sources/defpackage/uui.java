package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.coroutines.g;
import com.yandex.go.navigator.domain.FocusMode;
import com.yandex.go.navigator.driving.SearchSourceType;
import com.yandex.go.navigator.driving.f;
import com.yandex.go.navigator.gas_stations.pins_layer.h;
import com.yandex.go.route.interactor.b;
import com.yandex.go.suggest.impl.presenter.c;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import com.yandex.go.superapp.impl.presenter_delegate.d;
import com.yandex.go.tariffcard.common.CardType;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.models.api.response.TipsVariant;
import com.yandex.go.zone.model.Zone;
import com.yandex.mapkit.search.Session;
import com.yandex.messaging.internal.gif.GifDrawable;
import com.yandex.quark.webchat.filechooser.FileChooserDialog;
import com.ybsdk.feature.status.screen.internal.ui.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.experiment.NextButtonShowStrategy;
import ru.yandex.taxi.address.experiment.e;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.DotsIndicatorComponent;
import ru.yandex.taxi.fragment.favorites.list.FavoritesFragment;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.summary.tariffpage.TariffPagerView;

/* loaded from: classes5.dex */
public final class uui implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uui(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x0ddb, code lost:
    
        if (r1.isActive() == true) goto L202;
     */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        boolean z;
        Object value;
        ArrayList arrayList;
        c cVar;
        int i = 10;
        Object obj2 = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((xei) this.b).a.l((String) obj);
                return zy11.a;
            case 1:
                ((e3j) ((g3j) this.b).Dg()).render((m3j) obj);
                return zy11.a;
            case 2:
                ((arj) this.b).render((jrj) obj);
                return zy11.a;
            case 3:
                ((otj) this.b).render(new qtj((bk10) obj));
                return zy11.a;
            case 4:
                pv0 pv0Var = (pv0) obj;
                qwj qwjVar = (qwj) this.b;
                qwjVar.getClass();
                Address address = pv0Var.a;
                b bVar = qwjVar.c;
                d0l0 c = bVar.c();
                if (!z81.b(c.h(), address)) {
                    ZoneAddress zoneAddress = c.a;
                    Zone zone = zoneAddress != null ? zoneAddress.b : null;
                    bVar.m(new ZoneAddress(address, (zone == null || !jl40.l(zone.a, pv0Var.a.getZoneName())) ? null : zone), null);
                }
                return zy11.a;
            case 5:
                a aVar = (a) this.b;
                pzt0 pzt0Var = aVar.K;
                if (pzt0Var != null) {
                    z = true;
                    break;
                } else {
                    z = true;
                }
                aVar.b0(z);
                return zy11.a;
            case 6:
                sk91.b((ButtonComponent) this.b, ((Boolean) obj).booleanValue());
                return zy11.a;
            case 7:
                d6m d6mVar = (d6m) obj;
                k6m k6mVar = (k6m) this.b;
                r6m r6mVar = (r6m) k6mVar.Dg();
                ArrayList arrayList2 = d6mVar.a;
                List list = d6mVar.b;
                r6mVar.v5(arrayList2, list, d6mVar.c, d6mVar.d, d6mVar.e);
                k6mVar.A.a(list, d6mVar.d, !k6mVar.C.c());
                return zy11.a;
            case 8:
                f fVar = (f) this.b;
                if (((Boolean) obj).booleanValue()) {
                    fVar.i.l(Boolean.FALSE);
                    fVar.d.a(FocusMode.FOLLOWING);
                }
                return zy11.a;
            case 9:
                ikm ikmVar = (ikm) this.b;
                if (!ikmVar.J.a()) {
                    ikmVar.A.e(false);
                }
                return zy11.a;
            case 10:
                hxx0 hxx0Var = (hxx0) obj;
                com.yandex.go.taxi.order.state.driving.a aVar2 = (com.yandex.go.taxi.order.state.driving.a) this.b;
                if (aVar2.Eg() && hxx0Var != null) {
                    aVar2.W.d(aVar2.V, hxx0Var, kyh0.order_screens_driving_timeleft_with_hours_preview, kyh0.taxiotw_driving);
                }
                return zy11.a;
            case 11:
                Map map = (Map) obj;
                r0 r0Var = ((ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data.a) this.b).b;
                do {
                    value = r0Var.getValue();
                    List list2 = ((e0l0) value).a;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    int i3 = 0;
                    for (Object obj3 : list2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            scc.m();
                            throw null;
                        }
                        qv0 qv0Var = (qv0) obj3;
                        List list3 = (List) map.get(new erv(i3));
                        if (list3 == null) {
                            list3 = EmptyList.a;
                        }
                        arrayList.add(qv0.a(qv0Var, null, null, null, null, null, null, list3, 383));
                        i3 = i4;
                    }
                } while (!r0Var.k(value, new e0l0(arrayList)));
                return zy11.a;
            case 12:
                com.yandex.go.tariffcard.common.a aVar3 = (com.yandex.go.tariffcard.common.a) this.b;
                viv0 viv0Var = aVar3.i;
                q7t0 q7t0Var = aVar3.b;
                h1g h1gVar = aVar3.g;
                if (viv0Var.g(((fnx0) obj).d)) {
                    aVar3.n = CardType.CARD;
                    TariffOptionsCardView tariffOptionsCardView = aVar3.k;
                    if (tariffOptionsCardView == null) {
                        tariffOptionsCardView = h1gVar.a(q7t0Var).c();
                        aVar3.k = tariffOptionsCardView;
                    }
                    com.yandex.go.tariffcard.common.a.a(aVar3, tariffOptionsCardView);
                } else {
                    aVar3.n = CardType.PAGER;
                    TariffPagerView tariffPagerView = aVar3.l;
                    if (tariffPagerView == null) {
                        tw60 b = h1gVar.a(q7t0Var).b();
                        hfv0 hfv0Var = aVar3.d;
                        DotsIndicatorComponent dotsIndicatorComponent = aVar3.c;
                        ffv0 ffv0Var = (ffv0) hfv0Var;
                        i1g i1gVar = ffv0Var.c;
                        i1gVar.getClass();
                        d1g d1gVar = i1gVar.a;
                        g1g g1gVar = i1gVar.b;
                        xvf0 b2 = i5m.b(new u6o0(new rbx0(d1gVar.i0, i), d1gVar.n3, d1gVar.E1, d1gVar.b1, d1gVar.o, d1gVar.i7, 19, false));
                        fat0 fat0Var = new fat0(d1gVar.b1, d1gVar.o, 17);
                        mvy mvyVar = new mvy(d1gVar.w2, 4);
                        ibz0 ibz0Var = new ibz0(d1gVar.g1, d1gVar.E1, 25);
                        oye0 oye0Var = new oye0(d1gVar.i, i2);
                        rbx0 rbx0Var = new rbx0(d1gVar.K4, i2);
                        rbx0 rbx0Var2 = new rbx0(d1gVar.h1, 9);
                        u0g u0gVar = d1gVar.y;
                        s730 s730Var = new s730(u0gVar, 19);
                        w0g w0gVar = d1gVar.w;
                        z0g z0gVar = d1gVar.e7;
                        a1g a1gVar = d1gVar.N;
                        w0g w0gVar2 = d1gVar.n;
                        mrv0 mrv0Var = new mrv0(d1gVar.g6, d1gVar.b2, mvyVar, ibz0Var, i5m.b(new uw11(d1gVar.n2, new ut(oye0Var, rbx0Var, d1gVar.Q0, rbx0Var2, d1gVar.g2, g1gVar.R, d1gVar.r, d1gVar.D3, d1gVar.q5, d1gVar.G7, new epf((xvf0) w0gVar, (v7p) fat0Var, (xvf0) z0gVar, (xvf0) a1gVar, (xvf0) w0gVar2, (xvf0) d1gVar.p7, (xvf0) s730Var, 29), new lq40(0, new q02(u0gVar, 9)), new ys10((v7p) new q02(u0gVar, 8), (xvf0) d1gVar.S, 12), d1gVar.s7), w0gVar2, d1gVar.U4, new q02(u0gVar, 7), d1gVar.W6)), g1gVar.g, d1gVar.T, d1gVar.M5, 2);
                        gx8 gx8Var = new gx8(d1gVar.g1, d1gVar.o, d1gVar.M1, d1gVar.n3, d1gVar.H3, d1gVar.D1);
                        n3w a = n3w.a(b);
                        xvf0 b3 = i5m.b(new qx4(d1gVar.o, d1gVar.N7, b2, g1gVar.L, d1gVar.c6, fat0Var, d1gVar.M1, mrv0Var, gx8Var, d1gVar.q7, d1gVar.Q, d1gVar.i3, a, d1gVar.s7, d1gVar.g1));
                        n3w a2 = n3w.a(new ekx0(new cjw0(d1gVar.T, new t4v0(d1gVar.e2, d1gVar.z0, g1gVar.i, d1gVar.C0, 2), d1gVar.t3)));
                        eqh eqhVar = d1gVar.l7;
                        z0g z0gVar2 = d1gVar.o7;
                        g0g g0gVar = d1gVar.S0;
                        rx4 rx4Var = new rx4(a2, eqhVar, z0gVar2, g0gVar, 29);
                        t0g t0gVar = d1gVar.i;
                        xvf0 xvf0Var = d1gVar.o0;
                        t0g t0gVar2 = d1gVar.T;
                        t0g t0gVar3 = d1gVar.m2;
                        u0g u0gVar2 = d1gVar.i0;
                        x0g x0gVar = d1gVar.i7;
                        y0g y0gVar = d1gVar.n2;
                        v0g v0gVar = d1gVar.Z0;
                        x0g x0gVar2 = d1gVar.b2;
                        w0g w0gVar3 = d1gVar.w;
                        w0g w0gVar4 = d1gVar.n;
                        x0g x0gVar3 = d1gVar.E1;
                        nwf nwfVar = d1gVar.x;
                        a1g a1gVar2 = d1gVar.z0;
                        zni0 zni0Var = g1gVar.D;
                        w0g w0gVar5 = d1gVar.o;
                        y0g y0gVar2 = d1gVar.I5;
                        u0g u0gVar3 = d1gVar.y;
                        a1g a1gVar3 = d1gVar.Q;
                        u0g u0gVar4 = d1gVar.v1;
                        kkt kktVar = new kkt(t0gVar, xvf0Var, t0gVar2, t0gVar3, u0gVar2, x0gVar, y0gVar, v0gVar, x0gVar2, w0gVar3, w0gVar4, x0gVar3, nwfVar, a1gVar2, zni0Var, w0gVar5, y0gVar2, u0gVar3, a1gVar3, u0gVar4, d1gVar.J5, g0gVar);
                        rwh rwhVar = new rwh(u0gVar2, 26);
                        x0g x0gVar4 = d1gVar.x1;
                        t0g t0gVar4 = d1gVar.W;
                        a1g a1gVar4 = d1gVar.D1;
                        xvf0 xvf0Var2 = g1gVar.g;
                        u0g u0gVar5 = d1gVar.M1;
                        z0g z0gVar3 = d1gVar.c5;
                        u0g u0gVar6 = d1gVar.S;
                        w0g w0gVar6 = d1gVar.A0;
                        npi npiVar = new npi(t0gVar, t0gVar2, x0gVar4, x0gVar2, u0gVar4, t0gVar4, a1gVar4, a1gVar2, rwhVar, xvf0Var2, w0gVar5, u0gVar5, z0gVar3, u0gVar6, v0gVar, w0gVar6, d1gVar.F7, d1gVar.J7, d1gVar.K7, d1gVar.L7, d1gVar.C5, a1gVar3);
                        y0g y0gVar3 = d1gVar.g1;
                        fat0 fat0Var2 = new fat0(y0gVar3, u0gVar5, 19);
                        n7i0 n7i0Var = new n7i0(w0gVar5, z0gVar3, 1);
                        u0g u0gVar7 = d1gVar.j;
                        n0k0 n0k0Var = g1gVar.F;
                        jc50 jc50Var = new jc50(u0gVar7, w0gVar4, n0k0Var, 29);
                        v0g v0gVar2 = d1gVar.p;
                        nt0 nt0Var = new nt0(x0gVar4, d1gVar.i1, jc50Var, new t160(v0gVar2, 28), d1gVar.I, d1gVar.J, d1gVar.K, d1gVar.f5, d1gVar.d1, d1gVar.u);
                        w0g w0gVar7 = d1gVar.g5;
                        sb1 sb1Var = new sb1(w0gVar3, w0gVar7, w0gVar5, w0gVar4, u0gVar7, v0gVar2, t0gVar2, 28);
                        u0g u0gVar8 = d1gVar.B;
                        nwf nwfVar2 = d1gVar.D;
                        nwf nwfVar3 = d1gVar.H;
                        y0g y0gVar4 = d1gVar.t;
                        ii9 ii9Var = new ii9(y0gVar3, w0gVar5, u0gVar8, nwfVar2, nwfVar3, n7i0Var, v0gVar2, y0gVar4, d1gVar.L, d1gVar.C2, d1gVar.M, nt0Var, d1gVar.N, t0gVar2, u0gVar5, sb1Var);
                        z0g z0gVar4 = d1gVar.h5;
                        axy axyVar = d1gVar.J2;
                        t4 t4Var = new t4(t0gVar2, ii9Var, z0gVar4, axyVar, 14);
                        sit0 sit0Var = new sit0(w0gVar5, t0gVar2, d1gVar.p5, 9);
                        upj upjVar = new upj(t0gVar, 6);
                        upj upjVar2 = new upj(t0gVar, 7);
                        t0g t0gVar5 = d1gVar.n5;
                        kpp0 kpp0Var = new kpp0(t0gVar5, upjVar, upjVar2, 19);
                        x0g x0gVar5 = d1gVar.o5;
                        dx9 dx9Var = new dx9(sit0Var, new ph70(kpp0Var, new if9(x0gVar5, upjVar, t0gVar5, upjVar2, 22), x0gVar5, new mz70(w0gVar6, g1gVar.A, t0gVar2, d1gVar.k5, d1gVar.y5, x0gVar2, 23), x0gVar2, u0gVar4), 25);
                        w0g w0gVar8 = d1gVar.h1;
                        y0g y0gVar5 = d1gVar.X0;
                        ibz0 ibz0Var2 = new ibz0(w0gVar8, y0gVar5, 19);
                        mg11 mg11Var = new mg11(ibz0Var2, new fy30(d1gVar.e2, d1gVar.b1, w0gVar5, axyVar, new px4(u0gVar7, w0gVar4, d1gVar.y0, n0k0Var, v0gVar2, d1gVar.F, y0gVar4, d1gVar.G2, w0gVar7, y0gVar5, 9), y0gVar5, ibz0Var2, new fy30(w0gVar4, w0gVar5, a1gVar4, u0gVar7, v0gVar2, d1gVar.m0, d1gVar.r, new rmv0(w0gVar4, d1gVar.A, 24), 18), 19), 9);
                        x0g x0gVar6 = d1gVar.j5;
                        plx0 plx0Var = olx0.a;
                        xvf0 b4 = i5m.b(new ht0((xvf0) u0gVar4, (xvf0) u0gVar6, b2, (xvf0) new h0l0(mg11Var, new y2s0(plx0Var, new sit0(x0gVar6, plx0Var, a1gVar4, 17), x0gVar6, 28), new ze(rbx0Var, y0gVar, 24), new yc((xvf0) t0gVar, (v7p) new mu7(d1gVar.U5, d1gVar.A4, 3), (xvf0) x0gVar, (xvf0) x0gVar4, (xvf0) a1gVar2, (xvf0) d1gVar.R1, 19), new hs30(d1gVar.D3, d1gVar.X2, v0gVar, d1gVar.u1, 15), new peb(w0gVar8, 29), new mz70(d1gVar.t3, g1gVar.i, w0gVar8, a1gVar2, d1gVar.T4, g1gVar.h, 28), new pmn0(d1gVar.O7, d1gVar.g6, b2, d1gVar.c0, w0gVar8, 22), d1gVar.z7, d1gVar.D7), (xvf0) t0gVar2, (xvf0) new ad(t0gVar, d1gVar.S5, 1), (xvf0) x0gVar2, 6));
                        v8c0 v8c0Var = new v8c0(n3w.a(new i8h(new ki9(d1gVar.v1, d1gVar.T, d1gVar.n2, d1gVar.R0, xx31.a))), 17);
                        s0g s0gVar = d1gVar.Y;
                        w0g w0gVar9 = d1gVar.h1;
                        ibz0 ibz0Var3 = new ibz0(s0gVar, w0gVar9, 18);
                        c4 c4Var = d1gVar.q0;
                        u0g u0gVar9 = d1gVar.y;
                        h0z h0zVar = new h0z(c4Var, u0gVar9, 0);
                        u0g u0gVar10 = d1gVar.i6;
                        rwh rwhVar2 = new rwh(u0gVar10, 12);
                        uc50 uc50Var = new uc50(u0gVar10, d1gVar.p5, 2);
                        mu7 mu7Var = new mu7(d1gVar.T4, d1gVar.P5, 4);
                        t0g t0gVar6 = d1gVar.r1;
                        l180 l180Var = new l180(t0gVar6, 2);
                        x0g x0gVar7 = d1gVar.t3;
                        jde0 jde0Var = new jde0(x0gVar7, 7);
                        x851 x851Var = new x851(d1gVar.j, u0gVar9, 0);
                        k1w k1wVar = new k1w(d1gVar.t, 2);
                        ibz0 ibz0Var4 = new ibz0(w0gVar9, d1gVar.n, 12);
                        v0g v0gVar3 = d1gVar.T1;
                        p6f p6fVar = new p6f(v0gVar3, 24);
                        c7n c7nVar = new c7n(d1gVar.O2, 15);
                        ze zeVar = new ze(d1gVar.j6, d1gVar.f, 2);
                        x0g x0gVar8 = d1gVar.U;
                        xvf0 xvf0Var3 = d1gVar.K0;
                        x0g x0gVar9 = d1gVar.l0;
                        t0g t0gVar7 = d1gVar.T;
                        t4v0 t4v0Var = new t4v0(x0gVar8, xvf0Var3, x0gVar9, t0gVar7, 15);
                        vfg0 vfg0Var = d1gVar.d3;
                        jpj0 jpj0Var = d1gVar.e3;
                        rct0 rct0Var = d1gVar.b3;
                        b1g b1gVar = d1gVar.k6;
                        p6f p6fVar2 = d1gVar.a3;
                        ju9 ju9Var = new ju9((xvf0) vfg0Var, h0zVar, rwhVar2, uc50Var, mu7Var, (xvf0) jpj0Var, (xvf0) rct0Var, l180Var, jde0Var, x851Var, k1wVar, ibz0Var4, p6fVar, c7nVar, zeVar, t4v0Var, (xvf0) b1gVar, (xvf0) p6fVar2);
                        fwc fwcVar = new fwc(d1gVar.Z2, p6fVar2, 27);
                        v0g v0gVar4 = d1gVar.h6;
                        w0g w0gVar10 = d1gVar.A0;
                        y2s0 y2s0Var = d1gVar.g3;
                        x0g x0gVar10 = d1gVar.b2;
                        cys0 cys0Var = new cys0((Object) new zs0(v0gVar4, w0gVar10, t0gVar7, ibz0Var3, y2s0Var, h0zVar, ju9Var, fwcVar, c4Var, t0gVar6, x0gVar10, x0gVar7, v0gVar3, p6fVar2, rct0Var, x0gVar8, d1gVar.h3), (xvf0) t0gVar7, 2);
                        u0g u0gVar11 = d1gVar.v1;
                        x0g x0gVar11 = d1gVar.x1;
                        t0g t0gVar8 = d1gVar.i;
                        by8 by8Var = new by8(u0gVar11, x0gVar11, t0gVar8, 1);
                        xvf0 xvf0Var4 = d1gVar.C;
                        a9i a9iVar = d1gVar.x2;
                        t0g t0gVar9 = d1gVar.m2;
                        k4 k4Var = new k4((xvf0) t0gVar8, (xvf0) x0gVar10, (xvf0) u0gVar11, (xvf0) u0gVar9, xvf0Var4, (xvf0) d1gVar.B, (xvf0) a9iVar, (xvf0) new dx9(d1gVar.Z0, new js0(xvf0Var4, t0gVar8, a9iVar, t0gVar9, 24), 14, false), (xvf0) t0gVar9, (xvf0) d1gVar.M1, (xvf0) new rwh(u0gVar10, 18), 5, (byte) 0);
                        yc ycVar = new yc(d1gVar.m, d1gVar.M2, d1gVar.P, d1gVar.o, d1gVar.T0, d1gVar.Q);
                        uc50 uc50Var2 = new uc50(t0gVar7, a, 8);
                        n3w a3 = n3w.a(new uqc(new tqc(rx4Var, kktVar, npiVar, g1gVar.g, d1gVar.D3, b2, fat0Var2, t4Var, u0gVar11, dx9Var, b4, v8c0Var, d1gVar.M7, d1gVar.n3, cys0Var, d1gVar.i5, d1gVar.D0, d1gVar.S5, by8Var, d1gVar.e1, k4Var, g1gVar.j, d1gVar.S, ycVar, x0gVar10, uc50Var2)));
                        u0g u0gVar12 = d1gVar.y;
                        q02 q02Var = new q02(u0gVar12, 4);
                        n3w a4 = n3w.a(new xn40(new wn40(rx4Var, g1gVar.g, d1gVar.D3, b2, fat0Var2, t4Var, dx9Var, b4, d1gVar.n3, d1gVar.w, d1gVar.v1, cys0Var, d1gVar.i5, d1gVar.D0, d1gVar.S5, by8Var, d1gVar.e1, g1gVar.j, d1gVar.J4, d1gVar.S, ycVar, d1gVar.b2, u0gVar12, q02Var, uc50Var2)));
                        t0g t0gVar10 = d1gVar.i;
                        w0g w0gVar11 = d1gVar.o;
                        sit0 sit0Var2 = new sit0(t0gVar10, w0gVar11, d1gVar.i2, 11);
                        xvf0 xvf0Var5 = d1gVar.e2;
                        u0g u0gVar13 = d1gVar.v1;
                        vm80 vm80Var = new vm80(xvf0Var5, u0gVar13, 18);
                        x0g x0gVar12 = d1gVar.M4;
                        x0g x0gVar13 = d1gVar.N4;
                        u0g u0gVar14 = d1gVar.y;
                        t0g t0gVar11 = d1gVar.T;
                        y0g y0gVar6 = d1gVar.g1;
                        t0g t0gVar12 = d1gVar.m2;
                        w0g w0gVar12 = d1gVar.y4;
                        v0g v0gVar5 = d1gVar.n3;
                        c1g c1gVar = d1gVar.O4;
                        xvf0 xvf0Var6 = d1gVar.u4;
                        x0g x0gVar14 = d1gVar.x1;
                        b1g b1gVar2 = d1gVar.J4;
                        c1g c1gVar2 = d1gVar.P4;
                        c1g c1gVar3 = d1gVar.Q4;
                        z0g z0gVar5 = d1gVar.l4;
                        y0g y0gVar7 = d1gVar.R4;
                        u0g u0gVar15 = d1gVar.i0;
                        a1g a1gVar5 = d1gVar.r;
                        x0g x0gVar15 = d1gVar.S4;
                        b1g b1gVar3 = d1gVar.B4;
                        t0g t0gVar13 = d1gVar.F1;
                        c1g c1gVar4 = d1gVar.C4;
                        c1g c1gVar5 = d1gVar.D4;
                        c1g c1gVar6 = d1gVar.E4;
                        b1g b1gVar4 = d1gVar.d;
                        xvf0 xvf0Var7 = g1gVar.e;
                        x0g x0gVar16 = d1gVar.b2;
                        x0g x0gVar17 = d1gVar.F4;
                        z0g z0gVar6 = d1gVar.G4;
                        nwf nwfVar4 = d1gVar.H4;
                        w0g w0gVar13 = d1gVar.h1;
                        u0g u0gVar16 = d1gVar.K4;
                        y0g y0gVar8 = d1gVar.n2;
                        y0g y0gVar9 = d1gVar.z4;
                        c1g c1gVar7 = d1gVar.T4;
                        u0g u0gVar17 = d1gVar.S;
                        a1g a1gVar6 = d1gVar.z0;
                        g0g g0gVar2 = d1gVar.C0;
                        b1g b1gVar5 = d1gVar.D3;
                        c1g c1gVar8 = d1gVar.U4;
                        xvf0 b5 = i5m.b(new rbx0(i5m.b(new alx0(d1gVar.n3, a3, a4, n3w.a(new si31(new ri31(rx4Var, kktVar, npiVar, new lw8(t0gVar10, d1gVar.x4, t0gVar11, x0gVar14, y0gVar6, t0gVar12, w0gVar12, v0gVar5, w0gVar11, y0gVar9, u0gVar14, bqv0.a, g1gVar.c, d1gVar.v4, g1gVar.d, a1gVar5, b1gVar3, c1gVar4, c1gVar5, u0gVar15, b1gVar4, c1gVar6, x0gVar17, x0gVar16, z0gVar6, nwfVar4, w0gVar13, d1gVar.I4, y0gVar8, b1gVar2, u0gVar16, d1gVar.L4, u0gVar17, d1gVar.D1, new mw8(x0gVar12, x0gVar13, u0gVar14, t0gVar11, y0gVar6, t0gVar12, w0gVar12, v0gVar5, c1gVar, xvf0Var6, w0gVar11, x0gVar14, b1gVar2, sit0Var2, vm80Var, c1gVar2, c1gVar3, z0gVar5, y0gVar7, u0gVar15, a1gVar5, x0gVar15, b1gVar3, t0gVar13, c1gVar4, c1gVar5, c1gVar6, b1gVar4, xvf0Var7, x0gVar16, u0gVar13, x0gVar17, z0gVar6, nwfVar4, w0gVar13, u0gVar16, y0gVar8, y0gVar9, c1gVar7, u0gVar17, a1gVar6, g0gVar2, b1gVar5, c1gVar8, d1gVar.V4, d1gVar.W4), c1gVar7, a1gVar6, g0gVar2, b1gVar5, d1gVar.M1, c1gVar8, 1), g1gVar.g, b1gVar5, b2, fat0Var2, t4Var, dx9Var, b4, v8c0Var, d1gVar.M7, v0gVar5, d1gVar.w, cys0Var, d1gVar.i5, d1gVar.D0, d1gVar.S5, by8Var, u0gVar13, k4Var, d1gVar.e1, g1gVar.j, b1gVar2, u0gVar17, ycVar, x0gVar16, u0gVar14, q02Var, uc50Var2))), 0)), 8));
                        fva0.f(ffv0Var.a, "TariffPagerView", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        Context h0 = d1gVar.a.h0();
                        q5z.h(h0);
                        TariffPagerView tariffPagerView2 = new TariffPagerView(h0, (lkx0) b3.get(), (ckx0) b5.get(), q7t0Var, dotsIndicatorComponent, ffv0Var.b);
                        fva0.c(ffv0Var.a, tariffPagerView2, "TariffPagerView", null, 12);
                        aVar3.l = tariffPagerView2;
                        tariffPagerView = tariffPagerView2;
                    }
                    com.yandex.go.tariffcard.common.a.a(aVar3, tariffPagerView);
                }
                return zy11.a;
            case 13:
                zpo zpoVar = (zpo) obj;
                ru.yandex.taxi.preorder.suggested.destinations.c cVar2 = (ru.yandex.taxi.preorder.suggested.destinations.c) this.b;
                cVar2.i.g(zpoVar.a);
                cVar2.h.g(zpoVar.b);
                return zy11.a;
            case 14:
                long longValue = ((Number) obj).longValue();
                r0 r0Var2 = ((g) this.b).c;
                Long l = new Long(longValue);
                r0Var2.getClass();
                r0Var2.m(null, l);
                return zy11.a;
            case 15:
                d dVar = (d) this.b;
                dVar.d.v = dVar.a();
                return zy11.a;
            case 16:
                ru.yandex.taxi.favorites.address.impl.b bVar2 = (ru.yandex.taxi.favorites.address.impl.b) this.b;
                bVar2.H.d(new jep((FavoriteAddress) obj), bVar2.o(), bVar2.J);
                return zy11.a;
            case 17:
                ((FavoritesFragment) this.b).addAddressFromRawParams((Address) obj);
                return zy11.a;
            case 18:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                vtq vtqVar = (vtq) this.b;
                vtqVar.getClass();
                String str = taxiOrder.a;
                String z2 = taxiOrder.z();
                boolean z3 = (z2 == null || z2.length() == 0) ? false : true;
                ksq b6 = ((com.yandex.go.taxi.order.feedback.domain.b) vtqVar.a).b(str);
                boolean z4 = (z3 == b6.e && jl40.l(taxiOrder.z(), b6.f)) ? false : true;
                isq isqVar = new isq(str, b6);
                String z5 = taxiOrder.z();
                boolean z6 = (z5 == null || z5.length() == 0 || Float.parseFloat(taxiOrder.z()) != 0.0f) ? false : true;
                if ((taxiOrder.A() != TipsType.PERCENT || z6) && (!taxiOrder.V().E.a().b || !taxiOrder.F())) {
                    String z7 = taxiOrder.z();
                    if (!jl40.j(z7 != null ? Float.valueOf(Float.parseFloat(z7)) : null, 0.0f)) {
                        List list4 = taxiOrder.V().E.a;
                        if (!list4.isEmpty()) {
                            Iterator it = ((TipsVariant) list4.get(0)).a().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (jl40.l(taxiOrder.z(), ((TipsVariant.TipsChoice) next).a())) {
                                        obj2 = next;
                                    }
                                }
                            }
                            if (obj2 != null) {
                                i2 = 1;
                            }
                        }
                        i2 ^= 1;
                    }
                }
                boolean N2 = vtqVar.b.N2(isqVar, taxiOrder, b6);
                boolean l2 = jl40.l(taxiOrder.V().E.a, b6.d);
                if (!l2) {
                    isqVar.d = taxiOrder.V().E.a;
                }
                if (z4 || N2 || !l2 || i2 != 0) {
                    if (z4) {
                        isqVar.f = z3;
                        if (!b6.h) {
                            isqVar.h = taxiOrder.z();
                        }
                    }
                    if (i2 != 0) {
                        isqVar.h = "0";
                        isqVar.g = taxiOrder.A();
                        if (taxiOrder.l.o) {
                            ((com.yandex.go.taxi.order.feedback.domain.b) vtqVar.a).c(new ksq(isqVar), taxiOrder.l.a);
                        }
                    }
                    ((com.yandex.go.taxi.order.feedback.domain.b) vtqVar.a).d(str, new ksq(isqVar));
                }
                return zy11.a;
            case 19:
                Object a5 = ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.c.a((ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.c) this.b, (oo0) obj, continuation);
                return a5 == CoroutineSingletons.COROUTINE_SUSPENDED ? a5 : zy11.a;
            case 20:
                ((FileChooserDialog) this.b).applyDialogTheme();
                return zy11.a;
            case 21:
                ((AtomicReference) this.b).set(obj);
                return zy11.a;
            case 22:
                j5s j5sVar = (j5s) obj;
                if (j5sVar != null) {
                    ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.b bVar3 = (ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.b) this.b;
                    bVar3.getClass();
                    Map map2 = j5sVar.k.a;
                    r0 r0Var3 = bVar3.b.a;
                    Map t = kotlin.collections.b.t(map2);
                    r0Var3.getClass();
                    r0Var3.m(null, t);
                }
                return zy11.a;
            case 23:
                ((j61) this.b).U9(q5z.F((Address) obj));
                return zy11.a;
            case 24:
                hks hksVar = hks.c;
                e eVar = (e) obj;
                gks gksVar = (gks) this.b;
                if (eVar == null) {
                    ((j61) gksVar.Dg()).fg();
                } else {
                    ((j61) gksVar.Dg()).na(eVar);
                    ((j61) gksVar.Dg()).Ta(eVar.g);
                    ((j61) gksVar.Dg()).setTitle(eVar.i);
                    j61 j61Var = (j61) gksVar.Dg();
                    NextButtonShowStrategy nextButtonShowStrategy = eVar.q;
                    String str2 = eVar.r;
                    String str3 = eVar.s;
                    w4l0 w4l0Var = gksVar.m0;
                    int i5 = fks.a[nextButtonShowStrategy.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                w511.b();
                                return null;
                            }
                        } else if (!evu0.J(str2) && w4l0Var.k() != null) {
                            hksVar = new hks(str2, true);
                        }
                    } else if (!evu0.J(str2) && !evu0.J(str3)) {
                        if (w4l0Var.k() == null) {
                            str2 = str3;
                        }
                        hksVar = new hks(str2, true);
                    }
                    j61Var.c8(hksVar);
                }
                return zy11.a;
            case 25:
                cVar = ((FullscreenSuperappSuggestModalView) this.b).presenter;
                String a6 = vks.a((String) obj);
                cVar.D.c(a6);
                if (evu0.J(a6)) {
                    cVar.A.b();
                }
                ca01 ca01Var = cVar.U.b;
                if (ca01Var != null) {
                    ca01Var.h(a6);
                }
                return zy11.a;
            case 26:
                ((pus) this.b).render((bvs) obj);
                return zy11.a;
            case 27:
                h hVar = (h) this.b;
                hVar.I.a = SearchSourceType.MOVE;
                com.yandex.go.navigator.gas_stations.b bVar4 = hVar.z.a;
                Session session = bVar4.r;
                if (session != null) {
                    session.cancel();
                }
                bVar4.r = null;
                bVar4.e();
                return zy11.a;
            case 28:
                if (((Number) obj).longValue() == 1) {
                    com.yandex.go.navigator.gas_stations.b bVar5 = (com.yandex.go.navigator.gas_stations.b) this.b;
                    bVar5.n++;
                    bVar5.e();
                }
                return zy11.a;
            default:
                GifDrawable gifDrawable = (GifDrawable) this.b;
                gifDrawable.currentBitmap = (Bitmap) obj;
                gifDrawable.invalidateSelf();
                return zy11.a;
        }
    }
}
