package S7;

import E2.C0316m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class g0 extends X7.b {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f3048b;

    /* renamed from: c, reason: collision with root package name */
    public k0 f3049c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f3050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ V f3051e;

    public g0(c0 c0Var, h0 h0Var, V v9) {
        this.f3050d = h0Var;
        this.f3051e = v9;
        this.f3048b = c0Var;
    }

    @Override // X7.b
    public final void b(Object obj, Object obj2) {
        X7.k kVar = (X7.k) obj;
        boolean z6 = obj2 == null;
        X7.k kVar2 = this.f3048b;
        X7.k kVar3 = z6 ? kVar2 : this.f3049c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.k.f3799n;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z6) {
                X7.k kVar4 = this.f3049c;
                kotlin.jvm.internal.h.b(kVar4);
                kVar2.d(kVar4);
            }
        }
    }

    @Override // X7.b
    public final C0316m c(Object obj) {
        if (this.f3050d.C() == this.f3051e) {
            return null;
        }
        return X7.a.f3779e;
    }
}
