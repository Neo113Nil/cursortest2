package com.yandex.passport.internal.ui.autologin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.api.t;
import com.yandex.passport.api.w0;
import com.yandex.passport.common.core.f;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.w;
import com.yandex.passport.internal.links.i;
import com.yandex.passport.internal.properties.g;
import com.yandex.passport.internal.report.diary.j0;
import com.yandex.passport.internal.ui.util.k;
import com.yandex.passport.internal.ui.util.l;
import com.yandex.passport.internal.util.p;
import defpackage.fb7;
import defpackage.hq0;
import defpackage.xal;
import defpackage.xq0;
import defpackage.xy0;

/* loaded from: classes4.dex */
public class AutoLoginRetryActivity extends hq0 {
    public static final /* synthetic */ int l = 0;
    public o0 a;
    public g b;
    public boolean c;
    public w d;
    public View e;
    public View f;
    public c g;
    public Button h;
    public TextView i;
    public e j;
    public final com.yandex.passport.internal.common.e k = new com.yandex.passport.internal.common.e(10, this);

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    @Override // defpackage.hn5, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.a = a.getEventReporter();
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        a.getDiaryRecorder().a(j0.a, extras, null);
        extras.setClassLoader(p.class.getClassLoader());
        g gVar = (g) extras.getParcelable("passport-auto-login-properties");
        if (gVar == null) {
            xq0.q("Bundle has no ".concat(g.class.getSimpleName()));
            return;
        }
        this.b = gVar;
        w wVar = (w) extras.getParcelable("credentials");
        wVar.getClass();
        this.d = wVar;
        this.c = extras.getBoolean("is_error_temporary");
        setTitle((CharSequence) null);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        getWindow().setDimAmount(0.0f);
        getWindow().addFlags(32);
        setContentView(R.layout.passport_activity_autologin_retry);
        this.e = findViewById(R.id.layout_retry);
        this.f = findViewById(R.id.progress);
        Button button = (Button) findViewById(R.id.button_retry);
        this.h = button;
        button.setOnClickListener(new xal(15, this));
        TextView textView = (TextView) findViewById(R.id.text_message);
        this.i = textView;
        textView.setText(getString(R.string.passport_autologin_auth_failed_message, this.d.b));
        c cVar = (c) com.yandex.passport.internal.w.d(this, c.class, new fb7(9, this, a));
        this.g = cVar;
        k kVar = cVar.l;
        i iVar = new i(1, this);
        kVar.getClass();
        kVar.f(this, new b(3, iVar));
        this.g.u.n(this, new l() { // from class: com.yandex.passport.internal.ui.autologin.a
            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                f fVar = (f) obj;
                AutoLoginRetryActivity autoLoginRetryActivity = AutoLoginRetryActivity.this;
                o0 o0Var = autoLoginRetryActivity.a;
                o0Var.getClass();
                o0Var.a.b(com.yandex.passport.internal.analytics.d.g, new xy0(0));
                com.yandex.passport.internal.ui.a.r(autoLoginRetryActivity, com.yandex.plus.core.network.api.utils.a.F(new t(com.yandex.plus.pay.ui.core.b.J(fVar), com.yandex.plus.core.locale.b.B(a.getAccountsRetriever().a().e(fVar)), w0.g, null, null)));
            }
        });
        this.g.t.f(this, new b(0, this));
        if (bundle == null) {
            o0 o0Var = this.a;
            o0Var.getClass();
            o0Var.a.b(com.yandex.passport.internal.analytics.d.d, new xy0(0));
        }
        this.j = new e(this, bundle, this.k, 10000L);
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("create_time", this.j.a);
    }
}
