package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.internal.mlkit_vision_barcode.zzdz;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes4.dex */
public final class zzew extends zzdz implements RunnableFuture, zzet {
    public volatile zzev zzc;

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzev zzevVar = this.zzc;
        if (zzevVar != null) {
            zzevVar.run();
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz
    public final String zzf() {
        zzev zzevVar = this.zzc;
        return zzevVar != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("task=[", zzevVar.toString(), "]") : super.zzf();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz
    public final void zzm() {
        zzev zzevVar;
        Object obj = this.value;
        if ((obj instanceof zzdz.zzb) && ((zzdz.zzb) obj).zzc && (zzevVar = this.zzc) != null) {
            zzeq zzeqVar = zzev.zzb$1;
            zzeq zzeqVar2 = zzev.zza$1;
            Runnable runnable = (Runnable) zzevVar.get();
            if (runnable instanceof Thread) {
                zzeo zzeoVar = new zzeo(zzevVar);
                zzeoVar.setExclusiveOwnerThread(Thread.currentThread());
                if (zzevVar.compareAndSet(runnable, zzeoVar)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) zzevVar.getAndSet(zzeqVar2)) == zzeqVar) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) zzevVar.getAndSet(zzeqVar2)) == zzeqVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.zzc = null;
    }
}
