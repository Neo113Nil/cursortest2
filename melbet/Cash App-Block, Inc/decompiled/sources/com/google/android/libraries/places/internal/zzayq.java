package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzayq implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzaze zza;
    public final /* synthetic */ zzgc zzb;
    public final /* synthetic */ zzazb zzc;

    public /* synthetic */ zzayq(zzaze zzazeVar, zzgc zzgcVar, zzazb zzazbVar, int i) {
        this.$r8$classId = i;
        this.zza = zzazeVar;
        this.zzb = zzgcVar;
        this.zzc = zzazbVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.$r8$classId;
        zzazb zzazbVar = this.zzc;
        zzgc zzgcVar = this.zzb;
        zzaze zzazeVar = this.zza;
        switch (i) {
            case 0:
                zzazeVar.zzA(zzgcVar, zzazbVar);
                break;
            default:
                zzazeVar.zzA(zzgcVar, zzazbVar);
                break;
        }
    }
}
