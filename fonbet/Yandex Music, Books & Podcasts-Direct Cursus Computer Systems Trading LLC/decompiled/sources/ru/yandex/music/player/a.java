package ru.yandex.music.player;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.i;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.passport.api.g;
import com.yandex.passport.internal.impl.q0;
import defpackage.aal;
import defpackage.adl;
import defpackage.b5l;
import defpackage.bdt;
import defpackage.bjl;
import defpackage.btf;
import defpackage.byb;
import defpackage.c5l;
import defpackage.cjl;
import defpackage.cvo;
import defpackage.cxb;
import defpackage.d6m;
import defpackage.dkc;
import defpackage.dm6;
import defpackage.dyg;
import defpackage.eno;
import defpackage.ern;
import defpackage.ff7;
import defpackage.fle;
import defpackage.fnb;
import defpackage.hag;
import defpackage.hal;
import defpackage.hoe;
import defpackage.j6m;
import defpackage.jdl;
import defpackage.jnb;
import defpackage.jyr;
import defpackage.k6m;
import defpackage.kw2;
import defpackage.l18;
import defpackage.lum;
import defpackage.lvo;
import defpackage.lwc;
import defpackage.lyf;
import defpackage.mdl;
import defpackage.mjl;
import defpackage.nal;
import defpackage.ndu;
import defpackage.nj7;
import defpackage.nkc;
import defpackage.nle;
import defpackage.np2;
import defpackage.nyf;
import defpackage.o6m;
import defpackage.oal;
import defpackage.opi;
import defpackage.ox6;
import defpackage.oxa;
import defpackage.p6m;
import defpackage.p8q;
import defpackage.pal;
import defpackage.pd0;
import defpackage.px2;
import defpackage.q9k;
import defpackage.qal;
import defpackage.qdc;
import defpackage.qyf;
import defpackage.rar;
import defpackage.s9f;
import defpackage.sal;
import defpackage.sml;
import defpackage.ssg;
import defpackage.su4;
import defpackage.tnq;
import defpackage.u21;
import defpackage.ual;
import defpackage.v48;
import defpackage.v9l;
import defpackage.wdu;
import defpackage.wn5;
import defpackage.wyf;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xdh;
import defpackage.xdr;
import defpackage.xpt;
import defpackage.xq0;
import defpackage.y48;
import defpackage.ydr;
import defpackage.z6n;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public abstract class a extends np2 implements mjl, mdl {
    public static final /* synthetic */ s9f[] X;
    public ual A;
    public final jyr B;
    public final jyr C;
    public final jyr D;
    public xdh E;
    public final z6n F;
    public final jyr G;
    public final jyr H;
    public final jyr I;
    public oal J;
    public final xdr K;
    public final xdr L;
    public final cjl v;
    public View w;
    public View x;
    public FrameLayout y;
    public View z;

    static {
        opi opiVar = new opi(a.class, "noSubscriptionPaddingsJob", "getNoSubscriptionPaddingsJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        X = new s9f[]{opiVar};
    }

    public a() {
        l18 l18Var = l18.b;
        bdt I = hag.I(cjl.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.v = (cjl) qdcVar.C(I);
        this.B = l18Var.b(hag.I(p8q.class), true);
        this.C = l18Var.b(hag.I(lwc.class), true);
        this.D = btf.b(new nal(this, 0));
        this.F = new z6n(7);
        this.G = l18Var.b(hag.I(d6m.class), true);
        this.H = l18Var.b(hag.I(hal.class), true);
        this.I = btf.b(new nal(this, 1));
        Boolean bool = Boolean.FALSE;
        this.K = ydr.a(bool);
        this.L = ydr.a(bool);
    }

    public static cvo A(y yVar, o oVar) {
        y childFragmentManager;
        cvo A;
        cvo m;
        for (o oVar2 : yVar.c.f()) {
            if (!Intrinsics.d(oVar2, oVar)) {
                if ((oVar2 instanceof jnb) && (m = ((jnb) oVar2).getM()) != null) {
                    return m;
                }
                if (oVar2 != null && (childFragmentManager = oVar2.getChildFragmentManager()) != null && (A = A(childFragmentManager, oVar)) != null) {
                    return A;
                }
            }
        }
        return null;
    }

    public static void y(o oVar) {
        for (o oVar2 : oVar.getChildFragmentManager().c.f()) {
            if (oVar2 != null) {
                y(oVar2);
            }
        }
        if (oVar instanceof i) {
            ((i) oVar).dismiss();
        }
    }

    public final fnb B() {
        jnb C;
        if (this.v.b.getValue() == aal.b && (C = C()) != null) {
            if (C.getLifecycle().b().compareTo(lyf.c) < 0) {
                C = null;
            }
            if (C != null) {
                return C.g.m();
            }
        }
        return null;
    }

    public final jnb C() {
        o C = getSupportFragmentManager().C(R.id.player_container);
        if (C instanceof jnb) {
            return (jnb) C;
        }
        return null;
    }

    public final void D(Intent intent) {
        if (intent.getBooleanExtra("need_expand", false)) {
            intent.removeExtra("need_expand");
            setIntent(intent);
            cjl cjlVar = this.v;
            x97.y(cjlVar.f, null, null, new bjl(cjlVar, null, 1), 3);
            for (o oVar : getSupportFragmentManager().c.f()) {
                if (oVar != null) {
                    y(oVar);
                }
            }
        }
    }

    public final void E(int i, float f) {
        View view;
        View view2 = this.w;
        if (view2 == null || (view = this.x) == null) {
            return;
        }
        if (f > 0.0f && (i <= view2.getHeight() || view2.getTranslationY() <= view2.getHeight())) {
            view2.setTranslationY(i);
        }
        if (f <= 0.0f) {
            view2.setTranslationY(0.0f);
            int height = view2.getHeight();
            if (height < 0) {
                height = 0;
            }
            ual ualVar = this.A;
            if (ualVar != null && height != ualVar.e && !ualVar.f) {
                ualVar.a(height);
            }
        }
        if (f > 0.0f) {
            view.setImportantForAccessibility(4);
        } else {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.gnb, defpackage.lnb
    public fnb g() {
        fnb B = B();
        return B == null ? this.a.m() : B;
    }

    @Override // defpackage.np2, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public void onDestroy() {
        this.F.setValue(this, X[0], null);
        super.onDestroy();
    }

    @Override // defpackage.hn5, android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        D(intent);
        if (intent.getBooleanExtra("need_collapse", false)) {
            intent.removeExtra("need_collapse");
            cjl cjlVar = this.v;
            Continuation continuation = null;
            x97.y(cjlVar.f, null, null, new bjl(cjlVar, continuation, 0), 3);
            setIntent(intent);
            x97.y(cjlVar.f, null, null, new bjl(cjlVar, continuation, 0), 3);
        }
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onPause() {
        ual ualVar = this.A;
        if (ualVar != null) {
            rar rarVar = ualVar.h;
            if (rarVar != null) {
                rarVar.g(null);
            }
            ualVar.h = null;
        }
        super.onPause();
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onPostResume() {
        Bundle extras;
        Bundle bundle;
        super.onPostResume();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (!((kw2) ((byb) qdcVar.C(I)).b(kw2.class)).h() || (this instanceof y48)) {
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (bundle = extras.getBundle("urlplay.intent.action")) == null || !xpt.b(bundle).f) {
            px2.c(this);
        } else {
            x97.y(wyf.F(getLifecycle()), dm6.b(), null, new qal(this, null, 1), 2);
        }
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onResume() {
        FrameLayout frameLayout;
        super.onResume();
        ual ualVar = this.A;
        if (ualVar == null || (frameLayout = this.y) == null) {
            return;
        }
        Continuation continuation = null;
        ualVar.h = x97.y(ualVar.b, null, null, new b5l(new u21(10, ualVar.c.c, ualVar.g, new dkc(ff7.i(ualVar.a), continuation, 1)), continuation, frameLayout, 4), 3);
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (!((lvo) ((byb) qdcVar.C(I)).c(ern.a(lvo.class))).h() || Build.VERSION.SDK_INT < 34) {
            return;
        }
        oal oalVar = new oal(0, this);
        try {
            registerScreenCaptureCallback(getMainExecutor(), oalVar);
            this.J = oalVar;
        } catch (SecurityException e) {
            ssg.a(7, "PlayerControlActivity", "Unable to register screenshot callback", e);
        }
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public void onStop() {
        if (Build.VERSION.SDK_INT >= 34) {
            oal oalVar = this.J;
            if (oalVar == null) {
                oalVar = null;
            }
            if (oalVar != null) {
                unregisterScreenCaptureCallback(oalVar);
            }
        }
        this.J = null;
        super.onStop();
    }

    @Override // defpackage.np2
    public int q() {
        return R.layout.activity_player_control;
    }

    @Override // defpackage.np2
    public void s(Bundle bundle) {
        int i;
        o jdlVar;
        a aVar = this;
        l18 l18Var = l18.b;
        super.s(bundle);
        hoe.c(aVar);
        aVar.w = aVar.findViewById(R.id.bottom_tabs);
        aVar.z = aVar.findViewById(R.id.player_container);
        aVar.y = (FrameLayout) aVar.getWindow().getDecorView().findViewById(R.id.informer_frame);
        aVar.x = aVar.getWindow().getDecorView().findViewWithTag(aVar.getString(R.string.bottom_player_scrolling_view_behavior));
        qyf F = wyf.F(aVar.getLifecycle());
        cjl cjlVar = aVar.v;
        View view = aVar.x;
        if (view == null) {
            return;
        }
        aVar.A = new ual(aVar, F, cjlVar, view);
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String b = ((tnq) ((byb) qdcVar.C(I)).c(ern.a(tnq.class))).b();
        int i2 = 1;
        if (!Intrinsics.d(b, "on") && (!Intrinsics.d(b, "on_without_9_android") || Build.VERSION.SDK_INT == 28)) {
            FrameLayout frameLayout = aVar.y;
            if (frameLayout != null) {
                bdt I2 = hag.I(nle.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                nle nleVar = (nle) qdcVar2.C(I2);
                fle fleVar = (fle) aVar.D.getValue();
                fleVar.getClass();
                ComposeView composeView = new ComposeView(this, null, 0, 6, null);
                aVar = this;
                composeView.setViewCompositionStrategy(new sml(aVar.getLifecycle()));
                composeView.setContent(new wn5(new v48(18, aVar, fleVar, nleVar), -58040433, true));
                frameLayout.addView(composeView);
            }
        } else {
            bdt I3 = hag.I(nle.class);
            qdc qdcVar3 = l18Var.a;
            qdcVar3.getClass();
            qdcVar3.C(I3);
        }
        ual ualVar = aVar.A;
        boolean z = false;
        if (ualVar != null) {
            View view2 = aVar.w;
            if (view2 == null || ualVar.f) {
                i = 0;
            } else {
                i = ((Number) ualVar.i.getValue()).intValue();
                ualVar.a(i);
            }
            View view3 = ualVar.d;
            nj7 nj7Var = new nj7(ualVar, i, view2, 5);
            WeakHashMap weakHashMap = wdu.a;
            ndu.n(view3, nj7Var);
        } else {
            i = 0;
        }
        Continuation continuation = null;
        if (bundle == null) {
            v9l v9lVar = new v9l(i);
            y supportFragmentManager = aVar.getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            bdt I4 = hag.I(byb.class);
            qdc qdcVar4 = l18Var.a;
            qdcVar4.getClass();
            String b2 = ((tnq) ((byb) qdcVar4.C(I4)).c(ern.a(tnq.class))).b();
            if (Intrinsics.d(b2, "on") || (Intrinsics.d(b2, "on_without_9_android") && Build.VERSION.SDK_INT != 28)) {
                z = true;
            }
            if (z) {
                jdlVar = new adl();
                jdlVar.setArguments(cxb.K(new Pair("playerScreen:args", v9lVar)));
            } else {
                jdl.G.getClass();
                jdlVar = new jdl();
                jdlVar.setArguments(cxb.K(new Pair("playerScreen:args", v9lVar)));
            }
            l.e(R.id.player_container, jdlVar, null);
            l.j();
            Intent intent = aVar.getIntent();
            intent.getClass();
            aVar.D(intent);
        }
        x0q x0qVar = ((lwc) aVar.C.getValue()).d;
        nyf lifecycle = aVar.getLifecycle();
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Check failed.");
            return;
        }
        x97.y(wyf.F(lifecycle), null, null, new sal(lifecycle, x0qVar, continuation, aVar, 0), 3);
        jyr jyrVar = p6m.f;
        if (o6m.c()) {
            bdt I5 = hag.I(k6m.class);
            qdc qdcVar5 = l18Var.a;
            qdcVar5.getClass();
            pd0 pd0Var = ((k6m) qdcVar5.C(I5)).a;
            bdt I6 = hag.I(g.class);
            qdc qdcVar6 = pd0Var.a;
            qdcVar6.getClass();
            q0 h = ((g) qdcVar6.C(I6)).h(aVar, wyf.F(aVar.getLifecycle()));
            jyr b3 = pd0Var.b(hag.I(j6m.class), true);
            bdt I7 = hag.I(q9k.class);
            qdc qdcVar7 = pd0Var.a;
            qdcVar7.getClass();
            q9k q9kVar = (q9k) qdcVar7.C(I7);
            h.getClass();
            lum lumVar = new lum();
            lumVar.a = h;
            lumVar.b = q9kVar;
            lumVar.c = b3;
            aVar.E = new xdh(pd0Var.b(hag.I(j6m.class), true), lumVar, new oxa(13, h), wyf.F(aVar.getLifecycle()));
            x0q x0qVar2 = ((j6m) ((d6m) aVar.G.getValue())).k;
            nyf lifecycle2 = aVar.getLifecycle();
            if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                xq0.q("Check failed.");
                return;
            }
            x97.y(wyf.F(lifecycle2), null, null, new sal(lifecycle2, x0qVar2, continuation, aVar, 1), 3);
        }
        ox6.B(((p8q) aVar.B.getValue()).d, wyf.F(aVar.getLifecycle()), new pal(aVar, i2));
        ox6.B(cjlVar.b, wyf.F(aVar.getLifecycle()), new pal(aVar, 2));
        eno enoVar = new eno(new nkc(cjlVar.b, continuation, i2));
        nyf lifecycle3 = aVar.getLifecycle();
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            x97.y(wyf.F(lifecycle3), null, null, new c5l(lifecycle3, enoVar, continuation, aVar, 1), 3);
        } else {
            xq0.q("Check failed.");
        }
    }

    public final void z() {
        runOnUiThread(new dyg(17, this));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        ssg.a(7, null, "expand player in wrong thread", new FailedAssertionException("expand player in wrong thread"));
    }
}
