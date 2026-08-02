package defpackage;

import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.loading.b;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final /* synthetic */ class t8d implements zls {
    public final /* synthetic */ int a;

    public /* synthetic */ t8d(int i) {
        this.a = i;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c36 c36Var = null;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                u8d u8dVar = u8d.a;
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    b.a(ljs0.e(ljs0.q(c530Var, 230.0f), 27.0f), cyk0.c(100.0f), false, null, null, null, false, btsVar, 6, 252);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                u8d u8dVar2 = u8d.a;
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    jeb1.f(" ", ofb1.b(an91.m(c530Var, 14.0f, 0.0f, 2), false, null, 15), null, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, xya1.e(btsVar2).g.a, btsVar2, 54, 48, 14332);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                w8d w8dVar = w8d.a;
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    f530 m = ljs0.m(c530Var, 24.0f);
                    int i2 = q2h0.ic_alert;
                    AppColor$Palette appColor$Palette = AppColor$Palette.EverFront;
                    pa90 a = wya1.a(i2, 0, btsVar3);
                    if (appColor$Palette == null) {
                        btsVar3.e0(-1411607277);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-1411607276);
                        c36Var = tse0.e(tje.n(appColor$Palette, btsVar3), 5, btsVar3, false);
                    }
                    o4b1.b(a, null, m, null, null, 0.0f, c36Var, btsVar3, 392, 56);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                w8d w8dVar2 = w8d.a;
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    jeb1.f(ohb1.e(btsVar4, kyh0.mt_card_binding_error_retry_button), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar4).g.a, btsVar4, 0, 0, 16382);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                w8d w8dVar3 = w8d.a;
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    jeb1.f(ohb1.e(btsVar5, kyh0.mt_card_binding_error_close_button), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar5).g.b, btsVar5, 0, 0, 16382);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                x8d x8dVar = x8d.a;
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    au2 au2Var = qdb1.a;
                    if (au2Var == null) {
                        lgv lgvVar = new lgv("Cam", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(iq2.g);
                        uq90 e = nnm.e(7.0f, 2.0f);
                        e.b(5.0f, 5.0f, false, false, -5.0f, 5.0f);
                        e.p(2.0f);
                        e.g(2.0f);
                        e.h(4.0f, 7.0f);
                        e.b(3.0f, 3.0f, false, true, 3.0f, -3.0f);
                        e.g(2.0f);
                        e.h(9.0f, 2.0f);
                        e.c();
                        e.j(15.0f, 4.0f);
                        e.g(2.0f);
                        e.b(3.0f, 3.0f, false, true, 3.0f, 3.0f);
                        e.p(2.0f);
                        e.g(2.0f);
                        e.h(22.0f, 7.0f);
                        e.b(5.0f, 5.0f, false, false, -5.0f, -5.0f);
                        e.g(-2.0f);
                        e.c();
                        e.j(4.0f, 17.0f);
                        e.p(-2.0f);
                        e.h(2.0f, 15.0f);
                        e.p(2.0f);
                        e.b(5.0f, 5.0f, false, false, 5.0f, 5.0f);
                        e.g(2.0f);
                        e.p(-2.0f);
                        e.h(7.0f, 20.0f);
                        e.b(3.0f, 3.0f, false, true, -3.0f, -3.0f);
                        e.k(16.0f, -2.0f);
                        e.p(2.0f);
                        e.b(3.0f, 3.0f, false, true, -3.0f, 3.0f);
                        e.g(-2.0f);
                        e.p(2.0f);
                        e.g(2.0f);
                        e.b(5.0f, 5.0f, false, false, 5.0f, -5.0f);
                        e.p(-2.0f);
                        e.c();
                        e.j(15.0f, 12.0f);
                        e.b(3.0f, 3.0f, true, true, -6.0f, 0.0f);
                        e.b(3.0f, 3.0f, false, true, 6.0f, 0.0f);
                        e.k(2.0f, 0.0f);
                        e.b(5.0f, 5.0f, true, true, -10.0f, 0.0f);
                        e.b(5.0f, 5.0f, false, true, 10.0f, 0.0f);
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
                        au2Var = rya1.a(lgvVar.d(), true);
                        qdb1.a = au2Var;
                    }
                    sya1.a(au2Var, null, null, null, btsVar6, 384, 10);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                x8d x8dVar2 = x8d.a;
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    oeb1.c(btsVar7, ljs0.e(c530Var, 8.0f));
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 7:
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                x8d x8dVar3 = x8d.a;
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    oeb1.c(btsVar8, ljs0.e(c530Var, 12.0f));
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 8:
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                y8d y8dVar = y8d.a;
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    o4b1.b(mt71.m(f1h0.ic_location_fill_24, 0, btsVar9), ohb1.e(btsVar9, kyh0.menu_address_title), null, null, null, 0.0f, new c36(tje.n(AppColor$Palette.Text, btsVar9), 5), btsVar9, 8, 60);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 9:
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                b9d b9dVar = b9d.a;
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    f530 m2 = ljs0.m(c530Var, 24.0f);
                    int i3 = t2h0.ic_alert;
                    AppColor$Palette appColor$Palette2 = AppColor$Palette.EverFront;
                    pa90 a2 = wya1.a(i3, 0, btsVar10);
                    if (appColor$Palette2 == null) {
                        btsVar10.e0(-1411607277);
                        btsVar10.t(false);
                    } else {
                        btsVar10.e0(-1411607276);
                        c36Var = tse0.e(tje.n(appColor$Palette2, btsVar10), 5, btsVar10, false);
                    }
                    o4b1.b(a2, null, m2, null, null, 0.0f, c36Var, btsVar10, 392, 56);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 10:
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                b9d b9dVar2 = b9d.a;
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    jeb1.f(ohb1.e(btsVar11, cyh0.masstransit_trains_scan_qr_title), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar11).g.b, btsVar11, 0, 0, 16382);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 11:
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                f9d f9dVar = f9d.a;
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    o4b1.b(mt71.m(f1h0.ic_route, 0, btsVar12), ohb1.e(btsVar12, kyh0.route_on_the_map), null, null, null, 0.0f, new c36(tje.n(AppColor$Palette.Text, btsVar12), 5), btsVar12, 8, 60);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 12:
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                h9d h9dVar = h9d.a;
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    m791.d(false, false, btsVar13, 0);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 13:
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                i9d i9dVar = i9d.a;
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    o4b1.b(mt71.m(q2h0.ic_walk_16, 0, btsVar14), null, null, null, null, 0.0f, null, btsVar14, 56, HProv.PP_SAME_MEDIA);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 14:
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                k9d k9dVar = k9d.a;
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    so5 so5Var = x4c.G;
                    sic a3 = qic.a(lr20.c, so5Var, btsVar15, 0);
                    int hashCode = Long.hashCode(btsVar15.T);
                    r1b0 o = btsVar15.o();
                    f530 d = androidx.compose.ui.b.d(btsVar15, c530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar15.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar15.i0();
                    if (btsVar15.S) {
                        btsVar15.n(slsVar);
                    } else {
                        btsVar15.r0();
                    }
                    qje.W(btsVar15, d.f, a3);
                    qje.W(btsVar15, d.e, o);
                    qje.W(btsVar15, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar15, d.h);
                    qje.W(btsVar15, d.d, d);
                    b.a(ljs0.n(new ypu(so5Var), 100.0f, 20.0f), null, false, null, null, null, false, btsVar15, 0, 254);
                    b.a(an91.o(ljs0.n(new ypu(so5Var), 250.0f, 16.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), null, false, null, null, null, false, btsVar15, 0, 254);
                    btsVar15.t(true);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 15:
                fid fidVar16 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                l9d l9dVar = l9d.a;
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue16 & 1, (intValue16 & 17) != 16)) {
                    o4b1.b(vfc.k(e0h0.ic_live_tracking, 0, -1411607277, btsVar16, false), null, c530.a, null, null, 0.0f, null, btsVar16, 8, 56);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 16:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar17 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                l9d l9dVar2 = l9d.a;
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((bts) fidVar17).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(intValue17 & 1, (intValue17 & 19) != 18)) {
                    s8y.a(ibp0Var, null, btsVar17, intValue17 & 14, 1);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 17:
                fid fidVar18 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                m9d m9dVar = m9d.a;
                bts btsVar18 = (bts) fidVar18;
                if (!btsVar18.V(intValue18 & 1, (intValue18 & 17) != 16)) {
                    btsVar18.Y();
                }
                return zy11Var;
            case 18:
                fid fidVar19 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                o9d o9dVar = o9d.a;
                bts btsVar19 = (bts) fidVar19;
                if (btsVar19.V(intValue19 & 1, (intValue19 & 17) != 16)) {
                    b.a(ljs0.e(ljs0.q(c530Var, 212.0f), 20.0f), cyk0.c(100.0f), false, null, null, null, false, btsVar19, 6, 252);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 19:
                fid fidVar20 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                o9d o9dVar2 = o9d.a;
                bts btsVar20 = (bts) fidVar20;
                if (btsVar20.V(intValue20 & 1, (intValue20 & 17) != 16)) {
                    f530 m3 = ljs0.m(c530Var, 56.0f);
                    z910 d2 = pi6.d(x4c.y, false);
                    int hashCode2 = Long.hashCode(btsVar20.T);
                    r1b0 o2 = btsVar20.o();
                    f530 d3 = androidx.compose.ui.b.d(btsVar20, m3);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar20.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar20.i0();
                    if (btsVar20.S) {
                        btsVar20.n(slsVar2);
                    } else {
                        btsVar20.r0();
                    }
                    qje.W(btsVar20, d.f, d2);
                    qje.W(btsVar20, d.e, o2);
                    qje.W(btsVar20, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar20, d.h);
                    qje.W(btsVar20, d.d, d3);
                    b.a(ljs0.m(c530Var, 40.0f), null, false, null, null, null, false, btsVar20, 6, 254);
                    btsVar20.t(true);
                } else {
                    btsVar20.Y();
                }
                return zy11Var;
            case 20:
                fid fidVar21 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                o9d o9dVar3 = o9d.a;
                bts btsVar21 = (bts) fidVar21;
                if (btsVar21.V(intValue21 & 1, (intValue21 & 17) != 16)) {
                    b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 20.0f), cyk0.c(100.0f), false, null, null, null, false, btsVar21, 6, 252);
                } else {
                    btsVar21.Y();
                }
                return zy11Var;
            case 21:
                fid fidVar22 = (fid) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                y9d y9dVar = y9d.a;
                bts btsVar22 = (bts) fidVar22;
                if (btsVar22.V(intValue22 & 1, (intValue22 & 17) != 16)) {
                    oeb1.c(btsVar22, ljs0.e(c530Var, 12.0f));
                } else {
                    btsVar22.Y();
                }
                return zy11Var;
            case 22:
                fid fidVar23 = (fid) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                z9d z9dVar = z9d.a;
                bts btsVar23 = (bts) fidVar23;
                if (btsVar23.V(intValue23 & 1, (intValue23 & 17) != 16)) {
                    sya1.a(hgb1.b(), gpb1.f(btsVar23, c530Var), ohb1.e(btsVar23, xxh0.common_back), null, btsVar23, 0, 8);
                } else {
                    btsVar23.Y();
                }
                return zy11Var;
            case 23:
                fid fidVar24 = (fid) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                cad cadVar = cad.a;
                bts btsVar24 = (bts) fidVar24;
                if (btsVar24.V(intValue24 & 1, (intValue24 & 17) != 16)) {
                    jeb1.f(ohb1.e(btsVar24, kyh0.delete_card_dialog_cancel), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar24).g.b, btsVar24, 0, 0, 16382);
                } else {
                    btsVar24.Y();
                }
                return zy11Var;
            case 24:
                fid fidVar25 = (fid) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                cad cadVar2 = cad.a;
                bts btsVar25 = (bts) fidVar25;
                if (btsVar25.V(intValue25 & 1, (intValue25 & 17) != 16)) {
                    jeb1.f(ohb1.e(btsVar25, kyh0.settings_save), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar25).g.b, btsVar25, 0, 0, 16382);
                } else {
                    btsVar25.Y();
                }
                return zy11Var;
            case 25:
                bj6 bj6Var = (bj6) obj;
                fid fidVar26 = (fid) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                dad dadVar = dad.a;
                if ((intValue26 & 6) == 0) {
                    intValue26 |= ((bts) fidVar26).k(bj6Var) ? 4 : 2;
                }
                bts btsVar26 = (bts) fidVar26;
                if (btsVar26.V(intValue26 & 1, (intValue26 & 19) != 18)) {
                    ffb1.d(bj6Var.a(c530Var, x4c.y), null, null, btsVar26, 0, 6);
                } else {
                    btsVar26.Y();
                }
                return zy11Var;
            case 26:
                fid fidVar27 = (fid) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                gad gadVar = gad.a;
                bts btsVar27 = (bts) fidVar27;
                if (btsVar27.V(intValue27 & 1, (intValue27 & 17) != 16)) {
                    pi6.a(ljs0.m(c530Var, SlotSize.L.getSize()), btsVar27, 0);
                } else {
                    btsVar27.Y();
                }
                return zy11Var;
            case 27:
                fid fidVar28 = (fid) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                gad gadVar2 = gad.a;
                bts btsVar28 = (bts) fidVar28;
                if (btsVar28.V(intValue28 & 1, (intValue28 & 17) != 16)) {
                    sya1.a(w2b1.d(), ljs0.m(c530Var, 18.0f), null, AppColor$Palette.TextMinor, btsVar28, 3504, 0);
                } else {
                    btsVar28.Y();
                }
                return zy11Var;
            case 28:
                fid fidVar29 = (fid) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                jad jadVar = jad.a;
                bts btsVar29 = (bts) fidVar29;
                if (btsVar29.V(intValue29 & 1, (intValue29 & 17) != 16)) {
                    o4b1.b(mt71.m(dzg0.ic_arrow_left, 0, btsVar29), ohb1.e(btsVar29, kyh0.common_close), ljs0.m(c530Var, 24.0f), null, null, 0.0f, new c36(tje.n(AppColor$Palette.Text, btsVar29), 5), btsVar29, 392, 56);
                } else {
                    btsVar29.Y();
                }
                return zy11Var;
            default:
                fid fidVar30 = (fid) obj2;
                int intValue30 = ((Integer) obj3).intValue();
                jad jadVar2 = jad.a;
                bts btsVar30 = (bts) fidVar30;
                if (!btsVar30.V(intValue30 & 1, (intValue30 & 17) != 16)) {
                    btsVar30.Y();
                }
                return zy11Var;
        }
    }
}
