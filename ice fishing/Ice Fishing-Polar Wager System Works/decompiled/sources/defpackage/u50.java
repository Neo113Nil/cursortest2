package defpackage;

/* loaded from: classes.dex */
public final class u50 {
    public final java.util.LinkedHashMap IHQe1A4L2xu;

    public u50(int i) {
        switch (i) {
            case 1:
                this.IHQe1A4L2xu = new java.util.LinkedHashMap(0, 0.75f, true);
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                this.IHQe1A4L2xu = new java.util.LinkedHashMap();
                break;
            default:
                this.IHQe1A4L2xu = new java.util.LinkedHashMap();
                break;
        }
    }

    public void IHQe1A4L2xu(defpackage.xc xcVar, defpackage.g00 g00Var) {
        g00Var.getClass();
        java.util.LinkedHashMap linkedHashMap = this.IHQe1A4L2xu;
        if (linkedHashMap.containsKey(xcVar)) {
            defpackage.db.adDC3e2L(defpackage.fx0.ez2rX8ReCYw("A `initializer` with the same `clazz` has already been added: ", xcVar.oh6vYeIP(), "."));
        } else {
            linkedHashMap.put(xcVar, new defpackage.xm1(xcVar, g00Var));
        }
    }

    public defpackage.QuX7t5UZl9 oh6vYeIP() {
        java.util.Collection values = this.IHQe1A4L2xu.values();
        values.getClass();
        defpackage.xm1[] xm1VarArr = (defpackage.xm1[]) values.toArray(new defpackage.xm1[0]);
        return new defpackage.QuX7t5UZl9(2, (defpackage.xm1[]) java.util.Arrays.copyOf(xm1VarArr, xm1VarArr.length));
    }
}
