package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class x80 implements kw0, iw0 {
    public final ig0 AvO7iQsrTN;
    public final iw0 EljAMC1QTz;
    public final lw0 OOA6hdeuvCS;

    public x80(kw0 kw0Var, Map map, iw0 iw0Var) {
        E7jCp8Ls e7jCp8Ls = new E7jCp8Ls(9, kw0Var);
        v51 v51Var = nw0.GWasM1elztuh;
        this.OOA6hdeuvCS = new lw0(map, e7jCp8Ls);
        this.EljAMC1QTz = iw0Var;
        ig0 ig0Var = lx0.GWasM1elztuh;
        this.AvO7iQsrTN = new ig0();
    }

    @Override // defpackage.kw0
    public final Object EljAMC1QTz(String str) {
        return this.OOA6hdeuvCS.EljAMC1QTz(str);
    }

    @Override // defpackage.kw0
    public final f4 GWasM1elztuh(String str, wu wuVar) {
        return this.OOA6hdeuvCS.GWasM1elztuh(str, wuVar);
    }

    @Override // defpackage.kw0
    public final Map OOA6hdeuvCS() {
        ig0 ig0Var = this.AvO7iQsrTN;
        Object[] objArr = ig0Var.Yi7zF1RB1;
        long[] jArr = ig0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.EljAMC1QTz.X1lG3V04pd(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.OOA6hdeuvCS.OOA6hdeuvCS();
    }

    @Override // defpackage.iw0
    public final void X1lG3V04pd(Object obj) {
        this.EljAMC1QTz.X1lG3V04pd(obj);
    }

    @Override // defpackage.iw0
    public final void Yi7zF1RB1(Object obj, jd jdVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(-858296452);
        if ((i & 6) == 0) {
            i2 = (qxVar.encWxUiV2(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.encWxUiV2(jdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qxVar.encWxUiV2(this) ? 256 : 128;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 147) != 146)) {
            this.EljAMC1QTz.Yi7zF1RB1(obj, jdVar, qxVar, i2 & 126);
            boolean encWxUiV2 = qxVar.encWxUiV2(this) | qxVar.encWxUiV2(obj);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (encWxUiV2 || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new X1lG3V04pd(11, this, obj);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            ki1.EljAMC1QTz(obj, (hv) HFYAaqMd6, qxVar);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new u7(this, obj, jdVar, i, 3);
        }
    }

    @Override // defpackage.kw0
    public final boolean xqGvceK5x(Object obj) {
        return this.OOA6hdeuvCS.xqGvceK5x(obj);
    }
}
