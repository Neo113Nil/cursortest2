package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class l40 extends o40 implements Iterator {
    public m40 MdtA4re8;
    public m40 NCTxEWno;
    public final /* synthetic */ int wxUZMvaN;

    public l40(m40 m40Var, m40 m40Var2, int i) {
        this.wxUZMvaN = i;
        this.NCTxEWno = m40Var2;
        this.MdtA4re8 = m40Var;
    }

    public final m40 NCTxEWno(m40 m40Var) {
        switch (this.wxUZMvaN) {
            case 0:
                return m40Var.wxUZMvaN;
            default:
                return m40Var.VgvYg0wo;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.MdtA4re8 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m40 m40Var = this.MdtA4re8;
        m40 m40Var2 = this.NCTxEWno;
        this.MdtA4re8 = (m40Var == m40Var2 || m40Var2 == null) ? null : NCTxEWno(m40Var);
        return m40Var;
    }

    @Override // defpackage.o40
    public final void qoPGr6Ce(m40 m40Var) {
        m40 m40Var2;
        m40 m40Var3 = this.NCTxEWno;
        m40 m40Var4 = null;
        if (m40Var3 == m40Var && m40Var == this.MdtA4re8) {
            this.MdtA4re8 = null;
            this.NCTxEWno = null;
            m40Var3 = null;
        }
        m40 m40Var5 = m40Var3;
        if (m40Var3 == m40Var) {
            switch (this.wxUZMvaN) {
                case 0:
                    m40Var2 = m40Var3.VgvYg0wo;
                    break;
                default:
                    m40Var2 = m40Var3.wxUZMvaN;
                    break;
            }
            m40Var5 = m40Var2;
            this.NCTxEWno = m40Var5;
        }
        m40 m40Var6 = this.MdtA4re8;
        if (m40Var6 == m40Var) {
            if (m40Var6 != m40Var5 && m40Var5 != null) {
                m40Var4 = NCTxEWno(m40Var6);
            }
            this.MdtA4re8 = m40Var4;
        }
    }
}
