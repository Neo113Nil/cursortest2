package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class oi1 implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ oi1(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
        this.AARZUJiTa = obj2;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.adDC3e2L;
        java.lang.Object obj2 = this.AARZUJiTa;
        java.lang.Object obj3 = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                return new defpackage.jo(5, (defpackage.li1) obj3, (defpackage.gi1) obj2);
            case 1:
                defpackage.el1 el1Var = (defpackage.el1) obj3;
                ((java.lang.Long) obj).getClass();
                float f = el1Var.adDC3e2L;
                el1Var.adDC3e2L = 0.0f;
                ((defpackage.g00) obj2).AARZUJiTa(java.lang.Float.valueOf(f));
                return defpackage.ok1.IHQe1A4L2xu;
            default:
                defpackage.wo1 wo1Var = (defpackage.wo1) obj3;
                android.view.View view = (android.view.View) obj2;
                defpackage.m60 m60Var = wo1Var.V7bD7b8KA;
                if (wo1Var.kNAkVymC == 0) {
                    int i2 = defpackage.mm1.IHQe1A4L2xu;
                    defpackage.hm1.oh6vYeIP(view, m60Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(m60Var);
                    defpackage.mm1.IHQe1A4L2xu(view, m60Var);
                }
                wo1Var.kNAkVymC++;
                return new defpackage.jo(7, wo1Var, view);
        }
    }
}
