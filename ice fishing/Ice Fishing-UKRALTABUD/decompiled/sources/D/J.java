package D;

import K0.InterfaceC0045v;

/* loaded from: classes.dex */
public final class J extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f99j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f100k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(S s2, v0.d dVar) {
        super(2, dVar);
        this.f100k = s2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((J) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new J(this.f100k, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f99j;
        S s2 = this.f100k;
        try {
            if (i2 == 0) {
                o.g.C(obj);
                if (s2.f132m.x() instanceof d0) {
                    return s2.f132m.x();
                }
                this.f99j = 1;
                if (s2.g(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.g.C(obj);
                    return (m0) obj;
                }
                o.g.C(obj);
            }
            this.f99j = 2;
            obj = S.d(s2, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (m0) obj;
        } catch (Throwable th) {
            return new f0(th, -1);
        }
    }
}
