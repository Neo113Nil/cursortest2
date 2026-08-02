package defpackage;

import android.content.Context;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.places.impl.domain.interactors.map.e;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import com.yandex.go.scooters.data.ScootersOfferApi;
import com.yandex.go.scooters.passes.domain.i;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.z;
import com.yandex.go.superapp.order.multi.old.view.g;
import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.taxi.order.view.l;
import com.yandex.messaging.internal.storage.folders.d;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.p;

/* loaded from: classes13.dex */
public final class vo3 implements v7p {
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

    public /* synthetic */ vo3(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, int i) {
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
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.h;
        xvf0 xvf0Var2 = this.l;
        xvf0 xvf0Var3 = this.k;
        xvf0 xvf0Var4 = this.j;
        xvf0 xvf0Var5 = this.i;
        xvf0 xvf0Var6 = this.g;
        xvf0 xvf0Var7 = this.f;
        xvf0 xvf0Var8 = this.e;
        xvf0 xvf0Var9 = this.d;
        xvf0 xvf0Var10 = this.c;
        xvf0 xvf0Var11 = this.b;
        switch (i) {
            case 0:
                nk21 nk21Var = (nk21) xvf0Var11.get();
                ouu ouuVar = (ouu) xvf0Var10.get();
                return new to3(nk21Var, ouuVar, (evu) xvf0Var8.get(), (oyq) xvf0Var7.get(), (a1r) xvf0Var6.get(), (bbj) xvf0Var.get(), (q3f0) xvf0Var5.get(), (lqo) xvf0Var4.get(), (q6v) xvf0Var3.get(), (b7m) xvf0Var2.get());
            case 1:
                Context context = (Context) xvf0Var11.get();
                tse tseVar = (tse) xvf0Var10.get();
                a aVar = (a) xvf0Var9.get();
                oep0 oep0Var = (oep0) xvf0Var8.get();
                l lVar = (l) xvf0Var7.get();
                k48 k48Var = (k48) xvf0Var6.get();
                c cVar = (c) xvf0Var5.get();
                clk0 clk0Var = (clk0) xvf0Var4.get();
                com.yandex.go.taxi.order.multi.feed.domain.a aVar2 = (com.yandex.go.taxi.order.multi.feed.domain.a) xvf0Var3.get();
                return new g(context, tseVar, aVar, oep0Var, lVar, k48Var, this.h, cVar, clk0Var, aVar2);
            case 2:
                return new uac0((com.yandex.go.places.impl.domain.interactors.common.a) xvf0Var11.get(), (b) xvf0Var10.get(), (go80) xvf0Var9.get(), (yac0) xvf0Var8.get(), (mg80) xvf0Var7.get(), (ah00) xvf0Var6.get(), (e) xvf0Var.get(), (com.yandex.go.places.experiments.tabbar.b) xvf0Var5.get(), (qac0) xvf0Var4.get(), (u050) xvf0Var3.get(), (com.yandex.go.places.experiments.flex.b) xvf0Var2.get());
            case 3:
                return new com.yandex.go.scooters.data.a((ScootersOfferApi) xvf0Var11.get(), (com.yandex.go.scooters.data.mapper.a) xvf0Var10.get(), (po21) xvf0Var9.get(), (fpm0) xvf0Var8.get(), (ru.yandex.taxi.scooters.data.a) xvf0Var7.get(), (h) xvf0Var6.get(), (p) xvf0Var.get(), (rko0) xvf0Var5.get(), (com.yandex.go.scooters.offers.v2.analytics.c) xvf0Var4.get(), (com.yandex.go.scooters.insurance.data.b) xvf0Var3.get(), (m7n0) xvf0Var2.get());
            case 4:
                return new com.yandex.go.scooters.passes.domain.h((tse) xvf0Var11.get(), (yfo0) xvf0Var10.get(), (com.yandex.go.scooters.passes.data.jason.a) xvf0Var9.get(), (i) xvf0Var8.get(), (tco0) xvf0Var7.get(), (vfo0) xvf0Var6.get(), (com.yandex.go.scooters.payments.domain.a) xvf0Var.get(), (com.yandex.go.scooters.passes.domain.g) xvf0Var5.get(), (xco0) xvf0Var4.get(), (ndo0) xvf0Var3.get(), (rdo0) xvf0Var2.get());
            case 5:
                return new com.yandex.go.taxi.main.shortcuts.interactors.c((ru.yandex.taxi.shortcuts.interactors.a) xvf0Var11.get(), (ru.yandex.taxi.location.user.c) xvf0Var10.get(), (com.yandex.go.route.interactor.b) xvf0Var9.get(), (h1s0) xvf0Var8.get(), (hcu) xvf0Var7.get(), (b8r) xvf0Var6.get(), (gvh) xvf0Var.get(), (jjv0) xvf0Var5.get(), (dkv0) xvf0Var4.get(), (mxb) xvf0Var3.get(), (com.yandex.go.taxi.tariffs.internal.interactor.a) xvf0Var2.get());
            case 6:
                return new y5u0((k020) xvf0Var11.get(), (u5b) xvf0Var10.get(), (bdu0) xvf0Var9.get(), i5m.a(xvf0Var8), (h9b) xvf0Var7.get(), i5m.a(xvf0Var6), i5m.a(xvf0Var), (ney0) xvf0Var5.get(), (glf) xvf0Var4.get(), (d) xvf0Var3.get(), (s5b0) xvf0Var2.get());
            default:
                return new com.yandex.go.superapp.discovery.map.impl.navigation.main.v2.a((Context) xvf0Var11.get(), (w030) xvf0Var10.get(), (ktv0) xvf0Var9.get(), (oyv0) xvf0Var8.get(), (xyv0) xvf0Var7.get(), (atv0) xvf0Var6.get(), (z) xvf0Var.get(), (com.yandex.go.superapp.discovery.map.impl.experiments.v2.p) xvf0Var5.get(), (y50) xvf0Var4.get(), (n4w0) xvf0Var3.get(), (rvv0) xvf0Var2.get());
        }
    }
}
