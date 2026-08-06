package defpackage;

/* loaded from: classes.dex */
public final class l3 extends defpackage.nj {
    public static final defpackage.le1 G3OKOH3wZRC = new defpackage.le1(defpackage.i1.cnag84Bm);
    public static final defpackage.j3 kd6TUFXn = new defpackage.j3(0);
    public final android.view.Choreographer AARZUJiTa;
    public boolean DFo87pBq1E5;
    public final android.os.Handler EXtogiMhuM;
    public final defpackage.o3 QoRHpC4k;
    public boolean SyNS6RMn;
    public final java.lang.Object riuEU0zW4 = new java.lang.Object();
    public final defpackage.l6 SH1y5HwkJhh = new defpackage.l6();
    public java.util.ArrayList ez2rX8ReCYw = new java.util.ArrayList();
    public java.util.ArrayList JlrlGoKF = new java.util.ArrayList();
    public final defpackage.k3 cnag84Bm = new defpackage.k3(this);

    public l3(android.view.Choreographer choreographer, android.os.Handler handler) {
        this.AARZUJiTa = choreographer;
        this.EXtogiMhuM = handler;
        this.QoRHpC4k = new defpackage.o3(choreographer, this);
    }

    public static final void p4kuH6PDtgom(defpackage.l3 l3Var) {
        java.lang.Runnable runnable;
        boolean z;
        do {
            synchronized (l3Var.riuEU0zW4) {
                defpackage.l6 l6Var = l3Var.SH1y5HwkJhh;
                runnable = (java.lang.Runnable) (l6Var.isEmpty() ? null : l6Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (l3Var.riuEU0zW4) {
                    defpackage.l6 l6Var2 = l3Var.SH1y5HwkJhh;
                    runnable = (java.lang.Runnable) (l6Var2.isEmpty() ? null : l6Var2.removeFirst());
                }
            }
            synchronized (l3Var.riuEU0zW4) {
                if (l3Var.SH1y5HwkJhh.isEmpty()) {
                    z = false;
                    l3Var.DFo87pBq1E5 = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.nj
    public final void v5iciZok(defpackage.lj ljVar, java.lang.Runnable runnable) {
        synchronized (this.riuEU0zW4) {
            this.SH1y5HwkJhh.addLast(runnable);
            if (!this.DFo87pBq1E5) {
                this.DFo87pBq1E5 = true;
                this.EXtogiMhuM.post(this.cnag84Bm);
                if (!this.SyNS6RMn) {
                    this.SyNS6RMn = true;
                    this.AARZUJiTa.postFrameCallback(this.cnag84Bm);
                }
            }
        }
    }
}
