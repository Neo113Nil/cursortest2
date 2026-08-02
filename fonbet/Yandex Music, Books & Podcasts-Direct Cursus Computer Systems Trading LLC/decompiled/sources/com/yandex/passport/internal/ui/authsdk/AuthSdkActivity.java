package com.yandex.passport.internal.ui.authsdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.push.w0;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.t0;
import com.yandex.passport.internal.report.u0;
import com.yandex.passport.internal.report.x0;
import com.yandex.passport.internal.report.y0;
import com.yandex.passport.internal.report.z0;
import defpackage.b1b;
import defpackage.b6e;
import defpackage.bjt;
import defpackage.btf;
import defpackage.cxb;
import defpackage.ern;
import defpackage.eta;
import defpackage.gfu;
import defpackage.gi;
import defpackage.is6;
import defpackage.jfu;
import defpackage.jyr;
import defpackage.ldg;
import defpackage.lm4;
import defpackage.qs;
import defpackage.rvr;
import defpackage.vh;
import defpackage.xq0;
import defpackage.zh;
import defpackage.zyr;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AuthSdkActivity extends com.yandex.passport.internal.ui.c {
    public static final /* synthetic */ int l = 0;
    public q d;
    public d f;
    public final jyr e = btf.b(new w0(5));
    public final String g = eta.e();
    public final zh h = registerForActivityResult(new vh(27), new c(this, 1));
    public final zh i = registerForActivityResult(new vh(28), new c(this, 0));
    public final jyr j = btf.b(new a(this, 0));
    public final zh k = registerForActivityResult(new vh(16), new gi(13, this));

    public static final void m(AuthSdkActivity authSdkActivity, com.yandex.passport.internal.ui.sloth.authsdk.g gVar) {
        String str = authSdkActivity.g;
        Continuation continuation = null;
        if (gVar instanceof com.yandex.passport.internal.ui.sloth.authsdk.a) {
            d dVar = authSdkActivity.f;
            if (dVar == null) {
                Intrinsics.j("component");
                throw null;
            }
            com.yandex.passport.internal.report.reporters.g reporter = dVar.getReporter();
            com.yandex.passport.common.core.f fVar = ((com.yandex.passport.internal.ui.sloth.authsdk.a) gVar).a;
            reporter.getClass();
            fVar.getClass();
            str.getClass();
            reporter.n(t0.d, new ff(fVar), new com.yandex.passport.internal.report.f(reporter.e, 14), new com.yandex.passport.internal.report.c("caller_app_id", String.valueOf(reporter.c)), new com.yandex.passport.internal.report.c("caller_fingerprint", String.valueOf(reporter.d)), new com.yandex.passport.internal.report.c("state", str));
            n(authSdkActivity, fVar, null, 2);
            return;
        }
        if (gVar instanceof com.yandex.passport.internal.ui.sloth.authsdk.e) {
            d dVar2 = authSdkActivity.f;
            if (dVar2 == null) {
                Intrinsics.j("component");
                throw null;
            }
            com.yandex.passport.internal.report.reporters.g reporter2 = dVar2.getReporter();
            com.yandex.passport.common.core.f fVar2 = ((com.yandex.passport.internal.ui.sloth.authsdk.e) gVar).a;
            reporter2.getClass();
            fVar2.getClass();
            str.getClass();
            reporter2.n(com.yandex.passport.internal.report.w0.d, new ff(fVar2), new com.yandex.passport.internal.report.f(reporter2.e, 14), new com.yandex.passport.internal.report.c("caller_app_id", String.valueOf(reporter2.c)), new com.yandex.passport.internal.report.c("caller_fingerprint", String.valueOf(reporter2.d)), new com.yandex.passport.internal.report.c("state", str));
            n(authSdkActivity, null, fVar2, 1);
            return;
        }
        if (gVar instanceof com.yandex.passport.internal.ui.sloth.authsdk.f) {
            d dVar3 = authSdkActivity.f;
            if (dVar3 == null) {
                Intrinsics.j("component");
                throw null;
            }
            com.yandex.passport.internal.report.reporters.g reporter3 = dVar3.getReporter();
            reporter3.getClass();
            str.getClass();
            reporter3.u(z0.d, str);
            com.yandex.passport.internal.ui.sloth.authsdk.f fVar3 = (com.yandex.passport.internal.ui.sloth.authsdk.f) gVar;
            Intent intent = new Intent();
            intent.putExtra("com.yandex.auth.EXTRA_OAUTH_TOKEN", fVar3.a);
            intent.putExtra("com.yandex.auth.EXTRA_OAUTH_TOKEN_TYPE", fVar3.b);
            intent.putExtra("com.yandex.auth.OAUTH_TOKEN_EXPIRES", fVar3.c);
            authSdkActivity.setResult(-1, intent);
            authSdkActivity.finish();
            return;
        }
        if (Intrinsics.d(gVar, com.yandex.passport.internal.ui.sloth.authsdk.b.a)) {
            d dVar4 = authSdkActivity.f;
            if (dVar4 == null) {
                Intrinsics.j("component");
                throw null;
            }
            com.yandex.passport.internal.report.reporters.g reporter4 = dVar4.getReporter();
            reporter4.getClass();
            str.getClass();
            reporter4.u(x0.d, str);
            authSdkActivity.finish();
            return;
        }
        if (!(gVar instanceof com.yandex.passport.internal.ui.sloth.authsdk.d)) {
            b6e.s();
            return;
        }
        d dVar5 = authSdkActivity.f;
        if (dVar5 == null) {
            Intrinsics.j("component");
            throw null;
        }
        com.yandex.passport.internal.report.reporters.g reporter5 = dVar5.getReporter();
        Throwable th = ((com.yandex.passport.internal.ui.sloth.authsdk.d) gVar).a;
        reporter5.getClass();
        str.getClass();
        reporter5.n(y0.d, new ff(th), new com.yandex.passport.internal.report.f(reporter5.e, 14), new com.yandex.passport.internal.report.c("caller_app_id", String.valueOf(reporter5.c)), new com.yandex.passport.internal.report.c("caller_fingerprint", String.valueOf(reporter5.d)), new com.yandex.passport.internal.report.c("state", str));
        d dVar6 = authSdkActivity.f;
        if (dVar6 == null) {
            Intrinsics.j("component");
            throw null;
        }
        n ui = dVar6.getUi();
        a aVar = new a(authSdkActivity, 1);
        ui.getClass();
        com.yandex.passport.internal.ui.bouncer.error.q qVar = ui.d;
        ldg.B(qVar.e.g, new qs(aVar, continuation, 13));
        com.yandex.passport.internal.ui.bouncer.error.k kVar = qVar.d;
        kVar.g.setText(((com.yandex.passport.internal.common.d) ui.e).a());
        TextView textView = kVar.i;
        String str2 = ui.f.b().a;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(str2);
        kVar.h.setText("Error(" + th.getMessage() + ')');
        kVar.f.setText(new SimpleDateFormat("HH:mm (z) dd.MM.yyyy", Locale.getDefault()).format(Calendar.getInstance().getTime()).toString());
        ldg.B(qVar.g, new qs(ui, continuation, 14));
        d dVar7 = authSdkActivity.f;
        if (dVar7 != null) {
            authSdkActivity.setContentView(dVar7.getUi().e());
        } else {
            Intrinsics.j("component");
            throw null;
        }
    }

    public static void n(AuthSdkActivity authSdkActivity, com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, int i) {
        if ((i & 1) != 0) {
            fVar = null;
        }
        if ((i & 2) != 0) {
            fVar2 = null;
        }
        Bundle extras = authSdkActivity.getIntent().getExtras();
        if (extras == null) {
            xq0.q("Required value was null.");
            return;
        }
        com.yandex.passport.internal.properties.l lVar = com.yandex.plus.core.locale.b.l(authSdkActivity, extras).d;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "primaryEnvironment " + lVar.d.a, 8);
        }
        zh zhVar = authSdkActivity.k;
        com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k();
        kVar.b(null);
        com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
        com.yandex.passport.api.q qVar = com.yandex.passport.api.h.b;
        com.yandex.passport.api.impl.b bVar = lVar.d.a;
        qVar.getClass();
        jVar.a = com.yandex.passport.api.q.b(bVar);
        com.yandex.passport.api.impl.b bVar2 = lVar.d.b;
        jVar.b = bVar2 != null ? com.yandex.passport.api.q.b(bVar2) : null;
        jVar.y(com.yandex.passport.api.n.CHILDISH);
        kVar.b = jVar.l();
        zhVar.a(com.yandex.passport.internal.properties.l.a(com.yandex.plus.pay.ui.core.b.t(com.yandex.plus.pay.ui.core.b.t(kVar)), fVar2 != null ? com.yandex.plus.pay.ui.core.b.J(fVar2) : null, null, fVar != null ? com.yandex.plus.pay.ui.core.b.J(fVar) : null, 1073737663));
    }

    @Override // com.yandex.passport.internal.ui.c, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        com.yandex.passport.common.core.f fVar;
        rvr rvrVar = rvr.t;
        b1b.a(this, new zyr(0, 0, 0, rvrVar), new zyr(0, 0, 0, rvrVar));
        jyr jyrVar = this.e;
        this.f = ((PassportProcessGlobalComponent) jyrVar.getValue()).createAuthSdkActivityComponent(new e(this));
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                throw new IllegalStateException("Required value was null.");
            }
            l l2 = com.yandex.plus.core.locale.b.l(this, extras);
            com.yandex.passport.internal.properties.l lVar = l2.d;
            boolean z = l2.i != null;
            d dVar = this.f;
            if (dVar == null) {
                Intrinsics.j("component");
                throw null;
            }
            com.yandex.passport.internal.report.reporters.g reporter = dVar.getReporter();
            String str = l2.a;
            String str2 = l2.g;
            String str3 = l2.h;
            reporter.getClass();
            str.getClass();
            String str4 = this.g;
            str4.getClass();
            reporter.e = str;
            reporter.c = str2;
            reporter.d = str3;
            final int i = 1;
            final int i2 = 2;
            reporter.n(u0.d, new com.yandex.passport.internal.report.c("isTurbo", String.valueOf(z)), new com.yandex.passport.internal.report.f(str, 14), new com.yandex.passport.internal.report.c("caller_app_id", String.valueOf(str2)), new com.yandex.passport.internal.report.c("caller_fingerprint", String.valueOf(str3)), new com.yandex.passport.internal.report.c("state", str4));
            setTheme(z ? com.yandex.passport.internal.ui.util.s.f(lVar.e, this) : com.yandex.passport.internal.ui.util.s.e(lVar.e, this));
            super.onCreate(bundle);
            setContentView(R.layout.passport_activity_auth_sdk);
            View findViewById = findViewById(R.id.container);
            findViewById.getClass();
            findViewById.setBackgroundResource(R.color.passport_roundabout_background);
            setTitle("");
            jfu viewModelStore = getViewModelStore();
            gfu defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
            is6 defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
            viewModelStore.getClass();
            defaultViewModelProviderFactory.getClass();
            defaultViewModelCreationExtras.getClass();
            bjt bjtVar = new bjt(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
            lm4 a = ern.a(q.class);
            String f = a.f();
            if (f == null) {
                xq0.x("Local and anonymous classes can not be ViewModels");
                return;
            }
            q qVar = (q) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
            this.d = qVar;
            qVar.k.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.authsdk.b
                public final /* synthetic */ AuthSdkActivity b;

                {
                    this.b = this;
                }

                @Override // defpackage.xjj
                public final void onChanged(Object obj2) {
                    int i3 = r2;
                    AuthSdkActivity authSdkActivity = this.b;
                    switch (i3) {
                        case 0:
                            int i4 = AuthSdkActivity.l;
                            ((Unit) obj2).getClass();
                            Intent intent = new Intent();
                            intent.putExtra("com.yandex.auth.OAUTH_TOKEN_ERROR", true);
                            intent.putExtra("com.yandex.auth.OAUTH_TOKEN_ERROR_MESSAGES", new String[]{"access_denied"});
                            q qVar2 = authSdkActivity.d;
                            if (qVar2 == null) {
                                Intrinsics.j("commonViewModel");
                                throw null;
                            }
                            intent.putExtra("com.yandex.auth.FLOW_ERRORS", new ArrayList(qVar2.n));
                            authSdkActivity.setResult(-1, intent);
                            authSdkActivity.finish();
                            return;
                        case 1:
                            m mVar = (m) obj2;
                            int i5 = AuthSdkActivity.l;
                            mVar.getClass();
                            Intent intent2 = new Intent();
                            com.yandex.passport.internal.network.response.h hVar = mVar.a;
                            intent2.putExtra("com.yandex.auth.EXTRA_OAUTH_TOKEN", hVar.a);
                            intent2.putExtra("com.yandex.auth.EXTRA_OAUTH_TOKEN_TYPE", hVar.b);
                            intent2.putExtra("com.yandex.auth.OAUTH_TOKEN_EXPIRES", hVar.d);
                            intent2.putExtra("com.yandex.passport.AUTHORIZATION_CODE", hVar.c);
                            intent2.putExtra("com.yandex.auth.CLIENT_ID", mVar.c);
                            z1 J = com.yandex.plus.pay.ui.core.b.J(mVar.b);
                            com.yandex.passport.api.w0 w0Var = com.yandex.passport.api.w0.a;
                            intent2.putExtras(cxb.K(new Pair("passport-login-result-environment", Integer.valueOf(J.a.a)), new Pair("passport-login-result-uid", Long.valueOf(J.b)), new Pair("passport-login-action", 7), new Pair("passport-login-additional-action", null)));
                            com.yandex.passport.internal.entities.l lVar2 = mVar.d;
                            if (lVar2 != null) {
                                intent2.putExtra("com.yandex.auth.JWT_TOKEN", lVar2.a);
                            }
                            q qVar3 = authSdkActivity.d;
                            if (qVar3 == null) {
                                Intrinsics.j("commonViewModel");
                                throw null;
                            }
                            intent2.putExtra("com.yandex.auth.FLOW_ERRORS", new ArrayList(qVar3.n));
                            intent2.putExtra("com.yandex.auth.GRANTED_SCOPES", mVar.e);
                            authSdkActivity.setResult(-1, intent2);
                            authSdkActivity.finish();
                            return;
                        default:
                            int i6 = AuthSdkActivity.l;
                            ((Unit) obj2).getClass();
                            authSdkActivity.p();
                            return;
                    }
                }
            });
            q qVar2 = this.d;
            if (qVar2 == null) {
                Intrinsics.j("commonViewModel");
                throw null;
            }
            qVar2.l.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.authsdk.b
                public final /* synthetic */ AuthSdkActivity b;

                {
                    this.b = this;
                }

                @Override // defpackage.xjj
                public final void onChanged(Object obj2) {
                    int i3 = i;
                    AuthSdkActivity authSdkActivity = this.b;
                    switch (i3) {
                        case 0:
                            int i4 = AuthSdkActivity.l;
                            ((Unit) obj2).getClass();
                            Intent intent = new Intent();
                            intent.putExtra("com.yandex.auth.OAUTH_TOKEN_ERROR", true);
                            intent.putExtra("com.yandex.auth.OAUTH_TOKEN_ERROR_MESSAGES", new String[]{"access_denied"});
                            q qVar22 = authSdkActivity.d;
                            if (qVar22 == null) {
                                Intrinsics.j("commonViewModel");
                                throw null;
                            }
                            intent.putExtra("com.yandex.auth.FLOW_ERRORS", new ArrayList(qVar22.n));
                            authSdkActivity.setResult(-1, intent);
                            authSdkActivity.finish();
                            return;
                        case 1:
                            m mVar = (m) obj2;
                            int i5 = AuthSdkActivity.l;
                            mVar.getClass();
                            Intent intent2 = new Intent();
                            com.yandex.passport.internal.network.response.h hVar = mVar.a;
                            intent2.putExtra("com.yandex.auth.EXTRA_OAUTH_TOKEN", hVar.a);
                            intent2.putExtra("com.yandex.auth.EXTRA_OAUTH_TOKEN_TYPE", hVar.b);
                            intent2.putExtra("com.yandex.auth.OAUTH_TOKEN_EXPIRES", hVar.d);
                            intent2.putExtra("com.yandex.passport.AUTHORIZATION_CODE", hVar.c);
                            intent2.putExtra("com.yandex.auth.CLIENT_ID", mVar.c);
                            z1 J = com.yandex.plus.pay.ui.core.b.J(mVar.b);
                            com.yandex.passport.api.w0 w0Var = com.yandex.passport.api.w0.a;
                            intent2.putExtras(cxb.K(new Pair("passport-login-result-environment", Integer.valueOf(J.a.a)), new Pair("passport-login-result-uid", Long.valueOf(J.b)), new Pair("passport-login-action", 7), new Pair("passport-login-additional-action", null)));
                            com.yandex.passport.internal.entities.l lVar2 = mVar.d;
                            if (lVar2 != null) {
                                intent2.putExtra("com.yandex.auth.JWT_TOKEN", lVar2.a);
                            }
                            q qVar3 = authSdkActivity.d;
                            if (qVar3 == null) {
                                Intrinsics.j("commonViewModel");
                                throw null;
                            }
                            intent2.putExtra("com.yandex.auth.FLOW_ERRORS", new ArrayList(qVar3.n));
                            intent2.putExtra("com.yandex.auth.GRANTED_SCOPES", mVar.e);
                            authSdkActivity.setResult(-1, intent2);
                            authSdkActivity.finish();
                            return;
                        default:
                            int i6 = AuthSdkActivity.l;
                            ((Unit) obj2).getClass();
                            authSdkActivity.p();
                            return;
                    }
                }
            });
            q qVar3 = this.d;
            if (qVar3 == null) {
                Intrinsics.j("commonViewModel");
                throw null;
            }
            qVar3.m.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.authsdk.b
                public final /* synthetic */ AuthSdkActivity b;

                {
                    this.b = this;
                }

                @Override // defpackage.xjj
                public final void onChanged(Object obj2) {
                    int i3 = i2;
                    AuthSdkActivity authSdkActivity = this.b;
                    switch (i3) {
                        case 0:
                            int i4 = AuthSdkActivity.l;
                            ((Unit) obj2).getClass();
                            Intent intent = new Intent();
                            intent.putExtra("com.yandex.auth.OAUTH_TOKEN_ERROR", true);
                            intent.putExtra("com.yandex.auth.OAUTH_TOKEN_ERROR_MESSAGES", new String[]{"access_denied"});
                            q qVar22 = authSdkActivity.d;
                            if (qVar22 == null) {
                                Intrinsics.j("commonViewModel");
                                throw null;
                            }
                            intent.putExtra("com.yandex.auth.FLOW_ERRORS", new ArrayList(qVar22.n));
                            authSdkActivity.setResult(-1, intent);
                            authSdkActivity.finish();
                            return;
                        case 1:
                            m mVar = (m) obj2;
                            int i5 = AuthSdkActivity.l;
                            mVar.getClass();
                            Intent intent2 = new Intent();
                            com.yandex.passport.internal.network.response.h hVar = mVar.a;
                            intent2.putExtra("com.yandex.auth.EXTRA_OAUTH_TOKEN", hVar.a);
                            intent2.putExtra("com.yandex.auth.EXTRA_OAUTH_TOKEN_TYPE", hVar.b);
                            intent2.putExtra("com.yandex.auth.OAUTH_TOKEN_EXPIRES", hVar.d);
                            intent2.putExtra("com.yandex.passport.AUTHORIZATION_CODE", hVar.c);
                            intent2.putExtra("com.yandex.auth.CLIENT_ID", mVar.c);
                            z1 J = com.yandex.plus.pay.ui.core.b.J(mVar.b);
                            com.yandex.passport.api.w0 w0Var = com.yandex.passport.api.w0.a;
                            intent2.putExtras(cxb.K(new Pair("passport-login-result-environment", Integer.valueOf(J.a.a)), new Pair("passport-login-result-uid", Long.valueOf(J.b)), new Pair("passport-login-action", 7), new Pair("passport-login-additional-action", null)));
                            com.yandex.passport.internal.entities.l lVar2 = mVar.d;
                            if (lVar2 != null) {
                                intent2.putExtra("com.yandex.auth.JWT_TOKEN", lVar2.a);
                            }
                            q qVar32 = authSdkActivity.d;
                            if (qVar32 == null) {
                                Intrinsics.j("commonViewModel");
                                throw null;
                            }
                            intent2.putExtra("com.yandex.auth.FLOW_ERRORS", new ArrayList(qVar32.n));
                            intent2.putExtra("com.yandex.auth.GRANTED_SCOPES", mVar.e);
                            authSdkActivity.setResult(-1, intent2);
                            authSdkActivity.finish();
                            return;
                        default:
                            int i6 = AuthSdkActivity.l;
                            ((Unit) obj2).getClass();
                            authSdkActivity.p();
                            return;
                    }
                }
            });
            if (bundle != null) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("flow_errors");
                if (stringArrayList != null) {
                    q qVar4 = this.d;
                    if (qVar4 == null) {
                        Intrinsics.j("commonViewModel");
                        throw null;
                    }
                    ArrayList arrayList = qVar4.n;
                    arrayList.clear();
                    arrayList.addAll(stringArrayList);
                    return;
                }
                return;
            }
            if (z) {
                z zVar = new z();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("auth_sdk_properties", l2);
                zVar.setArguments(bundle2);
                zVar.show(getSupportFragmentManager(), (String) null);
                return;
            }
            com.yandex.passport.internal.l a2 = ((PassportProcessGlobalComponent) jyrVar.getValue()).getCurrentAccountManager().a();
            if (a2 == null || (fVar = a2.b) == null || (obj = fVar.a) == null) {
                obj = Boolean.FALSE;
            }
            z1 z1Var = l2.f;
            r4 = obj == com.yandex.plus.core.network.api.utils.a.L(lVar.d.a) ? 1 : 0;
            jyr jyrVar2 = this.j;
            if (z1Var != null) {
                ((zh) jyrVar2.getValue()).a(l2.e(com.yandex.plus.pay.ui.core.b.L(z1Var), str4));
            } else if (a2 == null || r4 == 0) {
                n(this, null, null, 3);
            } else {
                ((zh) jyrVar2.getValue()).a(l2.e(a2.b, str4));
            }
        } catch (Exception unused) {
            super.onCreate(bundle);
            finish();
        }
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        q qVar = this.d;
        if (qVar != null) {
            bundle.putStringArrayList("flow_errors", new ArrayList<>(qVar.n));
        } else {
            Intrinsics.j("commonViewModel");
            throw null;
        }
    }

    public final void p() {
        Intent intent = new Intent();
        intent.putExtra("com.yandex.auth.OAUTH_TOKEN_ERROR", true);
        intent.putExtra("com.yandex.auth.OAUTH_TOKEN_ERROR_MESSAGES", new String[]{"user_cancelled"});
        q qVar = this.d;
        if (qVar == null) {
            Intrinsics.j("commonViewModel");
            throw null;
        }
        intent.putExtra("com.yandex.auth.FLOW_ERRORS", new ArrayList(qVar.n));
        setResult(0, intent);
        finish();
    }
}
