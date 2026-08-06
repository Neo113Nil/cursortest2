package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ux {
    public final m71 EljAMC1QTz;
    public final ArrayList GWasM1elztuh;
    public final rf0 OOA6hdeuvCS;
    public int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final ArrayList xqGvceK5x;

    public ux(int i, ArrayList arrayList) {
        this.GWasM1elztuh = arrayList;
        this.Yi7zF1RB1 = i;
        if (i < 0) {
            tq0.GWasM1elztuh("Invalid start index");
        }
        this.xqGvceK5x = new ArrayList();
        rf0 rf0Var = new rf0();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            x40 x40Var = (x40) this.GWasM1elztuh.get(i3);
            int i4 = x40Var.X1lG3V04pd;
            int i5 = x40Var.xqGvceK5x;
            rf0Var.encWxUiV2(i4, new zy(i3, i2, i5));
            i2 += i5;
        }
        this.OOA6hdeuvCS = rf0Var;
        this.EljAMC1QTz = new m71(new tx(this));
    }

    public final boolean GWasM1elztuh(int i, int i2) {
        zy zyVar;
        int i3;
        int i4;
        rf0 rf0Var = this.OOA6hdeuvCS;
        zy zyVar2 = (zy) rf0Var.Yi7zF1RB1(i);
        if (zyVar2 == null) {
            return false;
        }
        int i5 = zyVar2.Yi7zF1RB1;
        int i6 = i2 - zyVar2.X1lG3V04pd;
        zyVar2.X1lG3V04pd = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = rf0Var.X1lG3V04pd;
        long[] jArr = rf0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (zyVar = (zy) objArr[(i7 << 3) + i9]).Yi7zF1RB1) >= i5 && zyVar != zyVar2 && (i4 = i3 + i6) >= 0) {
                        zyVar.Yi7zF1RB1 = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
