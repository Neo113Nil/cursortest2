package D;

import L0.InterfaceC0063v;
import t0.C0252g;

/* loaded from: classes.dex */
public final class J extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f99i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f100j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(S s2, v0.d dVar) {
        super(2, dVar);
        this.f100j = s2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((J) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new J(this.f100j, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f99i;
        S s2 = this.f100j;
        try {
            if (i2 == 0) {
                o.g.z(obj);
                if (s2.f132l.x() instanceof d0) {
                    return s2.f132l.x();
                }
                this.f99i = 1;
                if (s2.g(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.g.z(obj);
                    return (m0) obj;
                }
                o.g.z(obj);
            }
            this.f99i = 2;
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
