package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import com.yandex.passport.api.y1;
import defpackage.b1b;
import defpackage.b6e;
import defpackage.btf;
import defpackage.er0;
import defpackage.ern;
import defpackage.hq0;
import defpackage.jyr;
import defpackage.ldg;
import defpackage.orq;
import defpackage.ot0;
import defpackage.qs;
import defpackage.rvr;
import defpackage.vh;
import defpackage.wyf;
import defpackage.x97;
import defpackage.xq0;
import defpackage.ybf;
import defpackage.zh;
import defpackage.zyr;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class LogoutBottomSheetActivity extends hq0 {
    public static final /* synthetic */ int k = 0;
    public com.yandex.passport.internal.flags.i a;
    public com.yandex.passport.internal.report.reporters.i0 b;
    public boolean g;
    public final ybf c = new ybf(ern.a(q0.class), new k(this, 0), new com.yandex.passport.internal.push.w0(11), new k(this, 1));
    public final jyr d = btf.b(new e(this, 0));
    public final jyr e = btf.b(new e(this, 1));
    public final jyr f = btf.b(new e(this, 2));
    public final zh h = registerForActivityResult(new vh(19), new h(this, 2));
    public final zh i = registerForActivityResult(new vh(20), new h(this, 1));
    public final zh j = registerForActivityResult(new vh(18), new h(this, 0));

    @Override // defpackage.hq0, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        context.getClass();
        com.yandex.passport.internal.helper.h localeHelper = com.yandex.passport.internal.di.a.a().getLocaleHelper();
        super.attachBaseContext(localeHelper.b(context));
        localeHelper.b(this);
    }

    public final com.yandex.passport.internal.report.reporters.h0 j() {
        com.yandex.passport.internal.report.reporters.i0 i0Var = this.b;
        if (i0Var != null) {
            return i0Var;
        }
        Intrinsics.j("logoutReporter");
        throw null;
    }

    public final q0 k() {
        return (q0) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int i = 2;
        b1b.a(this, new zyr(0, 0, 2, rvr.u), new zyr(0, 0, 0, rvr.t));
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            com.yandex.passport.internal.ui.a.q(this, new IllegalArgumentException("LogoutProperties is missing in intent"));
            return;
        }
        com.yandex.passport.internal.properties.u uVar = (com.yandex.passport.internal.properties.u) com.appsflyer.internal.k.h(extras, com.yandex.passport.internal.util.p.class, "passport-logout-properties");
        if (uVar == null) {
            xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.u.class));
            return;
        }
        com.yandex.passport.internal.di.a.a().createLogoutBottomSheetActivityComponent().build().inject(this);
        y1 y1Var = uVar.b;
        y1Var.getClass();
        int ordinal = y1Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        b6e.s();
                        return;
                    }
                    i = -1;
                }
            }
            Continuation continuation = null;
            if (i != ((er0) getDelegate()).z0) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Setting theme to " + y1Var + " with nightMode=" + i + ", was " + ((er0) getDelegate()).z0, 8);
                }
                getDelegate().n(i);
            }
            super.onCreate(bundle);
            if (!isFinishing() || isChangingConfigurations() || this.g) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.g, 8);
                }
                x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(this, continuation, 20), 3);
            }
            jyr jyrVar = this.d;
            setContentView(((com.yandex.passport.internal.ui.bouncer.roundabout.o) jyrVar.getValue()).e());
            ((com.yandex.passport.internal.ui.bouncer.roundabout.o) jyrVar.getValue()).d.a((orq) this.e.getValue());
            q0 k2 = k();
            k2.p = uVar;
            x97.y(ot0.F(k2), null, null, new com.yandex.passport.internal.provider.communication.c(k2, uVar, continuation, 21), 3);
            x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(k().o, continuation, this, 19), 3);
            x97.y(wyf.F(getLifecycle()), null, null, new j(this, continuation, 1), 3);
            ldg.B(((com.yandex.passport.internal.ui.bouncer.roundabout.o) jyrVar.getValue()).e(), new qs(this, continuation, 20));
        }
        i = 1;
        Continuation continuation2 = null;
        if (i != ((er0) getDelegate()).z0) {
        }
        super.onCreate(bundle);
        if (!isFinishing()) {
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(this, continuation2, 20), 3);
        jyr jyrVar2 = this.d;
        setContentView(((com.yandex.passport.internal.ui.bouncer.roundabout.o) jyrVar2.getValue()).e());
        ((com.yandex.passport.internal.ui.bouncer.roundabout.o) jyrVar2.getValue()).d.a((orq) this.e.getValue());
        q0 k22 = k();
        k22.p = uVar;
        x97.y(ot0.F(k22), null, null, new com.yandex.passport.internal.provider.communication.c(k22, uVar, continuation2, 21), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(k().o, continuation2, this, 19), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new j(this, continuation2, 1), 3);
        ldg.B(((com.yandex.passport.internal.ui.bouncer.roundabout.o) jyrVar2.getValue()).e(), new qs(this, continuation2, 20));
    }

    @Override // android.app.Activity
    public final void recreate() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isGoingToRecreate = true", 8);
        }
        this.g = true;
        super.recreate();
    }
}
