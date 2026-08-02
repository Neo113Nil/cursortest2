package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.zzw;

/* loaded from: classes4.dex */
public abstract class AutoResolveHelper {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long zza = SystemClock.elapsedRealtime();

    public static void resolveTask(zzw zzwVar, Activity activity) {
        zzc zzcVar = new zzc();
        int incrementAndGet = zzc.zzd.incrementAndGet();
        zzcVar.zzc = incrementAndGet;
        zzc.zzb.put(incrementAndGet, zzcVar);
        zzc.zza.postDelayed(zzcVar, 600000L);
        zzwVar.addOnCompleteListener(zzcVar);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i = zzcVar.zzc;
        int i2 = zzd.$r8$clinit;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i);
        bundle.putInt("requestCode", 11);
        bundle.putLong("initializationElapsedRealtime", zza);
        zzd zzdVar = new zzd();
        zzdVar.setArguments(bundle);
        int i3 = zzcVar.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 47);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i3);
        beginTransaction.add(zzdVar, sb.toString()).commit();
    }

    public static void zzf(Activity activity, int i, int i2, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i, intent, 1073741824);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
            }
        } else {
            try {
                createPendingResult.send(i2);
            } catch (PendingIntent.CanceledException e) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e);
                }
            }
        }
    }
}
