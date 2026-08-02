package com.google.android.gms.internal.mlkit_vision_barcode;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzoe implements ObjectEncoder {
    public static final zzoe zza = new zzoe();
    public static final FieldDescriptor zzb = new FieldDescriptor("appName", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("sessionId", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("startZoomLevel", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("endZoomLevel", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("durationMs", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("predictedArea", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(6))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzut zzutVar = (zzut) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzutVar.zza);
        objectEncoderContext.add(zzc, zzutVar.zzb);
        objectEncoderContext.add(zzd, zzutVar.zzc);
        objectEncoderContext.add(zze, zzutVar.zzd);
        objectEncoderContext.add(zzf, zzutVar.zze);
        objectEncoderContext.add(zzg, zzutVar.zzf);
    }
}
