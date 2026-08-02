package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.bugsnag.android.Client;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzl {
    public static zzl zza;
    public final Context zzb;
    public final ScheduledExecutorService zzd;
    public final ExecutorService zze;

    public zzl(Context context) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.zzd = newSingleThreadScheduledExecutor;
        this.zze = Executors.newSingleThreadExecutor();
        this.zzb = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new Client.AnonymousClass7(this, 27), 0L, 86400L, TimeUnit.SECONDS);
    }

    public static final SharedPreferences zzf(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void zzg(Context context) {
        if (zzf(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new zzk("Failed to store the app set ID last used time.");
    }
}
