package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import java.util.UUID;

/* loaded from: classes.dex */
public final class SharedPrefManager {
    public static final Component COMPONENT;
    public final Context zza;

    static {
        Component.Builder builder = Component.builder(SharedPrefManager.class);
        builder.add(Dependency.required(MlKitContext.class));
        builder.add(Dependency.required(Context.class));
        builder.factory = new com.google.mlkit.common.internal.zzd(11);
        COMPONENT = builder.build();
    }

    public SharedPrefManager(Context context) {
        this.zza = context;
    }

    public final synchronized String getMlSdkInstanceId() {
        String string2 = this.zza.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string2 != null) {
            return string2;
        }
        String uuid = UUID.randomUUID().toString();
        this.zza.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
