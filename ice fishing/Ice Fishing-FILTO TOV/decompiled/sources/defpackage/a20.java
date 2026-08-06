package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class a20 {
    public final Serializable EljAMC1QTz;
    public final /* synthetic */ int GWasM1elztuh;
    public final sz OOA6hdeuvCS;
    public final sz X1lG3V04pd;
    public final sz Yi7zF1RB1;
    public final sz xqGvceK5x;

    /* JADX WARN: Multi-variable type inference failed */
    public a20(a20[] a20VarArr) {
        int i = 0;
        this.GWasM1elztuh = 0;
        this.EljAMC1QTz = a20VarArr;
        int length = a20VarArr.length;
        sz[] szVarArr = new sz[length];
        for (int i2 = 0; i2 < length; i2++) {
            szVarArr[i2] = ((a20[]) this.EljAMC1QTz)[i2].Yi7zF1RB1();
        }
        int i3 = 1;
        this.Yi7zF1RB1 = new sz(1, new ge1(szVarArr, i));
        int length2 = ((a20[]) this.EljAMC1QTz).length;
        sz[] szVarArr2 = new sz[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            szVarArr2[i4] = ((a20[]) this.EljAMC1QTz)[i4].xqGvceK5x();
        }
        this.X1lG3V04pd = new sz(0, new rz(szVarArr2, i));
        int length3 = ((a20[]) this.EljAMC1QTz).length;
        sz[] szVarArr3 = new sz[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            szVarArr3[i5] = ((a20[]) this.EljAMC1QTz)[i5].X1lG3V04pd();
        }
        this.xqGvceK5x = new sz(1, new ge1(szVarArr3, i3));
        int length4 = ((a20[]) this.EljAMC1QTz).length;
        sz[] szVarArr4 = new sz[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            szVarArr4[i6] = ((a20[]) this.EljAMC1QTz)[i6].GWasM1elztuh();
        }
        this.OOA6hdeuvCS = new sz(0, new rz(szVarArr4, i3));
    }

    public final sz GWasM1elztuh() {
        int i = this.GWasM1elztuh;
        return this.OOA6hdeuvCS;
    }

    public final sz X1lG3V04pd() {
        int i = this.GWasM1elztuh;
        return this.xqGvceK5x;
    }

    public final sz Yi7zF1RB1() {
        int i = this.GWasM1elztuh;
        return this.Yi7zF1RB1;
    }

    public final String toString() {
        int i = this.GWasM1elztuh;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i2 = 0;
                for (a20 a20Var : (a20[]) obj) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    b70.XnEVoBF0td1l(sb, a20Var, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return "RectRulers(" + ((String) obj) + ')';
        }
    }

    public final sz xqGvceK5x() {
        int i = this.GWasM1elztuh;
        return this.X1lG3V04pd;
    }

    public a20(String str) {
        this.GWasM1elztuh = 1;
        this.EljAMC1QTz = str;
        this.Yi7zF1RB1 = new sz(1, null);
        this.X1lG3V04pd = new sz(0, null);
        this.xqGvceK5x = new sz(1, null);
        this.OOA6hdeuvCS = new sz(0, null);
    }
}
