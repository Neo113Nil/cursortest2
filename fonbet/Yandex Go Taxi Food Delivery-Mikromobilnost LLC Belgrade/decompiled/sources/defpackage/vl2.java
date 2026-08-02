package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class vl2 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jnl b;

    public /* synthetic */ vl2(jnl jnlVar, int i) {
        this.a = i;
        this.b = jnlVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        jnl jnlVar = this.b;
        switch (i) {
            case 0:
                return jnlVar.a();
            default:
                return jnlVar.b();
        }
    }
}
