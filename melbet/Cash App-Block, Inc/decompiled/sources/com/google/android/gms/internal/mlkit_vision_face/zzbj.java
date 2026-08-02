package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class zzbj extends zzaq implements Serializable {
    public final Object zza;
    public final zzao zzb;

    public zzbj(Object obj, zzao zzaoVar) {
        super(false, 0);
        this.zza = obj;
        this.zzb = zzaoVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
