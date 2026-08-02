package com.google.android.gms.internal.mlkit_vision_text_common;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzln implements ObjectEncoder {
    public static final zzln zza = new zzln();
    public static final FieldDescriptor zzb = new FieldDescriptor("inferenceCommonLogEvent", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("imageInfo", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("recognizerOptions", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(3))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzrz zzrzVar = (zzrz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzrzVar.zza);
        objectEncoderContext.add(zzc, zzrzVar.zzb);
        objectEncoderContext.add(zzd, zzrzVar.zzc);
    }
}
