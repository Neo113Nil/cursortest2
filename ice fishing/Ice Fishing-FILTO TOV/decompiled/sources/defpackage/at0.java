package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class at0 {
    public hg0 AvO7iQsrTN;
    public zf0 EljAMC1QTz;
    public df GWasM1elztuh;
    public int OOA6hdeuvCS;
    public lx X1lG3V04pd;
    public int Yi7zF1RB1;
    public lv xqGvceK5x;

    public at0(df dfVar) {
        this.GWasM1elztuh = dfVar;
    }

    public final boolean GWasM1elztuh() {
        if (this.GWasM1elztuh != null) {
            lx lxVar = this.X1lG3V04pd;
            if (lxVar != null ? lxVar.GWasM1elztuh() : false) {
                return true;
            }
        }
        return false;
    }

    public final void X1lG3V04pd() {
        df dfVar = this.GWasM1elztuh;
        if (dfVar != null) {
            dfVar.mE4lRynR = true;
            dfVar.WdrkLMV3xh.X1lG3V04pd();
        }
        this.GWasM1elztuh = null;
        this.EljAMC1QTz = null;
        this.AvO7iQsrTN = null;
        this.xqGvceK5x = null;
    }

    public final z30 Yi7zF1RB1(Object obj) {
        z30 mE4lRynR;
        df dfVar = this.GWasM1elztuh;
        return (dfVar == null || (mE4lRynR = dfVar.mE4lRynR(this, obj)) == null) ? z30.OOA6hdeuvCS : mE4lRynR;
    }

    public final void xqGvceK5x(boolean z) {
        int i = this.Yi7zF1RB1;
        this.Yi7zF1RB1 = z ? i | 32 : i & (-33);
    }
}
