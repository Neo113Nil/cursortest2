package defpackage;

import android.graphics.Bitmap;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.address.address_map_picker.ui.a;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.icon.IconSpotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final /* synthetic */ class wg0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ wg0(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(intValue & 1, (intValue & 17) != 16);
        dmw0 dmw0Var = btsVar.a;
        if (V) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 o2 = an91.o(an91.m(ljs0.c(c530Var, 1.0f), 10.0f, 0.0f, 2), 0.0f, 10.0f, 0.0f, 8.0f, 5);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            IconSpotSize iconSpotSize = IconSpotSize.M;
            hdu hduVar = new hdu(AppColor$Palette.Error, AppColor$Palette.EverFront);
            b9d.a.getClass();
            e5v.a(null, hduVar, null, iconSpotSize, b9d.b, btsVar, 27696, 5);
            btsVar.t(true);
            f530 o4 = an91.o(an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            String e = ohb1.e(btsVar, cyh0.masstransit_trains_invalid_qr);
            ety0 ety0Var = xya1.d(btsVar).e.d;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            jeb1.f(e, o4, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, 432, 0, 16376);
            jeb1.f(ohb1.e(btsVar, cyh0.masstransit_trains_scan_qr_text), an91.o(an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7), appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 432, 0, 16376);
            f530 k = an91.k(c530Var, 8.0f);
            boolean b = btsVar.b(4.0f) | btsVar.c(2) | btsVar.a(false);
            Object Q = btsVar.Q();
            Object obj4 = did.a;
            if (b || Q == obj4) {
                Q = new jg0(19);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o5 = btsVar.o();
            f530 d4 = b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, z910Var);
            qje.W(btsVar, wlsVar2, o5);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            ButtonStyle buttonStyle = ButtonStyle.Main;
            tls tlsVar2 = this.b;
            boolean k2 = btsVar.k(tlsVar2);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == obj4) {
                Q2 = new kiu(22, tlsVar2);
                btsVar.o0(Q2);
            }
            d17.c(null, false, null, buttonStyle, null, (sls) Q2, b9d.c, btsVar, 1575936, 23);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        tic ticVar = (tic) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ticVar) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            tls tlsVar = this.b;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new kiu(23, tlsVar);
                btsVar.o0(Q);
            }
            vpa1.a(an91.o(ticVar.a(x4c.G, c530.a), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, (sls) Q, wwg.S(367939781, false, jp30.a, btsVar), btsVar, 24960, 2);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        tic ticVar = (tic) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ticVar) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            tls tlsVar = this.b;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new s140(12, tlsVar);
                btsVar.o0(Q);
            }
            vpa1.a(an91.o(ticVar.a(x4c.G, c530.a), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, (sls) Q, wwg.S(367939781, false, s840.a, btsVar), btsVar, 24960, 2);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        tic ticVar = (tic) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ticVar) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            tls tlsVar = this.b;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new s140(28, tlsVar);
                btsVar.o0(Q);
            }
            vpa1.a(u3a1.d(an91.o(ticVar.a(x4c.I, c530.a), 0.0f, 8.0f, 8.0f, 8.0f, 1), "modal_close_button"), false, ButtonSize.M, (sls) Q, wwg.S(-771186319, false, rja0.a, btsVar), btsVar, 24960, 2);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            tls tlsVar = this.b;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new ukb0(5, tlsVar);
                btsVar.o0(Q);
            }
            mab1.a(null, null, null, null, null, null, (sls) Q, btsVar, 0, 63);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            rab1.b(null, null, null, null, null, wwg.S(935886228, true, new sg0(27, this.b), btsVar), null, btsVar, ImageMetadata.EDGE_MODE, 95);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = 0;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            tls tlsVar = this.b;
            rab1.b(null, wwg.S(1263891241, true, new sg0(29, tlsVar), btsVar), null, null, null, wwg.S(-780157395, true, new rhi0(i, tlsVar), btsVar), null, btsVar, 196656, 93);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            f530 k = an91.k(c530.a, 8.0f);
            ButtonSize buttonSize = ButtonSize.M;
            tls tlsVar = this.b;
            boolean k2 = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k2 || Q == did.a) {
                Q = new v6k0(15, tlsVar);
                btsVar.o0(Q);
            }
            ebd.a.getClass();
            vpa1.a(k, false, buttonSize, (sls) Q, ebd.b, btsVar, 24966, 2);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        tic ticVar = (tic) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ticVar) ? 4 : 2;
        }
        int i = 0;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            tls tlsVar = this.b;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new wzl0(i, tlsVar);
                btsVar.o0(Q);
            }
            vpa1.a(an91.o(ticVar.a(x4c.G, c530.a), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, (sls) Q, wwg.S(367939781, false, xzl0.a, btsVar), btsVar, 24960, 2);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = 10;
        int i3 = 5;
        c530 c530Var = c530.a;
        int i4 = 4;
        o430 o430Var = did.a;
        char c = 1;
        tls tlsVar = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                tic ticVar = (tic) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ticVar) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new o0(i2, tlsVar);
                        btsVar.o0(Q);
                    }
                    vpa1.a(an91.o(ticVar.a(x4c.G, c530Var), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, (sls) Q, wwg.S(367939781, false, zg0.a, btsVar), btsVar, 24960, 2);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                i31 i31Var = (i31) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((bts) fidVar2).k(i31Var) : fidVar2.e(i31Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                } else if (i31Var instanceof b31) {
                    btsVar2.e0(-683812892);
                    a.c((b31) i31Var, tlsVar, btsVar2, (intValue2 & 14) | 8);
                    btsVar2.t(false);
                } else if (i31Var instanceof f31) {
                    btsVar2.e0(-683810023);
                    pnm.c((f31) i31Var, tlsVar, btsVar2, intValue2 & 14);
                    btsVar2.t(false);
                } else if (i31Var instanceof g31) {
                    btsVar2.e0(-683807495);
                    btsVar2.t(false);
                } else {
                    if (!(i31Var instanceof h31)) {
                        throw unr0.y(-683814979, btsVar2, false);
                    }
                    btsVar2.e0(-683805530);
                    bia1.c((h31) i31Var, tlsVar, btsVar2, (intValue2 & 14) | 8);
                    btsVar2.t(false);
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    boolean k2 = btsVar3.k(tlsVar);
                    Object Q2 = btsVar3.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new zp5(3, tlsVar);
                        btsVar3.o0(Q2);
                    }
                    iab1.a(null, null, null, null, null, null, (sls) Q2, btsVar3, 0);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                tic ticVar2 = (tic) obj;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((bts) fidVar4).k(ticVar2) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean k3 = btsVar4.k(tlsVar);
                    Object Q3 = btsVar4.Q();
                    if (k3 || Q3 == o430Var) {
                        Q3 = new zp5(i3, tlsVar);
                        btsVar4.o0(Q3);
                    }
                    vpa1.a(u3a1.d(an91.o(ticVar2.a(x4c.I, c530Var), 0.0f, 8.0f, 8.0f, 8.0f, 1), "modal_close_button"), false, ButtonSize.M, (sls) Q3, wwg.S(-771186319, false, nj7.a, btsVar4), btsVar4, 24960, 2);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    boolean k4 = btsVar5.k(tlsVar);
                    Object Q4 = btsVar5.Q();
                    if (k4 || Q4 == o430Var) {
                        Q4 = new zp5(20, tlsVar);
                        btsVar5.o0(Q4);
                    }
                    mab1.a(null, null, null, null, null, null, (sls) Q4, btsVar5, 0, 63);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                tlsVar.invoke((Bitmap) obj);
                return zy11Var;
            case 6:
                tic ticVar3 = (tic) obj;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((bts) fidVar6).k(ticVar3) ? 4 : 2;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                    boolean k5 = btsVar6.k(tlsVar);
                    Object Q5 = btsVar6.Q();
                    if (k5 || Q5 == o430Var) {
                        Q5 = new zp5(24, tlsVar);
                        btsVar6.o0(Q5);
                    }
                    vpa1.a(u3a1.d(an91.o(ticVar3.a(x4c.I, c530Var), 0.0f, 8.0f, 8.0f, 8.0f, 1), "modal_close_button"), false, ButtonSize.M, (sls) Q5, wwg.S(-771186319, false, rd9.a, btsVar6), btsVar6, 24960, 2);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 7:
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    boolean k6 = btsVar7.k(tlsVar);
                    Object Q6 = btsVar7.Q();
                    if (k6 || Q6 == o430Var) {
                        Q6 = new zp5(27, tlsVar);
                        btsVar7.o0(Q6);
                    }
                    iab1.a(null, null, null, null, null, null, (sls) Q6, btsVar7, 0);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 8:
                bj6 bj6Var = (bj6) obj;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((bts) fidVar8).k(bj6Var) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                    f530 o = an91.o(bj6Var.a(c530Var, x4c.A), 8.0f, 0.0f, 0.0f, 8.0f, 6);
                    boolean k7 = btsVar8.k(tlsVar);
                    Object Q7 = btsVar8.Q();
                    if (k7 || Q7 == o430Var) {
                        Q7 = new zp5(28, tlsVar);
                        btsVar8.o0(Q7);
                    }
                    vpa1.a(o, false, ButtonSize.M, (sls) Q7, wwg.S(367939781, false, wt9.a, btsVar8), btsVar8, 24960, 2);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 9:
                bj6 bj6Var2 = (bj6) obj;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((bts) fidVar9).k(bj6Var2) ? 4 : 2;
                }
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                    f530 o2 = an91.o(bj6Var2.a(c530Var, x4c.A), 8.0f, 0.0f, 0.0f, 8.0f, 6);
                    boolean k8 = btsVar9.k(tlsVar);
                    Object Q8 = btsVar9.Q();
                    if (k8 || Q8 == o430Var) {
                        Q8 = new fv9(i4, tlsVar);
                        btsVar9.o0(Q8);
                    }
                    vpa1.a(o2, false, ButtonSize.M, (sls) Q8, wwg.S(367939781, false, bga.a, btsVar9), btsVar9, 24960, 2);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 10:
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    boolean k9 = btsVar10.k(tlsVar);
                    Object Q9 = btsVar10.Q();
                    if (k9 || Q9 == o430Var) {
                        Q9 = new fv9(i3, tlsVar);
                        btsVar10.o0(Q9);
                    }
                    iab1.a(null, null, null, null, null, null, (sls) Q9, btsVar10, 0);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 11:
                bj6 bj6Var3 = (bj6) obj;
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((bts) fidVar11).k(bj6Var3) ? 4 : 2;
                }
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                    f530 o3 = an91.o(bj6Var3.a(c530Var, x4c.A), 8.0f, 0.0f, 0.0f, 8.0f, 6);
                    boolean k10 = btsVar11.k(tlsVar);
                    Object Q10 = btsVar11.Q();
                    if (k10 || Q10 == o430Var) {
                        Q10 = new fv9(7, tlsVar);
                        btsVar11.o0(Q10);
                    }
                    vpa1.a(o3, false, ButtonSize.M, (sls) Q10, wwg.S(367939781, false, rha.a, btsVar11), btsVar11, 24960, 2);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 12:
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    boolean k11 = btsVar12.k(tlsVar);
                    Object Q11 = btsVar12.Q();
                    if (k11 || Q11 == o430Var) {
                        Q11 = new fv9(i2, tlsVar);
                        btsVar12.o0(Q11);
                    }
                    iab1.a(null, null, null, null, null, null, (sls) Q11, btsVar12, 0);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 13:
                tic ticVar4 = (tic) obj;
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((bts) fidVar13).k(ticVar4) ? 4 : 2;
                }
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue13 & 1, (intValue13 & 19) != 18)) {
                    boolean k12 = btsVar13.k(tlsVar);
                    Object Q12 = btsVar13.Q();
                    if (k12 || Q12 == o430Var) {
                        Q12 = new fv9(19, tlsVar);
                        btsVar13.o0(Q12);
                    }
                    vpa1.a(an91.o(ticVar4.a(x4c.G, c530Var), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, (sls) Q12, wwg.S(367939781, false, mob.a, btsVar13), btsVar13, 24960, 2);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 14:
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    boolean k13 = btsVar14.k(tlsVar);
                    Object Q13 = btsVar14.Q();
                    if (k13 || Q13 == o430Var) {
                        Q13 = new azd(r13 ? 1 : 0, tlsVar);
                        btsVar14.o0(Q13);
                    }
                    iab1.a(null, null, null, null, null, null, (sls) Q13, btsVar14, 0);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 15:
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    boolean k14 = btsVar15.k(tlsVar);
                    Object Q14 = btsVar15.Q();
                    if (k14 || Q14 == o430Var) {
                        Q14 = new azd(9, tlsVar);
                        btsVar15.o0(Q14);
                    }
                    iab1.a(null, null, null, null, null, null, (sls) Q14, btsVar15, 0);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 16:
                tlsVar.invoke(new wu60(((zvd0) obj2).c));
                return zy11Var;
            case 17:
                tic ticVar5 = (tic) obj;
                fid fidVar16 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((bts) fidVar16).k(ticVar5) ? 4 : 2;
                }
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue16 & 1, (intValue16 & 19) != 18)) {
                    boolean k15 = btsVar16.k(tlsVar);
                    Object Q15 = btsVar16.Q();
                    if (k15 || Q15 == o430Var) {
                        Q15 = new kiu(c == true ? 1 : 0, tlsVar);
                        btsVar16.o0(Q15);
                    }
                    vpa1.a(u3a1.d(an91.o(ticVar5.a(x4c.I, c530Var), 0.0f, 8.0f, 8.0f, 8.0f, 1), "modal_close_button"), false, ButtonSize.M, (sls) Q15, wwg.S(-771186319, false, liu.a, btsVar16), btsVar16, 24960, 2);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 18:
                fid fidVar17 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(intValue17 & 1, (intValue17 & 17) != 16)) {
                    au2 au2Var = wrb1.b;
                    if (au2Var == null) {
                        lgv lgvVar = new lgv("Copy", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(iq2.g);
                        uq90 uq90Var = new uq90();
                        uq90Var.j(8.0f, 20.0f);
                        uq90Var.g(2.0f);
                        uq90Var.e(0.96f, 0.0f, 1.58f, 0.0f, 2.05f, -0.03f);
                        uq90Var.n(0.63f, -0.09f, 0.72f, -0.12f);
                        uq90Var.b(2.0f, 2.0f, false, false, 1.08f, -1.08f);
                        uq90Var.e(0.03f, -0.09f, 0.09f, -0.26f, 0.12f, -0.72f);
                        uq90Var.i(0.02f, -2.05f);
                        uq90Var.e(-1.86f, 0.0f, -2.79f, 0.0f, -3.52f, -0.3f);
                        uq90Var.b(4.0f, 4.0f, false, true, -2.17f, -2.17f);
                        uq90Var.d(8.0f, 12.8f, 8.0f, 11.87f, 8.0f, 10.01f);
                        uq90Var.e(-0.71f, 0.0f, -1.83f, 0.0f, -2.05f, 0.02f);
                        uq90Var.e(-0.46f, 0.03f, -0.63f, 0.09f, -0.72f, 0.12f);
                        uq90Var.b(2.0f, 2.0f, false, false, -1.08f, 1.08f);
                        uq90Var.e(-0.03f, 0.09f, -0.09f, 0.26f, -0.12f, 0.72f);
                        uq90Var.d(4.0f, 12.42f, 4.0f, 13.05f, 4.0f, 14.0f);
                        uq90Var.p(2.0f);
                        uq90Var.e(0.0f, 0.96f, 0.0f, 1.58f, 0.03f, 2.05f);
                        uq90Var.n(0.09f, 0.63f, 0.12f, 0.72f);
                        uq90Var.b(2.0f, 2.0f, false, false, 1.08f, 1.08f);
                        uq90Var.e(0.09f, 0.03f, 0.26f, 0.09f, 0.72f, 0.12f);
                        uq90Var.e(0.47f, 0.03f, 1.1f, 0.03f, 2.05f, 0.03f);
                        uq90Var.j(8.0f, 8.0f);
                        uq90Var.e(-1.25f, 0.03f, -3.01f, 0.1f, -3.53f, 0.3f);
                        uq90Var.b(4.0f, 4.0f, false, false, -2.17f, 2.17f);
                        uq90Var.d(2.0f, 11.2f, 2.0f, 12.14f, 2.0f, 14.0f);
                        uq90Var.p(2.0f);
                        uq90Var.e(0.0f, 1.86f, 0.0f, 2.8f, 0.3f, 3.53f);
                        uq90Var.b(4.0f, 4.0f, false, false, 2.17f, 2.17f);
                        uq90Var.e(0.73f, 0.3f, 1.67f, 0.3f, 3.53f, 0.3f);
                        uq90Var.g(2.0f);
                        uq90Var.e(1.86f, 0.0f, 2.8f, 0.0f, 3.53f, -0.3f);
                        uq90Var.b(4.0f, 4.0f, false, false, 2.17f, -2.17f);
                        uq90Var.e(0.24f, -0.59f, 0.29f, -1.3f, 0.3f, -2.53f);
                        uq90Var.p(-1.0f);
                        uq90Var.e(1.86f, 0.0f, 2.8f, 0.0f, 3.53f, -0.3f);
                        uq90Var.b(4.0f, 4.0f, false, false, 2.16f, -2.17f);
                        uq90Var.e(0.3f, -0.73f, 0.3f, -1.67f, 0.3f, -3.53f);
                        uq90Var.o(8.0f);
                        uq90Var.e(0.0f, -1.86f, 0.0f, -2.8f, -0.3f, -3.53f);
                        uq90Var.b(4.0f, 4.0f, false, false, -2.16f, -2.17f);
                        uq90Var.d(18.79f, 2.0f, 17.86f, 2.0f, 16.0f, 2.0f);
                        uq90Var.g(-2.0f);
                        uq90Var.e(-1.87f, 0.0f, -2.8f, 0.0f, -3.53f, 0.3f);
                        uq90Var.a(4.0f, 4.0f, false, false, 8.3f, 4.47f);
                        uq90Var.d(8.0f, 5.2f, 8.0f, 6.14f, 8.0f, 8.0f);
                        uq90Var.k(8.0f, 6.0f);
                        uq90Var.g(-2.0f);
                        uq90Var.e(-0.96f, 0.0f, -1.58f, 0.0f, -2.05f, -0.03f);
                        uq90Var.b(2.0f, 2.0f, false, true, -0.72f, -0.12f);
                        uq90Var.b(2.0f, 2.0f, false, true, -1.08f, -1.08f);
                        uq90Var.b(2.0f, 2.0f, false, true, -0.12f, -0.72f);
                        uq90Var.d(10.0f, 11.58f, 10.0f, 10.95f, 10.0f, 10.0f);
                        uq90Var.o(8.0f);
                        uq90Var.e(0.0f, -0.96f, 0.0f, -1.58f, 0.03f, -2.05f);
                        uq90Var.n(0.09f, -0.63f, 0.12f, -0.72f);
                        uq90Var.b(2.0f, 2.0f, false, true, 1.08f, -1.08f);
                        uq90Var.e(0.09f, -0.03f, 0.26f, -0.09f, 0.72f, -0.12f);
                        uq90Var.d(12.42f, 4.0f, 13.04f, 4.0f, 14.0f, 4.0f);
                        uq90Var.g(2.0f);
                        uq90Var.e(0.96f, 0.0f, 1.58f, 0.0f, 2.05f, 0.03f);
                        uq90Var.n(0.63f, 0.09f, 0.71f, 0.12f);
                        uq90Var.b(2.0f, 2.0f, false, true, 1.09f, 1.08f);
                        uq90Var.e(0.03f, 0.09f, 0.08f, 0.26f, 0.11f, 0.72f);
                        uq90Var.e(0.04f, 0.47f, 0.04f, 1.1f, 0.04f, 2.05f);
                        uq90Var.p(2.0f);
                        uq90Var.e(0.0f, 0.96f, 0.0f, 1.58f, -0.04f, 2.05f);
                        uq90Var.e(-0.03f, 0.46f, -0.08f, 0.63f, -0.11f, 0.72f);
                        uq90Var.b(2.0f, 2.0f, false, true, -1.09f, 1.08f);
                        uq90Var.e(-0.08f, 0.03f, -0.25f, 0.09f, -0.71f, 0.12f);
                        uq90Var.e(-0.47f, 0.03f, -1.1f, 0.03f, -2.05f, 0.03f);
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
                        au2Var = rya1.a(lgvVar.d(), true);
                        wrb1.b = au2Var;
                    }
                    au2 au2Var2 = au2Var;
                    f530 k16 = an91.k(c530Var, 16.0f);
                    boolean k17 = btsVar17.k(tlsVar);
                    Object Q16 = btsVar17.Q();
                    if (k17 || Q16 == o430Var) {
                        Q16 = new kiu(i3, tlsVar);
                        btsVar17.o0(Q16);
                    }
                    sya1.a(au2Var2, q791.d(k16, false, null, null, (sls) Q16, 15), ohb1.e(btsVar17, kyh0.common_copy_to_clipboard), AppColor$Palette.Line, btsVar17, HProv.ALG_TYPE_SECURECHANNEL, 0);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 19:
                return b(obj, obj2, obj3);
            case 20:
                return d(obj, obj2, obj3);
            case 21:
                return e(obj, obj2, obj3);
            case 22:
                return f(obj, obj2, obj3);
            case 23:
                tlsVar.invoke(new vu41((String) obj, (String) obj2, ((Boolean) obj3).booleanValue()));
                return zy11Var;
            case 24:
                return g(obj, obj2, obj3);
            case 25:
                return i(obj, obj2, obj3);
            case 26:
                return j(obj, obj2, obj3);
            case 27:
                return k(obj, obj2, obj3);
            case 28:
                return l(obj, obj2, obj3);
            default:
                nvz0 nvz0Var = (nvz0) obj;
                fid fidVar18 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((bts) fidVar18).k(nvz0Var) ? 4 : 2;
                }
                bts btsVar18 = (bts) fidVar18;
                if (btsVar18.V(intValue18 & 1, (intValue18 & 19) != 18)) {
                    huz0.b(nvz0Var, null, this.b, btsVar18, intValue18 & 14, 1);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
        }
    }
}
