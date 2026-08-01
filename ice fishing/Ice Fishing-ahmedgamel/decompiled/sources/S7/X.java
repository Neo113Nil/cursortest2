package S7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class X extends a0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2939y = AtomicIntegerFieldUpdater.newUpdater(X.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final I7.l f2940x;

    public X(I7.l lVar) {
        this.f2940x = lVar;
    }

    @Override // S7.c0
    public final void i(Throwable th) {
        if (f2939y.compareAndSet(this, 0, 1)) {
            this.f2940x.invoke(th);
        }
    }

    @Override // I7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return u7.v.f41353a;
    }
}
