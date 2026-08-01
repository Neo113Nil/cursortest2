package Z;

import b.AbstractC0116l;

/* loaded from: classes.dex */
public final class D extends AbstractC0116l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1408d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(int i, Object obj) {
        super(false);
        this.f1408d = i;
        this.e = obj;
    }

    @Override // b.AbstractC0116l
    public final void a() {
        switch (this.f1408d) {
            case 0:
                M m2 = (M) this.e;
                m2.x(true);
                if (!m2.f1441h.f2301a) {
                    m2.f1440g.b();
                    break;
                } else {
                    m2.N();
                    break;
                }
            default:
                f0.z zVar = (f0.z) this.e;
                if (!zVar.f3010g.isEmpty()) {
                    f0.w f2 = zVar.f();
                    D1.i.b(f2);
                    zVar.o(f2.f2994h, true);
                    break;
                }
                break;
        }
    }
}
