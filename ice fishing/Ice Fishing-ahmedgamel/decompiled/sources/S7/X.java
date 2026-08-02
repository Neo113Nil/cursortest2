package S7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class X extends a0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3022y = AtomicIntegerFieldUpdater.newUpdater(X.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final I7.l f3023x;

    public X(I7.l lVar) {
        this.f3023x = lVar;
    }

    @Override // S7.c0
    public final void i(Throwable th) {
        if (f3022y.compareAndSet(this, 0, 1)) {
            this.f3023x.invoke(th);
        }
    }

    @Override // I7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return u7.v.f41073a;
    }
}
