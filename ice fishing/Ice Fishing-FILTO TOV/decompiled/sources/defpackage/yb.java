package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yb {
    public static final long AvO7iQsrTN;
    public static final long EljAMC1QTz;
    public static final long OOA6hdeuvCS;
    public static final long X1lG3V04pd;
    public static final long Yi7zF1RB1 = ki1.xqGvceK5x(4278190080L);
    public static final /* synthetic */ int encWxUiV2 = 0;
    public static final long xqGvceK5x;
    public final long GWasM1elztuh;

    static {
        ki1.xqGvceK5x(4282664004L);
        ki1.xqGvceK5x(4287137928L);
        ki1.xqGvceK5x(4291611852L);
        X1lG3V04pd = ki1.xqGvceK5x(4294967295L);
        xqGvceK5x = ki1.xqGvceK5x(4294901760L);
        ki1.xqGvceK5x(4278255360L);
        OOA6hdeuvCS = ki1.xqGvceK5x(4278190335L);
        ki1.xqGvceK5x(4294967040L);
        ki1.xqGvceK5x(4278255615L);
        ki1.xqGvceK5x(4294902015L);
        EljAMC1QTz = ki1.X1lG3V04pd(0);
        AvO7iQsrTN = ki1.Yi7zF1RB1(0.0f, 0.0f, 0.0f, 0.0f, jc.Y6hRI1cF8);
    }

    public /* synthetic */ yb(long j) {
        this.GWasM1elztuh = j;
    }

    public static final float AvO7iQsrTN(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) n4.Y6hRI1cF8((j >>> 40) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - fs.GWasM1elztuh;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final gc EljAMC1QTz(long j) {
        float[] fArr = jc.GWasM1elztuh;
        return jc.WRKkgoJXwDn[(int) (j & 63)];
    }

    public static final long GWasM1elztuh(long j, gc gcVar) {
        bg bgVar;
        gc EljAMC1QTz2 = EljAMC1QTz(j);
        int i = EljAMC1QTz2.X1lG3V04pd;
        int i2 = gcVar.X1lG3V04pd;
        if ((i | i2) < 0) {
            bgVar = qj.WIEu4Ya2g8(EljAMC1QTz2, gcVar);
        } else {
            rf0 rf0Var = cg.GWasM1elztuh;
            int i3 = i | (i2 << 6);
            Object Yi7zF1RB12 = rf0Var.Yi7zF1RB1(i3);
            if (Yi7zF1RB12 == null) {
                Yi7zF1RB12 = qj.WIEu4Ya2g8(EljAMC1QTz2, gcVar);
                rf0Var.encWxUiV2(i3, Yi7zF1RB12);
            }
            bgVar = (bg) Yi7zF1RB12;
        }
        return bgVar.GWasM1elztuh(j);
    }

    public static final float OOA6hdeuvCS(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) n4.Y6hRI1cF8((j >>> 32) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - fs.GWasM1elztuh;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final boolean X1lG3V04pd(long j, long j2) {
        return j == j2;
    }

    public static long Yi7zF1RB1(float f, long j) {
        return ki1.Yi7zF1RB1(encWxUiV2(j), AvO7iQsrTN(j), OOA6hdeuvCS(j), f, EljAMC1QTz(j));
    }

    public static final float encWxUiV2(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) n4.Y6hRI1cF8((j >>> 48) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - fs.GWasM1elztuh;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String mOu10nynGul(long j) {
        return "Color(" + encWxUiV2(j) + ", " + AvO7iQsrTN(j) + ", " + OOA6hdeuvCS(j) + ", " + xqGvceK5x(j) + ", " + EljAMC1QTz(j).GWasM1elztuh + ')';
    }

    public static final float xqGvceK5x(long j) {
        float Y6hRI1cF8;
        float f;
        if ((63 & j) == 0) {
            Y6hRI1cF8 = (float) n4.Y6hRI1cF8((j >>> 56) & 255);
            f = 255.0f;
        } else {
            Y6hRI1cF8 = (float) n4.Y6hRI1cF8((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return Y6hRI1cF8 / f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yb) {
            return this.GWasM1elztuh == ((yb) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return mOu10nynGul(this.GWasM1elztuh);
    }
}
