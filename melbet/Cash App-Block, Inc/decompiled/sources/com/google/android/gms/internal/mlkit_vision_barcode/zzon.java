package com.google.android.gms.internal.mlkit_vision_barcode;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzon implements ObjectEncoder {
    public static final zzon zza = new zzon();
    public static final FieldDescriptor zzb = new FieldDescriptor("appId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("appVersion", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("firebaseProjectId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("mlSdkVersion", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("tfliteSchemaVersion", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("gcmSenderId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(6))));
    public static final FieldDescriptor zzh = new FieldDescriptor("apiKey", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(7))));
    public static final FieldDescriptor zzi = new FieldDescriptor("languages", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(8))));
    public static final FieldDescriptor zzj = new FieldDescriptor("mlSdkInstanceId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(9))));
    public static final FieldDescriptor zzk = new FieldDescriptor("isClearcutClient", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(10))));
    public static final FieldDescriptor zzl = new FieldDescriptor("isStandaloneMlkit", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(11))));
    public static final FieldDescriptor zzm = new FieldDescriptor("isJsonLogging", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(12))));
    public static final FieldDescriptor zzn = new FieldDescriptor("buildLevel", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(13))));
    public static final FieldDescriptor zzo = new FieldDescriptor("optionalModuleVersion", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(14))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzvd zzvdVar = (zzvd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzvdVar.zza);
        objectEncoderContext.add(zzc, zzvdVar.zzb);
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzvdVar.zzc);
        objectEncoderContext.add(zzf, zzvdVar.zzd);
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, zzvdVar.zze);
        objectEncoderContext.add(zzj, zzvdVar.zzf);
        objectEncoderContext.add(zzk, zzvdVar.zzg);
        objectEncoderContext.add(zzl, zzvdVar.zzh);
        objectEncoderContext.add(zzm, zzvdVar.zzi);
        objectEncoderContext.add(zzn, zzvdVar.zzj);
        objectEncoderContext.add(zzo, zzvdVar.zzk);
    }
}
