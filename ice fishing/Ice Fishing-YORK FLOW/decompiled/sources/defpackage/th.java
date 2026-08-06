package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class th implements defpackage.i20 {
    @Override // defpackage.i20
    public final java.lang.Object giKS3J6vZuNy(java.lang.Object obj, java.lang.Boolean bool, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, defpackage.e30 e30Var, java.lang.Integer num) {
        int i;
        java.lang.String str = (java.lang.String) obj;
        boolean booleanValue = bool.booleanValue();
        defpackage.dl dlVar = (defpackage.dl) obj2;
        defpackage.d20 d20Var = (defpackage.d20) obj3;
        defpackage.n10 n10Var = (defpackage.n10) obj4;
        int intValue = num.intValue();
        int i2 = intValue & 6;
        defpackage.sl0 sl0Var = defpackage.sl0.ZpBGe2uQfcn8;
        if (i2 == 0) {
            i = (e30Var.oh71FJcDz6S2(sl0Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= e30Var.oh71FJcDz6S2(str) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= e30Var.QiMR8OkAhezm(booleanValue) ? 256 : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= e30Var.oh71FJcDz6S2(dlVar) ? 2048 : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= e30Var.P05cfTpS5W5L(d20Var) ? 16384 : 8192;
        }
        if ((intValue & 196608) == 0) {
            i |= e30Var.P05cfTpS5W5L(n10Var) ? 131072 : 65536;
        }
        if (e30Var.zJPqDeoF0Os1(i & 1, (599187 & i) != 599186)) {
            defpackage.il.fWTAfUmVKrZq(str, booleanValue, dlVar, sl0Var, d20Var, n10Var, e30Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
