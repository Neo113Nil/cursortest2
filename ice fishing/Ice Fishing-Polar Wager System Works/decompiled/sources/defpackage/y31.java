package defpackage;

/* loaded from: classes.dex */
public final class y31 {
    public final java.util.LinkedHashMap IHQe1A4L2xu;
    public final defpackage.m7 oh6vYeIP;

    public y31() {
        this.IHQe1A4L2xu = new java.util.LinkedHashMap();
        this.oh6vYeIP = new defpackage.m7(defpackage.ot.adDC3e2L);
    }

    public final java.lang.Object IHQe1A4L2xu(java.lang.String str) {
        java.lang.Object value;
        defpackage.m7 m7Var = this.oh6vYeIP;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) m7Var.IHQe1A4L2xu;
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) m7Var.F7NU4MC0GW;
        try {
            defpackage.hc1 hc1Var = (defpackage.hc1) linkedHashMap2.get(str);
            if (hc1Var != null && (value = hc1Var.getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (java.lang.ClassCastException unused) {
            linkedHashMap.remove(str);
            ((java.util.LinkedHashMap) m7Var.r1MBDhnF).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public y31(defpackage.rg0 rg0Var) {
        this.IHQe1A4L2xu = new java.util.LinkedHashMap();
        this.oh6vYeIP = new defpackage.m7(rg0Var);
    }
}
