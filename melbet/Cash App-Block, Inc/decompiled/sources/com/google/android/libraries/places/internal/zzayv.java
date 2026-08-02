package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.common.util.concurrent.SequentialExecutor;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzayv implements Executor {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;
    public Object zzb;

    public zzayv(zzfv zzfvVar) {
        this.$r8$classId = 2;
        Trace.checkNotNull(zzfvVar, "executorPool");
        this.zza = zzfvVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        switch (this.$r8$classId) {
            case 0:
                ((SequentialExecutor) this.zzb).execute(new com.google.android.gms.tasks.zzc((zzaze) this.zza, runnable, false, 9));
                return;
            case 1:
                ((Executor) this.zza).execute(runnable);
                return;
            default:
                synchronized (this) {
                    try {
                        if (((Executor) this.zzb) == null) {
                            Executor executor2 = (Executor) ((zzfv) this.zza).zza();
                            Trace.checkNotNull("%s.getObject()", executor2, (Executor) this.zzb);
                            this.zzb = executor2;
                        }
                        executor = (Executor) this.zzb;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                executor.execute(runnable);
                return;
        }
    }

    public /* synthetic */ zzayv(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.zza = obj;
        this.zzb = obj2;
    }
}
