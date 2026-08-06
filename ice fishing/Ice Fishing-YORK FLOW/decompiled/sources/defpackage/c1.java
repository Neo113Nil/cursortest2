package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class c1 extends defpackage.lc0 implements defpackage.y10 {
    public final /* synthetic */ java.util.ArrayList QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i, java.util.ArrayList arrayList) {
        super(1);
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = arrayList;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.oh71FJcDz6S2;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.util.ArrayList arrayList = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                defpackage.qy0 qy0Var = (defpackage.qy0) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    defpackage.qy0.GE9mJIPrb8gP(qy0Var, (defpackage.ry0) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                defpackage.qy0 qy0Var2 = (defpackage.qy0) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        defpackage.qy0.GE9mJIPrb8gP(qy0Var2, (defpackage.ry0) arrayList.get(i3), 0, 0);
                        if (i3 == size2) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                break;
            case 2:
                defpackage.qy0 qy0Var3 = (defpackage.qy0) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    defpackage.qy0.QiMR8OkAhezm(qy0Var3, (defpackage.ry0) arrayList.get(i4), 0, 0);
                }
                break;
            default:
                defpackage.qy0 qy0Var4 = (defpackage.qy0) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    defpackage.qy0.Ns0WNyEWdPsk(qy0Var4, (defpackage.ry0) arrayList.get(i5), 0, 0);
                }
                break;
        }
        return gs1Var;
    }
}
