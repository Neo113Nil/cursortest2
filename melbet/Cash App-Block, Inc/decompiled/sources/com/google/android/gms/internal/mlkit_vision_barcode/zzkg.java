package com.google.android.gms.internal.mlkit_vision_barcode;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzkg implements ObjectEncoder {
    public static final zzkg zza = new zzkg();
    public static final FieldDescriptor zzb = new FieldDescriptor("imageFormat", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("originalImageSize", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("compressedImageSize", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("isOdmlImage", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(4))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzqk zzqkVar = (zzqk) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzqkVar.zza);
        objectEncoderContext.add(zzc, zzqkVar.zzb);
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, (Object) null);
    }
}
