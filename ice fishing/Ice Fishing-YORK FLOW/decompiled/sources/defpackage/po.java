package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class po implements defpackage.d20 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ po(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }

    @Override // defpackage.d20
    public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.drawable.Icon icon;
        int i = this.WDYagTQQm9ns;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj4 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                long j = ((defpackage.pf) obj).ZpBGe2uQfcn8;
                defpackage.e30 e30Var = (defpackage.e30) obj2;
                int intValue = ((java.lang.Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= e30Var.WDYagTQQm9ns(j) ? 4 : 2;
                }
                if (!e30Var.zJPqDeoF0Os1(intValue & 1, (intValue & 19) != 18)) {
                    e30Var.Jkfc0NcwyPL8();
                    break;
                } else {
                    defpackage.qo.giKS3J6vZuNy(((defpackage.hk1) obj4).fWTAfUmVKrZq, j, e30Var, (intValue << 3) & 112);
                    break;
                }
            case 1:
                long j2 = ((defpackage.pf) obj).ZpBGe2uQfcn8;
                defpackage.e30 e30Var2 = (defpackage.e30) obj2;
                int intValue2 = ((java.lang.Number) obj3).intValue();
                if (!e30Var2.zJPqDeoF0Os1(intValue2 & 1, (intValue2 & 17) != 16)) {
                    e30Var2.Jkfc0NcwyPL8();
                    break;
                } else {
                    defpackage.pa1.h3m55N1URyyK.e6mdH7fiFuta((android.graphics.drawable.Drawable) obj4, e30Var2, 48);
                    break;
                }
            case 2:
                long j3 = ((defpackage.pf) obj).ZpBGe2uQfcn8;
                defpackage.e30 e30Var3 = (defpackage.e30) obj2;
                int intValue3 = ((java.lang.Number) obj3).intValue();
                if (!e30Var3.zJPqDeoF0Os1(intValue3 & 1, (intValue3 & 17) != 16)) {
                    e30Var3.Jkfc0NcwyPL8();
                    break;
                } else {
                    defpackage.pa1 pa1Var = defpackage.pa1.h3m55N1URyyK;
                    icon = ((android.app.RemoteAction) obj4).getIcon();
                    pa1Var.GE9mJIPrb8gP(icon, e30Var3, 48);
                    break;
                }
            default:
                defpackage.e30 e30Var4 = (defpackage.e30) obj2;
                int intValue4 = ((java.lang.Number) obj3).intValue();
                if (!e30Var4.zJPqDeoF0Os1(intValue4 & 1, (intValue4 & 17) != 16)) {
                    e30Var4.Jkfc0NcwyPL8();
                    break;
                } else {
                    ((defpackage.c20) obj4).QiMR8OkAhezm(e30Var4, 0);
                    break;
                }
        }
        return gs1Var;
    }
}
