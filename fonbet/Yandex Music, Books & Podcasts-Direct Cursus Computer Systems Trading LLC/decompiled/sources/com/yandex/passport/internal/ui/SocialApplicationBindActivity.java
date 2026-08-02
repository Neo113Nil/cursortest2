package com.yandex.passport.internal.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.yandex.passport.R;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.analytics.s;
import com.yandex.passport.internal.analytics.x;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.d0;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.browser.SocialBrowserActivity;
import com.yandex.passport.internal.util.p;
import defpackage.b6e;
import defpackage.fb7;
import defpackage.jj4;
import defpackage.tot;
import defpackage.xq0;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Pair;

/* loaded from: classes4.dex */
public class SocialApplicationBindActivity extends c {
    public static final /* synthetic */ int m = 0;
    public d0 d;
    public String e;
    public com.yandex.passport.internal.network.client.g f;
    public com.yandex.passport.internal.core.accounts.e g;
    public com.yandex.passport.internal.network.client.h h;
    public x i;
    public com.yandex.passport.common.core.f j;
    public String k;
    public com.yandex.passport.legacy.lx.j l;

    public final d0 m() {
        if (getIntent().getAction() != null) {
            xq0.q("clientId required for call this activity");
            return null;
        }
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        d0 d0Var = (d0) com.appsflyer.internal.k.h(extras, p.class, "passport-application-bind-properties");
        if (d0Var != null) {
            return d0Var;
        }
        xq0.q(com.appsflyer.internal.k.m("Bundle has no ", d0.class));
        return null;
    }

