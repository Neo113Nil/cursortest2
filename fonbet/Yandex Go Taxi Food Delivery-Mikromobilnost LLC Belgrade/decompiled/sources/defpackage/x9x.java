package defpackage;

/* loaded from: classes10.dex */
public final class x9x implements b5p {
    public final b5p a;

    public x9x(int i) {
        if ((i & 1) != 0) {
            this.a = new vhs0(65496, 2, "image/jpeg");
        } else {
            this.a = new z9x();
        }
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        this.a.a(j, j2);
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.a.e(d5pVar);
    }

    @Override // defpackage.b5p
    public final int g(c5p c5pVar, xde0 xde0Var) {
        return this.a.g(c5pVar, xde0Var);
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        return this.a.h(c5pVar);
    }

    @Override // defpackage.b5p
    public final void release() {
        this.a.release();
    }

    public x9x() {
        this(0);
    }
}
