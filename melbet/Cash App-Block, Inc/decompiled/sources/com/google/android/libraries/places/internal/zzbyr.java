package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;

/* loaded from: classes4.dex */
public abstract class zzbyr implements zzbvr {
    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(zze(), "delegate");
        return stringHelper.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zza(zzbpy zzbpyVar) {
        zze().zza(zzbpyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzb(int i) {
        zze().zzb(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzc(int i) {
        zze().zzc(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzd(zzbqb zzbqbVar) {
        zze().zzd(zzbqbVar);
    }

    public abstract zzbvr zze();

    @Override // com.google.android.libraries.places.internal.zzbvr
    public void zzf(zzbvt zzbvtVar) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzk() {
        zze().zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzl(zzbtx zzbtxVar) {
        zze().zzl(zzbtxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final boolean zzm() {
        return zze().zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzn(zzbzm zzbzmVar) {
        zze().zzn(zzbzmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzr() {
        zze().zzr();
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzs(int i) {
        zze().zzs(i);
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzt(zzcjz zzcjzVar) {
        zze().zzt(zzcjzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzu() {
        zze().zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzv(zzbpl zzbplVar) {
        zze().zzv(zzbplVar);
    }
}
