package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.zzae;

/* loaded from: classes.dex */
public final class zzhc {
    public final /* synthetic */ zzhh zza;
    public final String zzb;
    public final boolean zzc;
    public boolean zzd;
    public boolean zze;

    public zzhc(zzhh zzhhVar, String str, boolean z) {
        this.zza = zzhhVar;
        zzae.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z;
    }

    public final boolean zza() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zzd().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(boolean z) {
        SharedPreferences.Editor edit = this.zza.zzd().edit();
        edit.putBoolean(this.zzb, z);
        edit.apply();
        this.zze = z;
    }
}
