package com.yandex.passport.internal.ui.challenge.delete;

import android.os.Bundle;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class p0 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.properties.r b;
    public final com.yandex.passport.internal.properties.v c;

    public p0(DeleteForeverActivity deleteForeverActivity, Bundle bundle) {
        super(deleteForeverActivity);
        com.yandex.passport.internal.properties.r rVar = (com.yandex.passport.internal.properties.r) com.appsflyer.internal.k.h(bundle, com.yandex.passport.internal.util.p.class, "passport-delete-account-properties");
        if (rVar == null) {
            xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.r.class));
            throw null;
        }
        this.b = rVar;
        this.c = rVar.b;
    }
}
