package com.google.android.gms.internal.wearable;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzdr implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzdt zzdtVar = (zzdt) this.zza.getValue();
        if (zzdtVar == null) {
            return null;
        }
        return zzdtVar.zza();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzel)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        Map.Entry entry = this.zza;
        zzel zzelVar = ((zzdt) entry.getValue()).zza;
        entry.setValue(new zzdt((zzel) obj));
        return zzelVar;
    }

    public final zzdt zza() {
        return (zzdt) this.zza.getValue();
    }
}
