package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzac extends zzbjl {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzac(int i, zzbjr zzbjrVar) {
        super(zzbjrVar);
        this.$r8$classId = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbjl
    public zzbjr zzC() {
        switch (this.$r8$classId) {
            case 1:
                boolean zzbv = ((zzbjo) this.zza).zzbv();
                zzbjr zzbjrVar = this.zza;
                if (!zzbv) {
                    return (zzbjo) zzbjrVar;
                }
                ((zzbjo) zzbjrVar).zzb.zzb();
                return (zzbjo) super.zzC();
            default:
                return super.zzC();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbjl
    public zzbhz zzF() {
        switch (this.$r8$classId) {
            case 1:
                boolean zzbv = ((zzbjo) this.zza).zzbv();
                zzbjr zzbjrVar = this.zza;
                if (!zzbv) {
                    return (zzbjo) zzbjrVar;
                }
                ((zzbjo) zzbjrVar).zzb.zzb();
                return (zzbjo) super.zzC();
            default:
                return super.zzF();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbjl
    public void zzz() {
        switch (this.$r8$classId) {
            case 1:
                super.zzz();
                zzbjr zzbjrVar = this.zza;
                if (((zzbjo) zzbjrVar).zzb != zzbjh.zzd) {
                    zzbjo zzbjoVar = (zzbjo) zzbjrVar;
                    zzbjoVar.zzb = zzbjoVar.zzb.clone();
                    break;
                }
                break;
            default:
                super.zzz();
                break;
        }
    }
}
