package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class l91 extends me0 {
    public final tf0 GWasM1elztuh;
    public final c51 X1lG3V04pd;
    public final boolean Yi7zF1RB1;

    public l91(tf0 tf0Var, boolean z, c51 c51Var) {
        this.GWasM1elztuh = tf0Var;
        this.Yi7zF1RB1 = z;
        this.X1lG3V04pd = c51Var;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        o91 o91Var = (o91) he0Var;
        o91Var.mE4lRynR = this.GWasM1elztuh;
        boolean z = o91Var.jivtDDk9H;
        boolean z2 = this.Yi7zF1RB1;
        if (z != z2) {
            n4.XnEVoBF0td1l(o91Var);
        }
        o91Var.jivtDDk9H = z2;
        o91Var.Y6hRI1cF8 = this.X1lG3V04pd;
        if (o91Var.WdrkLMV3xh == null && !Float.isNaN(o91Var.arNh8D4Z5gB)) {
            o91Var.WdrkLMV3xh = qj.GWasM1elztuh(o91Var.arNh8D4Z5gB);
        }
        if (o91Var.lv06NcmrQ != null || Float.isNaN(o91Var.WRKkgoJXwDn)) {
            return;
        }
        o91Var.lv06NcmrQ = qj.GWasM1elztuh(o91Var.WRKkgoJXwDn);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l91)) {
            return false;
        }
        l91 l91Var = (l91) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, l91Var.GWasM1elztuh) && this.Yi7zF1RB1 == l91Var.Yi7zF1RB1 && this.X1lG3V04pd.equals(l91Var.X1lG3V04pd);
    }

    public final int hashCode() {
        return this.X1lG3V04pd.hashCode() + mr0.xqGvceK5x(this.GWasM1elztuh.hashCode() * 31, 31, this.Yi7zF1RB1);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.GWasM1elztuh + ", checked=" + this.Yi7zF1RB1 + ", animationSpec=" + this.X1lG3V04pd + ')';
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        o91 o91Var = new o91();
        o91Var.mE4lRynR = this.GWasM1elztuh;
        o91Var.jivtDDk9H = this.Yi7zF1RB1;
        o91Var.Y6hRI1cF8 = this.X1lG3V04pd;
        o91Var.WRKkgoJXwDn = Float.NaN;
        o91Var.arNh8D4Z5gB = Float.NaN;
        return o91Var;
    }
}
