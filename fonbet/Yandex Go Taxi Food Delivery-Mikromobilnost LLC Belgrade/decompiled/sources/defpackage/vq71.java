package defpackage;

import java.util.ArrayList;
import yads.kv;

/* loaded from: classes7.dex */
public final class vq71 extends i571 {
    public final qv81 S;
    public final long T;
    public final long U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final ArrayList Y;
    public final uk81 Z;
    public al71 a0;
    public kv b0;
    public long c0;
    public long d0;

    public vq71(qv81 qv81Var, long j, long j2, boolean z, boolean z2, boolean z3) {
        if (j < 0) {
            w511.q();
            throw null;
        }
        qv81Var.getClass();
        this.S = qv81Var;
        this.T = j;
        this.U = j2;
        this.V = z;
        this.W = z2;
        this.X = z3;
        this.Y = new ArrayList();
        this.Z = new uk81();
    }

    @Override // defpackage.qv81
    public final void a(ra71 ra71Var) {
        ArrayList arrayList = this.Y;
        if (!arrayList.remove(ra71Var)) {
            ny61.k();
            return;
        }
        this.S.a(((oh71) ra71Var).a);
        if (!arrayList.isEmpty() || this.W) {
            return;
        }
        al71 al71Var = this.a0;
        al71Var.getClass();
        i(al71Var.a);
    }

    @Override // defpackage.qv81
    public final op81 c() {
        return this.S.c();
    }

    @Override // defpackage.i571, defpackage.qv81
    public final void d() {
        kv kvVar = this.b0;
        if (kvVar != null) {
            throw kvVar;
        }
        super.d();
    }

    @Override // defpackage.i571, defpackage.qv81
    public final void e() {
        super.e();
        this.b0 = null;
        this.a0 = null;
    }

    @Override // defpackage.i571
    public final void h(Object obj, qv81 qv81Var, yn81 yn81Var) {
        if (this.b0 != null) {
            return;
        }
        i(yn81Var);
    }

    public final void i(yn81 yn81Var) {
        long j;
        long j2;
        long j3;
        uk81 uk81Var = this.Z;
        yn81Var.a(0, uk81Var, 0L);
        long j4 = uk81Var.I;
        al71 al71Var = this.a0;
        long j5 = this.U;
        ArrayList arrayList = this.Y;
        if (al71Var == null || arrayList.isEmpty() || this.W) {
            boolean z = this.X;
            long j6 = this.T;
            if (z) {
                long j7 = uk81Var.E;
                j6 += j7;
                j = j7 + j5;
            } else {
                j = j5;
            }
            this.c0 = j4 + j6;
            this.d0 = j5 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                oh71 oh71Var = (oh71) arrayList.get(i);
                long j8 = this.c0;
                long j9 = this.d0;
                oh71Var.x = j8;
                oh71Var.y = j9;
            }
            j2 = j6;
            j3 = j;
        } else {
            long j10 = this.c0 - j4;
            j3 = j5 != Long.MIN_VALUE ? this.d0 - j4 : Long.MIN_VALUE;
            j2 = j10;
        }
        try {
            al71 al71Var2 = new al71(yn81Var, j2, j3);
            this.a0 = al71Var2;
            a(al71Var2);
        } catch (kv e) {
            this.b0 = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((oh71) arrayList.get(i2)).z = this.b0;
            }
        }
    }

    @Override // defpackage.qv81
    public final ra71 a(v281 v281Var, xi71 xi71Var, long j) {
        oh71 oh71Var = new oh71(this.S.a(v281Var, xi71Var, j), this.V, this.c0, this.d0);
        this.Y.add(oh71Var);
        return oh71Var;
    }

    @Override // defpackage.qv81
    public final void a(mr81 mr81Var) {
        this.R = mr81Var;
        this.Q = rf71.i(null);
        g(null, this.S);
    }
}
