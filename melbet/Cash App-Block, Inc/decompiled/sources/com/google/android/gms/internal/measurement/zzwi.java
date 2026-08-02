package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.DirectExecutor;
import java.io.Closeable;

/* loaded from: classes4.dex */
public final class zzwi implements Runnable, Closeable {
    public zzws zza;
    public final boolean zzb = zzlf.zza(Thread.currentThread());
    public boolean zzc;
    public boolean zzd;
    public final boolean zze;

    public zzwi(zzws zzwsVar, boolean z) {
        this.zze = false;
        this.zza = zzwsVar;
        this.zze = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzws zzwsVar = this.zza;
        try {
            this.zza = null;
            boolean z = this.zzd;
            if (!z) {
                if (this.zzc) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.zzc = true;
                if (this.zzb && !z) {
                    zzlf.zza(Thread.currentThread());
                }
            }
            if (zzwsVar != null) {
                ((zzvn) zzwsVar).close();
            }
            if (this.zze) {
                zzvy.zzc(zzvy.zzd(), zzwg.zza);
            }
        } catch (Throwable th) {
            if (zzwsVar != null) {
                try {
                    ((zzvn) zzwsVar).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.zzc || !(z = this.zzd)) {
            zzlf.zzb().post(zzpz.zza$1);
            return;
        }
        this.zzc = true;
        if (!this.zzb || z) {
            return;
        }
        zzlf.zza(Thread.currentThread());
    }

    public final void zza(AbstractFuture abstractFuture) {
        if (this.zzc) {
            a$$ExternalSyntheticBUOutline0.m$1("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (this.zzd) {
            a$$ExternalSyntheticBUOutline0.m$1("Signal is already attached to future");
        } else {
            this.zzd = true;
            abstractFuture.addListener(this, DirectExecutor.INSTANCE);
        }
    }
}
