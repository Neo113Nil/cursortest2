package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzdb implements EncoderConfig {
    public static final zzcy zzb = new zzcy(1);
    public Object zzc;
    public Object zzd;
    public Object zze;

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public /* bridge */ /* synthetic */ EncoderConfig registerEncoder(Class cls, ObjectEncoder objectEncoder) {
        ((HashMap) this.zzc).put(cls, objectEncoder);
        ((HashMap) this.zzd).remove(cls);
        return this;
    }
}
