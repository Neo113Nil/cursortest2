package com.google.android.gms.internal.mlkit_vision_face;

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

/* loaded from: classes4.dex */
public final class zzoc {
    public static zzcc zza;
    public static final zzch zzb;
    public final String zzc;
    public final String zzd;
    public final zznu zze;
    public final SharedPrefManager zzf;
    public final zzw zzg;
    public final zzw zzh;
    public final String zzi;
    public final int zzj;
    public final HashMap zzk = new HashMap();
    public final HashMap zzl = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        zzb = new zzch(0, objArr);
    }

    public zzoc(Context context, SharedPrefManager sharedPrefManager, zznu zznuVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zznuVar;
        zzoo.zza();
        this.zzi = str;
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        ModernAsyncTask$1 modernAsyncTask$1 = new ModernAsyncTask$1(this, 6);
        mLTaskExecutor.getClass();
        this.zzg = MLTaskExecutor.scheduleCallable(modernAsyncTask$1);
        MLTaskExecutor mLTaskExecutor2 = MLTaskExecutor.getInstance();
        sharedPrefManager.getClass();
        zzsf zzsfVar = new zzsf(sharedPrefManager, 3);
        mLTaskExecutor2.getClass();
        this.zzh = MLTaskExecutor.scheduleCallable(zzsfVar);
        zzch zzchVar = zzb;
        this.zzj = zzchVar.containsKey(str) ? DynamiteModule.zza(context, (String) zzchVar.get(str), false) : -1;
    }

    public static long zza(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void zzf(zzoa zzoaVar, zzkt zzktVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzktVar, elapsedRealtime)) {
            this.zzk.put(zzktVar, Long.valueOf(elapsedRealtime));
            com.google.mlkit.common.sdkinternal.zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) this, (Object) zzoaVar.zza$6(), (Enum) zzktVar, zzj(), 7));
        }
    }

    public final String zzj() {
        zzw zzwVar = this.zzg;
        return zzwVar.isSuccessful() ? (String) zzwVar.getResult() : LibraryVersion.zzb.getVersion(this.zzi);
    }

    public final boolean zzk(zzkt zzktVar, long j) {
        HashMap hashMap = this.zzk;
        return hashMap.get(zzktVar) == null || j - ((Long) hashMap.get(zzktVar)).longValue() > 30000;
    }
}
