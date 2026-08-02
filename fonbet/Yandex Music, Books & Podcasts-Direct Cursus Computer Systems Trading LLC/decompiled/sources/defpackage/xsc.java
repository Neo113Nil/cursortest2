package defpackage;

/* loaded from: classes5.dex */
public abstract class xsc implements jmq {
    public final jmq a;

    public xsc(jmq jmqVar) {
        jmqVar.getClass();
        this.a = jmqVar;
    }

    @Override // defpackage.jmq, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.jmq, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.jmq
    public final vis i() {
        return this.a.i();
    }

    @Override // defpackage.jmq
    public void t0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        this.a.t0(hi3Var, j);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
