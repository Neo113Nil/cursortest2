package D;

import t0.C0252g;

/* renamed from: D.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015p extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f251i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f252j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015p(S s2, v0.d dVar) {
        super(2, dVar);
        this.f252j = s2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0015p) l((O0.e) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new C0015p(this.f252j, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f251i;
        if (i2 == 0) {
            o.g.z(obj);
            this.f251i = 1;
            if (S.c(this.f252j, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return C0252g.f2994a;
    }
}
