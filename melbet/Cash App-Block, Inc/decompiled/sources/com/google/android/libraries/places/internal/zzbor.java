package com.google.android.libraries.places.internal;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbor {
    public static final zzbor zza = new zzbor(new IdentityHashMap());
    public final IdentityHashMap zzb;

    public zzbor(IdentityHashMap identityHashMap) {
        this.zzb = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbor.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = ((zzbor) obj).zzb;
        IdentityHashMap identityHashMap2 = this.zzb;
        if (identityHashMap2.size() != identityHashMap.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey()) || !Objects.equals(entry.getValue(), identityHashMap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.zzb.entrySet()) {
            i += Objects.hash(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final String toString() {
        return this.zzb.toString();
    }
}
