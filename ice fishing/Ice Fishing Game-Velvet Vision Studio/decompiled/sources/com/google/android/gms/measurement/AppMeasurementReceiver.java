package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.gamericefishpro.space.m.d;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.y4.a;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends a {
    public d c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new d(10, this);
        }
        d dVar = this.c;
        dVar.getClass();
        v0 v0Var = r1.r(context, null, null).y;
        r1.l(v0Var);
        if (intent == null) {
            v0Var.B.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        v0Var.G.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                v0Var.B.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        v0Var.G.a("Starting wakeful intent.");
        ((AppMeasurementReceiver) dVar.e).getClass();
        SparseArray sparseArray = a.a;
        synchronized (sparseArray) {
            try {
                int i = a.b;
                int i2 = i + 1;
                a.b = i2;
                if (i2 <= 0) {
                    a.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
