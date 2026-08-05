package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class m6 implements l9, Serializable {
    public final j9 MdtA4re8;
    public final l9 NCTxEWno;

    public m6(j9 j9Var, l9 l9Var) {
        l9Var.getClass();
        this.NCTxEWno = l9Var;
        this.MdtA4re8 = j9Var;
    }

    @Override // defpackage.l9
    public final j9 OnDfzHZD(k9 k9Var) {
        k9Var.getClass();
        while (true) {
            j9 OnDfzHZD = this.MdtA4re8.OnDfzHZD(k9Var);
            if (OnDfzHZD != null) {
                return OnDfzHZD;
            }
            l9 l9Var = this.NCTxEWno;
            if (!(l9Var instanceof m6)) {
                return l9Var.OnDfzHZD(k9Var);
            }
            this = (m6) l9Var;
        }
    }

    @Override // defpackage.l9
    public final Object Qr9iLBAD(Object obj, dl dlVar) {
        return dlVar.Qr9iLBAD(this.NCTxEWno.Qr9iLBAD(obj, dlVar), this.MdtA4re8);
    }

    @Override // defpackage.l9
    public final l9 eVhOlqcC(l9 l9Var) {
        l9Var.getClass();
        return l9Var == uf.NCTxEWno ? this : (l9) l9Var.Qr9iLBAD(this, new l6(1));
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof m6) {
            m6 m6Var = (m6) obj;
            int i = 2;
            m6 m6Var2 = m6Var;
            int i2 = 2;
            while (true) {
                l9 l9Var = m6Var2.NCTxEWno;
                m6Var2 = l9Var instanceof m6 ? (m6) l9Var : null;
                if (m6Var2 == null) {
                    break;
                }
                i2++;
            }
            m6 m6Var3 = this;
            while (true) {
                l9 l9Var2 = m6Var3.NCTxEWno;
                m6Var3 = l9Var2 instanceof m6 ? (m6) l9Var2 : null;
                if (m6Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    j9 j9Var = this.MdtA4re8;
                    if (!fn.qoPGr6Ce(m6Var.OnDfzHZD(j9Var.getKey()), j9Var)) {
                        z = false;
                        break;
                    }
                    l9 l9Var3 = this.NCTxEWno;
                    if (!(l9Var3 instanceof m6)) {
                        l9Var3.getClass();
                        j9 j9Var2 = (j9) l9Var3;
                        z = fn.qoPGr6Ce(m6Var.OnDfzHZD(j9Var2.getKey()), j9Var2);
                        break;
                    }
                    this = (m6) l9Var3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.MdtA4re8.hashCode() + this.NCTxEWno.hashCode();
    }

    @Override // defpackage.l9
    public final l9 lDXGDhIF(k9 k9Var) {
        k9Var.getClass();
        j9 j9Var = this.MdtA4re8;
        j9 OnDfzHZD = j9Var.OnDfzHZD(k9Var);
        l9 l9Var = this.NCTxEWno;
        if (OnDfzHZD != null) {
            return l9Var;
        }
        l9 lDXGDhIF = l9Var.lDXGDhIF(k9Var);
        return lDXGDhIF == l9Var ? this : lDXGDhIF == uf.NCTxEWno ? j9Var : new m6(j9Var, lDXGDhIF);
    }

    public final String toString() {
        return "[" + ((String) Qr9iLBAD("", new l6(0))) + ']';
    }
}
