package com.google.android.gms.internal.measurement;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzaa {
    public static final ImmutableSet zza = ImmutableSet.construct(3, "_syn", "_err", "_el");
    public String zzb;
    public final long zzc;
    public final HashMap zzd;

    public zzaa(String str, long j, HashMap hashMap) {
        this.zzb = str;
        this.zzc = j;
        HashMap hashMap2 = new HashMap();
        this.zzd = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object zzh(String str, Object obj, Object obj2) {
        if (zza.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.zzc == zzaaVar.zzc && this.zzb.equals(zzaaVar.zzb)) {
            return this.zzd.equals(zzaaVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        long j = this.zzc;
        return this.zzd.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        String obj = this.zzd.toString();
        int length = String.valueOf(str).length();
        long j = this.zzc;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + obj.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        Fragment$5$$ExternalSyntheticOutline0.m(j, ", params=", obj, sb);
        sb.append("}");
        return sb.toString();
    }

    public final long zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final HashMap zzf() {
        return this.zzd;
    }

    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.zzb, this.zzc, new HashMap(this.zzd));
    }
}
