package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzfgj extends zzbzw {
    private final zzffz zza;
    private final zzffp zzb;
    private final zzfgz zzc;
    private zzdso zzd;
    private boolean zze = false;

    public zzfgj(zzffz zzffzVar, zzffp zzffpVar, zzfgz zzfgzVar) {
        this.zza = zzffzVar;
        this.zzb = zzffpVar;
        this.zzc = zzfgzVar;
    }

    private final synchronized boolean zzy() {
        zzdso zzdsoVar = this.zzd;
        if (zzdsoVar != null) {
            if (!zzdsoVar.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdso zzdsoVar = this.zzd;
        return zzdsoVar != null ? zzdsoVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        zzdso zzdsoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgN)).booleanValue() && (zzdsoVar = this.zzd) != null) {
            return zzdsoVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized String zzd() throws RemoteException {
        zzdso zzdsoVar = this.zzd;
        if (zzdsoVar == null || zzdsoVar.zzl() == null) {
            return null;
        }
        return zzdsoVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzfr)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzbzx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzg(zzcab zzcabVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzcabVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzfp);
        if (str2 != null && str != null) {
            try {
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
        }
        zzffr zzffrVar = new zzffr(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzcabVar.zza, zzcabVar.zzb, zzffrVar, new zzfgh(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzl(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfgi(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzo(zzcaa zzcaaVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzcaaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final boolean zzt() {
        zzdso zzdsoVar = this.zzd;
        return zzdsoVar != null && zzdsoVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zzu(zzbzv zzbzvVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbzvVar);
    }
}
