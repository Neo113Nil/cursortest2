package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class m4 implements ol {
    public final int MdtA4re8;
    public final l9 NCTxEWno;
    public final xg VgvYg0wo;
    public final v2 wxUZMvaN;

    public m4(xg xgVar, l9 l9Var, int i, v2 v2Var) {
        this.NCTxEWno = l9Var;
        this.MdtA4re8 = i;
        this.wxUZMvaN = v2Var;
        this.VgvYg0wo = xgVar;
    }

    public xg MdtA4re8() {
        return null;
    }

    @Override // defpackage.xg
    public final Object NCTxEWno(yg ygVar, g9 g9Var) {
        int i = this.MdtA4re8;
        g9 g9Var2 = null;
        int i2 = 0;
        u9 u9Var = u9.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        if (i == -3) {
            l9 wxUZMvaN = g9Var.wxUZMvaN();
            Boolean bool = Boolean.FALSE;
            l6 l6Var = new l6(2);
            l9 l9Var = this.NCTxEWno;
            l9 eVhOlqcC = !((Boolean) l9Var.Qr9iLBAD(bool, l6Var)).booleanValue() ? wxUZMvaN.eVhOlqcC(l9Var) : w30.I5GHvsYW(wxUZMvaN, l9Var, false);
            if (fn.qoPGr6Ce(eVhOlqcC, wxUZMvaN)) {
                Object wxUZMvaN2 = wxUZMvaN(ygVar, g9Var);
                if (wxUZMvaN2 == u9Var) {
                    return wxUZMvaN2;
                }
            } else {
                re reVar = re.MdtA4re8;
                if (fn.qoPGr6Ce(eVhOlqcC.OnDfzHZD(reVar), wxUZMvaN.OnDfzHZD(reVar))) {
                    l9 wxUZMvaN3 = g9Var.wxUZMvaN();
                    if (!(ygVar instanceof j60) && !(ygVar instanceof iw)) {
                        ygVar = new dh(ygVar, wxUZMvaN3);
                    }
                    Object hzgxAD8d = fn.hzgxAD8d(eVhOlqcC, ygVar, w30.ZyZthT5G(eVhOlqcC), new l4(this, g9Var2, 1), g9Var);
                    if (hzgxAD8d == u9Var) {
                        return hzgxAD8d;
                    }
                }
            }
        }
        Object OnDfzHZD = ra.OnDfzHZD(new k4(ygVar, this, g9Var2, i2), g9Var);
        if (OnDfzHZD != u9Var) {
            OnDfzHZD = xe0Var;
        }
        return OnDfzHZD == u9Var ? OnDfzHZD : xe0Var;
    }

    public final String P7K7Inc8() {
        ArrayList arrayList = new ArrayList(4);
        uf ufVar = uf.NCTxEWno;
        l9 l9Var = this.NCTxEWno;
        if (l9Var != ufVar) {
            arrayList.add("context=" + l9Var);
        }
        int i = this.MdtA4re8;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        v2 v2Var = v2.NCTxEWno;
        v2 v2Var2 = this.wxUZMvaN;
        if (v2Var2 != v2Var) {
            arrayList.add("onBufferOverflow=" + v2Var2);
        }
        return getClass().getSimpleName() + '[' + x5.Sjrx9cEN(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // defpackage.ol
    public final xg VgvYg0wo(l9 l9Var, int i, v2 v2Var) {
        l9 l9Var2 = this.NCTxEWno;
        l9 eVhOlqcC = l9Var.eVhOlqcC(l9Var2);
        v2 v2Var2 = v2.NCTxEWno;
        v2 v2Var3 = this.wxUZMvaN;
        int i2 = this.MdtA4re8;
        if (v2Var == v2Var2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            v2Var = v2Var3;
        }
        return (fn.qoPGr6Ce(eVhOlqcC, l9Var2) && i == i2 && v2Var == v2Var3) ? this : qoPGr6Ce(eVhOlqcC, i, v2Var);
    }

    public abstract m4 qoPGr6Ce(l9 l9Var, int i, v2 v2Var);

    public final String toString() {
        return this.VgvYg0wo + " -> " + P7K7Inc8();
    }

    public abstract Object wxUZMvaN(yg ygVar, g9 g9Var);
}
