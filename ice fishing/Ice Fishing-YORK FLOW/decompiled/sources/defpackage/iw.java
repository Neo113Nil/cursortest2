package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class iw implements defpackage.c20 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.fo0 oh71FJcDz6S2;

    public /* synthetic */ iw(defpackage.fo0 fo0Var, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = fo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    @Override // defpackage.c20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        float min;
        int i = this.WDYagTQQm9ns;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.fo0 fo0Var = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.q90 q90Var = (defpackage.q90) obj;
                defpackage.q90 q90Var2 = (defpackage.q90) obj2;
                int i2 = q90Var2.ZpBGe2uQfcn8;
                int i3 = q90Var2.JhCgjQRTAOCT;
                int i4 = q90Var2.fWTAfUmVKrZq;
                int i5 = q90Var2.giKS3J6vZuNy;
                int i6 = q90Var.fWTAfUmVKrZq;
                int i7 = q90Var.giKS3J6vZuNy;
                int i8 = q90Var.JhCgjQRTAOCT;
                int i9 = q90Var.ZpBGe2uQfcn8;
                float f = 1.0f;
                if (i2 < i6) {
                    if (i4 <= i9) {
                        min = 1.0f;
                    } else if (q90Var2.fWTAfUmVKrZq() != 0) {
                        min = (((java.lang.Math.min(q90Var.fWTAfUmVKrZq, i4) + java.lang.Math.max(i9, i2)) / 2) - i2) / q90Var2.fWTAfUmVKrZq();
                    }
                    if (i5 < i8) {
                        if (i3 > i7) {
                            if (q90Var2.giKS3J6vZuNy() != 0) {
                                f = (((java.lang.Math.min(i8, i3) + java.lang.Math.max(i7, i5)) / 2) - i5) / q90Var2.giKS3J6vZuNy();
                            }
                        }
                        fo0Var.setValue(new defpackage.zo1(defpackage.j80.WDYagTQQm9ns(min, f)));
                        break;
                    }
                    f = 0.0f;
                    fo0Var.setValue(new defpackage.zo1(defpackage.j80.WDYagTQQm9ns(min, f)));
                }
                min = 0.0f;
                if (i5 < i8) {
                }
                f = 0.0f;
                fo0Var.setValue(new defpackage.zo1(defpackage.j80.WDYagTQQm9ns(min, f)));
            case 1:
                defpackage.e30 e30Var = (defpackage.e30) obj;
                int intValue = ((java.lang.Integer) obj2).intValue();
                if (!e30Var.zJPqDeoF0Os1(intValue & 1, (intValue & 3) != 2)) {
                    e30Var.Jkfc0NcwyPL8();
                    break;
                } else {
                    defpackage.mw.ZpBGe2uQfcn8.ZpBGe2uQfcn8(((java.lang.Boolean) fo0Var.getValue()).booleanValue(), null, e30Var, 384);
                    break;
                }
            default:
                defpackage.e30 e30Var2 = (defpackage.e30) obj;
                int intValue2 = ((java.lang.Integer) obj2).intValue();
                if (!e30Var2.zJPqDeoF0Os1(intValue2 & 1, (intValue2 & 3) != 2)) {
                    e30Var2.Jkfc0NcwyPL8();
                    break;
                } else {
                    defpackage.mw.ZpBGe2uQfcn8.ZpBGe2uQfcn8(((java.lang.Boolean) fo0Var.getValue()).booleanValue(), null, e30Var2, 384);
                    break;
                }
        }
        return gs1Var;
    }
}
