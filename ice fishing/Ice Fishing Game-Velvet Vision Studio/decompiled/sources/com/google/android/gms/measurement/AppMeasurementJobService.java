package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.gamericefishpro.space.i9.j1;
import com.gamericefishpro.space.i9.w0;
import com.gamericefishpro.space.lb.e;
import com.gamericefishpro.space.m.d;
import com.gamericefishpro.space.n9.m4;
import com.gamericefishpro.space.n9.r3;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.va.a;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements r3 {
    public d d;

    @Override // com.gamericefishpro.space.n9.r3
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.gamericefishpro.space.n9.r3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final d d() {
        if (this.d == null) {
            this.d = new d(13, this);
        }
        return this.d;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        d dVarD = d();
        Service service = (Service) dVarD.e;
        String string = jobParameters.getExtras().getString("action");
        "onStartJob received action: ".concat(String.valueOf(string));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            c0.g(string);
            m4 m4VarC = m4.C(service);
            v0 v0VarA = m4VarC.a();
            e eVar = m4VarC.E.i;
            v0VarA.G.b(string, "Local AppMeasurementJobService called. action");
            m4VarC.c().A(new a(dVarD, m4VarC, new com.gamericefishpro.space.m6.e(dVarD, v0VarA, jobParameters, 9)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        c0.g(string);
        j1 j1VarC = j1.c(service, null);
        a aVar = new a(22, dVarD, jobParameters);
        j1VarC.getClass();
        j1VarC.a(new w0(j1VarC, aVar, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    @Override // com.gamericefishpro.space.n9.r3
    public final void b(Intent intent) {
    }
}
