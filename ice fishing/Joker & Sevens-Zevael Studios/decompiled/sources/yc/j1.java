package yc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j1 extends dd.b {

    /* renamed from: b, reason: collision with root package name */
    public final f1 f8867b;

    /* renamed from: c, reason: collision with root package name */
    public m1 f8868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k1 f8869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f8870e;

    public j1(f1 f1Var, k1 k1Var, w0 w0Var) {
        this.f8869d = k1Var;
        this.f8870e = w0Var;
        this.f8867b = f1Var;
    }

    @Override // dd.b
    public final void b(Object obj, Object obj2) {
        dd.k kVar = (dd.k) obj;
        boolean z10 = obj2 == null;
        dd.k kVar2 = this.f8867b;
        dd.k kVar3 = z10 ? kVar2 : this.f8868c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dd.k.f1868g;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                dd.k kVar4 = this.f8868c;
                pc.j.b(kVar4);
                kVar2.g(kVar4);
            }
        }
    }

    @Override // dd.b
    public final dd.w c(Object obj) {
        if (this.f8869d.M() == this.f8870e) {
            return null;
        }
        return dd.a.f1843e;
    }
}
