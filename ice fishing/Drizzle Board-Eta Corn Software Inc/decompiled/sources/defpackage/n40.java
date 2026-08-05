package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class n40 extends o40 implements Iterator {
    public boolean MdtA4re8 = true;
    public m40 NCTxEWno;
    public final /* synthetic */ p40 wxUZMvaN;

    public n40(p40 p40Var) {
        this.wxUZMvaN = p40Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.MdtA4re8) {
            return this.wxUZMvaN.NCTxEWno != null;
        }
        m40 m40Var = this.NCTxEWno;
        return (m40Var == null || m40Var.wxUZMvaN == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.MdtA4re8) {
            this.MdtA4re8 = false;
            m40 m40Var = this.wxUZMvaN.NCTxEWno;
            this.NCTxEWno = m40Var;
            return m40Var;
        }
        m40 m40Var2 = this.NCTxEWno;
        m40 m40Var3 = m40Var2 != null ? m40Var2.wxUZMvaN : null;
        this.NCTxEWno = m40Var3;
        return m40Var3;
    }

    @Override // defpackage.o40
    public final void qoPGr6Ce(m40 m40Var) {
        m40 m40Var2 = this.NCTxEWno;
        if (m40Var == m40Var2) {
            m40 m40Var3 = m40Var2.VgvYg0wo;
            this.NCTxEWno = m40Var3;
            this.MdtA4re8 = m40Var3 == null;
        }
    }
}
