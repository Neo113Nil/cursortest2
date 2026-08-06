package A1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a0 extends F1.b {

    /* renamed from: b, reason: collision with root package name */
    public final W f33b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f34c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f35d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N f36e;

    public a0(W w2, b0 b0Var, N n2) {
        this.f35d = b0Var;
        this.f36e = n2;
        this.f33b = w2;
    }

    @Override // F1.b
    public final void b(Object obj, Object obj2) {
        F1.k kVar = (F1.k) obj;
        boolean z2 = obj2 == null;
        F1.k kVar2 = this.f33b;
        F1.k kVar3 = z2 ? kVar2 : this.f34c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F1.k.f612a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z2) {
                F1.k kVar4 = this.f34c;
                kotlin.jvm.internal.i.b(kVar4);
                kVar2.f(kVar4);
            }
        }
    }

    @Override // F1.b
    public final C.j c(Object obj) {
        if (this.f35d.D() == this.f36e) {
            return null;
        }
        return F1.a.f593e;
    }
}
