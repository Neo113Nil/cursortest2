package com.google.android.libraries.places.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzbkt extends LinkedHashMap {
    public static final zzbkt zzb;
    public boolean zza = true;

    static {
        zzbkt zzbktVar = new zzbkt();
        zzb = zzbktVar;
        zzbktVar.zza = false;
    }

    public static int zzf(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof zzbjv)) {
                return obj.hashCode();
            }
            OptionalProvider$$ExternalSyntheticLambda0.m();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int zzc = zzbkc.zzc(length, 0, length, bArr);
        if (zzc == 0) {
            return 1;
        }
        return zzc;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzg();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzg();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzbkt zzc() {
        if (isEmpty()) {
            return new zzbkt();
        }
        zzbkt zzbktVar = new zzbkt(this);
        zzbktVar.zza = true;
        return zzbktVar;
    }

    public final boolean zze() {
        return this.zza;
    }

    public final void zzg() {
        if (this.zza) {
            return;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m();
    }
}
