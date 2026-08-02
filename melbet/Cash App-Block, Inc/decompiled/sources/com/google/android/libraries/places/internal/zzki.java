package com.google.android.libraries.places.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public final class zzki implements zzboh {
    public final /* synthetic */ int $r8$classId;
    public final zzbog zza;
    public final zzbok zzb;

    public zzki(zznm zznmVar, zzbog zzbogVar) {
        this.$r8$classId = 2;
        this.zzb = zznmVar;
        this.zza = zzbogVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcli
    public final Object zzb() {
        int i = this.$r8$classId;
        zzbog zzbogVar = this.zza;
        zzbok zzbokVar = this.zzb;
        switch (i) {
            case 0:
                return new zzkh();
            case 1:
                return new zzkj();
            default:
                Context applicationContext = ((Context) ((zznm) zzbokVar).zza.zza).getApplicationContext();
                zzkf.zza(applicationContext);
                return new zzjt(applicationContext, (zzbsd) zzbogVar.zzb());
        }
    }

    public /* synthetic */ zzki(zzbog zzbogVar, zzbog zzbogVar2, int i) {
        this.$r8$classId = i;
        this.zza = zzbogVar;
        this.zzb = zzbogVar2;
    }
}
