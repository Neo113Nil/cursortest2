package com.yandex.passport.internal.ui.sloth;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.gf;
import com.yandex.passport.internal.report.mc;
import com.yandex.passport.internal.report.reporters.b1;
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
public final class StandaloneSlothActivity extends hq0 {
    public static final /* synthetic */ int e = 0;
    public PassportProcessGlobalComponent a;
    public s b;
    public final ybf c = new ybf(ern.a(j0.class), new r(this, 1), new r(this, 0), new r(this, 2));
    public boolean d;

    public final j0 j() {
        return (j0) this.c.getValue();
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        com.yandex.passport.sloth.data.o oVar;
        rvr rvrVar = rvr.t;
        b1b.a(this, new zyr(0, 0, 0, rvrVar), new zyr(0, 0, 0, rvrVar));
        if (bundle == null) {
            gf gfVar = j().l;
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
        s createStandaloneSlothComponent = a.createStandaloneSlothComponent(new a0(this, extras));
        this.b = createStandaloneSlothComponent;
        Continuation continuation = null;
        if (createStandaloneSlothComponent == null) {
            Intrinsics.j("component");
            throw null;
        }
        Object obj = createStandaloneSlothComponent.getParams().a;
        com.yandex.passport.sloth.data.p pVar = obj instanceof com.yandex.passport.sloth.data.p ? (com.yandex.passport.sloth.data.p) obj : null;
        if (pVar == null || (oVar = pVar.getTheme()) == null) {
            oVar = com.yandex.passport.sloth.data.o.c;
        }
        int v = com.yandex.passport.internal.ui.a.v(oVar);
        if (v != ((er0) getDelegate()).z0) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Setting theme to " + oVar + " with nightMode=" + v + ", was " + ((er0) getDelegate()).z0, 8);
            }
            getDelegate().n(v);
        }
        super.onCreate(bundle);
        if (isFinishing() || isChangingConfigurations() || this.d) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.d, 8);
            }
            x97.y(wyf.F(getLifecycle()), null, null, new q(this, continuation, 0), 3);
        }
        s sVar = this.b;
        if (sVar == null) {
            Intrinsics.j("component");
            throw null;
        }
        setContentView(sVar.getUi().e());
        x97.y(wyf.F(getLifecycle()), null, null, new l(this, continuation, 1), 3);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        if (isFinishing()) {
            gf gfVar = j().l;
            if (!gfVar.b.isEmpty()) {
                PassportProcessGlobalComponent passportProcessGlobalComponent = this.a;
                if (passportProcessGlobalComponent == null) {
                    Intrinsics.j("globalComponent");
                    throw null;
                }
                b1 standaloneReporter = passportProcessGlobalComponent.getStandaloneReporter();
                LinkedHashMap b = gfVar.b();
                ArrayList a = gfVar.a();
                Map c = gfVar.c();
                standaloneReporter.getClass();
                standaloneReporter.l(mc.d, uah.i(uah.e(new Pair("last_events", b), new Pair("all_events", a)), c));
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
        this.d = true;
        super.recreate();
    }
}
