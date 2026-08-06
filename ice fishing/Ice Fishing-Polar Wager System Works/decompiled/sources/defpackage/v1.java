package defpackage;

/* loaded from: classes.dex */
public final class v1 extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ java.util.ArrayList AARZUJiTa;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(int i, java.util.ArrayList arrayList) {
        super(1);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = arrayList;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.xiZrDbcSW0;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.util.ArrayList arrayList = this.AARZUJiTa;
        switch (i) {
            case 0:
                defpackage.av0 av0Var = (defpackage.av0) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    defpackage.av0.JlrlGoKF(av0Var, (defpackage.bv0) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                defpackage.av0 av0Var2 = (defpackage.av0) obj;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    defpackage.av0.SH1y5HwkJhh(av0Var2, (defpackage.bv0) arrayList.get(i3), 0, 0);
                }
                break;
            default:
                defpackage.av0 av0Var3 = (defpackage.av0) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    defpackage.av0.DFo87pBq1E5(av0Var3, (defpackage.bv0) arrayList.get(i4), 0, 0);
                }
                break;
        }
        return ok1Var;
    }
}
