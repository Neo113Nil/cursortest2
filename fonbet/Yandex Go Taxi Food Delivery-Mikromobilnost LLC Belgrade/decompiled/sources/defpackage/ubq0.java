package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.go.route.interactor.b;
import com.yandex.go.route.interactor.c;
import com.yandex.go.summary.requirements.list.requirementgroup.d;
import com.yandex.go.taxi.order.net.xiva.n;
import com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi;
import com.yandex.go.zone.repository.o;
import com.yandex.messaging.domain.folders.a;
import com.yandex.messaging.internal.g;
import com.yandex.messaging.internal.translator.k;
import com.yandex.messaging.ui.folders.selectDialog.e;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardFragment;
import java.util.Map;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.v;
import ru.yandex.taxi.preorder.source.domain.w;
import ru.yandex.taxi.preorder.summary.selector.ui.interactor.f;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.summary.requirements.list.interactors.u0;
import ru.yandex.taxi.surge.interactor.q;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes14.dex */
public final class ubq0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public ubq0(dag dagVar, dag dagVar2, dag dagVar3, dag dagVar4, w7y0 w7y0Var, dag dagVar5, eag eagVar) {
        this.a = 14;
        this.f = dagVar;
        this.g = dagVar2;
        this.h = dagVar3;
        this.c = dagVar4;
        this.d = w7y0Var;
        this.b = dagVar5;
        this.e = eagVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.h;
        xvf0 xvf0Var2 = this.g;
        xvf0 xvf0Var3 = this.f;
        xvf0 xvf0Var4 = this.e;
        xvf0 xvf0Var5 = this.d;
        xvf0 xvf0Var6 = this.c;
        xvf0 xvf0Var7 = this.b;
        switch (i) {
            case 0:
                return new e((mbq0) ((n3w) xvf0Var3).a, (t7t) ((wrh) xvf0Var2).get(), (o4t) ((wrh) xvf0Var).get(), (a) xvf0Var7.get(), (twi0) xvf0Var6.get(), (g) xvf0Var5.get(), (com.yandex.messaging.internal.backendconfig.a) xvf0Var4.get());
            case 1:
                wiq0 wiq0Var = (wiq0) xvf0Var7.get();
                fk31 fk31Var = (fk31) ((mg11) xvf0Var3).get();
                aqv0 aqv0Var = (aqv0) ((miv0) xvf0Var2).get();
                h3y a = i5m.a(xvf0Var6);
                pwy0 pwy0Var = (pwy0) xvf0Var5.get();
                return new f(wiq0Var, fk31Var, aqv0Var, a, pwy0Var, (bgx0) xvf0Var.get());
            case 2:
                return new z4m0((pdc) xvf0Var7.get(), (zuj0) xvf0Var6.get(), (b) xvf0Var5.get(), (wiq0) xvf0Var4.get(), (c) xvf0Var3.get(), (zxs0) ((fat0) xvf0Var2).get(), (j0g) ((fwc) xvf0Var).get(), 3);
            case 3:
                return new lgt0((Context) xvf0Var7.get(), (ah00) xvf0Var6.get(), (qy41) xvf0Var5.get(), (rh00) xvf0Var4.get(), (uy41) ((z7y0) xvf0Var3).get(), (r) xvf0Var2.get(), i5m.a(xvf0Var));
            case 4:
                return new v((dqe0) xvf0Var7.get(), (wb1) xvf0Var6.get(), (ftx) xvf0Var5.get(), (w) xvf0Var4.get(), (jjt0) xvf0Var3.get(), i5m.a(xvf0Var2), (com.yandex.go.preorder.address.a) ((kdb) xvf0Var).get());
            case 5:
                return new d((Context) xvf0Var7.get(), (w030) xvf0Var6.get(), (ohj0) xvf0Var5.get(), (khj0) xvf0Var4.get(), (roe0) ((n3w) xvf0Var3).a, (tgb0) xvf0Var2);
            case 6:
                return scc.g((bby0) ((uzu0) xvf0Var3).get(), (hvq) ((dag) xvf0Var2).get(), (i780) ((dag) xvf0Var).get(), (z18) ((t4) xvf0Var7).get(), (t42) ((lk) xvf0Var6).get(), (t42) ((lq40) xvf0Var5).get(), (t42) ((rbx0) xvf0Var4).get());
            case 7:
                return new ozu0((ahr) xvf0Var7.get(), (Map) xvf0Var6.get(), (rwo) xvf0Var5.get(), (yb8) xvf0Var4.get(), (jcp0) xvf0Var3.get(), (OkHttpClient) xvf0Var2.get(), (String) ((njp) xvf0Var).get());
            case 8:
                return new q((ru.yandex.taxi.surge.repository.b) ((rag) xvf0Var3).get(), (tt2) ((nag) xvf0Var2).get(), (wiq0) ((rag) xvf0Var).get(), (ru.yandex.taxi.promotions.factory.a) ((vd) xvf0Var7).get(), (uze0) ((rag) xvf0Var6).get(), (pwy0) ((sag) xvf0Var5).get(), (ru.yandex.taxi.surge.mapper.a) ((jpn0) xvf0Var4).get());
            case 9:
                return new yuw0((i130) xvf0Var7.get(), (uuw0) xvf0Var6.get(), (xuw0) xvf0Var5.get(), (rqw0) xvf0Var4.get(), (xcv0) xvf0Var3.get(), (ahu) xvf0Var2, this.h, 0);
            case 10:
                return new lqx0((bbx0) xvf0Var7.get(), (pav) xvf0Var6.get(), ((Boolean) ((n3w) xvf0Var3).a).booleanValue(), (k051) ((vag) xvf0Var2).get(), (f1f0) ((uag) xvf0Var).get(), (ru.yandex.taxi.perf.screen.c) ((uag) xvf0Var5).get(), (com.yandex.go.taxi.summary.shared.lifecycle.a) ((uag) xvf0Var4).get());
            case 11:
                return new com.yandex.go.taxi.order.feed.data.mapper.c((com.yandex.go.mainscreen.superapp.impl.foundation.domain.f) ((o4g) xvf0Var3).get(), (vit) ((o4g) xvf0Var2).get(), (o) ((o4g) xvf0Var).get(), (com.yandex.go.zone.repository.r) ((o4g) xvf0Var6).get(), (q1m0) ((o4g) xvf0Var5).get(), (wnt) ((o4g) xvf0Var4).get(), (bc2) xvf0Var7.get());
            case 12:
                return new z4m0((Context) ((n3w) xvf0Var3).a, (qcp0) ((ibg) xvf0Var2).get(), (hwy0) ((ibg) xvf0Var).get(), (npy0) xvf0Var7.get(), (dci) ((gbg) xvf0Var6).get(), (jwh) ((gbg) xvf0Var5).get(), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var4).get(), 9);
            case 13:
                return new ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper.c((g191) ((c1) xvf0Var3).get(), (xk4) ((yk4) xvf0Var2).get(), (yfa) ((peb) xvf0Var).get(), (dqu) xvf0Var7.get(), (oh4) ((qh4) xvf0Var6).get(), (oh4) ((qh4) xvf0Var5).get(), (q8s) ((jyf) xvf0Var4).get());
            case 14:
                return new mgz0((jtq0) ((dag) xvf0Var3).get(), (vze0) ((dag) xvf0Var2).get(), (xdf) ((dag) xvf0Var).get(), (ine0) ((dag) xvf0Var6).get(), (egz0) ((w7y0) xvf0Var5).get(), (MainUiAvailabilityMonitor) xvf0Var7.get(), (lgz0) ((eag) xvf0Var4).get());
            case 15:
                ((nbg) xvf0Var3).get();
                bdp0 bdp0Var = (bdp0) xvf0Var4.get();
                return new vf01(bdp0Var, ((br00) xvf0Var).a);
            case 16:
                return new u0((vfx0) xvf0Var7.get(), (ru.yandex.taxi.orderforanother.repository.a) ((v0g) xvf0Var3).get(), (roj0) xvf0Var6.get(), (dqe0) ((w0g) xvf0Var2).get(), (g580) xvf0Var5.get(), (RequirementsChangedNotifier) xvf0Var4.get(), i5m.a(xvf0Var));
            case 17:
                xv01 xv01Var = (xv01) ((n3w) xvf0Var3).a;
                tn01 tn01Var = (tn01) ((qbg) xvf0Var2).get();
                ro01 ro01Var = (ro01) ((qbg) xvf0Var).get();
                sb6 sb6Var = (sb6) ((vs3) xvf0Var7).get();
                mjt0 mjt0Var = (mjt0) ((qbg) xvf0Var6).get();
                anp0 anp0Var = (anp0) ((qbg) xvf0Var5).get();
                ((ln01) xvf0Var4).get();
                return new TransfersDashboardFragment(xv01Var, tn01Var, ro01Var, sb6Var, mjt0Var, anp0Var, null);
            case 18:
                return new k((Lifecycle) xvf0Var7.get(), (com.yandex.messaging.internal.translator.g) xvf0Var6.get(), (lqo) xvf0Var5.get(), (mdb) xvf0Var4.get(), (w0c) ((zfa) xvf0Var3).get(), (r99) ((s90) xvf0Var2).get(), (nz01) xvf0Var.get());
            case 19:
                return new oy7((Context) xvf0Var7.get(), (w030) xvf0Var6.get(), (o7r0) ((qcz0) xvf0Var2).get(), (dxu) xvf0Var5.get(), (a2v) xvf0Var4.get(), (bb11) xvf0Var.get(), (za11) ((n3w) xvf0Var3).a);
            case 20:
                return new com.ybsdk.feature.main.internal.screens.userCards.b((com.ybsdk.feature.main.internal.domain.userCards.a) ((tw11) xvf0Var3).get(), (n800) ((u1g) xvf0Var2).get(), (r90) ((u1g) xvf0Var).get(), (AppAnalyticsReporter) ((u2g) xvf0Var7).get(), (com.ybsdk.widgets.common.shimmer.b) ((u2g) xvf0Var6).get(), (rb00) ((u2g) xvf0Var5).get(), (tfl0) ((u2g) xvf0Var4).get());
            case 21:
                return new UserProfileJsNativeApi((Context) ((s1g) xvf0Var2).get(), (xf41) xvf0Var7.get(), (com.yandex.go.repositories.e) xvf0Var6.get(), (bs21) xvf0Var5.get(), (tt2) xvf0Var4.get(), (ipu0) ((n3w) xvf0Var3).a, (wnt) ((s1g) xvf0Var).get());
            case 22:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.d((jj31) ((mcg) xvf0Var3).b.a, (lj31) ((mcg) xvf0Var2).b.b, (kcz0) ((flx0) xvf0Var).get(), (j00) ((nb11) xvf0Var7).get(), (cjw0) ((gpx0) xvf0Var6).get(), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((lcg) xvf0Var5).get(), (hwy0) ((lcg) xvf0Var4).get());
            case 23:
                return new uy31((yuj0) ((gbg) xvf0Var3).get(), (ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.c) ((ibg) xvf0Var2).get(), (com.yandex.delivery.utils.dialogmanager.impl.b) ((gbg) xvf0Var).get(), (g701) ((hbg) xvf0Var5).b.b, (ru.yandex.taxi.logistics.sdk.tracking.impl.domain.b) xvf0Var7.get(), (wiv) xvf0Var6.get(), (st2) ((gbg) xvf0Var4).get());
            case 24:
                return new i541((Context) ((jcg) xvf0Var3).get(), (com.yandex.go.walking.navigation.impl.ui.overlay.e) ((kdv0) xvf0Var2).get(), (com.yandex.go.places.impl.ui.common.map.location.a) ((pcg) xvf0Var).get(), (pwy0) ((pcg) xvf0Var7).get(), (ah00) ((pcg) xvf0Var6).get(), (sgu0) ((pcg) xvf0Var5).get(), (no21) ((pcg) xvf0Var4).get());
            case 25:
                return new n((String) xvf0Var7.get(), (com.yandex.go.taxi_order.ws.d) ((eag) xvf0Var3).get(), (bay0) xvf0Var6.get(), (dw41) xvf0Var5.get(), (com.yandex.go.taxi.order.provider.a) xvf0Var4.get(), (te51) ((zd51) xvf0Var2).get(), (jtq0) xvf0Var.get());
            case 26:
                return new hn41(i5m.a(xvf0Var7), i5m.a(xvf0Var6), i5m.a(xvf0Var5), i5m.a(xvf0Var4), i5m.a((n3w) xvf0Var3), i5m.a((tcg) xvf0Var2), (bpt) ((tcg) xvf0Var).get());
            default:
                return new d151((z22) xvf0Var7.get(), (hk3) xvf0Var6.get(), (Context) xvf0Var5.get(), (DefaultEnvironment) xvf0Var4.get(), (dn90) xvf0Var3.get(), (zn90) ((l180) xvf0Var2).get(), (Payer) xvf0Var.get());
        }
    }

    public /* synthetic */ ubq0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.f = xvf0Var;
        this.g = xvf0Var2;
        this.h = xvf0Var3;
        this.b = xvf0Var4;
        this.c = xvf0Var5;
        this.d = xvf0Var6;
        this.e = xvf0Var7;
    }

    public /* synthetic */ ubq0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    public /* synthetic */ ubq0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.f = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.g = v7pVar;
        this.h = xvf0Var6;
    }

    public ubq0(h3g h3gVar, n3w n3wVar, qcz0 qcz0Var, xvf0 xvf0Var, n3w n3wVar2, flx0 flx0Var, n3w n3wVar3) {
        this.a = 19;
        this.b = h3gVar;
        this.c = n3wVar;
        this.g = qcz0Var;
        this.d = xvf0Var;
        this.e = n3wVar2;
        this.h = flx0Var;
        this.f = n3wVar3;
    }

    public ubq0(gbg gbgVar, ibg ibgVar, gbg gbgVar2, hbg hbgVar, xvf0 xvf0Var, xvf0 xvf0Var2, gbg gbgVar3) {
        this.a = 23;
        this.f = gbgVar;
        this.g = ibgVar;
        this.h = gbgVar2;
        this.d = hbgVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = gbgVar3;
    }

    public ubq0(xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar, vag vagVar, uag uagVar, uag uagVar2, uag uagVar3) {
        this.a = 10;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = n3wVar;
        this.g = vagVar;
        this.h = uagVar;
        this.d = uagVar2;
        this.e = uagVar3;
    }

    public ubq0(s1g s1gVar, njp njpVar, s1g s1gVar2, d701 d701Var, s1g s1gVar3, n3w n3wVar, s1g s1gVar4) {
        this.a = 21;
        this.g = s1gVar;
        this.b = njpVar;
        this.c = s1gVar2;
        this.d = d701Var;
        this.e = s1gVar3;
        this.f = n3wVar;
        this.h = s1gVar4;
    }

    public ubq0(o4g o4gVar, o4g o4gVar2, o4g o4gVar3, o4g o4gVar4, o4g o4gVar5, o4g o4gVar6, xvf0 xvf0Var) {
        this.a = 11;
        this.f = o4gVar;
        this.g = o4gVar2;
        this.h = o4gVar3;
        this.c = o4gVar4;
        this.d = o4gVar5;
        this.e = o4gVar6;
        this.b = xvf0Var;
    }

    public ubq0(xvf0 xvf0Var, mg11 mg11Var, miv0 miv0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = 1;
        this.b = xvf0Var;
        this.f = mg11Var;
        this.g = miv0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.h = xvf0Var5;
    }

    public ubq0(xvf0 xvf0Var, v0g v0gVar, xvf0 xvf0Var2, w0g w0gVar, xvf0 xvf0Var3, w0g w0gVar2, gpx0 gpx0Var) {
        this.a = 16;
        this.b = xvf0Var;
        this.f = v0gVar;
        this.c = xvf0Var2;
        this.g = w0gVar;
        this.d = xvf0Var3;
        this.e = w0gVar2;
        this.h = gpx0Var;
    }
}
