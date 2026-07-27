package K0;

import P0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Z extends P0.b {

    /* renamed from: b, reason: collision with root package name */
    public final V f493b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f496e;

    public Z(V v2, a0 a0Var, M m2) {
        this.f495d = a0Var;
        this.f496e = m2;
        this.f493b = v2;
    }

    @Override // P0.b
    public final void b(Object obj, Object obj2) {
        P0.l lVar = (P0.l) obj;
        boolean z2 = obj2 == null;
        V v2 = this.f493b;
        M m2 = z2 ? v2 : this.f494c;
        if (m2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P0.l.f886f;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, m2)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z2) {
                b0 b0Var = this.f494c;
                E0.i.b(b0Var);
                v2.j(b0Var);
            }
        }
    }

    @Override // P0.b
    public final A.j c(Object obj) {
        if (this.f495d.E() == this.f496e) {
            return null;
        }
        return AbstractC0068a.f864e;
    }
}
