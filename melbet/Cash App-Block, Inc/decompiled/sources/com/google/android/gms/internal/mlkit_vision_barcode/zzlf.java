package com.google.android.gms.internal.mlkit_vision_barcode;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzlf implements ObjectEncoder {
    public static final zzlf zza = new zzlf();
    public static final FieldDescriptor zzb = new FieldDescriptor("inferenceCommonLogEvent", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("options", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("detectedBarcodeFormats", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("detectedBarcodeValueTypes", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("imageInfo", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(5))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzrr zzrrVar = (zzrr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzrrVar.zza);
        objectEncoderContext.add(zzc, zzrrVar.zzb);
        objectEncoderContext.add(zzd, zzrrVar.zzc);
        objectEncoderContext.add(zze, zzrrVar.zzd);
        objectEncoderContext.add(zzf, zzrrVar.zze);
    }
}
