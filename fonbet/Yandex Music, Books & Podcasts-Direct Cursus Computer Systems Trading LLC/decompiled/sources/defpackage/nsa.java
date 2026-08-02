package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class nsa implements Comparable {

    @NotNull
    public static final msa b = new msa(null);
    public static final long c;
    public static final long d;
    public final long a;

    static {
        int i = qsa.a;
        c = yd5.t(4611686018427387903L);
        d = yd5.t(-4611686018427387903L);
    }

    public /* synthetic */ nsa(long j) {
        this.a = j;
    }

    public static final long a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return yd5.t(yhn.f(j5, -4611686018427387903L, 4611686018427387903L));
        }
        return yd5.v((j5 * j3) + (j2 - (j4 * j3)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String X = StringsKt.X(i3, String.valueOf(i2));
            int i4 = -1;
            int length = X.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (X.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) X, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) X, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.f(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final double d(long j, long j2) {
        ssa k = k(j);
        ssa k2 = k(j2);
        if (k.compareTo(k2) < 0) {
            k = k2;
        }
        return r(j, k) / r(j2, k);
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final long f(long j) {
        return ((((int) j) & 1) != 1 || l(j)) ? s(j, ssa.MILLISECONDS) : j >> 1;
    }

    public static final int g(long j) {
        if (l(j)) {
            return 0;
        }
        return (int) (s(j, ssa.MINUTES) % 60);
    }

    public static final int h(long j) {
        if (l(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final int i(long j) {
        if (l(j)) {
            return 0;
        }
        return (int) (s(j, ssa.SECONDS) % 60);
    }

    public static final ssa k(long j) {
        return (((int) j) & 1) == 0 ? ssa.NANOSECONDS : ssa.MILLISECONDS;
    }

    public static final boolean l(long j) {
        return j == c || j == d;
    }

    public static final boolean m(long j) {
        return j > 0;
    }

    public static final long n(long j, long j2) {
        return o(j, u(j2));
    }

    public static final long o(long j, long j2) {
        if (l(j)) {
            if (!l(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            xq0.x("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (l(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        return i == 0 ? (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? yd5.t(j3 / 1000000) : yd5.v(j3) : yd5.u(j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
    
        return defpackage.nsa.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        return defpackage.nsa.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long p(int i, long j) {
        if (l(j)) {
            if (i != 0) {
                return i > 0 ? j : u(j);
            }
            xq0.x("Multiplying infinite duration by zero yields an undefined result.");
            return 0L;
        }
        if (i == 0) {
            return 0L;
        }
        long j2 = j >> 1;
        long j3 = i;
        long j4 = j2 * j3;
        if ((((int) j) & 1) == 0) {
            if (-2147483647L <= j2 && j2 < 2147483648L) {
                return yd5.v(j4);
            }
            if (j4 / j3 == j2) {
                return (-4611686018426999999L > j4 || j4 >= 4611686018427000000L) ? yd5.t(j4 / 1000000) : yd5.v(j4);
            }
            long j5 = 1000000;
            long j6 = j2 / j5;
            long j7 = j6 * j3;
            long j8 = (((j2 - (j6 * j5)) * j3) / j5) + j7;
            if (j7 / j3 == j6 && (j8 ^ j7) >= 0) {
                return yd5.t(yhn.g(j8, new lvg(-4611686018427387903L, 4611686018427387903L)));
            }
        } else if (j4 / j3 == j2) {
            return yd5.t(yhn.g(j4, new lvg(-4611686018427387903L, 4611686018427387903L)));
        }
    }

    public static final long q(long j, double d2) {
        int a = eeh.a(d2);
        if (a == d2) {
            return p(a, j);
        }
        ssa k = k(j);
        return yd5.L(r(j, k) * d2, k);
    }

    public static final double r(long j, ssa ssaVar) {
        ssaVar.getClass();
        if (j == c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == d) {
            return Double.NEGATIVE_INFINITY;
        }
        return tsa.a(j >> 1, k(j), ssaVar);
    }

    public static final long s(long j, ssa ssaVar) {
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return ssaVar.a.convert(j >> 1, k(j).a);
    }

    public static String t(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = u(j);
        }
        long s = s(j, ssa.DAYS);
        int s2 = l(j) ? 0 : (int) (s(j, ssa.HOURS) % 24);
        int g = g(j);
        int i2 = i(j);
        int h = h(j);
        boolean z2 = s != 0;
        boolean z3 = s2 != 0;
        boolean z4 = g != 0;
        boolean z5 = (i2 == 0 && h == 0) ? false : true;
        if (z2) {
            sb.append(s);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(s2);
            sb.append('h');
            i = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(g);
            sb.append('m');
            i = i4;
        }
        if (z5) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (i2 != 0 || z2 || z3 || z4) {
                b(sb, i2, h, 9, "s", false);
            } else if (h >= 1000000) {
                b(sb, h / 1000000, h % 1000000, 6, "ms", false);
            } else if (h >= 1000) {
                b(sb, h / 1000, h % 1000, 3, "us", false);
            } else {
                sb.append(h);
                sb.append("ns");
            }
            i = i5;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long u(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = qsa.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.a, ((nsa) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nsa) {
            return this.a == ((nsa) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return t(this.a);
    }
}
