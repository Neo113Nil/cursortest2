package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xf0 extends lc0 {
    public final hp0 encWxUiV2;
    public Object mOu10nynGul;

    public xf0(hp0 hp0Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.encWxUiV2 = hp0Var;
        this.mOu10nynGul = obj2;
    }

    @Override // defpackage.lc0, java.util.Map.Entry
    public final Object getValue() {
        return this.mOu10nynGul;
    }

    @Override // defpackage.lc0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.mOu10nynGul;
        this.mOu10nynGul = obj;
        fp0 fp0Var = (fp0) this.encWxUiV2.EljAMC1QTz;
        bp0 bp0Var = fp0Var.encWxUiV2;
        Object obj3 = this.EljAMC1QTz;
        if (!bp0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = fp0Var.AvO7iQsrTN;
        if (!z) {
            bp0Var.put(obj3, obj);
        } else {
            if (!z) {
                o4.E7jCp8Ls();
                return null;
            }
            ab1 ab1Var = fp0Var.OOA6hdeuvCS[fp0Var.EljAMC1QTz];
            Object obj4 = ab1Var.OOA6hdeuvCS[ab1Var.AvO7iQsrTN];
            bp0Var.put(obj3, obj);
            fp0Var.X1lG3V04pd(obj4 != null ? obj4.hashCode() : 0, bp0Var.EljAMC1QTz, obj4, 0);
        }
        fp0Var.rQPn8YBR = bp0Var.encWxUiV2;
        return obj2;
    }
}
