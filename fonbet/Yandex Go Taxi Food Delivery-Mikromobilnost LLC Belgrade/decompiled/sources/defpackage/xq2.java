package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.g;
import com.yandex.go.models.b;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.m;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.communications.c;
import ru.yandex.taxi.deeplinks.e;
import ru.yandex.taxi.order.l;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.stories.data.caching.a;
import ru.yandex.taxi.widget.d;

/* loaded from: classes9.dex */
public final class xq2 implements v7p {
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
    public final xvf0 q;
    public final xvf0 r;
    public final xvf0 s;
    public final xvf0 t;
    public final xvf0 u;
    public final xvf0 v;
    public final xvf0 w;
    public final xvf0 x;

    public /* synthetic */ xq2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, xvf0 xvf0Var18, xvf0 xvf0Var19, xvf0 xvf0Var20, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
        this.o = v7pVar;
        this.p = v7pVar2;
        this.q = v7pVar3;
        this.r = xvf0Var14;
        this.s = xvf0Var15;
        this.t = xvf0Var16;
        this.u = xvf0Var17;
        this.v = xvf0Var18;
        this.w = xvf0Var19;
        this.x = xvf0Var20;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.x;
        xvf0 xvf0Var2 = this.w;
        xvf0 xvf0Var3 = this.v;
        xvf0 xvf0Var4 = this.u;
        xvf0 xvf0Var5 = this.t;
        xvf0 xvf0Var6 = this.s;
        xvf0 xvf0Var7 = this.r;
        xvf0 xvf0Var8 = this.q;
        xvf0 xvf0Var9 = this.p;
        xvf0 xvf0Var10 = this.n;
        xvf0 xvf0Var11 = this.m;
        xvf0 xvf0Var12 = this.l;
        xvf0 xvf0Var13 = this.k;
        xvf0 xvf0Var14 = this.j;
        xvf0 xvf0Var15 = this.i;
        xvf0 xvf0Var16 = this.h;
        xvf0 xvf0Var17 = this.g;
        xvf0 xvf0Var18 = this.f;
        xvf0 xvf0Var19 = this.e;
        xvf0 xvf0Var20 = this.d;
        xvf0 xvf0Var21 = this.c;
        xvf0 xvf0Var22 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) xvf0Var22.get();
                wnt wntVar = (wnt) xvf0Var21.get();
                l lVar = (l) xvf0Var20.get();
                kay0 kay0Var = (kay0) xvf0Var19.get();
                pav pavVar = (pav) xvf0Var17.get();
                a aVar = (a) xvf0Var16.get();
                r820 r820Var = (r820) xvf0Var15.get();
                ru.yandex.taxi.communications.common.repository.a aVar2 = (ru.yandex.taxi.communications.common.repository.a) xvf0Var14.get();
                tay0 tay0Var = (tay0) xvf0Var12.get();
                uwx0 uwx0Var = (uwx0) xvf0Var11.get();
                pdc pdcVar = (pdc) xvf0Var10.get();
                return new tlu0(context, tay0Var, pavVar, aVar, (lay0) this.o.get(), (n9y0) xvf0Var9.get(), (zpf0) xvf0Var8.get(), (d) xvf0Var7.get(), kay0Var, new o370(lVar), (z1u) xvf0Var6.get(), uwx0Var, pdcVar, (eyu0) xvf0Var5.get(), (h8u0) xvf0Var4.get(), (zuj0) xvf0Var3.get(), r820Var, aVar2, (ru.yandex.taxi.communications.d) xvf0Var2.get(), wntVar, (c) xvf0Var.get());
            case 1:
                Lifecycle lifecycle = (Lifecycle) xvf0Var22.get();
                tse tseVar = (tse) xvf0Var21.get();
                dqe0 dqe0Var = (dqe0) xvf0Var20.get();
                ck31 ck31Var = (ck31) xvf0Var19.get();
                jjv0 jjv0Var = (jjv0) xvf0Var18.get();
                arv0 arv0Var = (arv0) xvf0Var17.get();
                oep0 oep0Var = (oep0) xvf0Var16.get();
                jc00 jc00Var = (jc00) xvf0Var14.get();
                b bVar = (b) xvf0Var11.get();
                c4r0 c4r0Var = (c4r0) xvf0Var10.get();
                kpi0 kpi0Var = (kpi0) xvf0Var9.get();
                c8r c8rVar = (c8r) xvf0Var8.get();
                yaj0 yaj0Var = (yaj0) xvf0Var7.get();
                g gVar = (g) xvf0Var6.get();
                mjx0 mjx0Var = (mjx0) xvf0Var5.get();
                m30 m30Var = (m30) xvf0Var4.get();
                c4w0 c4w0Var = (c4w0) xvf0Var2.get();
                return new ru.yandex.taxi.logistics.common.a(lifecycle, tseVar, dqe0Var, ck31Var, jjv0Var, arv0Var, oep0Var, jc00Var, bVar, c4r0Var, this.o, kpi0Var, c8rVar, yaj0Var, gVar, mjx0Var, m30Var, c4w0Var);
            default:
                return new f((com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) xvf0Var22.get(), (vgw) xvf0Var21.get(), (com.yandex.go.taxi.intercity.dashboard.impl.experiment.c) xvf0Var20.get(), (klw) xvf0Var19.get(), (whw) xvf0Var18.get(), (axm) xvf0Var17.get(), (y1s) xvf0Var16.get(), (com.yandex.go.route.interactor.c) xvf0Var15.get(), (com.yandex.go.route.interactor.b) xvf0Var14.get(), (j) xvf0Var13.get(), (ck31) xvf0Var12.get(), (uze0) xvf0Var11.get(), (e) xvf0Var10.get(), (jtq0) this.o.get(), (com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.g) xvf0Var9.get(), (zhw) xvf0Var8.get(), (m) xvf0Var7.get(), (RequirementsChangedNotifier) xvf0Var6.get(), (ibn) xvf0Var5.get(), (o) xvf0Var4.get(), (apw) xvf0Var3.get(), (oow) xvf0Var2.get(), (w9w) xvf0Var.get());
        }
    }

    public xq2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, eqh eqhVar, xvf0 xvf0Var7, eqh eqhVar2, xvf0 xvf0Var8, kpp0 kpp0Var, xvf0 xvf0Var9, xvf0 xvf0Var10, swo0 swo0Var, eqh eqhVar3, pqd0 pqd0Var, xvf0 xvf0Var11, n4g0 n4g0Var, rxm0 rxm0Var, h90 h90Var, xvf0 xvf0Var12, xvf0 xvf0Var13, sve sveVar, xvf0 xvf0Var14) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = eqhVar;
        this.i = xvf0Var7;
        this.j = xvf0Var8;
        this.k = kpp0Var;
        this.l = xvf0Var9;
        this.m = xvf0Var10;
        this.n = swo0Var;
        this.o = eqhVar3;
        this.p = pqd0Var;
        this.q = xvf0Var11;
        this.r = n4g0Var;
        this.s = rxm0Var;
        this.t = h90Var;
        this.u = xvf0Var12;
        this.v = xvf0Var13;
        this.w = sveVar;
        this.x = xvf0Var14;
    }
}
