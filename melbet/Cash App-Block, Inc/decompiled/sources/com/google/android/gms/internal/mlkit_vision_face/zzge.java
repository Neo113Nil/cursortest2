package com.google.android.gms.internal.mlkit_vision_face;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzge implements ObjectEncoder {
    public static final zzge zza = new zzge();
    public static final FieldDescriptor zzb = new FieldDescriptor("landmarkMode", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("classificationMode", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("performanceMode", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("contourMode", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("isTrackingEnabled", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("minFaceSize", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(6))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzkd zzkdVar = (zzkd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzkdVar.zza);
        objectEncoderContext.add(zzc, zzkdVar.zzb);
        objectEncoderContext.add(zzd, zzkdVar.zzc);
        objectEncoderContext.add(zze, zzkdVar.zzd);
        objectEncoderContext.add(zzf, zzkdVar.zze);
        objectEncoderContext.add(zzg, zzkdVar.zzf);
    }
}
