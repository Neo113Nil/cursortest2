package com.google.mlkit.common.internal;

import coil3.memory.MemoryCacheService;
import com.google.android.gms.dynamite.zzf;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.dynamite.zzh;
import com.google.android.gms.internal.mlkit_common.zzad;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzal;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.model.RemoteModelManager$RemoteModelManagerRegistration;
import com.google.mlkit.common.sdkinternal.Cleaner;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.squareup.util.cash.Countries;
import java.util.List;

/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Component component = SharedPrefManager.COMPONENT;
        Component.Builder builder = Component.builder(zzh.class);
        builder.add(Dependency.required(MlKitContext.class));
        builder.factory = new zza(0);
        Component build = builder.build();
        Component.Builder builder2 = Component.builder(MlKitThreadPool.class);
        builder2.factory = new zzb(0);
        Component build2 = builder2.build();
        Component.Builder builder3 = Component.builder(MemoryCacheService.class);
        builder3.add(new Dependency(2, 0, RemoteModelManager$RemoteModelManagerRegistration.class));
        builder3.factory = new zzc(0);
        Component build3 = builder3.build();
        Component.Builder builder4 = Component.builder(ExecutorSelector.class);
        builder4.add(new Dependency(1, 1, MlKitThreadPool.class));
        builder4.factory = new zzd(0);
        Component build4 = builder4.build();
        Component.Builder builder5 = Component.builder(Cleaner.class);
        builder5.factory = new zze(0);
        Component build5 = builder5.build();
        Component.Builder builder6 = Component.builder(zzg.class);
        builder6.add(Dependency.required(Cleaner.class));
        builder6.factory = new zza(11);
        Component build6 = builder6.build();
        Component.Builder builder7 = Component.builder(zzf.class);
        builder7.add(Dependency.required(MlKitContext.class));
        builder7.factory = new zzb(11);
        Component build7 = builder7.build();
        Component.Builder builder8 = Component.builder(RemoteModelManager$RemoteModelManagerRegistration.class);
        builder8.f1004type = 1;
        builder8.add(new Dependency(1, 1, zzf.class));
        builder8.factory = new zzc(11);
        Component build8 = builder8.build();
        zzad zzadVar = zzaf.zza;
        Object[] objArr = {component, build, build2, build3, build4, build5, build6, build7, build8};
        Countries.zza(9, objArr);
        return new zzal(9, objArr);
    }
}
