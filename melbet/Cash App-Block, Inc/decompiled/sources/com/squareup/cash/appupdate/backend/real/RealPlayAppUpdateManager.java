package com.squareup.cash.appupdate.backend.real;

import android.content.Context;
import com.google.android.play.core.appupdate.internal.zzaf;
import com.google.android.play.core.appupdate.zzg;
import com.google.android.play.core.appupdate.zzi;
import com.google.mlkit.vision.common.zzb;
import okio.internal.ZipFilesKt;

/* loaded from: classes4.dex */
public final class RealPlayAppUpdateManager {
    public final zzg appUpdateManager;

    public RealPlayAppUpdateManager(Context context) {
        zzb zzbVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (ZipFilesKt.class) {
            try {
                if (ZipFilesKt.zza == null) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    ZipFilesKt.zza = new zzb(new zzi(applicationContext2 != null ? applicationContext2 : applicationContext, 0));
                }
                zzbVar = ZipFilesKt.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzg zzgVar = (zzg) ((zzaf) zzbVar.zza).zza();
        zzgVar.getClass();
        this.appUpdateManager = zzgVar;
    }
}
