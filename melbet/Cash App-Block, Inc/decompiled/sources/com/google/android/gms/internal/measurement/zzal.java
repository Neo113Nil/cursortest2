package com.google.android.gms.internal.measurement;

import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class zzal implements zzao, zzak {
    public final HashMap zza = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzal) {
            return this.zza.equals(((zzal) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.zza;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public zzao zzcG(String str, UnleashContext unleashContext, ArrayList arrayList) {
        return "toString".equals(str) ? new zzas(toString()) : zzak.zzu(this, new zzas(str), unleashContext, arrayList);
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
        return new zzaj(this.zza.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(String str) {
        return this.zza.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao zzk(String str) {
        HashMap hashMap = this.zza;
        return hashMap.containsKey(str) ? (zzao) hashMap.get(str) : zzao.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zzm(String str, zzao zzaoVar) {
        HashMap hashMap = this.zza;
        if (zzaoVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, zzaoVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        zzal zzalVar = new zzal();
        for (Map.Entry entry : this.zza.entrySet()) {
            boolean z = entry.getValue() instanceof zzak;
            HashMap hashMap = zzalVar.zza;
            if (z) {
                hashMap.put((String) entry.getKey(), (zzao) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((zzao) entry.getValue()).zzt());
            }
        }
        return zzalVar;
    }
}
