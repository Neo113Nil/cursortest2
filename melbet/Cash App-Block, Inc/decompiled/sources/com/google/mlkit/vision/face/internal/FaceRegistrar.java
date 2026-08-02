package com.google.mlkit.vision.face.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzbl;
import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.android.gms.internal.mlkit_vision_face.zzcc;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes.dex */
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Component.Builder builder = Component.builder(zze.class);
        builder.add(Dependency.required(MlKitContext.class));
        builder.factory = zzk.zza;
        Component build = builder.build();
        Component.Builder builder2 = Component.builder(zzc.class);
        builder2.add(Dependency.required(zze.class));
        builder2.add(Dependency.required(ExecutorSelector.class));
        builder2.factory = zzk.zza$1;
        Object[] objArr = {build, builder2.build()};
        for (int i = 0; i < 2; i++) {
            zzbl zzblVar = zzbn.zza;
            if (objArr[i] == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "at index "));
                return null;
            }
        }
        zzbl zzblVar2 = zzbn.zza;
        return new zzcc(2, objArr);
    }
}
