package defpackage;

/* loaded from: classes.dex */
public final class j3 extends java.lang.ThreadLocal {
    public final /* synthetic */ int IHQe1A4L2xu;

    public /* synthetic */ j3(int i) {
        this.IHQe1A4L2xu = i;
    }

    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
        switch (this.IHQe1A4L2xu) {
            case 0:
                android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
                android.os.Looper myLooper = android.os.Looper.myLooper();
                if (myLooper != null) {
                    defpackage.l3 l3Var = new defpackage.l3(choreographer, defpackage.gq1.QoRHpC4k(myLooper));
                    return defpackage.ci0.hkbnNdmy(l3Var, l3Var.QoRHpC4k);
                }
                defpackage.db.AARZUJiTa("no Looper on this thread");
                return null;
            default:
                return new java.util.Random();
        }
    }
}
