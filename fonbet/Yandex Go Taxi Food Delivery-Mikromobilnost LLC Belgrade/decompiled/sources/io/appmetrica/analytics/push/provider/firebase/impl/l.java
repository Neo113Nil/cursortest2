package io.appmetrica.analytics.push.provider.firebase.impl;

import android.content.Context;
import defpackage.lcr;

/* loaded from: classes9.dex */
public final class l extends f {
    public l(Context context) {
        this(context, new j(context));
    }

    @Override // io.appmetrica.analytics.push.provider.firebase.impl.f
    public final com.google.firebase.a a(lcr lcrVar) {
        try {
            return com.google.firebase.a.h(lcrVar, this.a, "[DEFAULT]");
        } catch (Throwable unused) {
            return com.google.firebase.a.d();
        }
    }

    public l(Context context, j jVar) {
        super(context, jVar);
    }
}
