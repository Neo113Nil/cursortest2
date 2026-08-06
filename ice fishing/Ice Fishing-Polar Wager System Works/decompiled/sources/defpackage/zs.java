package defpackage;

/* loaded from: classes.dex */
public final class zs extends defpackage.s21 {
    public final /* synthetic */ defpackage.s21 DFo87pBq1E5;
    public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor SyNS6RMn;

    public zs(defpackage.s21 s21Var, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        this.DFo87pBq1E5 = s21Var;
        this.SyNS6RMn = threadPoolExecutor;
    }

    @Override // defpackage.s21
    public final void XZx205DYe(defpackage.y yVar) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.SyNS6RMn;
        try {
            this.DFo87pBq1E5.XZx205DYe(yVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.s21
    public final void wll2JLbTBC2(java.lang.Throwable th) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.SyNS6RMn;
        try {
            this.DFo87pBq1E5.wll2JLbTBC2(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
