package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class k2 {
    public static final c51 GWasM1elztuh = fb1.J3Xc8BaqpN8(0.0f, 0.0f, null, 7);

    static {
        LinkedHashMap linkedHashMap = hf1.GWasM1elztuh;
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final m51 GWasM1elztuh(float f, ko koVar, String str, qx qxVar, int i) {
        l3 l3Var;
        int i2 = i & 2;
        l3 l3Var2 = GWasM1elztuh;
        l3 l3Var3 = koVar;
        if (i2 != 0) {
            l3Var3 = l3Var2;
        }
        if (l3Var3 == l3Var2) {
            qxVar.MjxSquD6Av(1144115775);
            boolean X1lG3V04pd = qxVar.X1lG3V04pd(0.01f);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (X1lG3V04pd || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = fb1.J3Xc8BaqpN8(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            qxVar.WIEu4Ya2g8(false);
            l3Var = (c51) HFYAaqMd6;
        } else {
            qxVar.MjxSquD6Av(1144225701);
            qxVar.WIEu4Ya2g8(false);
            l3Var = l3Var3;
        }
        return Yi7zF1RB1(Float.valueOf(f), vc0.mOu10nynGul, l3Var, null, str, qxVar, 24576, 0);
    }

    public static final m51 Yi7zF1RB1(Object obj, eb1 eb1Var, l3 l3Var, Float f, String str, qx qxVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        Object obj2 = ue.GWasM1elztuh;
        if (HFYAaqMd6 == obj2) {
            HFYAaqMd6 = z50.WRKkgoJXwDn(null);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
        mg0 mg0Var = (mg0) HFYAaqMd6;
        Object HFYAaqMd62 = qxVar.HFYAaqMd6();
        if (HFYAaqMd62 == obj2) {
            HFYAaqMd62 = new g2(obj, eb1Var, f);
            qxVar.dcDmLGVhzWm(HFYAaqMd62);
        }
        g2 g2Var = (g2) HFYAaqMd62;
        Object pog2g9KITJA = z50.pog2g9KITJA(null, qxVar);
        if (f != null && (l3Var instanceof c51)) {
            c51 c51Var = (c51) l3Var;
            if (!o30.rQPn8YBR(c51Var.X1lG3V04pd, f)) {
                l3Var = new c51(c51Var.GWasM1elztuh, c51Var.Yi7zF1RB1, f);
            }
        }
        Object pog2g9KITJA2 = z50.pog2g9KITJA(l3Var, qxVar);
        Object HFYAaqMd63 = qxVar.HFYAaqMd6();
        if (HFYAaqMd63 == obj2) {
            HFYAaqMd63 = fb1.Yi7zF1RB1(-1, null, 6);
            qxVar.dcDmLGVhzWm(HFYAaqMd63);
        }
        Object obj3 = (z9) HFYAaqMd63;
        boolean encWxUiV2 = qxVar.encWxUiV2(obj3) | qxVar.encWxUiV2(obj);
        Object HFYAaqMd64 = qxVar.HFYAaqMd6();
        if (encWxUiV2 || HFYAaqMd64 == obj2) {
            HFYAaqMd64 = new h2(0, obj3, obj);
            qxVar.dcDmLGVhzWm(HFYAaqMd64);
        }
        ki1.rQPn8YBR((wu) HFYAaqMd64, qxVar);
        boolean encWxUiV22 = qxVar.encWxUiV2(obj3) | qxVar.encWxUiV2(g2Var) | qxVar.EljAMC1QTz(pog2g9KITJA2) | qxVar.EljAMC1QTz(pog2g9KITJA);
        Object HFYAaqMd65 = qxVar.HFYAaqMd6();
        if (encWxUiV22 || HFYAaqMd65 == obj2) {
            Object j2Var = new j2(obj3, g2Var, pog2g9KITJA2, pog2g9KITJA, null, 0);
            qxVar.dcDmLGVhzWm(j2Var);
            HFYAaqMd65 = j2Var;
        }
        ki1.encWxUiV2((lv) HFYAaqMd65, qxVar, obj3);
        m51 m51Var = (m51) mg0Var.getValue();
        return m51Var == null ? g2Var.X1lG3V04pd : m51Var;
    }
}
