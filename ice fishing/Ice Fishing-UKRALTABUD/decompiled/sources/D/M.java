package D;

import K0.C0030f;

/* loaded from: classes.dex */
public final class M extends E0.j implements D0.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f108g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f109h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i2, Object obj) {
        super(1);
        this.f108g = i2;
        this.f109h = obj;
    }

    @Override // D0.l
    public final Object i(Object obj) {
        switch (this.f108g) {
            case 0:
                Throwable th = (Throwable) obj;
                S s2 = (S) this.f109h;
                if (th != null) {
                    s2.f132m.G(new d0(th));
                }
                if (s2.f134o.f2986g != t0.f.f2988a) {
                    ((a0) s2.f134o.a()).close();
                }
                return t0.g.f2989a;
            case 1:
                t0.g gVar = t0.g.f2989a;
                ((C0030f) this.f109h).c(gVar);
                return gVar;
            default:
                ((S0.h) this.f109h).b();
                return t0.g.f2989a;
        }
    }
}
