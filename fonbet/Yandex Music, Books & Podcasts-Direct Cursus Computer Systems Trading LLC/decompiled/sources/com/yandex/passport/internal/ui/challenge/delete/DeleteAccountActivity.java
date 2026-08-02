package com.yandex.passport.internal.ui.challenge.delete;

import android.os.Bundle;
import defpackage.b1b;
import defpackage.hn5;
import defpackage.in5;
import defpackage.vlv;
import defpackage.wn5;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class DeleteAccountActivity extends hn5 {
    public static final /* synthetic */ int b = 0;
    public b a;

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object p = com.yandex.plus.pay.ui.core.b.p(this, "PassportDeleteAccountProperties", new vlv(1, com.yandex.passport.internal.properties.r.e, com.yandex.passport.internal.properties.q.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/properties/PassportDeleteAccountPropertiesImpl;", 0, 26));
        Throwable a = z7o.a(p);
        if (a != null) {
            com.yandex.passport.internal.ui.a.q(this, a);
            return;
        }
        com.yandex.passport.internal.properties.r rVar = (com.yandex.passport.internal.properties.r) p;
        rVar.getClass();
        com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L(rVar.a);
        com.yandex.passport.common.ui.progress.g C = com.yandex.plus.core.locale.b.C(rVar.b);
        com.yandex.passport.common.ui.a G = com.yandex.plus.pay.ui.core.b.G(rVar.c);
        d dVar = new d(L, C, G, rVar.d);
        b1b.a(this, com.yandex.plus.pay.ui.core.b.C(G), com.yandex.plus.pay.ui.core.b.C(G));
        b build = com.yandex.passport.internal.di.a.a().createDeleteAccountComponentBuilder().setActivity(this).setDeleteAccountProperties(dVar).build();
        build.getClass();
        this.a = build;
        in5.a(this, new wn5(new com.yandex.passport.internal.ui.bouncer.p(5, G, this), 1884757135, true));
    }
}
