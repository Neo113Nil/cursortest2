package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbxh implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int zza;
    public final /* synthetic */ zzbxe zzb;

    public /* synthetic */ zzbxh(zzbxe zzbxeVar, int i, int i2) {
        this.$r8$classId = i2;
        this.zza = i;
        this.zzb = zzbxeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.zzb.zzd$1.zzs(this.zza);
                break;
            case 1:
                this.zzb.zzd$1.zzc(this.zza);
                break;
            default:
                this.zzb.zzd$1.zzb(this.zza);
                break;
        }
    }
}
