package com.yandex.passport.internal.ui.sloth.plusdevices;

import android.os.Bundle;
import defpackage.b1b;
import defpackage.hn5;
import defpackage.in5;
import defpackage.kws;
import defpackage.wn5;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class ManagingPlusDevicesActivity extends hn5 {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object p = com.yandex.plus.pay.ui.core.b.p(this, "PassportManagingPlusDevicesProperties", new com.yandex.passport.internal.ui.challenge.vpn.c(1, com.yandex.passport.internal.properties.o.f, com.yandex.passport.internal.properties.n.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/properties/ManagingPlusDevicesPropertiesImpl;", 0, 8));
        Throwable a2 = z7o.a(p);
        if (a2 != null) {
            com.yandex.passport.internal.ui.a.q(this, a2);
            return;
        }
        com.yandex.passport.internal.properties.o oVar = (com.yandex.passport.internal.properties.o) p;
        oVar.getClass();
        com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L(oVar.b);
        com.yandex.passport.common.ui.a G = com.yandex.plus.pay.ui.core.b.G(oVar.a);
        l lVar = new l(L, G, oVar.c, oVar.d, oVar.e);
        b1b.a(this, com.yandex.plus.pay.ui.core.b.C(G), com.yandex.plus.pay.ui.core.b.C(G));
        in5.a(this, new wn5(new kws(28, G, com.yandex.passport.internal.di.a.a().createManagingPlusDevicesComponentBuilder().setProperties(lVar).setProgressProperties(com.yandex.passport.common.ui.progress.g.e).setActivity(this).build(), this), 207206102, true));
    }
}
