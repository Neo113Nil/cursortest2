package D;

import L0.C0048f;
import t0.C0251f;
import t0.C0252g;

/* loaded from: classes.dex */
public final class M extends E0.j implements D0.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f109g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i2, Object obj) {
        super(1);
        this.f108f = i2;
        this.f109g = obj;
    }

    @Override // D0.l
    public final Object i(Object obj) {
        switch (this.f108f) {
            case 0:
                Throwable th = (Throwable) obj;
                S s2 = (S) this.f109g;
                if (th != null) {
                    s2.f132l.G(new d0(th));
                }
                if (s2.f134n.f2991f != C0251f.f2993a) {
                    ((a0) s2.f134n.a()).close();
                }
                return C0252g.f2994a;
            case 1:
                C0252g c0252g = C0252g.f2994a;
                ((C0048f) this.f109g).c(c0252g);
                return c0252g;
            default:
                ((T0.h) this.f109g).b();
                return C0252g.f2994a;
        }
    }
}
