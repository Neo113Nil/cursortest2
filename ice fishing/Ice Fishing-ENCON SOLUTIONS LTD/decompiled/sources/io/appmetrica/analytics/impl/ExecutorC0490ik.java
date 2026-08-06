package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.ik, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0490ik implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f6196a;

    public ExecutorC0490ik(Handler handler) {
        this.f6196a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6196a.post(runnable);
    }
}
