package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzcxn implements zzgej {
    final /* synthetic */ zzcxp zza;

    zzcxn(zzcxp zzcxpVar) {
        this.zza = zzcxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th) {
        zzdgc zzdgcVar;
        zzdgcVar = this.zza.zzf;
        zzdgcVar.zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdgc zzdgcVar;
        zzdgcVar = this.zza.zzf;
        zzdgcVar.zzn(true);
    }
}
