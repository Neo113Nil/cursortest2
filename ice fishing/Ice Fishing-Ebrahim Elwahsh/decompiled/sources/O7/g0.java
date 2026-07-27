package O7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class g0 extends T7.b {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f2601b;

    /* renamed from: c, reason: collision with root package name */
    public k0 f2602c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f2603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ V f2604e;

    public g0(c0 c0Var, h0 h0Var, V v6) {
        this.f2603d = h0Var;
        this.f2604e = v6;
        this.f2601b = c0Var;
    }

    @Override // T7.b
    public final void b(Object obj, Object obj2) {
        T7.k kVar = (T7.k) obj;
        boolean z8 = obj2 == null;
        c0 c0Var = this.f2601b;
        V v6 = z8 ? c0Var : this.f2602c;
        if (v6 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T7.k.f3150n;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, v6)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z8) {
                k0 k0Var = this.f2602c;
                kotlin.jvm.internal.h.b(k0Var);
                c0Var.d(k0Var);
            }
        }
    }

    @Override // T7.b
    public final T7.v c(Object obj) {
        if (this.f2603d.C() == this.f2604e) {
            return null;
        }
        return T7.a.f3130e;
    }
}
