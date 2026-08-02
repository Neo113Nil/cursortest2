package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzkm implements ListenableFuture {
    public static final zzkm zza = new zzkm(null);
    public static final zzkr zzb = new zzkr(zzkm.class, 0);
    public final Object zzc;

    public zzkm(Object obj) {
        this.zzc = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        if (executor == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", CameraSelector$$ExternalSyntheticOutline0.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(super.toString(), "[status=SUCCESS, result=[", String.valueOf(this.zzc), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }
}
