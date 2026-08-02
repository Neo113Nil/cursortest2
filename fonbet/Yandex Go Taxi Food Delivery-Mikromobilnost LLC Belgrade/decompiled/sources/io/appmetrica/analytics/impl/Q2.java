package io.appmetrica.analytics.impl;

import defpackage.ssu;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes9.dex */
public final class Q2 {
    public final P2 a;
    public final ICommonExecutor b;
    public final long c;
    public boolean d = true;
    public final Runnable e = new ssu(26, this);

    public Q2(P2 p2, IHandlerExecutor iHandlerExecutor, long j) {
        this.a = p2;
        this.b = iHandlerExecutor;
        this.c = j;
    }

    public static final void a(Q2 q2) {
        q2.a.a();
    }
}
