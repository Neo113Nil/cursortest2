package com.yandex.passport.internal.ui.sloth;

import android.os.Bundle;
import com.yandex.passport.internal.report.reporters.o1;
import defpackage.b1b;
import defpackage.ern;
import defpackage.hn5;
import defpackage.in5;
import defpackage.l1p;
import defpackage.ot0;
import defpackage.r1w;
import defpackage.ub7;
import defpackage.wn5;
import defpackage.wyf;
import defpackage.x97;
import defpackage.ybf;
import defpackage.z7o;
import defpackage.zsd;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class StandaloneSlothComposeActivity extends hn5 {
    public static final /* synthetic */ int c = 0;
    public w a;
    public final ybf b = new ybf(ern.a(z.class), new u(this, 0), new com.yandex.passport.internal.common.e(26, this), new u(this, 1));

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object p = com.yandex.plus.pay.ui.core.b.p(this, "SlothProperties", new com.yandex.passport.internal.ui.challenge.vpn.c(1, d0.c, c0.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/ui/sloth/StandaloneSlothProperties;", 0, 5));
        Throwable a = z7o.a(p);
        if (a != null) {
            com.yandex.passport.internal.ui.a.q(this, a);
            return;
        }
        d0 d0Var = (d0) p;
        com.yandex.passport.common.ui.a aVar = d0Var.a;
        b1b.a(this, com.yandex.plus.pay.ui.core.b.C(aVar), com.yandex.plus.pay.ui.core.b.C(aVar));
        w build = com.yandex.passport.internal.di.a.a().createStandaloneSlothComposeComponentBuilder().progressProperties(new com.yandex.passport.common.ui.progress.g(new com.yandex.passport.common.ui.progress.a(), com.yandex.passport.common.ui.progress.k.a, com.yandex.passport.common.ui.progress.e.a, true)).activity(this).params(d0Var.b).build();
        build.getClass();
        this.a = build;
        ybf ybfVar = this.b;
        z zVar = (z) ybfVar.getValue();
        Continuation continuation = null;
        x97.y(ot0.F(zVar), null, null, new r1w(zVar, continuation, 28), 3);
        in5.a(this, new wn5(new com.yandex.passport.internal.ui.bouncer.p(9, aVar, this), 1904645019, true));
        w wVar = this.a;
        if (wVar == null) {
            Intrinsics.j("component");
            throw null;
        }
        o1 webAmReporter = wVar.getWebAmReporter();
        zsd.r0(wyf.F(getLifecycle()), new ub7(12, ((z) ybfVar.getValue()).l, new l1p(this, webAmReporter, continuation, 18)));
        zsd.r0(wyf.F(getLifecycle()), new ub7(12, ((z) ybfVar.getValue()).m, new t(this, webAmReporter, null)));
    }
}
