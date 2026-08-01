package O1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class r extends P1.c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f877a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_state");
    private volatile Object _state;

    @Override // P1.c
    public final boolean a(P1.a aVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f877a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, m.f867b);
        return true;
    }

    @Override // P1.c
    public final v1.d[] b(P1.a aVar) {
        f877a.set(this, null);
        return P1.b.f914a;
    }
}
