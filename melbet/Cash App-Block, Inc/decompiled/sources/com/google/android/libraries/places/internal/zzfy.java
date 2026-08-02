package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzfy implements zzboh {
    public final /* synthetic */ int $r8$classId;
    public final zzbog zza;

    public /* synthetic */ zzfy(zzbog zzbogVar, int i) {
        this.$r8$classId = i;
        this.zza = zzbogVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcli
    public final Object zzb() {
        int i = this.$r8$classId;
        zzbog zzbogVar = this.zza;
        switch (i) {
            case 0:
                return new zzfr((zzfp) zzbogVar.zzb());
            case 1:
                return new zzhq();
            default:
                return new zzkc();
        }
    }
}
