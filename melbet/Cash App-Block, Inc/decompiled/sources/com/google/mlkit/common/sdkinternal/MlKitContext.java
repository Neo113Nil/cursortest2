package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.android.gms.common.internal.zzae;
import com.google.crypto.tink.KeysetHandle;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class MlKitContext {
    public static final Object zza = new Object();
    public static MlKitContext zzb;
    public ComponentRuntime zzc;

    public static MlKitContext getInstance() {
        MlKitContext mlKitContext;
        synchronized (zza) {
            zzae.checkState("MlKitContext has not been initialized", zzb != null);
            mlKitContext = zzb;
            zzae.checkNotNull(mlKitContext);
        }
        return mlKitContext;
    }

    public static MlKitContext zzb(Context context, Executor executor) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            zzae.checkState("MlKitContext is already initialized", zzb == null);
            MlKitContext mlKitContext2 = new MlKitContext();
            zzb = mlKitContext2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList discoverLazy = new KeysetHandle(6, context, new ConnectionPool(MlKitComponentDiscoveryService.class)).discoverLazy();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            OptionalProvider$$ExternalSyntheticLambda0 optionalProvider$$ExternalSyntheticLambda0 = ComponentRegistrarProcessor.NOOP;
            arrayList.addAll(discoverLazy);
            arrayList2.add(Component.of(context, Context.class, new Class[0]));
            arrayList2.add(Component.of(mlKitContext2, MlKitContext.class, new Class[0]));
            ComponentRuntime componentRuntime = new ComponentRuntime(executor, arrayList, arrayList2, optionalProvider$$ExternalSyntheticLambda0);
            mlKitContext2.zzc = componentRuntime;
            componentRuntime.initializeEagerComponents(true);
            mlKitContext = zzb;
        }
        return mlKitContext;
    }

    public final Object get(Class cls) {
        zzae.checkState("MlKitContext has been deleted", zzb == this);
        zzae.checkNotNull(this.zzc);
        return this.zzc.get(cls);
    }

    public final Context getApplicationContext() {
        return (Context) get(Context.class);
    }
}
