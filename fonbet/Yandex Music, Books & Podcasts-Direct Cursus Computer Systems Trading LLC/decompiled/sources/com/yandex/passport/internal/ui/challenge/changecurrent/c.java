package com.yandex.passport.internal.ui.challenge.changecurrent;

import android.os.Bundle;
import androidx.core.app.n0;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class c extends n0 {
    public final com.yandex.passport.internal.properties.c0 b;
    public final com.yandex.passport.internal.properties.v c;

    public c(SetCurrentAccountActivity setCurrentAccountActivity, Bundle bundle) {
        super(setCurrentAccountActivity);
        com.yandex.passport.internal.properties.c0 c0Var = (com.yandex.passport.internal.properties.c0) com.appsflyer.internal.k.h(bundle, com.yandex.passport.internal.util.p.class, "passport-set-current-account-properties");
        if (c0Var == null) {
            xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.c0.class));
            throw null;
        }
        this.b = c0Var;
        this.c = c0Var.b;
    }
}
