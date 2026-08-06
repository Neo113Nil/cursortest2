package defpackage;

/* loaded from: classes.dex */
public final class lf {
    public final transient java.util.LinkedHashMap F7NU4MC0GW;
    public final java.util.LinkedHashMap adDC3e2L;
    public final java.util.ArrayList r1MBDhnF;
    public final android.os.Bundle xiZrDbcSW0;
    public final java.util.LinkedHashMap IHQe1A4L2xu = new java.util.LinkedHashMap();
    public final java.util.LinkedHashMap oh6vYeIP = new java.util.LinkedHashMap();

    public lf() {
        new java.util.LinkedHashMap();
        this.r1MBDhnF = new java.util.ArrayList();
        this.F7NU4MC0GW = new java.util.LinkedHashMap();
        this.adDC3e2L = new java.util.LinkedHashMap();
        this.xiZrDbcSW0 = new android.os.Bundle();
    }

    public final boolean IHQe1A4L2xu(int i, int i2, android.content.Intent intent) {
        java.lang.String str = (java.lang.String) this.IHQe1A4L2xu.get(java.lang.Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        if (this.F7NU4MC0GW.get(str) != null) {
            defpackage.db.kd6TUFXn();
            return false;
        }
        this.adDC3e2L.remove(str);
        this.xiZrDbcSW0.putParcelable(str, new defpackage.Q1EpAU06IV(intent, i2));
        return true;
    }
}
