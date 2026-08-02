package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzbnt implements zzbnu {
    final /* synthetic */ zzceu zza;

    zzbnt(zzbnv zzbnvVar, zzceu zzceuVar) {
        this.zza = zzceuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zza(String str) {
        this.zza.zzd(new zzbrm(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
