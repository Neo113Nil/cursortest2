package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.zzh;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class zzajt {
    public static zzir zza;
    public static final zziw zzb = zziw.zzg(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String zzc;
    public final String zzd;
    public final zzajp zze;
    public final SharedPrefManager zzf;
    public final zzw zzg;
    public final zzw zzh;
    public final String zzi;
    public final int zzj;

    public zzajt(Context context, final SharedPrefManager sharedPrefManager, zzajp zzajpVar) {
        new HashMap();
        new HashMap();
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zzajpVar;
        zzzx.zza();
        this.zzi = "genai-prompt";
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        final int i = 0;
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_genai_prompt.zzajr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                Object obj = this;
                switch (i2) {
                    case 0:
                        return LibraryVersion.zzb.getVersion(((zzajt) obj).zzi);
                    default:
                        return ((SharedPrefManager) obj).getMlSdkInstanceId();
                }
            }
        };
        mLTaskExecutor.getClass();
        this.zzg = MLTaskExecutor.scheduleCallable(callable);
        MLTaskExecutor mLTaskExecutor2 = MLTaskExecutor.getInstance();
        Objects.requireNonNull(sharedPrefManager);
        final int i2 = 1;
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_genai_prompt.zzajr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i22 = i2;
                Object obj = sharedPrefManager;
                switch (i22) {
                    case 0:
                        return LibraryVersion.zzb.getVersion(((zzajt) obj).zzi);
                    default:
                        return ((SharedPrefManager) obj).getMlSdkInstanceId();
                }
            }
        };
        mLTaskExecutor2.getClass();
        this.zzh = MLTaskExecutor.scheduleCallable(callable2);
        zziw zziwVar = zzb;
        this.zzj = zziwVar.containsKey("genai-prompt") ? DynamiteModule.zza(context, (String) zziwVar.get("genai-prompt"), false) : -1;
    }

    public final void zzc(zzfr zzfrVar, zzaca zzacaVar) {
        String version;
        zzw zzwVar = this.zzg;
        if (zzwVar.isSuccessful()) {
            version = (String) zzwVar.getResult();
        } else {
            version = LibraryVersion.zzb.getVersion(this.zzi);
        }
        zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) this, (Object) zzfrVar, (Enum) zzacaVar, version, 5));
    }
}
