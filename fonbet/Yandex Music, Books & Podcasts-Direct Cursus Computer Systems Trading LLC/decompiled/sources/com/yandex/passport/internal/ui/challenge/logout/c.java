package com.yandex.passport.internal.ui.challenge.logout;

import android.os.Bundle;
import androidx.core.app.n0;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class c extends n0 {
    public final com.yandex.passport.internal.properties.v b;

    public c(LogoutActivity logoutActivity, Bundle bundle) {
        super(logoutActivity);
        com.yandex.passport.internal.properties.u uVar = (com.yandex.passport.internal.properties.u) com.appsflyer.internal.k.h(bundle, com.yandex.passport.internal.util.p.class, "passport-logout-properties");
        if (uVar != null) {
            this.b = uVar.e;
        } else {
            xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.u.class));
            throw null;
        }
    }
}
