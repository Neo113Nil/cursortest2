package com.google.android.gms.internal.mlkit_vision_text_common;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzht implements ObjectEncoder {
    public static final zzht zza = new zzht();
    public static final FieldDescriptor zzb = new FieldDescriptor("maxMs", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(1))));
    public static final FieldDescriptor zzc = new FieldDescriptor("minMs", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(2))));
    public static final FieldDescriptor zzd = new FieldDescriptor("avgMs", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(3))));
    public static final FieldDescriptor zze = new FieldDescriptor("firstQuartileMs", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(4))));
    public static final FieldDescriptor zzf = new FieldDescriptor("medianMs", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(5))));
    public static final FieldDescriptor zzg = new FieldDescriptor("thirdQuartileMs", FillrEnv$EnumUnboxingLocalUtility.m(zzel$EnumUnboxingLocalUtility.m(zzcx.class, new zzcs(6))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        zznw zznwVar = (zznw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zznwVar.zza);
        objectEncoderContext.add(zzc, zznwVar.zzb);
        objectEncoderContext.add(zzd, zznwVar.zzc);
        objectEncoderContext.add(zze, zznwVar.zzd);
        objectEncoderContext.add(zzf, zznwVar.zze);
        objectEncoderContext.add(zzg, zznwVar.zzf);
    }
}
