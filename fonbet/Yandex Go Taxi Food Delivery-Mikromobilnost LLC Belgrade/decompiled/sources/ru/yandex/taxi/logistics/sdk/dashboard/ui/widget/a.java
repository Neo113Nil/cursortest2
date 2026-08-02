package ru.yandex.taxi.logistics.sdk.dashboard.ui.widget;

import defpackage.a7u0;
import defpackage.abc;
import defpackage.aii0;
import defpackage.an91;
import defpackage.ba01;
import defpackage.bts;
import defpackage.c530;
import defpackage.clz0;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dke;
import defpackage.dr41;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.gl51;
import defpackage.hme;
import defpackage.j4v;
import defpackage.ldc;
import defpackage.lhg;
import defpackage.ljs0;
import defpackage.lyc;
import defpackage.lzr;
import defpackage.mhg;
import defpackage.o430;
import defpackage.ome;
import defpackage.ra90;
import defpackage.s3b1;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.z4;
import defpackage.zpn;
import ru.yandex.taxi.logistics.sdk.ui.component.control.e;

/* loaded from: classes5.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:24:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ome omeVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        final lhg lhgVar;
        final int i3;
        int i4;
        o430 o430Var;
        final int i5;
        Object obj;
        long j;
        long j2;
        bts btsVar2;
        int i6;
        bts btsVar3;
        bts btsVar4 = (bts) fidVar;
        btsVar4.g0(941448835);
        if ((i & 6) == 0) {
            i2 = i | (btsVar4.k(omeVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i7 = 1;
        if (btsVar4.V(i2 & 1, (i2 & 3) != 2)) {
            lhg lhgVar2 = (lhg) btsVar4.m(mhg.a);
            boolean z = omeVar instanceof clz0;
            o430 o430Var2 = did.a;
            if (z) {
                btsVar4.e0(565972192);
                f530 o = an91.o(ljs0.e(ljs0.q(c530.a, 60.0f), 40.0f), 8.0f, 4.0f, 0.0f, 4.0f, 4);
                clz0 clz0Var = (clz0) omeVar;
                String str = clz0Var.b;
                lzr lzrVar = lzr.G;
                boolean z2 = clz0Var.g;
                ldc ldcVar = clz0Var.d;
                ldc ldcVar2 = clz0Var.e;
                ldc ldcVar3 = clz0Var.f;
                boolean e = btsVar4.e(lhgVar2) | ((i2 & 14) == 4);
                Object Q = btsVar4.Q();
                Object obj2 = Q;
                if (e || Q == o430Var2) {
                    dke dkeVar = new dke(i7, lhgVar2, omeVar);
                    btsVar4.o0(dkeVar);
                    obj2 = dkeVar;
                }
                tls tlsVar = (tls) obj2;
                lhgVar = lhgVar2;
                i4 = i2;
                o430Var = o430Var2;
                i3 = 0;
                e.c(o, tlsVar, str, z2, ldcVar, ldcVar2, ldcVar3, lzrVar, 0L, btsVar4, 0);
                bts btsVar5 = btsVar4;
                btsVar5.t(false);
                btsVar3 = btsVar5;
            } else {
                lhgVar = lhgVar2;
                i3 = 0;
                i4 = i2;
                o430Var = o430Var2;
                if (omeVar instanceof j4v) {
                    btsVar4.e0(-1505739560);
                    ra90 ra90Var = ((j4v) omeVar).c;
                    boolean z3 = (i4 & 14) == 4;
                    Object Q2 = btsVar4.Q();
                    Object obj3 = Q2;
                    if (z3 || Q2 == o430Var) {
                        lyc lycVar = new lyc(17, omeVar);
                        btsVar4.o0(lycVar);
                        obj3 = lycVar;
                    }
                    s3b1.c(ra90Var, null, false, null, false, null, (sls) obj3, btsVar4, 0, 62);
                    btsVar4.t(false);
                    btsVar3 = btsVar4;
                } else if (omeVar instanceof ba01) {
                    btsVar4.e0(-1505734373);
                    ba01 ba01Var = (ba01) omeVar;
                    ldc ldcVar4 = ba01Var.e;
                    if (ldcVar4 == null) {
                        btsVar4.e0(-1505730674);
                        j = ((el51) btsVar4.m(gl51.a)).f();
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(-1505731914);
                        btsVar4.t(false);
                        j = ldcVar4.a;
                    }
                    String str2 = ba01Var.b;
                    ldc ldcVar5 = ba01Var.d;
                    if (ldcVar5 == null) {
                        btsVar4.e0(-1505727020);
                        j2 = ((el51) btsVar4.m(gl51.a)).p();
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(-1505728198);
                        btsVar4.t(false);
                        j2 = ldcVar5.a;
                    }
                    boolean e2 = btsVar4.e(lhgVar) | ((i4 & 14) == 4);
                    Object Q3 = btsVar4.Q();
                    Object obj4 = Q3;
                    if (e2 || Q3 == o430Var) {
                        sls slsVar = new sls() { // from class: gme
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i8 = i3;
                                zy11 zy11Var = zy11.a;
                                ome omeVar2 = omeVar;
                                lhg lhgVar3 = lhgVar;
                                switch (i8) {
                                    case 0:
                                        ba01 ba01Var2 = (ba01) omeVar2;
                                        lhgVar3.b(ba01Var2.g, ba01Var2.f);
                                        ba01Var2.c.b.invoke();
                                        break;
                                    default:
                                        abc abcVar = (abc) omeVar2;
                                        abcVar.getClass();
                                        lhgVar3.b(null, null);
                                        abcVar.c.b.invoke();
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar4.o0(slsVar);
                        obj4 = slsVar;
                    }
                    b(j, str2, j2, null, (sls) obj4, btsVar4, 0);
                    btsVar4.t(false);
                    btsVar3 = btsVar4;
                } else {
                    if (!(omeVar instanceof abc)) {
                        throw unr0.y(-1505763603, btsVar4, false);
                    }
                    btsVar4.e0(-1505717171);
                    abc abcVar = (abc) omeVar;
                    a7u0 a7u0Var = gl51.a;
                    long g = ((el51) btsVar4.m(a7u0Var)).g();
                    String str3 = abcVar.b;
                    long q = ((el51) btsVar4.m(a7u0Var)).q();
                    lzr lzrVar2 = abcVar.d;
                    boolean e3 = btsVar4.e(lhgVar) | ((i4 & 14) == 4);
                    Object Q4 = btsVar4.Q();
                    if (e3 || Q4 == o430Var) {
                        i5 = 1;
                        sls slsVar2 = new sls() { // from class: gme
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i8 = i5;
                                zy11 zy11Var = zy11.a;
                                ome omeVar2 = omeVar;
                                lhg lhgVar3 = lhgVar;
                                switch (i8) {
                                    case 0:
                                        ba01 ba01Var2 = (ba01) omeVar2;
                                        lhgVar3.b(ba01Var2.g, ba01Var2.f);
                                        ba01Var2.c.b.invoke();
                                        break;
                                    default:
                                        abc abcVar2 = (abc) omeVar2;
                                        abcVar2.getClass();
                                        lhgVar3.b(null, null);
                                        abcVar2.c.b.invoke();
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar4.o0(slsVar2);
                        obj = slsVar2;
                    } else {
                        i5 = 1;
                        obj = Q4;
                    }
                    b(g, str3, q, lzrVar2, (sls) obj, btsVar4, 0);
                    btsVar4.t(false);
                    btsVar2 = btsVar4;
                    i6 = (btsVar2.e(lhgVar) ? 1 : 0) | ((i4 & 14) != 4 ? i5 : i3);
                    Object Q5 = btsVar2.Q();
                    Object obj5 = Q5;
                    if (i6 == 0 || Q5 == o430Var) {
                        ControlKt$Control$5$1 controlKt$Control$5$1 = new ControlKt$Control$5$1(lhgVar, omeVar, null);
                        btsVar2.o0(controlKt$Control$5$1);
                        obj5 = controlKt$Control$5$1;
                    }
                    zpn.e(btsVar2, (wls) obj5, omeVar);
                    btsVar = btsVar2;
                }
            }
            i5 = 1;
            btsVar2 = btsVar3;
            i6 = (btsVar2.e(lhgVar) ? 1 : 0) | ((i4 & 14) != 4 ? i5 : i3);
            Object Q52 = btsVar2.Q();
            Object obj52 = Q52;
            if (i6 == 0) {
            }
            ControlKt$Control$5$1 controlKt$Control$5$12 = new ControlKt$Control$5$1(lhgVar, omeVar, null);
            btsVar2.o0(controlKt$Control$5$12);
            obj52 = controlKt$Control$5$12;
            zpn.e(btsVar2, (wls) obj52, omeVar);
            btsVar = btsVar2;
        } else {
            btsVar4.Y();
            btsVar = btsVar4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(omeVar, i, 9);
        }
    }

    public static final void b(long j, String str, long j2, lzr lzrVar, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-759906302);
        int i2 = i | (btsVar2.a(true) ? 4 : 2) | (btsVar2.d(j) ? 32 : 16) | (btsVar2.k(str) ? 256 : 128) | (btsVar2.d(j2) ? 2048 : 1024) | (btsVar2.k(lzrVar) ? 16384 : 8192) | (btsVar2.e(slsVar) ? 131072 : 65536);
        if (btsVar2.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b(slsVar, ljs0.u(c530.a, null, 3), cyk0.a, j, 0L, null, null, null, true, null, null, null, wwg.S(-494767261, true, new dr41(lzrVar, str, j2), btsVar2), btsVar, ((i2 >> 15) & 14) | 48 | ((i2 << 6) & 7168) | ((i2 << 24) & 234881024), 384, 3824);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hme(j, str, j2, lzrVar, slsVar, i);
        }
    }
}
