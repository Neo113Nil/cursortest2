package ru.yandex.taxi.logistics.ndd_map.router;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a3v;
import defpackage.ah50;
import defpackage.ai50;
import defpackage.aos;
import defpackage.auu0;
import defpackage.bc;
import defpackage.cm2;
import defpackage.cw8;
import defpackage.d6z;
import defpackage.dh50;
import defpackage.di20;
import defpackage.e840;
import defpackage.eh50;
import defpackage.ei50;
import defpackage.elo0;
import defpackage.fh50;
import defpackage.fi50;
import defpackage.fj50;
import defpackage.g8e;
import defpackage.gc;
import defpackage.ge50;
import defpackage.gh00;
import defpackage.hh50;
import defpackage.hi50;
import defpackage.i5m;
import defpackage.i6r;
import defpackage.ij50;
import defpackage.jh50;
import defpackage.ji50;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k8u;
import defpackage.kkt;
import defpackage.l4g;
import defpackage.lf00;
import defpackage.li50;
import defpackage.lq40;
import defpackage.lx4;
import defpackage.mf00;
import defpackage.mth;
import defpackage.n3w;
import defpackage.n4g;
import defpackage.ni50;
import defpackage.o400;
import defpackage.o4g;
import defpackage.ob0;
import defpackage.oh50;
import defpackage.pex0;
import defpackage.q150;
import defpackage.qi50;
import defpackage.qoi0;
import defpackage.qx5;
import defpackage.sjh;
import defpackage.sl00;
import defpackage.tje;
import defpackage.tse;
import defpackage.u9i;
import defpackage.uh50;
import defpackage.uhx;
import defpackage.uyj;
import defpackage.v9i;
import defpackage.w030;
import defpackage.w511;
import defpackage.w5i;
import defpackage.wif;
import defpackage.x5r;
import defpackage.xh50;
import defpackage.xnt;
import defpackage.xvf0;
import defpackage.y2s0;
import defpackage.y9y0;
import defpackage.yh50;
import defpackage.ys10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.logistics.ndd_map.domain.g;
import ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorModalView;

