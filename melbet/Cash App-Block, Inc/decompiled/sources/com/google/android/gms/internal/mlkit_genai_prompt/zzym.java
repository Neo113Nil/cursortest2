package com.google.android.gms.internal.mlkit_genai_prompt;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzym implements ObjectEncoder {
    public static final zzym zza = new zzym();
    public static final FieldDescriptor zzb = new FieldDescriptor("featureVersion", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("errorCode", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("isColdCall", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("inputSize", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("outputSize", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("latencyMs", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(6))));
    public static final FieldDescriptor zzh = new FieldDescriptor("firstTokenLatencyMs", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(7))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzagi zzagiVar = (zzagi) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzagiVar.zza);
        objectEncoderContext.add(zzc, zzagiVar.zzb);
        objectEncoderContext.add(zzd, zzagiVar.zzc);
        objectEncoderContext.add(zze, zzagiVar.zzd);
        objectEncoderContext.add(zzf, zzagiVar.zze);
        objectEncoderContext.add(zzg, zzagiVar.zzf);
        objectEncoderContext.add(zzh, zzagiVar.zzg);
    }
}
