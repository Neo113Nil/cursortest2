package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jw0 implements iw0 {
    public static final d mOu10nynGul = new d(19, new pd(23), new oh0(11));
    public kw0 AvO7iQsrTN;
    public final hg0 EljAMC1QTz;
    public final Map OOA6hdeuvCS;
    public final E7jCp8Ls encWxUiV2;

    public jw0(Map map) {
        this.OOA6hdeuvCS = map;
        long[] jArr = kx0.GWasM1elztuh;
        this.EljAMC1QTz = new hg0();
        this.encWxUiV2 = new E7jCp8Ls(15, this);
    }

    @Override // defpackage.iw0
    public final void X1lG3V04pd(Object obj) {
        if (this.EljAMC1QTz.rQPn8YBR(obj) == null) {
            this.OOA6hdeuvCS.remove(obj);
        }
    }

    @Override // defpackage.iw0
    public final void Yi7zF1RB1(Object obj, jd jdVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(533563200);
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
            qxVar.Fm8W7vP7q(obj);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            k61 k61Var = ue.GWasM1elztuh;
            if (HFYAaqMd6 == k61Var) {
                E7jCp8Ls e7jCp8Ls = this.encWxUiV2;
                if (!((Boolean) e7jCp8Ls.mOu10nynGul(obj)).booleanValue()) {
                    o4.iwATDS1i01k("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.OOA6hdeuvCS.get(obj);
                v51 v51Var = nw0.GWasM1elztuh;
                ow0 ow0Var = new ow0(new lw0(map, e7jCp8Ls));
                qxVar.dcDmLGVhzWm(ow0Var);
                HFYAaqMd6 = ow0Var;
            }
            ow0 ow0Var2 = (ow0) HFYAaqMd6;
            vc0.xqGvceK5x(new qs0[]{nw0.GWasM1elztuh.GWasM1elztuh(ow0Var2), db0.GWasM1elztuh.GWasM1elztuh(ow0Var2)}, jdVar, qxVar, (i2 & 112) | 8);
            boolean encWxUiV2 = qxVar.encWxUiV2(this) | qxVar.encWxUiV2(obj) | qxVar.encWxUiV2(ow0Var2);
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (encWxUiV2 || HFYAaqMd62 == k61Var) {
                HFYAaqMd62 = new d2(this, obj, ow0Var2, 6);
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
            }
            ki1.EljAMC1QTz(kc1.GWasM1elztuh, (hv) HFYAaqMd62, qxVar);
            if (qxVar.WRKkgoJXwDn && qxVar.YZjbz8VdP5.mOu10nynGul == qxVar.arNh8D4Z5gB) {
                qxVar.arNh8D4Z5gB = -1;
                qxVar.WRKkgoJXwDn = false;
            }
            qxVar.WIEu4Ya2g8(false);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new u7(this, obj, jdVar, i, 7);
        }
    }
}
