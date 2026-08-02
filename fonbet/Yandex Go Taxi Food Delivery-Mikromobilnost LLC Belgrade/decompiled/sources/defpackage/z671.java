package defpackage;

import yads.lk0;

/* loaded from: classes7.dex */
public final class z671 implements dg81 {
    public final int a;
    public final /* synthetic */ ng71 b;

    public z671(ng71 ng71Var, int i) {
        this.b = ng71Var;
        this.a = i;
    }

    @Override // defpackage.dg81
    public final void a() {
        int i = this.a;
        ng71 ng71Var = this.b;
        ji41 ji41Var = ng71Var.L[i].g;
        if (ji41Var != null) {
            throw ((lk0) ji41Var.b);
        }
        t671 t671Var = ng71Var.D;
        ll81 ll81Var = ng71Var.w;
        int i2 = ng71Var.U;
        ll81Var.getClass();
        t671Var.b(i2 == 7 ? 6 : 3);
    }

    @Override // defpackage.dg81
    public final int b(og81 og81Var, yh81 yh81Var, int i) {
        ng71 ng71Var = this.b;
        if (ng71Var.W || ng71Var.c0 != -9223372036854775807L) {
            return -3;
        }
        ng71Var.m();
        s421 s421Var = ng71Var.Q;
        boolean[] zArr = (boolean[]) s421Var.x;
        int i2 = this.a;
        if (!zArr[i2]) {
            qd81 qd81Var = ((wx71) s421Var.b).a(i2).w[0];
            sc81 sc81Var = ng71Var.x;
            sc81Var.b(new pil0(1, g681.e(qd81Var.E), qd81Var, 0, null, sc81Var.a(ng71Var.b0), -9223372036854775807L));
            zArr[i2] = true;
        }
        int e = ng71Var.L[i2].e(og81Var, yh81Var, i, ng71Var.f0);
        if (e == -3) {
            ng71Var.d(i2);
        }
        return e;
    }

    @Override // defpackage.dg81
    public final boolean c() {
        ng71 ng71Var = this.b;
        return !ng71Var.W && ng71Var.c0 == -9223372036854775807L && ng71Var.L[this.a].j(ng71Var.f0);
    }

    @Override // defpackage.dg81
    public final int d(long j) {
        ng71 ng71Var = this.b;
        int i = this.a;
        if (ng71Var.W || ng71Var.c0 != -9223372036854775807L) {
            return 0;
        }
        ng71Var.m();
        s421 s421Var = ng71Var.Q;
        boolean[] zArr = (boolean[]) s421Var.x;
        if (!zArr[i]) {
            qd81 qd81Var = ((wx71) s421Var.b).a(i).w[0];
            sc81 sc81Var = ng71Var.x;
            sc81Var.b(new pil0(1, g681.e(qd81Var.E), qd81Var, 0, null, sc81Var.a(ng71Var.b0), -9223372036854775807L));
            zArr[i] = true;
        }
        ed81 ed81Var = ng71Var.L[i];
        int l = ed81Var.l(j, ng71Var.f0);
        synchronized (ed81Var) {
            if (l >= 0) {
                int i2 = ed81Var.r + l;
                if (i2 <= ed81Var.o) {
                    ed81Var.r = i2;
                }
            }
            throw new IllegalArgumentException();
        }
        if (l == 0) {
            ng71Var.d(i);
        }
        return l;
    }
}
