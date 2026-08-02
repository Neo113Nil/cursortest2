package defpackage;

/* loaded from: classes6.dex */
public final class lhq implements r63 {
    public final qnq a;

    public lhq(qnq qnqVar, int i) {
        switch (i) {
            case 1:
                this.a = qnqVar;
                break;
            default:
                qnqVar.getClass();
                this.a = qnqVar;
                break;
        }
    }

    @Override // defpackage.r63
    public void a(w43 w43Var) {
        mfr mfrVar = (mfr) w43Var;
        boolean z = mfrVar instanceof lfr;
        qnq qnqVar = this.a;
        if (z) {
            x2i.a0(qnqVar.a, pd.t(new qzm[0]), new teb(((lfr) mfrVar).a));
        } else if (mfrVar instanceof kfr) {
            w1g.y(qnqVar.b, ((kfr) mfrVar).a, true);
        } else {
            b6e.s();
        }
    }
}
