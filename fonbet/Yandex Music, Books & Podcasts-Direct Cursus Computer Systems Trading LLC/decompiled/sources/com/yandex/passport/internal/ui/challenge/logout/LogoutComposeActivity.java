package com.yandex.passport.internal.ui.challenge.logout;

import android.os.Bundle;
import defpackage.b1b;
import defpackage.hn5;
import defpackage.in5;
import defpackage.vlv;
import defpackage.wn5;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class LogoutComposeActivity extends hn5 {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        d dVar;
        Object p = com.yandex.plus.pay.ui.core.b.p(this, "LogoutProperties", new vlv(1, com.yandex.passport.internal.properties.u.g, com.yandex.passport.internal.properties.t.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/properties/PassportLogoutPropertiesImpl;", 0, 27));
        Throwable a2 = z7o.a(p);
        if (a2 != null) {
            Exception exc = a2 instanceof Exception ? (Exception) a2 : null;
            if (exc == null) {
                exc = new RuntimeException(a2);
            }
            com.yandex.plus.core.locale.b.i(this, exc);
            return;
        }
        t H = com.yandex.passport.internal.ui.a.H((com.yandex.passport.internal.properties.u) p);
        com.yandex.passport.common.ui.a aVar = H.b;
        b1b.a(this, com.yandex.plus.pay.ui.core.b.C(aVar), com.yandex.plus.pay.ui.core.b.C(aVar));
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            d.a.getClass();
            extras.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
            Serializable serializable = extras.getSerializable("passport-logout-behaviour");
            dVar = serializable instanceof d ? (d) serializable : null;
        }
        dVar = d.b;
        in5.a(this, new wn5(new g(H, com.yandex.passport.internal.di.a.a().createLogoutComposeComponentBuilder().setUid(H.a).setTheme(aVar).setProgressProperties(H.e).setLogoutBehaviour(dVar).build(), this), -198413470, true));
    }
}
