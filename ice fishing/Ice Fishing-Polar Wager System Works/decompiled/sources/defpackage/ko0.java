package defpackage;

/* loaded from: classes.dex */
public final class ko0 {
    public int AARZUJiTa;
    public boolean DFo87pBq1E5;
    public defpackage.jo0 EXtogiMhuM;
    public final defpackage.l6 F7NU4MC0GW;
    public final defpackage.hc1 IHQe1A4L2xu = defpackage.gq1.F7NU4MC0GW(defpackage.lo0.xiZrDbcSW0);
    public boolean JlrlGoKF;
    public final java.util.LinkedHashSet SH1y5HwkJhh;
    public boolean SyNS6RMn;
    public final defpackage.l6 adDC3e2L;
    public final java.util.LinkedHashSet ez2rX8ReCYw;
    public final defpackage.hc1 oh6vYeIP;
    public final defpackage.xy0 r1MBDhnF;
    public final java.util.LinkedHashSet riuEU0zW4;
    public defpackage.ho0 xiZrDbcSW0;

    public ko0() {
        defpackage.hc1 F7NU4MC0GW = defpackage.gq1.F7NU4MC0GW(new defpackage.io0());
        this.oh6vYeIP = F7NU4MC0GW;
        this.r1MBDhnF = new defpackage.xy0(F7NU4MC0GW);
        this.F7NU4MC0GW = new defpackage.l6();
        this.adDC3e2L = new defpackage.l6();
        this.riuEU0zW4 = new java.util.LinkedHashSet();
        this.SH1y5HwkJhh = new java.util.LinkedHashSet();
        this.ez2rX8ReCYw = new java.util.LinkedHashSet();
    }

