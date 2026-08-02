package R7;

import Q7.j;
import S0.f;
import com.anythink.core.common.s;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public static final long f2885u;

    /* renamed from: v, reason: collision with root package name */
    public static final long f2886v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f2887w = 0;

    /* renamed from: n, reason: collision with root package name */
    public final long f2888n;

    static {
        int i = b.f2889a;
        f2885u = f.j(4611686018427387903L);
        f2886v = f.j(-4611686018427387903L);
    }

    public static final long a(long j6, long j9) {
        long j10 = 1000000;
        long j11 = j9 / j10;
        long j12 = j6 + j11;
        if (-4611686018426L > j12 || j12 >= 4611686018427L) {
            return f.j(f.f(j12));
        }
        return f.l((j12 * j10) + (j9 - (j11 * j10)));
    }

    public static final void b(StringBuilder sb, int i, int i4, int i6, String str, boolean z6) {
        sb.append(i);
        if (i4 != 0) {
            sb.append('.');
            String v02 = j.v0(i6, String.valueOf(i4));
            int i9 = -1;
            int length = v02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (v02.charAt(length) != '0') {
                        i9 = length;
                        break;
                    } else if (i10 < 0) {
                        break;
                    } else {
                        length = i10;
                    }
                }
            }
            int i11 = i9 + 1;
            if (z6 || i11 >= 3) {
                sb.append((CharSequence) v02, 0, ((i9 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) v02, 0, i11);
            }
        }
        sb.append(str);
    }

    public static final int c(long j6) {
        if (d(j6)) {
            return 0;
        }
        return (((int) j6) & 1) == 1 ? (int) (((j6 >> 1) % 1000) * 1000000) : (int) ((j6 >> 1) % 1000000000);
    }

    public static final boolean d(long j6) {
        return j6 == f2885u || j6 == f2886v;
    }

    public static final long e(long j6, long j9) {
        if (d(j6)) {
            if (!d(j9) || (j9 ^ j6) >= 0) {
                return j6;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (d(j9)) {
            return j9;
        }
        int i = ((int) j6) & 1;
        if (i != (((int) j9) & 1)) {
            return i == 1 ? a(j6 >> 1, j9 >> 1) : a(j9 >> 1, j6 >> 1);
        }
        long j10 = (j6 >> 1) + (j9 >> 1);
        return i == 0 ? (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? f.j(j10 / 1000000) : f.l(j10) : f.k(j10);
    }

    public static final long f(long j6, c unit) {
        h.e(unit, "unit");
        if (j6 == f2885u) {
            return Long.MAX_VALUE;
        }
        if (j6 == f2886v) {
            return Long.MIN_VALUE;
        }
        long j9 = j6 >> 1;
        c sourceUnit = (((int) j6) & 1) == 0 ? c.f2891u : c.f2892v;
        h.e(sourceUnit, "sourceUnit");
        return unit.f2897n.convert(j9, sourceUnit.f2897n);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = ((a) obj).f2888n;
        long j9 = this.f2888n;
        long j10 = j9 ^ j6;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return h.g(j9, j6);
        }
        int i = (((int) j9) & 1) - (((int) j6) & 1);
        return j9 < 0 ? -i : i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f2888n == ((a) obj).f2888n;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2888n);
    }

    public final String toString() {
        long j6;
        int f2;
        boolean z6;
        int f9;
        int i;
        long j9 = this.f2888n;
        if (j9 == 0) {
            return "0s";
        }
        if (j9 == f2885u) {
            return "Infinity";
        }
        if (j9 == f2886v) {
            return "-Infinity";
        }
        boolean z9 = j9 < 0;
        StringBuilder sb = new StringBuilder();
        if (z9) {
            sb.append('-');
        }
        if (j9 < 0) {
            j9 = (((int) j9) & 1) + ((-(j9 >> 1)) << 1);
            int i4 = b.f2889a;
        }
        long f10 = f(j9, c.f2896z);
        if (d(j9)) {
            j6 = 0;
            f2 = 0;
        } else {
            j6 = 0;
            f2 = (int) (f(j9, c.f2895y) % 24);
        }
        if (d(j9)) {
            z6 = z9;
            f9 = 0;
        } else {
            z6 = z9;
            f9 = (int) (f(j9, c.f2894x) % 60);
        }
        int f11 = d(j9) ? 0 : (int) (f(j9, c.f2893w) % 60);
        int c9 = c(j9);
        boolean z10 = f10 != j6;
        boolean z11 = f2 != 0;
        boolean z12 = f9 != 0;
        boolean z13 = (f11 == 0 && c9 == 0) ? false : true;
        if (z10) {
            sb.append(f10);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i6 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(f2);
            sb.append('h');
            i = i6;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i9 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(f9);
            sb.append('m');
            i = i9;
        }
        if (z13) {
            int i10 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (f11 != 0 || z10 || z11 || z12) {
                b(sb, f11, c9, 9, s.f17036a, false);
            } else if (c9 >= 1000000) {
                b(sb, c9 / 1000000, c9 % 1000000, 6, "ms", false);
            } else if (c9 >= 1000) {
                b(sb, c9 / 1000, c9 % 1000, 3, "us", false);
            } else {
                sb.append(c9);
                sb.append("ns");
            }
            i = i10;
        }
        if (z6 && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
