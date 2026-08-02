package com.yandex.passport.internal.ui.sloth.authsdk;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.gf;
import com.yandex.passport.internal.report.v0;
import defpackage.b1b;
import defpackage.er0;
import defpackage.ern;
import defpackage.hq0;
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
public final class AuthSdkSlothActivity extends hq0 {
    public static final /* synthetic */ int e = 0;
    public PassportProcessGlobalComponent a;
    public l b;
    public boolean c;
    public final ybf d = new ybf(ern.a(n0.class), new k(this, 1), new k(this, 0), new k(this, 2));

    public final n0 j() {
        return (n0) this.d.getValue();
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        rvr rvrVar = rvr.t;
        b1b.a(this, new zyr(0, 0, 0, rvrVar), new zyr(0, 0, 0, rvrVar));
        if (bundle == null) {
            gf gfVar = j().k;
            gfVar.d();
            gfVar.a = SystemClock.elapsedRealtime();
        }
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.a = a;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            xq0.q("no extras data");
            return;
        }
        this.b = a.createAuthSdkSlothComponent(new f0(this, extras));
        Continuation continuation = null;
        if (-1 != ((er0) getDelegate()).z0) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Setting theme to " + getTheme() + " with nightMode=-1, was " + ((er0) getDelegate()).z0, 8);
            }
            getDelegate().n(-1);
        }
        super.onCreate(bundle);
        if (!isFinishing() && !isChangingConfigurations() && !this.c) {
            l lVar = this.b;
            if (lVar == null) {
                Intrinsics.j("component");
                throw null;
            }
            setContentView(lVar.getUi().e());
            x97.y(wyf.F(getLifecycle()), null, null, new h(this, continuation, 1), 3);
            return;
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.c, 8);
        }
        x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.ui.sloth.q(this, continuation, 1), 3);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        if (isFinishing()) {
            gf gfVar = j().k;
            if (!gfVar.b.isEmpty()) {
                PassportProcessGlobalComponent passportProcessGlobalComponent = this.a;
                if (passportProcessGlobalComponent == null) {
                    Intrinsics.j("globalComponent");
                    throw null;
                }
                com.yandex.passport.internal.report.reporters.g authSdkReporter = passportProcessGlobalComponent.getAuthSdkReporter();
                LinkedHashMap b = gfVar.b();
                ArrayList a = gfVar.a();
                Map c = gfVar.c();
                authSdkReporter.getClass();
                authSdkReporter.l(v0.d, uah.i(uah.e(new Pair("last_events", b), new Pair("all_events", a)), c));
            }
            gfVar.d();
        }
        super.onDestroy();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onDestroy()", 8);
        }
    }

    @Override // android.app.Activity
    public final void recreate() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isGoingToRecreate = true", 8);
        }
        this.c = true;
        super.recreate();
    }
}
