package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.0.0 */
/* loaded from: classes2.dex */
final class zzbls implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    final /* synthetic */ zzblt zzc;

    zzbls(zzblt zzbltVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
        this.zzc = zzbltVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (!this.zza.zzb(this.zzb)) {
            zzcec.zzj("Could not bind.");
            return;
        }
        zzblt zzbltVar = this.zzc;
        AdManagerAdView adManagerAdView = this.zza;
        onAdManagerAdViewLoadedListener = zzbltVar.zza;
        onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(adManagerAdView);
    }
}
