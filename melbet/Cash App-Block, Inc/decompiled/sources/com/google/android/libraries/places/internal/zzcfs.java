package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcfs implements Executor {
    public static final Logger zza = Logger.getLogger(zzcfs.class.getName());
    public boolean zzb;
    public ArrayDeque zzc;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Trace.checkNotNull(runnable, "'task' must not be null.");
        if (this.zzb) {
            if (this.zzc == null) {
                this.zzc = new ArrayDeque(4);
            }
            this.zzc.add(runnable);
            return;
        }
        this.zzb = true;
        try {
            runnable.run();
            if (this.zzc != null) {
                zza();
            }
            this.zzb = false;
        } catch (Throwable th) {
            try {
                Logger logger = zza;
                Level level = Level.SEVERE;
                String valueOf = String.valueOf(runnable);
                StringBuilder sb = new StringBuilder(valueOf.length() + 35);
                sb.append("Exception while executing runnable ");
                sb.append(valueOf);
                logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", sb.toString(), th);
                if (this.zzc != null) {
                    zza();
                }
                this.zzb = false;
            } catch (Throwable th2) {
                if (this.zzc != null) {
                    zza();
                }
                this.zzb = false;
                throw th2;
            }
        }
    }

    public final void zza() {
        while (true) {
            Runnable runnable = (Runnable) this.zzc.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                zza.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th);
            }
        }
    }
}
