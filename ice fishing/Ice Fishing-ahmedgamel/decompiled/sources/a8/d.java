package a8;

import E2.C0316m;
import S7.AbstractC0410y;
import S7.C0393g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class d extends h implements InterfaceC0451a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4360g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = e.f4361a;

    public final Object c(InterfaceC5240d interfaceC5240d) {
        int i;
        char c9;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f4368f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i4 <= 0) {
                    c9 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    f4360g.set(this, null);
                    c9 = 0;
                    break;
                }
            }
        }
        v vVar = v.f41073a;
        if (c9 != 0) {
            if (c9 != 1) {
                if (c9 != 2) {
                    throw new IllegalStateException("unexpected");
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
            C0393g k9 = AbstractC0410y.k(A8.b.n(interfaceC5240d));
            try {
                a(new c(this, k9));
                Object q8 = k9.q();
                A7.a aVar = A7.a.f215n;
                if (q8 != aVar) {
                    q8 = vVar;
                }
                if (q8 == aVar) {
                    return q8;
                }
            } catch (Throwable th) {
                k9.y();
                throw th;
            }
        }
        return vVar;
    }

    public final void d(Object obj) {
        while (Math.max(h.f4368f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4360g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0316m c0316m = e.f4361a;
            if (obj2 != c0316m) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0316m)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0410y.j(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f4368f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f4360g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
