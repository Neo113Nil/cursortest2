package defpackage;

/* loaded from: classes4.dex */
public final class gp7 implements vfk {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gp7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vfk
    public final mif a(bg2 bg2Var) {
        int i = this.a;
        bg2Var.getClass();
        switch (i) {
            case 0:
                cg2 d = bg2Var.d();
                if (bg2Var.d) {
                    d.d = true;
                }
                if (bg2Var.c) {
                    return mif.b(nif.b(nif.a, new wk0(4, (mnd) this.b)), new az6(9, d), null, 5);
                }
                return nif.d(d.a());
            default:
                cg2 d2 = bg2Var.d();
                d2.a = u1g.F(bg2Var.a, new kma(8, this));
                wfk wfkVar = (wfk) this.b;
                boolean z = false;
                d2.b = false;
                d2.c = wfkVar.b && bg2Var.c;
                d2.d = wfkVar.c && bg2Var.d;
                if (wfkVar.d && bg2Var.e) {
                    z = true;
                }
                d2.e = z;
                return nif.d(d2.a());
        }
    }
}
