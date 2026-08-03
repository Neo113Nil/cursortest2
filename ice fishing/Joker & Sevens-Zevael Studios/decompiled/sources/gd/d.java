package gd;

import ac.o;
import dd.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2573g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = e.f2574a;

    public final Object c(hc.c cVar) {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f2581f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                o oVar = o.f277a;
                if (i11 <= 0) {
                    yc.g l10 = a0.l(bc.a0.w(cVar));
                    try {
                        a(new c(this, l10));
                        Object p8 = l10.p();
                        gc.a aVar = gc.a.f2559g;
                        if (p8 != aVar) {
                            p8 = oVar;
                        }
                        return p8 == aVar ? p8 : oVar;
                    } catch (Throwable th) {
                        l10.z();
                        throw th;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f2573g.set(this, null);
                    return oVar;
                }
            }
        }
    }

    public final void d(Object obj) {
        while (Math.max(h.f2581f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2573g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            w wVar = e.f2574a;
            if (obj2 != wVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, wVar)) {
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
        sb.append(a0.j(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f2581f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f2573g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
