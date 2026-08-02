package com.google.android.gms.internal.mlkit_vision_text_common;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzmg implements ObjectEncoder {
    public static final zzmg zza = new zzmg();
    public static final FieldDescriptor zzb = new FieldDescriptor("appId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("appVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("firebaseProjectId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("mlSdkVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("tfliteSchemaVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("gcmSenderId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(6))));
    public static final FieldDescriptor zzh = new FieldDescriptor("apiKey", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(7))));
    public static final FieldDescriptor zzi = new FieldDescriptor("languages", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(8))));
    public static final FieldDescriptor zzj = new FieldDescriptor("mlSdkInstanceId", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(9))));
    public static final FieldDescriptor zzk = new FieldDescriptor("isClearcutClient", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(10))));
    public static final FieldDescriptor zzl = new FieldDescriptor("isStandaloneMlkit", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(11))));
    public static final FieldDescriptor zzm = new FieldDescriptor("isJsonLogging", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(12))));
    public static final FieldDescriptor zzn = new FieldDescriptor("buildLevel", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(13))));
    public static final FieldDescriptor zzo = new FieldDescriptor("optionalModuleVersion", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(14))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzst zzstVar = (zzst) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzstVar.zza);
        objectEncoderContext.add(zzc, zzstVar.zzb);
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzstVar.zzc);
        objectEncoderContext.add(zzf, zzstVar.zzd);
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzstVar.zze);
        objectEncoderContext.add(zzj, zzstVar.zzf);
        objectEncoderContext.add(zzk, zzstVar.zzg);
        objectEncoderContext.add(zzl, zzstVar.zzh);
        objectEncoderContext.add(zzm, zzstVar.zzi);
        objectEncoderContext.add(zzn, zzstVar.zzj);
        objectEncoderContext.add(zzo, zzstVar.zzk);
    }
}
