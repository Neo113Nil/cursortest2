package defpackage;

import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.loading.b;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.a;
import java.util.List;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

/* loaded from: classes11.dex */
public final class zx8 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ tls c;

    public /* synthetic */ zx8(List list, tls tlsVar, int i) {
        this.a = i;
        this.b = list;
        this.c = tlsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        c530 c530Var = c530.a;
        Object obj5 = did.a;
        tls tlsVar = this.c;
        zy11 zy11Var = zy11.a;
        List list = this.b;
        int i15 = 0;
        switch (i14) {
            case 0:
                boolean z = true;
                u4y u4yVar = (u4y) obj;
                int intValue = ((Number) obj2).intValue();
                fid fidVar = (fid) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((bts) fidVar).k(u4yVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= fidVar.c(intValue) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(i & 1, (i & 147) != 146)) {
                    hx8 hx8Var = (hx8) list.get(intValue);
                    btsVar.e0(-422038663);
                    k3r k3rVar = ljs0.b;
                    if ((((i & 112) ^ 48) <= 32 || !btsVar.c(intValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    Object Q = btsVar.Q();
                    if (z || Q == obj5) {
                        Q = new yx8(intValue, i15);
                        btsVar.o0(Q);
                    }
                    a.c(hx8Var, fnq0.b(k3rVar, false, (tls) Q), this.c, btsVar, 0, 0);
                    btsVar.t(false);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                u4y u4yVar2 = (u4y) obj;
                int intValue3 = ((Number) obj2).intValue();
                fid fidVar2 = (fid) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((bts) fidVar2).k(u4yVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= fidVar2.c(intValue3) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
                    lt ltVar = (lt) list.get(intValue3);
                    btsVar2.e0(63519168);
                    nvi0 nvi0Var = ltVar.a;
                    CharSequence charSequence = ltVar.b;
                    wp2 wp2Var = ltVar.d;
                    wp2 wp2Var2 = ltVar.c;
                    boolean k = btsVar2.k(tlsVar) | btsVar2.k(ltVar);
                    Object Q2 = btsVar2.Q();
                    if (k || Q2 == obj5) {
                        Q2 = new z5(1, tlsVar, ltVar);
                        btsVar2.o0(Q2);
                    }
                    aka1.a(nvi0Var, charSequence, wp2Var, wp2Var2, null, (sls) Q2, btsVar2, 0);
                    btsVar2.t(false);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                u4y u4yVar3 = (u4y) obj;
                int intValue5 = ((Number) obj2).intValue();
                fid fidVar3 = (fid) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((bts) fidVar3).k(u4yVar3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= fidVar3.c(intValue5) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(i3 & 1, (i3 & 147) != 146)) {
                    dxb dxbVar = (dxb) list.get(intValue5);
                    btsVar3.e0(146033856);
                    fmb1.a(dxbVar, tlsVar, btsVar3, 0);
                    btsVar3.t(false);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                u4y u4yVar4 = (u4y) obj;
                int intValue7 = ((Number) obj2).intValue();
                fid fidVar4 = (fid) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((bts) fidVar4).k(u4yVar4) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= fidVar4.c(intValue7) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(i4 & 1, (i4 & 147) != 146)) {
                    evd evdVar = (evd) list.get(intValue7);
                    btsVar4.e0(-521017161);
                    if (intValue7 > 0) {
                        btsVar4.e0(-521012388);
                        yrl.c(null, null, btsVar4, 0, 7);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(-520968182);
                        btsVar4.t(false);
                    }
                    boolean k2 = btsVar4.k(tlsVar) | btsVar4.k(evdVar);
                    Object Q3 = btsVar4.Q();
                    if (k2 || Q3 == obj5) {
                        Q3 = new z5(8, tlsVar, evdVar);
                        btsVar4.o0(Q3);
                    }
                    ppb1.a(evdVar, (sls) Q3, btsVar4, 0);
                    btsVar4.t(false);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                u4y u4yVar5 = (u4y) obj;
                int intValue9 = ((Number) obj2).intValue();
                fid fidVar5 = (fid) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    i5 = intValue10 | (((bts) fidVar5).k(u4yVar5) ? 4 : 2);
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= fidVar5.c(intValue9) ? 32 : 16;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(i5 & 1, (i5 & 147) != 146)) {
                    pte pteVar = (pte) list.get(intValue9);
                    btsVar5.e0(1845677183);
                    awk0 awk0Var = new awk0(0);
                    boolean k3 = btsVar5.k(tlsVar) | btsVar5.k(pteVar);
                    Object Q4 = btsVar5.Q();
                    if (k3 || Q4 == obj5) {
                        Q4 = new z5(9, tlsVar, pteVar);
                        btsVar5.o0(Q4);
                    }
                    ydb1.a(q791.d(c530.a, false, null, awk0Var, (sls) Q4, 11), wwg.S(1221503701, true, new bte(pteVar, i15), btsVar5), wwg.S(-411719494, true, new bte(pteVar, 1), btsVar5), null, na01.a, null, SlotSize.L, false, btsVar5, 1573296, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
                    btsVar5.t(false);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                u4y u4yVar6 = (u4y) obj;
                int intValue11 = ((Number) obj2).intValue();
                fid fidVar6 = (fid) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    i6 = intValue12 | (((bts) fidVar6).k(u4yVar6) ? 4 : 2);
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= fidVar6.c(intValue11) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(i6 & 1, (i6 & 147) != 146)) {
                    giu0 giu0Var = (giu0) list.get(intValue11);
                    btsVar6.e0(102935044);
                    if (giu0Var instanceof fiu0) {
                        btsVar6.e0(102972553);
                        zob1.d((fiu0) giu0Var, ljs0.c(c530Var, 1.0f), null, btsVar6, 48, 4);
                        btsVar6.t(false);
                    } else if (giu0Var instanceof diu0) {
                        btsVar6.e0(103181183);
                        diu0 diu0Var = (diu0) giu0Var;
                        boolean k4 = btsVar6.k(tlsVar);
                        Object Q5 = btsVar6.Q();
                        if (k4 || Q5 == obj5) {
                            Q5 = new gm5(r14, tlsVar);
                            btsVar6.o0(Q5);
                        }
                        zob1.a(diu0Var, (tls) Q5, ljs0.c(c530Var, 1.0f), btsVar6, 392);
                        btsVar6.t(false);
                    } else {
                        if (!(giu0Var instanceof eiu0)) {
                            throw unr0.y(1942983135, btsVar6, false);
                        }
                        btsVar6.e0(103465980);
                        zob1.c(ljs0.c(c530Var, 1.0f), intValue11 == 0, ((eiu0) giu0Var).a, btsVar6, 6);
                        btsVar6.t(false);
                    }
                    btsVar6.t(false);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                u4y u4yVar7 = (u4y) obj;
                int intValue13 = ((Number) obj2).intValue();
                fid fidVar7 = (fid) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    i7 = intValue14 | (((bts) fidVar7).k(u4yVar7) ? 4 : 2);
                } else {
                    i7 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i7 |= fidVar7.c(intValue13) ? 32 : 16;
                }
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(i7 & 1, (i7 & 147) != 146)) {
                    dl2 dl2Var = (dl2) list.get(intValue13);
                    btsVar7.e0(-115438767);
                    boolean k5 = btsVar7.k(dl2Var.a);
                    Object Q6 = btsVar7.Q();
                    if (k5 || Q6 == obj5) {
                        Q6 = new z5(18, tlsVar, dl2Var);
                        btsVar7.o0(Q6);
                    }
                    gxd0.a((sls) Q6, dl2Var.b, dl2Var.c, btsVar7, 0);
                    btsVar7.t(false);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 7:
                u4y u4yVar8 = (u4y) obj;
                int intValue15 = ((Number) obj2).intValue();
                fid fidVar8 = (fid) obj3;
                int intValue16 = ((Number) obj4).intValue();
                if ((intValue16 & 6) == 0) {
                    i8 = intValue16 | (((bts) fidVar8).k(u4yVar8) ? 4 : 2);
                } else {
                    i8 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i8 |= fidVar8.c(intValue15) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(i8 & 1, (i8 & 147) != 146)) {
                    jej0 jej0Var = (jej0) list.get(intValue15);
                    btsVar8.e0(-1884986165);
                    f530 a = u4y.a(u4yVar8, c530Var, 7);
                    boolean z2 = (((i8 & 112) ^ 48) > 32 && btsVar8.c(intValue15)) || (i8 & 48) == 32;
                    Object Q7 = btsVar8.Q();
                    if (z2 || Q7 == obj5) {
                        Q7 = new yx8(intValue15, 1);
                        btsVar8.o0(Q7);
                    }
                    jla1.a(jej0Var, fnq0.b(a, false, (tls) Q7), tlsVar, btsVar8, 0);
                    btsVar8.t(false);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 8:
                u4y u4yVar9 = (u4y) obj;
                int intValue17 = ((Number) obj2).intValue();
                fid fidVar9 = (fid) obj3;
                int intValue18 = ((Number) obj4).intValue();
                if ((intValue18 & 6) == 0) {
                    i9 = intValue18 | (((bts) fidVar9).k(u4yVar9) ? 4 : 2);
                } else {
                    i9 = intValue18;
                }
                if ((intValue18 & 48) == 0) {
                    i9 |= fidVar9.c(intValue17) ? 32 : 16;
                }
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(i9 & 1, (i9 & 147) != 146)) {
                    lhj0 lhj0Var = (lhj0) list.get(intValue17);
                    btsVar9.e0(1453721880);
                    ula1.f(ooc.d(u4y.a(u4yVar9, c530Var, 7), null, 3), lhj0Var, tlsVar, btsVar9, 0);
                    if (lhj0Var.e || (lhj0Var.d != null && lhj0Var.c)) {
                        btsVar9.e0(1454095708);
                        btsVar9.t(false);
                    } else {
                        btsVar9.e0(1453994803);
                        yrl.c(u4y.a(u4yVar9, c530Var, 7), null, btsVar9, 0, 6);
                        btsVar9.t(false);
                    }
                    btsVar9.t(false);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                u4y u4yVar10 = (u4y) obj;
                int intValue19 = ((Number) obj2).intValue();
                fid fidVar10 = (fid) obj3;
                int intValue20 = ((Number) obj4).intValue();
                if ((intValue20 & 6) == 0) {
                    i10 = intValue20 | (((bts) fidVar10).k(u4yVar10) ? 4 : 2);
                } else {
                    i10 = intValue20;
                }
                if ((intValue20 & 48) == 0) {
                    i10 |= fidVar10.c(intValue19) ? 32 : 16;
                }
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(i10 & 1, (i10 & 147) != 146)) {
                    dme dmeVar = (dme) list.get(intValue19);
                    btsVar10.e0(1592081541);
                    f530 e = ljs0.e(ljs0.q(c530Var, 90.0f), 90.0f);
                    boolean k6 = btsVar10.k(tlsVar) | btsVar10.e(dmeVar);
                    Object Q8 = btsVar10.Q();
                    if (k6 || Q8 == obj5) {
                        Q8 = new ehl0(tlsVar, dmeVar, 0);
                        btsVar10.o0(Q8);
                    }
                    kva1.a(dmeVar, (sls) Q8, e, btsVar10, 384);
                    btsVar10.t(false);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 10:
                u4y u4yVar11 = (u4y) obj;
                int intValue21 = ((Number) obj2).intValue();
                fid fidVar11 = (fid) obj3;
                int intValue22 = ((Number) obj4).intValue();
                if ((intValue22 & 6) == 0) {
                    i11 = intValue22 | (((bts) fidVar11).k(u4yVar11) ? 4 : 2);
                } else {
                    i11 = intValue22;
                }
                if ((intValue22 & 48) == 0) {
                    i11 |= fidVar11.c(intValue21) ? 32 : 16;
                }
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(i11 & 1, (i11 & 147) != 146)) {
                    cb01 cb01Var = (cb01) list.get(intValue21);
                    btsVar11.e0(-451434381);
                    if (cb01Var instanceof bb01) {
                        btsVar11.e0(-451392904);
                        bb01 bb01Var = (bb01) cb01Var;
                        boolean k7 = btsVar11.k(tlsVar) | btsVar11.k(cb01Var);
                        Object Q9 = btsVar11.Q();
                        if (k7 || Q9 == obj5) {
                            Q9 = new gnm0(tlsVar, bb01Var, 0);
                            btsVar11.o0(Q9);
                        }
                        sls slsVar = (sls) Q9;
                        boolean k8 = btsVar11.k(cb01Var) | btsVar11.k(tlsVar);
                        Object Q10 = btsVar11.Q();
                        if (k8 || Q10 == obj5) {
                            Q10 = new gnm0(tlsVar, bb01Var, 1);
                            btsVar11.o0(Q10);
                        }
                        csb1.c(bb01Var, slsVar, (sls) Q10, btsVar11, 0);
                        btsVar11.t(false);
                    } else {
                        if (!jl40.l(cb01Var, ab01.a)) {
                            throw unr0.y(-568751728, btsVar11, false);
                        }
                        btsVar11.e0(-451161706);
                        b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 157.0f), cyk0.c(24.0f), false, null, null, null, false, btsVar11, 6, 252);
                        btsVar11.t(false);
                    }
                    btsVar11.t(false);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 11:
                u4y u4yVar12 = (u4y) obj;
                int intValue23 = ((Number) obj2).intValue();
                fid fidVar12 = (fid) obj3;
                int intValue24 = ((Number) obj4).intValue();
                if ((intValue24 & 6) == 0) {
                    i12 = intValue24 | (((bts) fidVar12).k(u4yVar12) ? 4 : 2);
                } else {
                    i12 = intValue24;
                }
                if ((intValue24 & 48) == 0) {
                    i12 |= fidVar12.c(intValue23) ? 32 : 16;
                }
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(i12 & 1, (i12 & 147) != 146)) {
                    jrr0 jrr0Var = (jrr0) list.get(intValue23);
                    btsVar12.e0(943995796);
                    f530 m = an91.m(c530Var, 16.0f, 0.0f, 2);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar12.T);
                    r1b0 o = btsVar12.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar12, m);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar12.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar12.i0();
                    if (btsVar12.S) {
                        btsVar12.n(slsVar2);
                    } else {
                        btsVar12.r0();
                    }
                    qje.W(btsVar12, d.f, d);
                    qje.W(btsVar12, d.e, o);
                    qje.W(btsVar12, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar12, d.h);
                    qje.W(btsVar12, d.d, d2);
                    boolean k9 = btsVar12.k(tlsVar) | btsVar12.k(jrr0Var);
                    Object Q11 = btsVar12.Q();
                    if (k9 || Q11 == obj5) {
                        Q11 = new z5(24, tlsVar, jrr0Var);
                        btsVar12.o0(Q11);
                    }
                    ccb1.c(jrr0Var, (sls) Q11, btsVar12, 0);
                    btsVar12.t(true);
                    btsVar12.t(false);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            default:
                u4y u4yVar13 = (u4y) obj;
                int intValue25 = ((Number) obj2).intValue();
                fid fidVar13 = (fid) obj3;
                int intValue26 = ((Number) obj4).intValue();
                if ((intValue26 & 6) == 0) {
                    i13 = intValue26 | (((bts) fidVar13).k(u4yVar13) ? 4 : 2);
                } else {
                    i13 = intValue26;
                }
                if ((intValue26 & 48) == 0) {
                    i13 |= fidVar13.c(intValue25) ? 32 : 16;
                }
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(i13 & 1, (i13 & 147) != 146)) {
                    xj31 xj31Var = (xj31) list.get(intValue25);
                    btsVar13.e0(-1685571297);
                    f530 a2 = u4y.a(u4yVar13, c530Var, 7);
                    boolean z3 = (((i13 & 112) ^ 48) > 32 && btsVar13.c(intValue25)) || (i13 & 48) == 32;
                    Object Q12 = btsVar13.Q();
                    if (z3 || Q12 == obj5) {
                        Q12 = new yx8(intValue25, r15);
                        btsVar13.o0(Q12);
                    }
                    f530 b = fnq0.b(a2, false, (tls) Q12);
                    if (xj31Var instanceof vj31) {
                        btsVar13.e0(-1685229182);
                        com.yandex.go.summary.ui.compose.common.selector.a.a((vj31) xj31Var, b, tlsVar, btsVar13, 0);
                        btsVar13.t(false);
                    } else {
                        if (!(xj31Var instanceof wj31)) {
                            throw unr0.y(-331459190, btsVar13, false);
                        }
                        btsVar13.e0(-1684976160);
                        com.yandex.go.summary.ui.compose.common.selector.a.e((wj31) xj31Var, b, tlsVar, btsVar13, 0);
                        btsVar13.t(false);
                    }
                    btsVar13.t(false);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
        }
    }
}
