package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import android.os.SystemClock;
import androidx.loader.content.ModernAsyncTask$1;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzsf;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzuc {
    public static zzce zza;
    public static final com.google.android.gms.internal.mlkit_vision_face.zzch zzb;
    public final String zzc;
    public final String zzd;
    public final zztv zze;
    public final SharedPrefManager zzf;
    public final zzw zzg;
    public final zzw zzh;
    public final String zzi;
    public final int zzj;
    public final HashMap zzk = new HashMap();
    public final HashMap zzl = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        zzb = new com.google.android.gms.internal.mlkit_vision_face.zzch(3, objArr);
    }

    public zzuc(Context context, SharedPrefManager sharedPrefManager, zztv zztvVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zztvVar;
        zzuo.zza();
        this.zzi = str;
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        ModernAsyncTask$1 modernAsyncTask$1 = new ModernAsyncTask$1(this, 7);
        mLTaskExecutor.getClass();
        this.zzg = MLTaskExecutor.scheduleCallable(modernAsyncTask$1);
        MLTaskExecutor mLTaskExecutor2 = MLTaskExecutor.getInstance();
        Objects.requireNonNull(sharedPrefManager);
        zzsf zzsfVar = new zzsf(sharedPrefManager, 4);
        mLTaskExecutor2.getClass();
        this.zzh = MLTaskExecutor.scheduleCallable(zzsfVar);
        com.google.android.gms.internal.mlkit_vision_face.zzch zzchVar = zzb;
        this.zzj = zzchVar.containsKey(str) ? DynamiteModule.zza(context, (String) zzchVar.get(str), false) : -1;
    }

    public static long zza(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void zzf(zzub zzubVar, zzov zzovVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzovVar, elapsedRealtime)) {
            this.zzk.put(zzovVar, Long.valueOf(elapsedRealtime));
            com.google.mlkit.common.sdkinternal.zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) this, (Object) zzubVar.zza$9(), (Enum) zzovVar, zzj(), 8));
        }
    }

    public final String zzj() {
        zzw zzwVar = this.zzg;
        if (zzwVar.isSuccessful()) {
            return (String) zzwVar.getResult();
        }
        return LibraryVersion.zzb.getVersion(this.zzi);
    }

    public final boolean zzk(zzov zzovVar, long j) {
        HashMap hashMap = this.zzk;
        return hashMap.get(zzovVar) == null || j - ((Long) hashMap.get(zzovVar)).longValue() > 30000;
    }
}
