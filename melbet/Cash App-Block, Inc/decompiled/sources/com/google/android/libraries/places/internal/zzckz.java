package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzckz {
    public final /* synthetic */ zzclb zza;
    public final /* synthetic */ zzclb zzb;
    public final Object zzb$1;
    public final zzbrv zzc;
    public zzbrt zze = new zzbrl(zzbro.zza);
    public zzbpq zzd = zzbpq.zza;

    public zzckz(zzclb zzclbVar, Object obj, zzcdp zzcdpVar) {
        this.zzb = zzclbVar;
        this.zza = zzclbVar;
        this.zzb$1 = obj;
        this.zzc = zzcdpVar.zza(new zzcky(this));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb$1);
        String valueOf2 = String.valueOf(this.zzd);
        String valueOf3 = String.valueOf(this.zze.getClass());
        String valueOf4 = String.valueOf(this.zzc);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 20 + length2 + 15 + valueOf3.length() + 6 + valueOf4.length());
        Boxes$$ExternalSyntheticOutline1.m(sb, "Address = ", valueOf, ", state = ", valueOf2);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, ", picker type: ", valueOf3, ", lb: ", valueOf4);
    }
}