/* loaded from: classes5.dex */
public final class f extends BaseRootNavigationRouter {
    public final w030 D;
    public final lx4 E;
    public final w5i F;
    public final a3v G;
    public final y9y0 H;
    public final i6r I;
    public final ru.yandex.taxi.logistics.ndd_map.layers.a J;
    public final BaseRootNavigationRouter.a K = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);
    public e L;
    public NddRouteSelectorModalView M;

    public f(w030 w030Var, lx4 lx4Var, w5i w5iVar, a3v a3vVar, y9y0 y9y0Var, i6r i6rVar, ru.yandex.taxi.logistics.ndd_map.layers.a aVar) {
        this.D = w030Var;
        this.E = lx4Var;
        this.F = w5iVar;
        this.G = a3vVar;
        this.H = y9y0Var;
        this.I = i6rVar;
        this.J = aVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        xh50 xh50Var = (xh50) obj;
        NddRouteSelectorModalView nddRouteSelectorModalView = this.M;
        if (nddRouteSelectorModalView != null) {
            this.D.l(nddRouteSelectorModalView);
        }
        e eVar = this.L;
        if (eVar != null) {
            eVar.j();
            ai50 ai50Var = eVar.c;
            boolean b = eVar.h.b.b();
            ji50 ji50Var = eVar.a;
            i d = ((j) ai50Var.b).d("SuperApp.Delivery.MapClosed");
            d.d("type", ai50.a(b));
            String d2 = ai50.d(ji50Var);
            LinkedHashMap linkedHashMap = d.a;
            linkedHashMap.put("origin", d2);
            pex0 m = ((k) ai50Var.a).m();
            linkedHashMap.put(ClidProvider.STATE, m != null ? m.b : null);
            d.m();
            eVar.M.cancel();
        }
        w5i w5iVar = this.F;
        Address g = w5iVar.a.g();
        if (g != null) {
            ((gh00) w5iVar.b).D(ru.yandex.taxi.map.utils.a.F(g.B()), 17.0f, 400.0f, new sl00(0));
        }
        this.G.a0(qoi0.a(f.class));
        ru.yandex.taxi.logistics.ndd_map.layers.a aVar = this.J;
        aVar.a.a.remove(aVar);
        e eVar2 = this.L;
        hh50 hh50Var = eVar2 != null ? (hh50) eVar2.i.b.b.a.getValue() : null;
        if (hh50Var instanceof eh50) {
            xh50Var.d.invoke(((eh50) hh50Var).a);
            return;
        }
        if (hh50Var instanceof fh50) {
            xh50Var.e.invoke(((fh50) hh50Var).a);
        } else {
            if ((hh50Var instanceof dh50) || hh50Var == null) {
                return;
            }
            w511.b();
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        Object value;
        xh50 xh50Var = (xh50) obj;
        yh50 yh50Var = new yh50(this);
        ji50 ji50Var = xh50Var.b;
        boolean z = xh50Var.a;
        Integer num = xh50Var.c;
        tse o = o();
        i6r i6rVar = this.I;
        i6rVar.getClass();
        y9y0 y9y0Var = this.H;
        y9y0Var.getClass();
        ji50Var.getClass();
        n3w a = n3w.a(Boolean.valueOf(z));
        n3w a2 = n3w.a(ji50Var);
        n4g n4gVar = new n4g(i6rVar, 11);
        n4g n4gVar2 = new n4g(i6rVar, 26);
        ys10 ys10Var = new ys10(n4gVar2, new l4g(i6rVar, 25), 17);
        l4g l4gVar = new l4g(i6rVar, 28);
        n4g n4gVar3 = new n4g(i6rVar, 18);
        xvf0 b = i5m.b(uh50.a);
        n4g n4gVar4 = new n4g(i6rVar, 28);
        o4g o4gVar = new o4g(i6rVar, 4);
        elo0 elo0Var = new elo0(new o4g(i6rVar, 5), n4gVar4, 28);
        xvf0 b2 = i5m.b(ij50.a);
        y2s0 y2s0Var = new y2s0(o4gVar, elo0Var, b2, 4);
        n3w b3 = n3w.b(num);
        xvf0 b4 = i5m.b(ni50.a);
        ge50 ge50Var = new ge50((xvf0) b3, b4, (xvf0) new o4g(i6rVar, 0), i5m.b(qi50.a), 4, (char) 0);
        xvf0 b5 = i5m.b(jh50.a);
        n3w a3 = n3w.a(y9y0Var);
        o4g o4gVar2 = new o4g(i6rVar, 6);
        lq40 lq40Var = new lq40(7, n4gVar);
        n4g n4gVar5 = new n4g(i6rVar, 4);
        q150 q150Var = new q150(a2, b5, b4, a3, o4gVar2, lq40Var, n4gVar5);
        n4g n4gVar6 = new n4g(i6rVar, 2);
        xvf0 b6 = i5m.b(fj50.a);
        l4g l4gVar2 = new l4g(i6rVar, 26);
        int i = 27;
        l4g l4gVar3 = new l4g(i6rVar, i);
        xvf0 b7 = i5m.b(new wif((Object) new n4g(i6rVar, i), (xvf0) new n4g(i6rVar, 6), 27));
        xvf0 b8 = i5m.b(ah50.a);
        n4g n4gVar7 = new n4g(i6rVar, 5);
        ge50 ge50Var2 = new ge50(b8, (xvf0) n4gVar7, (xvf0) n4gVar2, (xvf0) a2, 2, (byte) 0);
        int i2 = 24;
        l4g l4gVar4 = new l4g(i6rVar, i2);
        n4g n4gVar8 = new n4g(i6rVar, i2);
        n4g n4gVar9 = new n4g(i6rVar, 22);
        o4g o4gVar3 = new o4g(i6rVar, 3);
        o4g o4gVar4 = new o4g(i6rVar, 1);
        xvf0 b9 = i5m.b(v9i.a);
        n4g n4gVar10 = new n4g(i6rVar, 8);
        n4g n4gVar11 = new n4g(i6rVar, 23);
        di20 di20Var = new di20(ge50Var, n4gVar11, b9, 22);
        n3w a4 = n3w.a(o);
        n4g n4gVar12 = new n4g(i6rVar, 16);
        n4g n4gVar13 = new n4g(i6rVar, 14);
        n4g n4gVar14 = new n4g(i6rVar, 10);
        n4g n4gVar15 = new n4g(i6rVar, 1);
        n4g n4gVar16 = new n4g(i6rVar, 12);
        xvf0 b10 = i5m.b(new ys10((xvf0) a2, (xvf0) new ys10(n4gVar7, n4gVar8, 16), 15));
        xvf0 b11 = i5m.b(new qx5(a2, b10, 11));
        xvf0 b12 = i5m.b(new cw8(a, a2, n4gVar, ys10Var, l4gVar, n4gVar3, b, n4gVar4, y2s0Var, ge50Var, q150Var, n4gVar6, lq40Var, b6, l4gVar2, l4gVar3, b7, ge50Var2, l4gVar4, n4gVar8, n4gVar7, n4gVar9, o4gVar3, o4gVar4, o4gVar2, b9, n4gVar10, di20Var, a4, n4gVar12, n4gVar13, n4gVar14, i5m.b(new e840(ge50Var, n4gVar15, n4gVar5, n4gVar16, b11, 11)), new n4g(i6rVar, 19), i5m.b(new ys10(new n4g(i6rVar, 21), ge50Var, 18)), b10, b11, new o4g(i6rVar, 2)));
        l4g l4gVar5 = new l4g(i6rVar, 29);
        n4g n4gVar17 = new n4g(i6rVar, 7);
        di20 di20Var2 = new di20(n4gVar7, b6, b2, 23);
        n4g n4gVar18 = new n4g(i6rVar, 3);
        aos aosVar = new aos(a2, 19);
        lq40 lq40Var2 = new lq40(8, new n4g(i6rVar, 13));
        n4g n4gVar19 = new n4g(i6rVar, 0);
        n3w a5 = n3w.a(yh50Var);
        n4g n4gVar20 = new n4g(i6rVar, 25);
        xvf0 b13 = i5m.b(new gc(l4gVar5, n4gVar17, i5m.b(new kkt(b3, b, di20Var2, n4gVar12, n4gVar4, ys10Var, n4gVar18, n4gVar7, l4gVar5, ge50Var, a2, aosVar, lq40Var2, b9, n4gVar11, b12, n4gVar19, a5, n4gVar20, b10, new di20(a2, n4gVar8, n4gVar7, 24))), n4gVar11, new wif((Object) new n4g(i6rVar, 17), (xvf0) new wif((Object) l4gVar5, (xvf0) new wif((Object) b9, (xvf0) di20Var, 20), 19), 21), new n4g(i6rVar, 9), new n4g(i6rVar, 29), ys10Var, n4gVar20));
        xvf0 b14 = i5m.b(new di20(new n4g(i6rVar, 15), b12, i5m.b(new ge50(new n4g(i6rVar, 20), b, b10, ge50Var)), 21));
        ru.yandex.taxi.logistics.ndd_map.layers.a aVar = this.J;
        aVar.a.a.add(aVar);
        NddRouteSelectorModalView nddRouteSelectorModalView = (NddRouteSelectorModalView) b13.get();
        this.M = nddRouteSelectorModalView;
        e eVar = (e) b12.get();
        this.L = eVar;
        ei50 ei50Var = (ei50) b14.get();
        mf00 mf00Var = ei50Var.a;
        mf00Var.getClass();
        i6r i6rVar2 = mf00Var.a;
        i6rVar2.getClass();
        lf00 lf00Var = new lf00(new bc(i6rVar2, this));
        lf00Var.b().i(null, ei50Var.c);
        lf00Var.a().u(new uhx(24, ei50Var));
        j jVar = (j) this.E;
        jVar.getClass();
        j.m(jVar, g8e.o("view.", d6z.C("dest_location")), null, null, false, false, "dest_location", 24);
        this.D.s(nddRouteSelectorModalView, true);
        u9i u9iVar = eVar.x;
        oh50 oh50Var = eVar.H;
        tse tseVar = eVar.A;
        eVar.M = eVar.d.c(new ob0(5, eVar));
        ai50 ai50Var = eVar.c;
        li50 li50Var = eVar.h;
        boolean b15 = li50Var.b.b();
        ji50 ji50Var2 = eVar.a;
        i d = ((j) ai50Var.b).d("SuperApp.Delivery.MapOpened");
        d.d("type", ai50.a(b15));
        String d2 = ai50.d(ji50Var2);
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("origin", d2);
        pex0 m = ((k) ai50Var.a).m();
        linkedHashMap.put(ClidProvider.STATE, m != null ? m.b : null);
        d.m();
        kotlinx.coroutines.flow.e.H(tseVar, new o(new jqr(eVar.b.h, new NddAddressMapPickerInteractor$attachView$2(2, eVar, e.class, "handleActionEvent", "handleActionEvent(Lcom/yandex/go/layers/api/model/MapObjectActionEvent;)V", 4), 3), new NddAddressMapPickerInteractor$attachView$3(3, null)));
        kotlinx.coroutines.flow.e.H(tseVar, new jqr(new mth(kotlinx.coroutines.flow.e.t(new g(li50Var.b.b)), 4), new NddAddressMapPickerInteractor$attachView$4(2, eVar, e.class, "onRouteChanged", "onRouteChanged(Z)V", 4), 3));
        ru.yandex.taxi.logistics.ndd.b bVar = new ru.yandex.taxi.logistics.ndd.b(eVar.j.a.b);
        eVar.m.getClass();
        sjh sjhVar = uyj.a;
        kotlinx.coroutines.flow.e.H(tseVar, new jqr(kotlinx.coroutines.flow.e.F(bVar, o400.a), new NddAddressMapPickerInteractor$attachView$5(eVar, null), 3));
        tje.N(tseVar, null, null, new NddAddressMapPickerInteractor$attachView$6(eVar, null), 3);
        tje.N(tseVar, null, null, new NddAddressMapPickerInteractor$attachView$7(eVar, null), 3);
        kotlinx.coroutines.flow.e.H(tseVar, kotlinx.coroutines.flow.e.n(eVar.R, oh50Var.b, kotlinx.coroutines.flow.e.d(u9iVar.a), new NddAddressMapPickerInteractor$observeLayersConditionChanges$1(eVar, null)));
        kotlinx.coroutines.flow.e.H(tseVar, new jqr(new mth(oh50Var.b, 4), new NddAddressMapPickerInteractor$attachView$8(2, eVar, e.class, "onAddressFlowChanged", "onAddressFlowChanged(Lru/yandex/taxi/logistics/ndd_map/data/NddAddressFlow;)V", 4), 3));
        fi50 fi50Var = eVar.z;
        if (((List) kotlinx.coroutines.flow.e.d(fi50Var.c.a).a.getValue()) == null && (ji50Var2 instanceof hi50)) {
            Map map = (Map) ((xnt) eVar.y).c(((hi50) ji50Var2).d, new k8u(auu0.a, cm2.a, 1));
            x5r a6 = fi50Var.a();
            ArrayList arrayList = new ArrayList();
            Iterator it = a6.a.c.iterator();
            while (it.hasNext()) {
                for (x5r.a.C0132a c0132a : ((x5r.a.b) it.next()).b) {
                    Map map2 = c0132a.b;
                    if (map2 != null) {
                        if (!map2.isEmpty()) {
                            for (Map.Entry entry : map2.entrySet()) {
                                String str = (String) entry.getKey();
                                Object value2 = entry.getValue();
                                if (map.containsKey(str) && jl40.l(map.get(str), value2)) {
                                }
                            }
                        }
                        arrayList.add(c0132a.c);
                    }
                }
            }
            r0 r0Var = u9iVar.a;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, arrayList));
        }
        this.G.b8(qoi0.a(f.class));
        nddRouteSelectorModalView.updateFocusRect();
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.K;
    }
}
