package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import yads.t31;

/* loaded from: classes7.dex */
public final class vu81 extends xg71 {
    public final cq61 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final t31 o;
    public final xb71 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public lm81 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu81(tu71 tu71Var, int[] iArr, cq61 cq61Var, t31 t31Var) {
        super(tu71Var, iArr);
        xb71 xb71Var = ut71.a;
        this.g = cq61Var;
        this.h = 10000000L;
        this.i = 25000000L;
        this.j = 25000000L;
        this.k = sk51.DEFAULT_MAX_WIDTH_TO_DISCARD;
        this.l = sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = t31.m(t31Var);
        this.p = xb71Var;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void h(long[] jArr, ArrayList arrayList) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            a181 a181Var = (a181) arrayList.get(i);
            if (a181Var != null) {
                a181Var.d(new mo81(j, jArr[i]));
            }
        }
    }

    @Override // defpackage.xg71, defpackage.gk71
    public final void a() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.xg71, defpackage.gk71
    public final void b() {
        this.u = null;
    }

    @Override // defpackage.gk71
    public final int e() {
        return this.s;
    }

    public final int f(long j) {
        long j2;
        cj71 cj71Var = (cj71) this.g;
        synchronized (cj71Var) {
            j2 = cj71Var.l;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((mo81) this.o.get(i)).a < j4) {
                i++;
            }
            mo81 mo81Var = (mo81) this.o.get(i - 1);
            mo81 mo81Var2 = (mo81) this.o.get(i);
            long j5 = mo81Var.a;
            long j6 = mo81Var.b;
            j4 = j6 + ((long) (((j4 - j5) / (mo81Var2.a - j5)) * (mo81Var2.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !q(i3, j)) {
                if (this.d[i3].A <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.xg71, defpackage.gk71
    public final void l(float f) {
        this.q = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r11 != (-9223372036854775807L)) goto L12;
     */
    @Override // defpackage.gk71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(long j, long j2, long j3, List list, gc81[] gc81VarArr) {
        long j4;
        long j5;
        long j6;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        if (i >= gc81VarArr.length || !gc81VarArr[i].next()) {
            int length = gc81VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    gc81 gc81Var = gc81VarArr[i2];
                    if (gc81Var.next()) {
                        j6 = gc81Var.a();
                        j5 = gc81Var.b();
                        break;
                    }
                    i2++;
                } else {
                    if (!list.isEmpty()) {
                        lm81 lm81Var = (lm81) jla1.g(list);
                        j5 = lm81Var.g;
                        if (j5 != -9223372036854775807L) {
                            j6 = lm81Var.h;
                        }
                    }
                    j4 = -9223372036854775807L;
                }
            }
            j4 = j6 - j5;
        } else {
            gc81 gc81Var2 = gc81VarArr[this.r];
            j4 = gc81Var2.a() - gc81Var2.b();
        }
        int i3 = this.s;
        if (i3 == 0) {
            this.s = 1;
            this.r = f(elapsedRealtime);
            return;
        }
        int i4 = this.r;
        int k = list.isEmpty() ? -1 : k(((lm81) jla1.g(list)).d);
        if (k != -1) {
            i3 = ((lm81) jla1.g(list)).e;
            i4 = k;
        }
        int f = f(elapsedRealtime);
        if (!q(i4, elapsedRealtime)) {
            qd81[] qd81VarArr = this.d;
            qd81 qd81Var = qd81VarArr[i4];
            qd81 qd81Var2 = qd81VarArr[f];
            long j7 = this.h;
            if (j3 != -9223372036854775807L) {
                j7 = Math.min((long) ((j4 != -9223372036854775807L ? j3 - j4 : j3) * this.n), j7);
            }
            int i5 = qd81Var2.A;
            int i6 = qd81Var.A;
            if ((i5 > i6 && j2 < j7) || (i5 < i6 && j2 >= this.i)) {
                f = i4;
            }
        }
        if (f != i4) {
            i3 = 3;
        }
        this.s = i3;
        this.r = f;
    }

    @Override // defpackage.xg71, defpackage.gk71
    public final int p(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((lm81) jla1.g(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (lm81) jla1.g(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long j3 = ((lm81) list.get(size - 1)).g - j;
        float f = this.q;
        int i3 = rf71.a;
        if (f != 1.0f) {
            j3 = Math.round(j3 / f);
        }
        long j4 = this.j;
        if (j3 >= j4) {
            if (!list.isEmpty()) {
                long j5 = ((lm81) jla1.g(list)).g;
            }
            qd81 qd81Var = this.d[f(elapsedRealtime)];
            for (int i4 = 0; i4 < size; i4++) {
                lm81 lm81Var = (lm81) list.get(i4);
                qd81 qd81Var2 = lm81Var.d;
                long j6 = lm81Var.g - j;
                float f2 = this.q;
                if (f2 != 1.0f) {
                    j6 = Math.round(j6 / f2);
                }
                if (j6 >= j4 && qd81Var2.A < qd81Var.A && (i = qd81Var2.K) != -1 && i <= this.l && (i2 = qd81Var2.J) != -1 && i2 <= this.k && i < qd81Var.K) {
                    return i4;
                }
            }
        }
        return size;
    }

    @Override // defpackage.gk71
    public final Object h() {
        return null;
    }

    @Override // defpackage.gk71
    public final int f() {
        return this.r;
    }
}
