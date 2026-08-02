package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class hs3 extends rsc {
    public final u56 a;
    public final AtomicInteger b = new AtomicInteger(-2147483647);
    public volatile sgr c;
    public sgr d;

    public hs3(is3 is3Var, u56 u56Var, String str) {
        new e88(16, this);
        o2g.O(u56Var, "delegate");
        this.a = u56Var;
    }

    @Override // defpackage.rsc, defpackage.s8h
    public final void b(sgr sgrVar) {
        o2g.O(sgrVar, "status");
        synchronized (this) {
            try {
                if (this.b.get() < 0) {
                    this.c = sgrVar;
                    this.b.addAndGet(Integer.MAX_VALUE);
                    if (this.b.get() != 0) {
                        return;
                    }
                    super.b(sgrVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rsc, defpackage.s8h
    public final void c(sgr sgrVar) {
        o2g.O(sgrVar, "status");
        synchronized (this) {
            try {
                if (this.b.get() < 0) {
                    this.c = sgrVar;
                    this.b.addAndGet(Integer.MAX_VALUE);
                } else if (this.d != null) {
                    return;
                }
                if (this.b.get() != 0) {
                    this.d = sgrVar;
                } else {
                    super.c(sgrVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rsc
    public final u56 e() {
        return this.a;
    }

    @Override // defpackage.ro4
    public final mo4 f(k3i k3iVar, s2i s2iVar, ks3 ks3Var, qo4[] qo4VarArr) {
        ks3Var.getClass();
        return this.b.get() >= 0 ? new r4c(this.c, no4.a, qo4VarArr) : this.a.f(k3iVar, s2iVar, ks3Var, qo4VarArr);
    }
}
