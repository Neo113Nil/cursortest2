package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public abstract class qib1 {
    public static final void a(List list, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1935659126);
        int i2 = 2;
        int i3 = (btsVar.e(list) ? 4 : 2) | i;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            f530 c = ljs0.c(c530.a, 1.0f);
            sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(-1850126055);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c((z3w) it.next(), btsVar, 8);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sn1(i, i2, list);
        }
    }

    public static final void b(iga igaVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-417645706);
        int i2 = (btsVar.k(igaVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 48, 0, 8189);
            a S = wwg.S(-841001885, true, new wg0(9, tlsVar), btsVar);
            a S2 = wwg.S(1918082690, true, new sp5(14, igaVar, tlsVar), btsVar);
            a S3 = wwg.S(-1829037354, true, new alb0(5, igaVar), btsVar);
            btsVar = btsVar;
            c.a(null, a, null, false, false, null, null, null, S, null, S2, S3, btsVar, 100663296, 54, 765);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(igaVar, tlsVar, i, 5);
        }
    }

    public static final void c(final z3w z3wVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(990565101);
        int i2 = (btsVar.e(z3wVar) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ydb1.a(an91.o(c530.a, 0.0f, 0.0f, 16.0f, 0.0f, 11), wwg.S(-1671079657, true, new zls() { // from class: aga
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    z3w z3wVar2 = z3wVar;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                String str = z3wVar2.a;
                                c530 c530Var = c530.a;
                                if (str == null) {
                                    btsVar2.e0(-167749380);
                                    oeb1.c(btsVar2, ljs0.q(c530Var, 16.0f));
                                    btsVar2.t(false);
                                    break;
                                } else {
                                    btsVar2.e0(-168089295);
                                    ovi0 a = mja1.a(z3wVar2.a, null, 6);
                                    f530 m = ljs0.m(c530Var, 56.0f);
                                    z4d.a.getClass();
                                    v0b1.a(a, m, null, z4d.b, z4d.c, null, null, mhe.f, 0.0f, 0, btsVar2, 12610608, 868);
                                    btsVar2.t(false);
                                    break;
                                }
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                m9b1.a(ebp0Var, z3wVar2.b, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 16382);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-141447108, true, new zls() { // from class: aga
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    z3w z3wVar2 = z3wVar;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                String str = z3wVar2.a;
                                c530 c530Var = c530.a;
                                if (str == null) {
                                    btsVar2.e0(-167749380);
                                    oeb1.c(btsVar2, ljs0.q(c530Var, 16.0f));
                                    btsVar2.t(false);
                                    break;
                                } else {
                                    btsVar2.e0(-168089295);
                                    ovi0 a = mja1.a(z3wVar2.a, null, 6);
                                    f530 m = ljs0.m(c530Var, 56.0f);
                                    z4d.a.getClass();
                                    v0b1.a(a, m, null, z4d.b, z4d.c, null, null, mhe.f, 0.0f, 0, btsVar2, 12610608, 868);
                                    btsVar2.t(false);
                                    break;
                                }
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                m9b1.a(ebp0Var, z3wVar2.b, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 16382);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, null, null, false, btsVar, 438, 248);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(z3wVar, i, 19);
        }
    }

    public static final SummaryAnalytics$SummaryExpandingState d(biv0 biv0Var) {
        return biv0Var.c() ? SummaryAnalytics$SummaryExpandingState.Expanded : SummaryAnalytics$SummaryExpandingState.Collapsed;
    }
}
