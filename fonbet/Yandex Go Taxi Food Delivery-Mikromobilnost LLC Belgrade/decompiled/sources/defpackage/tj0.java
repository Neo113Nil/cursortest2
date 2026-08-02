package defpackage;

/* loaded from: classes15.dex */
public final class tj0 extends xx4 {
    public final String w;
    public sxj0 x;

    public tj0(String str) {
        this.w = str;
    }

    @Override // defpackage.xx4, defpackage.hr
    public final void b() {
        i(null);
        sxj0 sxj0Var = this.x;
        if (sxj0Var != null) {
            sxj0Var.d.cancel();
        }
    }

    @Override // defpackage.xx4
    public final void j(cl21 cl21Var) {
        sxj0 sxj0Var = (sxj0) ((d9g) cl21Var).C0.get();
        this.x = sxj0Var;
        sxj0Var.c.add(new rxj0(0, this.w));
        sxj0Var.c();
        h();
    }
}
