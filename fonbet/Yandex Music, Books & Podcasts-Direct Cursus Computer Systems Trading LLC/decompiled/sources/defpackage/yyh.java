package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class yyh implements zsb {
    public final zsb a;
    public final xvs b;

    public yyh(zsb zsbVar, xvs xvsVar) {
        this.a = zsbVar;
        this.b = xvsVar;
    }

    @Override // defpackage.zsb
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // defpackage.zsb
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.zsb
    public final boolean d(long j, sk4 sk4Var, List list) {
        return this.a.d(j, sk4Var, list);
    }

    @Override // defpackage.zsb
    public final dsc e(int i) {
        return this.b.d[this.a.f(i)];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyh)) {
            return false;
        }
        yyh yyhVar = (yyh) obj;
        return this.a.equals(yyhVar.a) && this.b.equals(yyhVar.b);
    }

    @Override // defpackage.zsb
    public final int f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.zsb
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.zsb
    public final boolean h(int i, long j) {
        return this.a.h(i, j);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // defpackage.zsb
    public final void i(float f) {
        this.a.i(f);
    }

    @Override // defpackage.zsb
    public final Object j() {
        return this.a.j();
    }

    @Override // defpackage.zsb
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.zsb
    public final int l(int i) {
        return this.a.l(i);
    }

    @Override // defpackage.zsb
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.zsb
    public final void m(long j, long j2, long j3, List list, eih[] eihVarArr) {
        this.a.m(j, j2, j3, list, eihVarArr);
    }

    @Override // defpackage.zsb
    public final xvs n() {
        return this.b;
    }

    @Override // defpackage.zsb
    public final int o(dsc dscVar) {
        return this.a.l(this.b.b(dscVar));
    }

    @Override // defpackage.zsb
    public final void p(boolean z) {
        this.a.p(z);
    }

    @Override // defpackage.zsb
    public final void q() {
        this.a.q();
    }

    @Override // defpackage.zsb
    public final int r() {
        return this.a.r();
    }

    @Override // defpackage.zsb
    public final dsc s() {
        return this.b.d[this.a.r()];
    }

    @Override // defpackage.zsb
    public final int t() {
        return this.a.t();
    }

    @Override // defpackage.zsb
    public final void u() {
        this.a.u();
    }

    @Override // defpackage.zsb
    public final int v(List list, long j) {
        return this.a.v(list, j);
    }
}
