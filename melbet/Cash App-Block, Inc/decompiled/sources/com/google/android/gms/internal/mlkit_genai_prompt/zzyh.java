package com.google.android.gms.internal.mlkit_genai_prompt;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzyh implements ObjectEncoder {
    public static final zzyh zza = new zzyh();
    public static final FieldDescriptor zzb = new FieldDescriptor("temperature", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("seed", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("topK", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("candidateCount", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("maxOutputTokens", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("contentInfo", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(6))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzafy zzafyVar = (zzafy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzafyVar.zza);
        objectEncoderContext.add(zzc, zzafyVar.zzb);
        objectEncoderContext.add(zzd, zzafyVar.zzc);
        objectEncoderContext.add(zze, zzafyVar.zzd);
        objectEncoderContext.add(zzf, zzafyVar.zze);
        objectEncoderContext.add(zzg, zzafyVar.zzf);
    }
}
