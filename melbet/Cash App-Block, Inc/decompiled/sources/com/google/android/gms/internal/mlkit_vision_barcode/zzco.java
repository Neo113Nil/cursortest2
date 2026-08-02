package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.internal.mlkit_vision_face.zzaq;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class zzco extends zzaq implements Serializable {
    public final Object zza;
    public final Object zzb;

    public zzco(Object obj, Object obj2) {
        super(false, 1);
        this.zza = obj;
        this.zzb = obj2;
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
