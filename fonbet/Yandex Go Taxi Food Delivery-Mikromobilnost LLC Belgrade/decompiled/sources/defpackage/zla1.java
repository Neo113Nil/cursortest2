package defpackage;

import androidx.compose.animation.core.b;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.n;
import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import com.yandex.go.superapp.web.view.a;
import java.net.URI;
import java.util.ArrayList;
import kotlin.Result;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class zla1 {
    public static final void a(qh0 qh0Var, tls tlsVar, a aVar, boolean z, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1369731399);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(qh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            tlsVar2 = tlsVar;
            i2 |= btsVar.e(tlsVar2) ? 32 : 16;
        } else {
            tlsVar2 = tlsVar;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(aVar) : btsVar.e(aVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) btsVar.m(n.a)).booleanValue();
            sls slsVar = (sls) btsVar.m(c3z.a);
            boolean k = ((i2 & 7168) == 2048) | btsVar.k(slsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new ei0(0, slsVar, z);
                btsVar.o0(Q);
            }
            gya1.d(true, (sls) Q, btsVar, 6, 0);
            qy20.a(null, null, null, false, wwg.S(-755508891, true, new fi0(z, tlsVar2, qh0Var, booleanValue, aVar), btsVar), btsVar, 27648, 7);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(qh0Var, tlsVar, aVar, z, i, 0);
        }
    }

    public static final void b(ebp0 ebp0Var, jdj0 jdj0Var, f530 f530Var, fid fidVar, int i) {
        ebp0 ebp0Var2;
        int i2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1195167282);
        if ((i & 6) == 0) {
            ebp0Var2 = ebp0Var;
            i2 = i | (btsVar2.k(ebp0Var2) ? 4 : 2);
        } else {
            ebp0Var2 = ebp0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(jdj0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            CharSequence charSequence = jdj0Var.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            ety0 ety0Var = xya1.e(btsVar2).g.a;
            CharSequence charSequence2 = jdj0Var.b;
            ety0 ety0Var2 = xya1.e(btsVar2).h.a;
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            m9b1.b(ebp0Var2, charSequence, c530Var, appColor$Palette, ety0Var, 0, 0, charSequence2, AppColor$Palette.TextMinor, ety0Var2, 0, 0, null, btsVar, (i3 & 14) | 805309440 | (i3 & 896), 0, 31856);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(ebp0Var, jdj0Var, f530Var2, i, 10);
        }
    }

    public static final void c(amj0 amj0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        Object lij0Var;
        uij0 uij0Var;
        fgd fgdVar;
        byk0 byk0Var;
        jdj0 jdj0Var;
        boolean z;
        xlj0 xlj0Var;
        o430 o430Var;
        m3u0 m3u0Var;
        qkj0 qkj0Var;
        tls tlsVar2;
        f530 f530Var2;
        boolean k;
        Object Q;
        bts btsVar = (bts) fidVar;
        btsVar.g0(548946807);
        int i2 = i | (btsVar.k(amj0Var) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = amj0Var.c;
            RequirementRoundedCornersUiState requirementRoundedCornersUiState = amj0Var.e;
            xlj0 xlj0Var2 = amj0Var.k;
            String str = amj0Var.l;
            uij0 uij0Var2 = amj0Var.g;
            jdj0 jdj0Var2 = amj0Var.h;
            ikj0 ikj0Var = amj0Var.i;
            qkj0 qkj0Var2 = amj0Var.j;
            xw91 xw91Var = ((nx2) btsVar.m(uy2.c)).b;
            boolean c = btsVar.c(requirementRoundedCornersUiState.ordinal()) | btsVar.b(16.0f);
            Object Q2 = btsVar.Q();
            o430 o430Var2 = did.a;
            if (c || Q2 == o430Var2) {
                int i3 = rij0.a[requirementRoundedCornersUiState.ordinal()];
                if (i3 == 1) {
                    Q2 = cyk0.e(16.0f, 16.0f, 0.0f, 0.0f, 12);
                } else if (i3 == 2) {
                    Q2 = cyk0.e(0.0f, 0.0f, 16.0f, 16.0f, 3);
                } else if (i3 == 3) {
                    Q2 = cyk0.c(16.0f);
                } else {
                    if (i3 != 4) {
                        w511.b();
                        return;
                    }
                    Q2 = cyk0.c(0.0f);
                }
                btsVar.o0(Q2);
            }
            byk0 byk0Var2 = (byk0) Q2;
            boolean z3 = xlj0Var2 != null;
            fgd fgdVar2 = (fgd) btsVar.m(g3z.a);
            int i4 = i2 & 896;
            boolean a = btsVar.a(z3) | btsVar.k(xlj0Var2) | (i4 == 256) | btsVar.k(fgdVar2);
            Object Q3 = btsVar.Q();
            if (a || Q3 == o430Var2) {
                uij0Var = uij0Var2;
                fgdVar = fgdVar2;
                byk0Var = byk0Var2;
                jdj0Var = jdj0Var2;
                lij0Var = new lij0(z3, tlsVar, xlj0Var2, fgdVar, 0);
                z = z3;
                xlj0Var = xlj0Var2;
                btsVar.o0(lij0Var);
            } else {
                z = z3;
                byk0Var = byk0Var2;
                xlj0Var = xlj0Var2;
                uij0Var = uij0Var2;
                fgdVar = fgdVar2;
                lij0Var = Q3;
                jdj0Var = jdj0Var2;
            }
            sls slsVar = (sls) lij0Var;
            xlj0 xlj0Var3 = xlj0Var;
            fgd fgdVar3 = fgdVar;
            m3u0 b = b.b(z2 ? 1.0f : 0.5f, null, null, null, btsVar, 0, 30);
            f530 c2 = bzk0.c(ymb1.l(an91.m(f530Var, amj0Var.f, 0.0f, 2), byk0Var), amj0Var.d, qke.q);
            boolean k2 = (i4 == 256) | btsVar.k(str) | btsVar.e(xlj0Var3) | btsVar.e(qkj0Var2) | btsVar.k(slsVar) | btsVar.a(z2) | btsVar.e(fgdVar3);
            Object Q4 = btsVar.Q();
            if (k2) {
                o430Var = o430Var2;
            } else {
                o430Var = o430Var2;
                if (Q4 != o430Var) {
                    m3u0Var = b;
                    btsVar = btsVar;
                    f530Var2 = c2;
                    qkj0Var = qkj0Var2;
                    tlsVar2 = tlsVar;
                    f530 d = q791.d(fnq0.a(f530Var2, (tls) Q4), z, null, null, slsVar, 14);
                    k = btsVar.k(m3u0Var);
                    Q = btsVar.Q();
                    if (!k || Q == o430Var) {
                        Q = new xo1(m3u0Var, 14);
                        btsVar.o0(Q);
                    }
                    ydb1.a(d.a(d, (tls) Q), wwg.S(-1384679411, true, new pdf0(10, uij0Var), btsVar), wwg.S(24738888, true, new pdf0(11, jdj0Var), btsVar), wwg.S(1442152063, true, new pdf0(12, ikj0Var), btsVar), wwg.S(956853506, true, new y740(17, qkj0Var, tlsVar2), btsVar), null, null, false, btsVar, 28080, 224);
                }
            }
            m3u0Var = b;
            f530Var2 = c2;
            btsVar = btsVar;
            qkj0Var = qkj0Var2;
            ax5 ax5Var = new ax5(str, xlj0Var3, qkj0Var, z2, tlsVar, fgdVar3, slsVar);
            tlsVar2 = tlsVar;
            btsVar.o0(ax5Var);
            Q4 = ax5Var;
            f530 d2 = q791.d(fnq0.a(f530Var2, (tls) Q4), z, null, null, slsVar, 14);
            k = btsVar.k(m3u0Var);
            Q = btsVar.Q();
            if (!k) {
            }
            Q = new xo1(m3u0Var, 14);
            btsVar.o0(Q);
            ydb1.a(d.a(d2, (tls) Q), wwg.S(-1384679411, true, new pdf0(10, uij0Var), btsVar), wwg.S(24738888, true, new pdf0(11, jdj0Var), btsVar), wwg.S(1442152063, true, new pdf0(12, ikj0Var), btsVar), wwg.S(956853506, true, new y740(17, qkj0Var, tlsVar2), btsVar), null, null, false, btsVar, 28080, 224);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) amj0Var, (Object) f530Var, tlsVar, i, 5);
        }
    }

    public static final void d(ibp0 ibp0Var, uij0 uij0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1761095596);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(uij0Var) : btsVar.e(uij0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z = uij0Var instanceof uij0;
            c530 c530Var = c530.a;
            if (z) {
                btsVar.e0(1773606253);
                wp2 wp2Var = uij0Var.c;
                boolean k = btsVar.k(wp2Var);
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = wp2Var != null ? new jfv(wp2Var) : null;
                    btsVar.o0(Q);
                }
                tdb1.d(ibp0Var, uij0Var.a, c530Var, (jfv) Q, null, null, 0.0f, 0, wwg.S(369677428, true, new o990(uij0Var, ibp0Var), btsVar), btsVar, (i3 & 14) | 805306368 | (i3 & 896), 244);
                btsVar.t(false);
            } else {
                if (uij0Var != null) {
                    throw unr0.y(195758048, btsVar, false);
                }
                btsVar.e0(195785975);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(ibp0Var, uij0Var, f530Var2, i, 9);
        }
    }

    public static final void e(ibp0 ibp0Var, ikj0 ikj0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        ibp0 ibp0Var2;
        f530 f530Var2;
        boolean z;
        l690 b;
        bts btsVar = (bts) fidVar;
        btsVar.g0(798692028);
        dmw0 dmw0Var = btsVar.a;
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(ikj0Var) : btsVar.e(ikj0Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            boolean z2 = ikj0Var instanceof gkj0;
            c530 c530Var = c530.a;
            if (z2) {
                btsVar.e0(-284380043);
                urb1.c(ibp0Var, ((gkj0) ikj0Var).a, null, null, 0.0f, 0, wwg.S(2060175380, true, new o990(ikj0Var, ibp0Var), btsVar), btsVar, (i4 & 14) | 805306368 | (i4 & 896));
                ibp0Var2 = ibp0Var;
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                ibp0Var2 = ibp0Var;
                if (ikj0Var instanceof fkj0) {
                    btsVar.e0(-283920127);
                    Object Q = btsVar.Q();
                    if (Q == did.a) {
                        Q = new mm4(AppColor$Palette.Control, AppColor$Palette.TextOnControl, bm4.a);
                        btsVar.o0(Q);
                    }
                    mm4 mm4Var = (mm4) Q;
                    f530 o = an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    String str = ((fkj0) ikj0Var).a;
                    BadgeSize badgeSize = BadgeSize.M;
                    int i5 = qij0.a[badgeSize.ordinal()];
                    if (i5 == 1) {
                        b = an91.b(4.0f, 0.0f, 2);
                    } else if (i5 == 2) {
                        b = an91.b(6.0f, 0.0f, 2);
                    } else {
                        if (i5 != 3) {
                            w511.b();
                            return;
                        }
                        b = an91.b(6.0f, 0.0f, 2);
                    }
                    wk4.a(badgeSize, mm4Var, b, o, wwg.S(-1790062893, true, new hya(badgeSize, str, i3), btsVar), btsVar, 196662);
                    btsVar.t(false);
                } else if (ikj0Var instanceof hkj0) {
                    btsVar.e0(-283453639);
                    f530 o2 = an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    f530Var2 = c530Var;
                    lhl0 a = khl0.a(new i43(2.0f, true, new quz(11)), x4c.E, btsVar, 54);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o3 = btsVar.o();
                    f530 d = androidx.compose.ui.b.d(btsVar, o2);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
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
                    wls wlsVar = androidx.compose.ui.node.d.f;
                    qje.W(btsVar, wlsVar, a);
                    wls wlsVar2 = androidx.compose.ui.node.d.e;
                    qje.W(btsVar, wlsVar2, o3);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = androidx.compose.ui.node.d.g;
                    qje.W(btsVar, wlsVar3, valueOf);
                    tls tlsVar = androidx.compose.ui.node.d.h;
                    qje.M(btsVar, tlsVar);
                    wls wlsVar4 = androidx.compose.ui.node.d.d;
                    qje.W(btsVar, wlsVar4, d);
                    sic a2 = qic.a(lr20.c, x4c.I, btsVar, 48);
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o4 = btsVar.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var2);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar, a2);
                    qje.W(btsVar, wlsVar2, o4);
                    vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                    qje.W(btsVar, wlsVar4, d2);
                    hkj0 hkj0Var = (hkj0) ikj0Var;
                    CharSequence charSequence = hkj0Var.c;
                    if (evu0.J(hkj0Var.b)) {
                        z = false;
                        btsVar.e0(1503686636);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1503512323);
                        z = false;
                        jeb1.f(hkj0Var.b, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, 384, 0, 16378);
                        btsVar.t(false);
                    }
                    if (evu0.J(charSequence)) {
                        btsVar.e0(1503954476);
                        btsVar.t(z);
                    } else {
                        btsVar.e0(1503769592);
                        qgy.b(charSequence, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                        btsVar.t(z);
                    }
                    btsVar.t(true);
                    if (hkj0Var.a != null) {
                        btsVar.e0(-596851172);
                        v0b1.a(hkj0Var.a, null, null, null, null, null, null, null, 0.0f, 0, btsVar, 0, 1022);
                        btsVar.t(z);
                    } else {
                        btsVar.e0(-596783902);
                        btsVar.t(z);
                    }
                    btsVar.t(true);
                    btsVar.t(z);
                } else {
                    f530Var2 = c530Var;
                    if (ikj0Var != null) {
                        throw unr0.y(-1256100866, btsVar, false);
                    }
                    btsVar.e0(-1256040823);
                    x901.a.invoke(ibp0Var2, btsVar, Integer.valueOf(i4 & 14));
                    btsVar.t(false);
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
            v.d = new vnf0(ibp0Var2, ikj0Var, f530Var2, i, 8);
        }
    }

    public static final void f(ibp0 ibp0Var, qkj0 qkj0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        ibp0 ibp0Var2;
        int i2;
        f530 f530Var2;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-708046633);
        if ((i & 6) == 0) {
            ibp0Var2 = ibp0Var;
            i2 = (btsVar.k(ibp0Var2) ? 4 : 2) | i;
        } else {
            ibp0Var2 = ibp0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(qkj0Var) : btsVar.e(qkj0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        int i4 = i3;
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            fgd fgdVar = (fgd) btsVar.m(g3z.a);
            boolean l = jl40.l(qkj0Var, kkj0.a);
            c530 c530Var = c530.a;
            if (l) {
                btsVar.e0(-1827970975);
                sya1.a(llb1.b(), an91.o(c530Var, 0.0f, 0.0f, ibp0Var2.c() != SlotSize.XS ? 8.0f : 4.0f, 0.0f, 11), null, tp2.a, btsVar, 0, 4);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                boolean z = qkj0Var instanceof lkj0;
                o430 o430Var = did.a;
                if (z) {
                    btsVar.e0(-832450727);
                    xlj0 xlj0Var = ((lkj0) qkj0Var).b;
                    ButtonStyle buttonStyle = ButtonStyle.Ghost;
                    boolean a = btsVar.a(true) | ((i4 & 7168) == 2048) | btsVar.e(xlj0Var) | btsVar.e(fgdVar);
                    Object Q = btsVar.Q();
                    if (a || Q == o430Var) {
                        lij0 lij0Var = new lij0(true, tlsVar, xlj0Var, fgdVar, 1);
                        btsVar.o0(lij0Var);
                        Q = lij0Var;
                    }
                    d17.c(fj91.d(an91.o(c530Var, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), IntrinsicSize.Min), true, ButtonSize.XS, buttonStyle, ButtonForm.Circle, (sls) Q, wwg.S(1238821861, true, new pdf0(8, qkj0Var), btsVar), btsVar, 1576320, 0);
                    btsVar.t(false);
                } else {
                    boolean z2 = true;
                    fgd fgdVar2 = fgdVar;
                    if (qkj0Var instanceof nkj0) {
                        btsVar.e0(-831912474);
                        xkb1.b(((nkj0) qkj0Var).a, an91.o(c530Var, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, true, btsVar, 0, 4);
                        btsVar.t(false);
                    } else if (qkj0Var instanceof okj0) {
                        btsVar.e0(-831749786);
                        wfa1.a(((okj0) qkj0Var).a, an91.o(c530Var, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, true, btsVar, 0, 4);
                        btsVar = btsVar;
                        btsVar.t(false);
                    } else if (qkj0Var instanceof pkj0) {
                        btsVar.e0(-831584897);
                        pkj0 pkj0Var = (pkj0) qkj0Var;
                        xlj0 xlj0Var2 = pkj0Var.b;
                        if (xlj0Var2 == null) {
                            btsVar.e0(-831508173);
                            btsVar.t(false);
                            tlsVar2 = null;
                        } else {
                            btsVar.e0(-831508172);
                            if ((i4 & 7168) != 2048) {
                                z2 = false;
                            }
                            boolean e = z2 | btsVar.e(xlj0Var2) | btsVar.e(fgdVar2);
                            Object Q2 = btsVar.Q();
                            if (e || Q2 == o430Var) {
                                Q2 = new th40(tlsVar, xlj0Var2, fgdVar2);
                                btsVar.o0(Q2);
                            }
                            btsVar.t(false);
                            tlsVar2 = (tls) Q2;
                        }
                        ijb1.b(pkj0Var.a, an91.o(c530Var, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, null, tlsVar2, true, btsVar, 0, 28);
                        btsVar.t(false);
                    } else {
                        tls tlsVar3 = tlsVar;
                        if (qkj0Var instanceof mkj0) {
                            btsVar.e0(-831123710);
                            f530 o = an91.o(c530Var, 8.0f, 0.0f, 16.0f, 0.0f, 10);
                            lhl0 a2 = khl0.a(new i43(4.0f, true, new m6(9, x4c.H)), x4c.E, btsVar, 54);
                            int hashCode = Long.hashCode(btsVar.T);
                            r1b0 o2 = btsVar.o();
                            f530 d = androidx.compose.ui.b.d(btsVar, o);
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
                            qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
                            qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
                            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                            qje.M(btsVar, androidx.compose.ui.node.d.h);
                            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
                            btsVar.e0(-1328407456);
                            ArrayList arrayList = ((mkj0) qkj0Var).a;
                            int size = arrayList.size();
                            int i5 = 0;
                            while (i5 < size) {
                                jkj0 jkj0Var = (jkj0) arrayList.get(i5);
                                ButtonSize buttonSize = ButtonSize.XS;
                                gz6 gz6Var = new gz6(jkj0Var.c, jkj0Var.b);
                                int i6 = size;
                                ButtonForm buttonForm = ButtonForm.Circle;
                                ArrayList arrayList2 = arrayList;
                                boolean k = ((i4 & 7168) == 2048) | btsVar.k(jkj0Var) | btsVar.e(fgdVar2);
                                Object Q3 = btsVar.Q();
                                if (k || Q3 == o430Var) {
                                    Q3 = new mij0(tlsVar3, jkj0Var, fgdVar2, 0);
                                    btsVar.o0(Q3);
                                }
                                d17.d(null, false, buttonSize, gz6Var, buttonForm, (sls) Q3, wwg.S(937922804, true, new pdf0(9, jkj0Var), btsVar), btsVar, 1597824, 3);
                                i5++;
                                tlsVar3 = tlsVar;
                                size = i6;
                                o430Var = o430Var;
                                arrayList = arrayList2;
                                fgdVar2 = fgdVar2;
                                c530Var = c530Var;
                            }
                            tse0.t(btsVar, false, true, false);
                            f530Var2 = c530Var;
                        } else {
                            if (qkj0Var != null) {
                                throw unr0.y(-1827971083, btsVar, false);
                            }
                            btsVar.e0(-1827895261);
                            c530 c530Var2 = c530Var;
                            nnm.s(c530Var2, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var2.c()) : Float.NaN, btsVar, false);
                            f530Var2 = c530Var2;
                        }
                    }
                }
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0((Object) ibp0Var2, (Object) qkj0Var, f530Var2, (Object) tlsVar, i, 1);
        }
    }

    public static String g(String str) {
        Object failure;
        String str2;
        if (str == null) {
            failure = "bad_url";
        } else {
            try {
                boolean y = evu0.y(str, "://", false);
                if (!y) {
                    str = "stub://".concat(str);
                }
                URI uri = new URI(str);
                if (y) {
                    str2 = uri.getScheme() + "://";
                } else {
                    str2 = "";
                }
                failure = str2 + uri.getHost();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
        }
        return (String) (failure instanceof Result.Failure ? "bad_url" : failure);
    }

    public static final exq h(exq exqVar, boolean z) {
        axq axqVar = axq.d;
        axq axqVar2 = axq.c;
        if (exqVar == null || exqVar.equals(axqVar2) || exqVar.equals(axqVar)) {
            return z ? axqVar : axqVar2;
        }
        if (exqVar instanceof cxq) {
            return new cxq(z, ((cxq) exqVar).c);
        }
        if (exqVar instanceof bxq) {
            return new bxq(z, ((bxq) exqVar).c);
        }
        ny61.r("Unknown field type");
        return null;
    }
}
