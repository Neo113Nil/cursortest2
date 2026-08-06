package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class h00 {
    public final int AvO7iQsrTN;
    public final long EljAMC1QTz;
    public final String GWasM1elztuh;
    public final g00 JFJ3QoxA;
    public final float OOA6hdeuvCS;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final boolean encWxUiV2;
    public final ArrayList mOu10nynGul;
    public boolean rQPn8YBR;
    public final float xqGvceK5x;

    public h00(String str, boolean z, int i) {
        long j = yb.AvO7iQsrTN;
        z = (i & 128) != 0 ? false : z;
        this.GWasM1elztuh = str;
        this.Yi7zF1RB1 = 24.0f;
        this.X1lG3V04pd = 24.0f;
        this.xqGvceK5x = 24.0f;
        this.OOA6hdeuvCS = 24.0f;
        this.EljAMC1QTz = j;
        this.AvO7iQsrTN = 5;
        this.encWxUiV2 = z;
        ArrayList arrayList = new ArrayList();
        this.mOu10nynGul = arrayList;
        int i2 = pd1.GWasM1elztuh;
        ArrayList arrayList2 = new ArrayList();
        g00 g00Var = new g00();
        g00Var.GWasM1elztuh = xp.OOA6hdeuvCS;
        g00Var.Yi7zF1RB1 = arrayList2;
        this.JFJ3QoxA = g00Var;
        arrayList.add(g00Var);
    }

    public static void GWasM1elztuh(h00 h00Var, ArrayList arrayList, t41 t41Var) {
        if (h00Var.rQPn8YBR) {
            t10.Yi7zF1RB1("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((g00) h00Var.mOu10nynGul.get(r1.size() - 1)).Yi7zF1RB1.add(new sd1(arrayList, t41Var));
    }

    public final i00 Yi7zF1RB1() {
        if (this.rQPn8YBR) {
            t10.Yi7zF1RB1("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.mOu10nynGul;
            if (arrayList.size() <= 1) {
                g00 g00Var = this.JFJ3QoxA;
                g00Var.getClass();
                i00 i00Var = new i00(this.GWasM1elztuh, this.Yi7zF1RB1, this.X1lG3V04pd, this.xqGvceK5x, this.OOA6hdeuvCS, new od1(g00Var.GWasM1elztuh, g00Var.Yi7zF1RB1), this.EljAMC1QTz, this.AvO7iQsrTN, this.encWxUiV2);
                this.rQPn8YBR = true;
                return i00Var;
            }
            if (this.rQPn8YBR) {
                t10.Yi7zF1RB1("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            g00 g00Var2 = (g00) arrayList.remove(arrayList.size() - 1);
            ArrayList arrayList2 = ((g00) arrayList.get(arrayList.size() - 1)).Yi7zF1RB1;
            g00Var2.getClass();
            arrayList2.add(new od1(g00Var2.GWasM1elztuh, g00Var2.Yi7zF1RB1));
        }
    }
}
