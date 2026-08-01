package J0;

import C2.J;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class r {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public r(Context context, WorkerParameters workerParameters) {
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
        return this.mWorkerParams.f5362f;
    }

    public N3.a getForegroundInfoAsync() {
        U0.k kVar = new U0.k();
        kVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f5357a;
    }

    public final h getInputData() {
        return this.mWorkerParams.f5358b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f5360d.f4172w;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f5361e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f5359c;
    }

    public V0.a getTaskExecutor() {
        return this.mWorkerParams.f5363g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f5360d.f4170u;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f5360d.f4171v;
    }

    public A getWorkerFactory() {
        return this.mWorkerParams.f5364h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final N3.a setForegroundAsync(j jVar) {
        T0.q qVar = this.mWorkerParams.f5365j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        qVar.getClass();
        U0.k kVar = new U0.k();
        qVar.f3062a.i(new L3.l(qVar, kVar, id, jVar, applicationContext));
        return kVar;
    }

    public N3.a setProgressAsync(h hVar) {
        T0.r rVar = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        rVar.getClass();
        U0.k kVar = new U0.k();
        rVar.f3067b.i(new J(rVar, id, hVar, kVar, 7, false));
        return kVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract N3.a startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
