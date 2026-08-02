package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzaym implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzaze zza;
    public final /* synthetic */ com.google.android.gms.maps.zzah zzb;

    public /* synthetic */ zzaym(zzaze zzazeVar, com.google.android.gms.maps.zzah zzahVar, int i) {
        this.$r8$classId = i;
        this.zza = zzazeVar;
        this.zzb = zzahVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.$r8$classId;
        com.google.android.gms.maps.zzah zzahVar = this.zzb;
        zzaze zzazeVar = this.zza;
        switch (i) {
            case 0:
                zzazeVar.zzu(zzahVar);
                break;
            default:
                zzazeVar.zzu(zzahVar);
                break;
        }
    }
}
