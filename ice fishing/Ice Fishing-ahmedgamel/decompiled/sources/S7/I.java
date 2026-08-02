package S7;

/* loaded from: classes2.dex */
public final class I extends c0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3002x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f3003y;

    public /* synthetic */ I(int i, Object obj) {
        this.f3002x = i;
        this.f3003y = obj;
    }

    @Override // S7.c0
    public final void i(Throwable th) {
        switch (this.f3002x) {
            case 0:
                ((H) this.f3003y).b();
                break;
            case 1:
                ((I7.l) this.f3003y).invoke(th);
                break;
            case 2:
                Object C8 = h().C();
                boolean z6 = C8 instanceof C0402p;
                d0 d0Var = (d0) this.f3003y;
                if (!z6) {
                    d0Var.resumeWith(AbstractC0410y.w(C8));
                    break;
                } else {
                    d0Var.resumeWith(Q3.b.b(((C0402p) C8).f3066a));
                    break;
                }
            default:
                ((C0393g) this.f3003y).resumeWith(u7.v.f41073a);
                break;
        }
    }

    @Override // I7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f3002x) {
            case 0:
                i((Throwable) obj);
                break;
            case 1:
                i((Throwable) obj);
                break;
            case 2:
                i((Throwable) obj);
                break;
            default:
                i((Throwable) obj);
                break;
        }
        return u7.v.f41073a;
    }
}
