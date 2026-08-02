package D0;

/* loaded from: classes.dex */
public final class t extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f509a = 1;

    /* renamed from: b, reason: collision with root package name */
    public o f510b;

    public /* synthetic */ t() {
    }

    @Override // D0.p, D0.m
    public void a(o oVar) {
        switch (this.f509a) {
            case 1:
                C0288a c0288a = (C0288a) this.f510b;
                if (!c0288a.f439W) {
                    c0288a.L();
                    c0288a.f439W = true;
                    break;
                }
                break;
        }
    }

    @Override // D0.m
    public final void d(o oVar) {
        switch (this.f509a) {
            case 0:
                this.f510b.E();
                oVar.C(this);
                break;
            default:
                C0288a c0288a = (C0288a) this.f510b;
                int i = c0288a.f438V - 1;
                c0288a.f438V = i;
                if (i == 0) {
                    c0288a.f439W = false;
                    c0288a.r();
                }
                oVar.C(this);
                break;
        }
    }

    public t(o oVar) {
        this.f510b = oVar;
    }
}
