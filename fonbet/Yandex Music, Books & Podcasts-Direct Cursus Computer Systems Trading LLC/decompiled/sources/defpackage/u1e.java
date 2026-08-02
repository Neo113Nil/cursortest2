package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.screen.landing.ui.view.HomeLandingBottomSheetBehavior;
import com.yandex.music.shared.plus.features.plaque.api.PlusPlaqueContainerView;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class u1e {
    public static final /* synthetic */ s9f[] N;
    public final ybf A;
    public final npq B;
    public s2e C;
    public final ekf D;
    public final rdk E;
    public final jyr F;
    public rar G;
    public final xdr H;
    public f1e I;
    public rar J;
    public final xdr K;
    public final fkn L;
    public final jyr M;
    public final x1e a;
    public final tmb b;
    public String c;
    public String d;
    public final hq0 e;
    public final ln6 f;
    public final v2d g;
    public rar h;
    public rar i;
    public final rhp j;
    public final rhp k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public final xxq u;
    public final yiq v;
    public final mm6 w;
    public final tjf x;
    public final z5r y;
    public final jyr z;

    static {
        opi opiVar = new opi(u1e.class, "subscriptionBannerVisibilityJob", "getSubscriptionBannerVisibilityJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        N = new s9f[]{opiVar, new opi(u1e.class, "tabClickJob", "getTabClickJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public u1e(Context context, x1e x1eVar, kxi kxiVar, cvo cvoVar, String str, tmb tmbVar, String str2, String str3, gs4 gs4Var, ylf ylfVar, jfu jfuVar, hq0 hq0Var, zh zhVar, nmj nmjVar, ln6 ln6Var, v2d v2dVar) {
        context.getClass();
        x1eVar.getClass();
        cvoVar.getClass();
        jfuVar.getClass();
        zhVar.getClass();
        nmjVar.getClass();
        this.a = x1eVar;
        this.b = tmbVar;
        this.c = str2;
        this.d = str3;
        this.e = hq0Var;
        this.f = ln6Var;
        this.g = v2dVar;
        this.j = new rhp();
        this.k = new rhp();
        l18 l18Var = l18.b;
        jyr b = l18Var.b(hag.I(cmf.class), true);
        this.l = b;
        jyr b2 = l18Var.b(hag.I(wst.class), true);
        this.m = b2;
        jyr b3 = l18Var.b(hag.I(mg5.class), true);
        this.n = l18Var.b(hag.I(cjl.class), true);
        this.o = l18Var.b(hag.I(lwc.class), true);
        this.p = l18Var.b(hag.I(p8q.class), true);
        this.q = l18Var.b(hag.I(oq7.class), true);
        this.r = l18Var.b(hag.I(k1l.class), true);
        this.s = l18Var.b(hag.I(c1e.class), true);
        jyr b4 = l18Var.b(hag.I(z1e.class), true);
        this.t = b4;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        xxq c = ((frt) qdcVar.C(I)).c();
        this.u = c;
        yiq yiqVar = new yiq();
        this.v = yiqVar;
        mm6 r = hld.r(yiqVar, dm6.b());
        this.w = r;
        this.x = new tjf(context, jfuVar, kxiVar, ylfVar);
        ((z1e) b4.getValue()).getClass();
        this.y = new z5r(r, new tc1(context, 3), kxiVar);
        this.z = l18Var.b(hag.I(y8m.class), true);
        this.A = new ybf(ern.a(g9m.class), new r71(jfuVar, 5), new pva(8, new ita(29, this)));
        fnb fnbVar = (fnb) gs4Var.c;
        fnbVar.getClass();
        ekf ekfVar = new ekf(fnbVar);
        this.D = ekfVar;
        this.E = new rdk(r, (mg5) b3.getValue(), kxiVar, ekfVar, new k1e(this, 0), new aub(1, this, u1e.class, "uiAnalyticsData", "uiAnalyticsData(Lru/yandex/music/data/wave/recommendations/seeds/Seeds;)Lcom/yandex/music/shared/core/evgen/analytics/PlaybackStartAnalyticsData$Screen;", 0, 11));
        this.F = btf.b(new sxd(2));
        Boolean bool = Boolean.FALSE;
        this.H = ydr.a(bool);
        xdr a = ydr.a(bool);
        this.K = a;
        this.L = new fkn(a);
        this.M = l18Var.b(hag.I(ses.class), true);
        fjf fjfVar = new fjf(wyf.F((nyf) gs4Var.a));
        if (fjfVar.c) {
            long a2 = fjfVar.g().a();
            djf djfVar = new djf();
            djfVar.a = a2;
            djfVar.b = null;
            djfVar.c = null;
            djfVar.d = 0L;
            djfVar.e = 0L;
            djfVar.f = 0L;
            djfVar.g = 0L;
            djfVar.h = 0L;
            fjfVar.h = djfVar;
        }
        y supportFragmentManager = hq0Var.getSupportFragmentManager();
        supportFragmentManager.getClass();
        nyf nyfVar = (nyf) gs4Var.a;
        jfu jfuVar2 = (jfu) gs4Var.b;
        cmf cmfVar = (cmf) b.getValue();
        mka mkaVar = new mka(this);
        context.getClass();
        supportFragmentManager.getClass();
        nyfVar.getClass();
        jfuVar2.getClass();
        nmjVar.getClass();
        cvoVar.getClass();
        cmfVar.getClass();
        zhVar.getClass();
        es6 es6Var = new es6();
        es6Var.a = tmbVar;
        es6Var.b = kxiVar;
        es6Var.c = btf.b(new rh1(es6Var, cvoVar, zhVar, str, cmfVar, 7));
        this.B = new npq(context, supportFragmentManager, hq0Var, nyfVar, jfuVar2, (jyr) es6Var.c, fjfVar, mkaVar, kxiVar, tmbVar, nmjVar);
        ox6.B(zsd.b0(((wst) b2.getValue()).a(c).g(pff.e)), r, new m1e(this, 0));
    }

    public static final void a(u1e u1eVar) {
        x97.y(u1eVar.w, dm6.b, null, new t1e(u1eVar, null, 1), 2);
    }

    public final void b() {
        PlusPlaqueContainerView h;
        s2e s2eVar = this.C;
        if (s2eVar == null) {
            return;
        }
        s2eVar.i().setRefreshing(false);
        tjf tjfVar = this.x;
        if (!tjfVar.v) {
            tjfVar.c = new yfx(28, this, s2eVar);
            tjfVar.d = this.D;
            ComposeView composeView = (ComposeView) s2eVar.d.a(s2e.G[3]);
            jyr b = btf.b(new j1e(s2eVar, 0));
            composeView.getClass();
            yfx yfxVar = tjfVar.c;
            ekf ekfVar = tjfVar.d;
            if (yfxVar == null || ekfVar == null) {
                dfi.r("navigation or reporter are not initialized", "LandingWaveBlockPresenter");
            } else {
                tjfVar.t.g();
                vqi vqiVar = tjfVar.u;
                if (vqiVar != null) {
                    vqiVar.V();
                }
                vqi z = tjfVar.t.d.z();
                mm6 r = hld.r(z, dm6.b());
                tjfVar.u = z;
                rjf rjfVar = tjfVar.f;
                c76 c76Var = new c76(b, 10);
                rjfVar.getClass();
                rjfVar.e = c76Var;
                rjq rjqVar = (rjq) rjfVar.g;
                rjqVar.g();
                rjfVar.d();
                ox6.B(((zqj) ((ybf) ((ime) rjfVar.c).b).getValue()).m, hld.s(rjqVar, dm6.b()), new qjf(rjfVar, 3));
                ox6.B(tjfVar.b().e, r, new otd(17, tjfVar));
                vjf vjfVar = (vjf) ((yjf) tjfVar.e.getValue()).a.getValue();
                ylf ylfVar = tjfVar.b;
                kxi kxiVar = tjfVar.a;
                mka mkaVar = tjfVar.i;
                vjfVar.getClass();
                mkaVar.getClass();
                e00 e00Var = vjfVar.a;
                bff bffVar = new bff(10);
                e00Var.getClass();
                bdt I = hag.I(mg5.class);
                qdc qdcVar = e00Var.a;
                qdcVar.getClass();
                mg5 mg5Var = (mg5) qdcVar.C(I);
                bdt I2 = hag.I(v5v.class);
                qdc qdcVar2 = e00Var.a;
                qdcVar2.getClass();
                v5v v5vVar = (v5v) qdcVar2.C(I2);
                qdc qdcVar3 = new qdc(kxiVar);
                jkf jkfVar = new jkf(ylfVar, kxiVar, mg5Var, v5vVar, qdcVar3, mkaVar, bffVar);
                nmb nmbVar = (nmb) ((jyr) qdcVar3.b).getValue();
                String G = kxiVar.a.G();
                nmbVar.getClass();
                G.getClass();
                LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "main");
                m.put("hash", G);
                m.put("entity_id", "N/A");
                eta.m(0, "entity_name", "MyWave", "entity_pos", m);
                dfi.p(1, "entity_type", "my_wave", "_meta", m);
                nmbVar.C("Home.MyWave.Loaded", m);
                tjfVar.g = jkfVar;
                composeView.setContent(new wn5(new v48(23, pd.t(new qzm[0]), new wn5(new nha(29, tjfVar), -1498344218, true), jkfVar), -698269217, true));
                tjfVar.v = true;
                r2e r2eVar = tjfVar.h;
                s9f[] s9fVarArr = tjf.y;
                tjfVar.h.setValue(tjfVar, s9fVarArr[0], Float.valueOf(((Number) r2eVar.getValue(tjfVar, s9fVarArr[0])).floatValue()));
            }
        }
        c(false);
        s2e s2eVar2 = this.C;
        if (s2eVar2 == null || (h = s2eVar2.h()) == null) {
            return;
        }
        h.a(this.e, (g9m) this.A.getValue());
    }

    public final void c(boolean z) {
        b6d b6dVar = ((rrn) ((prn) ((z1e) this.t.getValue()).a.getValue())).b;
        rar rarVar = this.G;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.G = x97.y(this.w, null, null, new cg1(this, z, b6dVar, continuation, 7), 3);
    }

    public final void d() {
        t l;
        Window window;
        qpj onBackPressedDispatcher;
        xdr xdrVar = this.H;
        boolean booleanValue = ((Boolean) xdrVar.getValue()).booleanValue();
        boolean z = !booleanValue;
        Continuation continuation = null;
        v3w.n(z, xdrVar, null);
        s2e s2eVar = this.C;
        int i = 1;
        if (s2eVar != null) {
            HomeLandingBottomSheetBehavior homeLandingBottomSheetBehavior = s2eVar.p;
            AnimatorSet animatorSet = s2eVar.w;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            homeLandingBottomSheetBehavior.setDraggable(booleanValue);
            jyr jyrVar = t5j.e;
            if (wyf.M()) {
                homeLandingBottomSheetBehavior.setDraggable(false);
            }
            homeLandingBottomSheetBehavior.setCanInterceptTouchEvents(booleanValue);
            ObjectAnimator C = ywf.C(s2eVar.d(), booleanValue);
            ObjectAnimator C2 = ywf.C(s2eVar.c(), booleanValue);
            ObjectAnimator C3 = ywf.C(s2eVar.f(), z);
            C3.addListener(new q2e(s2eVar, z));
            ObjectAnimator C4 = ywf.C(s2eVar.h(), booleanValue);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(C2, C, C3, C4);
            animatorSet2.setDuration(600L);
            animatorSet2.start();
            s2eVar.w = animatorSet2;
        }
        tjf tjfVar = this.x;
        tjfVar.x = z;
        rjf rjfVar = tjfVar.f;
        jkf jkfVar = tjfVar.g;
        if (jkfVar != null) {
            v3w.n(z, jkfVar.a.m, null);
        }
        z5r z5rVar = this.y;
        z5rVar.e.setValue(z5rVar, z5r.i[1], Boolean.valueOf(z));
        x1e x1eVar = this.a;
        kpj kpjVar = x1eVar.b;
        if (z) {
            t l2 = x1eVar.a.l();
            if (l2 != null && (onBackPressedDispatcher = l2.getOnBackPressedDispatcher()) != null) {
                kpjVar.getClass();
                onBackPressedDispatcher.b(kpjVar);
            }
        } else {
            if (!booleanValue) {
                b6e.s();
                return;
            }
            kpjVar.remove();
        }
        if (z) {
            f1e f1eVar = this.I;
            if (f1eVar != null && (l = f1eVar.a.l()) != null && (window = l.getWindow()) != null) {
                window.addFlags(128);
            }
            rjfVar.p = this.I;
        } else {
            if (!booleanValue) {
                b6e.s();
                return;
            }
            rjfVar.p = null;
            f1e f1eVar2 = this.I;
            if (f1eVar2 != null) {
                f1eVar2.a();
            }
        }
        x97.y(this.w, dm6.b, null, new s1e(this, z, continuation, i), 2);
    }
}
