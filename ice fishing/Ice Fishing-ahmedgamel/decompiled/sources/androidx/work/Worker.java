package androidx.work;

import G0.c;
import J0.i;
import J0.p;
import J0.q;
import P3.a;
import U0.k;
import android.content.Context;
import com.google.android.gms.internal.ads.LD;

/* loaded from: classes.dex */
public abstract class Worker extends q {

    /* renamed from: n, reason: collision with root package name */
    public k f5321n;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract p doWork();

    public i getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // J0.q
    public a getForegroundInfoAsync() {
        k kVar = new k();
        getBackgroundExecutor().execute(new LD(this, kVar, 7, false));
        return kVar;
    }

    @Override // J0.q
    public final a startWork() {
        this.f5321n = new k();
        getBackgroundExecutor().execute(new c(1, this));
        return this.f5321n;
    }
}
