package com.yandex.passport.internal.properties;

import android.os.Bundle;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class t {
    public static u a(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
        u uVar = (u) bundle.getParcelable("passport-logout-properties");
        if (uVar != null) {
            return uVar;
        }
        xq0.q(com.appsflyer.internal.k.m("Bundle has no ", u.class));
        return null;
    }
}
