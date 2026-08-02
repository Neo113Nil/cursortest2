package defpackage;

/* loaded from: classes7.dex */
public final class rt81 extends lm81 {
    public final int o;
    public final qd81 p;
    public long q;
    public boolean r;

    public rt81(u871 u871Var, no71 no71Var, qd81 qd81Var, int i, Object obj, long j, long j2, long j3, int i2, qd81 qd81Var2) {
        super(u871Var, no71Var, qd81Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = qd81Var2;
    }

    @Override // defpackage.zl61
    public final void a() {
        fb81 fb81Var;
        bh81 bh81Var = this.i;
        gr81 gr81Var = this.m;
        if (gr81Var == null) {
            ny61.k();
            return;
        }
        ed81[] ed81VarArr = (ed81[]) gr81Var.c;
        int i = 0;
        for (ed81 ed81Var : ed81VarArr) {
            if (ed81Var.D != 0) {
                ed81Var.D = 0L;
                ed81Var.y = true;
            }
        }
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) gr81Var.b;
            int length = iArr.length;
            int i3 = this.o;
            if (i2 >= length) {
                nba1.c("BaseMediaChunkOutput", "Unmatched track of type: " + i3);
                fb81Var = new np81();
                break;
            }
            if (i3 == iArr[i2]) {
                fb81Var = ed81VarArr[i2];
                break;
            }
            i2++;
        }
        fb81 fb81Var2 = fb81Var;
        fb81Var2.k(this.p);
        try {
            no71 no71Var = this.b;
            long j = this.q;
            long j2 = no71Var.f;
            long Q = bh81Var.Q(no71Var.a(j, j2 == -1 ? -1L : j2 - j));
            if (Q != -1) {
                Q += this.q;
            }
            jz61 w971Var = new w971(this.i, this.q, Q);
            while (true) {
                long j3 = this.q;
                if (i == -1) {
                    fb81Var2.b(this.g, 1, (int) j3, 0, null);
                    xca1.c(bh81Var);
                    this.r = true;
                    return;
                }
                this.q = j3 + i;
                i = fb81Var2.c(w971Var, Integer.MAX_VALUE, true);
            }
        } catch (Throwable th) {
            xca1.c(bh81Var);
            throw th;
        }
    }

    @Override // defpackage.zl61
    public final void b() {
    }

    @Override // defpackage.lm81
    public final boolean d() {
        return this.r;
    }
}
