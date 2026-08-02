package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class y651 extends c751 {
    public final WindowInsets.Builder c;

    public y651(n751 n751Var) {
        super(n751Var);
        WindowInsets g = n751Var.g();
        this.c = g != null ? new WindowInsets.Builder(g) : new WindowInsets.Builder();
    }

    @Override // defpackage.c751
    public void d(u1w u1wVar) {
        this.c.setMandatorySystemGestureInsets(u1wVar.e());
    }

    @Override // defpackage.c751
    public void e(u1w u1wVar) {
        this.c.setSystemGestureInsets(u1wVar.e());
    }

    @Override // defpackage.c751
    public void f(u1w u1wVar) {
        this.c.setSystemWindowInsets(u1wVar.e());
    }

    @Override // defpackage.c751
    public void g(u1w u1wVar) {
        this.c.setTappableElementInsets(u1wVar.e());
    }

    public n751 h() {
        a();
        n751 h = n751.h(null, this.c.build());
        h.a.r(this.b);
        return h;
    }

    public void i(bzj bzjVar) {
        this.c.setDisplayCutout(bzjVar != null ? bzjVar.a : null);
    }

    public void j(u1w u1wVar) {
        this.c.setStableInsets(u1wVar.e());
    }

    public y651() {
        this.c = new WindowInsets.Builder();
    }
}
