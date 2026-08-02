package defpackage;

/* loaded from: classes3.dex */
public final class owj implements uzm {
    public static final l1j c = new l1j(10);
    public static final pn5 d = new pn5(5);
    public lu7 a;
    public volatile uzm b;

    public owj(l1j l1jVar, uzm uzmVar) {
        this.a = l1jVar;
        this.b = uzmVar;
    }

    public final void a(lu7 lu7Var) {
        uzm uzmVar;
        uzm uzmVar2;
        uzm uzmVar3 = this.b;
        pn5 pn5Var = d;
        if (uzmVar3 != pn5Var) {
            lu7Var.j(uzmVar3);
            return;
        }
        synchronized (this) {
            uzmVar = this.b;
            if (uzmVar != pn5Var) {
                uzmVar2 = uzmVar;
            } else {
                this.a = new suh(5, this.a, lu7Var);
                uzmVar2 = null;
            }
        }
        if (uzmVar2 != null) {
            lu7Var.j(uzmVar);
        }
    }

    @Override // defpackage.uzm
    public final Object get() {
        return this.b.get();
    }
}
