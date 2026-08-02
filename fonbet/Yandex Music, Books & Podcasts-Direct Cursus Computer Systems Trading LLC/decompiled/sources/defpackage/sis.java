package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class sis {
    public static final mis a = new mis();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        int i = dvt.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, ois oisVar, ris risVar, int i2, boolean z) {
        int i3 = f(i, oisVar, false).c;
        if (m(i3, risVar, 0L).o != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return m(e, risVar, 0L).n;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        e7o.n();
        return 0;
    }

    public boolean equals(Object obj) {
        int c2;
        if (this != obj) {
            if (obj instanceof sis) {
                sis sisVar = (sis) obj;
                if (sisVar.o() == o() && sisVar.h() == h()) {
                    ris risVar = new ris();
                    ois oisVar = new ois();
                    ris risVar2 = new ris();
                    ois oisVar2 = new ois();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= h()) {
                                    int a2 = a(true);
                                    if (a2 == sisVar.a(true) && (c2 = c(true)) == sisVar.c(true)) {
                                        while (a2 != c2) {
                                            int e = e(a2, 0, true);
                                            if (e == sisVar.e(a2, 0, true)) {
                                                a2 = e;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i2, oisVar, true).equals(sisVar.f(i2, oisVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!m(i, risVar, 0L).equals(sisVar.m(i, risVar2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract ois f(int i, ois oisVar, boolean z);

    public ois g(Object obj, ois oisVar) {
        return f(b(obj), oisVar, true);
    }

    public abstract int h();

    public int hashCode() {
        ris risVar = new ris();
        ois oisVar = new ois();
        int o = o() + 217;
        for (int i = 0; i < o(); i++) {
            o = (o * 31) + m(i, risVar, 0L).hashCode();
        }
        int h = h() + (o * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            h = (h * 31) + f(i2, oisVar, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(ris risVar, ois oisVar, int i, long j) {
        Pair j2 = j(risVar, oisVar, i, j, 0L);
        j2.getClass();
        return j2;
    }

    public final Pair j(ris risVar, ois oisVar, int i, long j, long j2) {
        vq1.w(i, o());
        m(i, risVar, j2);
        if (j == -9223372036854775807L) {
            j = risVar.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = risVar.n;
        f(i2, oisVar, false);
        while (i2 < risVar.o && oisVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, oisVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, oisVar, true);
        long j3 = j - oisVar.e;
        long j4 = oisVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = oisVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        e7o.n();
        return 0;
    }

    public abstract Object l(int i);

    public abstract ris m(int i, ris risVar, long j);

    public final void n(int i, ris risVar) {
        m(i, risVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
