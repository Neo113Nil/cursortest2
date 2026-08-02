package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.flex.common.descriptors.action.GoReloadLabeledSectionsActionDescriptorFactoryImpl;
import com.yandex.go.flex.main_screen.data.network.e;
import com.yandex.go.preorder.navigation.a;
import com.yandex.go.scooters.d;
import com.yandex.go.taxi.order.details.v2.core.availability.m;
import com.yandex.go.taxi.order.domain.interactors.s;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.superapp.orders.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.am.b0;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.am.s0;
import ru.yandex.taxi.location.user.c;
import ru.yandex.taxi.persuggest.source.b;
import ru.yandex.taxi.settings.main.f;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes8.dex */
public final class sve implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;

    public /* synthetic */ sve(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = v7pVar;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
        this.j = xvf0Var8;
        this.k = xvf0Var9;
        this.l = xvf0Var10;
        this.m = xvf0Var11;
        this.n = xvf0Var12;
        this.o = xvf0Var13;
        this.p = xvf0Var14;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.i;
        xvf0 xvf0Var2 = this.k;
        xvf0 xvf0Var3 = this.p;
        xvf0 xvf0Var4 = this.o;
        xvf0 xvf0Var5 = this.n;
        xvf0 xvf0Var6 = this.m;
        xvf0 xvf0Var7 = this.l;
        xvf0 xvf0Var8 = this.j;
        xvf0 xvf0Var9 = this.h;
        xvf0 xvf0Var10 = this.g;
        xvf0 xvf0Var11 = this.f;
        xvf0 xvf0Var12 = this.e;
        xvf0 xvf0Var13 = this.d;
        xvf0 xvf0Var14 = this.c;
        xvf0 xvf0Var15 = this.b;
        switch (i) {
            case 0:
                return new rve((oep0) xvf0Var15.get(), (o) xvf0Var14.get(), (w030) xvf0Var13.get(), (q3u0) xvf0Var12.get(), (tse) xvf0Var11.get(), (a850) xvf0Var10.get(), (bue) ((if9) xvf0Var7).get(), (g) xvf0Var9.get(), (sae) ((gw7) xvf0Var6).get(), (h) xvf0Var.get(), (gof0) ((zlf0) xvf0Var5).get(), (pve) ((x2b) xvf0Var4).get(), (m7w0) xvf0Var8.get(), (kve) xvf0Var2.get(), (xjg) ((lyh) xvf0Var3).get());
            case 1:
                return new a((b8r) xvf0Var15.get(), (a8w) xvf0Var14.get(), i5m.a((c8w) xvf0Var7), i5m.a((d701) xvf0Var6), i5m.a((i020) xvf0Var5), i5m.a((pqd0) xvf0Var4), (jc00) xvf0Var13.get(), (com.yandex.go.mainscreen.superapp.impl.foundation.domain.g) xvf0Var12.get(), (krq0) xvf0Var11.get(), (w6r) xvf0Var10.get(), (pcm) xvf0Var9.get(), this.i, i5m.a(xvf0Var8), (nv20) xvf0Var2.get(), (c2v) xvf0Var3.get());
            case 2:
                return new i700((Activity) xvf0Var15.get(), (f) xvf0Var14.get(), (o350) xvf0Var13.get(), i5m.a(xvf0Var12), i5m.a(xvf0Var11), (pav) xvf0Var10.get(), (k7x0) xvf0Var9.get(), (c2x0) xvf0Var.get(), (g3g0) xvf0Var8.get(), (ny51) xvf0Var2.get(), i5m.a(xvf0Var7), (un10) xvf0Var6.get(), (uk10) ((dt00) xvf0Var5).get(), (Lifecycle) xvf0Var4.get(), (tse) xvf0Var3.get());
            case 3:
                Set set = (Set) xvf0Var15.get();
                Set set2 = (Set) xvf0Var14.get();
                Set set3 = (Set) xvf0Var13.get();
                Set set4 = (Set) xvf0Var12.get();
                Set set5 = (Set) xvf0Var11.get();
                crt crtVar = (crt) xvf0Var10.get();
                w821 w821Var = (w821) xvf0Var9.get();
                k721 k721Var = (k721) xvf0Var.get();
                com.yandex.go.flex.common.descriptors.action.h hVar = (com.yandex.go.flex.common.descriptors.action.h) xvf0Var8.get();
                i2s0 i2s0Var = (i2s0) xvf0Var2.get();
                e eVar = (e) xvf0Var7.get();
                wla0 wla0Var = (wla0) xvf0Var6.get();
                wgr wgrVar = (wgr) xvf0Var5.get();
                Set set6 = (Set) ((y2r0) xvf0Var3).get();
                Set set7 = set2;
                ArrayList arrayList = new ArrayList(tcc.n(set7, 10));
                Iterator it = set7.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xn5) it.next()).a());
                }
                Set set8 = set;
                ArrayList arrayList2 = new ArrayList(tcc.n(set8, 10));
                Iterator it2 = set8.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((j4q0) it2.next()).create());
                }
                ListBuilder a = rcc.a();
                Iterator it3 = set3.iterator();
                while (it3.hasNext()) {
                    a.add(((nu) it3.next()).create());
                }
                a.add(((GoReloadLabeledSectionsActionDescriptorFactoryImpl) crtVar).a);
                a.add(w821Var.b);
                a.add(k721Var.b);
                a.add(hVar.a(i2s0Var));
                ListBuilder j = a.j();
                Set set9 = set4;
                ArrayList arrayList3 = new ArrayList(tcc.n(set9, 10));
                Iterator it4 = set9.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((ea1) it4.next()).a());
                }
                List J0 = kotlin.collections.a.J0(set5);
                List singletonList = Collections.singletonList(eVar);
                Set set10 = set6;
                ArrayList arrayList4 = new ArrayList(tcc.n(set10, 10));
                Iterator it5 = set10.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(((cxi) it5.next()).create());
                }
                wla0Var.getClass();
                return new g0p(arrayList, arrayList2, j, arrayList3, J0, singletonList, arrayList4, Collections.singletonList(new vla0(wla0Var, wgrVar)), HProv.PP_CONTAINER_EXTENSION);
            case 4:
                return new com.yandex.go.preorder.confirm.a((tse) xvf0Var15.get(), (ru.yandex.taxi.preorder.source.pickup.a) xvf0Var14.get(), (t41) xvf0Var13.get(), (b) ((swb) xvf0Var7).get(), (wiq0) xvf0Var12.get(), (eu2) xvf0Var11.get(), (ru.yandex.taxi.orderforanother.repository.a) xvf0Var10.get(), (l0j) xvf0Var9.get(), (b1) ((qii) xvf0Var6).get(), (unx0) ((umt0) xvf0Var5).get(), (iw1) xvf0Var.get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var8.get(), (yh70) xvf0Var2.get(), (g6y0) xvf0Var4.get(), i5m.a(xvf0Var3));
            case 5:
                as21 as21Var = (as21) xvf0Var15.get();
                ine0 ine0Var = (ine0) xvf0Var14.get();
                xku0 xku0Var = (xku0) xvf0Var13.get();
                h hVar2 = (h) xvf0Var12.get();
                return new z580(as21Var, ine0Var, xku0Var, hVar2, (ynj0) xvf0Var10.get(), (bko) xvf0Var9.get(), (p2y0) xvf0Var.get(), (xc80) xvf0Var8.get(), (oxn) xvf0Var2.get(), (uw40) xvf0Var7.get(), (ri1) xvf0Var6.get(), (h2c) xvf0Var5.get(), (wwf) ((m19) xvf0Var4).get(), (yxf0) ((icc0) xvf0Var3).get());
            case 6:
                return new d((i6r) xvf0Var15.get(), (fva0) xvf0Var14.get(), (c) xvf0Var13.get(), i5m.a(xvf0Var12), (vxm0) xvf0Var11.get(), i5m.a(xvf0Var10), (m0o0) xvf0Var9.get(), this.i, (h6o0) xvf0Var8.get(), (ouo0) xvf0Var2.get(), i5m.a(xvf0Var7), i5m.a(xvf0Var6), (sin0) ((n6o0) xvf0Var5).get(), (ru.yandex.taxi.scooters.data.g) xvf0Var4.get(), (sin0) ((n6o0) xvf0Var3).get());
            case 7:
                return new com.yandex.go.settings.domain.a((tis0) ((nup0) xvf0Var7).get(), (x2r0) xvf0Var15.get(), (x2r0) xvf0Var14.get(), (as21) xvf0Var13.get(), (qqt0) xvf0Var12.get(), (aba0) xvf0Var11.get(), (kt00) xvf0Var10.get(), (n8z) xvf0Var9.get(), (ru.yandex.taxi.utils.b) xvf0Var.get(), (d1t) xvf0Var8.get(), (v7j0) xvf0Var2.get(), (jer0) xvf0Var6.get(), (b0) xvf0Var5.get(), (rkv) xvf0Var4.get(), (xk60) xvf0Var3.get());
            case 8:
                return new com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.c((tt2) xvf0Var15.get(), (dqe0) xvf0Var14.get(), (ck31) xvf0Var13.get(), (jjv0) xvf0Var12.get(), (arv0) xvf0Var11.get(), (i270) xvf0Var10.get(), (po21) xvf0Var9.get(), (ru.yandex.taxi.deeplinks.e) xvf0Var.get(), (ru.yandex.taxi.shortcuts.interactors.a) ((swb) xvf0Var7).get(), (c4r0) xvf0Var8.get(), this.k, (icv0) xvf0Var6.get(), (kpi0) xvf0Var5.get(), (c8r) xvf0Var4.get(), (oep0) xvf0Var3.get());
            case 9:
                return new v((tse) xvf0Var15.get(), i5m.a(xvf0Var14), i5m.a(xvf0Var13), i5m.a(xvf0Var12), i5m.a(xvf0Var11), (s) xvf0Var10.get(), i5m.a(xvf0Var9), i5m.a(xvf0Var), i5m.a(xvf0Var8), (t6y0) xvf0Var2.get(), (f0) xvf0Var7.get(), (jc00) xvf0Var6.get(), (com.yandex.go.taxi.order.promo_plaques.domain.c) xvf0Var5.get(), (b630) ((bhx) xvf0Var4).get(), (m) xvf0Var3.get());
            default:
                return new s0((Context) xvf0Var15.get(), (u02) xvf0Var14.get(), (k) xvf0Var13.get(), (hqe) xvf0Var12.get(), (ru.yandex.taxi.am.internal.b) xvf0Var11.get(), (ep90) xvf0Var10.get(), (g) xvf0Var9.get(), (y50) xvf0Var.get(), (lm) xvf0Var8.get(), (ru.yandex.taxi.activity.g) xvf0Var2.get(), (ru.yandex.taxi.startup.launch.c) xvf0Var7.get(), (ckf0) xvf0Var6.get(), (evx) xvf0Var5.get(), (tt2) xvf0Var4.get(), (pj) ((x) xvf0Var3).get());
        }
    }

    public sve(nup0 nup0Var, e8b0 e8b0Var, e8b0 e8b0Var2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, gwb0 gwb0Var, xvf0 xvf0Var8, axy axyVar, ziv zivVar, eqh eqhVar) {
        this.a = 7;
        this.l = nup0Var;
        this.b = e8b0Var;
        this.c = e8b0Var2;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
        this.j = xvf0Var7;
        this.k = gwb0Var;
        this.m = xvf0Var8;
        this.n = axyVar;
        this.o = zivVar;
        this.p = eqhVar;
    }

    public sve(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, swb swbVar, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, qii qiiVar, umt0 umt0Var, oe oeVar, eqh eqhVar, f870 f870Var, xvf0 xvf0Var8, xvf0 xvf0Var9) {
        this.a = 4;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.l = swbVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.m = qiiVar;
        this.n = umt0Var;
        this.i = oeVar;
        this.j = eqhVar;
        this.k = f870Var;
        this.o = xvf0Var8;
        this.p = xvf0Var9;
    }

    public sve(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, eqh eqhVar, if9 if9Var, swb swbVar, swo0 swo0Var, eqh eqhVar2, sku0 sku0Var, pqd0 pqd0Var, xvf0 xvf0Var7, eqh eqhVar3) {
        this.a = 8;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = eqhVar;
        this.i = if9Var;
        this.l = swbVar;
        this.j = swo0Var;
        this.k = eqhVar2;
        this.m = sku0Var;
        this.n = pqd0Var;
        this.o = xvf0Var7;
        this.p = eqhVar3;
    }

    public sve(eqh eqhVar, nf nfVar, eqh eqhVar2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, if9 if9Var, eqh eqhVar3, gw7 gw7Var, xvf0 xvf0Var4, zlf0 zlf0Var, x2b x2bVar, n3w n3wVar, xvf0 xvf0Var5, lyh lyhVar) {
        this.a = 0;
        this.b = eqhVar;
        this.c = nfVar;
        this.d = eqhVar2;
        this.e = xvf0Var;
        this.f = xvf0Var2;
        this.g = xvf0Var3;
        this.l = if9Var;
        this.h = eqhVar3;
        this.m = gw7Var;
        this.i = xvf0Var4;
        this.n = zlf0Var;
        this.o = x2bVar;
        this.j = n3wVar;
        this.k = xvf0Var5;
        this.p = lyhVar;
    }

    public sve(cuo cuoVar, b8w b8wVar, c8w c8wVar, d701 d701Var, i020 i020Var, pqd0 pqd0Var, xvf0 xvf0Var, rxm0 rxm0Var, nup0 nup0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, dld0 dld0Var, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6) {
        this.a = 1;
        this.b = cuoVar;
        this.c = b8wVar;
        this.l = c8wVar;
        this.m = d701Var;
        this.n = i020Var;
        this.o = pqd0Var;
        this.d = xvf0Var;
        this.e = rxm0Var;
        this.f = nup0Var;
        this.g = xvf0Var2;
        this.h = xvf0Var3;
        this.i = dld0Var;
        this.j = xvf0Var4;
        this.k = xvf0Var5;
        this.p = xvf0Var6;
    }
}
