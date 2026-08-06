package A1;

import h1.C0239i;

/* loaded from: classes.dex */
public final class Q extends W {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f19f;

    public /* synthetic */ Q(int i2, Object obj) {
        this.f18e = i2;
        this.f19f = obj;
    }

    @Override // t1.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f18e) {
            case 0:
                k((Throwable) obj);
                break;
            default:
                k((Throwable) obj);
                break;
        }
        return C0239i.f3393a;
    }

    @Override // A1.W
    public final void k(Throwable th) {
        switch (this.f18e) {
            case 0:
                ((t1.l) this.f19f).invoke(th);
                break;
            default:
                Object D2 = j().D();
                boolean z2 = D2 instanceof C0013n;
                X x2 = (X) this.f19f;
                if (!z2) {
                    x2.i(AbstractC0022x.l(D2));
                    break;
                } else {
                    x2.i(R1.l.h(((C0013n) D2).f62a));
                    break;
                }
        }
    }
}
