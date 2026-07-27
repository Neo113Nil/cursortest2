package N7;

import M7.j;
import a.AbstractC0415a;
import com.anythink.core.common.s;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public static final long f2198u;

    /* renamed from: v, reason: collision with root package name */
    public static final long f2199v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f2200w = 0;

    /* renamed from: n, reason: collision with root package name */
    public final long f2201n;

    static {
        int i = b.f2202a;
        f2198u = AbstractC0415a.n(4611686018427387903L);
        f2199v = AbstractC0415a.n(-4611686018427387903L);
    }

    public static final long a(long j9, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j9 + j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return AbstractC0415a.n(AbstractC0415a.i(j13));
        }
        return AbstractC0415a.p((j13 * j11) + (j10 - (j12 * j11)));
    }

    public static final void b(StringBuilder sb, int i, int i4, int i9, String str, boolean z8) {
        sb.append(i);
        if (i4 != 0) {
            sb.append('.');
            String W8 = j.W(i9, String.valueOf(i4));
            int i10 = -1;
            int length = W8.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (W8.charAt(length) != '0') {
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
            if (z8 || i12 >= 3) {
                sb.append((CharSequence) W8, 0, ((i10 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) W8, 0, i12);
            }
        }
        sb.append(str);
    }

    public static final int c(long j9) {
        if (d(j9)) {
            return 0;
        }
        return (((int) j9) & 1) == 1 ? (int) (((j9 >> 1) % 1000) * 1000000) : (int) ((j9 >> 1) % 1000000000);
    }

    public static final boolean d(long j9) {
        return j9 == f2198u || j9 == f2199v;
    }

    public static final long e(long j9, long j10) {
        if (d(j9)) {
            if (!d(j10) || (j10 ^ j9) >= 0) {
                return j9;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (d(j10)) {
            return j10;
        }
        int i = ((int) j9) & 1;
        if (i != (((int) j10) & 1)) {
            return i == 1 ? a(j9 >> 1, j10 >> 1) : a(j10 >> 1, j9 >> 1);
        }
        long j11 = (j9 >> 1) + (j10 >> 1);
        return i == 0 ? (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? AbstractC0415a.n(j11 / 1000000) : AbstractC0415a.p(j11) : AbstractC0415a.o(j11);
    }

    public static final long f(long j9, c unit) {
        h.e(unit, "unit");
        if (j9 == f2198u) {
            return Long.MAX_VALUE;
        }
        if (j9 == f2199v) {
            return Long.MIN_VALUE;
        }
        long j10 = j9 >> 1;
        c sourceUnit = (((int) j9) & 1) == 0 ? c.f2204u : c.f2205v;
        h.e(sourceUnit, "sourceUnit");
        return unit.f2210n.convert(j10, sourceUnit.f2210n);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j9 = ((a) obj).f2201n;
        long j10 = this.f2201n;
        long j11 = j10 ^ j9;
        if (j11 < 0 || (((int) j11) & 1) == 0) {
            return h.g(j10, j9);
        }
        int i = (((int) j10) & 1) - (((int) j9) & 1);
        return j10 < 0 ? -i : i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f2201n == ((a) obj).f2201n;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2201n);
    }

    public final String toString() {
        long j9;
        int f6;
        boolean z8;
        int f9;
        int i;
        long j10 = this.f2201n;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f2198u) {
            return "Infinity";
        }
        if (j10 == f2199v) {
            return "-Infinity";
        }
        boolean z9 = j10 < 0;
        StringBuilder sb = new StringBuilder();
        if (z9) {
            sb.append('-');
        }
        if (j10 < 0) {
            j10 = (((int) j10) & 1) + ((-(j10 >> 1)) << 1);
            int i4 = b.f2202a;
        }
        long f10 = f(j10, c.f2209z);
        if (d(j10)) {
            j9 = 0;
            f6 = 0;
        } else {
            j9 = 0;
            f6 = (int) (f(j10, c.f2208y) % 24);
        }
        if (d(j10)) {
            z8 = z9;
            f9 = 0;
        } else {
            z8 = z9;
            f9 = (int) (f(j10, c.f2207x) % 60);
        }
        int f11 = d(j10) ? 0 : (int) (f(j10, c.f2206w) % 60);
        int c4 = c(j10);
        boolean z10 = f10 != j9;
        boolean z11 = f6 != 0;
        boolean z12 = f9 != 0;
        boolean z13 = (f11 == 0 && c4 == 0) ? false : true;
        if (z10) {
            sb.append(f10);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i9 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(f6);
            sb.append('h');
            i = i9;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i10 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(f9);
            sb.append('m');
            i = i10;
        }
        if (z13) {
            int i11 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (f11 != 0 || z10 || z11 || z12) {
                b(sb, f11, c4, 9, s.f16407a, false);
            } else if (c4 >= 1000000) {
                b(sb, c4 / 1000000, c4 % 1000000, 6, "ms", false);
            } else if (c4 >= 1000) {
                b(sb, c4 / 1000, c4 % 1000, 3, "us", false);
            } else {
                sb.append(c4);
                sb.append("ns");
            }
            i = i11;
        }
        if (z8 && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
