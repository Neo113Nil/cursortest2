package defpackage;

/* loaded from: classes10.dex */
public final class se60 implements wx01 {
    public final qy01 a;
    public final nev b;

    public se60(qy01 qy01Var, nev nevVar) {
        this.a = qy01Var;
        this.b = nevVar;
    }

    @Override // defpackage.wx01
    public final void a() {
        nev nevVar = this.b;
        boolean z = nevVar instanceof u3v0;
        qy01 qy01Var = this.a;
        if (z) {
            qy01Var.b(((u3v0) nevVar).a);
        } else if (nevVar instanceof n9o) {
            qy01Var.g(((n9o) nevVar).a);
        }
    }
}
