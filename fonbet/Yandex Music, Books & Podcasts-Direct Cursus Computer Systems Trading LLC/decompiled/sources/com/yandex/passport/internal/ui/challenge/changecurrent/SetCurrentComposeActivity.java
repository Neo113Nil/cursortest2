package com.yandex.passport.internal.ui.challenge.changecurrent;

import android.os.Bundle;
import com.yandex.passport.api.z1;
import defpackage.b1b;
import defpackage.hn5;
import defpackage.in5;
import defpackage.vlv;
import defpackage.wn5;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class SetCurrentComposeActivity extends hn5 {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object p = com.yandex.plus.pay.ui.core.b.p(this, "SetCurrentAccountProperties", new vlv(1, com.yandex.passport.internal.properties.c0.d, com.yandex.passport.internal.properties.b0.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/properties/SetCurrentAccountPropertiesImpl;", 0, 25));
        Throwable a2 = z7o.a(p);
        if (a2 != null) {
            Exception exc = a2 instanceof Exception ? (Exception) a2 : null;
            if (exc == null) {
                exc = new RuntimeException(a2);
            }
            com.yandex.plus.core.locale.b.i(this, exc);
            return;
        }
        com.yandex.passport.internal.properties.c0 c0Var = (com.yandex.passport.internal.properties.c0) p;
        c0Var.getClass();
        z1 z1Var = c0Var.a;
        com.yandex.passport.common.core.f L = z1Var != null ? com.yandex.plus.pay.ui.core.b.L(z1Var) : null;
        com.yandex.passport.common.ui.progress.g C = com.yandex.plus.core.locale.b.C(c0Var.b);
        com.yandex.passport.common.ui.a G = com.yandex.plus.pay.ui.core.b.G(c0Var.c);
        i iVar = new i(L, C, G);
        b1b.a(this, com.yandex.plus.pay.ui.core.b.C(G), com.yandex.plus.pay.ui.core.b.C(G));
        super.onCreate(bundle);
        in5.a(this, new wn5(new k(iVar, this, 0), 2005074581, true));
    }
}
