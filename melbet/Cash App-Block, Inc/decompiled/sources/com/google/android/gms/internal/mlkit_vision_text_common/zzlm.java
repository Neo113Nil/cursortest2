package com.google.android.gms.internal.mlkit_vision_text_common;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzlm implements ObjectEncoder {
    public static final zzlm zza = new zzlm();
    public static final FieldDescriptor zzb = new FieldDescriptor("errorCode", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(1))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(zzb, ((zzrw) obj).zza);
    }
}
