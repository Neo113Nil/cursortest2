package defpackage;

/* loaded from: classes.dex */
public final class ae {
    public static final /* synthetic */ int AARZUJiTa = 0;
    public static final long F7NU4MC0GW;
    public static final long adDC3e2L;
    public static final long oh6vYeIP = defpackage.w70.adDC3e2L(4278190080L);
    public static final long r1MBDhnF;
    public static final long xiZrDbcSW0;
    public final long IHQe1A4L2xu;

    static {
        defpackage.w70.adDC3e2L(4282664004L);
        defpackage.w70.adDC3e2L(4287137928L);
        defpackage.w70.adDC3e2L(4291611852L);
        defpackage.w70.adDC3e2L(4294967295L);
        r1MBDhnF = defpackage.w70.adDC3e2L(4294901760L);
        defpackage.w70.adDC3e2L(4278255360L);
        F7NU4MC0GW = defpackage.w70.adDC3e2L(4278190335L);
        defpackage.w70.adDC3e2L(4294967040L);
        defpackage.w70.adDC3e2L(4278255615L);
        defpackage.w70.adDC3e2L(4294902015L);
        adDC3e2L = defpackage.w70.F7NU4MC0GW(0);
        xiZrDbcSW0 = defpackage.w70.r1MBDhnF(0.0f, 0.0f, 0.0f, 0.0f, defpackage.le.kNAkVymC);
    }

    public /* synthetic */ ae(long j) {
        this.IHQe1A4L2xu = j;
    }

    public static final float AARZUJiTa(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) defpackage.a70.mAr5m2L7gYDP((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = 32768 & s;
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
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i6 + 1056964608) - defpackage.bw.IHQe1A4L2xu;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return java.lang.Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float EXtogiMhuM(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) defpackage.a70.mAr5m2L7gYDP((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = 32768 & s;
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
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i6 + 1056964608) - defpackage.bw.IHQe1A4L2xu;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return java.lang.Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float F7NU4MC0GW(long j) {
        float mAr5m2L7gYDP;
        float f;
        if ((63 & j) == 0) {
            mAr5m2L7gYDP = (float) defpackage.a70.mAr5m2L7gYDP((j >>> 56) & 255);
            f = 255.0f;
        } else {
            mAr5m2L7gYDP = (float) defpackage.a70.mAr5m2L7gYDP((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return mAr5m2L7gYDP / f;
    }

    public static final long IHQe1A4L2xu(long j, defpackage.ie ieVar) {
        defpackage.hi hiVar;
        defpackage.ie xiZrDbcSW02 = xiZrDbcSW0(j);
        int i = xiZrDbcSW02.r1MBDhnF;
        int i2 = ieVar.r1MBDhnF;
        if ((i | i2) < 0) {
            hiVar = defpackage.ci0.EgCjBq0SZwJ(xiZrDbcSW02, ieVar);
        } else {
            defpackage.xk0 xk0Var = defpackage.ii.IHQe1A4L2xu;
            int i3 = i | (i2 << 6);
            java.lang.Object oh6vYeIP2 = xk0Var.oh6vYeIP(i3);
            if (oh6vYeIP2 == null) {
                oh6vYeIP2 = defpackage.ci0.EgCjBq0SZwJ(xiZrDbcSW02, ieVar);
                xk0Var.EXtogiMhuM(i3, oh6vYeIP2);
            }
            hiVar = (defpackage.hi) oh6vYeIP2;
        }
        return hiVar.IHQe1A4L2xu(j);
    }

    public static final float adDC3e2L(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) defpackage.a70.mAr5m2L7gYDP((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = 32768 & s;
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
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i6 + 1056964608) - defpackage.bw.IHQe1A4L2xu;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return java.lang.Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static long oh6vYeIP(long j, float f) {
        return defpackage.w70.r1MBDhnF(EXtogiMhuM(j), AARZUJiTa(j), adDC3e2L(j), f, xiZrDbcSW0(j));
    }

    public static final boolean r1MBDhnF(long j, long j2) {
        return j == j2;
    }

    public static java.lang.String riuEU0zW4(long j) {
        return "Color(" + EXtogiMhuM(j) + ", " + AARZUJiTa(j) + ", " + adDC3e2L(j) + ", " + F7NU4MC0GW(j) + ", " + xiZrDbcSW0(j).IHQe1A4L2xu + ')';
    }

    public static final defpackage.ie xiZrDbcSW0(long j) {
        float[] fArr = defpackage.le.IHQe1A4L2xu;
        return defpackage.le.NHJTzaLwkd[(int) (j & 63)];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ae) {
            return this.IHQe1A4L2xu == ((defpackage.ae) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return riuEU0zW4(this.IHQe1A4L2xu);
    }
}
