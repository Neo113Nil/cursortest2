package L0;

import t0.C0252g;

/* loaded from: classes.dex */
public final class P extends V {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f627i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f628j;

    public /* synthetic */ P(int i2, Object obj) {
        this.f627i = i2;
        this.f628j = obj;
    }

    @Override // D0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        switch (this.f627i) {
            case 0:
                o((Throwable) obj);
                break;
            default:
                o((Throwable) obj);
                break;
        }
        return C0252g.f2994a;
    }

    @Override // L0.V
    public final void o(Throwable th) {
        switch (this.f627i) {
            case 0:
                ((D0.l) this.f628j).i(th);
                break;
            default:
                Object E2 = n().E();
                boolean z2 = E2 instanceof C0056n;
                W w2 = (W) this.f628j;
                if (!z2) {
                    w2.c(AbstractC0064w.l(E2));
                    break;
                } else {
                    w2.c(o.g.f(((C0056n) E2).f671a));
                    break;
                }
        }
    }
}
