package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class wk7 implements c97 {
    public final ogg a;
    public final kkp b;
    public final int[] c;
    public final int d;
    public final db7 e;
    public final long f;
    public final int g;
    public final pcl h;
    public final uk7[] i;
    public zsb j;
    public d97 k;
    public int l;
    public yy2 m;
    public boolean n;

    public wk7(bz2 bz2Var, ogg oggVar, d97 d97Var, kkp kkpVar, int i, int[] iArr, zsb zsbVar, int i2, db7 db7Var, long j, int i3, boolean z, ArrayList arrayList, pcl pclVar) {
        this.a = oggVar;
        this.k = d97Var;
        this.b = kkpVar;
        this.c = iArr;
        this.j = zsbVar;
        int i4 = i2;
        this.d = i4;
        this.e = db7Var;
        this.l = i;
        this.f = j;
        this.g = i3;
        pcl pclVar2 = pclVar;
        this.h = pclVar2;
        long d = d97Var.d(i);
        ArrayList k = k();
        this.i = new uk7[zsbVar.length()];
        int i5 = 0;
        while (i5 < this.i.length) {
            a0o a0oVar = (a0o) k.get(zsbVar.f(i5));
            mu2 F = kkpVar.F(a0oVar.b);
            long j2 = d;
            this.i[i5] = new uk7(j2, a0oVar, F == null ? (mu2) a0oVar.b.get(0) : F, bz2Var.r(i4, a0oVar.a, z, arrayList, pclVar2), 0L, a0oVar.b(), 0);
            i5++;
            pclVar2 = pclVar;
            d = j2;
            i4 = i2;
        }
    }

    @Override // defpackage.xk4
    public final void a() {
        for (uk7 uk7Var : this.i) {
            xk3 xk3Var = (xk3) uk7Var.b;
            if (xk3Var != null) {
                xk3Var.a.a();
            }
        }
    }

    @Override // defpackage.xk4
    public final void b() {
        yy2 yy2Var = this.m;
        if (yy2Var != null) {
            throw yy2Var;
        }
        this.a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r3 < (((r10.H() + r8) + r11) - 1)) goto L15;
     */
    @Override // defpackage.xk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j, hap hapVar) {
        long j2;
        long j3 = j;
        uk7[] uk7VarArr = this.i;
        int length = uk7VarArr.length;
        int i = 0;
        while (i < length) {
            uk7 uk7Var = uk7VarArr[i];
            o97 o97Var = (o97) uk7Var.e;
            long j4 = uk7Var.g;
            o97 o97Var2 = (o97) uk7Var.e;
            if (o97Var != null) {
                long f = uk7Var.f();
                if (f != 0) {
                    vq1.B(o97Var2);
                    long p = o97Var2.p(j3, uk7Var.f) + j4;
                    long h = uk7Var.h(p);
                    if (h < j3) {
                        if (f != -1) {
                            vq1.B(o97Var2);
                        }
                        j2 = uk7Var.h(p + 1);
                        return hapVar.a(j3, h, j2);
                    }
                    j2 = h;
                    return hapVar.a(j3, h, j2);
                }
            }
            i++;
            j3 = j;
        }
        return j;
    }

    @Override // defpackage.xk4
    public final void d(sk4 sk4Var) {
        if (sk4Var instanceof hme) {
            int o = this.j.o(((hme) sk4Var).d);
            uk7[] uk7VarArr = this.i;
            uk7 uk7Var = uk7VarArr[o];
            if (((o97) uk7Var.e) == null) {
                xk3 xk3Var = (xk3) uk7Var.b;
                vq1.B(xk3Var);
                tk4 a = xk3Var.a();
                if (a != null) {
                    a0o a0oVar = (a0o) uk7Var.c;
                    uk7VarArr[o] = new uk7(uk7Var.f, a0oVar, (mu2) uk7Var.d, (xk3) uk7Var.b, uk7Var.g, new au1(a, a0oVar.c, 3), 0);
                }
            }
        }
        pcl pclVar = this.h;
        if (pclVar != null) {
            long j = pclVar.d;
            if (j == -9223372036854775807L || sk4Var.h > j) {
                pclVar.d = sk4Var.h;
            }
            pclVar.e.g = true;
        }
    }

    @Override // defpackage.xk4
    public final boolean e(sk4 sk4Var, boolean z, j4x j4xVar, xeg xegVar) {
        mdr L;
        long j;
        if (z) {
            pcl pclVar = this.h;
            if (pclVar == null || !pclVar.f(sk4Var)) {
                boolean z2 = this.k.d;
                uk7[] uk7VarArr = this.i;
                if (!z2 && (sk4Var instanceof dih)) {
                    IOException iOException = (IOException) j4xVar.c;
                    if ((iOException instanceof i6e) && ((i6e) iOException).d == 404) {
                        uk7 uk7Var = uk7VarArr[this.j.o(sk4Var.d)];
                        long f = uk7Var.f();
                        if (f != -1 && f != 0) {
                            o97 o97Var = (o97) uk7Var.e;
                            vq1.B(o97Var);
                            if (((dih) sk4Var).b() > ((o97Var.H() + uk7Var.g) + f) - 1) {
                                this.n = true;
                                return true;
                            }
                        }
                    }
                }
                uk7 uk7Var2 = uk7VarArr[this.j.o(sk4Var.d)];
                a0o a0oVar = (a0o) uk7Var2.c;
                mu2 mu2Var = (mu2) uk7Var2.d;
                yde ydeVar = a0oVar.b;
                kkp kkpVar = this.b;
                mu2 F = kkpVar.F(ydeVar);
                if (F == null || mu2Var.equals(F)) {
                    zsb zsbVar = this.j;
                    yde ydeVar2 = ((a0o) uk7Var2.c).b;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int length = zsbVar.length();
                    int i = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (zsbVar.a(i2, elapsedRealtime)) {
                            i++;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (int i3 = 0; i3 < ydeVar2.size(); i3++) {
                        hashSet.add(Integer.valueOf(((mu2) ydeVar2.get(i3)).c));
                    }
                    int size = hashSet.size();
                    HashSet hashSet2 = new HashSet();
                    ArrayList m = kkpVar.m(ydeVar2);
                    for (int i4 = 0; i4 < m.size(); i4++) {
                        hashSet2.add(Integer.valueOf(((mu2) m.get(i4)).c));
                    }
                    weg wegVar = new weg(size, size - hashSet2.size(), length, i);
                    if ((wegVar.a(2) || wegVar.a(1)) && (L = xegVar.L(wegVar, j4xVar)) != null) {
                        long j2 = L.b;
                        int i5 = L.a;
                        if (wegVar.a(i5)) {
                            if (i5 == 2) {
                                zsb zsbVar2 = this.j;
                                return zsbVar2.h(zsbVar2.o(sk4Var.d), j2);
                            }
                            if (i5 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
                                String str = mu2Var.b;
                                HashMap hashMap = (HashMap) kkpVar.b;
                                if (hashMap.containsKey(str)) {
                                    Long l = (Long) hashMap.get(str);
                                    int i6 = dvt.a;
                                    j = Math.max(elapsedRealtime2, l.longValue());
                                } else {
                                    j = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j));
                                int i7 = mu2Var.c;
                                if (i7 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i7);
                                    HashMap hashMap2 = (HashMap) kkpVar.c;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l2 = (Long) hashMap2.get(valueOf);
                                        int i8 = dvt.a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l2.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.xk4
    public final boolean f(long j, sk4 sk4Var, List list) {
        if (this.m != null) {
            return false;
        }
        return this.j.d(j, sk4Var, list);
    }

    @Override // defpackage.xk4
    public final int g(List list, long j) {
        return (this.m != null || this.j.length() < 2) ? list.size() : this.j.v(list, j);
    }

    @Override // defpackage.c97
    public final void h(d97 d97Var, int i) {
        uk7[] uk7VarArr = this.i;
        try {
            this.k = d97Var;
            this.l = i;
            long d = d97Var.d(i);
            ArrayList k = k();
            for (int i2 = 0; i2 < uk7VarArr.length; i2++) {
                uk7VarArr[i2] = uk7VarArr[i2].b(d, (a0o) k.get(this.j.f(i2)));
            }
        } catch (yy2 e) {
            this.m = e;
        }
    }

    @Override // defpackage.xk4
    public final void i(dhg dhgVar, long j, List list, bz2 bz2Var) {
        uk7[] uk7VarArr;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z;
        long j6;
        long j7;
        Object hb6Var;
        long j8;
        long j9;
        if (this.m != null) {
            return;
        }
        long j10 = dhgVar.a;
        long j11 = j - j10;
        long Y = dvt.Y(this.k.b(this.l).b) + dvt.Y(this.k.a) + j;
        pcl pclVar = this.h;
        if (pclVar == null || !pclVar.e(Y)) {
            long Y2 = dvt.Y(dvt.H(this.f));
            d97 d97Var = this.k;
            long j12 = d97Var.a;
            long Y3 = j12 == -9223372036854775807L ? -9223372036854775807L : Y2 - dvt.Y(j12 + d97Var.b(this.l).b);
            dih dihVar = list.isEmpty() ? null : (dih) list.get(list.size() - 1);
            int length = this.j.length();
            eih[] eihVarArr = new eih[length];
            int i = 0;
            while (true) {
                uk7VarArr = this.i;
                if (i >= length) {
                    break;
                }
                uk7 uk7Var = uk7VarArr[i];
                int i2 = length;
                o97 o97Var = (o97) uk7Var.e;
                l48 l48Var = eih.l0;
                if (o97Var == null) {
                    eihVarArr[i] = l48Var;
                    j8 = j10;
                } else {
                    long d = uk7Var.d(Y2);
                    long e = uk7Var.e(Y2);
                    if (dihVar != null) {
                        j9 = dihVar.b();
                        j8 = j10;
                    } else {
                        o97 o97Var2 = (o97) uk7Var.e;
                        vq1.B(o97Var2);
                        j8 = j10;
                        j9 = dvt.j(o97Var2.p(j, uk7Var.f) + uk7Var.g, d, e);
                    }
                    long j13 = j9;
                    if (j13 < d) {
                        eihVarArr[i] = l48Var;
                    } else {
                        eihVarArr[i] = new vk7(l(i), j13, e, 0);
                    }
                }
                i++;
                length = i2;
                j10 = j8;
            }
            long j14 = j10;
            if (!this.k.d || uk7VarArr[0].f() == 0) {
                j2 = j11;
                j3 = 0;
                j4 = -9223372036854775807L;
            } else {
                long g = uk7VarArr[0].g(uk7VarArr[0].e(Y2));
                d97 d97Var2 = this.k;
                j2 = j11;
                long j15 = d97Var2.a;
                long min = Math.min(j15 == -9223372036854775807L ? -9223372036854775807L : Y2 - dvt.Y(j15 + d97Var2.b(this.l).b), g) - j14;
                j3 = 0;
                j4 = Math.max(0L, min);
            }
            long j16 = j3;
            long j17 = Y3;
            this.j.m(j14, j2, j4, list, eihVarArr);
            int b = this.j.b();
            SystemClock.elapsedRealtime();
            uk7 l = l(b);
            long j18 = l.f;
            long j19 = l.g;
            o97 o97Var3 = (o97) l.e;
            mu2 mu2Var = (mu2) l.d;
            xk3 xk3Var = (xk3) l.b;
            a0o a0oVar = (a0o) l.c;
            if (xk3Var != null) {
                z = true;
                whn whnVar = xk3Var.i == null ? a0oVar.e : null;
                j5 = j19;
                whn d2 = o97Var3 == null ? a0oVar.d() : null;
                if (whnVar != null || d2 != null) {
                    dsc s = this.j.s();
                    int t = this.j.t();
                    Object j20 = this.j.j();
                    if (whnVar != null) {
                        whn a = whnVar.a(d2, mu2Var.a);
                        if (a != null) {
                            whnVar = a;
                        }
                    } else {
                        d2.getClass();
                        whnVar = d2;
                    }
                    bz2Var.c = new hme(this.e, vwb.I(a0oVar, mu2Var.a, whnVar, 0), s, t, j20, (xk3) l.b);
                    return;
                }
            } else {
                j5 = j19;
                z = true;
            }
            d97 d97Var3 = this.k;
            boolean z2 = (d97Var3.d && this.l == d97Var3.m.size() + (-1)) ? z : false;
            boolean z3 = (z2 && j18 == -9223372036854775807L) ? false : z;
            if (l.f() == j16) {
                bz2Var.b = z3;
                return;
            }
            long d3 = l.d(Y2);
            long e2 = l.e(Y2);
            if (z2) {
                long g2 = l.g(e2);
                z3 &= (g2 - l.h(e2)) + g2 >= j18 ? z : false;
            }
            if (dihVar != null) {
                j7 = dihVar.b();
                j6 = e2;
            } else {
                vq1.B(o97Var3);
                j6 = e2;
                j7 = dvt.j(o97Var3.p(j, j18) + j5, d3, j6);
            }
            long j21 = j7;
            if (j21 < d3) {
                this.m = new yy2();
                return;
            }
            if (j21 > j6 || (this.n && j21 >= j6)) {
                bz2Var.b = z3;
                return;
            }
            if (z3 && l.h(j21) >= j18) {
                bz2Var.b = z;
                return;
            }
            int min2 = (int) Math.min(this.g, (j6 - j21) + 1);
            int i3 = 1;
            if (j18 != -9223372036854775807L) {
                while (min2 > 1 && l.h((min2 + j21) - 1) >= j18) {
                    min2--;
                }
            }
            long j22 = list.isEmpty() ? j : -9223372036854775807L;
            dsc s2 = this.j.s();
            int t2 = this.j.t();
            Object j23 = this.j.j();
            long h = l.h(j21);
            vq1.B(o97Var3);
            whn k = o97Var3.k(j21 - j5);
            db7 db7Var = this.e;
            if (xk3Var == null) {
                hb6Var = new qlq(db7Var, vwb.I(a0oVar, mu2Var.a, k, l.i(j21, j17) ? 0 : 8), s2, t2, j23, h, l.g(j21), j21, this.d, s2);
            } else {
                int i4 = 1;
                while (i4 < min2) {
                    int i5 = min2;
                    vq1.B(o97Var3);
                    whn a2 = k.a(o97Var3.k((j21 + i4) - j5), mu2Var.a);
                    if (a2 == null) {
                        break;
                    }
                    i3++;
                    i4++;
                    k = a2;
                    min2 = i5;
                }
                long j24 = (j21 + i3) - 1;
                long g3 = l.g(j24);
                long j25 = (j18 == -9223372036854775807L || j18 > g3) ? -9223372036854775807L : j18;
                nb7 I = vwb.I(a0oVar, mu2Var.a, k, l.i(j24, j17) ? 0 : 8);
                long j26 = -a0oVar.c;
                if (l5i.m(s2.n)) {
                    j26 += h;
                }
                hb6Var = new hb6(db7Var, I, s2, t2, j23, h, g3, j22, j25, j21, i3, j26, (xk3) l.b);
            }
            bz2Var.c = hb6Var;
        }
    }

    @Override // defpackage.c97
    public final void j(zsb zsbVar) {
        this.j = zsbVar;
    }

    public final ArrayList k() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((nj) list.get(i)).c);
        }
        return arrayList;
    }

    public final uk7 l(int i) {
        uk7[] uk7VarArr = this.i;
        uk7 uk7Var = uk7VarArr[i];
        mu2 F = this.b.F(((a0o) uk7Var.c).b);
        if (F == null || F.equals((mu2) uk7Var.d)) {
            return uk7Var;
        }
        uk7 uk7Var2 = new uk7(uk7Var.f, (a0o) uk7Var.c, F, (xk3) uk7Var.b, uk7Var.g, (o97) uk7Var.e, 0);
        uk7VarArr[i] = uk7Var2;
        return uk7Var2;
    }
}
