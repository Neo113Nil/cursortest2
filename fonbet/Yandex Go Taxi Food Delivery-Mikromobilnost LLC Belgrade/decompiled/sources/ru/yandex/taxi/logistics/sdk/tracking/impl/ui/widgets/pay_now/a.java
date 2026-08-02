package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now;

import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bm50;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.gji0;
import defpackage.gl51;
import defpackage.jl40;
import defpackage.l2a0;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lt90;
import defpackage.mb;
import defpackage.n07;
import defpackage.nt90;
import defpackage.nxu;
import defpackage.ocb1;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qm51;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.v4v;
import defpackage.web1;
import defpackage.wg30;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wzr;
import defpackage.x4c;
import defpackage.z4;
import defpackage.zpn;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(n07 n07Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        long g;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1976051972);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(n07Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            f530 f = ocb1.f(ljs0.e(ljs0.c(an91.o(c530.a, 16.0f, 0.0f, 16.0f, 16.0f, 2), 1.0f), 56.0f), n07Var.f, btsVar2, 0);
            byk0 b = ((YandexShapes) btsVar2.m(qm51.a)).b();
            if (n07Var.e) {
                btsVar2.e0(-1742163216);
                g = ((el51) btsVar2.m(gl51.a)).f();
                btsVar2.t(false);
            } else {
                btsVar2.e0(-1742103665);
                g = ((el51) btsVar2.m(gl51.a)).g();
                btsVar2.t(false);
            }
            boolean z = n07Var.d;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object Q = btsVar2.Q();
            if (z2 || Q == did.a) {
                Q = new bm50(24, tlsVar, n07Var);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q, f, b, g, 0L, null, null, null, z, null, null, null, wwg.S(1356363323, true, new wg30(23, n07Var), btsVar2), btsVar, 0, 384, 3824);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(n07Var, tlsVar, i, 29);
        }
    }

    public static final void b(final l2a0 l2a0Var, fid fidVar, int i) {
        int i2;
        androidx.compose.runtime.internal.a S;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1990059359);
        final int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(l2a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.runtime.internal.a S2 = wwg.S(873129756, true, new wls() { // from class: mt90
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    l2a0 l2a0Var2 = l2a0Var;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i6) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else {
                                v4v v4vVar = l2a0Var2.i;
                                if (v4vVar == null) {
                                    btsVar2.e0(1086646894);
                                } else {
                                    btsVar2.e0(1086646895);
                                    s3b1.f(v4vVar, null, null, btsVar2, 0, 6);
                                }
                                btsVar2.t(false);
                                break;
                            }
                        case 1:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else {
                                aib1.c(null, l2a0Var2.a, l2a0Var2.b, null, btsVar3, 0, 9);
                                break;
                            }
                        default:
                            bts btsVar4 = (bts) fidVar2;
                            if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar4.Y();
                                break;
                            } else {
                                aib1.c(null, l2a0Var2.c, l2a0Var2.d, null, btsVar4, 0, 9);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            androidx.compose.runtime.internal.a S3 = wwg.S(-1065409541, true, new wls() { // from class: mt90
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    l2a0 l2a0Var2 = l2a0Var;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i6) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else {
                                v4v v4vVar = l2a0Var2.i;
                                if (v4vVar == null) {
                                    btsVar2.e0(1086646894);
                                } else {
                                    btsVar2.e0(1086646895);
                                    s3b1.f(v4vVar, null, null, btsVar2, 0, 6);
                                }
                                btsVar2.t(false);
                                break;
                            }
                        case 1:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else {
                                aib1.c(null, l2a0Var2.a, l2a0Var2.b, null, btsVar3, 0, 9);
                                break;
                            }
                        default:
                            bts btsVar4 = (bts) fidVar2;
                            if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar4.Y();
                                break;
                            } else {
                                aib1.c(null, l2a0Var2.c, l2a0Var2.d, null, btsVar4, 0, 9);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            androidx.compose.runtime.internal.a S4 = wwg.S(1291018458, true, new wls() { // from class: mt90
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i3;
                    zy11 zy11Var = zy11.a;
                    l2a0 l2a0Var2 = l2a0Var;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i6) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else {
                                v4v v4vVar = l2a0Var2.i;
                                if (v4vVar == null) {
                                    btsVar2.e0(1086646894);
                                } else {
                                    btsVar2.e0(1086646895);
                                    s3b1.f(v4vVar, null, null, btsVar2, 0, 6);
                                }
                                btsVar2.t(false);
                                break;
                            }
                        case 1:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else {
                                aib1.c(null, l2a0Var2.a, l2a0Var2.b, null, btsVar3, 0, 9);
                                break;
                            }
                        default:
                            bts btsVar4 = (bts) fidVar2;
                            if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar4.Y();
                                break;
                            } else {
                                aib1.c(null, l2a0Var2.c, l2a0Var2.d, null, btsVar4, 0, 9);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            v4v v4vVar = l2a0Var.e;
            if (v4vVar == null) {
                btsVar.e0(-1869790765);
                btsVar.t(false);
                S = null;
            } else {
                btsVar.e0(-1869790764);
                S = wwg.S(1858212722, true, new mb(v4vVar, 17), btsVar);
                btsVar.t(false);
            }
            web1.c(null, 0.0f, false, 0.0f, null, S2, S3, S4, null, S, null, null, false, btsVar, 14352384, 0, 7455);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(l2a0Var, i, 28);
        }
    }

    public static final void c(nt90 nt90Var, tls tlsVar, tls tlsVar2, tls tlsVar3, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1114531574);
        int i2 = i | (btsVar.k(nt90Var) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            d(nt90Var.c, tlsVar, btsVar, 48);
            a(nt90Var.d, tlsVar2, btsVar, 48);
            btsVar.t(true);
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new PayNowKt$PayNow$3$1(tlsVar3, nt90Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, nt90Var);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr((Object) nt90Var, (Object) tlsVar, (Object) tlsVar2, (Object) tlsVar3, i, 28);
        }
    }

    public static final void d(l2a0 l2a0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2130638906);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(l2a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            i3 = 0;
            btsVar.Y();
        } else if (l2a0Var.g) {
            btsVar.e0(-1457881575);
            gji0 gji0Var = qke.q;
            long j = ldc.l;
            boolean z = l2a0Var.f;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new bm50(25, tlsVar, l2a0Var);
                btsVar.o0(Q);
            }
            i3 = 0;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q, null, gji0Var, j, 0L, null, null, null, z, null, null, null, wwg.S(468507070, true, new wg30(24, l2a0Var), btsVar), btsVar, 3456, 384, 3826);
            btsVar = btsVar;
            btsVar.t(false);
        } else {
            i3 = 0;
            btsVar.e0(-1457638628);
            b(l2a0Var, btsVar, i2 & 14);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(l2a0Var, tlsVar, i, i3);
        }
    }
}
