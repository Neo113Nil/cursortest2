package r0;

import L0.InterfaceC0063v;
import t0.C0252g;

/* loaded from: classes.dex */
public final class F extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2848i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f2849j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2850k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2851l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(J j2, String str, String str2, v0.d dVar) {
        super(2, dVar);
        this.f2849j = j2;
        this.f2850k = str;
        this.f2851l = str2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((F) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new F(this.f2849j, this.f2850k, this.f2851l, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f2848i;
        if (i2 == 0) {
            o.g.z(obj);
            this.f2848i = 1;
            if (J.r(this.f2849j, this.f2850k, this.f2851l, this) == aVar) {
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
