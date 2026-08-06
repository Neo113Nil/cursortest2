package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class uq0 {
    public final java.util.LinkedHashSet GE9mJIPrb8gP;
    public final defpackage.p7 JhCgjQRTAOCT;
    public final java.util.LinkedHashSet Ns0WNyEWdPsk;
    public defpackage.tq0 P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public final defpackage.p7 WDYagTQQm9ns;
    public final defpackage.gg1 ZpBGe2uQfcn8 = defpackage.nq1.fNwYGHIYeJcR(defpackage.vq0.ZpBGe2uQfcn8);
    public final java.util.LinkedHashSet e6mdH7fiFuta;
    public boolean fNwYGHIYeJcR;
    public final defpackage.c31 fWTAfUmVKrZq;
    public boolean gUjdnLbkVAaA;
    public final defpackage.gg1 giKS3J6vZuNy;
    public boolean h3m55N1URyyK;
    public defpackage.rq0 oh71FJcDz6S2;

    public uq0() {
        defpackage.gg1 fNwYGHIYeJcR = defpackage.nq1.fNwYGHIYeJcR(new defpackage.sq0());
        this.giKS3J6vZuNy = fNwYGHIYeJcR;
        this.fWTAfUmVKrZq = new defpackage.c31(fNwYGHIYeJcR);
        this.JhCgjQRTAOCT = new defpackage.p7();
        this.WDYagTQQm9ns = new defpackage.p7();
        this.e6mdH7fiFuta = new java.util.LinkedHashSet();
        this.GE9mJIPrb8gP = new java.util.LinkedHashSet();
        this.Ns0WNyEWdPsk = new java.util.LinkedHashSet();
    }

    public final void ZpBGe2uQfcn8(defpackage.s81 s81Var, defpackage.tq0 tq0Var, int i) {
        s81Var.getClass();
        if (tq0Var.ZpBGe2uQfcn8 == null) {
            (i != 0 ? i != 1 ? this.e6mdH7fiFuta : this.GE9mJIPrb8gP : this.Ns0WNyEWdPsk).add(tq0Var);
            tq0Var.ZpBGe2uQfcn8 = s81Var;
            ((defpackage.sq0) this.fWTAfUmVKrZq.WDYagTQQm9ns.getValue()).getClass();
            tq0Var.giKS3J6vZuNy(i != 0 ? i != 1 ? this.gUjdnLbkVAaA : this.fNwYGHIYeJcR : this.h3m55N1URyyK);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Input '");
        sb.append(tq0Var);
        defpackage.s81 s81Var2 = tq0Var.ZpBGe2uQfcn8;
        sb.append("' is already added to dispatcher ");
        sb.append(s81Var2);
        sb.append('.');
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public final defpackage.rq0 fWTAfUmVKrZq(int i) {
        java.lang.Object obj;
        java.lang.Object obj2;
        defpackage.p7 p7Var = this.WDYagTQQm9ns;
        defpackage.p7 p7Var2 = this.JhCgjQRTAOCT;
        java.lang.Object obj3 = null;
        if (i == -1) {
            java.util.Iterator it = p7Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((defpackage.rq0) obj).giKS3J6vZuNy) {
                    break;
                }
            }
            defpackage.rq0 rq0Var = (defpackage.rq0) obj;
            if (rq0Var != null) {
                return rq0Var;
            }
            java.util.Iterator it2 = p7Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next = it2.next();
                if (((defpackage.rq0) next).giKS3J6vZuNy) {
                    obj3 = next;
                    break;
                }
            }
            return (defpackage.rq0) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            java.util.Iterator it3 = p7Var2.iterator();
            while (it3.hasNext()) {
                ((defpackage.rq0) it3.next()).getClass();
            }
            java.util.Iterator it4 = p7Var.iterator();
            while (it4.hasNext()) {
                ((defpackage.rq0) it4.next()).getClass();
            }
            return null;
        }
        java.util.Iterator it5 = p7Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((defpackage.rq0) obj2).giKS3J6vZuNy) {
                break;
            }
        }
        defpackage.rq0 rq0Var2 = (defpackage.rq0) obj2;
        if (rq0Var2 != null) {
            return rq0Var2;
        }
        java.util.Iterator it6 = p7Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next2 = it6.next();
            if (((defpackage.rq0) next2).giKS3J6vZuNy) {
                obj3 = next2;
                break;
            }
        }
        return (defpackage.rq0) obj3;
    }

    public final void giKS3J6vZuNy() {
        boolean z;
        boolean z2;
        defpackage.sq0 sq0Var;
        defpackage.p7 p7Var = this.JhCgjQRTAOCT;
        if (p7Var == null || !p7Var.isEmpty()) {
            java.util.Iterator it = p7Var.iterator();
            while (it.hasNext()) {
                if (((defpackage.rq0) it.next()).giKS3J6vZuNy) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        defpackage.p7 p7Var2 = this.WDYagTQQm9ns;
        if (p7Var2 == null || !p7Var2.isEmpty()) {
            java.util.Iterator it2 = p7Var2.iterator();
            while (it2.hasNext()) {
                if (((defpackage.rq0) it2.next()).giKS3J6vZuNy) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.h3m55N1URyyK != z;
        boolean z5 = this.fNwYGHIYeJcR != z2;
        boolean z6 = this.gUjdnLbkVAaA != z3;
        java.util.LinkedHashSet linkedHashSet = this.Ns0WNyEWdPsk;
        if (z4) {
            java.util.Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((defpackage.tq0) it3.next()).giKS3J6vZuNy(z);
            }
        }
        java.util.LinkedHashSet linkedHashSet2 = this.GE9mJIPrb8gP;
        if (z5) {
            java.util.Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((defpackage.tq0) it4.next()).giKS3J6vZuNy(z2);
            }
        }
        java.util.LinkedHashSet linkedHashSet3 = this.e6mdH7fiFuta;
        if (z6) {
            java.util.Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((defpackage.tq0) it5.next()).giKS3J6vZuNy(z3);
            }
        }
        this.h3m55N1URyyK = z;
        this.fNwYGHIYeJcR = z2;
        this.gUjdnLbkVAaA = z3;
        defpackage.rq0 rq0Var = this.oh71FJcDz6S2;
        if (rq0Var == null) {
            rq0Var = fWTAfUmVKrZq(0);
        }
        defpackage.rq0 rq0Var2 = this.oh71FJcDz6S2;
        if (rq0Var2 == null) {
            rq0Var2 = fWTAfUmVKrZq(0);
        }
        if (defpackage.ma0.QiMR8OkAhezm(rq0Var2, rq0Var)) {
            if (rq0Var2 == null) {
                sq0Var = new defpackage.sq0();
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<E> it6 = p7Var.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((defpackage.rq0) it6.next()).giKS3J6vZuNy;
                }
                java.util.Iterator<E> it7 = p7Var2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((defpackage.rq0) it7.next()).giKS3J6vZuNy;
                }
                defpackage.v70 v70Var = rq0Var2.ZpBGe2uQfcn8;
                defpackage.wh0 XntWc4eZSQ8j = defpackage.ma0.XntWc4eZSQ8j();
                defpackage.nf.Jkfc0NcwyPL8(XntWc4eZSQ8j, arrayList);
                XntWc4eZSQ8j.add(v70Var);
                defpackage.nf.Jkfc0NcwyPL8(XntWc4eZSQ8j, defpackage.av.WDYagTQQm9ns);
                sq0Var = new defpackage.sq0(arrayList.size(), defpackage.ma0.GE9mJIPrb8gP(XntWc4eZSQ8j));
            }
            defpackage.gg1 gg1Var = this.giKS3J6vZuNy;
            if (defpackage.ma0.QiMR8OkAhezm((defpackage.sq0) gg1Var.getValue(), sq0Var)) {
                return;
            }
            gg1Var.GE9mJIPrb8gP(null, sq0Var);
            java.util.Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((defpackage.tq0) it8.next()).getClass();
            }
            java.util.Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((defpackage.tq0) it9.next()).getClass();
            }
            java.util.Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((defpackage.tq0) it10.next()).getClass();
            }
        }
    }
}
