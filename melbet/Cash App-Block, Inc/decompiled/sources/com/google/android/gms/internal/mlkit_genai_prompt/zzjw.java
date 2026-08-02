package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjc;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzjw extends zzjs {
    public static final zzkr zza$1 = new zzkr(zzjw.class, 0);
    public zzju zza;
    public zzir zzb;

    public final void zzB() {
        int zza = zzjs.zza.zza(this);
        if (!(zza >= 0)) {
            a$$ExternalSyntheticBUOutline0.m$1("Less than 0 remaining futures");
            return;
        }
        if (zza == 0) {
            this.seenExceptionsField = null;
            zzju zzjuVar = this.zza;
            if (zzjuVar != null) {
                try {
                    zzjuVar.zza$1.execute(zzjuVar);
                } catch (RejectedExecutionException e) {
                    zzjuVar.zzb.zzm(e);
                }
            }
            this.zzb = null;
        }
    }

    public final void zzC(Throwable th) {
        th.getClass();
        if (!zzm(th)) {
            Set set = this.seenExceptionsField;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.valueField instanceof zzjc.zza)) {
                    Throwable zzg = zzg();
                    Objects.requireNonNull(zzg);
                    while (zzg != null && newSetFromMap.add(zzg)) {
                        zzg = zzg.getCause();
                    }
                }
                zzjs.zza.zzb(this, newSetFromMap);
                Set set2 = this.seenExceptionsField;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            zza$1.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        if (th instanceof Error) {
            zza$1.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", "Input Future failed with Error", th);
        }
    }

    public final void zzE(ListenableFuture listenableFuture) {
        try {
            boolean z = false;
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                while (true) {
                    try {
                        try {
                            listenableFuture.get();
                            break;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (ExecutionException e) {
                        zzC(e.getCause());
                    } catch (Throwable th2) {
                        zzC(th2);
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        } finally {
            zzB();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc
    public final String zzc() {
        zzir zzirVar = this.zzb;
        return zzirVar != null ? "futures=".concat(zzirVar.toString()) : super.zzc();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc
    public final void zzd() {
        zzir zzirVar = this.zzb;
        this.zzb = null;
        this.zza = null;
        if ((this.valueField instanceof zzjc.zza) && (zzirVar != null)) {
            boolean zzo = zzo();
            zzij listIterator = zzirVar.listIterator(0);
            while (listIterator.hasNext()) {
                ((Future) listIterator.next()).cancel(zzo);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc
    public final void zzi() {
        zzju zzjuVar = this.zza;
        if (zzjuVar != null) {
            zzjuVar.zzh();
        }
    }
}
