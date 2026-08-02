package com.google.android.gms.internal.mlkit_genai_prompt;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzzn implements ObjectEncoder {
    public static final zzzn zza = new zzzn();
    public static final FieldDescriptor zzb = new FieldDescriptor("appId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("appVersion", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("firebaseProjectId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("mlSdkVersion", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("tfliteSchemaVersion", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("gcmSenderId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(6))));
    public static final FieldDescriptor zzh = new FieldDescriptor("apiKey", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(7))));
    public static final FieldDescriptor zzi = new FieldDescriptor("languages", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(8))));
    public static final FieldDescriptor zzj = new FieldDescriptor("mlSdkInstanceId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(9))));
    public static final FieldDescriptor zzk = new FieldDescriptor("isClearcutClient", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(10))));
    public static final FieldDescriptor zzl = new FieldDescriptor("isStandaloneMlkit", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(11))));
    public static final FieldDescriptor zzm = new FieldDescriptor("isJsonLogging", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(12))));
    public static final FieldDescriptor zzn = new FieldDescriptor("buildLevel", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(13))));
    public static final FieldDescriptor zzo = new FieldDescriptor("optionalModuleVersion", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzlm.class, new zzlh(14))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzahn zzahnVar = (zzahn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzahnVar.zza);
        objectEncoderContext.add(zzc, zzahnVar.zzb);
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzahnVar.zzc);
        objectEncoderContext.add(zzf, zzahnVar.zzd);
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzahnVar.zze);
        objectEncoderContext.add(zzj, zzahnVar.zzf);
        objectEncoderContext.add(zzk, zzahnVar.zzg);
        objectEncoderContext.add(zzl, zzahnVar.zzh);
        objectEncoderContext.add(zzm, zzahnVar.zzi);
        objectEncoderContext.add(zzn, zzahnVar.zzj);
        objectEncoderContext.add(zzo, zzahnVar.zzk);
    }
}
