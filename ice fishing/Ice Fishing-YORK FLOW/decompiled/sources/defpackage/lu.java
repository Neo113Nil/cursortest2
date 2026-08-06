package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lu extends defpackage.ma0 {
    public final /* synthetic */ defpackage.ma0 Hx18F4M3RgD4;
    public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor cSrsis27vXSh;

    public lu(defpackage.ma0 ma0Var, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        this.Hx18F4M3RgD4 = ma0Var;
        this.cSrsis27vXSh = threadPoolExecutor;
    }

    @Override // defpackage.ma0
    public final void OcTWLQzke1i2(java.lang.Throwable th) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.cSrsis27vXSh;
        try {
            this.Hx18F4M3RgD4.OcTWLQzke1i2(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.ma0
    public final void blKFvluuDQOf(defpackage.s81 s81Var) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.cSrsis27vXSh;
        try {
            this.Hx18F4M3RgD4.blKFvluuDQOf(s81Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
