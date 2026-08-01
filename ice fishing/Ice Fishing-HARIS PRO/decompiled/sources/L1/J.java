package L1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class J extends M {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f533f = AtomicIntegerFieldUpdater.newUpdater(J.class, "_invoked");
    private volatile int _invoked;
    public final O e;

    public J(O o2) {
        this.e = o2;
    }

    @Override // C1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return t1.i.f4388c;
    }

    @Override // L1.O
    public final void o(Throwable th) {
        if (f533f.compareAndSet(this, 0, 1)) {
            this.e.g(th);
        }
    }
}
