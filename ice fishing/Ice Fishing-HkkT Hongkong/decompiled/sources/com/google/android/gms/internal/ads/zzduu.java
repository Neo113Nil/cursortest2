package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzduu implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzduu(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgey zzgeyVar = zzcep.zza;
        zzhhl.zzb(zzgeyVar);
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzeO)).booleanValue() ? Collections.singleton(new zzdim(((zzdvn) this.zzb).zzb(), zzgeyVar)) : Collections.emptySet();
        zzhhl.zzb(singleton);
        return singleton;
    }
}
