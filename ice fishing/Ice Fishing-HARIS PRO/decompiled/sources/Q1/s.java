package Q1;

import L1.W;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class s extends d implements W {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f969d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f970c;
    private volatile int cleanedAndPointers;

    public s(long j, N1.h hVar, int i) {
        super(hVar);
        this.f970c = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // Q1.d
    public final boolean c() {
        return f969d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f969d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, v1.i iVar);

    public final void h() {
        if (f969d.incrementAndGet(this) == N1.d.f722b) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f969d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
