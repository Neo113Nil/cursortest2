package defpackage;

/* loaded from: classes.dex */
public final class bn1 {
    public final java.util.LinkedHashMap IHQe1A4L2xu = new java.util.LinkedHashMap();

    public final void IHQe1A4L2xu() {
        java.util.LinkedHashMap linkedHashMap = this.IHQe1A4L2xu;
        java.util.Map XZx205DYe = defpackage.yh0.XZx205DYe(linkedHashMap);
        linkedHashMap.clear();
        java.util.Iterator it = XZx205DYe.values().iterator();
        while (it.hasNext()) {
            ((defpackage.vm1) it.next()).oh6vYeIP();
        }
    }

    public final java.lang.String toString() {
        java.lang.String r1MBDhnF = defpackage.sz0.IHQe1A4L2xu(defpackage.bn1.class).r1MBDhnF();
        if (r1MBDhnF == null) {
            r1MBDhnF = "ViewModelStore";
        }
        int hashCode = hashCode();
        defpackage.x70.G3OKOH3wZRC(16);
        java.lang.String num = java.lang.Integer.toString(hashCode, 16);
        num.getClass();
        return r1MBDhnF + "@" + num + "(keys=" + defpackage.td.FisHbM7NmV(this.IHQe1A4L2xu.keySet()) + ")";
    }
}
