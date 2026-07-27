package L0;

import Q0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Z extends Q0.b {

    /* renamed from: b, reason: collision with root package name */
    public final V f641b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f644e;

    public Z(V v2, a0 a0Var, M m2) {
        this.f643d = a0Var;
        this.f644e = m2;
        this.f641b = v2;
    }

    @Override // Q0.b
    public final void b(Object obj, Object obj2) {
        Q0.l lVar = (Q0.l) obj;
        boolean z2 = obj2 == null;
        V v2 = this.f641b;
        M m2 = z2 ? v2 : this.f642c;
        if (m2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q0.l.f895e;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, m2)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z2) {
                b0 b0Var = this.f642c;
                E0.i.b(b0Var);
                v2.j(b0Var);
            }
        }
    }

    @Override // Q0.b
    public final A.j c(Object obj) {
        if (this.f643d.E() == this.f644e) {
            return null;
        }
        return AbstractC0068a.f873e;
    }
}
