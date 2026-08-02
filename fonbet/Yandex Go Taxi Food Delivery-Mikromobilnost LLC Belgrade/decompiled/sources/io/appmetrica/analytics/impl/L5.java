package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final class L5 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(Z4 z4) {
        this.a.add(z4);
    }

    public final void b(Z4 z4) {
        this.a.remove(z4);
    }

    public final List<Z4> a() {
        return this.a;
    }
}
