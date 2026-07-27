package L0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import t0.C0252g;

/* loaded from: classes.dex */
public final class O extends T {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f625j = AtomicIntegerFieldUpdater.newUpdater(O.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: i, reason: collision with root package name */
    public final D0.l f626i;

    public O(D0.l lVar) {
        this.f626i = lVar;
    }

    @Override // D0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return C0252g.f2994a;
    }

    @Override // L0.V
    public final void o(Throwable th) {
        if (f625j.compareAndSet(this, 0, 1)) {
            this.f626i.i(th);
        }
    }
}
