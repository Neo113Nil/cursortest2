package com.google.android.gms.internal.measurement;

import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.AbstractFuture;

/* loaded from: classes4.dex */
public final class zzkz extends AbstractFuture {
    public Task zza;

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        this.zza = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        Task task = this.zza;
        return task == null ? "" : task.toString();
    }
}
