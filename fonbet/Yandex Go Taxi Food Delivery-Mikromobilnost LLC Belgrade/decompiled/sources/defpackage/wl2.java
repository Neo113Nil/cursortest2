package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class wl2 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jnl b;

    public /* synthetic */ wl2(jnl jnlVar, int i) {
        this.a = i;
        this.b = jnlVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        jnl jnlVar = this.b;
        switch (i) {
            case 0:
                return jnlVar.c((y3x) obj);
            default:
                return jnlVar.d(obj);
        }
    }
}
