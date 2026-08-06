package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class rp0 extends defpackage.np0 implements java.lang.Iterable, defpackage.nb0 {
    public static final /* synthetic */ int Ns0WNyEWdPsk = 0;
    public final defpackage.up0 GE9mJIPrb8gP;

    public rp0(defpackage.wp0 wp0Var) {
        super(wp0Var);
        this.GE9mJIPrb8gP = new defpackage.up0(this);
    }

    public final defpackage.mp0 JhCgjQRTAOCT(defpackage.a7 a7Var, defpackage.np0 np0Var) {
        return this.GE9mJIPrb8gP.s0TASMVLSWD5(super.fWTAfUmVKrZq(a7Var), a7Var, true, np0Var);
    }

    public final defpackage.mp0 WDYagTQQm9ns(java.lang.String str, boolean z, defpackage.np0 np0Var) {
        defpackage.mp0 mp0Var;
        defpackage.up0 up0Var = this.GE9mJIPrb8gP;
        up0Var.getClass();
        defpackage.rp0 rp0Var = (defpackage.rp0) up0Var.giKS3J6vZuNy;
        defpackage.mp0 ZpBGe2uQfcn8 = rp0Var.oh71FJcDz6S2.ZpBGe2uQfcn8(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = rp0Var.iterator();
        while (true) {
            defpackage.tp0 tp0Var = (defpackage.tp0) it;
            mp0Var = null;
            if (!tp0Var.hasNext()) {
                break;
            }
            defpackage.np0 np0Var2 = (defpackage.np0) tp0Var.next();
            if (!defpackage.ma0.QiMR8OkAhezm(np0Var2, np0Var)) {
                if (np0Var2 instanceof defpackage.rp0) {
                    mp0Var = ((defpackage.rp0) np0Var2).WDYagTQQm9ns(str, false, rp0Var);
                } else {
                    np0Var2.getClass();
                    mp0Var = np0Var2.oh71FJcDz6S2.ZpBGe2uQfcn8(str);
                }
            }
            if (mp0Var != null) {
                arrayList.add(mp0Var);
            }
        }
        defpackage.mp0 mp0Var2 = (defpackage.mp0) defpackage.hf.I5Vdbaz9SDkL(arrayList);
        defpackage.rp0 rp0Var2 = rp0Var.QiMR8OkAhezm;
        if (rp0Var2 != null && z && !rp0Var2.equals(np0Var)) {
            mp0Var = rp0Var2.WDYagTQQm9ns(str, true, rp0Var);
        }
        return (defpackage.mp0) defpackage.hf.I5Vdbaz9SDkL(defpackage.y7.ULjnV488Y6RO(new defpackage.mp0[]{ZpBGe2uQfcn8, mp0Var2, mp0Var}));
    }

    @Override // defpackage.np0
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.rp0) || !super.equals(obj)) {
            return false;
        }
        defpackage.up0 up0Var = this.GE9mJIPrb8gP;
        int WDYagTQQm9ns = ((defpackage.rf1) up0Var.fWTAfUmVKrZq).WDYagTQQm9ns();
        defpackage.up0 up0Var2 = ((defpackage.rp0) obj).GE9mJIPrb8gP;
        if (WDYagTQQm9ns != ((defpackage.rf1) up0Var2.fWTAfUmVKrZq).WDYagTQQm9ns() || up0Var.ZpBGe2uQfcn8 != up0Var2.ZpBGe2uQfcn8) {
            return false;
        }
        defpackage.rf1 rf1Var = (defpackage.rf1) up0Var.fWTAfUmVKrZq;
        rf1Var.getClass();
        for (defpackage.np0 np0Var : defpackage.fc1.hH0RRJrNssvh(new defpackage.ZVVdXbWmyCSK(4, rf1Var))) {
            if (!np0Var.equals(((defpackage.rf1) up0Var2.fWTAfUmVKrZq).giKS3J6vZuNy(np0Var.oh71FJcDz6S2.ZpBGe2uQfcn8))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.np0
    public final defpackage.mp0 fWTAfUmVKrZq(defpackage.a7 a7Var) {
        defpackage.mp0 fWTAfUmVKrZq = super.fWTAfUmVKrZq(a7Var);
        defpackage.up0 up0Var = this.GE9mJIPrb8gP;
        up0Var.getClass();
        return up0Var.s0TASMVLSWD5(fWTAfUmVKrZq, a7Var, false, (defpackage.rp0) up0Var.giKS3J6vZuNy);
    }

    @Override // defpackage.np0
    public final int hashCode() {
        defpackage.up0 up0Var = this.GE9mJIPrb8gP;
        int i = up0Var.ZpBGe2uQfcn8;
        defpackage.rf1 rf1Var = (defpackage.rf1) up0Var.fWTAfUmVKrZq;
        int WDYagTQQm9ns = rf1Var.WDYagTQQm9ns();
        for (int i2 = 0; i2 < WDYagTQQm9ns; i2++) {
            i = (((i * 31) + rf1Var.fWTAfUmVKrZq(i2)) * 31) + ((defpackage.np0) rf1Var.oh71FJcDz6S2(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.up0 up0Var = this.GE9mJIPrb8gP;
        up0Var.getClass();
        return new defpackage.tp0(up0Var);
    }

    @Override // defpackage.np0
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        defpackage.up0 up0Var = this.GE9mJIPrb8gP;
        java.lang.String str = (java.lang.String) up0Var.WDYagTQQm9ns;
        up0Var.getClass();
        defpackage.np0 T1fB7bDYiVJQ = (str == null || defpackage.tg1.PS16moFv2oLu(str)) ? null : up0Var.T1fB7bDYiVJQ(str, true);
        if (T1fB7bDYiVJQ == null) {
            T1fB7bDYiVJQ = up0Var.gUjdnLbkVAaA(up0Var.ZpBGe2uQfcn8);
        }
        sb.append(" startDestination=");
        if (T1fB7bDYiVJQ == null) {
            java.lang.String str2 = (java.lang.String) up0Var.WDYagTQQm9ns;
            if (str2 != null) {
                sb.append(str2);
            } else {
                java.lang.String str3 = (java.lang.String) up0Var.JhCgjQRTAOCT;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + java.lang.Integer.toHexString(up0Var.ZpBGe2uQfcn8));
                }
            }
        } else {
            sb.append("{");
            sb.append(T1fB7bDYiVJQ.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
