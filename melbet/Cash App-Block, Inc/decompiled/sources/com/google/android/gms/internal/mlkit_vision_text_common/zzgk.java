package com.google.android.gms.internal.mlkit_vision_text_common;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzgk implements ObjectEncoder {
    public static final zzgk zza = new zzgk();
    public static final FieldDescriptor zzb = new FieldDescriptor("errorCode", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("hasResult", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("isColdCall", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("imageInfo", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("recognizerOptions", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(5))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zzes zzesVar = (zzes) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzesVar.zza);
        objectEncoderContext.add(zzc, (Object) null);
        objectEncoderContext.add(zzd, zzesVar.zzc);
        objectEncoderContext.add(zze, (Object) null);
        objectEncoderContext.add(zzf, zzesVar.zze);
    }
}
