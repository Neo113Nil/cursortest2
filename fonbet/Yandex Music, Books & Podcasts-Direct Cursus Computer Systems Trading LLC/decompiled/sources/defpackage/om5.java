package defpackage;

/* loaded from: classes5.dex */
public final class om5 extends bm5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ om5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.bm5
    public final void b(jm5 jm5Var) {
        switch (this.a) {
            case 0:
                nm5 nm5Var = new nm5(jm5Var, (fm5) this.b);
                jm5Var.b(nm5Var);
                ka8 b = ((gsd) this.c).b(nm5Var);
                khp khpVar = nm5Var.b;
                khpVar.getClass();
                ra8.e(khpVar, b);
                break;
            default:
                ueh uehVar = new ueh(jm5Var, (h5n) this.c);
                jm5Var.b(uehVar);
                ((teh) this.b).c0(uehVar);
                break;
        }
    }
}
