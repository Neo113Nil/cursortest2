package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements Comparator {
    public final /* synthetic */ int GWasM1elztuh;

    public /* synthetic */ l1(int i) {
        this.GWasM1elztuh = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.GWasM1elztuh) {
            case 0:
                return o30.uFEq9NpZ(((zr0) obj2).GWasM1elztuh, ((zr0) obj).GWasM1elztuh);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return o30.uFEq9NpZ(((y30) obj).Yi7zF1RB1, ((y30) obj2).Yi7zF1RB1);
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                x20 x20Var = (x20) obj;
                x20 x20Var2 = (x20) obj2;
                return (x20Var.EljAMC1QTz - x20Var.OOA6hdeuvCS) - (x20Var2.EljAMC1QTz - x20Var2.OOA6hdeuvCS);
            case 4:
                g60 g60Var = (g60) obj;
                g60 g60Var2 = (g60) obj2;
                float f = g60Var.MZhzXH72.WIEu4Ya2g8.A1EKNP6CxJ;
                float f2 = g60Var2.MZhzXH72.WIEu4Ya2g8.A1EKNP6CxJ;
                return f == f2 ? o30.uFEq9NpZ(g60Var.lv06NcmrQ(), g60Var2.lv06NcmrQ()) : Float.compare(f, f2);
            default:
                return o30.uFEq9NpZ(((q80) obj).GWasM1elztuh, ((q80) obj2).GWasM1elztuh);
        }
    }
}
