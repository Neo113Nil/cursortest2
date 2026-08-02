package androidx.work.impl.workers;

import A3.p;
import J0.q;
import J0.r;
import O0.b;
import U0.k;
import W0.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends q implements b {

    /* renamed from: n, reason: collision with root package name */
    public final WorkerParameters f5363n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f5364u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f5365v;

    /* renamed from: w, reason: collision with root package name */
    public final k f5366w;

    /* renamed from: x, reason: collision with root package name */
    public q f5367x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        h.e(appContext, "appContext");
        h.e(workerParameters, "workerParameters");
        this.f5363n = workerParameters;
        this.f5364u = new Object();
        this.f5366w = new k();
    }

    @Override // O0.b
    public final void e(ArrayList workSpecs) {
        h.e(workSpecs, "workSpecs");
        r.d().a(a.f3531a, "Constraints changed for " + workSpecs);
        synchronized (this.f5364u) {
            this.f5365v = true;
        }
    }

    @Override // O0.b
    public final void f(List list) {
    }

    @Override // J0.q
    public final void onStopped() {
        super.onStopped();
        q qVar = this.f5367x;
        if (qVar == null || qVar.isStopped()) {
            return;
        }
        qVar.stop();
    }

    @Override // J0.q
    public final P3.a startWork() {
        getBackgroundExecutor().execute(new p(7, this));
        k future = this.f5366w;
        h.d(future, "future");
        return future;
    }
}
