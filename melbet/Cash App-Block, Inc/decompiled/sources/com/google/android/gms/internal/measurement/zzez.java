package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzez {
    public static volatile zzez zzc;
    public final ExecutorService zzb;
    public final AppMeasurementSdk zze;
    public int zzg;
    public boolean zzh;
    public volatile zzcp zzj;
    public volatile long zzk;

    public zzez(Context context, Bundle bundle) {
        zzeb zzebVar = new zzeb(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzebVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new AppMeasurementSdk(this);
        new ArrayList();
        try {
            if (Countries.zza(context, PlatformKt.zza(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzez.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.zzh = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        zzV(new zzdp(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzey(this));
        }
    }

    public static zzez zza(Context context, Bundle bundle) {
        com.google.android.gms.common.internal.zzae.checkNotNull(context);
        if (zzc == null) {
            synchronized (zzez.class) {
                try {
                    if (zzc == null) {
                        zzc = new zzez(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } finally {
                }
            }
        }
        return zzc;
    }

    public final void zzV(zzeo zzeoVar) {
        this.zzb.execute(zzeoVar);
    }

    public final void zzW(Exception exc, boolean z, boolean z2) {
        this.zzh |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zzV(new zzdf(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final long zzz() {
        zzcm zzcmVar = new zzcm();
        zzV(new zzdu(this, zzcmVar, 2));
        Long zzd = zzcmVar.zzd();
        if (zzd != null) {
            return zzd.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.zzg + 1;
        this.zzg = i;
        return nextLong + i;
    }
}
