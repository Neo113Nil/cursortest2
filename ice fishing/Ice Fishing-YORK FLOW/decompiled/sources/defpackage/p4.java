package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p4 implements android.view.Choreographer.FrameCallback {
    public final /* synthetic */ defpackage.dd WDYagTQQm9ns;
    public final /* synthetic */ defpackage.y10 oh71FJcDz6S2;

    public p4(defpackage.dd ddVar, defpackage.q4 q4Var, defpackage.y10 y10Var) {
        this.WDYagTQQm9ns = ddVar;
        this.oh71FJcDz6S2 = y10Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        java.lang.Object g51Var;
        try {
            g51Var = this.oh71FJcDz6S2.P05cfTpS5W5L(java.lang.Long.valueOf(j));
        } catch (java.lang.Throwable th) {
            g51Var = new defpackage.g51(th);
        }
        this.WDYagTQQm9ns.e6mdH7fiFuta(g51Var);
    }
}
