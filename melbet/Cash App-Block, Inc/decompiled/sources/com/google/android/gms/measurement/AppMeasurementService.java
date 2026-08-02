package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import coil3.Extras;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzpg;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements zznp {
    public Extras.Key zza;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Extras.Key zzd$1 = zzd$1();
        zzd$1.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzjd(zzpg.zza((Service) zzd$1.f61default));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) zzd$1().f61default).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) zzd$1().f61default).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        zzd$1();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final Extras.Key zzd$1 = zzd$1();
        if (intent == null) {
            zzd$1.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) zzd$1.f61default;
        final zzgu zzguVar = zzic.zzy(service, null, null, null).zzi;
        zzic.zzP(zzguVar);
        String action = intent.getAction();
        zzguVar.zzl.zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.measurement.internal.zzns
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) Extras.Key.this.f61default;
                zznp zznpVar = (zznp) service2;
                int i3 = i2;
                if (zznpVar.zza(i3)) {
                    zzguVar.zzl.zzb(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    zzgu zzguVar2 = zzic.zzy(service2, null, null, null).zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzl.zza("Completed wakeful intent.");
                    zznpVar.zzc(intent);
                }
            }
        };
        zzpg zza = zzpg.zza(service);
        zza.zzaX().zzj(new com.google.android.gms.tasks.zzc(zzd$1, zza, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        zzd$1();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzb(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzc(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    public final Extras.Key zzd$1() {
        if (this.zza == null) {
            this.zza = new Extras.Key(this);
        }
        return this.zza;
    }
}
