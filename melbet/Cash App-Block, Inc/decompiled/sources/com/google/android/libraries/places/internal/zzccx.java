package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzccx implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzcdj zza;

    public /* synthetic */ zzccx(zzcdj zzcdjVar, int i) {
        this.$r8$classId = i;
        this.zza = zzcdjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        zzcdj zzcdjVar = this.zza;
        switch (i) {
            case 0:
                zzcdjVar.zzs = null;
                zzcdjVar.zzl.zzb = 0;
                zzcdjVar.zzd();
                break;
            case 1:
                zzcdjVar.zzo = null;
                if (zzcdjVar.zzl.zzb()) {
                    zzcdjVar.zzd();
                    break;
                }
                break;
            default:
                zzcdjVar.zzd();
                break;
        }
    }
}
