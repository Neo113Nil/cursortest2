package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzazc implements Executor {
    public volatile Executor zza;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }
}
