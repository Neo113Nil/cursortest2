package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.zn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ExecutorC0920zn implements Executor {
    public final /* synthetic */ Handler a;

    public ExecutorC0920zn(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
