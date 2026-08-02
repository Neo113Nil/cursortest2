package com.google.android.gms.internal.mlkit_vision_barcode;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class zzlg implements ObjectEncoder {
    public static final zzlg zza = new zzlg();
    public static final FieldDescriptor zzb = new FieldDescriptor("errorCode", FillrEnv$EnumUnboxingLocalUtility.m(FillrEnv$EnumUnboxingLocalUtility.m(zzfe.class, new zzez(1))));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(zzb, ((zzru) obj).zza);
    }
}
