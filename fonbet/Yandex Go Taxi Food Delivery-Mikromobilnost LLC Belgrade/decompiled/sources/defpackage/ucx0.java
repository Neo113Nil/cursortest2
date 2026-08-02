package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.go.taxi.summary.verticalsummary.utils.c;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class ucx0 {
    public static final mm4 a = new mm4(new up2(up2.b), AppColor$Palette.Text, cm4.a);

    public static final void a(final uox0 uox0Var, m3u0 m3u0Var, m3u0 m3u0Var2, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(194281152);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(uox0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(m3u0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(m3u0Var2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.c(30) ? 2048 : 1024;
        }
        int i3 = i2 | HProv.ALG_CLASS_DATA_ENCRYPT;
        if ((196608 & i) == 0) {
            i3 |= btsVar.e(tlsVar) ? 131072 : 65536;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((458752 & i3) == 131072);
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new xlp0(23, tlsVar, uox0Var, m3u0Var);
                btsVar.o0(Q2);
            }
            ydb1.a(an91.m(q791.b(c, zx40Var, null, false, null, null, (sls) Q2, 28), 16.0f, 0.0f, 2), wwg.S(1669939926, true, new zls() { // from class: tcx0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    uox0 uox0Var2 = uox0Var;
                    ibp0 ibp0Var = (ibp0) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i6) {
                        case 0:
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                ucx0.c(ibp0Var, uox0Var2.i, btsVar2, intValue & 14);
                                break;
                            }
                        default:
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                ucx0.d(ibp0Var, uox0Var2.k, btsVar3, intValue & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-660694319, true, new ays0(7, uox0Var, m3u0Var2), btsVar), null, wwg.S(-395050997, true, new zls() { // from class: tcx0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    uox0 uox0Var2 = uox0Var;
                    ibp0 ibp0Var = (ibp0) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i6) {
                        case 0:
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                ucx0.c(ibp0Var, uox0Var2.i, btsVar2, intValue & 14);
                                break;
                            }
                        default:
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                ucx0.d(ibp0Var, uox0Var2.k, btsVar3, intValue & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0(uox0Var, m3u0Var, m3u0Var2, f530Var2, tlsVar, i, 8);
        }
    }

    public static final void b(ebp0 ebp0Var, wbx0 wbx0Var, m3u0 m3u0Var, fid fidVar, int i) {
        ebp0 ebp0Var2;
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1122779723);
        if ((i & 6) == 0) {
            ebp0Var2 = ebp0Var;
            i2 = (btsVar.k(ebp0Var2) ? 4 : 2) | i;
        } else {
            ebp0Var2 = ebp0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(wbx0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(m3u0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.c(30) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            a b = c.b(m3u0Var, sb2.K(30, 0, ubn.d, 2), btsVar, (i2 >> 6) & 14);
            boolean z = wbx0Var.c;
            vbx0 vbx0Var = wbx0Var.b;
            AppColor$Palette appColor$Palette = z ? AppColor$Palette.Text : AppColor$Palette.TextMinor;
            BodyAlign bodyAlign = (BodyAlign) btsVar.m(u76.a);
            c530 c530Var = c530.a;
            f530 b2 = ofb1.b(an91.m(an91.o(c530Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0.0f, 12.0f, 1), wbx0Var.d, null, 6);
            jt1 alignment = bodyAlign.getAlignment();
            ebp0Var2.getClass();
            f530 m = an91.m(cj6.a.a(b2, alignment), 0.0f, ebp0Var2.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
            sic a2 = qic.a(lr20.c, bodyAlign.getHorizontal(), btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            qgy.b(wbx0Var.a, null, null, appColor$Palette, 0L, 0L, new sjy0(bodyAlign.getTextAlign()), 0L, 2, 1, 0, xya1.e(btsVar).h.b, null, btsVar, 805306368, 3078, 2422);
            ttb1.a(vbx0Var.a, null, k.d(null, null, 15), k.l(null, null, 15), null, wwg.S(497841651, true, new nhu0(1, bodyAlign, appColor$Palette), btsVar), btsVar, 200064, 18);
            f530 m2 = ymb1.m(c530Var);
            boolean e = btsVar.e(b);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new w7o0(28, b);
                btsVar.o0(Q);
            }
            qgy.b(vbx0Var.b, null, an91.o(kp50.F(m2, (zls) Q), 0.0f, 4.0f, 0.0f, 0.0f, 13), appColor$Palette, 0L, 0L, new sjy0(bodyAlign.getTextAlign()), 0L, 2, 1, 0, xya1.e(btsVar).h.a, null, btsVar, 805306368, 3078, 2418);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(ebp0Var, wbx0Var, m3u0Var, i, 24);
        }
    }

    public static final void c(ibp0 ibp0Var, vcx0 vcx0Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        int i3;
        boolean z;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(63914269);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(vcx0Var) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            m3u0 b = androidx.compose.animation.core.b.b(vcx0Var.b ? 1.0f : 0.5f, null, "tariffImageAlpha", null, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 22);
            Object Q = btsVar2.Q();
            int i4 = 6;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                aed.a.getClass();
                androidx.compose.runtime.internal.a aVar = new androidx.compose.runtime.internal.a(-328108779, new sc20(8, new ib30(new androidx.compose.runtime.internal.a(-703201834, new bab(i4, aed.b), true))), true);
                btsVar2.o0(aVar);
                Q = aVar;
            }
            wls wlsVar = (wls) Q;
            c530 c530Var = c530.a;
            f530 e = ljs0.e(ljs0.q(an91.o(c530Var, 2.0f, 0.0f, 6.0f, 0.0f, 10), 88.0f), 56.0f);
            to5 to5Var = x4c.E;
            ibp0Var.getClass();
            f530 k = e.k(new pa31(to5Var));
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, k);
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
            qje.W(btsVar2, d.f, d);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d2);
            uo5 uo5Var = x4c.w;
            cj6 cj6Var = cj6.a;
            ttb1.a(vcx0Var.c, cj6Var.a(c530Var, uo5Var), null, null, null, wwg.S(-996675313, true, new alb0(27, vcx0Var), btsVar2), btsVar2, ImageMetadata.EDGE_MODE, 28);
            btsVar = btsVar2;
            if (vcx0Var.a != null) {
                btsVar.e0(923175195);
                f530 a2 = cj6Var.a(an91.o(ljs0.e(ljs0.c(c530Var, 1.0f), 56.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7), x4c.y);
                boolean k2 = btsVar.k(b);
                Object Q2 = btsVar.Q();
                if (k2 || Q2 == o430Var) {
                    Q2 = new xo1(b, 22);
                    btsVar.o0(Q2);
                }
                f530 a3 = androidx.compose.ui.graphics.d.a(a2, (tls) Q2);
                z = true;
                i3 = 0;
                v0b1.a(vcx0Var.a, a3, null, wwg.S(-293520019, true, new cp1(wlsVar, 16), btsVar), null, null, null, null, 0.0f, 0, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 1012);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                i3 = 0;
                z = true;
                btsVar.e0(923480235);
                wlsVar.invoke(btsVar, 6);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar = btsVar2;
            i3 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(ibp0Var, vcx0Var, i, i3);
        }
    }

    public static final void d(ibp0 ibp0Var, qdx0 qdx0Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2246935);
        if ((i & 48) == 0) {
            i2 = (btsVar2.k(qdx0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (btsVar2.V(i2 & 1, (i2 & 17) != 16)) {
            m3u0 b = androidx.compose.animation.core.b.b(qdx0Var.c ? 0.0f : 1.0f, sb2.K(500, 0, null, 6), "tariffTrailAlpha", null, btsVar2, 3120, 20);
            int a2 = (int) (((k651) btsVar2.m(j.u)).a() >> 32);
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.h(fwiVar.H((int) (a2 * 0.4d)), btsVar2);
            }
            f530 o = an91.o(ljs0.s(c530.a, 0.0f, ((y7m) Q).a, 1), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean k = btsVar2.k(b);
            Object Q2 = btsVar2.Q();
            if (k || Q2 == o430Var) {
                Q2 = new xo1(b, 23);
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            qgy.b(qdx0Var.a, null, androidx.compose.ui.graphics.d.a(o, (tls) Q2), AppColor$Palette.Text, 0L, 0L, new sjy0(6), 0L, 0, 0, 0, xya1.e(btsVar2).g.b, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12146);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(ibp0Var, qdx0Var, i, 1);
        }
    }
}
