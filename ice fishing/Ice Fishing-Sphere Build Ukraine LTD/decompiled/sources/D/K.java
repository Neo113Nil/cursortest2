package D;

import L0.InterfaceC0063v;
import t0.C0252g;

/* loaded from: classes.dex */
public final class K extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f101i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.f f102j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0003d f103k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(D0.p pVar, C0003d c0003d, v0.d dVar) {
        super(2, dVar);
        this.f102j = (x0.f) pVar;
        this.f103k = c0003d;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((K) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D0.p, x0.f] */
    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new K(this.f102j, this.f103k, dVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [D0.p, x0.f] */
    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f101i;
        if (i2 == 0) {
            o.g.z(obj);
            Object obj2 = this.f103k.f174b;
            this.f101i = 1;
            obj = this.f102j.f(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return obj;
    }
}
