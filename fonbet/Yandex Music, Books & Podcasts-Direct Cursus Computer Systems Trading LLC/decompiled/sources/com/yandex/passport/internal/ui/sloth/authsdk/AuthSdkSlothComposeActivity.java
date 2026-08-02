package com.yandex.passport.internal.ui.sloth.authsdk;

import android.os.Bundle;
import defpackage.b1b;
import defpackage.hn5;
import defpackage.in5;
import defpackage.wn5;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class AuthSdkSlothComposeActivity extends hn5 {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object p = com.yandex.plus.pay.ui.core.b.p(this, "SlothParams", new com.yandex.passport.internal.ui.challenge.vpn.c(1, com.yandex.passport.sloth.data.m.e, com.yandex.passport.sloth.data.l.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/sloth/data/SlothParams;", 0, 6));
        Throwable a2 = z7o.a(p);
        if (a2 != null) {
            com.yandex.passport.internal.ui.a.q(this, a2);
            return;
        }
        com.yandex.passport.common.ui.a aVar = com.yandex.passport.common.ui.a.c;
        b1b.a(this, com.yandex.plus.pay.ui.core.b.C(aVar), com.yandex.plus.pay.ui.core.b.C(aVar));
        in5.a(this, new wn5(new m(com.yandex.passport.internal.di.a.a().createAuthSdkSlothComposeComponentBuilder().setSlothParams((com.yandex.passport.sloth.data.m) p).setProgressProperties(com.yandex.passport.common.ui.progress.g.e).setActivity(this).build(), this, 0), 1736812677, true));
    }
}
