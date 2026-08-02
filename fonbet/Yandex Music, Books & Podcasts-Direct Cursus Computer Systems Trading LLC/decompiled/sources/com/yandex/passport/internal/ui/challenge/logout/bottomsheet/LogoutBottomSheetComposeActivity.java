package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.os.Bundle;
import defpackage.b1b;
import defpackage.hn5;
import defpackage.in5;
import defpackage.mqr;
import defpackage.vh;
import defpackage.vlv;
import defpackage.wn5;
import defpackage.z7o;
import defpackage.zh;

/* loaded from: classes4.dex */
public final class LogoutBottomSheetComposeActivity extends hn5 {
    public static final /* synthetic */ int f = 0;
    public boolean a = true;
    public final zh b = registerForActivityResult(new vh(22), new n(this, 3));
    public final zh c = registerForActivityResult(new vh(23), new n(this, 1));
    public final zh d = registerForActivityResult(new vh(21), new n(this, 2));
    public final zh e = registerForActivityResult(new vh(18), new n(this, 0));

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object p = com.yandex.plus.pay.ui.core.b.p(this, "PassportLogoutProperties", new vlv(1, com.yandex.passport.internal.properties.u.g, com.yandex.passport.internal.properties.t.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/properties/PassportLogoutPropertiesImpl;", 0, 29));
        Throwable a = z7o.a(p);
        if (a != null) {
            com.yandex.passport.internal.ui.a.q(this, a);
            return;
        }
        com.yandex.passport.internal.properties.u uVar = (com.yandex.passport.internal.properties.u) p;
        com.yandex.passport.internal.ui.challenge.logout.t H = com.yandex.passport.internal.ui.a.H(uVar);
        com.yandex.passport.common.ui.a aVar = H.b;
        b1b.a(this, com.yandex.plus.pay.ui.core.b.C(aVar), com.yandex.plus.pay.ui.core.b.C(aVar));
        in5.a(this, new wn5(new mqr(H, this, com.yandex.passport.internal.di.a.a().createLogoutBottomSheetComposeComponentBuilder().setProperties(H).build(), uVar, 16), -626131502, true));
    }
}
