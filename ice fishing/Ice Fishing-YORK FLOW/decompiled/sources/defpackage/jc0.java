package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jc0 implements defpackage.mu1 {
    public final defpackage.ne ZpBGe2uQfcn8;
    public final defpackage.q81 giKS3J6vZuNy;

    public jc0(defpackage.ne neVar, defpackage.q81 q81Var) {
        this.ZpBGe2uQfcn8 = neVar;
        this.giKS3J6vZuNy = q81Var;
    }

    @Override // defpackage.mu1
    public final defpackage.iu1 fWTAfUmVKrZq(defpackage.ne neVar, defpackage.dn0 dn0Var) {
        defpackage.r2 r2Var = new defpackage.r2(dn0Var);
        defpackage.x8 x8Var = this.giKS3J6vZuNy.WDYagTQQm9ns;
        defpackage.k0 k0Var = (defpackage.k0) x8Var.WDYagTQQm9ns;
        k0Var.getClass();
        java.lang.Object obj = ((java.util.HashMap) k0Var.oh71FJcDz6S2).get(defpackage.ic0.WDYagTQQm9ns);
        if (obj == null) {
            obj = null;
        }
        if (!defpackage.ma0.QiMR8OkAhezm(obj, java.lang.Boolean.TRUE)) {
            return (defpackage.iu1) this.giKS3J6vZuNy.JhCgjQRTAOCT(this.ZpBGe2uQfcn8, r2Var);
        }
        java.lang.String str = neVar.fWTAfUmVKrZq() + '-' + defpackage.t80.s0TASMVLSWD5();
        defpackage.pq1 pq1Var = new defpackage.pq1(neVar);
        defpackage.pq1 pq1Var2 = defpackage.ou1.ZpBGe2uQfcn8;
        defpackage.s81 s81Var = (defpackage.s81) x8Var.fWTAfUmVKrZq;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) s81Var.QiMR8OkAhezm;
        ((defpackage.hu) ((defpackage.x8) s81Var.WDYagTQQm9ns).ZpBGe2uQfcn8).getClass();
        defpackage.lg0 lg0Var = defpackage.lg0.WDYagTQQm9ns;
        defpackage.lg0 lg0Var2 = defpackage.lg0.e6mdH7fiFuta;
        lg0Var2.compareTo(lg0Var);
        java.util.Set set = (java.util.Set) s81Var.oh71FJcDz6S2;
        if (!set.contains(pq1Var)) {
            lg0Var2.compareTo(lg0Var);
            set.add(pq1Var);
        }
        if (concurrentHashMap.containsKey(str)) {
            throw new defpackage.to("Scope with id '" + str + "' is already created");
        }
        defpackage.q81 q81Var = new defpackage.q81(pq1Var, str, pq1Var2, (defpackage.x8) s81Var.WDYagTQQm9ns, 4);
        defpackage.q81[] q81VarArr = {(defpackage.q81) s81Var.P05cfTpS5W5L};
        if (q81Var.fWTAfUmVKrZq) {
            defpackage.h7.P05cfTpS5W5L("Can't add scope link to a root scope");
            return null;
        }
        q81Var.oh71FJcDz6S2.addAll(0, defpackage.y7.a6r05ZxsOP0A(q81VarArr));
        concurrentHashMap.put(str, q81Var);
        defpackage.q81 q81Var2 = this.giKS3J6vZuNy;
        if (!q81Var2.fWTAfUmVKrZq) {
            defpackage.q81[] q81VarArr2 = {q81Var2};
            if (q81Var.fWTAfUmVKrZq) {
                defpackage.h7.P05cfTpS5W5L("Can't add scope link to a root scope");
                return null;
            }
            q81Var.oh71FJcDz6S2.addAll(0, defpackage.y7.a6r05ZxsOP0A(q81VarArr2));
        }
        defpackage.iu1 iu1Var = (defpackage.iu1) q81Var.JhCgjQRTAOCT(this.ZpBGe2uQfcn8, r2Var);
        defpackage.pu1 pu1Var = new defpackage.pu1(str, x8Var);
        defpackage.ju1 ju1Var = iu1Var.ZpBGe2uQfcn8;
        if (ju1Var == null) {
            return iu1Var;
        }
        if (ju1Var.JhCgjQRTAOCT) {
            defpackage.ju1.ZpBGe2uQfcn8(pu1Var);
            return iu1Var;
        }
        synchronized (ju1Var.ZpBGe2uQfcn8) {
            ju1Var.fWTAfUmVKrZq.add(pu1Var);
        }
        return iu1Var;
    }
}
