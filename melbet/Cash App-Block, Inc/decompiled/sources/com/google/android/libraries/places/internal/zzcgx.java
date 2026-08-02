package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcgx extends zzbwi {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzchc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcgx(zzchc zzchcVar, int i) {
        super(zzchcVar, 1);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = zzchcVar;
                super(zzchcVar, 1);
                int i2 = zzclf.$r8$clinit;
                break;
            default:
                this.zza = zzchcVar;
                int i3 = zzclf.$r8$clinit;
                break;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwi
    public final void zza() {
        int i;
        switch (this.$r8$classId) {
            case 0:
                zzclo zzcloVar = new zzclo();
                int i2 = zzclf.$r8$clinit;
                zzchc zzchcVar = this.zza;
                synchronized (zzchcVar.zza) {
                    zzclo zzcloVar2 = zzchcVar.zzb;
                    zzcloVar.zzc(zzcloVar2, zzcloVar2.zzi());
                    zzchcVar.zze = false;
                    i = zzchcVar.zzl;
                }
                zzchc zzchcVar2 = this.zza;
                zzchcVar2.zzh.zzc(zzcloVar, zzcloVar.zzb);
                synchronized (zzchcVar2.zza) {
                    zzchcVar2.zzl -= i;
                }
                return;
            default:
                zzclo zzcloVar3 = new zzclo();
                int i3 = zzclf.$r8$clinit;
                zzchc zzchcVar3 = this.zza;
                synchronized (zzchcVar3.zza) {
                    zzclo zzcloVar4 = zzchcVar3.zzb;
                    zzcloVar3.zzc(zzcloVar4, zzcloVar4.zzb);
                    zzchcVar3.zzf = false;
                }
                zzchc zzchcVar4 = this.zza;
                zzchcVar4.zzh.zzc(zzcloVar3, zzcloVar3.zzb);
                zzchcVar4.zzh.flush();
                return;
        }
    }
}
