package ru.yandex.taxi.net.tracker.v2;

import com.yandex.mapkit.geometry.Point;
import defpackage.amp0;
import defpackage.b7l0;
import defpackage.dlb1;
import defpackage.g6m;
import defpackage.h201;
import defpackage.h3y;
import defpackage.hby0;
import defpackage.hta1;
import defpackage.i3y;
import defpackage.j001;
import defpackage.j0l0;
import defpackage.jl40;
import defpackage.kby0;
import defpackage.kel0;
import defpackage.kl3;
import defpackage.lby0;
import defpackage.lel0;
import defpackage.m1l0;
import defpackage.mby0;
import defpackage.nby0;
import defpackage.oby0;
import defpackage.qel0;
import defpackage.rel0;
import defpackage.srb1;
import defpackage.w511;
import defpackage.x4e;
import defpackage.yvf0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.yandex.taxi.net.tracker.TrackerMode;
import ru.yandex.taxi.utils.CircularFifoQueue;

/* loaded from: classes6.dex */
public final class a {
    public final kel0 a;
    public final oby0 b;
    public final h3y c;
    public final long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public final j0l0 i;
    public h201 j;
    public double k;
    public final g6m l;
    public long m;
    public final amp0 n;
    public final i3y o;
    public TrackerMode p;
    public boolean q;
    public boolean r;
    public boolean s;

    public a(List list, String str, yvf0 yvf0Var, boolean z, kel0 kel0Var, oby0 oby0Var, h3y h3yVar) {
        this.a = kel0Var;
        this.b = oby0Var;
        this.c = h3yVar;
        long j = oby0Var.a;
        this.d = j;
        this.e = j;
        long Bc = kel0Var.Bc();
        this.f = Bc;
        long j2 = Bc - j;
        this.g = j2;
        this.h = j2;
        j0l0 j0l0Var = (j0l0) yvf0Var.get();
        j0l0Var.b(str, hta1.b(list));
        this.i = j0l0Var;
        this.k = 1.0d;
        g6m g6mVar = new g6m(1);
        Long valueOf = Long.valueOf(j);
        CircularFifoQueue circularFifoQueue = g6mVar.a;
        circularFifoQueue.add(valueOf);
        circularFifoQueue.add(Long.valueOf(j));
        circularFifoQueue.add(Long.valueOf(j));
        this.l = g6mVar;
        amp0 amp0Var = new amp0();
        amp0Var.a = j0l0Var;
        g6m g6mVar2 = new g6m(0);
        g6mVar2.c(10.0d);
        g6mVar2.c(10.0d);
        g6mVar2.c(10.0d);
        amp0Var.c = g6mVar2;
        this.n = amp0Var;
        this.o = kotlin.a.a(new b7l0(8));
        this.s = z;
    }

    public final h201 a() {
        j001 j001Var = (j001) kotlin.collections.a.b0(this.i.b);
        h201 h201Var = j001Var == null ? null : new h201(j001Var.getCoordinates(), Double.valueOf(j001Var.getDirection()), true, j001Var.getTimestamp().getTime(), null);
        if (h201Var == null) {
            return null;
        }
        return this.s ? h201.a(h201Var, null, Double.valueOf(0.0d), false, 0L, 29) : h201Var;
    }

