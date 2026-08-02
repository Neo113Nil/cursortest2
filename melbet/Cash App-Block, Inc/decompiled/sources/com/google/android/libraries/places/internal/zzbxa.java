package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbxa implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzccj zza;

    public /* synthetic */ zzbxa(zzbxg zzbxgVar, zzccj zzccjVar, int i) {
        this.$r8$classId = i;
        this.zza = zzccjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.zza.zzc(true);
                break;
            case 1:
                this.zza.zzc(false);
                break;
            default:
                this.zza.zze();
                break;
        }
    }
}
