package com.yandex.passport.internal.ui.router;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.asa;
import defpackage.csa;
import defpackage.dxd;
import defpackage.ern;
import defpackage.hq0;
import defpackage.in5;
import defpackage.jk6;
import defpackage.o57;
import defpackage.ph;
import defpackage.rjp;
import defpackage.szf;
import defpackage.vh;
import defpackage.wn5;
import defpackage.wyf;
import defpackage.x6k;
import defpackage.x97;
import defpackage.xq0;
import defpackage.ybf;
import defpackage.zh;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class LoginRouterActivity extends hq0 {
    public static final /* synthetic */ int l = 0;
    public d0 a;
    public com.yandex.passport.internal.properties.l b;
    public n0 c;
    public o0 d;
    public com.yandex.passport.internal.flags.i e;
    public PassportProcessGlobalComponent f;
    public final ybf g = new ybf(ern.a(x.class), new t(this, 1), new t(this, 0), new t(this, 2));
    public final zh h = registerForActivityResult(new dxd(3, new jk6(0, 9, LoginRouterActivity.class, this, "viewModel", "getViewModel()Lcom/yandex/passport/internal/ui/router/LoginRouterViewModel;")), new s(this, 2));
    public final zh i = registerForActivityResult(new vh(25), new s(this, 0));
    public final zh j = registerForActivityResult(new vh(26), new s(this, 1));
    public final x6k k = szf.g0(Boolean.TRUE);

    public static final void j(LoginRouterActivity loginRouterActivity, ph phVar) {
        if (phVar.a.b != 666) {
            loginRouterActivity.finish();
            return;
        }
        x k = loginRouterActivity.k();
        com.yandex.passport.internal.properties.l lVar = loginRouterActivity.b;
        if (lVar != null) {
            k.J(loginRouterActivity, lVar);
        } else {
            Intrinsics.j("loginProperties");
            throw null;
        }
    }

    public final x k() {
        return (x) this.g.getValue();
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        this.f = com.yandex.passport.internal.di.a.a();
        com.yandex.passport.internal.properties.l lVar = com.yandex.passport.internal.j.a;
        Intent intent = getIntent();
        intent.getClass();
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.f;
        Continuation continuation = null;
        if (passportProcessGlobalComponent == null) {
            Intrinsics.j("component");
            throw null;
        }
        com.yandex.passport.internal.properties.x properties = passportProcessGlobalComponent.getProperties();
        properties.getClass();
        com.yandex.passport.internal.properties.l lVar2 = properties.p;
        Bundle extras = intent.getExtras();
        if (extras == null || (str = extras.getString("passport_action")) == null) {
            str = "";
        }
        int i = 0;
        if (TextUtils.equals(str, "com.yandex.passport.ACTION_SYSTEM_ADD_ACCOUNT")) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "intent action ACTION_SYSTEM_ADD_ACCOUNT default properties: " + lVar2, 8);
            }
            if (lVar2 == null) {
                lVar2 = com.yandex.passport.internal.j.a;
            }
        } else if (extras == null || !extras.containsKey("passport-login-properties")) {
            com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k();
            com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
            jVar.O(com.yandex.passport.api.impl.b.c);
            ((com.yandex.passport.common.bitflag.b) jVar.e).a(new com.yandex.passport.api.n[]{com.yandex.passport.api.n.SOCIAL}[0], false);
            kVar.b = com.yandex.passport.internal.ui.a.s(jVar.l());
            lVar2 = kVar.a();
        } else {
            lVar2 = (com.yandex.passport.internal.properties.l) com.appsflyer.internal.k.h(extras, com.yandex.passport.internal.util.p.class, "passport-login-properties");
            if (lVar2 == null) {
                xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.l.class));
                return;
            }
        }
        this.b = lVar2;
        if (lVar2 == null) {
            Intrinsics.j("loginProperties");
            throw null;
        }
        setTheme(com.yandex.passport.internal.ui.util.s.f(lVar2.e, this));
        super.onCreate(bundle);
        PassportProcessGlobalComponent passportProcessGlobalComponent2 = this.f;
        if (passportProcessGlobalComponent2 == null) {
            Intrinsics.j("component");
            throw null;
        }
        this.c = passportProcessGlobalComponent2.getStatefulReporter();
        PassportProcessGlobalComponent passportProcessGlobalComponent3 = this.f;
        if (passportProcessGlobalComponent3 == null) {
            Intrinsics.j("component");
            throw null;
        }
        this.d = passportProcessGlobalComponent3.getEventReporter();
        PassportProcessGlobalComponent passportProcessGlobalComponent4 = this.f;
        if (passportProcessGlobalComponent4 == null) {
            Intrinsics.j("component");
            throw null;
        }
        this.e = passportProcessGlobalComponent4.getFlagRepository();
        this.k.setValue(Boolean.valueOf(bundle != null ? bundle.getBoolean("saved_is_show_progress", true) : true));
        PassportProcessGlobalComponent passportProcessGlobalComponent5 = this.f;
        if (passportProcessGlobalComponent5 == null) {
            Intrinsics.j("component");
            throw null;
        }
        if (((Boolean) passportProcessGlobalComponent5.getFlagRepository().b(com.yandex.passport.internal.flags.o.e0)).booleanValue()) {
            in5.a(this, new wn5(new r(this, i), 1873947389, true));
        } else {
            com.yandex.passport.internal.properties.l lVar3 = this.b;
            if (lVar3 == null) {
                Intrinsics.j("loginProperties");
                throw null;
            }
            com.yandex.passport.internal.properties.v vVar = lVar3.p.n;
            PassportProcessGlobalComponent passportProcessGlobalComponent6 = this.f;
            if (passportProcessGlobalComponent6 == null) {
                Intrinsics.j("component");
                throw null;
            }
            d0 d0Var = new d0(this, vVar, passportProcessGlobalComponent6.getProperties().x);
            this.a = d0Var;
            setContentView(d0Var.e());
        }
        x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(k().m, continuation, this, 28), 3);
        if (bundle == null) {
            x k = k();
            com.yandex.passport.internal.properties.l lVar4 = this.b;
            if (lVar4 == null) {
                Intrinsics.j("loginProperties");
                throw null;
            }
            k.J(this, lVar4);
            d0 d0Var2 = this.a;
            if (d0Var2 != null) {
                asa asaVar = new asa();
                csa csaVar = new csa(new o57(1, asaVar, asa.class, "accumulate", "accumulate(Lcom/lightside/animations/AnimationActor;)V", 0, 11));
                View view = d0Var2.e;
                view.getClass();
                new rjp(view, csaVar.a).b(0.0f, 1.0f);
                asaVar.setDuration(300L);
                asaVar.setStartDelay(100L);
                asaVar.setInterpolator(new DecelerateInterpolator());
                asaVar.start();
            }
        }
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("saved_is_show_progress", ((Boolean) this.k.getValue()).booleanValue());
    }
}
