package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ra {
    public boolean GWasM1elztuh;
    public Object OOA6hdeuvCS;
    public Object X1lG3V04pd;
    public Object Yi7zF1RB1;
    public Object xqGvceK5x;

    /* JADX WARN: Multi-variable type inference failed */
    public int GWasM1elztuh(d dVar, c cVar, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        kz kzVar = (kz) this.X1lG3V04pd;
        nz nzVar = (nz) this.OOA6hdeuvCS;
        if (this.GWasM1elztuh) {
            return 0;
        }
        try {
            this.GWasM1elztuh = true;
            d iwATDS1i01k = ((j6IIN2O8eOU) this.xqGvceK5x).iwATDS1i01k(dVar, cVar);
            qb0 qb0Var = (qb0) iwATDS1i01k.EljAMC1QTz;
            int xqGvceK5x = qb0Var.xqGvceK5x();
            for (int i3 = 0; i3 < xqGvceK5x; i3++) {
                kq0 kq0Var = (kq0) qb0Var.OOA6hdeuvCS(i3);
                if (!kq0Var.xqGvceK5x && !kq0Var.encWxUiV2) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int xqGvceK5x2 = qb0Var.xqGvceK5x();
            for (int i4 = 0; i4 < xqGvceK5x2; i4++) {
                kq0 kq0Var2 = (kq0) qb0Var.OOA6hdeuvCS(i4);
                if (objArr != false || d70.JFJ3QoxA(kq0Var2)) {
                    ((g60) this.Yi7zF1RB1).pog2g9KITJA(kq0Var2.X1lG3V04pd, (nz) this.OOA6hdeuvCS, kq0Var2.mOu10nynGul, true);
                    if (!nzVar.OOA6hdeuvCS.encWxUiV2()) {
                        kzVar.GWasM1elztuh(kq0Var2.GWasM1elztuh, nzVar, d70.JFJ3QoxA(kq0Var2));
                        nzVar.clear();
                    }
                }
            }
            boolean Yi7zF1RB1 = kzVar.Yi7zF1RB1(iwATDS1i01k, z);
            int xqGvceK5x3 = qb0Var.xqGvceK5x();
            int i5 = 0;
            while (true) {
                if (i5 >= xqGvceK5x3) {
                    i = 0;
                    break;
                }
                kq0 kq0Var3 = (kq0) qb0Var.OOA6hdeuvCS(i5);
                if (!uk0.Yi7zF1RB1(d70.EXrPz3p7hFb(kq0Var3, true), 0L) && kq0Var3.Yi7zF1RB1()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int xqGvceK5x4 = qb0Var.xqGvceK5x();
            int i6 = 0;
            while (true) {
                if (i6 >= xqGvceK5x4) {
                    i2 = 0;
                    break;
                }
                if (((kq0) qb0Var.OOA6hdeuvCS(i6)).Yi7zF1RB1()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (Yi7zF1RB1 ? 1 : 0) | (i << 1) | (i2 << 2);
            this.GWasM1elztuh = false;
            return i7;
        } catch (Throwable th) {
            this.GWasM1elztuh = false;
            throw th;
        }
    }

    public void Yi7zF1RB1(int i, int i2) {
        if (i < 0.0f) {
            w10.GWasM1elztuh("Index should be non-negative (" + i + ')');
        }
        ((co0) this.Yi7zF1RB1).encWxUiV2(i);
        t70 t70Var = (t70) this.OOA6hdeuvCS;
        if (i != t70Var.EljAMC1QTz) {
            t70Var.EljAMC1QTz = i;
            int i3 = (i / 30) * 30;
            t70Var.OOA6hdeuvCS.setValue(o50.MZhzXH72(Math.max(i3 - 100, 0), i3 + 130));
        }
        ((co0) this.X1lG3V04pd).encWxUiV2(i2);
    }
}
