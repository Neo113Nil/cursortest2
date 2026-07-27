package P0;

import K0.d0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class v extends d implements d0 {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f904i = AtomicIntegerFieldUpdater.newUpdater(v.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: h, reason: collision with root package name */
    public final long f905h;

    public v(long j2, v vVar, int i2) {
        super(vVar);
        this.f905h = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // P0.d
    public final boolean c() {
        return f904i.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f904i.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, v0.i iVar);

    public final void h() {
        if (f904i.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f904i;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
