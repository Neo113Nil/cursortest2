package com.google.android.gms.internal.mlkit_vision_face;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzgj implements ObjectEncoder {
    public static final zzgj zza = new zzgj();
    public static final FieldDescriptor zzb = new FieldDescriptor("durationMs", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("errorCode", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("isColdCall", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("autoManageModelOnBackground", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("autoManageModelOnLowMemory", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("isNnApiEnabled", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(6))));
    public static final FieldDescriptor zzh = new FieldDescriptor("eventsCount", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(7))));
    public static final FieldDescriptor zzi = new FieldDescriptor("otherErrors", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(8))));
    public static final FieldDescriptor zzj = new FieldDescriptor("remoteConfigValueForAcceleration", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(9))));
    public static final FieldDescriptor zzk = new FieldDescriptor("isAccelerated", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(10))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzkl zzklVar = (zzkl) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzklVar.zza);
        objectEncoderContext.add(zzc, zzklVar.zzb);
        objectEncoderContext.add(zzd, zzklVar.zzc);
        objectEncoderContext.add(zze, zzklVar.zzd);
        objectEncoderContext.add(zzf, zzklVar.zze);
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, (Object) null);
        objectEncoderContext.add(zzj, (Object) null);
        objectEncoderContext.add(zzk, (Object) null);
    }
}
