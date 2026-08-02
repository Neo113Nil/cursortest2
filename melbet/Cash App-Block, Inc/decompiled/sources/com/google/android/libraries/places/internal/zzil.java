package com.google.android.libraries.places.internal;

import android.os.SystemClock;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.auth.zzd;
import com.google.android.libraries.places.api.net.zzt;
import com.google.android.libraries.places.api.net.zzv;
import com.google.common.util.concurrent.ImmediateFuture;
import com.squareup.workflow1.internal.SubtreeManager;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzil implements Continuation {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SubtreeManager zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ ImmediateFuture zzd;

    public /* synthetic */ zzil(SubtreeManager subtreeManager, long j, ImmediateFuture immediateFuture) {
        this.zza = subtreeManager;
        this.zzb = j;
        this.zzd = immediateFuture;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i = this.$r8$classId;
        ImmediateFuture immediateFuture = this.zzd;
        zzns zznsVar = zzns.zzc;
        long j = this.zzb;
        SubtreeManager subtreeManager = this.zza;
        subtreeManager.getClass();
        switch (i) {
            case 0:
                if (!task.isCanceled()) {
                    zzex zzexVar = (zzex) subtreeManager.workflowSession;
                    zbc zbcVar = (zbc) subtreeManager.emitActionToParent;
                    ((zzfa) zzexVar).getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    zzd zzdVar = (zzd) immediateFuture.value;
                    zbcVar.getClass();
                    zzaqq zza = zzaqv.zza();
                    zza.zzf(15);
                    zza.zzg(zbc.zzp(task));
                    zza.zza((int) (elapsedRealtime - j));
                    zbcVar.zzt((zzaqv) zza.zzD(), 3, zznsVar, zzdVar);
                    break;
                }
                break;
            default:
                if (!task.isCanceled()) {
                    zzex zzexVar2 = (zzex) subtreeManager.workflowSession;
                    zbc zbcVar2 = (zbc) subtreeManager.emitActionToParent;
                    ((zzfa) zzexVar2).getClass();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    zzd zzdVar2 = (zzd) immediateFuture.value;
                    zbcVar2.getClass();
                    int size = task.isSuccessful() ? ((zzv) task.getResult()).zza.size() : 0;
                    zzawt zza2 = zzawu.zza();
                    zza2.zzy();
                    ((zzawu) zza2.zza).zzc(0);
                    zza2.zzy();
                    ((zzawu) zza2.zza).zzd(size);
                    zza2.zzy();
                    ((zzawu) zza2.zza).zze(0);
                    if (task.isSuccessful()) {
                        zzv zzvVar = (zzv) task.getResult();
                        boolean z = zzvVar.zzd != null;
                        zza2.zzy();
                        ((zzawu) zza2.zza).zzf(z);
                        int i2 = zzvVar.zze;
                        zza2.zzy();
                        ((zzawu) zza2.zza).zzg$1(i2);
                    }
                    zzaqq zza3 = zzaqv.zza();
                    zza3.zzf(10);
                    zzawu zzawuVar = (zzawu) zza2.zzD();
                    zza3.zzy();
                    ((zzaqv) zza3.zza).zzg(zzawuVar);
                    zza3.zzg(zbc.zzp(task));
                    zza3.zza((int) (elapsedRealtime2 - j));
                    zbcVar2.zzt((zzaqv) zza3.zzD(), 3, zznsVar, zzdVar2);
                    break;
                }
                break;
        }
        return task;
    }

    public /* synthetic */ zzil(SubtreeManager subtreeManager, zzt zztVar, long j, ImmediateFuture immediateFuture) {
        this.zza = subtreeManager;
        this.zzb = j;
        this.zzd = immediateFuture;
    }
}
