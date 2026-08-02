package com.google.android.gms.internal.mlkit_vision_face;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzgh implements ObjectEncoder {
    public static final zzgh zza = new zzgh();
    public static final FieldDescriptor zzb = new FieldDescriptor("imageFormat", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("originalImageSize", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("compressedImageSize", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("isOdmlImage", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcu.class, new zzcp(4))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzkh zzkhVar = (zzkh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzkhVar.zza);
        objectEncoderContext.add(zzc, zzkhVar.zzb);
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, (Object) null);
    }
}
