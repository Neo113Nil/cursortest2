package com.yandex.passport.internal.social.esia;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import defpackage.b1b;
import defpackage.btf;
import defpackage.ern;
import defpackage.hn5;
import defpackage.in5;
import defpackage.jyr;
import defpackage.rb;
import defpackage.u0v;
import defpackage.vwb;
import defpackage.wn5;
import defpackage.wxf;
import defpackage.ybf;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class EsiaBindActivity extends hn5 {
    public static final /* synthetic */ int h = 0;
    public Boolean d;
    public com.yandex.passport.common.core.f e;
    public com.yandex.passport.common.ui.a f;
    public final jyr a = btf.b(new a(this, 0));
    public final jyr b = btf.b(new a(this, 1));
    public final ybf c = new ybf(ern.a(n0.class), new c(this, 0), new a(this, 2), new c(this, 1));
    public final jyr g = btf.b(new com.yandex.passport.internal.push.w0(3));

    public final void h(Throwable th) {
        Serializable tVar;
        if (th instanceof com.yandex.passport.api.exception.j) {
            tVar = (com.yandex.passport.api.exception.j) th;
        } else if (th instanceof p0) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            tVar = new com.yandex.passport.api.exception.h(message);
        } else {
            th.getClass();
            th.getClass();
            tVar = new com.yandex.passport.api.exception.t(th);
        }
        setResult(2, new Intent().putExtra("EXTRA_EXCEPTION", tVar));
        j().x(this.e, com.yandex.passport.internal.report.reporters.y.c, th);
        finish();
    }

    public final com.yandex.passport.internal.properties.j i() {
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        try {
            extras.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
            com.yandex.passport.internal.properties.j jVar = (com.yandex.passport.internal.properties.j) extras.getParcelable("esia-bind-properties");
            if (jVar != null) {
                return jVar;
            }
            throw new IllegalStateException("Bundle has no ".concat(com.yandex.passport.internal.properties.j.class.getSimpleName()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final com.yandex.passport.internal.report.reporters.z j() {
        return (com.yandex.passport.internal.report.reporters.z) this.b.getValue();
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.yandex.passport.common.ui.a aVar;
        Serializable serializable;
        z1 z1Var;
        y1 y1Var;
        com.yandex.passport.internal.properties.j i = i();
        com.yandex.passport.common.core.f fVar = null;
        if (i == null || (y1Var = i.a) == null) {
            if (bundle != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    serializable = rb.z(bundle, com.yandex.passport.common.ui.a.class, "SAVED_THEME");
                } else {
                    serializable = bundle.getSerializable("SAVED_THEME");
                    if (!com.yandex.passport.common.ui.a.class.isInstance(serializable)) {
                        serializable = null;
                    }
                }
                aVar = (com.yandex.passport.common.ui.a) serializable;
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = com.yandex.passport.common.ui.a.c;
            }
        } else {
            aVar = com.yandex.plus.pay.ui.core.b.G(y1Var);
        }
        this.f = aVar;
        this.d = bundle != null ? Boolean.valueOf(bundle.getBoolean("SAVED_IS_OPEN_IN_APP")) : null;
        if (i != null && (z1Var = i.b) != null) {
            fVar = com.yandex.plus.pay.ui.core.b.L(z1Var);
        } else if (bundle != null) {
            fVar = (com.yandex.passport.common.core.f) vwb.O(bundle, com.yandex.passport.common.core.f.class, "SAVED_UID");
        }
        this.e = fVar;
        b1b.a(this, com.yandex.plus.pay.ui.core.b.C(aVar), com.yandex.plus.pay.ui.core.b.C(aVar));
        super.onCreate(bundle);
        in5.a(this, new wn5(new u0v(24, aVar, this), -595149696, true));
        wxf.k(getOnBackPressedDispatcher(), this, new b(this, 0));
    }

    @Override // defpackage.hn5, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        n0 n0Var = (n0) this.c.getValue();
        Uri data = intent.getData();
        Boolean bool = this.d;
        n0Var.k.a(new g0(data, bool != null ? bool.booleanValue() ? com.yandex.passport.internal.report.reporters.x.APPLICATION : com.yandex.passport.internal.report.reporters.x.BROWSER : null));
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        n0 n0Var = (n0) this.c.getValue();
        Boolean bool = this.d;
        if (bool != null) {
            bool.booleanValue();
            com.yandex.passport.internal.report.reporters.x xVar = com.yandex.passport.internal.report.reporters.x.WEB_VIEW;
        }
        n0Var.k.a(i0.a);
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        Boolean bool = this.d;
        if (bool != null) {
            bundle.putBoolean("SAVED_IS_OPEN_IN_APP", bool.booleanValue());
        }
        com.yandex.passport.common.core.f fVar = this.e;
        if (fVar != null) {
            bundle.putParcelable("SAVED_UID", fVar);
        }
        com.yandex.passport.common.ui.a aVar = this.f;
        if (aVar != null) {
            bundle.putSerializable("SAVED_THEME", aVar);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            ((CookieManager) this.g.getValue()).flush();
        } catch (Exception e) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "cookieManager.flush() error", e);
            }
        }
        super.onStop();
    }
}
