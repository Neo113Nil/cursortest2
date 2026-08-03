package dd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import yc.p1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class u extends d implements p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1883d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f1884c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public u(long j3, u uVar, int i10) {
        super(uVar);
        this.f1884c = j3;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // dd.d
    public final boolean c() {
        return f1883d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1883d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i10, fc.i iVar);

    public final void h() {
        if (f1883d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f1883d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
