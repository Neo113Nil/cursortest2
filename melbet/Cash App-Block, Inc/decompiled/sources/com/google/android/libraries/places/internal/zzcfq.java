package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;

/* loaded from: classes4.dex */
public final class zzcfq extends zzbtf {
    public final zzbvd zzb;
    public final zzbtf zzb$1;

    public zzcfq(zzbtf zzbtfVar, zzbvd zzbvdVar) {
        this.zzb$1 = zzbtfVar;
        this.zzb = zzbvdVar;
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zzb$1, "delegate");
        return stringHelper.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbtf
    public final String zza() {
        return this.zzb$1.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbtf
    public final void zzb(zzbtb zzbtbVar) {
        this.zzb$1.zzb(new zzcfp(this, zzbtbVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbtf
    public final void zzc() {
        this.zzb$1.zzc();
        zzbvd zzbvdVar = this.zzb;
        zzbuf zzbufVar = zzbvdVar.zzb;
        zzbufVar.zzc();
        zzbufVar.zzb(new zzmu(zzbvdVar, 4));
        zzbufVar.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbtf
    public final void zzd() {
        this.zzb$1.zzd();
    }
}
