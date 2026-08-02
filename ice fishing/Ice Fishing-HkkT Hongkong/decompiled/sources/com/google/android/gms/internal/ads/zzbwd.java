package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.0.0 */
/* loaded from: classes2.dex */
final class zzbwd extends zzbkp {
    final /* synthetic */ zzbwg zza;

    /* synthetic */ zzbwd(zzbwg zzbwgVar, zzbwc zzbwcVar) {
        this.zza = zzbwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkq
    public final void zze(zzbkg zzbkgVar, String str) {
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomFormatAd zzf;
        zzbwg zzbwgVar = this.zza;
        onCustomClickListener = zzbwgVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbwgVar.zzb;
        zzf = zzbwgVar.zzf(zzbkgVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
