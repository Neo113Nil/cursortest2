package S7;

/* loaded from: classes2.dex */
public final class I extends c0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2919x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f2920y;

    public /* synthetic */ I(int i, Object obj) {
        this.f2919x = i;
        this.f2920y = obj;
    }

    @Override // S7.c0
    public final void i(Throwable th) {
        switch (this.f2919x) {
            case 0:
                ((H) this.f2920y).b();
                break;
            case 1:
                ((I7.l) this.f2920y).invoke(th);
                break;
            case 2:
                Object C8 = h().C();
                boolean z3 = C8 instanceof C0398p;
                d0 d0Var = (d0) this.f2920y;
                if (!z3) {
                    d0Var.resumeWith(AbstractC0406y.w(C8));
                    break;
                } else {
                    d0Var.resumeWith(com.bumptech.glide.d.f(((C0398p) C8).f2983a));
                    break;
                }
            default:
                ((C0389g) this.f2920y).resumeWith(u7.v.f41350a);
                break;
        }
    }

    @Override // I7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f2919x) {
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
        return u7.v.f41350a;
    }
}
