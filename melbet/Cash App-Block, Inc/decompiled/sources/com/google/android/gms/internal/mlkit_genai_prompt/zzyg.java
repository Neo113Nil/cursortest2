package com.google.android.gms.internal.mlkit_genai_prompt;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzyg implements ObjectEncoder {
    public static final zzyg zza = new zzyg();
    public static final FieldDescriptor zzb = new FieldDescriptor("options", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("request", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("sapiInferenceCommonEvent", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(3))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzafv zzafvVar = (zzafv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzafvVar.zza);
        objectEncoderContext.add(zzc, zzafvVar.zzb);
        objectEncoderContext.add(zzd, zzafvVar.zzc);
    }
}
