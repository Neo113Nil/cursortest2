package T0;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final b3.e f3145a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.f f3146b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.q f3147c;

    static {
        J0.r.f("WMFgUpdater");
    }

    public q(WorkDatabase workDatabase, K0.f fVar, b3.e eVar) {
        this.f3146b = fVar;
        this.f3145a = eVar;
        this.f3147c = workDatabase.t();
    }
}
