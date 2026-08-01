package androidx.work;

import G0.c;
import J0.j;
import J0.q;
import J0.r;
import N3.a;
import U0.k;
import android.content.Context;
import com.google.android.gms.internal.ads.LD;

/* loaded from: classes.dex */
public abstract class Worker extends r {

    /* renamed from: n, reason: collision with root package name */
    public k f5356n;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract q doWork();

    public j getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // J0.r
    public a getForegroundInfoAsync() {
        k kVar = new k();
        getBackgroundExecutor().execute(new LD(this, kVar, 7, false));
        return kVar;
    }

    @Override // J0.r
    public final a startWork() {
        this.f5356n = new k();
        getBackgroundExecutor().execute(new c(2, this));
        return this.f5356n;
    }
}
