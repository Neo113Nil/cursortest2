package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pf {
    public static final long JhCgjQRTAOCT;
    public static final /* synthetic */ int P05cfTpS5W5L = 0;
    public static final long QiMR8OkAhezm;
    public static final long WDYagTQQm9ns;
    public static final long fWTAfUmVKrZq;
    public static final long giKS3J6vZuNy = defpackage.ok0.WDYagTQQm9ns(4278190080L);
    public static final long oh71FJcDz6S2;
    public final long ZpBGe2uQfcn8;

    static {
        defpackage.ok0.WDYagTQQm9ns(4282664004L);
        defpackage.ok0.WDYagTQQm9ns(4287137928L);
        defpackage.ok0.WDYagTQQm9ns(4291611852L);
        fWTAfUmVKrZq = defpackage.ok0.WDYagTQQm9ns(4294967295L);
        JhCgjQRTAOCT = defpackage.ok0.WDYagTQQm9ns(4294901760L);
        defpackage.ok0.WDYagTQQm9ns(4278255360L);
        WDYagTQQm9ns = defpackage.ok0.WDYagTQQm9ns(4278190335L);
        defpackage.ok0.WDYagTQQm9ns(4294967040L);
        defpackage.ok0.WDYagTQQm9ns(4278255615L);
        defpackage.ok0.WDYagTQQm9ns(4294902015L);
        oh71FJcDz6S2 = defpackage.ok0.JhCgjQRTAOCT(0);
        QiMR8OkAhezm = defpackage.ok0.fWTAfUmVKrZq(0.0f, 0.0f, 0.0f, 0.0f, defpackage.ag.w7APNrr0aGRc);
    }

    public /* synthetic */ pf(long j) {
        this.ZpBGe2uQfcn8 = j;
    }

    public static final float JhCgjQRTAOCT(long j) {
        float Wc0TdmRSwbbi;
        float f;
        if ((63 & j) == 0) {
            Wc0TdmRSwbbi = (float) defpackage.j80.Wc0TdmRSwbbi((j >>> 56) & 255);
            f = 255.0f;
        } else {
            Wc0TdmRSwbbi = (float) defpackage.j80.Wc0TdmRSwbbi((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return Wc0TdmRSwbbi / f;
    }

    public static final float P05cfTpS5W5L(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) defpackage.j80.Wc0TdmRSwbbi((j >>> 48) & 255)) / 255.0f;
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
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i6 + 1056964608) - defpackage.lx.ZpBGe2uQfcn8;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return java.lang.Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float QiMR8OkAhezm(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) defpackage.j80.Wc0TdmRSwbbi((j >>> 40) & 255)) / 255.0f;
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
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i6 + 1056964608) - defpackage.lx.ZpBGe2uQfcn8;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return java.lang.Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float WDYagTQQm9ns(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) defpackage.j80.Wc0TdmRSwbbi((j >>> 32) & 255)) / 255.0f;
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
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i6 + 1056964608) - defpackage.lx.ZpBGe2uQfcn8;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return java.lang.Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final long ZpBGe2uQfcn8(long j, defpackage.xf xfVar) {
        defpackage.jk jkVar;
        defpackage.xf oh71FJcDz6S22 = oh71FJcDz6S2(j);
        int i = oh71FJcDz6S22.fWTAfUmVKrZq;
        int i2 = xfVar.fWTAfUmVKrZq;
        if ((i | i2) < 0) {
            jkVar = defpackage.i61.XntWc4eZSQ8j(oh71FJcDz6S22, xfVar);
        } else {
            defpackage.gn0 gn0Var = defpackage.kk.ZpBGe2uQfcn8;
            int i3 = i | (i2 << 6);
            java.lang.Object giKS3J6vZuNy2 = gn0Var.giKS3J6vZuNy(i3);
            if (giKS3J6vZuNy2 == null) {
                giKS3J6vZuNy2 = defpackage.i61.XntWc4eZSQ8j(oh71FJcDz6S22, xfVar);
                gn0Var.P05cfTpS5W5L(i3, giKS3J6vZuNy2);
            }
            jkVar = (defpackage.jk) giKS3J6vZuNy2;
        }
        return jkVar.ZpBGe2uQfcn8(j);
    }

    public static java.lang.String e6mdH7fiFuta(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Color(");
        sb.append(P05cfTpS5W5L(j));
        sb.append(", ");
        sb.append(QiMR8OkAhezm(j));
        sb.append(", ");
        sb.append(WDYagTQQm9ns(j));
        sb.append(", ");
        sb.append(JhCgjQRTAOCT(j));
        sb.append(", ");
        return defpackage.pVQOaWB9QMo4.fNwYGHIYeJcR(sb, oh71FJcDz6S2(j).ZpBGe2uQfcn8, ')');
    }

    public static final boolean fWTAfUmVKrZq(long j, long j2) {
        return j == j2;
    }

    public static long giKS3J6vZuNy(long j, float f) {
        return defpackage.ok0.fWTAfUmVKrZq(P05cfTpS5W5L(j), QiMR8OkAhezm(j), WDYagTQQm9ns(j), f, oh71FJcDz6S2(j));
    }

    public static final defpackage.xf oh71FJcDz6S2(long j) {
        float[] fArr = defpackage.ag.ZpBGe2uQfcn8;
        return defpackage.ag.oCu53ZX2v4Ju[(int) (j & 63)];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.pf) {
            return this.ZpBGe2uQfcn8 == ((defpackage.pf) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return e6mdH7fiFuta(this.ZpBGe2uQfcn8);
    }
}
