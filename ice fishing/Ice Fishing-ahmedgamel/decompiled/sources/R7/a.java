package R7;

import Q7.j;
import a.AbstractC0422a;
import com.anythink.core.common.s;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public static final long f2758u;

    /* renamed from: v, reason: collision with root package name */
    public static final long f2759v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f2760w = 0;

    /* renamed from: n, reason: collision with root package name */
    public final long f2761n;

    static {
        int i = b.f2762a;
        f2758u = AbstractC0422a.i(4611686018427387903L);
        f2759v = AbstractC0422a.i(-4611686018427387903L);
    }

    public static final long a(long j6, long j9) {
        long j10 = 1000000;
        long j11 = j9 / j10;
        long j12 = j6 + j11;
        if (-4611686018426L > j12 || j12 >= 4611686018427L) {
            return AbstractC0422a.i(V2.a.b(j12));
        }
        return AbstractC0422a.k((j12 * j10) + (j9 - (j11 * j10)));
    }

    public static final void b(StringBuilder sb, int i, int i6, int i9, String str, boolean z3) {
        sb.append(i);
        if (i6 != 0) {
            sb.append('.');
            String f02 = j.f0(i9, String.valueOf(i6));
            int i10 = -1;
            int length = f02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (f02.charAt(length) != '0') {
                        i10 = length;
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        length = i11;
                    }
                }
            }
            int i12 = i10 + 1;
            if (z3 || i12 >= 3) {
                sb.append((CharSequence) f02, 0, ((i10 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) f02, 0, i12);
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
        return j6 == f2758u || j6 == f2759v;
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
        return i == 0 ? (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? AbstractC0422a.i(j10 / 1000000) : AbstractC0422a.k(j10) : AbstractC0422a.j(j10);
    }

    public static final long f(long j6, c unit) {
        h.e(unit, "unit");
        if (j6 == f2758u) {
            return Long.MAX_VALUE;
        }
        if (j6 == f2759v) {
            return Long.MIN_VALUE;
        }
        long j9 = j6 >> 1;
        c sourceUnit = (((int) j6) & 1) == 0 ? c.f2764u : c.f2765v;
        h.e(sourceUnit, "sourceUnit");
        return unit.f2770n.convert(j9, sourceUnit.f2770n);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = ((a) obj).f2761n;
        long j9 = this.f2761n;
        long j10 = j9 ^ j6;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return h.g(j9, j6);
        }
        int i = (((int) j9) & 1) - (((int) j6) & 1);
        return j9 < 0 ? -i : i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f2761n == ((a) obj).f2761n;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2761n);
    }

    public final String toString() {
        long j6;
        int f3;
        boolean z3;
        int f9;
        int i;
        long j9 = this.f2761n;
        if (j9 == 0) {
            return "0s";
        }
        if (j9 == f2758u) {
            return "Infinity";
        }
        if (j9 == f2759v) {
            return "-Infinity";
        }
        boolean z6 = j9 < 0;
        StringBuilder sb = new StringBuilder();
        if (z6) {
            sb.append('-');
        }
        if (j9 < 0) {
            j9 = (((int) j9) & 1) + ((-(j9 >> 1)) << 1);
            int i6 = b.f2762a;
        }
        long f10 = f(j9, c.f2769z);
        if (d(j9)) {
            j6 = 0;
            f3 = 0;
        } else {
            j6 = 0;
            f3 = (int) (f(j9, c.f2768y) % 24);
        }
        if (d(j9)) {
            z3 = z6;
            f9 = 0;
        } else {
            z3 = z6;
            f9 = (int) (f(j9, c.f2767x) % 60);
        }
        int f11 = d(j9) ? 0 : (int) (f(j9, c.f2766w) % 60);
        int c9 = c(j9);
        boolean z9 = f10 != j6;
        boolean z10 = f3 != 0;
        boolean z11 = f9 != 0;
        boolean z12 = (f11 == 0 && c9 == 0) ? false : true;
        if (z9) {
            sb.append(f10);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z10 || (z9 && (z11 || z12))) {
            int i9 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(f3);
            sb.append('h');
            i = i9;
        }
        if (z11 || (z12 && (z10 || z9))) {
            int i10 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(f9);
            sb.append('m');
            i = i10;
        }
        if (z12) {
            int i11 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (f11 != 0 || z9 || z10 || z11) {
                b(sb, f11, c9, 9, s.f16249a, false);
            } else if (c9 >= 1000000) {
                b(sb, c9 / 1000000, c9 % 1000000, 6, "ms", false);
            } else if (c9 >= 1000) {
                b(sb, c9 / 1000, c9 % 1000, 3, "us", false);
            } else {
                sb.append(c9);
                sb.append("ns");
            }
            i = i11;
        }
        if (z3 && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
