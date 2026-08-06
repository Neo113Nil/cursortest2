package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class o91 extends he0 implements w50 {
    public float WRKkgoJXwDn;
    public g2 WdrkLMV3xh;
    public c51 Y6hRI1cF8;
    public float arNh8D4Z5gB;
    public boolean cilMamHF;
    public boolean jivtDDk9H;
    public g2 lv06NcmrQ;
    public tf0 mE4lRynR;

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        float f = fb1.M3K9sHhK;
        int i = 0;
        int i2 = 1;
        float jivtDDk9H = dd0Var.jivtDDk9H(this.cilMamHF ? fb1.lv06NcmrQ : ((wc0Var.EljAMC1QTz(eg.encWxUiV2(j)) != 0 && wc0Var.J3Xc8BaqpN8(eg.AvO7iQsrTN(j)) != 0) || this.jivtDDk9H) ? l71.GWasM1elztuh : l71.Yi7zF1RB1);
        g2 g2Var = this.WdrkLMV3xh;
        int floatValue = (int) (g2Var != null ? ((Number) g2Var.xqGvceK5x()).floatValue() : jivtDDk9H);
        if (!((floatValue >= 0) & (floatValue >= 0))) {
            v10.GWasM1elztuh("width and height must be >= 0");
        }
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(fg.AvO7iQsrTN(floatValue, floatValue, floatValue, floatValue));
        float jivtDDk9H2 = dd0Var.jivtDDk9H((l71.xqGvceK5x - dd0Var.rASgSCrgZkT7(jivtDDk9H)) / 2.0f);
        float jivtDDk9H3 = dd0Var.jivtDDk9H((l71.X1lG3V04pd - l71.GWasM1elztuh) - l71.OOA6hdeuvCS);
        boolean z = this.cilMamHF;
        if (z && this.jivtDDk9H) {
            jivtDDk9H2 = jivtDDk9H3 - dd0Var.jivtDDk9H(f);
        } else if (z && !this.jivtDDk9H) {
            jivtDDk9H2 = dd0Var.jivtDDk9H(f);
        } else if (this.jivtDDk9H) {
            jivtDDk9H2 = jivtDDk9H3;
        }
        g2 g2Var2 = this.WdrkLMV3xh;
        vg vgVar = null;
        Float f2 = g2Var2 != null ? (Float) g2Var2.OOA6hdeuvCS.getValue() : null;
        if (f2 == null || f2.floatValue() != jivtDDk9H) {
            fb1.MZhzXH72(oFzb77RX3H8t(), null, new n91(this, jivtDDk9H, vgVar, i), 3);
        }
        g2 g2Var3 = this.lv06NcmrQ;
        Float f3 = g2Var3 != null ? (Float) g2Var3.OOA6hdeuvCS.getValue() : null;
        if (f3 == null || f3.floatValue() != jivtDDk9H2) {
            fb1.MZhzXH72(oFzb77RX3H8t(), null, new n91(this, jivtDDk9H2, vgVar, i2), 3);
        }
        if (Float.isNaN(this.arNh8D4Z5gB) && Float.isNaN(this.WRKkgoJXwDn)) {
            this.arNh8D4Z5gB = jivtDDk9H;
            this.WRKkgoJXwDn = jivtDDk9H2;
        }
        return dd0Var.MjxSquD6Av(floatValue, floatValue, yp.OOA6hdeuvCS, new m91(OOA6hdeuvCS, this, jivtDDk9H2));
    }

    @Override // defpackage.he0
    public final boolean UjhVk5crk() {
        return false;
    }

    @Override // defpackage.he0
    public final void cTIXpaxc() {
        fb1.MZhzXH72(oFzb77RX3H8t(), null, new xj(this, (vg) null, 8), 3);
    }
}
