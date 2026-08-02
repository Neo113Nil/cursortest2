package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzmm extends zzaz {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zznl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzmm(zznl zznlVar, zzic zzicVar, int i) {
        super(zzicVar);
        this.$r8$classId = i;
        this.zza = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zza() {
        int i = this.$r8$classId;
        zznl zznlVar = this.zza;
        switch (i) {
            case 0:
                zznlVar.zzg();
                if (zznlVar.zzh()) {
                    zzgu zzguVar = ((zzic) zznlVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zza("Inactivity, disconnecting from the service");
                    zznlVar.zzM();
                    break;
                }
                break;
            default:
                zzgu zzguVar2 = ((zzic) zznlVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzg.zza("Tasks have been queued for a long time");
                break;
        }
    }
}
