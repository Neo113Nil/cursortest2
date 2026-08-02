package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import androidx.loader.content.ModernAsyncTask$1;
import com.bumptech.glide.GlideBuilder$1;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzsh {
    public static final zzaq zzb = zzaq.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String zzi;

    public zzsh(Context context, SharedPrefManager sharedPrefManager) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        CommonUtils.getAppVersion(context);
        synchronized (GlideBuilder$1.class) {
            if (GlideBuilder$1.zza == null) {
                GlideBuilder$1.zza = new GlideBuilder$1();
            }
        }
        this.zzi = "common";
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        ModernAsyncTask$1 modernAsyncTask$1 = new ModernAsyncTask$1(this, 3);
        mLTaskExecutor.getClass();
        MLTaskExecutor.scheduleCallable(modernAsyncTask$1);
        MLTaskExecutor mLTaskExecutor2 = MLTaskExecutor.getInstance();
        Objects.requireNonNull(sharedPrefManager);
        zzsf zzsfVar = new zzsf(sharedPrefManager, 0);
        mLTaskExecutor2.getClass();
        MLTaskExecutor.scheduleCallable(zzsfVar);
        zzaq zzaqVar = zzb;
        if (zzaqVar.containsKey("common")) {
            DynamiteModule.zza(context, (String) zzaqVar.get("common"), false);
        }
    }
}
