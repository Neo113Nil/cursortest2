package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.zzae;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhe {
    public final /* synthetic */ zzhh zza;
    public final String zzb;
    public final long zzc;
    public boolean zzd;
    public long zze;

    public zzhe(zzhh zzhhVar, String str, long j) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        zzae.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j;
    }

    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zzd().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long j) {
        SharedPreferences.Editor edit = this.zza.zzd().edit();
        edit.putLong(this.zzb, j);
        edit.apply();
        this.zze = j;
    }
}
