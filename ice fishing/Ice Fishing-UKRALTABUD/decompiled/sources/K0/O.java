package K0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class O extends T {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f477k = AtomicIntegerFieldUpdater.newUpdater(O.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: j, reason: collision with root package name */
    public final D0.l f478j;

    public O(D0.l lVar) {
        this.f478j = lVar;
    }

    @Override // D0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return t0.g.f2989a;
    }

    @Override // K0.V
    public final void o(Throwable th) {
        if (f477k.compareAndSet(this, 0, 1)) {
            this.f478j.i(th);
        }
    }
}
