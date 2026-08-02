package com.yandex.passport.internal.ui;

import android.os.Bundle;
import com.yandex.passport.R;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.e0;
import com.yandex.passport.internal.report.reporters.a1;
import com.yandex.passport.internal.ui.util.s;
import com.yandex.passport.internal.util.p;
import defpackage.f1d;
import defpackage.tn3;
import defpackage.tot;
import defpackage.w1e;
import defpackage.xq0;

/* loaded from: classes4.dex */
public class SocialBindActivity extends c implements com.yandex.passport.internal.ui.social.k {
    public static final /* synthetic */ int h = 0;
    public e0 d;
    public com.yandex.passport.internal.core.accounts.e e;
    public a1 f;
    public com.yandex.passport.legacy.lx.j g;

    public final void m(boolean z) {
        this.g = new com.yandex.passport.legacy.lx.e(new com.yandex.passport.legacy.lx.i(new tn3(8, this))).h(new w1e(this, z, 7), new tot(17, this));
    }

    @Override // com.yandex.passport.internal.ui.c, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.e = a.getAccountsRetriever();
        this.f = a.getSocialReporter();
        if (bundle == null) {
            String action = getIntent().getAction();
            Bundle extras = getIntent().getExtras();
            if (action != null || extras == null) {
                xq0.q(f1d.g("Invalid action in SocialBindActivity: ", action));
                return;
            }
            e0 e0Var = (e0) com.appsflyer.internal.k.h(extras, p.class, "passport-bind-properties");
            if (e0Var == null) {
                xq0.q("Bundle has no ".concat(e0.class.getSimpleName()));
                return;
            }
            this.d = e0Var;
        } else {
            e0 e0Var2 = (e0) com.appsflyer.internal.k.h(bundle, p.class, "passport-bind-properties");
            if (e0Var2 == null) {
                xq0.q("Bundle has no ".concat(e0.class.getSimpleName()));
                return;
            }
            this.d = e0Var2;
        }
        setTheme(s.d(this.d.b, this));
        super.onCreate(bundle);
        setContentView(R.layout.passport_activity_bind_social);
        if (getSupportFragmentManager().D("com.yandex.passport.internal.ui.social.j") != null) {
            return;
        }
        m(true);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        com.yandex.passport.legacy.lx.j jVar = this.g;
        if (jVar != null) {
            jVar.a();
            this.g = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        e0 e0Var = this.d;
        e0Var.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("passport-bind-properties", e0Var);
        bundle.putAll(bundle2);
    }
}
