package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class uxj extends qo4 {
    public final /* synthetic */ qo4 b;
    public final /* synthetic */ wxj c;

    public uxj(wxj wxjVar, qo4 qo4Var) {
        this.c = wxjVar;
        this.b = qo4Var;
    }

    @Override // defpackage.qo4
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.qo4
    public final void b() {
        this.b.b();
    }

    @Override // defpackage.qo4
    public final void c(int i) {
        this.b.c(i);
    }

    @Override // defpackage.qo4
    public final void d(int i, long j, long j2) {
        this.b.d(i, j, j2);
    }

    @Override // defpackage.qo4
    public final void e(s2i s2iVar) {
        this.b.e(s2iVar);
    }

    @Override // defpackage.qo4
    public final void f(long j) {
        this.b.f(j);
    }

    @Override // defpackage.qo4
    public final void g(long j) {
        this.b.g(j);
    }

    @Override // defpackage.qo4
    public final void h() {
        this.b.h();
    }

    @Override // defpackage.qo4
    public final void i(int i) {
        this.b.i(i);
    }

    @Override // defpackage.qo4
    public final void j(int i, long j, long j2) {
        this.b.j(i, j, j2);
    }

    @Override // defpackage.qo4
    public final void k(long j) {
        this.b.k(j);
    }

    @Override // defpackage.qo4
    public final void l(long j) {
        this.b.l(j);
    }

    @Override // defpackage.qo4
    public final void m(sgr sgrVar) {
        qxj qxjVar = this.c.a;
        boolean g = sgrVar.g();
        txj txjVar = qxjVar.a;
        if (txjVar.e != null || txjVar.f != null) {
            aqd aqdVar = qxjVar.b;
            if (g) {
                ((AtomicLong) aqdVar.b).getAndIncrement();
            } else {
                ((AtomicLong) aqdVar.c).getAndIncrement();
            }
        }
        this.b.m(sgrVar);
    }

    @Override // defpackage.qo4
    public final void n(xu1 xu1Var, s2i s2iVar) {
        this.b.n(xu1Var, s2iVar);
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.b, "delegate");
        return Y.toString();
    }
}
