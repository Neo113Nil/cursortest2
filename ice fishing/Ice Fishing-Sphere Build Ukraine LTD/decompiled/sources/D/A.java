package D;

import t0.C0252g;

/* loaded from: classes.dex */
public final class A implements O0.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f56e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f57f;

    public /* synthetic */ A(int i2, Object obj) {
        this.f56e = i2;
        this.f57f = obj;
    }

    @Override // O0.e
    public final Object b(Object obj, v0.d dVar) {
        Object d2;
        switch (this.f56e) {
            case 0:
                S s2 = (S) this.f57f;
                boolean z2 = s2.f132l.x() instanceof d0;
                C0252g c0252g = C0252g.f2994a;
                return (z2 || (d2 = S.d(s2, true, dVar)) != w0.a.f3076e) ? c0252g : d2;
            case 1:
                ((E0.p) this.f57f).f313e = obj;
                throw new P0.a(this);
            default:
                ((U.i) this.f57f).accept(obj);
                return C0252g.f2994a;
        }
    }
}
