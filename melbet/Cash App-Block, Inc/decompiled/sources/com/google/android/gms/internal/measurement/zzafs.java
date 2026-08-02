package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzafs implements Map.Entry, Comparable {
    public final /* synthetic */ zzafr zza;
    public final Comparable zzb;
    public Object zzc;

    public zzafs(zzafr zzafrVar, Comparable comparable, Object obj) {
        this.zza = zzafrVar;
        this.zzb = comparable;
        this.zzc = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzafs) obj).zzb);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.zzb;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.zzc;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzb;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzc;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zza.zzn();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
