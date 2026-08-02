package defpackage;

/* loaded from: classes5.dex */
public final class wxj extends po4 {
    public final qxj a;
    public final po4 b;

    public wxj(qxj qxjVar, po4 po4Var) {
        this.a = qxjVar;
        this.b = po4Var;
    }

    @Override // defpackage.po4
    public final qo4 a(e0 e0Var, s2i s2iVar) {
        po4 po4Var = this.b;
        return po4Var != null ? new uxj(this, po4Var.a(e0Var, s2iVar)) : new vxj(this);
    }
}
