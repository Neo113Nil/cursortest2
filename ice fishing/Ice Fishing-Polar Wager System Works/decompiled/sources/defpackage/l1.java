package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ l1(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
        this.AARZUJiTa = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.AARZUJiTa;
        java.lang.Object obj2 = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.gq1.EgCjBq0SZwJ((defpackage.o1) obj2, (android.util.LongSparseArray) obj);
                return;
            case 1:
                com.corsair.ledger.MainActivity mainActivity = (com.corsair.ledger.MainActivity) obj2;
                mainActivity.adDC3e2L.IHQe1A4L2xu(new defpackage.ef((defpackage.tq0) obj, mainActivity));
                return;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yh1 yh1Var = (defpackage.yh1) obj;
                try {
                    ((java.lang.Runnable) obj2).run();
                    return;
                } finally {
                    yh1Var.IHQe1A4L2xu();
                }
            default:
                defpackage.aq1 aq1Var = (defpackage.aq1) obj2;
                defpackage.xd0 xd0Var = (defpackage.xd0) obj;
                if (aq1Var.AARZUJiTa) {
                    return;
                }
                aq1Var.EXtogiMhuM = xd0Var;
                xd0Var.IHQe1A4L2xu(aq1Var);
                return;
        }
    }
}
