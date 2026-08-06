package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class uh implements defpackage.f20 {
    public final /* synthetic */ int WDYagTQQm9ns;

    public /* synthetic */ uh(int i) {
        this.WDYagTQQm9ns = i;
    }

    @Override // defpackage.f20
    public final java.lang.Object Ns0WNyEWdPsk(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        int i;
        int i2;
        int i3 = this.WDYagTQQm9ns;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        switch (i3) {
            case 0:
                defpackage.mk1 mk1Var = (defpackage.mk1) obj;
                defpackage.bk1 bk1Var = (defpackage.bk1) obj2;
                defpackage.n10 n10Var = (defpackage.n10) obj3;
                defpackage.e30 e30Var = (defpackage.e30) obj4;
                int intValue = ((java.lang.Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    i = intValue | ((intValue & 8) == 0 ? e30Var.oh71FJcDz6S2(mk1Var) : e30Var.P05cfTpS5W5L(mk1Var) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= (intValue & 64) == 0 ? e30Var.oh71FJcDz6S2(bk1Var) : e30Var.P05cfTpS5W5L(bk1Var) ? 32 : 16;
                }
                if ((intValue & 384) == 0) {
                    i |= e30Var.P05cfTpS5W5L(n10Var) ? 256 : 128;
                }
                if (!e30Var.zJPqDeoF0Os1(i & 1, (i & 1171) != 1170)) {
                    e30Var.Jkfc0NcwyPL8();
                    break;
                } else {
                    defpackage.qo.fWTAfUmVKrZq(mk1Var, bk1Var, n10Var, e30Var, i & 1022);
                    break;
                }
            case 1:
                defpackage.mk1 mk1Var2 = (defpackage.mk1) obj;
                defpackage.bk1 bk1Var2 = (defpackage.bk1) obj2;
                defpackage.n10 n10Var2 = (defpackage.n10) obj3;
                defpackage.e30 e30Var2 = (defpackage.e30) obj4;
                int intValue2 = ((java.lang.Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | ((intValue2 & 8) == 0 ? e30Var2.oh71FJcDz6S2(mk1Var2) : e30Var2.P05cfTpS5W5L(mk1Var2) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= (intValue2 & 64) == 0 ? e30Var2.oh71FJcDz6S2(bk1Var2) : e30Var2.P05cfTpS5W5L(bk1Var2) ? 32 : 16;
                }
                if ((intValue2 & 384) == 0) {
                    i2 |= e30Var2.P05cfTpS5W5L(n10Var2) ? 256 : 128;
                }
                if (!e30Var2.zJPqDeoF0Os1(i2 & 1, (i2 & 1171) != 1170)) {
                    e30Var2.Jkfc0NcwyPL8();
                    break;
                } else {
                    defpackage.qo.fWTAfUmVKrZq(mk1Var2, bk1Var2, n10Var2, e30Var2, i2 & 1022);
                    break;
                }
            default:
                boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
                long j = ((defpackage.in1) obj5).ZpBGe2uQfcn8;
                java.lang.String obj6 = ((java.lang.CharSequence) obj4).subSequence(defpackage.in1.oh71FJcDz6S2(j), defpackage.in1.WDYagTQQm9ns(j)).toString();
                android.content.Intent putExtra = new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                android.content.pm.ActivityInfo activityInfo = ((android.content.pm.ResolveInfo) obj2).activityInfo;
                android.content.Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((android.content.Context) obj).startActivity(className);
                break;
        }
        return gs1Var;
    }
}
