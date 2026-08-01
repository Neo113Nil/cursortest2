package D0;

/* loaded from: classes.dex */
public final class t extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f613a = 1;

    /* renamed from: b, reason: collision with root package name */
    public o f614b;

    public /* synthetic */ t() {
    }

    @Override // D0.p, D0.m
    public void a(o oVar) {
        switch (this.f613a) {
            case 1:
                C0300a c0300a = (C0300a) this.f614b;
                if (!c0300a.f544W) {
                    c0300a.L();
                    c0300a.f544W = true;
                    break;
                }
                break;
        }
    }

    @Override // D0.m
    public final void d(o oVar) {
        switch (this.f613a) {
            case 0:
                this.f614b.E();
                oVar.C(this);
                break;
            default:
                C0300a c0300a = (C0300a) this.f614b;
                int i = c0300a.f543V - 1;
                c0300a.f543V = i;
                if (i == 0) {
                    c0300a.f544W = false;
                    c0300a.r();
                }
                oVar.C(this);
                break;
        }
    }

    public t(o oVar) {
        this.f614b = oVar;
    }
}
