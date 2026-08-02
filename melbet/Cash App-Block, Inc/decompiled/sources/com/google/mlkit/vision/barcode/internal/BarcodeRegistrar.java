package com.google.mlkit.vision.barcode.internal;

import androidx.tracing.Trace;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdk;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.internal.zza;
import com.google.mlkit.common.internal.zze;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.List;

/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Component.Builder builder = Component.builder(zzi.class);
        builder.add(Dependency.required(MlKitContext.class));
        builder.factory = new zze(11);
        Component build = builder.build();
        Component.Builder builder2 = Component.builder(zzg.class);
        builder2.add(Dependency.required(zzi.class));
        builder2.add(Dependency.required(ExecutorSelector.class));
        builder2.add(Dependency.required(MlKitContext.class));
        builder2.factory = new zza(12);
        Component build2 = builder2.build();
        zzcq zzcqVar = zzcs.zza;
        Object[] objArr = {build, build2};
        Trace.zza(2, objArr);
        return new zzdk(2, objArr);
    }
}
