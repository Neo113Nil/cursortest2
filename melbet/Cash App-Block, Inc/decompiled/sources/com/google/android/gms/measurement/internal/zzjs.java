package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzdb;

/* loaded from: classes.dex */
public final class zzjs {
    public final Context zza;
    public final Boolean zzb;
    public final long zzc;
    public final zzdb zzd;
    public final boolean zze;
    public final Long zzf;
    public final Long zzg;
    public final String zzh;

    public zzjs(Context context, zzdb zzdbVar, Long l, Long l2) {
        this.zze = true;
        zzae.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        zzae.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzf = l;
        this.zzg = l2;
        if (zzdbVar != null) {
            this.zzd = zzdbVar;
            this.zze = zzdbVar.zzc;
            this.zzc = zzdbVar.zzb;
            this.zzh = zzdbVar.zze;
            Bundle bundle = zzdbVar.zzd;
            if (bundle != null) {
                this.zzb = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