    public final void n() {
        com.yandex.passport.common.core.f fVar = this.j;
        if (fVar == null) {
            com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k();
            kVar.c(this.d.a);
            kVar.q = "passport/social_application_bind";
            startActivityForResult(com.yandex.passport.internal.ui.router.b.a(this, kVar.a(), true, null, null), 3);
            return;
        }
        if (this.k != null) {
            this.l = new com.yandex.passport.legacy.lx.e(new com.yandex.passport.legacy.lx.i(new fb7(8, this, fVar))).h(new tot(16, this), new l(0, this, fVar));
        } else {
            xq0.q("Task id null in finishBindApplication");
        }
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null || i2 == 0) {
            com.yandex.passport.legacy.a.e(6, "Bind application cancelled", null);
            x xVar = this.i;
            xVar.getClass();
            xVar.a(s.k, new Pair("request_code", String.valueOf(i)));
            finish();
            return;
        }
        if (i == 1) {
            if (intent.getBooleanExtra("com.yandex.auth.OAUTH_TOKEN_ERROR", false)) {
                com.yandex.passport.legacy.a.e(6, "Accept permissions declined", null);
                x xVar2 = this.i;
                xVar2.getClass();
                xVar2.a(s.d, new Pair[0]);
                finish();
                return;
            }
            String stringExtra = intent.getStringExtra("com.yandex.passport.AUTHORIZATION_CODE");
            stringExtra.getClass();
            this.j = com.yandex.plus.pay.ui.core.b.K(com.yandex.plus.core.locale.b.j(intent.getExtras()).a);
            p(stringExtra);
            x xVar3 = this.i;
            xVar3.getClass();
            xVar3.a(s.e, new Pair[0]);
            return;
        }
        if (i == 3) {
            this.j = com.yandex.plus.pay.ui.core.b.K(com.yandex.plus.core.locale.b.j(intent.getExtras()).a);
            n();
            x xVar4 = this.i;
            xVar4.getClass();
            xVar4.a(s.f, new Pair[0]);
        } else if (i == 2) {
            Uri data = intent.getData();
            if (data == null) {
                com.yandex.passport.legacy.a.e(6, "Browser didn't return data in intent", null);
                x xVar5 = this.i;
                xVar5.getClass();
                xVar5.a(s.h, new Pair("status", "Browser didn't return data in intent"));
                finish();
            } else {
                String queryParameter = data.getQueryParameter("status");
                x xVar6 = this.i;
                xVar6.getClass();
                xVar6.a(s.h, new Pair("status", queryParameter == null ? "null" : queryParameter));
                if ("ok".equalsIgnoreCase(queryParameter)) {
                    String queryParameter2 = data.getQueryParameter("task_id");
                    if (queryParameter2 == null) {
                        jj4.j("task_id is null");
                        return;
                    } else {
                        this.k = queryParameter2;
                        n();
                    }
                } else {
                    com.yandex.passport.legacy.a.e(6, "Wrong status has returned from browser: " + queryParameter, null);
                    finish();
                }
            }
        } else if (i == 4) {
            this.j = com.yandex.plus.pay.ui.core.b.K(com.yandex.plus.core.locale.b.j(intent.getExtras()).a);
            n();
            x xVar7 = this.i;
            xVar7.getClass();
            xVar7.a(s.g, new Pair[0]);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.yandex.passport.internal.ui.c, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.g = a.getAccountsRetriever();
        try {
            d0 m2 = m();
            this.d = m2;
            setTheme(com.yandex.passport.internal.ui.util.s.d(m2.b, this));
            super.onCreate(bundle);
            this.h = a.getClientChooser();
            this.i = a.getAppBindReporter();
            this.f = this.h.a(com.yandex.plus.core.network.api.utils.a.L(this.d.a.a));
            if (bundle == null) {
                this.e = com.yandex.passport.internal.util.b.b();
                x xVar = this.i;
                d0 d0Var = this.d;
                String str = d0Var.d;
                String str2 = d0Var.e;
                xVar.getClass();
                str.getClass();
                s sVar = s.c;
                Pair pair = new Pair("application_name", str);
                if (str2 == null) {
                    str2 = "null";
                }
                xVar.a(sVar, pair, new Pair("client_id", str2));
                d0 d0Var2 = this.d;
                String str3 = d0Var2.e;
                z1 z1Var = d0Var2.c;
                if (str3 == null) {
                    this.j = z1Var != null ? com.yandex.plus.pay.ui.core.b.L(z1Var) : null;
                    p(null);
                } else {
                    com.yandex.passport.internal.entities.k kVar = d0Var2.a;
                    y1 y1Var = d0Var2.b;
                    kVar.getClass();
                    y1Var.getClass();
                    Intent intent = new Intent(this, (Class<?>) AuthSdkActivity.class);
                    intent.putExtra("com.yandex.auth.CLIENT_ID", str3);
                    intent.putExtra("com.yandex.passport.RESPONSE_TYPE", "code");
                    if (z1Var != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("passport-uid", z1Var);
                        intent.putExtras(bundle2);
                    }
                    intent.putExtra("com.yandex.passport.ACCOUNTS_FILTER", a.s(kVar));
                    intent.putExtra("com.yandex.passport.THEME", y1Var.ordinal());
                    intent.putExtra("com.yandex.auth.DISALLOW_ACCOUNT_CHANGE", true);
                    startActivityForResult(intent, 1);
                }
            } else {
                String string = bundle.getString("code-challenge");
                string.getClass();
                this.e = string;
                this.j = (com.yandex.passport.common.core.f) com.appsflyer.internal.k.h(bundle, p.class, "passport-uid");
                this.k = bundle.getString("task-id");
            }
            setContentView(R.layout.passport_activity_bind_social_application);
        } catch (Exception e) {
            com.yandex.passport.legacy.a.d(e);
            finish();
            super.onCreate(bundle);
        }
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        com.yandex.passport.legacy.lx.j jVar = this.l;
        if (jVar != null) {
            jVar.a();
            this.l = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("code-challenge", this.e);
        com.yandex.passport.common.core.f fVar = this.j;
        if (fVar != null) {
            fVar.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("passport-uid", fVar);
            bundle.putAll(bundle2);
        }
        String str = this.k;
        if (str != null) {
            bundle.putString("task-id", str);
        }
    }

    public final void p(String str) {
        com.yandex.passport.internal.network.client.j b = this.h.b(com.yandex.plus.core.network.api.utils.a.L(this.d.a.a));
        String b2 = com.yandex.passport.common.browser.c.b(this);
        String str2 = this.d.d;
        String str3 = this.e;
        str3.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Charset forName = Charset.forName("utf8");
            forName.getClass();
            byte[] bytes = str3.getBytes(forName);
            bytes.getClass();
            byte[] digest = messageDigest.digest(bytes);
            digest.getClass();
            String encodeToString = Base64.encodeToString(digest, 11);
            encodeToString.getClass();
            str2.getClass();
            Uri.Builder appendQueryParameter = Uri.parse(b.e()).buildUpon().appendEncodedPath("broker2/authz_in_app/start").appendQueryParameter("application_name", str2).appendQueryParameter("code_challenge", encodeToString).appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("consumer", ((com.yandex.passport.internal.common.d) b.f).a()).appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("retpath", b2).appendQueryParameter("place", "query").appendQueryParameter("display", "touch");
            if (str != null) {
                appendQueryParameter.appendQueryParameter("yandex_auth_code", str);
            }
            String builder = appendQueryParameter.toString();
            builder.getClass();
            startActivityForResult(SocialBrowserActivity.a(this, Uri.parse(builder)), 2);
        } catch (UnsupportedEncodingException e) {
            b6e.q(e);
        } catch (NoSuchAlgorithmException e2) {
            b6e.q(e2);
        }
    }
}
