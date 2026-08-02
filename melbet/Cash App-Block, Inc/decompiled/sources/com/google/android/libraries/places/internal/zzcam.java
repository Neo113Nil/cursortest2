package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Throwables;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcam implements Runnable {
    public static final Logger zza = Logger.getLogger(zzcam.class.getName());
    public final Runnable zzb;

    public zzcam(Runnable runnable) {
        Trace.checkNotNull(runnable, "task");
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.zzb;
        try {
            runnable.run();
        } catch (Throwable th) {
            zza.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(String.valueOf(runnable)), th);
            Object obj = Throwables.jla;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            a$$ExternalSyntheticBUOutline0.m$1(th);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf.length() + 22), "LogExceptionRunnable(", valueOf, ")");
    }
}
