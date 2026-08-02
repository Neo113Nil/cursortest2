package com.google.android.gms.internal.mlkit_vision_common;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzgu implements ObjectEncoder {
    public static final zzgu zza = new zzgu();
    public static final FieldDescriptor zzb = new FieldDescriptor("appId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("appVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("firebaseProjectId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("mlSdkVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("tfliteSchemaVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("gcmSenderId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(6))));
    public static final FieldDescriptor zzh = new FieldDescriptor("apiKey", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(7))));
    public static final FieldDescriptor zzi = new FieldDescriptor("languages", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(8))));
    public static final FieldDescriptor zzj = new FieldDescriptor("mlSdkInstanceId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(9))));
    public static final FieldDescriptor zzk = new FieldDescriptor("isClearcutClient", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(10))));
    public static final FieldDescriptor zzl = new FieldDescriptor("isStandaloneMlkit", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(11))));
    public static final FieldDescriptor zzm = new FieldDescriptor("isJsonLogging", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(12))));
    public static final FieldDescriptor zzn = new FieldDescriptor("buildLevel", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(13))));
    public static final FieldDescriptor zzo = new FieldDescriptor("optionalModuleVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(14))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzla zzlaVar = (zzla) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzlaVar.zza);
        objectEncoderContext.add(zzc, zzlaVar.zzb);
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzlaVar.zzc);
        objectEncoderContext.add(zzf, zzlaVar.zzd);
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzlaVar.zze);
        objectEncoderContext.add(zzj, zzlaVar.zzf);
        objectEncoderContext.add(zzk, zzlaVar.zzg);
        objectEncoderContext.add(zzl, zzlaVar.zzh);
        objectEncoderContext.add(zzm, zzlaVar.zzi);
        objectEncoderContext.add(zzn, zzlaVar.zzj);
        objectEncoderContext.add(zzo, zzlaVar.zzk);
    }
}
