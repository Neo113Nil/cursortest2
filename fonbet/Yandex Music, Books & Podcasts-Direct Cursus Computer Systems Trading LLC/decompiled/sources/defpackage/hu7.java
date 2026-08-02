package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class hu7 extends swf {
    public final /* synthetic */ gm5 a;
    public final /* synthetic */ kd4 b;

    public hu7(gm5 gm5Var, kd4 kd4Var) {
        this.a = gm5Var;
        this.b = kd4Var;
    }

    @Override // defpackage.swf
    public final void Y(gln glnVar, int i, String str) {
        glnVar.getClass();
        this.b.a(null);
    }

    @Override // defpackage.swf
    public final void Z(gln glnVar, int i, String str) {
        glnVar.getClass();
        this.a.U(Unit.a);
        this.b.a(new lp0("WebSocket Closed code='" + i + "' reason='" + str + '\'', null));
    }

    @Override // defpackage.swf
    public final void a0(gln glnVar, Exception exc, l3o l3oVar) {
        this.a.U(Unit.a);
        this.b.a(exc);
    }

    @Override // defpackage.swf
    public final void b0(gln glnVar, pn3 pn3Var) {
        glnVar.getClass();
        this.b.c(pn3Var.u());
    }

    @Override // defpackage.swf
    public final void c0(gln glnVar, String str) {
        glnVar.getClass();
        this.b.c(str);
    }

    @Override // defpackage.swf
    public final void d0(gln glnVar, l3o l3oVar) {
        l3oVar.getClass();
        this.a.U(Unit.a);
    }
}
