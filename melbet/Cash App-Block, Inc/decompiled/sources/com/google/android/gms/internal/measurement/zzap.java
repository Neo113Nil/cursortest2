package com.google.android.gms.internal.measurement;

import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzap implements zzao {
    public final String zza;
    public final ArrayList zzb;

    public zzap(String str, ArrayList arrayList) {
        this.zza = str;
        ArrayList arrayList2 = new ArrayList();
        this.zzb = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        zzap zzapVar = (zzap) obj;
        String str = zzapVar.zza;
        String str2 = this.zza;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.zzb.equals(zzapVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return this.zzb.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcG(String str, UnleashContext unleashContext, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return this;
    }
}
