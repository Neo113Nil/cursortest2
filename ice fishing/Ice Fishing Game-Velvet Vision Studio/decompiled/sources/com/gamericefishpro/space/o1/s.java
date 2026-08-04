package com.gamericefishpro.space.o1;

import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final long b = o.c(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        o.c(4282664004L);
        o.c(4287137928L);
        o.c(4291611852L);
        c = o.c(4294967295L);
        d = o.c(4294901760L);
        o.c(4278255360L);
        e = o.c(4278190335L);
        o.c(4294967040L);
        o.c(4278255615L);
        o.c(4294902015L);
        f = o.b(0);
        g = o.a(0.0f, 0.0f, 0.0f, 0.0f, com.gamericefishpro.space.p1.d.u);
    }

    public /* synthetic */ s(long j) {
        this.a = j;
    }

    public static final /* synthetic */ s a(long j) {
        return new s(j);
    }

    public static final long b(long j, com.gamericefishpro.space.p1.c cVar) {
        com.gamericefishpro.space.p1.g gVarE;
        com.gamericefishpro.space.p1.c cVarG = g(j);
        int i = cVarG.c;
        int i2 = cVar.c;
        if ((i | i2) < 0) {
            gVarE = com.gamericefishpro.space.p1.j.e(cVarG, cVar);
        } else {
            com.gamericefishpro.space.t.w wVar = com.gamericefishpro.space.p1.h.a;
            int i3 = i | (i2 << 6);
            Object objB = wVar.b(i3);
            if (objB == null) {
                objB = com.gamericefishpro.space.p1.j.e(cVarG, cVar);
                wVar.h(i3, objB);
            }
            gVarE = (com.gamericefishpro.space.p1.g) objB;
        }
        return gVarE.a(j);
    }

    public static long c(long j, float f2) {
        return o.a(i(j), h(j), f(j), f2, g(j));
    }

    public static final boolean d(long j, long j2) {
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return j == j2;
    }

    public static final float e(long j) {
        float fG;
        float f2;
        long j2 = 63 & j;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        if (j2 == 0) {
            fG = (float) com.gamericefishpro.space.a.a.G((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fG = (float) com.gamericefishpro.space.a.a.G((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fG / f2;
    }

    public static final float f(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        if (j2 == 0) {
            return ((float) com.gamericefishpro.space.a.a.G((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - u.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final com.gamericefishpro.space.p1.c g(long j) {
        float[] fArr = com.gamericefishpro.space.p1.d.a;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return com.gamericefishpro.space.p1.d.y[(int) (j & 63)];
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        if (j2 == 0) {
            return ((float) com.gamericefishpro.space.a.a.G((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - u.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float i(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        if (j2 == 0) {
            return ((float) com.gamericefishpro.space.a.a.G((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - u.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String j(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(i(j));
        sb.append(", ");
        sb.append(h(j));
        sb.append(", ");
        sb.append(f(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        return y0.i(sb, g(j).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.a == ((s) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return j(this.a);
    }
}
