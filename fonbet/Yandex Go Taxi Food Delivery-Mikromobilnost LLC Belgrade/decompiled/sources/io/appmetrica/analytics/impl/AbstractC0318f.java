package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0318f implements Z4 {
    public final Context a;
    public final C0482kj b;

    public AbstractC0318f(Context context, C0482kj c0482kj) {
        this.a = context.getApplicationContext();
        this.b = c0482kj;
        c0482kj.a(this);
        Jb.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.Z4
    public final void a() {
        this.b.b(this);
        Jb.I.m().a(this);
    }

    public final C0482kj b() {
        return this.b;
    }

    public abstract void b(K6 k6, C0468k5 c0468k5);

    public final Context c() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.Z4
    public final void a(K6 k6, C0468k5 c0468k5) {
        b(k6, c0468k5);
    }
}
