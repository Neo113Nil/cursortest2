package defpackage;

import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.plus.text.PlusNewType;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class xnf0 {
    public static final void a(uqf0 uqf0Var, f530 f530Var, qor qorVar, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(979832784);
        int i2 = i | (btsVar.k(uqf0Var) ? 4 : 2) | 48 | (btsVar.k(qorVar) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 m = ymb1.m(c530Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ur70(29);
                btsVar.o0(Q);
            }
            w2o a = k.q(1, (tls) Q, null).a(k.d(null, null, 15)).a(k.e(null, 3));
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ur70(29);
                btsVar.o0(Q2);
            }
            ttb1.a(uqf0Var, m, a, k.v(1, (tls) Q2, null).a(k.l(null, null, 15)).a(k.f(null, 3)), "AnimatedPromoItem", wwg.S(1439097093, true, new lfj(qorVar, tlsVar, 2), btsVar), btsVar, (i2 & 14) | 224640, 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(uqf0Var, f530Var2, qorVar, tlsVar, i, 5);
        }
    }

    public static final void b(ebp0 ebp0Var, ulf0 ulf0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1119266551);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ebp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(ulf0Var) : btsVar.e(ulf0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        boolean z = true;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = ulf0Var instanceof slf0;
            c530 c530Var2 = c530.a;
            if (z2) {
                btsVar.e0(2056452452);
                if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !btsVar.e(ulf0Var))) {
                    z = false;
                }
                Object Q = btsVar.Q();
                if (z || Q == did.a) {
                    Q = new odf0(2, ulf0Var);
                    btsVar.o0(Q);
                }
                slf0 slf0Var = (slf0) ulf0Var;
                c530Var = c530Var2;
                m9b1.b(ebp0Var, slf0Var.a, fnq0.a(c530Var2, (tls) Q), AppColor$Palette.Text, xya1.e(btsVar).g.a, 0, 0, slf0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar).h.a, 0, 0, null, btsVar, (i3 & 14) | 805309440, 0, 31856);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                c530Var = c530Var2;
                if (!ulf0Var.equals(tlf0.a)) {
                    throw unr0.y(-1873327226, btsVar, false);
                }
                btsVar.e0(2056922722);
                sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, c530Var);
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
                com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 16.0f), null, false, null, null, null, false, btsVar, 6, 254);
                oeb1.c(btsVar, ljs0.m(c530Var, 2.0f));
                com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 0.6f), 13.0f), null, false, null, null, null, false, btsVar, 6, 254);
                btsVar.t(true);
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(ebp0Var, ulf0Var, f530Var2, i, 28);
        }
    }

    public static final void c(uqf0 uqf0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        qqf0 qqf0Var;
        rqf0 rqf0Var;
        int i3;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1867937486);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(uqf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            dof0 dof0Var = uqf0Var.a;
            ulf0 ulf0Var = uqf0Var.b;
            qqf0 qqf0Var2 = uqf0Var.c;
            rqf0 rqf0Var2 = uqf0Var.d;
            sls slsVar = uqf0Var.e;
            if (slsVar != null) {
                btsVar.e0(2129836162);
                rqf0Var = rqf0Var2;
                awk0 awk0Var = new awk0(0);
                boolean k = ((i2 & 896) == 256) | btsVar.k(slsVar);
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = new ssm(tlsVar, slsVar, 3);
                    btsVar.o0(Q);
                }
                i3 = 3;
                qqf0Var = qqf0Var2;
                f530 d = q791.d(f530Var, false, null, awk0Var, (sls) Q, 11);
                btsVar.t(false);
                f530Var2 = d;
            } else {
                qqf0Var = qqf0Var2;
                rqf0Var = rqf0Var2;
                i3 = 3;
                btsVar.e0(2129986946);
                btsVar.t(false);
                f530Var2 = f530Var;
            }
            ydb1.a(ooc.d(f530Var2, null, i3), wwg.S(1347105892, true, new pdf0(i3, dof0Var), btsVar), wwg.S(-418962145, true, new pdf0(4, ulf0Var), btsVar), wwg.S(472653270, true, new y740(12, qqf0Var, tlsVar), btsVar), wwg.S(1278952665, true, new pdf0(5, rqf0Var), btsVar), null, SlotSize.M, false, btsVar, 1600944, 160);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0((Object) uqf0Var, f530Var, tlsVar, i, 1);
        }
    }

    public static final void d(ibp0 ibp0Var, dof0 dof0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(656649987);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(dof0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            if (dof0Var == null) {
                btsVar.e0(-1316134006);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            } else {
                btsVar.e0(-1316089552);
                tdb1.d(ibp0Var, dof0Var.a.a, c530Var, null, null, null, 0.0f, 0, wwg.S(-1322076681, true, new o990(dof0Var, ibp0Var), btsVar), btsVar, (i3 & 14) | 805306368 | (i3 & 896), 252);
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(ibp0Var, dof0Var, f530Var2, i, 0);
        }
    }

    public static final void e(ibp0 ibp0Var, qqf0 qqf0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        ibp0 ibp0Var2;
        f530 f530Var2;
        c530 c530Var;
        tls tlsVar2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2138860960);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(qqf0Var) : btsVar.e(qqf0Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z = qqf0Var instanceof lqf0;
            Object obj = did.a;
            c530 c530Var2 = c530.a;
            if (z) {
                btsVar.e0(-1327662645);
                f530 o = an91.o(c530Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar, 6);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d = b.d(btsVar, o);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (dmw0Var == null) {
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
                qje.W(btsVar, d.e, o2);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d);
                btsVar.e0(1676574461);
                ArrayList arrayList = ((lqf0) qqf0Var).a;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    vlf0 vlf0Var = (vlf0) arrayList.get(i5);
                    sls slsVar2 = vlf0Var.d;
                    ButtonSize buttonSize = ButtonSize.XS;
                    gz6 gz6Var = new gz6(vlf0Var.c, vlf0Var.b);
                    boolean k = ((i4 & 7168) == 2048) | btsVar.k(slsVar2);
                    Object Q = btsVar.Q();
                    if (k || Q == obj) {
                        i3 = 2;
                        Q = new ssm(tlsVar, slsVar2, 2);
                        btsVar.o0(Q);
                    } else {
                        i3 = 2;
                    }
                    bts btsVar2 = btsVar;
                    d17.d(null, false, buttonSize, gz6Var, null, (sls) Q, wwg.S(-1556699250, true, new pdf0(i3, vlf0Var), btsVar), btsVar2, 1573248, 19);
                    btsVar = btsVar2;
                    i5++;
                    obj = obj;
                    i4 = i4;
                }
                tse0.t(btsVar, false, true, false);
                ibp0Var2 = ibp0Var;
                c530Var = c530Var2;
            } else {
                int i6 = i4;
                boolean z2 = true;
                if (qqf0Var instanceof nqf0) {
                    btsVar.e0(-1326734939);
                    xrb1.b(ibp0Var, ((nqf0) qqf0Var).a, null, btsVar, i6 & 14, 14);
                    ibp0Var2 = ibp0Var;
                    btsVar.t(false);
                    c530Var = c530Var2;
                } else {
                    ibp0Var2 = ibp0Var;
                    if (qqf0Var instanceof oqf0) {
                        btsVar.e0(-1326608428);
                        oqf0 oqf0Var = (oqf0) qqf0Var;
                        tls tlsVar3 = oqf0Var.b;
                        boolean k2 = ((i6 & 112) == 32 || ((i6 & 64) != 0 && btsVar.e(qqf0Var))) | btsVar.k(tlsVar3);
                        Object Q2 = btsVar.Q();
                        if (k2 || Q2 == obj) {
                            Q2 = new ugd0(12, qqf0Var, tlsVar3);
                            btsVar.o0(Q2);
                        }
                        f530 b = fnq0.b(c530Var2, false, (tls) Q2);
                        boolean z3 = oqf0Var.a;
                        if (tlsVar3 != null) {
                            btsVar.e0(-1326199507);
                            if ((i6 & 7168) != 2048) {
                                z2 = false;
                            }
                            boolean k3 = z2 | btsVar.k(tlsVar3);
                            Object Q3 = btsVar.Q();
                            if (k3 || Q3 == obj) {
                                Q3 = new wnf0(tlsVar, tlsVar3, 0);
                                btsVar.o0(Q3);
                            }
                            tlsVar2 = (tls) Q3;
                            btsVar.t(false);
                        } else {
                            btsVar.e0(-1325926552);
                            btsVar.t(false);
                            tlsVar2 = null;
                        }
                        ijb1.b(z3, an91.o(b, 8.0f, 0.0f, 0.0f, 0.0f, 14), null, null, null, tlsVar2, true, btsVar, 0, 28);
                        btsVar = btsVar;
                        btsVar.t(false);
                        c530Var = c530Var2;
                    } else if (qqf0Var instanceof pqf0) {
                        btsVar.e0(-1325811077);
                        f530 o3 = an91.o(c530Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                        c530Var = c530Var2;
                        lhl0 a2 = khl0.a(new i43(2.0f, true, new quz(11)), x4c.E, btsVar, 54);
                        int hashCode2 = Long.hashCode(btsVar.T);
                        r1b0 o4 = btsVar.o();
                        f530 d2 = b.d(btsVar, o3);
                        ohd.G1.getClass();
                        sls slsVar3 = d.b;
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar3);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, d.f, a2);
                        qje.W(btsVar, d.e, o4);
                        qje.W(btsVar, d.g, Integer.valueOf(hashCode2));
                        qje.M(btsVar, d.h);
                        qje.W(btsVar, d.d, d2);
                        pqf0 pqf0Var = (pqf0) qqf0Var;
                        String str = pqf0Var.b;
                        if (pqf0Var.a.length() > 0) {
                            btsVar.e0(33204224);
                            qgy.b(pqf0Var.a, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                            btsVar = btsVar;
                            btsVar.t(false);
                        } else {
                            btsVar.e0(33366943);
                            btsVar.t(false);
                        }
                        if (evu0.J(str)) {
                            btsVar.e0(33640735);
                            btsVar.t(false);
                        } else {
                            btsVar.e0(33444381);
                            o6d0.a(str, null, BadgeSize.M, wk4.a, PlusNewType.Gradient, false, btsVar, 24960, 34);
                            btsVar.t(false);
                        }
                        btsVar.t(true);
                        btsVar.t(false);
                    } else {
                        c530Var = c530Var2;
                        if (qqf0Var instanceof mqf0) {
                            btsVar.e0(-1325070208);
                            mqf0 mqf0Var = (mqf0) qqf0Var;
                            wrb1.a(ibp0Var2, mqf0Var.a, mqf0Var.b, btsVar, (i6 & 14) | ((i6 >> 3) & 112));
                            btsVar.t(false);
                        } else {
                            if (qqf0Var != null) {
                                throw unr0.y(-1843942957, btsVar, false);
                            }
                            btsVar.e0(-1843837747);
                            x901.a.invoke(ibp0Var2, btsVar, Integer.valueOf(i6 & 14));
                            btsVar.t(false);
                        }
                    }
                }
            }
            f530Var2 = c530Var;
        } else {
            ibp0Var2 = ibp0Var;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ((Object) ibp0Var2, (Object) qqf0Var, f530Var2, (Object) tlsVar, i, 29);
        }
    }

    public static final void f(ibp0 ibp0Var, rqf0 rqf0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(889284361);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(rqf0Var) : btsVar.e(rqf0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = rqf0Var instanceof rqf0;
            c530 c530Var = c530.a;
            if (z) {
                btsVar.e0(1312294331);
                sya1.a(llb1.b(), an91.o(c530Var, 0.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 8.0f, 0.0f, 11), null, rqf0Var.a, btsVar, 0, 4);
                btsVar.t(false);
            } else {
                if (rqf0Var != null) {
                    throw unr0.y(-96217273, btsVar, false);
                }
                btsVar.e0(-96212875);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(ibp0Var, rqf0Var, f530Var2, i, 29);
        }
    }
}
