package o4;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import h3.c0;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class n {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public n(Context context, WorkerParameters workerParameters) {
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
        return this.mWorkerParams.f749f;
    }

    public h7.a getForegroundInfoAsync() {
        z4.j jVar = new z4.j();
        jVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f744a;
    }

    public final e getInputData() {
        return this.mWorkerParams.f745b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f747d.f263i;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f748e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f746c;
    }

    public a5.a getTaskExecutor() {
        return this.mWorkerParams.f750g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f747d.f262h;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f747d.f261g;
    }

    public w getWorkerFactory() {
        return this.mWorkerParams.f751h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final h7.a setForegroundAsync(g gVar) {
        y4.r rVar = this.mWorkerParams.f753j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        rVar.getClass();
        z4.j jVar = new z4.j();
        rVar.f8774a.a(new y4.q(rVar, jVar, id2, gVar, applicationContext));
        return jVar;
    }

    public h7.a setProgressAsync(e eVar) {
        y4.s sVar = this.mWorkerParams.f752i;
        getApplicationContext();
        UUID id2 = getId();
        sVar.getClass();
        z4.j jVar = new z4.j();
        sVar.f8779b.a(new c0(sVar, id2, eVar, jVar, 2));
        return jVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract h7.a startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
