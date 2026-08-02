package com.google.android.gms.internal.time;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzaz implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzbb zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ Object zzc;

    public /* synthetic */ zzaz(zzbb zzbbVar, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.zza = zzbbVar;
        this.zzb = obj;
        this.zzc = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.zza.zza(this.zzb, this.zzc);
                break;
            default:
                this.zza.zza(this.zzb, this.zzc);
                break;
        }
    }
}
