package O7;

/* loaded from: classes2.dex */
public final class I extends c0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2555x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f2556y;

    public /* synthetic */ I(int i, Object obj) {
        this.f2555x = i;
        this.f2556y = obj;
    }

    @Override // O7.c0
    public final void i(Throwable th) {
        switch (this.f2555x) {
            case 0:
                ((H) this.f2556y).b();
                break;
            case 1:
                ((E7.l) this.f2556y).invoke(th);
                break;
            case 2:
                Object C7 = h().C();
                boolean z8 = C7 instanceof C0391p;
                d0 d0Var = (d0) this.f2556y;
                if (!z8) {
                    d0Var.resumeWith(AbstractC0399y.w(C7));
                    break;
                } else {
                    d0Var.resumeWith(com.bumptech.glide.f.e(((C0391p) C7).f2619a));
                    break;
                }
            default:
                ((C0382g) this.f2556y).resumeWith(q7.v.f40183a);
                break;
        }
    }

    @Override // E7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f2555x) {
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
        return q7.v.f40183a;
    }
}
