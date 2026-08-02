package defpackage;

/* loaded from: classes7.dex */
public final class t291 implements dg81 {
    public final qj61 a;
    public final ed81 b;
    public final int c;
    public boolean w;
    public final /* synthetic */ qj61 x;

    public t291(qj61 qj61Var, qj61 qj61Var2, ed81 ed81Var, int i) {
        this.x = qj61Var;
        this.a = qj61Var2;
        this.b = ed81Var;
        this.c = i;
    }

    @Override // defpackage.dg81
    public final void a() {
    }

    @Override // defpackage.dg81
    public final int b(og81 og81Var, yh81 yh81Var, int i) {
        qj61 qj61Var = this.x;
        if (qj61Var.n()) {
            return -3;
        }
        lm81 lm81Var = qj61Var.O;
        ed81 ed81Var = this.b;
        int i2 = this.c;
        if (lm81Var != null && lm81Var.a(i2 + 1) <= ed81Var.p + ed81Var.r) {
            return -3;
        }
        if (!this.w) {
            sc81 sc81Var = qj61Var.z;
            sc81Var.b(new pil0(1, qj61Var.b[i2], qj61Var.c[i2], 0, null, sc81Var.a(qj61Var.M), -9223372036854775807L));
            this.w = true;
        }
        return ed81Var.e(og81Var, yh81Var, i, qj61Var.P);
    }

    @Override // defpackage.dg81
    public final boolean c() {
        qj61 qj61Var = this.x;
        return !qj61Var.n() && this.b.j(qj61Var.P);
    }

    @Override // defpackage.dg81
    public final int d(long j) {
        if (this.x.n()) {
            return 0;
        }
        int l = this.b.l(j, this.x.P);
        lm81 lm81Var = this.x.O;
        if (lm81Var != null) {
            int a = lm81Var.a(this.c + 1);
            ed81 ed81Var = this.b;
            l = Math.min(l, a - (ed81Var.p + ed81Var.r));
        }
        ed81 ed81Var2 = this.b;
        synchronized (ed81Var2) {
            if (l >= 0) {
                int i = ed81Var2.r + l;
                if (i <= ed81Var2.o) {
                    ed81Var2.r = i;
                }
            }
            throw new IllegalArgumentException();
        }
        if (l > 0 && !this.w) {
            qj61 qj61Var = this.x;
            sc81 sc81Var = qj61Var.z;
            int[] iArr = qj61Var.b;
            int i2 = this.c;
            sc81Var.b(new pil0(1, iArr[i2], qj61Var.c[i2], 0, null, sc81Var.a(qj61Var.M), -9223372036854775807L));
            this.w = true;
        }
        return l;
    }
}
