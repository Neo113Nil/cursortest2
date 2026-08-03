package f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final long f2277b = d0.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f2278c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f2279d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2280e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2281f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f2282g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f2283h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f2284i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f2285a;

    static {
        d0.c(4282664004L);
        f2278c = d0.c(4287137928L);
        d0.c(4291611852L);
        f2279d = d0.c(4294967295L);
        f2280e = d0.c(4294901760L);
        d0.c(4278255360L);
        f2281f = d0.c(4278190335L);
        d0.c(4294967040L);
        d0.c(4278255615L);
        d0.c(4294902015L);
        f2282g = d0.b(0);
        f2283h = d0.a(0.0f, 0.0f, 0.0f, 0.0f, g1.d.f2449u);
    }

    public /* synthetic */ q(long j3) {
        this.f2285a = j3;
    }

    public static final long a(long j3, g1.c cVar) {
        g1.g gVar;
        g1.c f10 = f(j3);
        int i10 = f10.f2428c;
        int i11 = cVar.f2428c;
        if ((i10 | i11) < 0) {
            gVar = g1.j.e(f10, cVar);
        } else {
            s.u uVar = g1.h.f2461a;
            int i12 = i10 | (i11 << 6);
            Object b2 = uVar.b(i12);
            if (b2 == null) {
                b2 = g1.j.e(f10, cVar);
                uVar.h(i12, b2);
            }
            gVar = (g1.g) b2;
        }
        return gVar.a(j3);
    }

    public static long b(long j3, float f10) {
        return d0.a(h(j3), g(j3), e(j3), f10, f(j3));
    }

    public static final boolean c(long j3, long j6) {
        return j3 == j6;
    }

    public static final float d(long j3) {
        float Z;
        float f10;
        if ((63 & j3) == 0) {
            Z = (float) x4.f.Z((j3 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            Z = (float) x4.f.Z((j3 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return Z / f10;
    }

    public static final float e(long j3) {
        int i10;
        int i11;
        int i12;
        if ((63 & j3) == 0) {
            return ((float) x4.f.Z((j3 >>> 32) & 255)) / 255.0f;
        }
        short s10 = (short) ((j3 >>> 16) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - t.f2288a;
                return i13 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final g1.c f(long j3) {
        float[] fArr = g1.d.f2429a;
        return g1.d.f2453y[(int) (j3 & 63)];
    }

    public static final float g(long j3) {
        int i10;
        int i11;
        int i12;
        if ((63 & j3) == 0) {
            return ((float) x4.f.Z((j3 >>> 40) & 255)) / 255.0f;
        }
        short s10 = (short) ((j3 >>> 32) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - t.f2288a;
                return i13 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float h(long j3) {
        int i10;
        int i11;
        int i12;
        if ((63 & j3) == 0) {
            return ((float) x4.f.Z((j3 >>> 48) & 255)) / 255.0f;
        }
        short s10 = (short) ((j3 >>> 48) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - t.f2288a;
                return i13 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static String i(long j3) {
        return "Color(" + h(j3) + ", " + g(j3) + ", " + e(j3) + ", " + d(j3) + ", " + f(j3).f2426a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f2285a == ((q) obj).f2285a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2285a);
    }

    public final String toString() {
        return i(this.f2285a);
    }
}
