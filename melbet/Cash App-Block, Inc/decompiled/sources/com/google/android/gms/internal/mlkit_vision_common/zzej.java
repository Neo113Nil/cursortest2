package com.google.android.gms.internal.mlkit_vision_common;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzej implements ObjectEncoder {
    public static final zzej zza = new zzej();
    public static final FieldDescriptor zzb = new FieldDescriptor("durationMs", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("imageSource", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("imageFormat", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("imageByteSize", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("imageWidth", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("imageHeight", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(6))));
    public static final FieldDescriptor zzh = new FieldDescriptor("rotationDegrees", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzai.class, new zzad(7))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zziq zziqVar = (zziq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zziqVar.zza);
        objectEncoderContext.add(zzc, zziqVar.zzb);
        objectEncoderContext.add(zzd, zziqVar.zzc);
        objectEncoderContext.add(zze, zziqVar.zzd);
        objectEncoderContext.add(zzf, zziqVar.zze);
        objectEncoderContext.add(zzg, zziqVar.zzf);
        objectEncoderContext.add(zzh, zziqVar.zzg);
    }
}