    public final void b(List list, String str, boolean z, dlb1 dlb1Var) {
        List list2 = list;
        this.s = z;
        j0l0 j0l0Var = this.i;
        long j = j0l0Var.k;
        int i = 0;
        long time = ((j001) list2.get(0)).getTimestamp().getTime();
        if (time <= j) {
            return;
        }
        dlb1 dlb1Var2 = dlb1Var == null ? this.b.d : dlb1Var;
        if (dlb1Var2.equals(hby0.a)) {
            List list3 = j0l0Var.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                if (((j001) obj).getTimestamp().getTime() >= this.g) {
                    arrayList.add(obj);
                }
            }
            List q0 = kotlin.collections.a.q0(arrayList);
            ((m1l0) this.o.getValue()).getClass();
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            j001 j001Var = null;
            while (i < list2.size() && i2 < q0.size()) {
                j001 j001Var2 = (j001) list2.get(i);
                j001 j001Var3 = (j001) q0.get(i2);
                if (j001Var2.getTimestamp().after(j001Var3.getTimestamp())) {
                    if (m1l0.a(j001Var, j001Var2)) {
                        arrayList2.add(j001Var2);
                        j001Var = j001Var2;
                    }
                    i++;
                } else {
                    if (!j001Var3.getTimestamp().after(j001Var2.getTimestamp())) {
                        j001 j001Var4 = (j001) kotlin.collections.a.b0(arrayList2);
                        if (!jl40.l(j001Var4 != null ? j001Var4.getTimestamp() : null, j001Var2.getTimestamp())) {
                            arrayList2.add(j001Var2);
                            j001Var = j001Var2;
                        }
                        i++;
                    } else if (m1l0.a(j001Var, j001Var3)) {
                        arrayList2.add(j001Var3);
                        j001Var = j001Var3;
                    }
                    i2++;
                }
            }
            while (i < list2.size()) {
                int i3 = i + 1;
                j001 j001Var5 = (j001) list2.get(i);
                if (m1l0.a(j001Var, j001Var5)) {
                    arrayList2.add(j001Var5);
                    j001Var = j001Var5;
                }
                i = i3;
            }
            while (i2 < q0.size()) {
                int i4 = i2 + 1;
                j001 j001Var6 = (j001) q0.get(i2);
                if (m1l0.a(j001Var, j001Var6)) {
                    arrayList2.add(j001Var6);
                    i2 = i4;
                    j001Var = j001Var6;
                } else {
                    i2 = i4;
                }
            }
            list2 = arrayList2;
        } else {
            dlb1Var2.equals(hby0.b);
        }
        j0l0Var.b(str, hta1.b(list2));
        long j2 = j0l0Var.k - this.g;
        if (j2 > c()) {
            long min = Math.min(j0l0Var.k - j0l0Var.j, j2);
            long j3 = this.d;
            if (min > j3) {
                min = j3;
            }
            this.h = j0l0Var.k - min;
        }
        kel0 kel0Var = this.a;
        long Bc = kel0Var.Bc();
        long j4 = Bc - j;
        long j5 = Bc - time;
        g6m g6mVar = this.l;
        if (j4 > g6mVar.d()) {
            j5 += j4;
        }
        long c = c();
        if (j5 > c) {
            j5 = c;
        }
        g6mVar.a.add(Long.valueOf(j5));
        long j6 = this.g;
        if (kel0Var.Bc() > j6) {
            this.g = j6;
        }
    }

    public final long c() {
        TrackerMode trackerMode = this.p;
        return (trackerMode == null ? -1 : lel0.a[trackerMode.ordinal()]) == 1 ? 5000L : 30000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h201 d(long j) {
        long j2;
        kel0 kel0Var;
        h201 h201Var;
        long j3;
        double d;
        long j4;
        long j5;
        h201 h201Var2;
        Object obj;
        boolean z;
        qel0 qel0Var;
        qel0 qel0Var2;
        long j6;
        long j7;
        long j8;
        h201 h201Var3;
        Double d2;
        Double d3;
        boolean z2;
        j0l0 j0l0Var = this.i;
        boolean isEmpty = j0l0Var.b.isEmpty();
        kel0 kel0Var2 = this.a;
        if (isEmpty) {
            kel0Var2.a7();
            return null;
        }
        boolean z3 = this.r;
        oby0 oby0Var = this.b;
        if (z3) {
            mby0 mby0Var = oby0Var.b.a;
            if (mby0Var instanceof kby0) {
                j2 = 13000;
            } else {
                if (!(mby0Var instanceof lby0)) {
                    w511.b();
                    return null;
                }
                j2 = ((lby0) mby0Var).b;
            }
        } else {
            j2 = this.e;
        }
        long j9 = j - this.f;
        if (j9 < 0) {
            this.f = j;
            j4 = this.h;
            h201Var = null;
            kel0Var = kel0Var2;
            j3 = 0;
        } else {
            kel0Var = kel0Var2;
            long j10 = this.h;
            long j11 = j - j10;
            h201Var = null;
            long j12 = j0l0Var.k - j10;
            if (j11 < j2 || j12 < 3000) {
                j3 = 0;
                double d4 = this.k;
                if (j12 < 3000) {
                    d = d4 - (d4 / ((j12 / j9) + 1.0d));
                } else {
                    double d5 = d4 - 0.01d;
                    d = 0.5d;
                    if (d5 >= 0.5d) {
                        d = d5;
                    }
                }
            } else if (j11 > j2) {
                long j13 = j11 - j2;
                double d6 = this.k + 0.01d;
                if (d6 > 3.0d) {
                    d6 = 3.0d;
                }
                j3 = 0;
                d = Math.min(d6, j13 / j9);
            } else {
                j3 = 0;
                d = 1.0d;
            }
            this.k = d;
            this.f = j;
            j4 = this.h + ((long) (d * j9));
            this.h = j4;
        }
        long j14 = j0l0Var.j;
        long j15 = j0l0Var.k;
        long j16 = j15 - j4;
        long j17 = j15 - this.g;
        if (j16 < j3 && j17 > j3) {
            long min = Math.min(j15 - j14, j17);
            j16 = this.d;
            if (min <= j16) {
                j16 = min;
            }
            this.h = j0l0Var.k - j16;
        }
        amp0 amp0Var = this.n;
        if (j16 < j3) {
            this.k = 0.0d;
            kel0Var.a7();
            ((g6m) amp0Var.c).c(0.0d);
            h201 h201Var4 = this.j;
            if (h201Var4 != null) {
                return h201Var4.b(true);
            }
        } else {
            if (j14 > j4) {
                this.g = j14;
                this.h = j14;
                j4 = j14;
            }
            nby0 nby0Var = oby0Var.b;
            boolean z4 = this.r;
            mby0 mby0Var2 = nby0Var.a;
            if (z4 && (mby0Var2 instanceof lby0)) {
                j5 = ((lby0) mby0Var2).c;
            } else {
                if (z4) {
                    boolean z5 = mby0Var2 instanceof kby0;
                }
                j5 = 5000;
            }
            if (j16 < j5) {
                kel0Var.a7();
            }
            long d7 = this.q ? 30000L : this.l.d() + 1000;
            long Bc = kel0Var.Bc();
            long j18 = Bc - j0l0Var.j;
            long c = c();
            if (j18 > c) {
                j18 = c;
            }
            if (d7 > j18) {
                d7 = j18;
            }
            long j19 = this.m;
            if (j19 > j3) {
                long Bc2 = j19 - kel0Var.Bc();
                long j20 = oby0Var.b.b;
                if (Bc2 < j20) {
                    this.r = true;
                    d7 = ((this.m - Bc) * d7) / j20;
                    if (d7 < j3) {
                        d7 = j3;
                    }
                    this.e = d7;
                    if (j4 >= j0l0Var.j || j0l0Var.k < j4) {
                        kel0Var.a7();
                        ((g6m) amp0Var.c).c(0.0d);
                        h201Var2 = this.j;
                        if (h201Var2 != null) {
                            return h201Var2.b(true);
                        }
                    } else {
                        rel0 rel0Var = (rel0) this.c.get();
                        h201 h201Var5 = this.j;
                        List list = j0l0Var.b;
                        kl3 kl3Var = oby0Var.c;
                        RouteTraveler$renderPosition$teleportResult$1 routeTraveler$renderPosition$teleportResult$1 = new RouteTraveler$renderPosition$teleportResult$1(1, this.a, kel0.class, "reportCarTeleporting", "reportCarTeleporting(Lru/yandex/taxi/net/tracker/analytics/RouteTravelerCarTeleportedEvent;)V", 0);
                        rel0Var.getClass();
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = h201Var;
                                break;
                            }
                            obj = it.next();
                            if (((j001) obj).getTimestamp().getTime() > j4) {
                                break;
                            }
                        }
                        j001 j001Var = (j001) obj;
                        if (h201Var5 != null && j001Var != null) {
                            long time = j001Var.getTimestamp().getTime();
                            Long l = rel0Var.a;
                            if (l == null || time != l.longValue()) {
                                if (rel0.a(h201Var5.a, h201Var5.d, j001Var.getCoordinates(), j001Var.getTimestamp().getTime(), kl3Var, routeTraveler$renderPosition$teleportResult$1)) {
                                    rel0Var.a = Long.valueOf(j001Var.getTimestamp().getTime());
                                    qel0Var2 = new qel0(j001Var.getTimestamp().getTime(), true);
                                    z = false;
                                    g6m g6mVar = (g6m) amp0Var.c;
                                    j0l0 j0l0Var2 = (j0l0) amp0Var.a;
                                    j6 = j0l0Var2.j;
                                    j7 = qel0Var2.a;
                                    if (j7 >= j6 || j0l0Var2.k < j7) {
                                        j8 = j7;
                                        h201Var3 = h201Var;
                                    } else {
                                        h201Var3 = j0l0Var2.a(j7);
                                        h201 h201Var6 = (h201) amp0Var.b;
                                        if (h201Var6 != null) {
                                            h201Var3 = h201Var3.b(ru.yandex.taxi.map.utils.a.d(ru.yandex.taxi.map.utils.a.F(h201Var3.a), ru.yandex.taxi.map.utils.a.F(h201Var6.a)));
                                        }
                                        long j21 = h201Var3.d;
                                        amp0Var.b = h201Var3;
                                        if (h201Var6 != null) {
                                            zzs zzsVar = h201Var6.a;
                                            long j22 = h201Var6.d;
                                            if (j21 > j22) {
                                                double d8 = srb1.d(zzsVar, h201Var3.a);
                                                double d9 = (j21 - j22) / 1000.0d;
                                                if (d9 < 0.001d) {
                                                    d9 = 0.001d;
                                                }
                                                Pair pair = new Pair(Double.valueOf(d8 / d9), Double.valueOf(d9));
                                                double doubleValue = ((Number) pair.getFirst()).doubleValue();
                                                double doubleValue2 = ((Number) pair.getSecond()).doubleValue();
                                                h201 h201Var7 = (h201) amp0Var.b;
                                                if ((h201Var7 != null ? h201Var7.a : h201Var) != null) {
                                                    z = true;
                                                }
                                                if (doubleValue <= g6mVar.a() * 1.1d || !z) {
                                                    j8 = j7;
                                                    g6mVar.c(doubleValue);
                                                } else {
                                                    double a = g6mVar.a();
                                                    double a2 = g6mVar.a();
                                                    double min2 = Math.min(a + (doubleValue2 * 1.82d), x4e.a(doubleValue, a2, 0.02d, a2));
                                                    double d10 = min2 / doubleValue;
                                                    double d11 = d10 > 1.0d ? 1.0d : d10;
                                                    double d12 = j22;
                                                    h201 a3 = j0l0Var2.a((long) x4e.a(j7, d12, d11, d12));
                                                    j8 = j7;
                                                    h201 b = a3.b(ru.yandex.taxi.map.utils.a.d(ru.yandex.taxi.map.utils.a.F(a3.a), new Point(zzsVar.a, zzsVar.b)));
                                                    g6mVar.c(min2);
                                                    amp0Var.b = b;
                                                    h201Var3 = b;
                                                }
                                            }
                                        }
                                        j8 = j7;
                                    }
                                    if (h201Var3 != null) {
                                        if (!this.s) {
                                            Double d13 = h201Var3.b;
                                            if (d13 == null) {
                                                h201 h201Var8 = this.j;
                                                if (h201Var8 != null) {
                                                    d3 = h201Var8.b;
                                                } else {
                                                    d2 = h201Var;
                                                }
                                            } else {
                                                d2 = d13;
                                            }
                                            h201 a4 = h201.a(h201Var3, null, d2, false, 0L, 29);
                                            z2 = qel0Var2.b;
                                            long j23 = !z2 ? j8 : a4.d;
                                            h201 a5 = h201.a(a4, null, null, false, j23, 23);
                                            this.j = a5;
                                            this.g = j23;
                                            if (z2) {
                                                this.h = j23;
                                            }
                                            return a5;
                                        }
                                        d3 = Double.valueOf(0.0d);
                                        d2 = d3;
                                        h201 a42 = h201.a(h201Var3, null, d2, false, 0L, 29);
                                        z2 = qel0Var2.b;
                                        if (!z2) {
                                        }
                                        h201 a52 = h201.a(a42, null, null, false, j23, 23);
                                        this.j = a52;
                                        this.g = j23;
                                        if (z2) {
                                        }
                                        return a52;
                                    }
                                    h201 h201Var9 = this.j;
                                    if (h201Var9 != null) {
                                        return h201Var9.b(true);
                                    }
                                } else {
                                    z = false;
                                    qel0Var = new qel0(j4, false);
                                    qel0Var2 = qel0Var;
                                    g6m g6mVar2 = (g6m) amp0Var.c;
                                    j0l0 j0l0Var22 = (j0l0) amp0Var.a;
                                    j6 = j0l0Var22.j;
                                    j7 = qel0Var2.a;
                                    if (j7 >= j6) {
                                    }
                                    j8 = j7;
                                    h201Var3 = h201Var;
                                    if (h201Var3 != null) {
                                    }
                                }
                            }
                        }
                        z = false;
                        qel0Var = new qel0(j4, false);
                        qel0Var2 = qel0Var;
                        g6m g6mVar22 = (g6m) amp0Var.c;
                        j0l0 j0l0Var222 = (j0l0) amp0Var.a;
                        j6 = j0l0Var222.j;
                        j7 = qel0Var2.a;
                        if (j7 >= j6) {
                        }
                        j8 = j7;
                        h201Var3 = h201Var;
                        if (h201Var3 != null) {
                        }
                    }
                }
            }
            this.r = false;
            if (d7 < j3) {
            }
            this.e = d7;
            if (j4 >= j0l0Var.j) {
            }
            kel0Var.a7();
            ((g6m) amp0Var.c).c(0.0d);
            h201Var2 = this.j;
            if (h201Var2 != null) {
            }
        }
        return h201Var;
    }
}
