package X7;

import S7.m0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public abstract class t extends d implements m0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3814w = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: v, reason: collision with root package name */
    public final long f3815v;

    public t(long j6, t tVar, int i) {
        super(tVar);
        this.f3815v = j6;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // X7.d
    public final boolean c() {
        return f3814w.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f3814w.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, InterfaceC5245i interfaceC5245i);

    public final void h() {
        if (f3814w.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f3814w;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, com.anythink.basead.exoplayer.b.aX + i));
        return true;
    }
}
