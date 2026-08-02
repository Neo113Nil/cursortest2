package com.google.android.gms.measurement.internal;

/* loaded from: classes4.dex */
public final class zzku implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzjl zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ zzlj zzd;

    public /* synthetic */ zzku(zzlj zzljVar, zzjl zzjlVar, long j, boolean z, int i) {
        this.$r8$classId = i;
        this.zza = zzjlVar;
        this.zzb = j;
        this.zzc = z;
        this.zzd = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        long j = this.zzb;
        boolean z = this.zzc;
        zzjl zzjlVar = this.zza;
        zzlj zzljVar = this.zzd;
        switch (i) {
            case 0:
                zzljVar.zzz(zzjlVar);
                zzljVar.zzaj(zzjlVar, j, z);
                break;
            default:
                zzljVar.zzz(zzjlVar);
                zzljVar.zzaj(zzjlVar, j, z);
                break;
        }
    }
}
