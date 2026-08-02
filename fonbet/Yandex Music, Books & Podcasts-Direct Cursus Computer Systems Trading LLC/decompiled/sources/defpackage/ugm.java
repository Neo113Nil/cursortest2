package defpackage;

/* loaded from: classes.dex */
public final class ugm implements cko {
    public final cko a;
    public final long b;
    public final /* synthetic */ ahm c;

    public ugm(ahm ahmVar, cko ckoVar) {
        ckoVar.getClass();
        this.c = ahmVar;
        this.a = ckoVar;
        this.b = ufs.a();
    }

    @Override // defpackage.cko
    public final void E(int i, String str) {
        str.getClass();
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            this.a.E(i, str);
        } else {
            p6g.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.cko
    public final void bindBlob(int i, byte[] bArr) {
        bArr.getClass();
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            this.a.bindBlob(i, bArr);
        } else {
            p6g.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.cko
    public final void bindDouble(int i, double d) {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            this.a.bindDouble(i, d);
        } else {
            p6g.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.cko
    public final void bindLong(int i, long j) {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            this.a.bindLong(i, j);
        } else {
            p6g.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.cko
    public final void bindNull(int i) {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            this.a.bindNull(i);
        } else {
            p6g.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.cko
    public final void clearBindings() {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            this.a.clearBindings();
        } else {
            p6g.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            this.a.close();
        } else {
            p6g.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.cko
    public final byte[] getBlob(int i) {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            return this.a.getBlob(i);
        }
        p6g.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.cko
    public final int getColumnCount() {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            return this.a.getColumnCount();
        }
        p6g.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.cko
    public final String getColumnName(int i) {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            return this.a.getColumnName(i);
        }
        p6g.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.cko
    public final double getDouble(int i) {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            return this.a.getDouble(i);
        }
        p6g.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.cko
    public final long getLong(int i) {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            return this.a.getLong(i);
        }
        p6g.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.cko
    public final boolean isNull(int i) {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            return this.a.isNull(i);
        }
        p6g.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.cko
    public final boolean q() {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            return this.a.q();
        }
        p6g.H(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.cko
    public final void reset() {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            this.a.reset();
        } else {
            p6g.H(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.cko
    public final String x0(int i) {
        if (this.c.e) {
            p6g.H(21, "Statement is recycled");
            throw null;
        }
        if (this.b == ufs.a()) {
            return this.a.x0(i);
        }
        p6g.H(21, "Attempted to use statement on a different thread");
        throw null;
    }
}
