package defpackage;

import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.scooters.passes.active.v3.c;
import com.yandex.go.taxi.order.cancel.v3.ui.a;
import com.yandex.messaging.ui.settings.folder.addChat.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.trains.search.b;

/* loaded from: classes11.dex */
public final class yc0 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ yc0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = obj3;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        u4y u4yVar = (u4y) obj;
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        tls tlsVar = (tls) this.b;
        if ((intValue2 & 6) == 0) {
            i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= fidVar.c(intValue) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            r8v0 r8v0Var = (r8v0) ((List) this.c).get(intValue);
            btsVar.e0(-1246063273);
            boolean z = intValue == scc.f(((nc01) this.w).c);
            if (jl40.l(r8v0Var, p8v0.a)) {
                btsVar.e0(-1245961005);
                b.e(!z, btsVar, 0);
                btsVar.t(false);
            } else {
                if (!(r8v0Var instanceof q8v0)) {
                    throw unr0.y(1622374349, btsVar, false);
                }
                btsVar.e0(-1245833967);
                q8v0 q8v0Var = (q8v0) r8v0Var;
                nvi0 nvi0Var = q8v0Var.b;
                CharSequence charSequence = q8v0Var.c;
                boolean z2 = !z;
                boolean k = btsVar.k(tlsVar) | btsVar.e(r8v0Var);
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = new z5(27, tlsVar, q8v0Var);
                    btsVar.o0(Q);
                }
                b.d(nvi0Var, charSequence, z2, q791.d(c530.a, false, null, null, (sls) Q, 15), btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        u4y u4yVar = (u4y) obj;
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= fidVar.c(intValue) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            Object obj5 = ((List) this.c).get(intValue);
            int i2 = i & HProv.PP_DELETE_SAVED_PASSWD;
            btsVar.e0(679239086);
            lub1.c(intValue, (qa11) obj5, (tls) this.b, btsVar, (i2 >> 3) & 14);
            if (intValue < scc.f(((bpl0) this.w).a)) {
                btsVar.e0(679385157);
                yrl.b(6, 6, btsVar, an91.m(c530.a, 16.0f, 0.0f, 2));
                btsVar.t(false);
            } else {
                btsVar.e0(679450505);
                btsVar.t(false);
            }
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean, int] */
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        ?? r6;
        boolean z2;
        Object obj5;
        int i6;
        ?? r62;
        int i7;
        int i8;
        int i9;
        boolean z3;
        Object obj6;
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        zy11 zy11Var = zy11.a;
        Object obj7 = this.b;
        Object obj8 = this.w;
        Object obj9 = this.c;
        int i14 = 1;
        i14 = 1;
        switch (i13) {
            case 0:
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
                    l5f l5fVar = (l5f) ((List) obj9).get(intValue);
                    btsVar.e0(1822608279);
                    g.b(l5fVar, (Set) obj8, (tls) obj7, btsVar, 0);
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
                    bz7 bz7Var = (bz7) ((ArrayList) obj9).get(intValue3);
                    btsVar2.e0(-132367275);
                    a.f(bz7Var, (tls) obj7, btsVar2, 0);
                    if (intValue3 != scc.f(((cz7) obj8).b)) {
                        btsVar2.e0(-132303850);
                        uj91.b(null, null, btsVar2, 0, 3);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-132273098);
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
                    n7u0 n7u0Var = (n7u0) ((List) obj9).get(intValue5);
                    btsVar3.e0(-285857477);
                    com.yandex.go.chargers.discounts.discount_stations.ui.b.c(n7u0Var, (tls) obj7, intValue5 != scc.f(((ft9) obj8).b), btsVar3, 8);
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
                kxz kxzVar = (kxz) obj8;
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
                    jxz jxzVar = (jxz) ((List) obj9).get(intValue7);
                    btsVar4.e0(567347769);
                    com.yandex.go.loyalty.impl.selector.ui.a.b(ljs0.c(c530Var, 1.0f), kxzVar.c.b, jxzVar, (tls) obj7, btsVar4, 6);
                    if (intValue7 != scc.f(kxzVar.b)) {
                        tse0.s(btsVar4, 567593784, c530Var, 6.0f, btsVar4);
                        z = false;
                        btsVar4.t(false);
                    } else {
                        z = false;
                        btsVar4.e0(567653366);
                        btsVar4.t(false);
                    }
                    btsVar4.t(z);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                u4y u4yVar5 = (u4y) obj;
                int intValue9 = ((Number) obj2).intValue();
                fid fidVar5 = (fid) obj3;
                int intValue10 = ((Number) obj4).intValue();
                tls tlsVar = (tls) obj7;
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
                    oyy0 oyy0Var = (oyy0) ((List) obj9).get(intValue9);
                    btsVar5.e0(478474964);
                    if (oyy0Var instanceof lyy0) {
                        btsVar5.e0(-1231489843);
                        lyy0 lyy0Var = (lyy0) oyy0Var;
                        boolean k = btsVar5.k(tlsVar);
                        Object Q = btsVar5.Q();
                        if (k || Q == o430Var) {
                            z2 = false;
                            u140 u140Var = new u140(0, tlsVar);
                            btsVar5.o0(u140Var);
                            obj5 = u140Var;
                        } else {
                            z2 = false;
                            obj5 = Q;
                        }
                        cpb1.a(lyy0Var, (wls) obj5, null, false, btsVar5, 0);
                        btsVar5.t(z2);
                        r6 = z2;
                    } else {
                        r6 = 0;
                        r6 = 0;
                        if (jl40.l(oyy0Var, myy0.a)) {
                            btsVar5.e0(-1231482431);
                            cpb1.d(null, btsVar5, 0);
                            btsVar5.t(false);
                        } else {
                            if (!(oyy0Var instanceof nyy0)) {
                                throw unr0.y(-1231491424, btsVar5, false);
                            }
                            btsVar5.e0(-1231480125);
                            cpb1.b((nyy0) oyy0Var, null, false, btsVar5, 8);
                            btsVar5.t(false);
                        }
                    }
                    if (intValue9 != scc.f(((g140) obj8).b)) {
                        btsVar5.e0(478919906);
                        yrl.e(null, null, btsVar5, r6, 7);
                        btsVar5.t(r6);
                    } else {
                        btsVar5.e0(478975644);
                        btsVar5.t(r6);
                    }
                    btsVar5.t(r6);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                u4y u4yVar6 = (u4y) obj;
                int intValue11 = ((Number) obj2).intValue();
                fid fidVar6 = (fid) obj3;
                int intValue12 = ((Number) obj4).intValue();
                tls tlsVar2 = (tls) obj7;
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
                    oyy0 oyy0Var2 = (oyy0) ((List) obj9).get(intValue11);
                    btsVar6.e0(-1132814032);
                    if (oyy0Var2 instanceof lyy0) {
                        btsVar6.e0(-867824923);
                        lyy0 lyy0Var2 = (lyy0) oyy0Var2;
                        boolean k2 = btsVar6.k(tlsVar2);
                        Object Q2 = btsVar6.Q();
                        Object obj10 = Q2;
                        if (k2 || Q2 == o430Var) {
                            u140 u140Var2 = new u140(1, tlsVar2);
                            btsVar6.o0(u140Var2);
                            obj10 = u140Var2;
                        }
                        cpb1.a(lyy0Var2, (wls) obj10, null, false, btsVar6, 0);
                        r62 = 0;
                        btsVar6.t(false);
                    } else {
                        r62 = 0;
                        r62 = 0;
                        if (jl40.l(oyy0Var2, myy0.a)) {
                            btsVar6.e0(-867818254);
                            cpb1.d(null, btsVar6, 0);
                            btsVar6.t(false);
                        } else {
                            if (!(oyy0Var2 instanceof nyy0)) {
                                throw unr0.y(-867826503, btsVar6, false);
                            }
                            btsVar6.e0(-867815948);
                            cpb1.b((nyy0) oyy0Var2, null, false, btsVar6, 8);
                            btsVar6.t(false);
                        }
                    }
                    if (intValue11 != scc.f(((czy0) obj8).a.b)) {
                        btsVar6.e0(-1132381583);
                        yrl.e(null, null, btsVar6, r62, 7);
                        btsVar6.t(r62);
                    } else {
                        btsVar6.e0(-1132325845);
                        btsVar6.t(r62);
                    }
                    btsVar6.t(r62);
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
                    ph40 ph40Var = (ph40) ((List) obj9).get(intValue13);
                    btsVar7.e0(986984209);
                    vpb1.c(ph40Var, (String) obj8, (tls) obj7, btsVar7, 0);
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
                    na11 na11Var = (na11) ((List) obj9).get(intValue15);
                    btsVar8.e0(1661054193);
                    wpb1.f(na11Var, (na11) obj8, (tls) obj7, btsVar8, 0);
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
                tls tlsVar3 = (tls) obj7;
                cqk0 cqk0Var = (cqk0) obj8;
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
                    String str = (String) ((List) obj9).get(intValue17);
                    btsVar9.e0(877363793);
                    boolean l = jl40.l(str, cqk0Var.b);
                    boolean a = btsVar9.a(l);
                    Object Q3 = btsVar9.Q();
                    if (a || Q3 == o430Var) {
                        z3 = false;
                        aqk0 aqk0Var = new aqk0(l, 0);
                        btsVar9.o0(aqk0Var);
                        obj6 = aqk0Var;
                    } else {
                        z3 = false;
                        obj6 = Q3;
                    }
                    f530 b = fnq0.b(c530Var, z3, (tls) obj6);
                    ButtonSize buttonSize = ButtonSize.S;
                    float size = buttonSize.getSize();
                    gz6 gz6Var = l ? new gz6(AppColor$Palette.BgInvert, AppColor$Palette.Background) : new gz6(AppColor$Palette.Background, AppColor$Palette.Text);
                    float c = tcb1.c(buttonSize, btsVar9);
                    boolean z4 = cqk0Var.a;
                    AppColor$Palette appColor$Palette = AppColor$Palette.Line;
                    boolean k3 = btsVar9.k(tlsVar3) | btsVar9.k(str);
                    Object Q4 = btsVar9.Q();
                    Object obj11 = Q4;
                    if (k3 || Q4 == o430Var) {
                        z5 z5Var = new z5(20, tlsVar3, str);
                        btsVar9.o0(z5Var);
                        obj11 = z5Var;
                    }
                    d17.b(b, z4, gz6Var, appColor$Palette, size, c, false, (sls) obj11, wwg.S(-939900305, true, new bqk0(str, 0), btsVar9), btsVar9, 102239232);
                    btsVar9.t(false);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                j690 j690Var = (j690) obj2;
                fid fidVar10 = (fid) obj3;
                int intValue19 = ((Number) obj4).intValue();
                if ((intValue19 & 48) == 0) {
                    intValue19 |= ((bts) fidVar10).k(j690Var) ? 32 : 16;
                }
                bts btsVar10 = (bts) fidVar10;
                boolean V = btsVar10.V(intValue19 & 1, (intValue19 & 145) != 144);
                dmw0 dmw0Var = btsVar10.a;
                if (!V) {
                    btsVar10.Y();
                    return zy11Var;
                }
                f530 j = an91.j(ljs0.u(ljs0.c(c530Var, 1.0f), null, 3), j690Var);
                m3u0 m3u0Var = (m3u0) obj9;
                androidx.compose.foundation.lazy.b bVar = (androidx.compose.foundation.lazy.b) obj8;
                r2l0 r2l0Var = (r2l0) obj7;
                sic a2 = qic.a(lr20.c, x4c.G, btsVar10, 0);
                int hashCode = Long.hashCode(btsVar10.T);
                r1b0 o = btsVar10.o();
                f530 d = androidx.compose.ui.b.d(btsVar10, j);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar10.i0();
                if (btsVar10.S) {
                    btsVar10.n(slsVar);
                } else {
                    btsVar10.r0();
                }
                wls wlsVar = d.f;
                qje.W(btsVar10, wlsVar, a2);
                wls wlsVar2 = d.e;
                qje.W(btsVar10, wlsVar2, o);
                Integer valueOf = Integer.valueOf(hashCode);
                wls wlsVar3 = d.g;
                qje.W(btsVar10, wlsVar3, valueOf);
                tls tlsVar4 = d.h;
                qje.M(btsVar10, tlsVar4);
                wls wlsVar4 = d.d;
                qje.W(btsVar10, wlsVar4, d);
                f530 k4 = an91.k(bzk0.c(hbb1.b(s1a1.g(ljs0.c(c530Var, 1.0f), 1.0f), dbb1.b(btsVar10), cyk0.e(0.0f, 0.0f, 16.0f, 16.0f, 3), ((Boolean) m3u0Var.getValue()).booleanValue(), 8), AppColor$Palette.Background, cyk0.e(0.0f, 0.0f, 16.0f, 16.0f, 3)), 16.0f);
                z910 d2 = pi6.d(x4c.b, false);
                int hashCode2 = Long.hashCode(btsVar10.T);
                r1b0 o2 = btsVar10.o();
                f530 d3 = androidx.compose.ui.b.d(btsVar10, k4);
                btsVar10.i0();
                if (btsVar10.S) {
                    btsVar10.n(slsVar);
                } else {
                    btsVar10.r0();
                }
                qje.W(btsVar10, wlsVar, d2);
                qje.W(btsVar10, wlsVar2, o2);
                vfc.v(hashCode2, btsVar10, wlsVar3, btsVar10, tlsVar4);
                qje.W(btsVar10, wlsVar4, d3);
                r2l0Var.getClass();
                jeb1.f("", null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar10).f.c, btsVar10, 384, 0, 16378);
                btsVar10.t(true);
                x2y x2yVar = new x2y(1.0f, false);
                l690 d4 = an91.d(16.0f, 0.0f, 16.0f, 8.0f, 2);
                boolean e = btsVar10.e(r2l0Var);
                Object Q5 = btsVar10.Q();
                if (e || Q5 == o430Var) {
                    Q5 = new j1(22, r2l0Var);
                    btsVar10.o0(Q5);
                }
                adb1.a(x2yVar, bVar, d4, null, null, null, false, null, (tls) Q5, btsVar10, 384, 504);
                btsVar10.t(true);
                return zy11Var;
            case 10:
                j690 j690Var2 = (j690) obj2;
                fid fidVar11 = (fid) obj3;
                int intValue20 = ((Number) obj4).intValue();
                if ((intValue20 & 48) == 0) {
                    intValue20 |= ((bts) fidVar11).k(j690Var2) ? 32 : 16;
                }
                bts btsVar11 = (bts) fidVar11;
                boolean V2 = btsVar11.V(intValue20 & 1, (intValue20 & 145) != 144);
                dmw0 dmw0Var2 = btsVar11.a;
                if (V2) {
                    f530 j2 = an91.j(c530Var, j690Var2);
                    oip0 oip0Var = (oip0) obj9;
                    fum0 fum0Var = (fum0) obj8;
                    tls tlsVar5 = (tls) obj7;
                    z910 d5 = pi6.d(x4c.b, false);
                    int hashCode3 = Long.hashCode(btsVar11.T);
                    r1b0 o3 = btsVar11.o();
                    f530 d6 = androidx.compose.ui.b.d(btsVar11, j2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (dmw0Var2 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar11.i0();
                    if (btsVar11.S) {
                        btsVar11.n(slsVar2);
                    } else {
                        btsVar11.r0();
                    }
                    wls wlsVar5 = d.f;
                    qje.W(btsVar11, wlsVar5, d5);
                    wls wlsVar6 = d.e;
                    qje.W(btsVar11, wlsVar6, o3);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    wls wlsVar7 = d.g;
                    qje.W(btsVar11, wlsVar7, valueOf2);
                    tls tlsVar6 = d.h;
                    qje.M(btsVar11, tlsVar6);
                    wls wlsVar8 = d.d;
                    qje.W(btsVar11, wlsVar8, d6);
                    f530 u = pw91.u(c530Var, oip0Var, 14);
                    sic a3 = qic.a(lr20.c, x4c.G, btsVar11, 0);
                    int hashCode4 = Long.hashCode(btsVar11.T);
                    r1b0 o4 = btsVar11.o();
                    f530 d7 = androidx.compose.ui.b.d(btsVar11, u);
                    btsVar11.i0();
                    if (btsVar11.S) {
                        btsVar11.n(slsVar2);
                    } else {
                        btsVar11.r0();
                    }
                    qje.W(btsVar11, wlsVar5, a3);
                    qje.W(btsVar11, wlsVar6, o4);
                    vfc.v(hashCode4, btsVar11, wlsVar7, btsVar11, tlsVar6);
                    qje.W(btsVar11, wlsVar8, d7);
                    c.g(fum0Var, btsVar11, 0);
                    aum0 aum0Var = fum0Var.d;
                    eum0 eum0Var = fum0Var.j;
                    c.f(fum0Var, aum0Var, tlsVar5, btsVar11, 0);
                    if (eum0Var != null) {
                        btsVar11.e0(-757303242);
                        c.i(fum0Var, eum0Var, tlsVar5, btsVar11, 0);
                        btsVar11.t(false);
                    } else {
                        btsVar11.e0(-757215791);
                        btsVar11.t(false);
                    }
                    c.d(fum0Var, tlsVar5, btsVar11, 0);
                    oeb1.c(btsVar11, ljs0.e(c530Var, 8.0f));
                    btsVar11.t(true);
                    btsVar11.t(true);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 11:
                j690 j690Var3 = (j690) obj2;
                fid fidVar12 = (fid) obj3;
                int intValue21 = ((Number) obj4).intValue();
                if ((intValue21 & 48) == 0) {
                    intValue21 |= ((bts) fidVar12).k(j690Var3) ? 32 : 16;
                }
                bts btsVar12 = (bts) fidVar12;
                boolean V3 = btsVar12.V(intValue21 & 1, (intValue21 & 145) != 144);
                dmw0 dmw0Var3 = btsVar12.a;
                if (V3) {
                    f530 j3 = an91.j(c530Var, j690Var3);
                    oip0 oip0Var2 = (oip0) obj9;
                    s1p0 s1p0Var = (s1p0) obj8;
                    tls tlsVar7 = (tls) obj7;
                    z910 d8 = pi6.d(x4c.b, false);
                    int hashCode5 = Long.hashCode(btsVar12.T);
                    r1b0 o5 = btsVar12.o();
                    f530 d9 = androidx.compose.ui.b.d(btsVar12, j3);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (dmw0Var3 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar12.i0();
                    if (btsVar12.S) {
                        btsVar12.n(slsVar3);
                    } else {
                        btsVar12.r0();
                    }
                    wls wlsVar9 = d.f;
                    qje.W(btsVar12, wlsVar9, d8);
                    wls wlsVar10 = d.e;
                    qje.W(btsVar12, wlsVar10, o5);
                    Integer valueOf3 = Integer.valueOf(hashCode5);
                    wls wlsVar11 = d.g;
                    qje.W(btsVar12, wlsVar11, valueOf3);
                    tls tlsVar8 = d.h;
                    qje.M(btsVar12, tlsVar8);
                    wls wlsVar12 = d.d;
                    qje.W(btsVar12, wlsVar12, d9);
                    f530 u2 = pw91.u(c530Var, oip0Var2, 14);
                    sic a4 = qic.a(lr20.c, x4c.G, btsVar12, 0);
                    int hashCode6 = Long.hashCode(btsVar12.T);
                    r1b0 o6 = btsVar12.o();
                    f530 d10 = androidx.compose.ui.b.d(btsVar12, u2);
                    btsVar12.i0();
                    if (btsVar12.S) {
                        btsVar12.n(slsVar3);
                    } else {
                        btsVar12.r0();
                    }
                    qje.W(btsVar12, wlsVar9, a4);
                    qje.W(btsVar12, wlsVar10, o6);
                    vfc.v(hashCode6, btsVar12, wlsVar11, btsVar12, tlsVar8);
                    qje.W(btsVar12, wlsVar12, d10);
                    k4b1.m(s1p0Var, btsVar12, 0);
                    k4b1.j(s1p0Var.b, btsVar12, 0);
                    k4b1.d(s1p0Var, tlsVar7, btsVar12, 0);
                    btsVar12.t(true);
                    btsVar12.t(true);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 12:
                u4y u4yVar10 = (u4y) obj;
                int intValue22 = ((Number) obj2).intValue();
                fid fidVar13 = (fid) obj3;
                int intValue23 = ((Number) obj4).intValue();
                if ((intValue23 & 6) == 0) {
                    i10 = intValue23 | (((bts) fidVar13).k(u4yVar10) ? 4 : 2);
                } else {
                    i10 = intValue23;
                }
                if ((intValue23 & 48) == 0) {
                    i10 |= fidVar13.c(intValue22) ? 32 : 16;
                }
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(i10 & 1, (i10 & 147) != 146)) {
                    l6x0 l6x0Var = (l6x0) ((ArrayList) obj9).get(intValue22);
                    btsVar13.e0(612419575);
                    lkb1.c(l6x0Var, (tls) obj7, (tls) obj8, btsVar13, 0);
                    btsVar13.t(false);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 13:
                u4y u4yVar11 = (u4y) obj;
                int intValue24 = ((Number) obj2).intValue();
                fid fidVar14 = (fid) obj3;
                int intValue25 = ((Number) obj4).intValue();
                wls wlsVar13 = (wls) obj7;
                if ((intValue25 & 6) == 0) {
                    i11 = intValue25 | (((bts) fidVar14).k(u4yVar11) ? 4 : 2);
                } else {
                    i11 = intValue25;
                }
                if ((intValue25 & 48) == 0) {
                    i11 |= fidVar14.c(intValue24) ? 32 : 16;
                }
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(i11 & 1, (i11 & 147) != 146)) {
                    z611 z611Var = (z611) ((List) obj9).get(intValue24);
                    btsVar14.e0(-817163833);
                    Integer num = ((u611) obj8).f;
                    int i15 = (btsVar14.k(wlsVar13) ? 1 : 0) | (btsVar14.e(z611Var) ? 1 : 0);
                    int i16 = i11 & 112;
                    if (((i16 ^ 48) <= 32 || !btsVar14.c(intValue24)) && (i11 & 48) != 32) {
                        i14 = 0;
                    }
                    int i17 = i15 | i14;
                    Object Q6 = btsVar14.Q();
                    Object obj12 = Q6;
                    if (i17 != 0 || Q6 == o430Var) {
                        mvx0 mvx0Var = new mvx0(wlsVar13, z611Var, intValue24, 0);
                        btsVar14.o0(mvx0Var);
                        obj12 = mvx0Var;
                    }
                    wkb1.h(z611Var, intValue24, num, (sls) obj12, btsVar14, i16);
                    btsVar14.t(false);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 14:
                u4y u4yVar12 = (u4y) obj;
                int intValue26 = ((Number) obj2).intValue();
                fid fidVar15 = (fid) obj3;
                int intValue27 = ((Number) obj4).intValue();
                tls tlsVar9 = (tls) obj7;
                if ((intValue27 & 6) == 0) {
                    i12 = intValue27 | (((bts) fidVar15).k(u4yVar12) ? 4 : 2);
                } else {
                    i12 = intValue27;
                }
                if ((intValue27 & 48) == 0) {
                    i12 |= fidVar15.c(intValue26) ? 32 : 16;
                }
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(i12 & 1, (i12 & 147) != 146)) {
                    z611 z611Var2 = (z611) ((ArrayList) obj9).get(intValue26);
                    btsVar15.e0(1476045483);
                    boolean k5 = ((((i12 & 112) ^ 48) > 32 && btsVar15.c(intValue26)) || (i12 & 48) == 32) | btsVar15.k(tlsVar9) | btsVar15.e(z611Var2);
                    Object Q7 = btsVar15.Q();
                    Object obj13 = Q7;
                    if (k5 || Q7 == o430Var) {
                        mvx0 mvx0Var2 = new mvx0(tlsVar9, z611Var2, intValue26, 1);
                        btsVar15.o0(mvx0Var2);
                        obj13 = mvx0Var2;
                    }
                    sls slsVar4 = (sls) obj13;
                    Object Q8 = btsVar15.Q();
                    if (Q8 == o430Var) {
                        if (z611Var2 instanceof x611) {
                            Q8 = ((x611) z611Var2).c;
                        } else {
                            if (!(z611Var2 instanceof y611)) {
                                w511.b();
                                return null;
                            }
                            Q8 = ((y611) z611Var2).b;
                        }
                        btsVar15.o0(Q8);
                    }
                    String str2 = (String) Q8;
                    int intValue28 = ((v611) obj8).a.f.intValue();
                    c530 c530Var2 = c530.a;
                    if (intValue26 == intValue28) {
                        btsVar15.e0(1476411964);
                        ohb1.b(an91.o(c530Var2, 0.0f, 0.0f, 7.0f, 0.0f, 11), false, ButtonSize.S, slsVar4, wwg.S(-1441086954, true, new bqk0(str2, i14), btsVar15), btsVar15, 24966, 2);
                        btsVar15.t(false);
                    } else {
                        btsVar15.e0(1476769115);
                        ulb1.a(an91.o(c530Var2, 0.0f, 0.0f, 7.0f, 0.0f, 11), false, ButtonSize.S, slsVar4, wwg.S(-2061392577, true, new bqk0(str2, r11), btsVar15), btsVar15, 24966, 2);
                        btsVar15.t(false);
                    }
                    btsVar15.t(false);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 15:
                return b(obj, obj2, obj3, obj4);
            case 16:
                return d(obj, obj2, obj3, obj4);
            default:
                uox0 uox0Var = (uox0) obj2;
                fid fidVar16 = (fid) obj3;
                int intValue29 = ((Number) obj4).intValue();
                if ((intValue29 & 48) == 0) {
                    intValue29 |= ((bts) fidVar16).k(uox0Var) ? 32 : 16;
                }
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue29 & 1, (intValue29 & 145) != 144)) {
                    ucx0.a(uox0Var, (m3u0) obj9, (qor) obj8, null, (tls) obj7, btsVar16, ((intValue29 >> 3) & 14) | HProv.ALG_TYPE_SECURECHANNEL);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ yc0(List list, tls tlsVar, int i, Object obj) {
        this.a = i;
        this.c = list;
        this.b = tlsVar;
        this.w = obj;
    }
}
