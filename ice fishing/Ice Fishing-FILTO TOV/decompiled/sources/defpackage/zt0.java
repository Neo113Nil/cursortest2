package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zt0 {
    public final int GWasM1elztuh;
    public float X1lG3V04pd;
    public final n91 Yi7zF1RB1;

    public zt0(int i, n91 n91Var) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = n91Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object GWasM1elztuh(float f, wg wgVar) {
        yt0 yt0Var;
        int i;
        if (wgVar instanceof yt0) {
            yt0Var = (yt0) wgVar;
            int i2 = yt0Var.JFJ3QoxA;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yt0Var.JFJ3QoxA = i2 - Integer.MIN_VALUE;
                Object obj = yt0Var.encWxUiV2;
                i = yt0Var.JFJ3QoxA;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    Float f2 = new Float(f);
                    yt0Var.JFJ3QoxA = 1;
                    obj = this.Yi7zF1RB1.EljAMC1QTz(f2, yt0Var);
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (obj == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                this.X1lG3V04pd += ((Number) obj).floatValue();
                return kc1.GWasM1elztuh;
            }
        }
        yt0Var = new yt0(this, wgVar);
        Object obj2 = yt0Var.encWxUiV2;
        i = yt0Var.JFJ3QoxA;
        if (i != 0) {
        }
        this.X1lG3V04pd += ((Number) obj2).floatValue();
        return kc1.GWasM1elztuh;
    }
}
