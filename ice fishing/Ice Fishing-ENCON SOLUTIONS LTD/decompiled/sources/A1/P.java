package A1;

import h1.C0239i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class P extends U {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f16f = AtomicIntegerFieldUpdater.newUpdater(P.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final t1.l f17e;

    public P(t1.l lVar) {
        this.f17e = lVar;
    }

    @Override // t1.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return C0239i.f3393a;
    }

    @Override // A1.W
    public final void k(Throwable th) {
        if (f16f.compareAndSet(this, 0, 1)) {
            this.f17e.invoke(th);
        }
    }
}
