package com.gamericefishpro.space.ni;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Comparable {
    public static final a d = new a(null);
    public static final long e;
    public static final long i;

    static {
        int i2 = c.a;
        e = com.gamericefishpro.space.u6.f.r(4611686018427387903L);
        i = com.gamericefishpro.space.u6.f.r(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return com.gamericefishpro.space.u6.f.r(com.gamericefishpro.space.ji.f.d(j5));
        }
        long j6 = ((j5 * j3) + (j2 - (j4 * j3))) << 1;
        int i2 = c.a;
        return j6;
    }

    public static final void b(StringBuilder sb, int i2, int i3, int i4, String str, boolean z) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String strX = StringsKt.x(i4, String.valueOf(i3));
            int i5 = -1;
            int length = strX.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (strX.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) strX, 0, ((i5 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strX, 0, i7);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final boolean c(long j) {
        return j == e || j == i;
    }

    public static final long d(long j, long j2) {
        if (c(j)) {
            if (!c(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (c(j2)) {
            return j2;
        }
        int i2 = ((int) j) & 1;
        if (i2 != (((int) j2) & 1)) {
            return i2 == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        if (i2 == 0) {
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return com.gamericefishpro.space.u6.f.r(j3 / ((long) 1000000));
            }
            long j4 = j3 << 1;
            int i3 = c.a;
            return j4;
        }
        if (-4611686018426L > j3 || j3 >= 4611686018427L) {
            return com.gamericefishpro.space.u6.f.r(com.gamericefishpro.space.ji.f.d(j3));
        }
        long j5 = (j3 * ((long) 1000000)) << 1;
        int i4 = c.a;
        return j5;
    }

    public static final long e(long j, d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == e) {
            return Long.MAX_VALUE;
        }
        if (j == i) {
            return Long.MIN_VALUE;
        }
        return e.a(j >> 1, (((int) j) & 1) == 0 ? d.NANOSECONDS : d.MILLISECONDS, unit);
    }

    public static final long f(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i2 = c.a;
        return j2;
    }
}
