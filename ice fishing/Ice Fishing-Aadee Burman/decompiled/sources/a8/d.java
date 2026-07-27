package a8;

import S7.AbstractC0406y;
import S7.C0389g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class d extends h implements InterfaceC0447a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4392g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = e.f4393a;

    public final Object c(InterfaceC5267d interfaceC5267d) {
        int i;
        char c9;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f4400f;
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i6 <= 0) {
                    c9 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i6, i6 - 1)) {
                    f4392g.set(this, null);
                    c9 = 0;
                    break;
                }
            }
        }
        v vVar = v.f41350a;
        if (c9 != 0) {
            if (c9 != 1) {
                if (c9 != 2) {
                    throw new IllegalStateException("unexpected");
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
            C0389g k9 = AbstractC0406y.k(A8.b.l(interfaceC5267d));
            try {
                a(new c(this, k9));
                Object q8 = k9.q();
                A7.a aVar = A7.a.f58n;
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
        while (Math.max(h.f4400f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4392g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            D2.b bVar = e.f4393a;
            if (obj2 != bVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar)) {
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
        sb.append(AbstractC0406y.j(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f4400f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f4392g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
