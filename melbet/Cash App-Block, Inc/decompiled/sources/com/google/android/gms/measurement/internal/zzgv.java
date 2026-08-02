package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzgv {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final Bundle zze;

    public zzgv(long j, long j2, Bundle bundle, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zze = bundle;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzgv zza(zzbh zzbhVar) {
        String str = zzbhVar.zza;
        String str2 = zzbhVar.zzc;
        return new zzgv(zzbhVar.zzd, zzbhVar.zze, zzbhVar.zzb.zzf(), str, str2);
    }

    public final String toString() {
        String obj = this.zze.toString();
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
        Boxes$$ExternalSyntheticOutline1.m(sb, "origin=", str, ",name=", str2);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, ",params=", obj);
    }

    public final zzbh zzb() {
        zzbf zzbfVar = new zzbf(new Bundle(this.zze));
        return new zzbh(this.zza, zzbfVar, this.zzb, this.zzc, this.zzd);
    }
}
