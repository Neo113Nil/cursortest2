package defpackage;

/* loaded from: classes.dex */
public final class vm extends defpackage.qu implements java.util.concurrent.Executor {
    public static final defpackage.vm AARZUJiTa = new defpackage.vm();
    public static final defpackage.nj EXtogiMhuM;

    static {
        defpackage.rk1 rk1Var = defpackage.rk1.AARZUJiTa;
        int i = defpackage.oe1.IHQe1A4L2xu;
        if (64 >= i) {
            i = 64;
        }
        EXtogiMhuM = rk1Var.SiPhmbmu(defpackage.x80.hkbnNdmy(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.nj
    public final void D2vUnMij(defpackage.lj ljVar, java.lang.Runnable runnable) {
        EXtogiMhuM.D2vUnMij(ljVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        v5iciZok(defpackage.lt.adDC3e2L, runnable);
    }

    @Override // defpackage.nj
    public final java.lang.String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.nj
    public final void v5iciZok(defpackage.lj ljVar, java.lang.Runnable runnable) {
        EXtogiMhuM.v5iciZok(ljVar, runnable);
    }
}
