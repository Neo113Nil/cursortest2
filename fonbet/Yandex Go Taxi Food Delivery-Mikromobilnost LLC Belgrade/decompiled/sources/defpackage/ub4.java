package defpackage;

/* loaded from: classes10.dex */
public final class ub4 implements b5p {
    public final ef90 a = new ef90(4);
    public final vhs0 b = new vhs0(-1, -1, "image/avif");

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        this.b.a(j, j2);
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.b.e(d5pVar);
    }

    @Override // defpackage.b5p
    public final int g(c5p c5pVar, xde0 xde0Var) {
        return this.b.g(c5pVar, xde0Var);
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        kbh kbhVar = (kbh) c5pVar;
        kbhVar.a(4, false);
        ef90 ef90Var = this.a;
        ef90Var.H(4);
        kbhVar.H(ef90Var.a, 0, 4, false);
        if (ef90Var.A() == 1718909296) {
            ef90Var.H(4);
            kbhVar.H(ef90Var.a, 0, 4, false);
            if (ef90Var.A() == 1635150182) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b5p
    public final void release() {
    }
}
