package defpackage;

/* loaded from: classes.dex */
public final class wkh {
    public final la6 a;
    public final ose b;
    public final ymi0 c;
    public final uyf0 d = new uyf0();
    public final uyf0 e = new uyf0();
    public final kl5 f;
    public final uyf0 g;
    public boolean h;

    public wkh(Object obj, la6 la6Var, ose oseVar, ymi0 ymi0Var) {
        this.a = la6Var;
        this.b = oseVar;
        this.c = ymi0Var;
        kl5 kl5Var = new kl5();
        kl5Var.c = obj;
        this.f = kl5Var;
        this.g = new uyf0();
    }

    public final void a(Object obj) {
        hd00.a();
        this.d.a(obj);
    }

    public final void b() {
        hd00.a();
        kl5 kl5Var = this.f;
        if (kl5Var.b != null) {
            la6 la6Var = this.a;
            if (la6Var != null) {
                la6Var.dispose();
            }
            this.b.b();
            this.d.onComplete();
            kl5Var.onComplete();
            this.g.onComplete();
        }
    }
}
