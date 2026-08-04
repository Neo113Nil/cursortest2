package com.gamericefishpro.space.l6;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import com.gamericefishpro.space.d4.r0;
import com.gamericefishpro.space.n9.x1;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public p(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public com.gamericefishpro.space.va.b getForegroundInfoAsync() {
        com.gamericefishpro.space.w6.j jVar = new com.gamericefishpro.space.w6.j();
        jVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final g getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.v;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public com.gamericefishpro.space.x6.a getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.e;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.i;
    }

    public b0 getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final com.gamericefishpro.space.va.b setForegroundAsync(i iVar) {
        com.gamericefishpro.space.v6.p pVar = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        pVar.getClass();
        com.gamericefishpro.space.w6.j jVar = new com.gamericefishpro.space.w6.j();
        pVar.a.a(new x1(pVar, jVar, id, iVar, applicationContext));
        return jVar;
    }

    public com.gamericefishpro.space.va.b setProgressAsync(g gVar) {
        com.gamericefishpro.space.v6.q qVar = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        qVar.getClass();
        com.gamericefishpro.space.w6.j jVar = new com.gamericefishpro.space.w6.j();
        qVar.b.a(new r0(qVar, id, gVar, jVar, 11, false));
        return jVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract com.gamericefishpro.space.va.b startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
