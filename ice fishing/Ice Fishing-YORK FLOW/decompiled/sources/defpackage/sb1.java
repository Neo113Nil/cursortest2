package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sb1 extends defpackage.lc0 implements defpackage.c20 {
    public static final defpackage.sb1 P05cfTpS5W5L;
    public static final defpackage.sb1 QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    static {
        int i = 2;
        QiMR8OkAhezm = new defpackage.sb1(i, 0);
        P05cfTpS5W5L = new defpackage.sb1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb1(int i, int i2) {
        super(i);
        this.oh71FJcDz6S2 = i2;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.oh71FJcDz6S2) {
            case 0:
                defpackage.jb1 jb1Var = (defpackage.jb1) obj2;
                java.lang.Object valueOf = java.lang.Float.valueOf(0.0f);
                defpackage.fb1 fb1Var = ((defpackage.jb1) obj).JhCgjQRTAOCT;
                defpackage.qb1 qb1Var = defpackage.nb1.w7APNrr0aGRc;
                java.lang.Object QiMR8OkAhezm2 = fb1Var.WDYagTQQm9ns.QiMR8OkAhezm(qb1Var);
                if (QiMR8OkAhezm2 == null) {
                    QiMR8OkAhezm2 = valueOf;
                }
                float floatValue = ((java.lang.Number) QiMR8OkAhezm2).floatValue();
                java.lang.Object QiMR8OkAhezm3 = jb1Var.JhCgjQRTAOCT.WDYagTQQm9ns.QiMR8OkAhezm(qb1Var);
                if (QiMR8OkAhezm3 != null) {
                    valueOf = QiMR8OkAhezm3;
                }
                return java.lang.Integer.valueOf(java.lang.Float.compare(floatValue, ((java.lang.Number) valueOf).floatValue()));
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
