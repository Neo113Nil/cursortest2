package defpackage;

import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class hyo {
    public final /* synthetic */ iyo a;

    public hyo(iyo iyoVar) {
        this.a = iyoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(int i, long j) {
        long j2;
        long j3;
        float intBitsToFloat;
        int i2;
        char c;
        float intBitsToFloat2;
        long floatToRawIntBits;
        long g;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        iyo iyoVar = this.a;
        iyoVar.i = i;
        qg0 qg0Var = iyoVar.b;
        if (qg0Var == null || !(iyoVar.a.d() || iyoVar.a.c())) {
            return iyo.a(iyoVar, iyoVar.j, j, i);
        }
        int i4 = iyoVar.i;
        hxo hxoVar = iyoVar.l;
        a1b a1bVar = qg0Var.c;
        if (nmq.e(qg0Var.g)) {
            hxoVar.getClass();
            iyo iyoVar2 = (iyo) hxoVar.s;
            return new enj(iyo.a(iyoVar2, iyoVar2.j, j, iyoVar2.i)).a;
        }
        if (!qg0Var.f) {
            if (a1b.g(a1bVar.f)) {
                qg0Var.f(0L);
            }
            if (a1b.g(a1bVar.g)) {
                qg0Var.g(0L);
            }
            if (a1b.g(a1bVar.d)) {
                qg0Var.h(0L);
            }
            if (a1b.g(a1bVar.e)) {
                qg0Var.e(0L);
            }
            qg0Var.f = true;
        }
        int i5 = fh0.a;
        float f = i4 == 2 ? 4.0f : 1.0f;
        long i6 = enj.i(f, j);
        int i7 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i7) != 0.0f) {
            if (!a1b.g(a1bVar.d) || Float.intBitsToFloat(i7) >= 0.0f) {
                j2 = 4294967295L;
                if (!a1b.g(a1bVar.e) || Float.intBitsToFloat(i7) <= 0.0f) {
                    j3 = i6;
                } else {
                    float e = qg0Var.e(i6);
                    if (!a1b.g(a1bVar.e)) {
                        a1bVar.b().finish();
                    }
                    j3 = i6;
                    intBitsToFloat = e == Float.intBitsToFloat((int) (j3 & 4294967295L)) ? Float.intBitsToFloat(i7) : e / f;
                }
            } else {
                float h = qg0Var.h(i6);
                j2 = 4294967295L;
                if (!a1b.g(a1bVar.d)) {
                    a1bVar.e().finish();
                }
                intBitsToFloat = h == Float.intBitsToFloat((int) (i6 & 4294967295L)) ? Float.intBitsToFloat(i7) : h / f;
                j3 = i6;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) == 0.0f) {
                if (!a1b.g(a1bVar.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    long j4 = j3;
                    c = ' ';
                    if (a1b.g(a1bVar.g) && Float.intBitsToFloat(i2) > 0.0f) {
                        float g2 = qg0Var.g(j4);
                        if (!a1b.g(a1bVar.g)) {
                            a1bVar.d().finish();
                        }
                        intBitsToFloat2 = g2 == Float.intBitsToFloat((int) (j4 >> 32)) ? Float.intBitsToFloat(i2) : g2 / f;
                    }
                } else {
                    long j5 = j3;
                    float f2 = qg0Var.f(j5);
                    c = ' ';
                    if (!a1b.g(a1bVar.f)) {
                        a1bVar.c().finish();
                    }
                    intBitsToFloat2 = f2 == Float.intBitsToFloat((int) (j5 >> 32)) ? Float.intBitsToFloat(i2) : f2 / f;
                }
                floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) & j2) | (Float.floatToRawIntBits(intBitsToFloat2) << c);
                if (!enj.c(floatToRawIntBits, 0L)) {
                    qg0Var.d();
                }
                g = enj.g(j, floatToRawIntBits);
                hxoVar.getClass();
                iyo iyoVar3 = (iyo) hxoVar.s;
                long j6 = new enj(iyo.a(iyoVar3, iyoVar3.j, g, iyoVar3.i)).a;
                long g3 = enj.g(g, j6);
                if ((Float.intBitsToFloat((int) (g >> c)) == 0.0f || Float.intBitsToFloat((int) (g & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j6 >> c)) != 0.0f || Float.intBitsToFloat((int) (j6 & j2)) != 0.0f) && (a1b.g(a1bVar.f) || a1b.g(a1bVar.d) || a1b.g(a1bVar.g) || a1b.g(a1bVar.e)))) {
                    qg0Var.a();
                }
                if (i4 == 1) {
                    int i8 = (int) (g3 >> c);
                    if (Float.intBitsToFloat(i8) > 0.5f) {
                        qg0Var.f(g3);
                    } else {
                        if (Float.intBitsToFloat(i8) >= -0.5f) {
                            z3 = false;
                            i3 = (int) (g3 & j2);
                            if (Float.intBitsToFloat(i3) <= 0.5f) {
                                qg0Var.h(g3);
                            } else if (Float.intBitsToFloat(i3) < -0.5f) {
                                qg0Var.e(g3);
                            } else {
                                z4 = false;
                                if (!z3 || z4) {
                                    z = true;
                                    if (!enj.c(g, 0L)) {
                                        if (!a1b.f(a1bVar.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                                            z2 = false;
                                        } else {
                                            EdgeEffect c2 = a1bVar.c();
                                            float intBitsToFloat3 = Float.intBitsToFloat(i2);
                                            if (c2 instanceof lmd) {
                                                lmd lmdVar = (lmd) c2;
                                                float f3 = lmdVar.b + intBitsToFloat3;
                                                lmdVar.b = f3;
                                                if (Math.abs(f3) > lmdVar.a) {
                                                    lmdVar.onRelease();
                                                }
                                            } else {
                                                c2.onRelease();
                                            }
                                            z2 = a1b.f(a1bVar.f);
                                        }
                                        if (a1b.f(a1bVar.g) && Float.intBitsToFloat(i2) > 0.0f) {
                                            EdgeEffect d = a1bVar.d();
                                            float intBitsToFloat4 = Float.intBitsToFloat(i2);
                                            if (d instanceof lmd) {
                                                lmd lmdVar2 = (lmd) d;
                                                float f4 = lmdVar2.b + intBitsToFloat4;
                                                lmdVar2.b = f4;
                                                if (Math.abs(f4) > lmdVar2.a) {
                                                    lmdVar2.onRelease();
                                                }
                                            } else {
                                                d.onRelease();
                                            }
                                            z2 = z2 || a1b.f(a1bVar.g);
                                        }
                                        if (a1b.f(a1bVar.d) && Float.intBitsToFloat(i7) < 0.0f) {
                                            EdgeEffect e2 = a1bVar.e();
                                            float intBitsToFloat5 = Float.intBitsToFloat(i7);
                                            if (e2 instanceof lmd) {
                                                lmd lmdVar3 = (lmd) e2;
                                                float f5 = lmdVar3.b + intBitsToFloat5;
                                                lmdVar3.b = f5;
                                                if (Math.abs(f5) > lmdVar3.a) {
                                                    lmdVar3.onRelease();
                                                }
                                            } else {
                                                e2.onRelease();
                                            }
                                            z2 = z2 || a1b.f(a1bVar.d);
                                        }
                                        if (a1b.f(a1bVar.e) && Float.intBitsToFloat(i7) > 0.0f) {
                                            EdgeEffect b = a1bVar.b();
                                            float intBitsToFloat6 = Float.intBitsToFloat(i7);
                                            if (b instanceof lmd) {
                                                lmd lmdVar4 = (lmd) b;
                                                float f6 = lmdVar4.b + intBitsToFloat6;
                                                lmdVar4.b = f6;
                                                if (Math.abs(f6) > lmdVar4.a) {
                                                    lmdVar4.onRelease();
                                                }
                                            } else {
                                                b.onRelease();
                                            }
                                            z2 = z2 || a1b.f(a1bVar.e);
                                        }
                                        z = z2 || z;
                                    }
                                    if (z) {
                                        qg0Var.d();
                                    }
                                    return enj.h(floatToRawIntBits, j6);
                                }
                            }
                            z4 = true;
                            if (!z3) {
                            }
                            z = true;
                            if (!enj.c(g, 0L)) {
                            }
                            if (z) {
                            }
                            return enj.h(floatToRawIntBits, j6);
                        }
                        qg0Var.g(g3);
                    }
                    z3 = true;
                    i3 = (int) (g3 & j2);
                    if (Float.intBitsToFloat(i3) <= 0.5f) {
                    }
                    z4 = true;
                    if (!z3) {
                    }
                    z = true;
                    if (!enj.c(g, 0L)) {
                    }
                    if (z) {
                    }
                    return enj.h(floatToRawIntBits, j6);
                }
                z = false;
                if (!enj.c(g, 0L)) {
                }
                if (z) {
                }
                return enj.h(floatToRawIntBits, j6);
            }
            c = ' ';
            intBitsToFloat2 = 0.0f;
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) & j2) | (Float.floatToRawIntBits(intBitsToFloat2) << c);
            if (!enj.c(floatToRawIntBits, 0L)) {
            }
            g = enj.g(j, floatToRawIntBits);
            hxoVar.getClass();
            iyo iyoVar32 = (iyo) hxoVar.s;
            long j62 = new enj(iyo.a(iyoVar32, iyoVar32.j, g, iyoVar32.i)).a;
            long g32 = enj.g(g, j62);
            if (Float.intBitsToFloat((int) (g >> c)) == 0.0f) {
            }
            qg0Var.a();
            if (i4 == 1) {
            }
            z = false;
            if (!enj.c(g, 0L)) {
            }
            if (z) {
            }
            return enj.h(floatToRawIntBits, j62);
        }
        j3 = i6;
        j2 = 4294967295L;
        intBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) == 0.0f) {
        }
        intBitsToFloat2 = 0.0f;
        floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) & j2) | (Float.floatToRawIntBits(intBitsToFloat2) << c);
        if (!enj.c(floatToRawIntBits, 0L)) {
        }
        g = enj.g(j, floatToRawIntBits);
        hxoVar.getClass();
        iyo iyoVar322 = (iyo) hxoVar.s;
        long j622 = new enj(iyo.a(iyoVar322, iyoVar322.j, g, iyoVar322.i)).a;
        long g322 = enj.g(g, j622);
        if (Float.intBitsToFloat((int) (g >> c)) == 0.0f) {
        }
        qg0Var.a();
        if (i4 == 1) {
        }
        z = false;
        if (!enj.c(g, 0L)) {
        }
        if (z) {
        }
        return enj.h(floatToRawIntBits, j622);
    }
}
