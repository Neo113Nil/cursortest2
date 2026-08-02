package com.google.android.gms.internal.measurement;

import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzai implements zzao, zzak {
    public final String zzd;
    public final HashMap zze = new HashMap();

    public zzai(String str) {
        this.zzd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        String str = this.zzd;
        if (str != null) {
            return str.equals(zzaiVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzd;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public abstract zzao zza(UnleashContext unleashContext, List list);

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcG(String str, UnleashContext unleashContext, ArrayList arrayList) {
        return "toString".equals(str) ? new zzas(this.zzd) : zzak.zzu(this, new zzas(str), unleashContext, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaj(this.zze.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(String str) {
        return this.zze.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao zzk(String str) {
        HashMap hashMap = this.zze;
        return hashMap.containsKey(str) ? (zzao) hashMap.get(str) : zzao.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zzm(String str, zzao zzaoVar) {
        HashMap hashMap = this.zze;
        if (zzaoVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, zzaoVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public zzao zzt() {
        return this;
    }
}
