package defpackage;

/* loaded from: classes.dex */
public final class w72 implements c3c {
    public final x72 a;

    public w72(x72 x72Var) {
        this.a = x72Var;
    }

    public final void a(b3c b3cVar) {
        x72 x72Var = this.a;
        if (b3cVar == null) {
            lxa1.e(x72Var.a());
        } else {
            x72Var.a().setPrimaryClip(b3cVar.a());
        }
    }
}
