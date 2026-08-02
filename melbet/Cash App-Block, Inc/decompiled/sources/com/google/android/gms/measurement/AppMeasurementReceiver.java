package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.fillr.m1;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;

/* loaded from: classes4.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver {
    public m1 zza;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new m1(this, 26);
        }
        m1 m1Var = this.zza;
        m1Var.getClass();
        zzgu zzguVar = zzic.zzy(context, null, null, null).zzi;
        zzic.zzP(zzguVar);
        if (intent == null) {
            zzguVar.zzg.zza("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzguVar.zzl.zzb(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzguVar.zzg.zza("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        zzguVar.zzl.zza("Starting wakeful intent.");
        ((AppMeasurementReceiver) m1Var.a).getClass();
        SparseArray sparseArray = WakefulBroadcastReceiver.sActiveWakeLocks;
        synchronized (sparseArray) {
            try {
                int i = WakefulBroadcastReceiver.mNextId;
                int i2 = i + 1;
                WakefulBroadcastReceiver.mNextId = i2;
                if (i2 <= 0) {
                    WakefulBroadcastReceiver.mNextId = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName startService = context.startService(className);
                if (startService == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i, newWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
