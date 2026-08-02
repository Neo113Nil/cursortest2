package com.google.android.libraries.places.internal;

import com.fillr.browsersdk.Fillr;

/* loaded from: classes4.dex */
public final class zzaza extends zzboz {
    public final /* synthetic */ int $r8$classId = 0;
    public boolean zza = false;
    public Object zzb;
    public final Object zzc;

    public zzaza(zzaze zzazeVar, zzazr zzazrVar) {
        this.zzb = zzazeVar;
        this.zzc = zzazrVar;
    }

    private final void zza$com$google$android$libraries$places$internal$zzckn(zzbsn zzbsnVar) {
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zza(zzbsn zzbsnVar) {
        switch (this.$r8$classId) {
            case 0:
                ((zzaze) this.zzb).zzd.execute(new com.google.android.gms.tasks.zzc(this, zzbsnVar, false, 13));
                break;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zzb(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((zzaze) this.zzb).zzd.execute(new com.google.android.gms.tasks.zzc(this, obj, false, 12));
                return;
            default:
                if (this.zza) {
                    throw new zzbua(zzbtx.zzh.zze("More than one value received for unary call"));
                }
                this.zzb = obj;
                this.zza = true;
                return;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zzc(zzbtx zzbtxVar, zzbsn zzbsnVar) {
        switch (this.$r8$classId) {
            case 0:
                ((zzaze) this.zzb).zzd.execute(new Fillr.AnonymousClass2(20, this, zzbtxVar, zzbsnVar));
                break;
            default:
                zzckj zzckjVar = (zzckj) this.zzc;
                if (!zzbtxVar.zzj()) {
                    zzckjVar.setException(new zzbua(zzbtxVar));
                    break;
                } else {
                    if (!this.zza) {
                        zzckjVar.setException(new zzbua(zzbtx.zzh.zze("No value received for unary call")));
                    }
                    zzckjVar.set(this.zzb);
                    break;
                }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public void zzd() {
        switch (this.$r8$classId) {
            case 0:
                ((zzaze) this.zzb).zzd.execute(new zzmu(this, 2));
                break;
        }
    }

    public zzaza(zzckj zzckjVar) {
        this.zzc = zzckjVar;
    }
}
