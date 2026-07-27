package androidx.work.impl.workers;

import D.RunnableC0282a;
import J0.r;
import J0.s;
import O0.b;
import U0.k;
import W0.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends r implements b {

    /* renamed from: n, reason: collision with root package name */
    public final WorkerParameters f5398n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f5399u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f5400v;

    /* renamed from: w, reason: collision with root package name */
    public final k f5401w;

    /* renamed from: x, reason: collision with root package name */
    public r f5402x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        h.e(appContext, "appContext");
        h.e(workerParameters, "workerParameters");
        this.f5398n = workerParameters;
        this.f5399u = new Object();
        this.f5401w = new k();
    }

    @Override // O0.b
    public final void e(ArrayList workSpecs) {
        h.e(workSpecs, "workSpecs");
        s.d().a(a.f3401a, "Constraints changed for " + workSpecs);
        synchronized (this.f5399u) {
            this.f5400v = true;
        }
    }

    @Override // O0.b
    public final void f(List list) {
    }

    @Override // J0.r
    public final void onStopped() {
        super.onStopped();
        r rVar = this.f5402x;
        if (rVar == null || rVar.isStopped()) {
            return;
        }
        rVar.stop();
    }

    @Override // J0.r
    public final N3.a startWork() {
        getBackgroundExecutor().execute(new RunnableC0282a(6, this));
        k future = this.f5401w;
        h.d(future, "future");
        return future;
    }
}
