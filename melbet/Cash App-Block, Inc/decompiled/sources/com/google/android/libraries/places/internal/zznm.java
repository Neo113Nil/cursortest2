package com.google.android.libraries.places.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public final class zznm implements zzboh {
    public final /* synthetic */ int $r8$classId;
    public final zzfz zza;

    public /* synthetic */ zznm(zzfz zzfzVar, int i) {
        this.$r8$classId = i;
        this.zza = zzfzVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcli
    public final Object zzb() {
        int i = this.$r8$classId;
        zzfz zzfzVar = this.zza;
        switch (i) {
            case 0:
                Context applicationContext = ((Context) zzfzVar.zza).getApplicationContext();
                zzkf.zza(applicationContext);
                return applicationContext;
            default:
                return new zzfp((Context) zzfzVar.zza, zzfi.zzc());
        }
    }
}
