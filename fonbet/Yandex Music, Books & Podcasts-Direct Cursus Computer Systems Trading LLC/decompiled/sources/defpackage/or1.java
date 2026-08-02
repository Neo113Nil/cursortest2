package defpackage;

/* loaded from: classes3.dex */
public final class or1 extends viq {
    public dt1 h;
    public Object i;
    public lr1 j;
    public final /* synthetic */ nsh k;

    public or1(nsh nshVar) {
        this.k = nshVar;
    }

    @Override // defpackage.viq, defpackage.piq
    public final boolean c() {
        if (!super.c()) {
            return false;
        }
        dt1 dt1Var = this.h;
        if (dt1Var != null) {
            dt1Var.c(new imp());
            this.h.close();
        }
        Object obj = this.i;
        if (obj == null) {
            return true;
        }
        ((ys1) this.k.d).e(obj);
        return true;
    }
}
