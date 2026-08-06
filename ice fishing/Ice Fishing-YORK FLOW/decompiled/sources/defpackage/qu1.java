package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qu1 {
    public final java.util.LinkedHashMap ZpBGe2uQfcn8 = new java.util.LinkedHashMap();

    public final void ZpBGe2uQfcn8() {
        java.util.LinkedHashMap linkedHashMap = this.ZpBGe2uQfcn8;
        java.util.Map OVwOqzUGHcCU = defpackage.jk0.OVwOqzUGHcCU(linkedHashMap);
        linkedHashMap.clear();
        java.util.Iterator it = OVwOqzUGHcCU.values().iterator();
        while (it.hasNext()) {
            ((defpackage.iu1) it.next()).giKS3J6vZuNy();
        }
    }

    public final java.lang.String toString() {
        java.lang.String fWTAfUmVKrZq = defpackage.b41.ZpBGe2uQfcn8(defpackage.qu1.class).fWTAfUmVKrZq();
        if (fWTAfUmVKrZq == null) {
            fWTAfUmVKrZq = "ViewModelStore";
        }
        int hashCode = hashCode();
        defpackage.jr0.XntWc4eZSQ8j(16);
        java.lang.String num = java.lang.Integer.toString(hashCode, 16);
        num.getClass();
        return fWTAfUmVKrZq + "@" + num + "(keys=" + defpackage.hf.RIHPIrzkudeW(this.ZpBGe2uQfcn8.keySet()) + ")";
    }
}
