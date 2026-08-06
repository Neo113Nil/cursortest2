package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class m81 {
    public final ArrayList EljAMC1QTz;
    public final l81 GWasM1elztuh;
    public final float OOA6hdeuvCS;
    public final long X1lG3V04pd;
    public final hf0 Yi7zF1RB1;
    public final float xqGvceK5x;

    public m81(l81 l81Var, hf0 hf0Var, long j) {
        this.GWasM1elztuh = l81Var;
        this.Yi7zF1RB1 = hf0Var;
        this.X1lG3V04pd = j;
        ArrayList arrayList = (ArrayList) hf0Var.OOA6hdeuvCS;
        float f = 0.0f;
        this.xqGvceK5x = arrayList.isEmpty() ? 0.0f : ((un0) arrayList.get(0)).GWasM1elztuh.xqGvceK5x.X1lG3V04pd(0);
        if (!arrayList.isEmpty()) {
            un0 un0Var = (un0) rb.vaTCmWUgXF(arrayList);
            f = un0Var.GWasM1elztuh.xqGvceK5x.X1lG3V04pd(r4.EljAMC1QTz - 1) + un0Var.EljAMC1QTz;
        }
        this.OOA6hdeuvCS = f;
        this.EljAMC1QTz = (ArrayList) hf0Var.xqGvceK5x;
    }

    public final int GWasM1elztuh(int i) {
        hf0 hf0Var = this.Yi7zF1RB1;
        ArrayList arrayList = (ArrayList) hf0Var.OOA6hdeuvCS;
        un0 un0Var = (un0) arrayList.get(i >= ((u3) ((v5) hf0Var.X1lG3V04pd).GWasM1elztuh).EljAMC1QTz.length() ? fb1.EXrPz3p7hFb(arrayList) : i < 0 ? 0 : l60.XnEVoBF0td1l(i, arrayList));
        return un0Var.GWasM1elztuh.xqGvceK5x.EljAMC1QTz(un0Var.GWasM1elztuh(i)) + un0Var.xqGvceK5x;
    }

    public final pu0 OOA6hdeuvCS(int i) {
        hf0 hf0Var = this.Yi7zF1RB1;
        u3 u3Var = (u3) ((v5) hf0Var.X1lG3V04pd).GWasM1elztuh;
        if (i < 0 || i > u3Var.EljAMC1QTz.length()) {
            StringBuilder rQPn8YBR = mr0.rQPn8YBR("offset(", i, ") is out of bounds [0, ");
            rQPn8YBR.append(u3Var.EljAMC1QTz.length());
            rQPn8YBR.append(']');
            u10.GWasM1elztuh(rQPn8YBR.toString());
        }
        int length = ((u3) ((v5) hf0Var.X1lG3V04pd).GWasM1elztuh).EljAMC1QTz.length();
        ArrayList arrayList = (ArrayList) hf0Var.OOA6hdeuvCS;
        un0 un0Var = (un0) arrayList.get(i == length ? fb1.EXrPz3p7hFb(arrayList) : l60.XnEVoBF0td1l(i, arrayList));
        c1 c1Var = un0Var.GWasM1elztuh;
        int GWasM1elztuh = un0Var.GWasM1elztuh(i);
        k81 k81Var = c1Var.xqGvceK5x;
        return k81Var.OOA6hdeuvCS.getParagraphDirection(k81Var.EljAMC1QTz(GWasM1elztuh)) == 1 ? pu0.OOA6hdeuvCS : pu0.EljAMC1QTz;
    }

    public final int X1lG3V04pd(int i) {
        hf0 hf0Var = this.Yi7zF1RB1;
        hf0Var.Yi7zF1RB1(i);
        ArrayList arrayList = (ArrayList) hf0Var.OOA6hdeuvCS;
        un0 un0Var = (un0) arrayList.get(l60.uFEq9NpZ(i, arrayList));
        c1 c1Var = un0Var.GWasM1elztuh;
        return c1Var.xqGvceK5x.OOA6hdeuvCS.getLineStart(i - un0Var.xqGvceK5x) + un0Var.Yi7zF1RB1;
    }

    public final int Yi7zF1RB1(float f) {
        int i;
        int i2;
        ArrayList arrayList = (ArrayList) this.Yi7zF1RB1.OOA6hdeuvCS;
        int i3 = 0;
        if (f > 0.0f) {
            if (f < ((un0) rb.vaTCmWUgXF(arrayList)).AvO7iQsrTN) {
                int size = arrayList.size() - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > size) {
                        i = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + size) >>> 1;
                    un0 un0Var = (un0) arrayList.get(i5);
                    char c = un0Var.EljAMC1QTz > f ? (char) 1 : un0Var.AvO7iQsrTN <= f ? (char) 65535 : (char) 0;
                    if (c >= 0) {
                        if (c <= 0) {
                            i = i5;
                            break;
                        }
                        size = i5 - 1;
                    } else {
                        i4 = i5 + 1;
                    }
                }
            } else {
                i = arrayList.size() - 1;
            }
        } else {
            i = 0;
        }
        un0 un0Var2 = (un0) arrayList.get(i);
        int i6 = un0Var2.X1lG3V04pd;
        int i7 = un0Var2.xqGvceK5x;
        if (i6 - un0Var2.Yi7zF1RB1 == 0) {
            return i7;
        }
        c1 c1Var = un0Var2.GWasM1elztuh;
        float f2 = f - un0Var2.EljAMC1QTz;
        k81 k81Var = c1Var.xqGvceK5x;
        int i8 = (int) f2;
        int i9 = k81Var.EljAMC1QTz;
        if (i9 > 0 && (i3 = k81Var.OOA6hdeuvCS.getLineForVertical(i8 - k81Var.AvO7iQsrTN)) > i9 - 1) {
            i3 = i2;
        }
        return i3 + i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m81) {
            m81 m81Var = (m81) obj;
            if (o30.rQPn8YBR(this.GWasM1elztuh, m81Var.GWasM1elztuh) && this.Yi7zF1RB1 == m81Var.Yi7zF1RB1 && b30.GWasM1elztuh(this.X1lG3V04pd, m81Var.X1lG3V04pd) && this.xqGvceK5x == m81Var.xqGvceK5x && this.OOA6hdeuvCS == m81Var.OOA6hdeuvCS && o30.rQPn8YBR(this.EljAMC1QTz, m81Var.EljAMC1QTz)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.EljAMC1QTz.hashCode() + mr0.GWasM1elztuh(this.OOA6hdeuvCS, mr0.GWasM1elztuh(this.xqGvceK5x, mr0.X1lG3V04pd((this.Yi7zF1RB1.hashCode() + (this.GWasM1elztuh.hashCode() * 31)) * 31, 31, this.X1lG3V04pd), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.GWasM1elztuh + ", multiParagraph=" + this.Yi7zF1RB1 + ", size=" + ((Object) b30.Yi7zF1RB1(this.X1lG3V04pd)) + ", firstBaseline=" + this.xqGvceK5x + ", lastBaseline=" + this.OOA6hdeuvCS + ", placeholderRects=" + this.EljAMC1QTz + ')';
    }

    public final float xqGvceK5x(int i) {
        hf0 hf0Var = this.Yi7zF1RB1;
        hf0Var.Yi7zF1RB1(i);
        ArrayList arrayList = (ArrayList) hf0Var.OOA6hdeuvCS;
        un0 un0Var = (un0) arrayList.get(l60.uFEq9NpZ(i, arrayList));
        c1 c1Var = un0Var.GWasM1elztuh;
        return c1Var.xqGvceK5x.AvO7iQsrTN(i - un0Var.xqGvceK5x) + un0Var.EljAMC1QTz;
    }
}
