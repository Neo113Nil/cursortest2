package com.google.android.gms.internal.mlkit_vision_face;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzip implements ObjectEncoder {
    public static final zzip zza = new zzip();
    public static final FieldDescriptor zzb = new FieldDescriptor("appId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("appVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("firebaseProjectId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("mlSdkVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("tfliteSchemaVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("gcmSenderId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(6))));
    public static final FieldDescriptor zzh = new FieldDescriptor("apiKey", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(7))));
    public static final FieldDescriptor zzi = new FieldDescriptor("languages", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(8))));
    public static final FieldDescriptor zzj = new FieldDescriptor("mlSdkInstanceId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(9))));
    public static final FieldDescriptor zzk = new FieldDescriptor("isClearcutClient", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(10))));
    public static final FieldDescriptor zzl = new FieldDescriptor("isStandaloneMlkit", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(11))));
    public static final FieldDescriptor zzm = new FieldDescriptor("isJsonLogging", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(12))));
    public static final FieldDescriptor zzn = new FieldDescriptor("buildLevel", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(13))));
    public static final FieldDescriptor zzo = new FieldDescriptor("optionalModuleVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(14))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzmv zzmvVar = (zzmv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzmvVar.zza);
        objectEncoderContext.add(zzc, zzmvVar.zzb);
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzmvVar.zzc);
        objectEncoderContext.add(zzf, zzmvVar.zzd);
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzmvVar.zze);
        objectEncoderContext.add(zzj, zzmvVar.zzf);
        objectEncoderContext.add(zzk, zzmvVar.zzg);
        objectEncoderContext.add(zzl, zzmvVar.zzh);
        objectEncoderContext.add(zzm, zzmvVar.zzi);
        objectEncoderContext.add(zzn, zzmvVar.zzj);
        objectEncoderContext.add(zzo, zzmvVar.zzk);
    }
}
