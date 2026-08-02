package io.appmetrica.analytics.impl;

import defpackage.i3y;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class Hf implements Executor {
    public final i3y a = kotlin.a.a(Gf.a);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((Pa) this.a.getValue()).b.post(runnable);
    }
}
