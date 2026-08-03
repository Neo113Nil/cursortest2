package yc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a1 extends d1 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8828l = AtomicIntegerFieldUpdater.newUpdater(a1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: k, reason: collision with root package name */
    public final z0 f8829k;

    public a1(z0 z0Var) {
        this.f8829k = z0Var;
    }

    @Override // yc.z0
    public final void d(Throwable th) {
        if (f8828l.compareAndSet(this, 0, 1)) {
            this.f8829k.d(th);
        }
    }
}
