package defpackage;

import android.os.SystemClock;
import java.util.List;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class u8w extends uu2 {
    public Integer t;
    public boolean u;

    public static String n(uk7 uk7Var) {
        return "RepresentationHolder: height=" + ((a0o) uk7Var.c).a.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x033f  */
    @Override // defpackage.xk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(dhg dhgVar, long j, List list, bz2 bz2Var) {
        List list2;
        dih dihVar;
        l48 l48Var;
        uk7[] uk7VarArr;
        long j2;
        long j3;
        long max;
        Object obj;
        xk3 xk3Var;
        xk3 xk3Var2;
        db7 db7Var;
        bz2 bz2Var2;
        long j4;
        db7 db7Var2;
        dih dihVar2;
        so3 so3Var;
        vp3 vp3Var;
        whn whnVar;
        uk7[] uk7VarArr2;
        int i;
        Integer num;
        so3 so3Var2;
        vp3 vp3Var2;
        long j5;
        long j6;
        list.getClass();
        bz2Var.getClass();
        if (this.k != null) {
            return;
        }
        long j7 = dhgVar.a;
        long j8 = j - j7;
        long Y = dvt.Y(this.i.b(this.j).b) + dvt.Y(this.i.a) + j;
        pcl pclVar = this.f;
        if (pclVar != null && pclVar.e(Y)) {
            return;
        }
        long Y2 = dvt.Y(dvt.H(this.e));
        d97 d97Var = this.i;
        long j9 = d97Var.a;
        long Y3 = j9 == -9223372036854775807L ? -9223372036854775807L : Y2 - dvt.Y(j9 + d97Var.b(this.j).b);
        if (list.isEmpty()) {
            list2 = list;
            dihVar = null;
        } else {
            list2 = list;
            dihVar = (dih) list2.get(list.size() - 1);
        }
        int length = this.h.length();
        eih[] eihVarArr = new eih[length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            l48Var = eih.l0;
            if (i2 >= length) {
                break;
            }
            eihVarArr[i2] = l48Var;
            i2++;
        }
        int i4 = 0;
        while (true) {
            uk7VarArr = this.g;
            if (i4 >= length) {
                break;
            }
            uk7 uk7Var = uk7VarArr[i4];
            int i5 = length;
            if (((o97) uk7Var.e) == null) {
                eihVarArr[i4] = l48Var;
                j5 = j7;
            } else {
                long d = uk7Var.d(Y2);
                long e = uk7Var.e(Y2);
                if (dihVar != null) {
                    j6 = dihVar.b();
                    j5 = j7;
                } else {
                    o97 o97Var = (o97) uk7Var.e;
                    vq1.B(o97Var);
                    j5 = j7;
                    j6 = dvt.j(o97Var.p(j, uk7Var.f) + uk7Var.g, d, e);
                }
                long j10 = j6;
                if (j10 < d) {
                    eihVarArr[i4] = l48Var;
                } else {
                    eihVarArr[i4] = new vk7(m(i4), j10, e, 2);
                }
            }
            i4++;
            length = i5;
            j7 = j5;
        }
        long j11 = j7;
        if (this.i.d) {
            long g = uk7VarArr[0].g(uk7VarArr[0].e(Y2));
            d97 d97Var2 = this.i;
            j2 = j8;
            long j12 = d97Var2.a;
            long min = Math.min(j12 == -9223372036854775807L ? -9223372036854775807L : Y2 - dvt.Y(j12 + d97Var2.b(this.j).b), g) - j11;
            j3 = 0;
            max = Math.max(0L, min);
        } else {
            j2 = j8;
            max = -9223372036854775807L;
            j3 = 0;
        }
        long j13 = j3;
        long j14 = Y3;
        this.h.m(j11, j2, max, list2, eihVarArr);
        int b = this.h.b();
        SystemClock.elapsedRealtime();
        uk7 m = m(b);
        dsc s = this.h.s();
        s.getClass();
        int t = this.h.t();
        Object j15 = this.h.j();
        boolean z = this.u;
        db7 db7Var3 = this.d;
        if (z) {
            Timber.INSTANCE.d("foundNotCachedSegment do not try found cached initial segment", new Object[0]);
        } else {
            if (this.t == null) {
                uk7VarArr.getClass();
                int length2 = uk7VarArr.length;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i6 >= length2) {
                        uk7VarArr2 = uk7VarArr;
                        num = null;
                        break;
                    }
                    uk7 uk7Var2 = uk7VarArr[i6];
                    int i8 = i7 + 1;
                    a0o a0oVar = (a0o) uk7Var2.c;
                    uk7VarArr2 = uk7VarArr;
                    xk3 xk3Var3 = (xk3) uk7Var2.b;
                    whn whnVar2 = (xk3Var3 != null ? xk3Var3.i : null) == null ? a0oVar.e : null;
                    int i9 = length2;
                    whn d2 = ((o97) uk7Var2.e) == null ? a0oVar.d() : null;
                    if (whnVar2 != null || d2 != null) {
                        a0o a0oVar2 = (a0o) uk7Var2.c;
                        a0oVar2.getClass();
                        nb7 a = fnm.a(a0oVar2, whnVar2, d2);
                        boolean z2 = db7Var3 instanceof s8w;
                        s8w s8wVar = z2 ? (s8w) db7Var3 : null;
                        if (s8wVar == null || (so3Var2 = s8wVar.a) == null) {
                            jp3 jp3Var = db7Var3 instanceof jp3 ? (jp3) db7Var3 : null;
                            so3Var2 = jp3Var != null ? jp3Var.a : null;
                        }
                        s8w s8wVar2 = z2 ? (s8w) db7Var3 : null;
                        if (s8wVar2 != null) {
                            vp3Var2 = s8wVar2.e;
                        } else {
                            jp3 jp3Var2 = db7Var3 instanceof jp3 ? (jp3) db7Var3 : null;
                            vp3Var2 = jp3Var2 != null ? jp3Var2.e : null;
                        }
                        if (so3Var2 != null && vp3Var2 != null && fnm.b(so3Var2, vp3Var2, a)) {
                            Timber.INSTANCE.d("preloaded representation holder founded: ".concat(n(uk7Var2)), new Object[0]);
                            num = Integer.valueOf(i7);
                            break;
                        }
                    } else {
                        Timber.INSTANCE.d(f1d.i(k5r.q(i7, "[", "] trackType="), this.c, " pendingInitializationUri and pendingIndexUri are null"), new Object[i3]);
                    }
                    i6++;
                    i7 = i8;
                    uk7VarArr = uk7VarArr2;
                    length2 = i9;
                    i3 = 0;
                }
                this.t = num;
            } else {
                uk7VarArr2 = uk7VarArr;
            }
            Integer num2 = this.t;
            if (num2 != null) {
                uk7 uk7Var3 = uk7VarArr2[num2.intValue()];
                zsb zsbVar = this.h;
                rtr rtrVar = zsbVar instanceof rtr ? (rtr) zsbVar : null;
                if (rtrVar != null) {
                    Integer num3 = this.t;
                    num3.getClass();
                    int intValue = num3.intValue();
                    if (intValue >= 0) {
                        rtrVar.z = num3;
                        rtrVar.r = num3.intValue();
                    } else {
                        Timber.INSTANCE.e(k5r.i(intValue, "lockSelectedIndex() called with index = "), new Object[0]);
                    }
                }
                Timber.Companion companion = Timber.INSTANCE;
                StringBuilder sb = new StringBuilder("force to use ");
                uk7Var3.getClass();
                sb.append(n(uk7Var3));
                sb.append(", lockSelectedIndex ");
                sb.append(this.t);
                companion.d(sb.toString(), new Object[0]);
                if (!m.equals(uk7Var3)) {
                    companion.d("switch to preloaded representationHolder. From: " + n(m) + " to " + n(uk7Var3), new Object[0]);
                    zsb zsbVar2 = this.h;
                    Integer num4 = this.t;
                    num4.getClass();
                    dsc e2 = zsbVar2.e(num4.intValue());
                    e2.getClass();
                    if (s.equals(e2)) {
                        i = 0;
                    } else {
                        i = 0;
                        companion.d("switch format. From: " + s + " to " + e2, new Object[0]);
                        s = e2;
                    }
                    companion.d(k5r.i(t, "selectionReason = "), new Object[i]);
                    m = uk7Var3;
                    obj = null;
                    dsc dscVar = s;
                    a0o a0oVar3 = (a0o) m.c;
                    long j16 = m.f;
                    xk3Var = (xk3) m.b;
                    long j17 = m.g;
                    o97 o97Var2 = (o97) m.e;
                    mu2 mu2Var = (mu2) m.d;
                    if (xk3Var == null) {
                        whn whnVar3 = xk3Var.i == null ? a0oVar3.e : null;
                        if (o97Var2 == null) {
                            xk3Var2 = xk3Var;
                            whnVar = a0oVar3.d();
                        } else {
                            xk3Var2 = xk3Var;
                            whnVar = null;
                        }
                        if (whnVar3 != null || whnVar != null) {
                            if (whnVar3 != null) {
                                whn a2 = whnVar3.a(whnVar, mu2Var.a);
                                if (a2 != null) {
                                    whnVar3 = a2;
                                }
                            } else {
                                whnVar.getClass();
                                whnVar3 = whnVar;
                            }
                            bz2Var.c = new hme(db7Var3, vwb.I(a0oVar3, mu2Var.a, whnVar3, 0), dscVar, t, obj, (xk3) m.b);
                            return;
                        }
                        bz2Var2 = bz2Var;
                        db7Var = db7Var3;
                    } else {
                        xk3Var2 = xk3Var;
                        db7Var = db7Var3;
                        bz2Var2 = bz2Var;
                    }
                    boolean z3 = j16 == -9223372036854775807L;
                    if (m.f() != j13) {
                        bz2Var2.b = z3;
                        return;
                    }
                    long d3 = m.d(Y2);
                    long e3 = m.e(Y2);
                    if (dihVar != null) {
                        j4 = dihVar.b();
                    } else {
                        vq1.B(o97Var2);
                        j4 = dvt.j(o97Var2.p(j, j16) + j17, d3, e3);
                    }
                    if (j4 < d3) {
                        this.k = new yy2();
                        return;
                    }
                    if (j4 > e3 || (this.l && j4 >= e3)) {
                        bz2Var2.b = z3;
                        return;
                    }
                    if (z3 && m.h(j4) >= j16) {
                        bz2Var2.b = true;
                        return;
                    }
                    int min2 = (int) Math.min(1, (e3 - j4) + 1);
                    if (j16 != -9223372036854775807L) {
                        while (min2 > 1 && m.h((min2 + j4) - 1) >= j16) {
                            min2--;
                        }
                    }
                    long j18 = list.isEmpty() ? j : -9223372036854775807L;
                    dsc s2 = this.h.s();
                    int t2 = this.h.t();
                    Object j19 = this.h.j();
                    long h = m.h(j4);
                    vq1.B(o97Var2);
                    whn k = o97Var2.k(j4 - j17);
                    if (xk3Var2 == null) {
                        dihVar2 = new qlq(db7Var, l(a0oVar3, mu2Var.a, k, m.i(j4, j14) ? 0 : 8), s2, t2, j19, h, m.g(j4), j4, this.c, s2);
                        db7Var2 = db7Var;
                    } else {
                        long j20 = j4;
                        int i10 = 1;
                        int i11 = 1;
                        while (i11 < min2) {
                            long j21 = j17;
                            vq1.B(o97Var2);
                            whn a3 = k.a(o97Var2.k((j20 + i11) - j21), mu2Var.a);
                            if (a3 == null) {
                                break;
                            }
                            i10++;
                            i11++;
                            k = a3;
                            j17 = j21;
                        }
                        long j22 = (j20 + i10) - 1;
                        long g2 = m.g(j22);
                        long j23 = (j16 == -9223372036854775807L || j16 > g2) ? -9223372036854775807L : j16;
                        nb7 l = l(a0oVar3, mu2Var.a, k, m.i(j22, j14) ? 0 : 8);
                        long j24 = -a0oVar3.c;
                        if (l5i.m(s2.n)) {
                            j24 += h;
                        }
                        dih hb6Var = new hb6(db7Var, l, s2, t2, j19, h, g2, j18, j23, j20, i10, j24, xk3Var2);
                        db7Var2 = db7Var;
                        dihVar2 = hb6Var;
                    }
                    if (this.u) {
                        Timber.INSTANCE.d("skip check that media segment is preloaded because foundNotCachedSegment", new Object[0]);
                    } else {
                        Timber.Companion companion2 = Timber.INSTANCE;
                        companion2.d("check that media segment is preloaded", new Object[0]);
                        boolean z4 = db7Var2 instanceof s8w;
                        s8w s8wVar3 = z4 ? (s8w) db7Var2 : null;
                        if (s8wVar3 == null || (so3Var = s8wVar3.a) == null) {
                            jp3 jp3Var3 = db7Var2 instanceof jp3 ? (jp3) db7Var2 : null;
                            so3Var = jp3Var3 != null ? jp3Var3.a : null;
                        }
                        s8w s8wVar4 = z4 ? (s8w) db7Var2 : null;
                        if (s8wVar4 != null) {
                            vp3Var = s8wVar4.e;
                        } else {
                            jp3 jp3Var4 = db7Var2 instanceof jp3 ? (jp3) db7Var2 : null;
                            vp3Var = jp3Var4 != null ? jp3Var4.e : null;
                        }
                        if (so3Var != null && vp3Var != null) {
                            nb7 nb7Var = dihVar2.b;
                            nb7Var.getClass();
                            if (!fnm.b(so3Var, vp3Var, nb7Var)) {
                                this.u = true;
                                zsb zsbVar3 = this.h;
                                rtr rtrVar2 = zsbVar3 instanceof rtr ? (rtr) zsbVar3 : null;
                                if (rtrVar2 != null) {
                                    rtrVar2.z = null;
                                }
                                companion2.d("unlock track selection", new Object[0]);
                            }
                        }
                    }
                    bz2Var2.c = dihVar2;
                    return;
                }
            } else {
                Timber.INSTANCE.d("cachedRepresentationIndex is null", new Object[0]);
            }
        }
        obj = j15;
        dsc dscVar2 = s;
        a0o a0oVar32 = (a0o) m.c;
        long j162 = m.f;
        xk3Var = (xk3) m.b;
        long j172 = m.g;
        o97 o97Var22 = (o97) m.e;
        mu2 mu2Var2 = (mu2) m.d;
        if (xk3Var == null) {
        }
        if (j162 == -9223372036854775807L) {
        }
        if (m.f() != j13) {
        }
    }
}
