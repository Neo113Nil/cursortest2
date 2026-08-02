package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes4.dex */
public final class zze extends zzeb implements zzfn {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zze(int i, zzeh zzehVar) {
        super(zzehVar);
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb
    public zzeh zzi() {
        switch (this.$r8$classId) {
            case 1:
                boolean zzY = ((zzed) this.zza).zzY();
                zzeh zzehVar = this.zza;
                if (!zzY) {
                    return (zzed) zzehVar;
                }
                ((zzed) zzehVar).zzb.zzg();
                return (zzed) super.zzi();
            default:
                return super.zzi();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb
    public zzcq zzk() {
        switch (this.$r8$classId) {
            case 1:
                boolean zzY = ((zzed) this.zza).zzY();
                zzeh zzehVar = this.zza;
                if (!zzY) {
                    return (zzed) zzehVar;
                }
                ((zzed) zzehVar).zzb.zzg();
                return (zzed) super.zzi();
            default:
                return super.zzk();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb
    public void zzn() {
        switch (this.$r8$classId) {
            case 1:
                super.zzn();
                zzeh zzehVar = this.zza;
                if (((zzed) zzehVar).zzb != zzdx.zzb) {
                    zzed zzedVar = (zzed) zzehVar;
                    zzedVar.zzb = zzedVar.zzb.clone();
                    break;
                }
                break;
            default:
                super.zzn();
                break;
        }
    }
}
