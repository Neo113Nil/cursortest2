package Q1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f956a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur");
    private volatile Object _cur = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f956a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int a2 = mVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                m c2 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c2) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f956a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c2 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c2) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) f956a.get(this);
        mVar.getClass();
        long j = m.f958f.get(mVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f956a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d2 = mVar.d();
            if (d2 != m.f959g) {
                return d2;
            }
            m c2 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c2) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
