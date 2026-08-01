package S7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class g0 extends X7.b {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f2965b;

    /* renamed from: c, reason: collision with root package name */
    public k0 f2966c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f2967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ V f2968e;

    public g0(c0 c0Var, h0 h0Var, V v9) {
        this.f2967d = h0Var;
        this.f2968e = v9;
        this.f2965b = c0Var;
    }

    @Override // X7.b
    public final void b(Object obj, Object obj2) {
        X7.k kVar = (X7.k) obj;
        boolean z3 = obj2 == null;
        X7.k kVar2 = this.f2965b;
        X7.k kVar3 = z3 ? kVar2 : this.f2966c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.k.f3844n;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z3) {
                X7.k kVar4 = this.f2966c;
                kotlin.jvm.internal.h.b(kVar4);
                kVar2.d(kVar4);
            }
        }
    }

    @Override // X7.b
    public final D2.b c(Object obj) {
        if (this.f2967d.C() == this.f2968e) {
            return null;
        }
        return X7.a.f3824e;
    }
}
