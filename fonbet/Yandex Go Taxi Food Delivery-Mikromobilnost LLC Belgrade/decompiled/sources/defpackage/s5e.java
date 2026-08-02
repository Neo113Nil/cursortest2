package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class s5e implements ull0 {
    public final ull0 a;

    public s5e(ull0 ull0Var) {
        this.a = ull0Var;
    }

    @Override // defpackage.ull0
    public final void C() {
        this.a.C();
    }

    @Override // defpackage.ull0
    public final boolean Q1() {
        return this.a.Q1();
    }

    @Override // defpackage.ull0
    public final String Y1(int i) {
        return this.a.Y1(i);
    }

    @Override // defpackage.ull0
    public final void b(int i, long j) {
        this.a.b(i, j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ull0 ull0Var = this.a;
        ull0Var.reset();
        ull0Var.C();
    }

    @Override // defpackage.ull0
    public final void g1(int i, String str) {
        this.a.g1(i, str);
    }

    @Override // defpackage.ull0
    public final byte[] getBlob(int i) {
        return this.a.getBlob(i);
    }

    @Override // defpackage.ull0
    public final int getColumnCount() {
        return this.a.getColumnCount();
    }

    @Override // defpackage.ull0
    public final String getColumnName(int i) {
        return this.a.getColumnName(i);
    }

    @Override // defpackage.ull0
    public final List getColumnNames() {
        return this.a.getColumnNames();
    }

    @Override // defpackage.ull0
    public final double getDouble(int i) {
        return this.a.getDouble(i);
    }

    @Override // defpackage.ull0
    public final long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // defpackage.ull0
    public final boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Override // defpackage.ull0
    public final void m(int i, byte[] bArr) {
        this.a.m(i, bArr);
    }

    @Override // defpackage.ull0
    public final void p(int i) {
        this.a.p(i);
    }

    @Override // defpackage.ull0
    public final boolean q() {
        return this.a.q();
    }

    @Override // defpackage.ull0
    public final void reset() {
        this.a.reset();
    }

    @Override // defpackage.ull0
    public final void z(double d, int i) {
        this.a.z(d, i);
    }
}
