package com.google.android.gms.internal.measurement;

import com.fillr.featuretoggle.UnleashContext;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class zzaz implements Comparator {
    public final /* synthetic */ zzai zza;
    public final /* synthetic */ UnleashContext zzb;

    public zzaz(zzai zzaiVar, UnleashContext unleashContext) {
        this.zza = zzaiVar;
        this.zzb = unleashContext;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzao zzaoVar = (zzao) obj;
        zzao zzaoVar2 = (zzao) obj2;
        if (zzaoVar instanceof zzat) {
            return !(zzaoVar2 instanceof zzat) ? 1 : 0;
        }
        if (zzaoVar2 instanceof zzat) {
            return -1;
        }
        zzai zzaiVar = this.zza;
        return zzaiVar == null ? zzaoVar.zzc().compareTo(zzaoVar2.zzc()) : (int) zzh.zzi(zzaiVar.zza(this.zzb, Arrays.asList(zzaoVar, zzaoVar2)).zzd().doubleValue());
    }
}