    public final void IHQe1A4L2xu(defpackage.y yVar, defpackage.jo0 jo0Var, int i) {
        yVar.getClass();
        if (jo0Var.IHQe1A4L2xu == null) {
            (i != 0 ? i != 1 ? this.riuEU0zW4 : this.SH1y5HwkJhh : this.ez2rX8ReCYw).add(jo0Var);
            jo0Var.IHQe1A4L2xu = yVar;
            ((defpackage.io0) this.r1MBDhnF.adDC3e2L.getValue()).getClass();
            jo0Var.oh6vYeIP(i != 0 ? i != 1 ? this.SyNS6RMn : this.JlrlGoKF : this.DFo87pBq1E5);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Input '");
        sb.append(jo0Var);
        defpackage.y yVar2 = jo0Var.IHQe1A4L2xu;
        sb.append("' is already added to dispatcher ");
        sb.append(yVar2);
        sb.append('.');
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public final void oh6vYeIP() {
        boolean z;
        boolean z2;
        defpackage.io0 io0Var;
        defpackage.l6 l6Var = this.F7NU4MC0GW;
        if (l6Var == null || !l6Var.isEmpty()) {
            java.util.Iterator it = l6Var.iterator();
            while (it.hasNext()) {
                if (((defpackage.ho0) it.next()).oh6vYeIP) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        defpackage.l6 l6Var2 = this.adDC3e2L;
        if (l6Var2 == null || !l6Var2.isEmpty()) {
            java.util.Iterator it2 = l6Var2.iterator();
            while (it2.hasNext()) {
                if (((defpackage.ho0) it2.next()).oh6vYeIP) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.DFo87pBq1E5 != z;
        boolean z5 = this.JlrlGoKF != z2;
        boolean z6 = this.SyNS6RMn != z3;
        java.util.LinkedHashSet linkedHashSet = this.ez2rX8ReCYw;
        if (z4) {
            java.util.Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((defpackage.jo0) it3.next()).oh6vYeIP(z);
            }
        }
        java.util.LinkedHashSet linkedHashSet2 = this.SH1y5HwkJhh;
        if (z5) {
            java.util.Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((defpackage.jo0) it4.next()).oh6vYeIP(z2);
            }
        }
        java.util.LinkedHashSet linkedHashSet3 = this.riuEU0zW4;
        if (z6) {
            java.util.Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((defpackage.jo0) it5.next()).oh6vYeIP(z3);
            }
        }
        this.DFo87pBq1E5 = z;
        this.JlrlGoKF = z2;
        this.SyNS6RMn = z3;
        defpackage.ho0 ho0Var = this.xiZrDbcSW0;
        if (ho0Var == null) {
            ho0Var = r1MBDhnF(0);
        }
        defpackage.ho0 ho0Var2 = this.xiZrDbcSW0;
        if (ho0Var2 == null) {
            ho0Var2 = r1MBDhnF(0);
        }
        if (defpackage.x70.QoRHpC4k(ho0Var2, ho0Var)) {
            if (ho0Var2 == null) {
                io0Var = new defpackage.io0();
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<E> it6 = l6Var.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((defpackage.ho0) it6.next()).oh6vYeIP;
                }
                java.util.Iterator<E> it7 = l6Var2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((defpackage.ho0) it7.next()).oh6vYeIP;
                }
                defpackage.c80 c80Var = ho0Var2.IHQe1A4L2xu;
                defpackage.te0 kNAkVymC = defpackage.fm.kNAkVymC();
                defpackage.yd.AsxAYCCkb3Hi(kNAkVymC, arrayList);
                kNAkVymC.add(c80Var);
                defpackage.yd.AsxAYCCkb3Hi(kNAkVymC, defpackage.nt.adDC3e2L);
                io0Var = new defpackage.io0(arrayList.size(), defpackage.fm.fnWB2E7cs(kNAkVymC));
            }
            defpackage.hc1 hc1Var = this.oh6vYeIP;
            if (defpackage.x70.QoRHpC4k((defpackage.io0) hc1Var.getValue(), io0Var)) {
                return;
            }
            hc1Var.ez2rX8ReCYw(null, io0Var);
            java.util.Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((defpackage.jo0) it8.next()).getClass();
            }
            java.util.Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((defpackage.jo0) it9.next()).getClass();
            }
            java.util.Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((defpackage.jo0) it10.next()).getClass();
            }
        }
    }

    public final defpackage.ho0 r1MBDhnF(int i) {
        java.lang.Object obj;
        java.lang.Object obj2;
        defpackage.l6 l6Var = this.adDC3e2L;
        defpackage.l6 l6Var2 = this.F7NU4MC0GW;
        java.lang.Object obj3 = null;
        if (i == -1) {
            java.util.Iterator it = l6Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((defpackage.ho0) obj).oh6vYeIP) {
                    break;
                }
            }
            defpackage.ho0 ho0Var = (defpackage.ho0) obj;
            if (ho0Var != null) {
                return ho0Var;
            }
            java.util.Iterator it2 = l6Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next = it2.next();
                if (((defpackage.ho0) next).oh6vYeIP) {
                    obj3 = next;
                    break;
                }
            }
            return (defpackage.ho0) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            java.util.Iterator it3 = l6Var2.iterator();
            while (it3.hasNext()) {
                ((defpackage.ho0) it3.next()).getClass();
            }
            java.util.Iterator it4 = l6Var.iterator();
            while (it4.hasNext()) {
                ((defpackage.ho0) it4.next()).getClass();
            }
            return null;
        }
        java.util.Iterator it5 = l6Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((defpackage.ho0) obj2).oh6vYeIP) {
                break;
            }
        }
        defpackage.ho0 ho0Var2 = (defpackage.ho0) obj2;
        if (ho0Var2 != null) {
            return ho0Var2;
        }
        java.util.Iterator it6 = l6Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next2 = it6.next();
            if (((defpackage.ho0) next2).oh6vYeIP) {
                obj3 = next2;
                break;
            }
        }
        return (defpackage.ho0) obj3;
    }
}
