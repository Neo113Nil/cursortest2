package defpackage;

import android.app.Activity;
import android.content.Context;
import com.squareup.moshi.Moshi;
import com.yandex.go.mainscreen.superapp.popup.data.experiments.d;
import com.yandex.go.taxi.order.domain.interactors.c;
import com.yandex.go.taxi.order.performer.a;
import com.yandex.go.taxi.order.performer.b;
import com.yandex.messaging.internal.a0;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.layers.source.factory.componentfactory.w;
import ru.yandex.taxi.superapp.address.j;

/* loaded from: classes9.dex */
public final class xsi implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public xsi(o0t o0tVar, o0t o0tVar2, xvf0 xvf0Var) {
        this.a = 21;
        this.d = o0tVar;
        this.c = o0tVar2;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new wsi((vf41) ((d441) xvf0Var2).get(), (g) xvf0Var3.get(), (fn21) xvf0Var.get());
            case 1:
                return new rpj((tt2) xvf0Var3.get(), (pwy0) xvf0Var.get(), (a22) ((qii) xvf0Var2).get());
            case 2:
                return new krj((tt2) xvf0Var3.get(), (pwy0) xvf0Var.get(), (mrj) ((t6i) xvf0Var2).get());
            case 3:
                return new azj((Context) xvf0Var3.get(), (com.yandex.messaging.internal.g) ((a4t) xvf0Var2).get(), (db4) xvf0Var.get());
            case 4:
                return new cdm((oep0) xvf0Var3.get(), (lyh) xvf0Var2, (rcm) xvf0Var.get());
            case 5:
                return new a((eo5) ((f870) xvf0Var2).get(), (b) xvf0Var3.get(), (c) ((f870) xvf0Var).get());
            case 6:
                return new zzo((a0p) xvf0Var3.get(), (o3h) xvf0Var.get(), (t61) ((zzg) xvf0Var2).get());
            case 7:
                return new com.yandex.go.superapp.impl.delegate.a((y9w0) xvf0Var3.get(), (j) ((rmv0) xvf0Var2).get(), (com.yandex.go.superapp.impl.interactor.a) xvf0Var.get());
            case 8:
                return new com.yandex.go.mainscreen.superapp.popup.data.state.scenario.c((d) ((lag) xvf0Var2).get(), (jb7) ((qsn) xvf0Var3).get(), (com.yandex.go.mainscreen.superapp.popup.data.state.scenario.b) ((g3p) xvf0Var).get());
            case 9:
                return new ru.yandex.taxi.messenger.fallback.a((com.yandex.go.lifecycle.a) xvf0Var3.get(), (t6i) xvf0Var2, (ru.yandex.taxi.messenger.a) xvf0Var.get());
            case 10:
                return new s9p((rqo) xvf0Var3.get(), (zuj0) xvf0Var.get(), (xih) ((vve) xvf0Var2).get());
            case 11:
                return new com.yandex.go.favorites.router.a((x4) xvf0Var2, xvf0Var3, (ru.yandex.taxi.favorites.address.api.experiment.a) xvf0Var.get());
            case 12:
                return new fc9((com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var3.get(), i5m.a(xvf0Var), (cgp0) ((n6o0) xvf0Var2).get(), 1);
            case 13:
                return new ru.yandex.taxi.favorites.suggest.b((on2) xvf0Var3.get(), (uhp) ((p9p) xvf0Var2).get(), (yhp) ((p9p) xvf0Var).get());
            case 14:
                return new dkr((oep0) xvf0Var3.get(), (edf0) xvf0Var2, (hef0) xvf0Var.get());
            case 15:
                return new ru.yandex.taxi.perf.frame.a((Activity) xvf0Var3.get(), (tse) xvf0Var.get(), (r1s) ((mwq) xvf0Var2).get());
            case 16:
                return new p7t((com.yandex.messaging.internal.backendconfig.a) xvf0Var3.get(), (u4r) ((p9p) xvf0Var2).get(), (kse) xvf0Var.get());
            case 17:
                a0 a0Var = (a0) ((r2i) xvf0Var2).get();
                return new nft(a0Var, (kse) xvf0Var.get());
            case 18:
                return new com.yandex.go.feedsdk.log.c((tse) xvf0Var3.get(), (tt2) xvf0Var.get(), (lqq) ((o0t) xvf0Var2).get());
            case 19:
                return new apt((ju6) xvf0Var3.get(), (yo40) ((vrt0) xvf0Var2).get(), (qsu) xvf0Var.get());
            case 20:
                return new kqt((h2t) ((cnt) xvf0Var2).get(), (rrt0) xvf0Var3.get(), (fva0) xvf0Var.get());
            case 21:
                return new tqt((uqt) ((o0t) xvf0Var2).get(), i5m.a((o0t) xvf0Var), (tt2) xvf0Var3.get());
            case 22:
                return new m3u((Context) xvf0Var3.get(), (k0b0) ((i0b0) xvf0Var2).get(), (q7y) xvf0Var.get());
            case 23:
                return new w((tt2) ((m2g) xvf0Var2).get(), (sxx) ((etx) xvf0Var3).get(), (ru.yandex.taxi.map_common.map.utils.a) ((n2g) xvf0Var).get());
            case 24:
                return new com.yandex.go.inapp_calls.navigation.loader.a((com.yandex.go.inapp_calls.repository.c) xvf0Var3.get(), (ea0) xvf0Var2, (njv) xvf0Var.get());
            case 25:
                return new fuv(i5m.a(xvf0Var3), xvf0Var, (dt00) xvf0Var2);
            case 26:
                return new com.yandex.go.intentprocessor.b((tse) xvf0Var3.get(), (Activity) xvf0Var.get(), (c8w) xvf0Var2);
            case 27:
                return new com.yandex.go.intentprocessor.d((lg21) xvf0Var3.get(), (ha1) xvf0Var.get(), i5m.a((nf) xvf0Var2));
            case 28:
                return new zhw((wrr) ((lcw) xvf0Var2).get(), (siw) xvf0Var3.get(), (ibw) xvf0Var.get());
            default:
                String str = (String) xvf0Var3.get();
                ((w8g) xvf0Var2).get();
                return yqw.a((Moshi) xvf0Var.get(), str);
        }
    }

    public /* synthetic */ xsi(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
    }

    public /* synthetic */ xsi(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
    }

    public /* synthetic */ xsi(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = v7pVar;
    }
}
