package defpackage;

/* loaded from: classes.dex */
public final class p7 {
    public final /* synthetic */ int F7NU4MC0GW;
    public final java.util.ArrayList IHQe1A4L2xu;
    public final /* synthetic */ java.lang.Object adDC3e2L;
    public boolean oh6vYeIP;
    public final java.util.concurrent.CopyOnWriteArrayList r1MBDhnF;

    public p7(boolean z) {
        this.IHQe1A4L2xu = new java.util.ArrayList();
        this.oh6vYeIP = z;
        this.r1MBDhnF = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public final void F7NU4MC0GW(boolean z) {
        this.oh6vYeIP = z;
        java.util.ArrayList arrayList = this.IHQe1A4L2xu;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            defpackage.nq0 nq0Var = (defpackage.nq0) obj;
            nq0Var.xiZrDbcSW0(nq0Var.adDC3e2L && z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7(int i, java.lang.Object obj) {
        this(false);
        this.F7NU4MC0GW = i;
        this.adDC3e2L = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p7(defpackage.s1 s1Var) {
        this(true);
        this.F7NU4MC0GW = 2;
        this.adDC3e2L = s1Var;
    }

    public final void IHQe1A4L2xu() {
    }

    public final void oh6vYeIP(defpackage.n7 n7Var) {
    }

    public final void r1MBDhnF(defpackage.n7 n7Var) {
    }
}
