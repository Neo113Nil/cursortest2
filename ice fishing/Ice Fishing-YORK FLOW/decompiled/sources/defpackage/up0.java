package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class up0 {
    public java.lang.Object JhCgjQRTAOCT;
    public java.io.Serializable WDYagTQQm9ns;
    public int ZpBGe2uQfcn8;
    public final java.lang.Cloneable fWTAfUmVKrZq;
    public final java.lang.Object giKS3J6vZuNy;

    public up0(defpackage.rb0 rb0Var, java.util.LinkedHashMap linkedHashMap) {
        this.giKS3J6vZuNy = rb0Var;
        this.fWTAfUmVKrZq = linkedHashMap;
        this.JhCgjQRTAOCT = defpackage.nn.s0TASMVLSWD5;
        this.WDYagTQQm9ns = new java.util.LinkedHashMap();
        this.ZpBGe2uQfcn8 = -1;
    }

    public void GE9mJIPrb8gP(defpackage.rb0 rb0Var, java.lang.Object obj) {
        rb0Var.getClass();
        WmetiUbpKU9I(obj);
    }

    public void JhCgjQRTAOCT(double d) {
        h3m55N1URyyK(java.lang.Double.valueOf(d));
    }

    public void Ns0WNyEWdPsk(short s) {
        h3m55N1URyyK(java.lang.Short.valueOf(s));
    }

    public void P05cfTpS5W5L(long j) {
        h3m55N1URyyK(java.lang.Long.valueOf(j));
    }

    public void QiMR8OkAhezm(int i) {
        h3m55N1URyyK(java.lang.Integer.valueOf(i));
    }

    public defpackage.np0 T1fB7bDYiVJQ(java.lang.String str, boolean z) {
        java.lang.Object obj;
        defpackage.rp0 rp0Var;
        str.getClass();
        defpackage.rf1 rf1Var = (defpackage.rf1) this.fWTAfUmVKrZq;
        rf1Var.getClass();
        java.util.Iterator it = defpackage.fc1.hH0RRJrNssvh(new defpackage.ZVVdXbWmyCSK(4, rf1Var)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            defpackage.np0 np0Var = (defpackage.np0) obj;
            if (defpackage.ah1.w6IV1lieBIux((java.lang.String) np0Var.oh71FJcDz6S2.WDYagTQQm9ns, str, false) || np0Var.oh71FJcDz6S2.ZpBGe2uQfcn8(str) != null) {
                break;
            }
        }
        defpackage.np0 np0Var2 = (defpackage.np0) obj;
        if (np0Var2 != null) {
            return np0Var2;
        }
        if (!z || (rp0Var = ((defpackage.rp0) this.giKS3J6vZuNy).QiMR8OkAhezm) == null) {
            return null;
        }
        defpackage.up0 up0Var = rp0Var.GE9mJIPrb8gP;
        up0Var.getClass();
        if (defpackage.tg1.PS16moFv2oLu(str)) {
            return null;
        }
        return up0Var.T1fB7bDYiVJQ(str, true);
    }

    public void WDYagTQQm9ns(defpackage.hc1 hc1Var, int i) {
        hc1Var.getClass();
        this.ZpBGe2uQfcn8 = i;
    }

    public void WmetiUbpKU9I(java.lang.Object obj) {
        java.lang.String JhCgjQRTAOCT = ((defpackage.rb0) this.giKS3J6vZuNy).giKS3J6vZuNy().JhCgjQRTAOCT(this.ZpBGe2uQfcn8);
        defpackage.oq0 oq0Var = (defpackage.oq0) ((java.util.LinkedHashMap) this.fWTAfUmVKrZq).get(JhCgjQRTAOCT);
        if (oq0Var != null) {
            ((java.util.LinkedHashMap) this.WDYagTQQm9ns).put(JhCgjQRTAOCT, oq0Var instanceof defpackage.gf ? ((defpackage.gf) oq0Var).P05cfTpS5W5L(obj) : defpackage.ma0.VFeft99leXEK(oq0Var.oh71FJcDz6S2(obj)));
        } else {
            defpackage.h7.e6mdH7fiFuta("Cannot find NavType for argument ", JhCgjQRTAOCT, ". Please provide NavType through typeMap.");
        }
    }

    public defpackage.np0 XntWc4eZSQ8j(int i, defpackage.np0 np0Var, defpackage.np0 np0Var2, boolean z) {
        defpackage.rp0 rp0Var = (defpackage.rp0) this.giKS3J6vZuNy;
        defpackage.rf1 rf1Var = (defpackage.rf1) this.fWTAfUmVKrZq;
        defpackage.np0 np0Var3 = (defpackage.np0) rf1Var.giKS3J6vZuNy(i);
        if (np0Var2 != null) {
            if (defpackage.ma0.QiMR8OkAhezm(np0Var3, np0Var2) && defpackage.ma0.QiMR8OkAhezm(np0Var3.QiMR8OkAhezm, np0Var2.QiMR8OkAhezm)) {
                return np0Var3;
            }
            np0Var3 = null;
        } else if (np0Var3 != null) {
            return np0Var3;
        }
        if (z) {
            java.util.Iterator it = defpackage.fc1.hH0RRJrNssvh(new defpackage.ZVVdXbWmyCSK(4, rf1Var)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    np0Var3 = null;
                    break;
                }
                defpackage.np0 np0Var4 = (defpackage.np0) it.next();
                np0Var3 = (!(np0Var4 instanceof defpackage.rp0) || np0Var4.equals(np0Var)) ? null : ((defpackage.rp0) np0Var4).GE9mJIPrb8gP.XntWc4eZSQ8j(i, rp0Var, np0Var2, true);
                if (np0Var3 != null) {
                    break;
                }
            }
        }
        if (np0Var3 != null) {
            return np0Var3;
        }
        defpackage.rp0 rp0Var2 = rp0Var.QiMR8OkAhezm;
        if (rp0Var2 == null || rp0Var2.equals(np0Var)) {
            return null;
        }
        defpackage.rp0 rp0Var3 = rp0Var.QiMR8OkAhezm;
        rp0Var3.getClass();
        return rp0Var3.GE9mJIPrb8gP.XntWc4eZSQ8j(i, rp0Var, np0Var2, z);
    }

    public void ZpBGe2uQfcn8(boolean z) {
        h3m55N1URyyK(java.lang.Boolean.valueOf(z));
    }

    public void e6mdH7fiFuta(defpackage.hc1 hc1Var, int i, defpackage.rb0 rb0Var, java.lang.Object obj) {
        hc1Var.getClass();
        rb0Var.getClass();
        WDYagTQQm9ns(hc1Var, i);
        GE9mJIPrb8gP(rb0Var, obj);
    }

    public void fNwYGHIYeJcR(java.lang.String str) {
        str.getClass();
        h3m55N1URyyK(str);
    }

    public void fWTAfUmVKrZq(char c) {
        h3m55N1URyyK(java.lang.Character.valueOf(c));
    }

    public defpackage.np0 gUjdnLbkVAaA(int i) {
        return XntWc4eZSQ8j(i, (defpackage.rp0) this.giKS3J6vZuNy, null, false);
    }

    public void giKS3J6vZuNy(byte b) {
        h3m55N1URyyK(java.lang.Byte.valueOf(b));
    }

    public void h3m55N1URyyK(java.lang.Object obj) {
        obj.getClass();
        WmetiUbpKU9I(obj);
    }

    public void oh71FJcDz6S2(float f) {
        h3m55N1URyyK(java.lang.Float.valueOf(f));
    }

    public defpackage.mp0 s0TASMVLSWD5(defpackage.mp0 mp0Var, defpackage.a7 a7Var, boolean z, defpackage.np0 np0Var) {
        defpackage.mp0 mp0Var2;
        defpackage.rp0 rp0Var = (defpackage.rp0) this.giKS3J6vZuNy;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = rp0Var.iterator();
        while (true) {
            defpackage.tp0 tp0Var = (defpackage.tp0) it;
            if (!tp0Var.hasNext()) {
                break;
            }
            defpackage.np0 np0Var2 = (defpackage.np0) tp0Var.next();
            mp0Var2 = defpackage.ma0.QiMR8OkAhezm(np0Var2, np0Var) ? null : np0Var2.fWTAfUmVKrZq(a7Var);
            if (mp0Var2 != null) {
                arrayList.add(mp0Var2);
            }
        }
        defpackage.mp0 mp0Var3 = (defpackage.mp0) defpackage.hf.I5Vdbaz9SDkL(arrayList);
        defpackage.rp0 rp0Var2 = rp0Var.QiMR8OkAhezm;
        if (rp0Var2 != null && z && !rp0Var2.equals(np0Var)) {
            mp0Var2 = rp0Var2.JhCgjQRTAOCT(a7Var, rp0Var);
        }
        return (defpackage.mp0) defpackage.hf.I5Vdbaz9SDkL(defpackage.y7.ULjnV488Y6RO(new defpackage.mp0[]{mp0Var, mp0Var3, mp0Var2}));
    }

    public up0(defpackage.rp0 rp0Var) {
        this.giKS3J6vZuNy = rp0Var;
        this.fWTAfUmVKrZq = new defpackage.rf1();
    }
}
