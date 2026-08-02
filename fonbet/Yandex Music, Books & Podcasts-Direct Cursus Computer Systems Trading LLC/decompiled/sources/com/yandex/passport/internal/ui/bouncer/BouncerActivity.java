package com.yandex.passport.internal.ui.bouncer;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.d4;
import com.yandex.passport.internal.report.e4;
import com.yandex.passport.internal.report.f4;
import com.yandex.passport.internal.report.gf;
import com.yandex.passport.internal.report.l4;
import defpackage.b1b;
import defpackage.b6e;
import defpackage.er0;
import defpackage.ern;
import defpackage.hq0;
import defpackage.l1p;
import defpackage.nu9;
import defpackage.r1w;
import defpackage.rvr;
import defpackage.uah;
import defpackage.wyf;
import defpackage.x97;
import defpackage.xq0;
import defpackage.ybf;
import defpackage.zyr;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class BouncerActivity extends hq0 {
    public static final /* synthetic */ int e = 0;
    public PassportProcessGlobalComponent a;
    public c b;
    public boolean c;
    public final ybf d = new ybf(ern.a(i.class), new b(this, 1), new b(this, 0), new b(this, 2));

    @Override // defpackage.hq0, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        context.getClass();
        com.yandex.passport.internal.helper.h localeHelper = com.yandex.passport.internal.di.a.a().getLocaleHelper();
        super.attachBaseContext(localeHelper.b(context));
        localeHelper.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0200  */
    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        com.yandex.passport.internal.properties.l a;
        int i = 0;
        int i2 = 1;
        b1b.a(this, new zyr(0, 0, 0, rvr.t), new zyr(0, 0, 1, rvr.v));
        Continuation continuation = null;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onCreate(savedInstanceState=" + bundle + ')', 8);
        }
        ybf ybfVar = this.d;
        if (bundle == null) {
            gf gfVar = ((i) ybfVar.getValue()).k;
            gfVar.d();
            gfVar.a = SystemClock.elapsedRealtime();
        }
        PassportProcessGlobalComponent a2 = com.yandex.passport.internal.di.a.a();
        this.a = a2;
        com.yandex.passport.internal.report.reporters.m bouncerReporter = a2.getBouncerReporter();
        bouncerReporter.getClass();
        bouncerReporter.p(d4.d);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            a = (com.yandex.passport.internal.properties.l) com.appsflyer.internal.k.h(extras, com.yandex.passport.internal.util.p.class, "passport-login-properties");
            if (a == null) {
                xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.l.class));
                return;
            }
        } else {
            Toast.makeText(this, "Internal error", 0).show();
            finish();
            a = new com.yandex.passport.internal.properties.k().a();
        }
        gf gfVar2 = ((i) ybfVar.getValue()).k;
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.a;
        if (passportProcessGlobalComponent == null) {
            Intrinsics.j("globalComponent");
            throw null;
        }
        com.yandex.passport.internal.properties.l lVar = a;
        d dVar = new d(this, gfVar2, lVar, passportProcessGlobalComponent.getProperties(), a.p.n);
        int ordinal = lVar.D.ordinal();
        int i3 = -1;
        if (ordinal == 0) {
            i = 1;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                b6e.s();
                return;
            }
            i = -1;
        }
        setRequestedOrientation(i);
        y1 y1Var = lVar.e;
        if (y1Var == null) {
            y1Var = y1.d;
        }
        int ordinal2 = y1Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i3 = 2;
            } else if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    b6e.s();
                    return;
                }
            }
            if (i3 != ((er0) getDelegate()).z0) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Setting theme to " + y1Var + " with nightMode=" + i3 + ", was " + ((er0) getDelegate()).z0, 8);
                }
                getDelegate().n(i3);
            }
            setTheme(com.yandex.passport.internal.ui.util.s.f(y1Var, this));
            super.onCreate(bundle);
            if (!isFinishing() || isChangingConfigurations() || this.c) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.c, 8);
                }
                x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(this, continuation, 9), 3);
            }
            PassportProcessGlobalComponent passportProcessGlobalComponent2 = this.a;
            if (passportProcessGlobalComponent2 == null) {
                Intrinsics.j("globalComponent");
                throw null;
            }
            com.yandex.passport.internal.flags.experiments.q experimentsUpdater = passportProcessGlobalComponent2.getExperimentsUpdater();
            com.yandex.passport.internal.flags.experiments.o oVar = com.yandex.passport.internal.flags.experiments.o.b;
            int i4 = com.yandex.passport.internal.flags.experiments.q.h;
            com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
            experimentsUpdater.a(oVar);
            x97.y(wyf.F(getLifecycle()), null, null, new a(this, dVar, continuation, i2), 3);
            PassportProcessGlobalComponent passportProcessGlobalComponent3 = this.a;
            if (passportProcessGlobalComponent3 == null) {
                Intrinsics.j("globalComponent");
                throw null;
            }
            this.b = passportProcessGlobalComponent3.createLoginActivityComponent(dVar);
            getOnBackPressedDispatcher().a(this, new nu9(this, lVar));
            c cVar = this.b;
            if (cVar == null) {
                Intrinsics.j("component");
                throw null;
            }
            setContentView(cVar.getBouncerRenderer().getTheRootView());
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Binding to mvi cycle", 8);
            }
            x97.y(wyf.F(getLifecycle()), null, null, new r1w(this, continuation, 20), 3);
            x97.y(wyf.F(getLifecycle()), null, null, new l1p(bundle, lVar, this, continuation, 13), 3);
            PassportProcessGlobalComponent passportProcessGlobalComponent4 = this.a;
            if (passportProcessGlobalComponent4 == null) {
                Intrinsics.j("globalComponent");
                throw null;
            }
            passportProcessGlobalComponent4.getCredentialManagerInterface().d(this);
            PassportProcessGlobalComponent passportProcessGlobalComponent5 = this.a;
            if (passportProcessGlobalComponent5 != null) {
                passportProcessGlobalComponent5.getWebAuthN().d(this);
                return;
            } else {
                Intrinsics.j("globalComponent");
                throw null;
            }
        }
        i3 = 1;
        if (i3 != ((er0) getDelegate()).z0) {
        }
        setTheme(com.yandex.passport.internal.ui.util.s.f(y1Var, this));
        super.onCreate(bundle);
        if (isFinishing()) {
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(this, continuation, 9), 3);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.getBouncerRenderer().onDestroy();
        }
        if (isFinishing()) {
            gf gfVar = ((i) this.d.getValue()).k;
            if (!gfVar.b.isEmpty()) {
                PassportProcessGlobalComponent passportProcessGlobalComponent = this.a;
                if (passportProcessGlobalComponent == null) {
                    Intrinsics.j("globalComponent");
                    throw null;
                }
                com.yandex.passport.internal.report.reporters.m bouncerReporter = passportProcessGlobalComponent.getBouncerReporter();
                LinkedHashMap b = gfVar.b();
                ArrayList a = gfVar.a();
                Map c = gfVar.c();
                bouncerReporter.getClass();
                bouncerReporter.l(l4.d, uah.i(uah.e(new Pair("last_events", b), new Pair("all_events", a)), c));
            }
            gfVar.d();
        }
        super.onDestroy();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onDestroy()", 8);
        }
        PassportProcessGlobalComponent passportProcessGlobalComponent2 = this.a;
        if (passportProcessGlobalComponent2 == null) {
            Intrinsics.j("globalComponent");
            throw null;
        }
        com.yandex.passport.internal.report.reporters.m bouncerReporter2 = passportProcessGlobalComponent2.getBouncerReporter();
        bouncerReporter2.getClass();
        bouncerReporter2.p(e4.d);
    }

    @Override // android.app.Activity
    public final void recreate() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isGoingToRecreate = true", 8);
        }
        this.c = true;
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.a;
        if (passportProcessGlobalComponent == null) {
            Intrinsics.j("globalComponent");
            throw null;
        }
        com.yandex.passport.internal.report.reporters.m bouncerReporter = passportProcessGlobalComponent.getBouncerReporter();
        bouncerReporter.getClass();
        bouncerReporter.p(f4.d);
        super.recreate();
    }
}
