package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import com.google.common.util.concurrent.TrustedListenableFutureTask.TrustedFutureInterruptibleAsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class zzkv extends BroadcastReceiver {
    public final /* synthetic */ AtomicBoolean zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ SettableFuture zzc;
    public final /* synthetic */ zzj zzd;
    public final /* synthetic */ Executor zze;

    public zzkv(AtomicBoolean atomicBoolean, Context context, SettableFuture settableFuture, zzj zzjVar, Executor executor) {
        this.zza = atomicBoolean;
        this.zzb = context;
        this.zzc = settableFuture;
        this.zzd = zzjVar;
        this.zze = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.zza.compareAndSet(false, true)) {
            try {
                this.zzb.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            SettableFuture settableFuture = this.zzc;
            zzj zzjVar = this.zzd;
            Executor executor = this.zze;
            TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask();
            trustedListenableFutureTask.task = trustedListenableFutureTask.new TrustedFutureInterruptibleAsyncTask(zzjVar);
            executor.execute(trustedListenableFutureTask);
            settableFuture.setFuture(trustedListenableFutureTask);
        }
    }
}
