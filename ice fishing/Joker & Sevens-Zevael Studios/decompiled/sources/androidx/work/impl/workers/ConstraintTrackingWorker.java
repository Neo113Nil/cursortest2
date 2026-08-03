package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import b5.a;
import java.util.ArrayList;
import java.util.List;
import o4.n;
import o4.o;
import t4.b;
import z4.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends n implements b {

    /* renamed from: g, reason: collision with root package name */
    public final WorkerParameters f787g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f788h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f789i;

    /* renamed from: j, reason: collision with root package name */
    public final j f790j;

    /* renamed from: k, reason: collision with root package name */
    public n f791k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        pc.j.e(context, "appContext");
        pc.j.e(workerParameters, "workerParameters");
        this.f787g = workerParameters;
        this.f788h = new Object();
        this.f790j = new j();
    }

    @Override // t4.b
    public final void d(ArrayList arrayList) {
        pc.j.e(arrayList, "workSpecs");
        o.d().a(a.f1015a, "Constraints changed for " + arrayList);
        synchronized (this.f788h) {
            this.f789i = true;
        }
    }

    @Override // o4.n
    public final void onStopped() {
        n nVar = this.f791k;
        if (nVar == null || nVar.isStopped()) {
            return;
        }
        nVar.stop();
    }

    @Override // o4.n
    public final h7.a startWork() {
        getBackgroundExecutor().execute(new a1.a(2, this));
        j jVar = this.f790j;
        pc.j.d(jVar, "future");
        return jVar;
    }

    @Override // t4.b
    public final void e(List list) {
    }
}
