package X7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3783n = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3784u = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public d(t tVar) {
        this._prev$volatile = tVar;
    }

    public final void a() {
        f3784u.set(this, null);
    }

    public final d b() {
        Object obj = f3783n.get(this);
        if (obj == a.f3776b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d b9;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3784u;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.c()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d b10 = b();
            kotlin.jvm.internal.h.b(b10);
            while (b10.c() && (b9 = b10.b()) != null) {
                b10 = b9;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b10);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b10, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(b10) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                f3783n.set(dVar, b10);
            }
            if (!b10.c() || b10.b() == null) {
                if (dVar == null || !dVar.c()) {
                    return;
                }
            }
        }
    }
}
