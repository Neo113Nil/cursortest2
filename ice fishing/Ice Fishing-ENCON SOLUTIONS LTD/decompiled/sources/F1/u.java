package F1;

import A1.e0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class u extends d implements e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f630d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f631c;
    private volatile int cleanedAndPointers;

    public u(long j2, u uVar, int i2) {
        super(uVar);
        this.f631c = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // F1.d
    public final boolean c() {
        return f630d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f630d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, l1.i iVar);

    public final void h() {
        if (f630d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f630d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
