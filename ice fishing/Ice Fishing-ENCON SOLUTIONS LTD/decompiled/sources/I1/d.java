package I1;

import A1.AbstractC0022x;
import A1.C0005f;
import h1.C0239i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m1.EnumC0985a;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f729g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z2) {
        super(z2 ? 1 : 0);
        this.owner = z2 ? null : e.f730a;
    }

    public final Object c(AbstractC0991b abstractC0991b) {
        boolean d2 = d(null);
        C0239i c0239i = C0239i.f3393a;
        if (d2) {
            return c0239i;
        }
        C0005f c2 = AbstractC0022x.c(R1.d.t(abstractC0991b));
        try {
            a(new c(this, c2));
            Object t = c2.t();
            EnumC0985a enumC0985a = EnumC0985a.f8194a;
            if (t != enumC0985a) {
                t = c0239i;
            }
            return t == enumC0985a ? t : c0239i;
        } catch (Throwable th) {
            c2.A();
            throw th;
        }
    }

    public final boolean d(Object obj) {
        int i2;
        char c2;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f737f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f729g;
                if (i3 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c3 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f730a) {
                                c3 = obj2 == obj ? (char) 1 : (char) 2;
                            }
                        }
                        if (c3 == 1) {
                            c2 = 2;
                            break;
                        }
                        if (c3 == 2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c2 = 0;
                    break;
                }
            }
        }
        c2 = 1;
        if (c2 == 0) {
            return true;
        }
        if (c2 == 1) {
            return false;
        }
        if (c2 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void e(Object obj) {
        while (Math.max(h.f737f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f729g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C.j jVar = e.f730a;
            if (obj2 != jVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jVar)) {
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
        sb.append(AbstractC0022x.b(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f737f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f729g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
