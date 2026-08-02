package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.LinkedHashSet;

/* loaded from: classes9.dex */
public final class R2 {
    public final LinkedHashSet a = new LinkedHashSet();
    public boolean b = true;

    public final synchronized void a(P2 p2, long j, boolean z) {
        IHandlerExecutor a = V4.l().c.a();
        Q2 q2 = new Q2(p2, a, j);
        this.a.add(q2);
        if (z && !this.b && q2.d) {
            q2.d = false;
            a.remove(q2.e);
            p2.onResume();
        }
    }
}
