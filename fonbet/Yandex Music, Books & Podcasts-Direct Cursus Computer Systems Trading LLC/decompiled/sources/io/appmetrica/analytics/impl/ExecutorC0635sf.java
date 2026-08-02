package io.appmetrica.analytics.impl;

import defpackage.arf;
import defpackage.btf;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.sf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC0635sf implements Executor {
    public final arf a = btf.b(C0606rf.a);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((Ha) this.a.getValue()).b.post(runnable);
    }
}
