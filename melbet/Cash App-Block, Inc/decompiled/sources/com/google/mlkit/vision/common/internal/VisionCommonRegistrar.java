package com.google.mlkit.vision.common.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_vision_common.zzn;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.android.gms.internal.mlkit_vision_common.zzu;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Component.Builder builder = Component.builder(zzf.class);
        builder.add(new Dependency(2, 0, SizeKt.class));
        builder.factory = zzf.zza;
        Object[] objArr = {builder.build()};
        for (int i = 0; i < 1; i++) {
            zzn zznVar = zzp.zza;
            if (objArr[i] == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "at index "));
                return null;
            }
        }
        zzn zznVar2 = zzp.zza;
        return new zzu(1, objArr);
    }
}
