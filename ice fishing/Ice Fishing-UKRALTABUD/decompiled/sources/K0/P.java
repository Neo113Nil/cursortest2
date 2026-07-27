package K0;

/* loaded from: classes.dex */
public final class P extends V {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f479j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f480k;

    public /* synthetic */ P(int i2, Object obj) {
        this.f479j = i2;
        this.f480k = obj;
    }

    @Override // D0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        switch (this.f479j) {
            case 0:
                o((Throwable) obj);
                break;
            default:
                o((Throwable) obj);
                break;
        }
        return t0.g.f2989a;
    }

    @Override // K0.V
    public final void o(Throwable th) {
        switch (this.f479j) {
            case 0:
                ((D0.l) this.f480k).i(th);
                break;
            default:
                Object E2 = n().E();
                boolean z2 = E2 instanceof C0038n;
                W w2 = (W) this.f480k;
                if (!z2) {
                    w2.c(AbstractC0046w.l(E2));
                    break;
                } else {
                    w2.c(o.g.f(((C0038n) E2).f523a));
                    break;
                }
        }
    }
}
