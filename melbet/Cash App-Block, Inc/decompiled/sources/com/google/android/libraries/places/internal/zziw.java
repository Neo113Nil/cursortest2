package com.google.android.libraries.places.internal;

import android.os.SystemClock;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.auth.zzd;
import com.google.common.util.concurrent.ImmediateFuture;
import com.squareup.workflow1.internal.SubtreeManager;

/* loaded from: classes4.dex */
public final /* synthetic */ class zziw implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SubtreeManager zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzns zzc;
    public final /* synthetic */ ImmediateFuture zzd;

    public /* synthetic */ zziw(SubtreeManager subtreeManager, long j, zzns zznsVar, ImmediateFuture immediateFuture, int i) {
        this.$r8$classId = i;
        this.zza = subtreeManager;
        this.zzb = j;
        this.zzc = zznsVar;
        this.zzd = immediateFuture;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i = this.$r8$classId;
        ImmediateFuture immediateFuture = this.zzd;
        SubtreeManager subtreeManager = this.zza;
        subtreeManager.getClass();
        switch (i) {
            case 0:
                if (!task.isCanceled()) {
                    zzex zzexVar = (zzex) subtreeManager.workflowSession;
                    zbc zbcVar = (zbc) subtreeManager.emitActionToParent;
                    ((zzfa) zzexVar).getClass();
                    zbcVar.zzl(task, this.zzb, SystemClock.elapsedRealtime(), 3, this.zzc, (zzd) immediateFuture.value);
                    break;
                }
                break;
            default:
                if (!task.isCanceled()) {
                    zzex zzexVar2 = (zzex) subtreeManager.workflowSession;
                    zbc zbcVar2 = (zbc) subtreeManager.emitActionToParent;
                    ((zzfa) zzexVar2).getClass();
                    zbcVar2.zzn(task, this.zzb, SystemClock.elapsedRealtime(), 3, this.zzc, (zzd) immediateFuture.value);
                    break;
                }
                break;
        }
        return task;
    }
}
