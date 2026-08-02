package com.google.android.gms.internal.mlkit_vision_text_common;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzlo implements ObjectEncoder {
    public static final zzlo zza = new zzlo();
    public static final FieldDescriptor zzb = new FieldDescriptor("languageOption", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(3))));
    public static final FieldDescriptor zzc = new FieldDescriptor("isUsingLegacyApi", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(4))));
    public static final FieldDescriptor zzd = new FieldDescriptor("sdkVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(5))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, ((zzsd) obj).zza);
        objectEncoderContext.add(zzc, (Object) null);
        objectEncoderContext.add(zzd, (Object) null);
    }
}
