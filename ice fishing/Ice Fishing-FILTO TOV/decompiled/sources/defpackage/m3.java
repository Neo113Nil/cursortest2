package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class m3 implements m51 {
    public r3 AvO7iQsrTN;
    public final fo0 EljAMC1QTz;
    public boolean JFJ3QoxA;
    public final eb1 OOA6hdeuvCS;
    public long encWxUiV2;
    public long mOu10nynGul;

    public m3(eb1 eb1Var, Object obj, r3 r3Var, long j, long j2, boolean z) {
        r3 r3Var2;
        this.OOA6hdeuvCS = eb1Var;
        this.EljAMC1QTz = z50.WRKkgoJXwDn(obj);
        if (r3Var != null) {
            r3Var2 = p.mOu10nynGul(r3Var);
        } else {
            r3Var2 = (r3) eb1Var.GWasM1elztuh.mOu10nynGul(obj);
            r3Var2.xqGvceK5x();
        }
        this.AvO7iQsrTN = r3Var2;
        this.encWxUiV2 = j;
        this.mOu10nynGul = j2;
        this.JFJ3QoxA = z;
    }

    @Override // defpackage.m51
    public final Object getValue() {
        return this.EljAMC1QTz.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.EljAMC1QTz.getValue() + ", velocity=" + this.OOA6hdeuvCS.Yi7zF1RB1.mOu10nynGul(this.AvO7iQsrTN) + ", isRunning=" + this.JFJ3QoxA + ", lastFrameTimeNanos=" + this.encWxUiV2 + ", finishedTimeNanos=" + this.mOu10nynGul + ')';
    }

    public /* synthetic */ m3(eb1 eb1Var, Object obj, r3 r3Var, int i) {
        this(eb1Var, obj, (i & 4) != 0 ? null : r3Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
