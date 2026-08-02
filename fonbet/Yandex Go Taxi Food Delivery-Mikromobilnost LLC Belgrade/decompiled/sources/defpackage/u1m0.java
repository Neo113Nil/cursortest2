package defpackage;

/* loaded from: classes5.dex */
public final class u1m0 extends wys {
    public static final /* synthetic */ int T = 0;
    public final yss0 R;
    public final wls S;

    public u1m0(yss0 yss0Var, wls wlsVar) {
        super(yss0Var.asView());
        this.R = yss0Var;
        this.S = wlsVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        s2x s2xVar = (s2x) obj;
        xss0 xss0Var = s2xVar.c;
        gss0 gss0Var = xss0Var.a;
        yss0 yss0Var = this.R;
        yss0Var.renderLead(gss0Var);
        yss0Var.renderBody(xss0Var.b);
        String str = s2xVar.b;
        yss0Var.renderTrail(xss0Var.c, new s1m0(this, str, 1));
        yss0Var.setAction(xss0Var.d, new s1m0(this, str, 0));
    }
}
