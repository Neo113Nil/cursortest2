package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class co extends defpackage.cw implements java.util.concurrent.Executor {
    public static final defpackage.lm P05cfTpS5W5L;
    public static final defpackage.co QiMR8OkAhezm = new defpackage.co();

    static {
        defpackage.is1 is1Var = defpackage.is1.QiMR8OkAhezm;
        int i = defpackage.xi1.ZpBGe2uQfcn8;
        if (64 >= i) {
            i = 64;
        }
        P05cfTpS5W5L = is1Var.KrtOTfE6jiS2(defpackage.m90.KrtOTfE6jiS2(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.lm
    public final void Mearx7yMn90V(defpackage.jm jmVar, java.lang.Runnable runnable) {
        P05cfTpS5W5L.Mearx7yMn90V(jmVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        jjTN4uUnoyEn(defpackage.xu.WDYagTQQm9ns, runnable);
    }

    @Override // defpackage.lm
    public final void jjTN4uUnoyEn(defpackage.jm jmVar, java.lang.Runnable runnable) {
        P05cfTpS5W5L.jjTN4uUnoyEn(jmVar, runnable);
    }

    @Override // defpackage.lm
    public final java.lang.String toString() {
        return "Dispatchers.IO";
    }
}
