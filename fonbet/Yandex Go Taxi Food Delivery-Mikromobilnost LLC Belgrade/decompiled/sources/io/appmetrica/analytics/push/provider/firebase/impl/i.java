package io.appmetrica.analytics.push.provider.firebase.impl;

import android.content.Context;
import defpackage.lcr;

/* loaded from: classes9.dex */
public final class i extends f {
    public i(Context context) {
        this(context, new h(context));
    }

    @Override // io.appmetrica.analytics.push.provider.firebase.impl.f
    public final com.google.firebase.a a(lcr lcrVar) {
        try {
            return com.google.firebase.a.h(lcrVar, this.a, "METRICA_PUSH");
        } catch (Throwable unused) {
            return com.google.firebase.a.e("METRICA_PUSH");
        }
    }

    public i(Context context, h hVar) {
        super(context, hVar);
    }
}
