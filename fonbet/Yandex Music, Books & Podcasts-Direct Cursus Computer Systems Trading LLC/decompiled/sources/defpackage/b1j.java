package defpackage;

/* loaded from: classes.dex */
public final class b1j extends jq2 {
    public final int b;

    static {
        jsg.n("NetworkNotRoamingCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1j(r96 r96Var) {
        super(r96Var);
        r96Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.q86
    public final boolean c(t4w t4wVar) {
        t4wVar.getClass();
        return t4wVar.j.a == g2j.d;
    }

    @Override // defpackage.jq2
    public final int d() {
        return this.b;
    }

    @Override // defpackage.jq2
    public final boolean e(Object obj) {
        q1j q1jVar = (q1j) obj;
        q1jVar.getClass();
        return (q1jVar.a && q1jVar.d) ? false : true;
    }
}
