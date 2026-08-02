package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzgi implements Map.Entry, Comparable {
    public final /* synthetic */ zzgh zza;
    public final Comparable zzb;
    public Object zzc;

    public zzgi(zzgh zzghVar, Comparable comparable, Object obj) {
        this.zza = zzghVar;
        this.zzb = comparable;
        this.zzc = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzgi) obj).zzb);
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
        this.zza.zzo();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(String.valueOf(this.zzb), "=", String.valueOf(this.zzc));
    }
}
