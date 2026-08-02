package defpackage;

/* loaded from: classes5.dex */
public final class ro3 extends xsc {
    public final /* synthetic */ to3 b;
    public final /* synthetic */ yk3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro3(to3 to3Var, yk3 yk3Var, jmq jmqVar) {
        super(jmqVar);
        this.b = to3Var;
        this.c = yk3Var;
    }

    @Override // defpackage.xsc, defpackage.jmq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        to3 to3Var = this.b;
        yk3 yk3Var = this.c;
        synchronized (to3Var) {
            if (yk3Var.a) {
                return;
            }
            yk3Var.a = true;
            super.close();
            ((z0j) this.c.b).B();
        }
    }
}
