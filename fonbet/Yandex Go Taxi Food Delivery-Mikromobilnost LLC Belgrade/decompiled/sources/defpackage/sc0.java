package defpackage;

import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.scooters.bdui.c;
import com.yandex.go.scooters.bdui.view.ScootersComposeToDivkitCompatFrameLayout;
import com.yandex.messaging.ui.folders.selectDialog.SelectFolderDialogFragment;
import com.yandex.messaging.ui.folders.selectDialog.e;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.masstransit.geopayment.purchase.a;

/* loaded from: classes11.dex */
public final class sc0 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public sc0(List list, tls tlsVar, pa90 pa90Var, tls tlsVar2) {
        this.a = 0;
        this.c = list;
        this.b = tlsVar;
        this.x = pa90Var;
        this.w = tlsVar2;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        sbq0 SelectFolderDialogContent$lambda$6;
        boolean z3;
        boolean e;
        Object Q;
        sbq0 SelectFolderDialogContent$lambda$62;
        int i5;
        int i6 = this.a;
        int i7 = 5;
        int i8 = 3;
        Object obj5 = did.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj6 = this.b;
        Object obj7 = this.x;
        Object obj8 = this.w;
        Object obj9 = this.c;
        int i9 = 4;
        switch (i6) {
            case 0:
                u4y u4yVar = (u4y) obj;
                int intValue = ((Number) obj2).intValue();
                fid fidVar = (fid) obj3;
                int intValue2 = ((Number) obj4).intValue();
                tls tlsVar = (tls) obj6;
                tls tlsVar2 = (tls) obj8;
                if ((intValue2 & 6) == 0) {
                    z = true;
                    i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
                } else {
                    z = true;
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= fidVar.c(intValue) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(i & 1, (i & 147) != 146 ? z : false)) {
                    q5f q5fVar = (q5f) ((List) obj9).get(intValue);
                    btsVar.e0(-860984695);
                    if (q5fVar instanceof m5f) {
                        btsVar.e0(2050437684);
                        m5f m5fVar = (m5f) q5fVar;
                        btsVar.e0(2050440346);
                        boolean k = btsVar.k(q5fVar) | btsVar.k(tlsVar);
                        Object Q2 = btsVar.Q();
                        if (k || Q2 == obj5) {
                            Q2 = new z5(2, tlsVar, m5fVar);
                            btsVar.o0(Q2);
                        }
                        z2 = false;
                        btsVar.t(false);
                        tra1.a(m5fVar, (sls) Q2, (pa90) obj7, u4y.a(u4yVar, c530Var, 7), btsVar, 0);
                        btsVar.t(false);
                    } else if (q5fVar instanceof p5f) {
                        btsVar.e0(2050447610);
                        btsVar.e0(2050449272);
                        boolean k2 = btsVar.k(tlsVar2) | btsVar.k(q5fVar);
                        Object Q3 = btsVar.Q();
                        if (k2 || Q3 == obj5) {
                            Q3 = new z5(i8, tlsVar2, (p5f) q5fVar);
                            btsVar.o0(Q3);
                        }
                        z2 = false;
                        btsVar.t(false);
                        jsa1.d(0, btsVar, (sls) Q3, u4y.a(u4yVar, c530Var, 7));
                        btsVar.t(false);
                    } else if (q5fVar instanceof o5f) {
                        btsVar.e0(2050454589);
                        o5f o5fVar = (o5f) q5fVar;
                        btsVar.e0(2050457336);
                        boolean k3 = btsVar.k(q5fVar) | btsVar.k(tlsVar2);
                        Object Q4 = btsVar.Q();
                        if (k3 || Q4 == obj5) {
                            Q4 = new z5(i9, tlsVar2, o5fVar);
                            btsVar.o0(Q4);
                        }
                        z2 = false;
                        btsVar.t(false);
                        jsa1.c(o5fVar, (sls) Q4, u4y.a(u4yVar, c530Var, 7), btsVar, 0);
                        btsVar.t(false);
                    } else {
                        if (!(q5fVar instanceof n5f)) {
                            throw unr0.y(2050436282, btsVar, false);
                        }
                        btsVar.e0(2050462587);
                        btsVar.e0(2050464280);
                        boolean k4 = btsVar.k(tlsVar2) | btsVar.k(q5fVar);
                        Object Q5 = btsVar.Q();
                        if (k4 || Q5 == obj5) {
                            Q5 = new z5(i7, tlsVar2, (n5f) q5fVar);
                            btsVar.o0(Q5);
                        }
                        z2 = false;
                        btsVar.t(false);
                        jsa1.e(0, btsVar, (sls) Q5, u4y.a(u4yVar, c530Var, 7));
                        btsVar.t(false);
                    }
                    btsVar.t(z2);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                u4y u4yVar2 = (u4y) obj;
                int intValue3 = ((Number) obj2).intValue();
                fid fidVar2 = (fid) obj3;
                int intValue4 = ((Number) obj4).intValue();
                sls slsVar = (sls) obj8;
                tls tlsVar3 = (tls) obj6;
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
                    fu30 fu30Var = (fu30) ((ArrayList) obj9).get(intValue3);
                    btsVar2.e0(-7484460);
                    boolean k5 = btsVar2.k(tlsVar3) | btsVar2.k(fu30Var) | btsVar2.k(slsVar);
                    Object Q6 = btsVar2.Q();
                    if (k5 || Q6 == obj5) {
                        Q6 = new m0v(i9, tlsVar3, fu30Var, slsVar);
                        btsVar2.o0(Q6);
                    }
                    a.b(fu30Var, (sls) Q6, btsVar2, 0);
                    if (intValue3 < scc.f(((ku30) obj7).b)) {
                        btsVar2.e0(-7194239);
                        yrl.e(null, null, btsVar2, 0, 7);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-7146189);
                        btsVar2.t(false);
                    }
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
                oz40 oz40Var = (oz40) obj7;
                tls tlsVar4 = (tls) obj6;
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
                    w7b0 w7b0Var = (w7b0) ((List) obj9).get(intValue5);
                    btsVar3.e0(-1489485453);
                    String str = w7b0Var.a;
                    w7b0 w7b0Var2 = (w7b0) oz40Var.getValue();
                    boolean l = jl40.l(str, w7b0Var2 != null ? w7b0Var2.a : null);
                    f530 l2 = an91.l(c530Var, 12.0f, 3.0f);
                    boolean z4 = ((v4b0) obj8).f;
                    boolean k6 = btsVar3.k(tlsVar4) | btsVar3.k(w7b0Var) | btsVar3.k(oz40Var);
                    Object Q7 = btsVar3.Q();
                    if (k6 || Q7 == obj5) {
                        Q7 = new m0v(i7, tlsVar4, w7b0Var, oz40Var);
                        btsVar3.o0(Q7);
                    }
                    sls slsVar2 = (sls) Q7;
                    boolean k7 = btsVar3.k(tlsVar4);
                    Object Q8 = btsVar3.Q();
                    if (k7 || Q8 == obj5) {
                        Q8 = new gm5(4, tlsVar4);
                        btsVar3.o0(Q8);
                    }
                    fi91.a(z4, w7b0Var, slsVar2, (tls) Q8, l, l2, btsVar3, 0);
                    btsVar3.t(false);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                j690 j690Var = (j690) obj2;
                fid fidVar4 = (fid) obj3;
                int intValue7 = ((Number) obj4).intValue();
                if ((intValue7 & 48) == 0) {
                    intValue7 |= ((bts) fidVar4).k(j690Var) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue7 & 1, (intValue7 & 145) != 144)) {
                    f530 d = ooc.d(ljs0.c(an91.j(c530Var, j690Var), 1.0f), null, 3);
                    ScootersComposeToDivkitCompatFrameLayout scootersComposeToDivkitCompatFrameLayout = (ScootersComposeToDivkitCompatFrameLayout) obj9;
                    xhr xhrVar = (xhr) obj6;
                    pjr pjrVar = (pjr) obj8;
                    yx40 yx40Var = (yx40) obj7;
                    z910 d2 = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar4.T);
                    r1b0 o = btsVar4.o();
                    f530 d3 = b.d(btsVar4, d);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar3);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, d2);
                    qje.W(btsVar4, d.e, o);
                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar4, d.h);
                    qje.W(btsVar4, d.d, d3);
                    f530 c = ljs0.c(c530Var, 1.0f);
                    int intValue8 = yx40Var.getIntValue();
                    c.b(c.k(intValue8 > 0 ? ljs0.f(c530Var, 0.0f, ((fwi) btsVar4.m(j.h)).H(intValue8)) : ljs0.e(c530Var, 300.0f)), scootersComposeToDivkitCompatFrameLayout, xhrVar, pjrVar, btsVar4, ScootersComposeToDivkitCompatFrameLayout.$stable << 3);
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                u4y u4yVar4 = (u4y) obj;
                int intValue9 = ((Number) obj2).intValue();
                fid fidVar5 = (fid) obj3;
                int intValue10 = ((Number) obj4).intValue();
                e eVar = (e) obj8;
                m3u0 m3u0Var = (m3u0) obj7;
                if ((intValue10 & 6) == 0) {
                    i4 = intValue10 | (((bts) fidVar5).k(u4yVar4) ? 4 : 2);
                } else {
                    i4 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i4 |= fidVar5.c(intValue9) ? 32 : 16;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(i4 & 1, (i4 & 147) != 146)) {
                    twr twrVar = (twr) ((List) obj9).get(intValue9);
                    btsVar5.e0(-1666847406);
                    SelectFolderDialogContent$lambda$6 = SelectFolderDialogFragment.SelectFolderDialogContent$lambda$6(m3u0Var);
                    if (jl40.l(twrVar, kotlin.collections.a.Z(SelectFolderDialogContent$lambda$6.a))) {
                        SelectFolderDialogContent$lambda$62 = SelectFolderDialogFragment.SelectFolderDialogContent$lambda$6(m3u0Var);
                        if (SelectFolderDialogContent$lambda$62.b) {
                            z3 = true;
                            f530 d4 = u3a1.d(c530Var, "add_to_folder_dialog_folder_item");
                            SelectFolderDialogFragment selectFolderDialogFragment = (SelectFolderDialogFragment) obj6;
                            btsVar5.e0(223327743);
                            e = btsVar5.e(eVar) | btsVar5.k(twrVar);
                            Q = btsVar5.Q();
                            if (!e || Q == obj5) {
                                Q = new com.yandex.messaging.ui.folders.selectDialog.a(eVar, twrVar);
                                btsVar5.o0(Q);
                            }
                            btsVar5.t(false);
                            selectFolderDialogFragment.FolderListItem(twrVar, (sls) Q, d4, z3, btsVar5, 0, 0);
                            btsVar5.t(false);
                        }
                    }
                    z3 = false;
                    f530 d42 = u3a1.d(c530Var, "add_to_folder_dialog_folder_item");
                    SelectFolderDialogFragment selectFolderDialogFragment2 = (SelectFolderDialogFragment) obj6;
                    btsVar5.e0(223327743);
                    e = btsVar5.e(eVar) | btsVar5.k(twrVar);
                    Q = btsVar5.Q();
                    if (!e) {
                    }
                    Q = new com.yandex.messaging.ui.folders.selectDialog.a(eVar, twrVar);
                    btsVar5.o0(Q);
                    btsVar5.t(false);
                    selectFolderDialogFragment2.FolderListItem(twrVar, (sls) Q, d42, z3, btsVar5, 0, 0);
                    btsVar5.t(false);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            default:
                u4y u4yVar5 = (u4y) obj;
                int intValue11 = ((Number) obj2).intValue();
                fid fidVar6 = (fid) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    i5 = intValue12 | (((bts) fidVar6).k(u4yVar5) ? 4 : 2);
                } else {
                    i5 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i5 |= fidVar6.c(intValue11) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(i5 & 1, (i5 & 147) != 146)) {
                    uox0 uox0Var = (uox0) ((List) obj9).get(intValue11);
                    btsVar6.e0(1286033924);
                    ttb1.a(!uox0Var.h ? uox0Var : null, null, k.p(sb2.G(0.75f, 200.0f, 4, null), new f22(17)).a(k.d(null, null, 15)).a(k.e(null, 3)), k.u(sb2.G(0.75f, 200.0f, 4, null), new f22(16)).a(k.l(null, null, 15)).a(k.f(null, 3)), null, wwg.S(-1450511051, true, new yc0(17, (m3u0) obj8, (qor) obj7, (tls) obj6), btsVar6), btsVar6, 200064, 18);
                    btsVar6.t(false);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ sc0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    public sc0(List list, v4b0 v4b0Var, tls tlsVar, oz40 oz40Var) {
        this.a = 2;
        this.c = list;
        this.w = v4b0Var;
        this.b = tlsVar;
        this.x = oz40Var;
    }

    public sc0(List list, m3u0 m3u0Var, qor qorVar, tls tlsVar) {
        this.a = 5;
        this.c = list;
        this.w = m3u0Var;
        this.x = qorVar;
        this.b = tlsVar;
    }
}
