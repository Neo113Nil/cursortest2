package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import androidx.loader.content.ModernAsyncTask$1;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzsf;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzmj {
    public static zzu zza;
    public static final com.google.android.gms.internal.mlkit_vision_face.zzch zzb;
    public final String zzc;
    public final String zzd;
    public final zzmf zze;
    public final SharedPrefManager zzf;
    public final com.google.android.gms.tasks.zzw zzg;
    public final com.google.android.gms.tasks.zzw zzh;
    public final String zzi;
    public final int zzj;
    public final HashMap zzk = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        zzb = new com.google.android.gms.internal.mlkit_vision_face.zzch(2, objArr);
    }

    public zzmj(Context context, SharedPrefManager sharedPrefManager, zzmf zzmfVar) {
        new HashMap();
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zzmfVar;
        zzmw.zza();
        this.zzi = "vision-common";
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        ModernAsyncTask$1 modernAsyncTask$1 = new ModernAsyncTask$1(this, 5);
        mLTaskExecutor.getClass();
        this.zzg = MLTaskExecutor.scheduleCallable(modernAsyncTask$1);
        MLTaskExecutor mLTaskExecutor2 = MLTaskExecutor.getInstance();
        sharedPrefManager.getClass();
        zzsf zzsfVar = new zzsf(sharedPrefManager, 2);
        mLTaskExecutor2.getClass();
        this.zzh = MLTaskExecutor.scheduleCallable(zzsfVar);
        com.google.android.gms.internal.mlkit_vision_face.zzch zzchVar = zzb;
        this.zzj = zzchVar.containsKey("vision-common") ? DynamiteModule.zza(context, (String) zzchVar.get("vision-common"), false) : -1;
    }
}
