package com.yandex.passport.internal.ui.sloth.plusdevices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.s8;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.sloth.data.o0;
import defpackage.b1b;
import defpackage.er0;
import defpackage.ern;
import defpackage.hq0;
import defpackage.ndu;
import defpackage.rvr;
import defpackage.tot;
import defpackage.wdu;
import defpackage.wyf;
import defpackage.x97;
import defpackage.xq0;
import defpackage.ybf;
import defpackage.zyr;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ManagingPlusDevicesSlothActivity extends hq0 {
    public static final /* synthetic */ int g = 0;
    public PassportProcessGlobalComponent a;
    public com.yandex.passport.internal.ui.sloth.s b;
    public com.yandex.passport.internal.report.reporters.j0 c;
    public com.yandex.passport.sloth.data.c0 d;
    public final ybf e = new ybf(ern.a(t.class), new p(this, 1), new p(this, 0), new p(this, 2));
    public boolean f;

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        com.yandex.passport.sloth.data.o oVar;
        rvr rvrVar = rvr.t;
        b1b.a(this, new zyr(0, 0, 0, rvrVar), new zyr(0, 0, 0, rvrVar));
        super.onCreate(bundle);
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.a = a;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            xq0.q("no extras data");
            return;
        }
        com.yandex.passport.internal.ui.sloth.s createStandaloneSlothComponent = a.createStandaloneSlothComponent(new com.yandex.passport.internal.ui.sloth.a0(this, extras));
        this.b = createStandaloneSlothComponent;
        Continuation continuation = null;
        if (createStandaloneSlothComponent == null) {
            Intrinsics.j("component");
            throw null;
        }
        o0 o0Var = createStandaloneSlothComponent.getParams().a;
        com.yandex.passport.sloth.data.c0 c0Var = o0Var instanceof com.yandex.passport.sloth.data.c0 ? (com.yandex.passport.sloth.data.c0) o0Var : null;
        if (c0Var == null || (oVar = c0Var.d) == null) {
            oVar = com.yandex.passport.sloth.data.o.c;
        }
        int v = com.yandex.passport.internal.ui.a.v(oVar);
        if (v != ((er0) getDelegate()).z0) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Setting theme to " + oVar + " with nightMode=" + v + ", was " + ((er0) getDelegate()).z0, 8);
            }
            getDelegate().n(v);
        }
        if (isFinishing() || isChangingConfigurations() || this.f) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.f, 8);
            }
            x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.ui.sloth.q(this, continuation, 7), 3);
            return;
        }
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.a;
        if (passportProcessGlobalComponent == null) {
            Intrinsics.j("globalComponent");
            throw null;
        }
        this.c = passportProcessGlobalComponent.getManagingPlusDevicesReporter();
        com.yandex.passport.internal.ui.sloth.s sVar = this.b;
        if (sVar == null) {
            Intrinsics.j("component");
            throw null;
        }
        o0 o0Var2 = sVar.getParams().a;
        this.d = o0Var2 instanceof com.yandex.passport.sloth.data.c0 ? (com.yandex.passport.sloth.data.c0) o0Var2 : null;
        com.yandex.passport.internal.ui.sloth.s sVar2 = this.b;
        if (sVar2 == null) {
            Intrinsics.j("component");
            throw null;
        }
        setContentView(sVar2.getUi().e());
        View decorView = getWindow().getDecorView();
        tot totVar = new tot(26, this);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(decorView, totVar);
        com.yandex.passport.internal.report.reporters.j0 j0Var = this.c;
        if (j0Var == null) {
            Intrinsics.j("reporter");
            throw null;
        }
        com.yandex.passport.sloth.data.c0 c0Var2 = this.d;
        String str = c0Var2 != null ? c0Var2.e : null;
        String str2 = c0Var2 != null ? c0Var2.f : null;
        com.yandex.passport.common.core.f fVar = c0Var2 != null ? c0Var2.b : null;
        j0Var.n(s8.d, new com.yandex.passport.internal.report.c(fVar != null ? Long.valueOf(fVar.b) : null), new ve(str, 24), new com.yandex.passport.internal.report.a(str2, 13));
        x97.y(wyf.F(getLifecycle()), null, null, new o(this, continuation, 1), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new o(this, continuation, 2), 3);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.yandex.passport.internal.report.reporters.j0 j0Var = this.c;
        if (j0Var != null) {
            if (j0Var == null) {
                Intrinsics.j("reporter");
                throw null;
            }
            com.yandex.passport.sloth.data.c0 c0Var = this.d;
            j0Var.u(c0Var != null ? c0Var.b : null, c0Var != null ? c0Var.e : null, c0Var != null ? c0Var.f : null, null);
        }
    }

    @Override // android.app.Activity
    public final void recreate() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isGoingToRecreate = true", 8);
        }
        this.f = true;
        super.recreate();
    }
}
