package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class sz implements h40 {
    public final long MdtA4re8;
    public final h40 NCTxEWno;
    public final /* synthetic */ yz wxUZMvaN;

    public sz(yz yzVar, h40 h40Var) {
        h40Var.getClass();
        this.wxUZMvaN = yzVar;
        this.NCTxEWno = h40Var;
        this.MdtA4re8 = g50.MdtA4re8();
    }

    @Override // defpackage.h40
    public final void I5GHvsYW() {
        if (this.wxUZMvaN.VgvYg0wo) {
            w30.bvfAo0eO("Statement is recycled", 21);
            throw null;
        }
        if (this.MdtA4re8 == g50.MdtA4re8()) {
            this.NCTxEWno.I5GHvsYW();
        } else {
            w30.bvfAo0eO("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.h40
    public final void MdtA4re8(String str, int i) {
        str.getClass();
        if (this.wxUZMvaN.VgvYg0wo) {
            w30.bvfAo0eO("Statement is recycled", 21);
            throw null;
        }
        if (this.MdtA4re8 == g50.MdtA4re8()) {
            this.NCTxEWno.MdtA4re8(str, i);
        } else {
            w30.bvfAo0eO("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.h40
    public final void NCTxEWno() {
        if (this.wxUZMvaN.VgvYg0wo) {
            w30.bvfAo0eO("Statement is recycled", 21);
            throw null;
        }
        if (this.MdtA4re8 == g50.MdtA4re8()) {
            this.NCTxEWno.NCTxEWno();
        } else {
            w30.bvfAo0eO("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.h40
    public final boolean amk52bBQ() {
        if (this.wxUZMvaN.VgvYg0wo) {
            w30.bvfAo0eO("Statement is recycled", 21);
            throw null;
        }
        if (this.MdtA4re8 == g50.MdtA4re8()) {
            return this.NCTxEWno.amk52bBQ();
        }
        w30.bvfAo0eO("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.wxUZMvaN.VgvYg0wo) {
            w30.bvfAo0eO("Statement is recycled", 21);
            throw null;
        }
        if (this.MdtA4re8 == g50.MdtA4re8()) {
            this.NCTxEWno.close();
        } else {
            w30.bvfAo0eO("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.h40
    public final int getColumnCount() {
        if (this.wxUZMvaN.VgvYg0wo) {
            w30.bvfAo0eO("Statement is recycled", 21);
            throw null;
        }
        if (this.MdtA4re8 == g50.MdtA4re8()) {
            return this.NCTxEWno.getColumnCount();
        }
        w30.bvfAo0eO("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.h40
    public final String getColumnName(int i) {
        if (this.wxUZMvaN.VgvYg0wo) {
            w30.bvfAo0eO("Statement is recycled", 21);
            throw null;
        }
        if (this.MdtA4re8 == g50.MdtA4re8()) {
            return this.NCTxEWno.getColumnName(i);
        }
        w30.bvfAo0eO("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.h40
    public final long getLong(int i) {
        if (this.wxUZMvaN.VgvYg0wo) {
            w30.bvfAo0eO("Statement is recycled", 21);
            throw null;
        }
        if (this.MdtA4re8 == g50.MdtA4re8()) {
            return this.NCTxEWno.getLong(i);
        }
        w30.bvfAo0eO("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.h40
    public final boolean isNull(int i) {
        if (this.wxUZMvaN.VgvYg0wo) {
            w30.bvfAo0eO("Statement is recycled", 21);
            throw null;
        }
        if (this.MdtA4re8 == g50.MdtA4re8()) {
            return this.NCTxEWno.isNull(i);
        }
        w30.bvfAo0eO("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.h40
    public final void qoPGr6Ce(int i, long j) {
        if (this.wxUZMvaN.VgvYg0wo) {
            w30.bvfAo0eO("Statement is recycled", 21);
            throw null;
        }
        if (this.MdtA4re8 == g50.MdtA4re8()) {
            this.NCTxEWno.qoPGr6Ce(i, j);
        } else {
            w30.bvfAo0eO("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.h40
    public final String wxUZMvaN(int i) {
        if (this.wxUZMvaN.VgvYg0wo) {
            w30.bvfAo0eO("Statement is recycled", 21);
            throw null;
        }
        if (this.MdtA4re8 == g50.MdtA4re8()) {
            return this.NCTxEWno.wxUZMvaN(i);
        }
        w30.bvfAo0eO("Attempted to use statement on a different thread", 21);
        throw null;
    }
}
