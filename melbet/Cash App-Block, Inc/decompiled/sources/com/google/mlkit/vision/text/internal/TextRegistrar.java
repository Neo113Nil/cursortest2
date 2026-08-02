package com.google.mlkit.vision.text.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbi;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.internal.zzb;
import com.google.mlkit.common.internal.zzc;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes.dex */
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Component.Builder builder = Component.builder(zzp.class);
        builder.add(Dependency.required(MlKitContext.class));
        builder.factory = new zzb(12);
        Component build = builder.build();
        Component.Builder builder2 = Component.builder(zzo.class);
        builder2.add(Dependency.required(zzp.class));
        builder2.add(Dependency.required(ExecutorSelector.class));
        builder2.factory = new zzc(12);
        Object[] objArr = {build, builder2.build()};
        for (int i = 0; i < 2; i++) {
            zzbi zzbiVar = zzbk.zza;
            if (objArr[i] == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "at index "));
                return null;
            }
        }
        return zzbk.zzg(2, objArr);
    }
}
