package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f7490a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7491b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f7492c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f7493d;

    /* renamed from: e, reason: collision with root package name */
    private final g f7494e;

    /* renamed from: f, reason: collision with root package name */
    private final IExecutionPolicy f7495f;

    public NetworkCore(IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f7492c) {
                }
                this.f7493d = (d) this.f7490a.take();
                networkTask = this.f7493d.f7461a;
                Executor executor = networkTask.getExecutor();
                this.f7494e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f7492c) {
                    this.f7493d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f7492c) {
                        this.f7493d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f7492c) {
                        this.f7493d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f7495f.canBeExecuted()) {
            synchronized (this.f7491b) {
                try {
                    d dVar = new d(networkTask);
                    if (isRunning() && !this.f7490a.contains(dVar) && !dVar.equals(this.f7493d) && networkTask.onTaskAdded()) {
                        this.f7490a.offer(dVar);
                    }
                } finally {
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f7492c) {
            try {
                ArrayList arrayList = new ArrayList(this.f7490a.size());
                this.f7490a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f7461a.onTaskRemoved();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f7490a = new LinkedBlockingQueue();
        this.f7491b = new Object();
        this.f7492c = new Object();
        this.f7495f = iExecutionPolicy;
        this.f7494e = gVar;
    }
}
