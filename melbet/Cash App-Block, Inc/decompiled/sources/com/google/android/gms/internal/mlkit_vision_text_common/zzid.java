package com.google.android.gms.internal.mlkit_vision_text_common;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzid implements ObjectEncoder {
    public static final zzid zza = new zzid();
    public static final FieldDescriptor zzb = new FieldDescriptor("durationMs", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("errorCode", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("isColdCall", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("autoManageModelOnBackground", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("autoManageModelOnLowMemory", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("isNnApiEnabled", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(6))));
    public static final FieldDescriptor zzh = new FieldDescriptor("eventsCount", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(7))));
    public static final FieldDescriptor zzi = new FieldDescriptor("otherErrors", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(8))));
    public static final FieldDescriptor zzj = new FieldDescriptor("remoteConfigValueForAcceleration", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(9))));
    public static final FieldDescriptor zzk = new FieldDescriptor("isAccelerated", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(10))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzoj zzojVar = (zzoj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzojVar.zza);
        objectEncoderContext.add(zzc, zzojVar.zzb);
        objectEncoderContext.add(zzd, zzojVar.zzc);
        objectEncoderContext.add(zze, zzojVar.zzd);
        objectEncoderContext.add(zzf, zzojVar.zze);
        objectEncoderContext.add(zzg, (Object) null);
        objectEncoderContext.add(zzh, (Object) null);
        objectEncoderContext.add(zzi, (Object) null);
        objectEncoderContext.add(zzj, (Object) null);
        objectEncoderContext.add(zzk, (Object) null);
    }
}
