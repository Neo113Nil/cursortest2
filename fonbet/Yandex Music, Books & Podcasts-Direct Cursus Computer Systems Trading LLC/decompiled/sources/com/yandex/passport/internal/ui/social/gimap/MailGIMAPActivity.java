package com.yandex.passport.internal.ui.social.gimap;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.yandex.passport.R;
import com.yandex.passport.api.w0;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.w;
import defpackage.jw7;
import defpackage.tn3;
import defpackage.vwb;
import defpackage.xq0;
import defpackage.xy0;
import defpackage.z4k;
import java.util.EnumSet;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MailGIMAPActivity extends com.yandex.passport.internal.ui.base.a {
    public static final /* synthetic */ int h = 0;
    public com.yandex.passport.internal.properties.l e;
    public q f;
    public o0 g;

    @Override // com.yandex.passport.internal.ui.base.a, defpackage.hn5, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (((Stack) this.d.b).isEmpty()) {
            o0 o0Var = this.g;
            o0Var.getClass();
            o0Var.a.b(com.yandex.passport.internal.analytics.f.d, new xy0(0));
        }
    }

    @Override // com.yandex.passport.internal.ui.base.a, com.yandex.passport.internal.ui.c, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.g = a.getEventReporter();
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        com.yandex.passport.internal.properties.l lVar = (com.yandex.passport.internal.properties.l) com.appsflyer.internal.k.h(extras, com.yandex.passport.internal.util.p.class, "passport-login-properties");
        if (lVar == null) {
            xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.l.class));
            return;
        }
        this.e = lVar;
        com.yandex.passport.internal.properties.l lVar2 = (com.yandex.passport.internal.properties.l) com.appsflyer.internal.k.h(extras, com.yandex.passport.internal.util.p.class, "passport-login-properties");
        if (lVar2 == null) {
            xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.l.class));
            return;
        }
        com.yandex.passport.common.core.b L = com.yandex.plus.core.network.api.utils.a.L(lVar2.d.a);
        p b = p.b(L, lVar2.k);
        com.yandex.passport.internal.l lVar3 = null;
        if (!extras.containsKey("master-account")) {
            extras = null;
        }
        if (extras != null) {
            Object parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(extras, com.yandex.passport.internal.l.class, "master-account") : extras.getParcelable("master-account");
            if (parcelable == null) {
                xq0.q("can't get required parcelable master-account");
                return;
            }
            lVar3 = (com.yandex.passport.internal.l) parcelable;
        }
        final int i = 0;
        if (lVar3 != null) {
            String a2 = lVar3.f.a(com.yandex.passport.internal.stash.b.GIMAP_TRACK);
            if (a2 != null) {
                try {
                    b = p.c(new JSONObject(a2));
                } catch (JSONException e) {
                    com.yandex.passport.legacy.a.e(6, "failed to restore track from stash", e);
                    o0 o0Var = this.g;
                    String message = e.getMessage();
                    o0Var.getClass();
                    message.getClass();
                    xy0 xy0Var = new xy0(0);
                    xy0Var.put("error", message);
                    o0Var.a.b(com.yandex.passport.internal.analytics.f.h, xy0Var);
                }
            } else {
                b = p.b(L, lVar3.i());
            }
        }
        this.f = (q) w.d(this, q.class, new jw7(3, this, b, a));
        super.onCreate(bundle);
        final int i2 = 1;
        if (bundle == null) {
            o0 o0Var2 = this.g;
            boolean z = b.a != null;
            o0Var2.getClass();
            xy0 xy0Var2 = new xy0(0);
            xy0Var2.put("relogin", String.valueOf(z));
            o0Var2.a.b(com.yandex.passport.internal.analytics.f.c, xy0Var2);
        }
        setContentView(R.layout.passport_activity_rambler_login);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        j();
        if (bundle == null) {
            tn3 tn3Var = new tn3(12, this);
            int i3 = j.t;
            n(new com.yandex.passport.internal.ui.base.m(tn3Var, "j", false, 1));
        }
        this.f.s.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.social.gimap.s
            public final /* synthetic */ MailGIMAPActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i4 = i;
                MailGIMAPActivity mailGIMAPActivity = this.b;
                switch (i4) {
                    case 0:
                        com.yandex.passport.internal.l lVar4 = (com.yandex.passport.internal.l) obj;
                        o0 o0Var3 = mailGIMAPActivity.g;
                        o0Var3.getClass();
                        lVar4.getClass();
                        xy0 xy0Var3 = new xy0(0);
                        xy0Var3.put("uid", String.valueOf(lVar4.b.b));
                        o0Var3.a.b(com.yandex.passport.internal.analytics.f.e, xy0Var3);
                        Intent intent = new Intent();
                        w0 w0Var = w0.i;
                        EnumSet noneOf = EnumSet.noneOf(com.yandex.passport.internal.ui.domik.w.class);
                        noneOf.getClass();
                        intent.putExtras(new com.yandex.passport.internal.ui.domik.u(lVar4, null, w0Var, null, noneOf).t());
                        mailGIMAPActivity.setResult(-1, intent);
                        mailGIMAPActivity.finish();
                        break;
                    default:
                        z4k z4kVar = (z4k) obj;
                        int i5 = MailGIMAPActivity.h;
                        String str = (String) z4kVar.a;
                        str.getClass();
                        t tVar = (t) z4kVar.b;
                        tVar.getClass();
                        o0 o0Var4 = mailGIMAPActivity.g;
                        o0Var4.getClass();
                        String str2 = tVar.a;
                        xy0 xy0Var4 = new xy0(0);
                        xy0Var4.put("provider_code", str2);
                        o0Var4.a.b(com.yandex.passport.internal.analytics.f.i, xy0Var4);
                        Intent intent2 = new Intent();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("authAccount", str);
                        bundle2.putSerializable("configuration_to_relogin_with", tVar);
                        intent2.putExtras(bundle2);
                        mailGIMAPActivity.setResult(-1, intent2);
                        mailGIMAPActivity.finish();
                        break;
                }
            }
        });
        this.f.t.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.social.gimap.s
            public final /* synthetic */ MailGIMAPActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i4 = i2;
                MailGIMAPActivity mailGIMAPActivity = this.b;
                switch (i4) {
                    case 0:
                        com.yandex.passport.internal.l lVar4 = (com.yandex.passport.internal.l) obj;
                        o0 o0Var3 = mailGIMAPActivity.g;
                        o0Var3.getClass();
                        lVar4.getClass();
                        xy0 xy0Var3 = new xy0(0);
                        xy0Var3.put("uid", String.valueOf(lVar4.b.b));
                        o0Var3.a.b(com.yandex.passport.internal.analytics.f.e, xy0Var3);
                        Intent intent = new Intent();
                        w0 w0Var = w0.i;
                        EnumSet noneOf = EnumSet.noneOf(com.yandex.passport.internal.ui.domik.w.class);
                        noneOf.getClass();
                        intent.putExtras(new com.yandex.passport.internal.ui.domik.u(lVar4, null, w0Var, null, noneOf).t());
                        mailGIMAPActivity.setResult(-1, intent);
                        mailGIMAPActivity.finish();
                        break;
                    default:
                        z4k z4kVar = (z4k) obj;
                        int i5 = MailGIMAPActivity.h;
                        String str = (String) z4kVar.a;
                        str.getClass();
                        t tVar = (t) z4kVar.b;
                        tVar.getClass();
                        o0 o0Var4 = mailGIMAPActivity.g;
                        o0Var4.getClass();
                        String str2 = tVar.a;
                        xy0 xy0Var4 = new xy0(0);
                        xy0Var4.put("provider_code", str2);
                        o0Var4.a.b(com.yandex.passport.internal.analytics.f.i, xy0Var4);
                        Intent intent2 = new Intent();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("authAccount", str);
                        bundle2.putSerializable("configuration_to_relogin_with", tVar);
                        intent2.putExtras(bundle2);
                        mailGIMAPActivity.setResult(-1, intent2);
                        mailGIMAPActivity.finish();
                        break;
                }
            }
        });
    }

    @Override // com.yandex.passport.internal.ui.c, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f.H(bundle);
    }

    @Override // com.yandex.passport.internal.ui.base.a, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f.J(bundle);
    }
}
