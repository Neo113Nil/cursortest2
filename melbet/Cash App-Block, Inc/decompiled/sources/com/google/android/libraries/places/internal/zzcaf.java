package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.Fillr;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes4.dex */
public final class zzcaf implements zzccj {
    public Object zza;
    public boolean zzb;
    public Object zzc;

    public zzcaf(zzciq zzciqVar) {
        zzciqVar.getClass();
        this.zza = zzciqVar.zze;
        this.zzc = zzciqVar.zzf;
        this.zzb = zzciqVar.zzc;
    }

    public static final /* synthetic */ String zzf(zzbtq zzbtqVar) {
        int ordinal;
        if (zzbtqVar == null || (ordinal = zzbtqVar.ordinal()) == 0) {
            return "none";
        }
        if (ordinal == 1) {
            return "integrity_only";
        }
        if (ordinal == 2) {
            return "privacy_and_integrity";
        }
        a$$ExternalSyntheticBUOutline0.m$3("Unknown SecurityLevel: ".concat(zzbtqVar.toString()));
        return null;
    }

    public static final String zzg(zzbor zzborVar, zzboq zzboqVar) {
        String str = (String) zzborVar.zzb.get(zzboqVar);
        return str == null ? "" : str;
    }

    public void zza(ScheduledFuture scheduledFuture) {
        boolean z;
        synchronized (this.zza) {
            try {
                z = this.zzb;
                if (!z) {
                    this.zzc = scheduledFuture;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccj
    public void zzc(boolean z) {
        zzcah zzcahVar = (zzcah) this.zzc;
        zzbzz zzbzzVar = (zzbzz) this.zza;
        zzcahVar.getClass();
        zzbzv zzbzvVar = new zzbzv(zzcahVar, zzbzzVar, z);
        zzbuf zzbufVar = zzcahVar.zzl;
        zzbufVar.zzb(zzbzvVar);
        zzbufVar.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzccj
    public void zzd(zzbtx zzbtxVar, zzbxz zzbxzVar) {
        Object[] objArr = {((zzbzz) this.zza).zzc(), zzcah.zzO(zzbtxVar)};
        zzcah zzcahVar = (zzcah) this.zzc;
        zzcahVar.zzi.zzb("{0} SHUTDOWN with {1}", 2, objArr);
        this.zzb = true;
        Fillr.AnonymousClass2 anonymousClass2 = new Fillr.AnonymousClass2(this, zzbxzVar, zzbtxVar, false, 24);
        zzbuf zzbufVar = zzcahVar.zzl;
        zzbufVar.zzb(anonymousClass2);
        zzbufVar.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzccj
    public void zze() {
        Trace.checkState("transportShutdown() must be called before transportTerminated().", this.zzb);
        zzbzz zzbzzVar = (zzbzz) this.zza;
        Object[] objArr = {zzbzzVar.zzc()};
        zzcah zzcahVar = (zzcah) this.zzc;
        zzcahVar.zzi.zzb("{0} Terminated", 2, objArr);
        zzbzv zzbzvVar = new zzbzv(zzcahVar, zzbzzVar, false);
        zzbuf zzbufVar = zzcahVar.zzl;
        zzbufVar.zzb(zzbzvVar);
        zzbufVar.zza();
        Iterator it = zzcahVar.zzk.iterator();
        if (it.hasNext()) {
            zzbzzVar.zzf();
            throw null;
        }
        zzbufVar.zzb(new zzcac(this, 1));
        zzbufVar.zza();
    }

    public zzcaf(Object obj) {
        this.zza = obj;
    }
}
