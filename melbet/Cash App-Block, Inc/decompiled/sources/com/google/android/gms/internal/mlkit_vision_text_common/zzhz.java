package com.google.android.gms.internal.mlkit_vision_text_common;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzhz implements ObjectEncoder {
    public static final zzhz zza = new zzhz();
    public static final FieldDescriptor zzb = new FieldDescriptor("imageFormat", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("originalImageSize", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("compressedImageSize", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("isOdmlImage", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(4))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzod zzodVar = (zzod) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzodVar.zza);
        objectEncoderContext.add(zzc, zzodVar.zzb);
        objectEncoderContext.add(zzd, (Object) null);
        objectEncoderContext.add(zze, (Object) null);
    }
}
