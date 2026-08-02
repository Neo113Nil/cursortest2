package J0;

import E2.I;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class q {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public q(Context context, WorkerParameters workerParameters) {
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
        return this.mWorkerParams.f5327f;
    }

    public P3.a getForegroundInfoAsync() {
        U0.k kVar = new U0.k();
        kVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f5322a;
    }

    public final g getInputData() {
        return this.mWorkerParams.f5323b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f5325d.f5559w;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f5326e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f5324c;
    }

    public V0.a getTaskExecutor() {
        return this.mWorkerParams.f5328g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f5325d.f5557u;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f5325d.f5558v;
    }

    public z getWorkerFactory() {
        return this.mWorkerParams.f5329h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final P3.a setForegroundAsync(i iVar) {
        T0.q qVar = this.mWorkerParams.f5330j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        qVar.getClass();
        U0.k kVar = new U0.k();
        qVar.f3145a.h(new N3.j(qVar, kVar, id, iVar, applicationContext));
        return kVar;
    }

    public P3.a setProgressAsync(g gVar) {
        T0.r rVar = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        rVar.getClass();
        U0.k kVar = new U0.k();
        rVar.f3150b.h(new I(rVar, id, gVar, kVar, 7, false));
        return kVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract P3.a startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
