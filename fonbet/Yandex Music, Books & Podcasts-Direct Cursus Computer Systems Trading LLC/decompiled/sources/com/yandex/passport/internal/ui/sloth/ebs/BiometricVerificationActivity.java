package com.yandex.passport.internal.ui.sloth.ebs;

import android.os.Bundle;
import defpackage.b1b;
import defpackage.hn5;
import defpackage.in5;
import defpackage.kws;
import defpackage.wn5;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class BiometricVerificationActivity extends hn5 {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, "[EBS]", "BiometricVerificationActivity::onCreate", 8);
        }
        Object p = com.yandex.plus.pay.ui.core.b.p(this, "PassportBiometricVerificationProperties", new com.yandex.passport.internal.ui.challenge.vpn.c(1, f.e, d.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/sloth/ebs/BiometricVerificationProperties;", 0, 7));
        Throwable a2 = z7o.a(p);
        if (a2 != null) {
            com.yandex.passport.internal.ui.a.q(this, a2);
            return;
        }
        f fVar = (f) p;
        com.yandex.passport.common.ui.a aVar = fVar.d;
        b1b.a(this, com.yandex.plus.pay.ui.core.b.C(aVar), com.yandex.plus.pay.ui.core.b.C(aVar));
        in5.a(this, new wn5(new kws(27, aVar, com.yandex.passport.internal.di.a.a().createBiometricVerificationComponentBuilder().setProperties(fVar).setProgressProperties(com.yandex.passport.common.ui.progress.g.e).setActivity(this).build(), this), 976124233, true));
    }
}
