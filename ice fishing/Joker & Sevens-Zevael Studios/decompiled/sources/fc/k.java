package fc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k implements d, hc.d {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2349h = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* renamed from: g, reason: collision with root package name */
    public final d f2350g;
    private volatile Object result;

    public k(d dVar, gc.a aVar) {
        this.f2350g = dVar;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        gc.a aVar = gc.a.f2560h;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2349h;
            gc.a aVar2 = gc.a.f2559g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return gc.a.f2559g;
        }
        if (obj == gc.a.f2561i) {
            return gc.a.f2559g;
        }
        if (obj instanceof ac.k) {
            throw ((ac.k) obj).f272g;
        }
        return obj;
    }

    @Override // hc.d
    public final hc.d getCallerFrame() {
        d dVar = this.f2350g;
        if (dVar instanceof hc.d) {
            return (hc.d) dVar;
        }
        return null;
    }

    @Override // fc.d
    public final i getContext() {
        return this.f2350g.getContext();
    }

    @Override // fc.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            gc.a aVar = gc.a.f2560h;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2349h;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            gc.a aVar2 = gc.a.f2559g;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2349h;
            gc.a aVar3 = gc.a.f2561i;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f2350g.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f2350g;
    }
}
