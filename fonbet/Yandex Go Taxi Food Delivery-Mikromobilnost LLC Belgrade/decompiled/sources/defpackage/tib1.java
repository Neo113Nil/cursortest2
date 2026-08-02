package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.go.masstransit.sdk.core.design.slot.ui.MasstransitSlotItemUiState$Body$Ellipsize;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class tib1 {
    public static final void a(ebp0 ebp0Var, g510 g510Var, fid fidVar, int i) {
        ebp0 ebp0Var2 = ebp0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(659883525);
        int i2 = i | (btsVar.k(ebp0Var2) ? 4 : 2) | (btsVar.k(g510Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            CharSequence charSequence = g510Var.a;
            Integer num = g510Var.f;
            wp2 wp2Var = g510Var.e;
            Integer num2 = g510Var.c;
            wp2 wp2Var2 = g510Var.b;
            CharSequence charSequence2 = g510Var.d;
            f510 f510Var = g510Var.g;
            int i3 = f510Var.b;
            int h = h(f510Var.d);
            int i4 = f510Var.c;
            int h2 = h(f510Var.e);
            wp2 wp2Var3 = tp2.a;
            if (charSequence != null && charSequence2 == null) {
                btsVar.e0(525224397);
                if (wp2Var2 == null) {
                    wp2Var2 = wp2Var3;
                }
                m9b1.a(ebp0Var2, charSequence, null, wp2Var2, k(num2, btsVar), h, i3, null, null, null, 0, 0, null, btsVar, i2 & 14, 0, 16322);
                btsVar.t(false);
            } else if (charSequence == null && charSequence2 != null) {
                btsVar.e0(525503614);
                m9b1.a(ebp0Var, charSequence2, null, wp2Var == null ? wp2Var3 : wp2Var, k(num, btsVar), h2, i4, null, null, null, 0, 0, null, btsVar, i2 & 14, 0, 16322);
                btsVar.t(false);
            } else if (charSequence == null || charSequence2 == null) {
                ebp0Var2 = ebp0Var;
                btsVar.e0(-1507043735);
                btsVar.t(false);
            } else {
                btsVar.e0(525804376);
                if (wp2Var2 == null) {
                    wp2Var2 = wp2Var3;
                }
                ety0 k = k(num2, btsVar);
                if (wp2Var != null) {
                    wp2Var3 = wp2Var;
                }
                ebp0Var2 = ebp0Var;
                m9b1.b(ebp0Var2, charSequence, null, wp2Var2, k, h, i3, charSequence2, wp2Var3, j(num, btsVar), h2, i4, null, btsVar, i2 & 14, 0, 28738);
                btsVar.t(false);
            }
            ebp0Var2 = ebp0Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(ebp0Var2, g510Var, i, 21);
        }
    }

    public static final void b(final ebp0 ebp0Var, final c510 c510Var, fid fidVar, int i) {
        int i2;
        ebp0 ebp0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1916728978);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ebp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(c510Var) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ebp0Var2 = ebp0Var;
            v9b1.a(ebp0Var2, wwg.S(597210322, true, new wls() { // from class: p410
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    c510 c510Var2 = c510Var;
                    ebp0 ebp0Var3 = ebp0Var;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else {
                                tib1.a(ebp0Var3, c510Var2.a, btsVar2, 0);
                                break;
                            }
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tib1.a(ebp0Var3, c510Var2.b, btsVar3, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-1059795919, true, new wls() { // from class: p410
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    c510 c510Var2 = c510Var;
                    ebp0 ebp0Var3 = ebp0Var;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else {
                                tib1.a(ebp0Var3, c510Var2.a, btsVar2, 0);
                                break;
                            }
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tib1.a(ebp0Var3, c510Var2.b, btsVar3, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, 0.0f, null, null, btsVar, (i2 & 14) | 432);
        } else {
            ebp0Var2 = ebp0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(ebp0Var2, c510Var, i, 10);
        }
    }

    public static final void c(ebp0 ebp0Var, e510 e510Var, fid fidVar, int i) {
        int i2;
        BodyAlign bodyAlign;
        ebp0 ebp0Var2 = ebp0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-795285198);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ebp0Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(e510Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            g510 g510Var = e510Var.a;
            CharSequence charSequence = g510Var.a;
            Integer num = g510Var.f;
            wp2 wp2Var = g510Var.e;
            Integer num2 = g510Var.c;
            wp2 wp2Var2 = g510Var.b;
            CharSequence charSequence2 = g510Var.d;
            f510 f510Var = g510Var.g;
            int i3 = f510Var.b;
            int h = h(f510Var.d);
            int i4 = f510Var.c;
            int h2 = h(f510Var.e);
            int i5 = q410.a[f510Var.a.ordinal()];
            if (i5 == 1) {
                bodyAlign = BodyAlign.Start;
            } else if (i5 == 2) {
                bodyAlign = BodyAlign.Center;
            } else {
                if (i5 != 3) {
                    w511.b();
                    return;
                }
                bodyAlign = BodyAlign.End;
            }
            tp2 tp2Var = tp2.a;
            if (charSequence == null || charSequence2 != null) {
                BodyAlign bodyAlign2 = bodyAlign;
                if (charSequence != null || charSequence2 == null) {
                    wp2 wp2Var3 = wp2Var2;
                    if (charSequence == null || charSequence2 == null) {
                        ebp0Var2 = ebp0Var;
                        btsVar.e0(235158838);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1300520500);
                        if (wp2Var3 == null) {
                            wp2Var3 = tp2Var;
                        }
                        ety0 k = k(num2, btsVar);
                        if (wp2Var == null) {
                            wp2Var = tp2Var;
                        }
                        ebp0Var2 = ebp0Var;
                        m9b1.b(ebp0Var2, charSequence, null, wp2Var3, k, h, i3, charSequence2, wp2Var, j(num, btsVar), h2, i4, bodyAlign2, btsVar, i2 & 14, 0, 20546);
                        btsVar.t(false);
                    }
                } else {
                    btsVar.e0(-1300852014);
                    m9b1.a(ebp0Var, charSequence2, null, wp2Var == null ? tp2Var : wp2Var, k(num, btsVar), h2, i4, null, null, null, 0, 0, bodyAlign2, btsVar, i2 & 14, 0, 12226);
                    btsVar.t(false);
                }
            } else {
                btsVar.e0(-1301161983);
                if (wp2Var2 == null) {
                    wp2Var2 = tp2Var;
                }
                m9b1.a(ebp0Var2, charSequence, null, wp2Var2, k(num2, btsVar), h, i3, null, null, null, 0, 0, bodyAlign, btsVar, i2 & 14, 0, 12226);
                btsVar.t(false);
            }
            ebp0Var2 = ebp0Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(ebp0Var2, e510Var, i, 9);
        }
    }

    public static final void d(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1768857714);
        if (btsVar.V(i & 1, i != 0)) {
            pi6.a(bzk0.c(ljs0.m(an91.m(c530.a, 24.0f, 0.0f, 2), 8.0f), AppColor$Palette.Text, cyk0.a), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mq5(i, 27);
        }
    }

    public static final void e(CharSequence charSequence, List list, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        c530 c530Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-956464753);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2) | (btsVar2.k(list) ? 32 : 16) | 384;
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            c530 c530Var3 = c530Var2;
            qgy.b(charSequence, null, an91.m(ljs0.c(c530Var2, 1.0f), 16.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 2, 1, 0, xya1.b(btsVar2).f, null, btsVar2, (i2 & 14) | 805306752, 6, 10746);
            btsVar = btsVar2;
            oeb1.c(btsVar, ljs0.e(c530Var3, 10.0f));
            btsVar.e0(733598027);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                f((CharSequence) obj, btsVar, 0);
                if (i3 < scc.f(list)) {
                    btsVar.e0(-271660762);
                    c530Var = c530Var3;
                    yrl.b(6, 6, btsVar, an91.o(c530Var, 56.0f, 0.0f, 16.0f, 0.0f, 10));
                    btsVar.t(false);
                } else {
                    c530Var = c530Var3;
                    btsVar.e0(-271577155);
                    btsVar.t(false);
                }
                i3 = i4;
                c530Var3 = c530Var;
            }
            f530Var2 = c530Var3;
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(charSequence, list, f530Var2, i, 2);
        }
    }

    public static final void f(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-342180100);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.g(ljs0.c(c530Var, 1.0f), 56.0f, 0.0f, 2), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            d(btsVar, 0);
            qgy.b(charSequence, null, an91.m(c530Var, 0.0f, 11.0f, 1), AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.a, null, btsVar, (i2 & 14) | 3456, 0, 12274);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 4, charSequence);
        }
    }

    public static final void g(ebp0 ebp0Var, h510 h510Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2040163668);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ebp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(h510Var) ? 32 : 16;
        }
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (h510Var instanceof e510) {
            btsVar.e0(-2092193150);
            c(ebp0Var, (e510) h510Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else if (h510Var instanceof c510) {
            btsVar.e0(-2092190654);
            b(ebp0Var, (c510) h510Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            if (!jl40.l(h510Var, d510.a)) {
                throw unr0.y(-2092195157, btsVar, false);
            }
            btsVar.e0(-2092188496);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(ebp0Var, h510Var, i, 8);
        }
    }

    public static final int h(MasstransitSlotItemUiState$Body$Ellipsize masstransitSlotItemUiState$Body$Ellipsize) {
        int i = q410.b[masstransitSlotItemUiState$Body$Ellipsize.ordinal()];
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 1;
        }
        w511.b();
        return 0;
    }

    public static void i() {
        wsv0 wsv0Var = wsv0.e;
    }

    public static final ety0 j(Integer num, fid fidVar) {
        ety0 ety0Var = xya1.e(fidVar).h.a;
        return num != null ? ety0.a(ety0Var, 0L, uh6.E(num.intValue()), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213) : ety0Var;
    }

    public static final ety0 k(Integer num, fid fidVar) {
        ety0 ety0Var = xya1.e(fidVar).g.a;
        return num != null ? ety0.a(ety0Var, 0L, uh6.E(num.intValue()), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213) : ety0Var;
    }
}
