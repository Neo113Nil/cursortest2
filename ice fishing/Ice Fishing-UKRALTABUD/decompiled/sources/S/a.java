package S;

import D.A;
import D0.p;
import K0.InterfaceC0045v;
import N0.d;
import U.i;
import t0.g;
import x0.f;

/* loaded from: classes.dex */
public final class a extends f implements p {

    /* renamed from: j, reason: collision with root package name */
    public int f980j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f981k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f982l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, i iVar, v0.d dVar2) {
        super(2, dVar2);
        this.f981k = dVar;
        this.f982l = iVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((a) l((InterfaceC0045v) obj, (v0.d) obj2)).n(g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new a(this.f981k, this.f982l, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f980j;
        if (i2 == 0) {
            o.g.C(obj);
            A a2 = new A(2, this.f982l);
            this.f980j = 1;
            if (this.f981k.n(a2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        return g.f2989a;
    }
}
