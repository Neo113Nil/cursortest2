package L1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class S extends Q1.b {

    /* renamed from: b, reason: collision with root package name */
    public final O f544b;

    /* renamed from: c, reason: collision with root package name */
    public U f545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f546d;
    public final /* synthetic */ I e;

    public S(O o2, T t2, I i) {
        this.f546d = t2;
        this.e = i;
        this.f544b = o2;
    }

    @Override // Q1.b
    public final void b(Object obj, Object obj2) {
        Q1.j jVar = (Q1.j) obj;
        boolean z2 = obj2 == null;
        O o2 = this.f544b;
        I i = z2 ? o2 : this.f545c;
        if (i != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q1.j.f953a;
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, this, i)) {
                if (atomicReferenceFieldUpdater.get(jVar) != this) {
                    return;
                }
            }
            if (z2) {
                U u2 = this.f545c;
                D1.i.b(u2);
                o2.j(u2);
            }
        }
    }

    @Override // Q1.b
    public final Q1.u c(Object obj) {
        if (this.f546d.q() == this.e) {
            return null;
        }
        return Q1.a.e;
    }
}
