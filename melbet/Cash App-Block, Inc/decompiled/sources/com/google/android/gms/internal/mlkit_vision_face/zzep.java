package com.google.android.gms.internal.mlkit_vision_face;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzep implements ObjectEncoder {
    public static final zzep zza = new zzep();
    public static final FieldDescriptor zzb = new FieldDescriptor("errorCode", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("isColdCall", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("imageInfo", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("detectorOptions", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("contourDetectedFaces", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("nonContourDetectedFaces", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(6))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzdn zzdnVar = (zzdn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzdnVar.zza);
        objectEncoderContext.add(zzc, zzdnVar.zzb);
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, zzdnVar.zzd);
        objectEncoderContext.add(zzf, zzdnVar.zze);
        objectEncoderContext.add(zzg, zzdnVar.zzf);
    }
}
