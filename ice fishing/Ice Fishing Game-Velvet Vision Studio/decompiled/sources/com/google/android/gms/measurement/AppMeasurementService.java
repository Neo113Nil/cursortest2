package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.gamericefishpro.space.m.d;
import com.gamericefishpro.space.n9.m4;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.r3;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.n9.w2;
import com.gamericefishpro.space.n9.y1;
import com.gamericefishpro.space.y4.a;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements r3 {
    public d d;

    @Override // com.gamericefishpro.space.n9.r3
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // com.gamericefishpro.space.n9.r3
    public final void b(Intent intent) {
        SparseArray sparseArray = a.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.n9.r3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final d d() {
        if (this.d == null) {
            this.d = new d(13, this);
        }
        return this.d;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        d dVarD = d();
        dVarD.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new y1(m4.C((Service) dVarD.e));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((Service) d().e).getClass().getSimpleName().concat(" is starting up.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((Service) d().e).getClass().getSimpleName().concat(" is shutting down.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        d dVarD = d();
        if (intent == null) {
            dVarD.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) dVarD.e;
        v0 v0Var = r1.r(service, null, null).y;
        r1.l(v0Var);
        String action = intent.getAction();
        v0Var.G.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        w2 w2Var = new w2(dVarD, i2, v0Var, intent);
        m4 m4VarC = m4.C(service);
        m4VarC.c().A(new com.gamericefishpro.space.va.a(dVarD, m4VarC, w2Var));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }
}
