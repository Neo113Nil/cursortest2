package com.yandex.passport.internal.ui.sloth.webauthn;

import android.os.Bundle;
import defpackage.b1b;
import defpackage.hq0;
import defpackage.in5;
import defpackage.kws;
import defpackage.wn5;
import defpackage.wxf;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class RegisterWebAuthNActivity extends hq0 {
    public static final /* synthetic */ int a = 0;

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object p = com.yandex.plus.pay.ui.core.b.p(this, "PassportRegisterWebAuthNProperties", new com.yandex.passport.internal.ui.challenge.vpn.c(1, f.c, d.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/sloth/webauthn/RegisterWebAuthNProperties;", 0, 9));
        Throwable a2 = z7o.a(p);
        if (a2 != null) {
            com.yandex.passport.internal.ui.a.q(this, a2);
            return;
        }
        f fVar = (f) p;
        com.yandex.passport.common.ui.a aVar = fVar.b;
        b1b.a(this, com.yandex.plus.pay.ui.core.b.C(aVar), com.yandex.plus.pay.ui.core.b.C(aVar));
        b build = com.yandex.passport.internal.di.a.a().createRegisterWebAuthNComponentBuilder().setProperties(fVar).setProgressProperties(com.yandex.passport.common.ui.progress.g.e).setActivity(this).build();
        build.getWebAuthN().d(this);
        in5.a(this, new wn5(new kws(29, aVar, build, this), 1042030007, true));
        wxf.k(getOnBackPressedDispatcher(), this, new com.yandex.passport.internal.ui.sloth.ebs.i(1, build, fVar, this));
    }
}
