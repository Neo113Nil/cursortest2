package defpackage;

import android.util.Pair;

/* loaded from: classes7.dex */
public abstract class yn81 implements kq71 {
    public static final cb81 b = new cb81();

    public abstract int a();

    public abstract int a(Object obj);

    public final Pair a(uk81 uk81Var, ie81 ie81Var, int i, long j, long j2) {
        cha1.a(i, b());
        a(i, uk81Var, j2);
        if (j == -9223372036854775807L) {
            j = uk81Var.E;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = uk81Var.G;
        a(i2, ie81Var, false);
        while (i2 < uk81Var.H && ie81Var.x != j) {
            int i3 = i2 + 1;
            if (a(i3, ie81Var, false).x > j) {
                break;
            }
            i2 = i3;
        }
        a(i2, ie81Var, true);
        long j3 = j - ie81Var.x;
        long j4 = ie81Var.w;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = ie81Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public abstract ie81 a(int i, ie81 ie81Var, boolean z);

    public abstract Object a(int i);

    public abstract uk81 a(int i, uk81 uk81Var, long j);

    public abstract int b();

    public int b(boolean z) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean c() {
        return b() == 0;
    }

    public final boolean equals(Object obj) {
        int b2;
        if (this != obj) {
            if (obj instanceof yn81) {
                yn81 yn81Var = (yn81) obj;
                if (yn81Var.b() == b() && yn81Var.a() == a()) {
                    uk81 uk81Var = new uk81();
                    ie81 ie81Var = new ie81();
                    uk81 uk81Var2 = new uk81();
                    ie81 ie81Var2 = new ie81();
                    int i = 0;
                    while (true) {
                        if (i >= b()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= a()) {
                                    int a = a(true);
                                    if (a == yn81Var.a(true) && (b2 = b(true)) == yn81Var.b(true)) {
                                        while (a != b2) {
                                            int a2 = a(a, 0, true);
                                            if (a2 == yn81Var.a(a, 0, true)) {
                                                a = a2;
                                            }
                                        }
                                    }
                                } else {
                                    if (!a(i2, ie81Var, true).equals(yn81Var.a(i2, ie81Var2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!a(i, uk81Var, 0L).equals(yn81Var.a(i, uk81Var2, 0L))) {
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

    public final int hashCode() {
        uk81 uk81Var = new uk81();
        ie81 ie81Var = new ie81();
        int b2 = b() + 217;
        for (int i = 0; i < b(); i++) {
            b2 = (b2 * 31) + a(i, uk81Var, 0L).hashCode();
        }
        int a = a() + (b2 * 31);
        for (int i2 = 0; i2 < a(); i2++) {
            a = (a * 31) + a(i2, ie81Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            a = (a * 31) + a2;
            a2 = a(a2, 0, true);
        }
        return a;
    }

    public int a(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == b(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == b(z) ? a(z) : i + 1;
        }
        ny61.k();
        return 0;
    }

    public int a(int i, int i2) {
        if (i2 == 0) {
            if (i == a(false)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(false) ? b(false) : i - 1;
        }
        ny61.k();
        return 0;
    }

    public int a(boolean z) {
        return c() ? -1 : 0;
    }

    public final Pair a(uk81 uk81Var, ie81 ie81Var, int i, long j) {
        Pair a = a(uk81Var, ie81Var, i, j, 0L);
        a.getClass();
        return a;
    }

    public ie81 a(Object obj, ie81 ie81Var) {
        return a(a(obj), ie81Var, true);
    }

    public final int a(int i, ie81 ie81Var, uk81 uk81Var, int i2, boolean z) {
        int i3 = a(i, ie81Var, false).c;
        if (a(i3, uk81Var, 0L).H != i) {
            return i + 1;
        }
        int a = a(i3, i2, z);
        if (a == -1) {
            return -1;
        }
        return a(a, uk81Var, 0L).G;
    }
}
