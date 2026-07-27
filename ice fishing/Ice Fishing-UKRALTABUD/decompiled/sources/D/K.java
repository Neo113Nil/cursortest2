package D;

import K0.InterfaceC0045v;

/* loaded from: classes.dex */
public final class K extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f101j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.f f102k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0003d f103l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(D0.p pVar, C0003d c0003d, v0.d dVar) {
        super(2, dVar);
        this.f102k = (x0.f) pVar;
        this.f103l = c0003d;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((K) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D0.p, x0.f] */
    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new K(this.f102k, this.f103l, dVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [D0.p, x0.f] */
    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f101j;
        if (i2 == 0) {
            o.g.C(obj);
            Object obj2 = this.f103l.f174b;
            this.f101j = 1;
            obj = this.f102k.f(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        return obj;
    }
}
