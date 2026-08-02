package com.google.android.gms.internal.fido;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zzcd implements Map, Serializable {
    public static final Map.Entry[] zza = new Map.Entry[0];
    public transient zzcf zzb;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((zzcj) this).zze.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((zzcj) this).entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzh.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((zzcj) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        zzcj zzcjVar = (zzcj) this;
        int size = zzcjVar.size();
        if (size < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(size, "size cannot be negative but was: "));
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : zzcjVar.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzcf entrySet() {
        zzcf zzcfVar = this.zzb;
        if (zzcfVar == null) {
            zzcj zzcjVar = (zzcj) this;
            zzcfVar = zzcjVar.isEmpty() ? zzcu.zza : new zzci(zzcjVar);
            this.zzb = zzcfVar;
        }
        return zzcfVar;
    }
}
