package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.internal.mlkit_vision_face.zzaq;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class zzbg extends zzaq implements Serializable {
    public final Object zza;
    public final com.google.android.gms.internal.mlkit_vision_face.zzao zzb;

    public zzbg(Object obj, com.google.android.gms.internal.mlkit_vision_face.zzao zzaoVar) {
        super(false, 2);
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
