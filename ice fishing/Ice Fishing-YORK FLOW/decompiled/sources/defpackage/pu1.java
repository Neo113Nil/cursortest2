package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pu1 implements java.lang.AutoCloseable {
    public final java.lang.String WDYagTQQm9ns;
    public final defpackage.x8 oh71FJcDz6S2;

    public pu1(java.lang.String str, defpackage.x8 x8Var) {
        this.WDYagTQQm9ns = str;
        this.oh71FJcDz6S2 = x8Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        defpackage.s81 s81Var = (defpackage.s81) this.oh71FJcDz6S2.fWTAfUmVKrZq;
        s81Var.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) s81Var.QiMR8OkAhezm;
        defpackage.q81 q81Var = (defpackage.q81) concurrentHashMap.get(this.WDYagTQQm9ns);
        if (q81Var != null) {
            defpackage.a7 a7Var = (defpackage.a7) ((defpackage.x8) s81Var.WDYagTQQm9ns).JhCgjQRTAOCT;
            a7Var.getClass();
            defpackage.b90[] b90VarArr = (defpackage.b90[]) ((java.util.concurrent.ConcurrentHashMap) a7Var.fWTAfUmVKrZq).values().toArray(new defpackage.b90[0]);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (defpackage.b90 b90Var : b90VarArr) {
            }
            java.util.Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                concurrentHashMap.remove(q81Var.giKS3J6vZuNy);
            } else {
                it.next().getClass();
                defpackage.p81.ZpBGe2uQfcn8();
            }
        }
    }
}
