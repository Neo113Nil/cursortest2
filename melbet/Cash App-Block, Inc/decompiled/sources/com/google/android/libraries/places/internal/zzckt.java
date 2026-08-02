package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public abstract class zzckt extends zzbrm {
    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(zzf(), "delegate");
        return stringHelper.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbrm
    public final zzbrs zza(com.google.android.gms.maps.zzah zzahVar) {
        return zzf().zza(zzahVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbrm
    public void zzb(zzbpq zzbpqVar, zzbrt zzbrtVar) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbrm
    public final void zzc() {
        zzf().zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzbrm
    public final zzbuf zzd() {
        return zzf().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbrm
    public final ScheduledExecutorService zze() {
        return zzf().zze();
    }

    public abstract zzbrm zzf();
}
