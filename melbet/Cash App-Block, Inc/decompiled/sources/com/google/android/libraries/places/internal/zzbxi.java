package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbxi implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzbxe zza;

    public /* synthetic */ zzbxi(zzbxe zzbxeVar, int i) {
        this.$r8$classId = i;
        this.zza = zzbxeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.zza.zzd$1.zzr();
                break;
            case 1:
                this.zza.zzg();
                break;
            case 2:
                this.zza.zzd$1.zzu();
                break;
            default:
                this.zza.zzd$1.zzk();
                break;
        }
    }
}
