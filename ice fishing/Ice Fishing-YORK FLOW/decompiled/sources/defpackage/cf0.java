package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class cf0 implements defpackage.y10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.ff0 oh71FJcDz6S2;

    public /* synthetic */ cf0(defpackage.ff0 ff0Var, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = ff0Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        defpackage.ff0 ff0Var = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.jf0 jf0Var = (defpackage.jf0) ff0Var.BHfvd2J71qpO.ZpBGe2uQfcn8();
                int fWTAfUmVKrZq = jf0Var.fWTAfUmVKrZq();
                int i2 = 0;
                while (true) {
                    if (i2 >= fWTAfUmVKrZq) {
                        i2 = -1;
                    } else if (!jf0Var.JhCgjQRTAOCT(i2).equals(obj)) {
                        i2++;
                    }
                }
                return java.lang.Integer.valueOf(i2);
            default:
                int intValue = ((java.lang.Integer) obj).intValue();
                defpackage.jf0 jf0Var2 = (defpackage.jf0) ff0Var.BHfvd2J71qpO.ZpBGe2uQfcn8();
                if (intValue < 0 || intValue >= jf0Var2.fWTAfUmVKrZq()) {
                    java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    h3m55N1URyyK.append(jf0Var2.fWTAfUmVKrZq());
                    h3m55N1URyyK.append(')');
                    defpackage.h80.ZpBGe2uQfcn8(h3m55N1URyyK.toString());
                }
                defpackage.ok0.zJPqDeoF0Os1(ff0Var.XuMcJunjB8iA(), null, new defpackage.ef0(ff0Var, intValue, null), 3);
                return java.lang.Boolean.TRUE;
        }
    }
}
