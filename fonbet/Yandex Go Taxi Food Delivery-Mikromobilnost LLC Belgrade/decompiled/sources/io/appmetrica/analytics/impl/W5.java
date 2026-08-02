package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes9.dex */
public final class W5 {
    public final Context a;
    public final K5 b;
    public final Rn c = Jb.k().B();

    public W5(Context context, K5 k5) {
        this.a = context;
        this.b = k5;
    }

    public final Ih a() {
        return new Ih(this.c.b(this.a, this.b));
    }
}
