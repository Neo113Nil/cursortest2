package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.knotapi.knot.utilities.BreadcrumbHelper;

/* loaded from: classes4.dex */
public final class zzbym extends zzccu {
    public boolean zzb;
    public final zzbtx zzc;
    public final zzbvs zzd;
    public final zzbph[] zze;

    public zzbym(zzbtx zzbtxVar, zzbvs zzbvsVar, zzbph[] zzbphVarArr) {
        Trace.checkArgument("error must not be OK", !zzbtxVar.zzj());
        this.zzc = zzbtxVar;
        this.zzd = zzbvsVar;
        this.zze = zzbphVarArr;
    }

    @Override // com.google.android.libraries.places.internal.zzccu, com.google.android.libraries.places.internal.zzbvr
    public final void zzf(zzbvt zzbvtVar) {
        Trace.checkState("already started", !this.zzb);
        this.zzb = true;
        int i = 0;
        while (true) {
            zzbph[] zzbphVarArr = this.zze;
            if (i >= zzbphVarArr.length) {
                zzbvtVar.zzc(this.zzc, this.zzd, new zzbsn());
                return;
            } else {
                zzbph zzbphVar = zzbphVarArr[i];
                i++;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccu, com.google.android.libraries.places.internal.zzbvr
    public final void zzn(zzbzm zzbzmVar) {
        zzbzmVar.zzb(this.zzc, BreadcrumbHelper.Category.ERROR);
        zzbzmVar.zzb(this.zzd, "progress");
    }
}
