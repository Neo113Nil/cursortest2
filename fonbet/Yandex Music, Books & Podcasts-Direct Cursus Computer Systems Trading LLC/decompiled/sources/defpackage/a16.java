package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a16 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d16 b;

    public /* synthetic */ a16(d16 d16Var, int i) {
        this.a = i;
        this.b = d16Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (y16) this.b.j.d.getValue();
            case 1:
                d16 d16Var = this.b;
                fnb fnbVar = d16Var.d().a;
                cvo cvoVar = d16Var.o;
                return new c16(d16Var, new m06(new jnq(fnbVar, cvoVar), new tmb(12, fnbVar, cvoVar), new b16(d16Var, 2)));
            case 2:
                d16 d16Var2 = this.b;
                y16 y16Var = (y16) d16Var2.l.getValue();
                c16 c16Var = (c16) d16Var2.n.getValue();
                tmb x = d16Var2.x();
                y16Var.getClass();
                c16Var.getClass();
                uoq uoqVar = new uoq("concerts", null, null, (cjf) ((jyr) new g06(c16Var.a, c16Var.c, c16Var.b).a).getValue(), c16Var.d);
                q63 q63Var = c16Var.e;
                q63Var.getClass();
                return new i26(new gpq(uoqVar, q63Var), x, new evj((qud) y16Var.b.getValue(), (z06) y16Var.c.getValue(), (w16) y16Var.d.getValue(), x, sj.k()), (rw5) ((jyr) y16Var.a.e).getValue(), sj.l());
            default:
                return ((c16) this.b.n.getValue()).d;
        }
    }
}
