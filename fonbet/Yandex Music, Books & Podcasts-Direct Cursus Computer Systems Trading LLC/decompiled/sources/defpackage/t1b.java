package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes4.dex */
public final /* synthetic */ class t1b implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t1b(qhe qheVar, vx6 vx6Var, y3 y3Var) {
        this.a = 13;
        this.b = qheVar;
        this.c = vx6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0372  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        o80 o80Var;
        m80 m80Var;
        x70 x70Var;
        int i;
        int i2 = this.a;
        yci yciVar = vci.a;
        o80 o80Var2 = 0;
        o80Var2 = 0;
        o80Var2 = 0;
        o80Var2 = 0;
        o80Var2 = 0;
        o80Var2 = 0;
        o80Var2 = 0;
        int i3 = 0;
        Object obj3 = gq5.a;
        int i4 = 1;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i2) {
            case 0:
                s1b s1bVar = (s1b) obj5;
                r1b r1bVar = (r1b) obj4;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                quj.o(s1bVar, r1bVar, null, hq5Var, 0);
            case 1:
                ((Integer) obj2).getClass();
                q6k.f((d2b) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 2:
                jmj jmjVar = (jmj) obj5;
                yci yciVar2 = (yci) obj4;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                ivf.g(jmjVar, yciVar2, true, null, hq5Var2, 384, 8);
            case 3:
                String str = (String) obj5;
                qo6 qo6Var = (qo6) obj4;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                irf.y(str, qo6Var, d.m(yciVar, 80), false, false, null, null, o5g.F(hq5Var3), hq5Var3, 384, 120);
            case 4:
                jzb jzbVar = (jzb) obj5;
                mn0 mn0Var = (mn0) obj4;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                bg3.a(null, null, false, ild.C(1116239421, new gab(i3, jzbVar, mn0Var), hq5Var4), hq5Var4, 3072, 7);
            case 5:
                sdr sdrVar = (sdr) obj5;
                Function2 function2 = (Function2) obj4;
                hq5 hq5Var5 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue & 1, (intValue & 3) != 2)) {
                    boolean f = oq5Var5.f(sdrVar);
                    Object K = oq5Var5.K();
                    if (f || K == obj3) {
                        K = new la1(sdrVar, 29);
                        oq5Var5.k0(K);
                    }
                    yci s = wyf.s(yciVar, (Function0) K);
                    kfh d = ug3.d(b2c.b, false);
                    int i5 = oq5Var5.P;
                    a l = oq5Var5.l();
                    yci H = vnj.H(oq5Var5, s);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    g0g.U(oq5Var5, d, wp5.f);
                    g0g.U(oq5Var5, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var5, i5, kb5Var);
                    }
                    g0g.U(oq5Var5, H, wp5.d);
                    function2.invoke(oq5Var5, 0);
                    oq5Var5.p(true);
                } else {
                    oq5Var5.S();
                }
                break;
            case 6:
                sdr sdrVar2 = (sdr) obj5;
                wn5 wn5Var = (wn5) obj4;
                hq5 hq5Var6 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean f2 = oq5Var6.f(sdrVar2);
                    Object K2 = oq5Var6.K();
                    if (f2 || K2 == obj3) {
                        K2 = new la1(sdrVar2, 28);
                        oq5Var6.k0(K2);
                    }
                    yci s2 = wyf.s(yciVar, (Function0) K2);
                    kfh d2 = ug3.d(b2c.b, false);
                    int i6 = oq5Var6.P;
                    a l2 = oq5Var6.l();
                    yci H2 = vnj.H(oq5Var6, s2);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var6.d0();
                    if (oq5Var6.O) {
                        oq5Var6.k(grbVar2);
                    } else {
                        oq5Var6.n0();
                    }
                    g0g.U(oq5Var6, d2, wp5.f);
                    g0g.U(oq5Var6, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var6, i6, kb5Var2);
                    }
                    g0g.U(oq5Var6, H2, wp5.d);
                    eta.l(0, wn5Var, oq5Var6, true);
                } else {
                    oq5Var6.S();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                bg3.f((vyb) obj5, (Function0) obj4, (hq5) obj, rvf.R(1));
                break;
            case 8:
                d7c d7cVar = (d7c) obj5;
                qne qneVar = (qne) obj4;
                hq5 hq5Var7 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (oq5Var7.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean f3 = oq5Var7.f(d7cVar) | oq5Var7.f(qneVar);
                    Object K3 = oq5Var7.K();
                    if (f3 || K3 == obj3) {
                        K3 = new e7c(d7cVar, qneVar);
                        oq5Var7.k0(K3);
                    }
                    xee.j((e7c) K3, null, oq5Var7, 0);
                } else {
                    oq5Var7.S();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                xee.j((e7c) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                etn.t((fvf) obj5, (jic) obj4, (hq5) obj, rvf.R(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                c3x.q(rvf.R(1), (hq5) obj, (yci) obj4, (Function1) obj5);
                break;
            case 12:
                sui suiVar = (sui) obj5;
                Album$AlbumType album$AlbumType = (Album$AlbumType) obj4;
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var8;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        break;
                    }
                }
                oq5 oq5Var9 = (oq5) hq5Var8;
                boolean f4 = oq5Var9.f(suiVar);
                Object K4 = oq5Var9.K();
                if (f4 || K4 == obj3) {
                    album$AlbumType.getClass();
                    String str2 = album$AlbumType.a;
                    K4 = new yrm(u2x.M(str2) ? R.drawable.ic_podcast_and_book_24 : R.drawable.ic_album_24, u2x.L(album$AlbumType) ? R.string.dialog_action_move_to_podcast : u2x.M(str2) ? R.string.dialog_action_move_to_book : R.string.dialog_action_move_to_album, "dialog_action_album", suiVar);
                    oq5Var9.k0(K4);
                }
                ivf.o((yrm) K4, suiVar, null, null, null, oq5Var9, 0, 28);
            case 13:
                qhe qheVar = (qhe) obj5;
                vx6 vx6Var = (vx6) obj4;
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var9;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                oq5 oq5Var11 = (oq5) hq5Var9;
                boolean f5 = oq5Var11.f(qheVar) | oq5Var11.f(vx6Var);
                Object K5 = oq5Var11.K();
                if (f5 || K5 == obj3) {
                    K5 = new lhe(qheVar, vx6Var);
                    oq5Var11.k0(K5);
                }
                i4w.b.invoke((lhe) K5, oq5Var11, 0);
            case 14:
                fle fleVar = (fle) obj5;
                yke ykeVar = (yke) obj4;
                hq5 hq5Var10 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var10;
                if (oq5Var12.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    lke lkeVar = (lke) gld.O(fleVar.c, oq5Var12).getValue();
                    if (lkeVar != null) {
                        oq5Var12.Z(1786732057);
                        oq5Var12.Z(-912191563);
                        yci d3 = d.d(yciVar, 1.0f);
                        if (lkeVar.d().contains(wke.a)) {
                            yciVar = androidx.compose.foundation.a.a(yciVar, jf0.E(oq5Var12));
                        }
                        yci f6 = d3.f(yciVar);
                        oq5Var12.p(false);
                        yci q = androidx.compose.foundation.layout.a.q(f6, 0.0f, 0.0f, 0.0f, 8, 7);
                        kfh d4 = ug3.d(b2c.b, false);
                        int i7 = oq5Var12.P;
                        a l3 = oq5Var12.l();
                        yci H3 = vnj.H(oq5Var12, q);
                        xp5.T.getClass();
                        grb grbVar3 = wp5.b;
                        oq5Var12.d0();
                        if (oq5Var12.O) {
                            oq5Var12.k(grbVar3);
                        } else {
                            oq5Var12.n0();
                        }
                        g0g.U(oq5Var12, d4, wp5.f);
                        g0g.U(oq5Var12, l3, wp5.e);
                        kb5 kb5Var3 = wp5.g;
                        if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i7))) {
                            ouj.x(i7, oq5Var12, i7, kb5Var3);
                        }
                        g0g.U(oq5Var12, H3, wp5.d);
                        i4w.l(ykeVar, vke.a, null, oq5Var12, 0);
                        oq5Var12.p(true);
                    } else {
                        oq5Var12.Z(1784930926);
                    }
                    oq5Var12.p(false);
                } else {
                    oq5Var12.S();
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                gld.u((lze) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 16:
                xli xliVar = (xli) obj5;
                gli gliVar = (gli) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str3 = (String) obj2;
                str3.getClass();
                xliVar.getClass();
                gliVar.getClass();
                ime imeVar = xliVar.a.s;
                imeVar.getClass();
                if (booleanValue) {
                    if (gliVar instanceof fki) {
                        fki fkiVar = (fki) gliVar;
                        o80Var = new o80(ot0.V(fkiVar), ot0.W(fkiVar), str3);
                    } else if (gliVar instanceof jki) {
                        jki jkiVar = (jki) gliVar;
                        if (!(jkiVar instanceof gki)) {
                            if (!(jkiVar instanceof hki)) {
                                if (!(jkiVar instanceof iki)) {
                                    b6e.s();
                                    break;
                                } else {
                                    m80Var = m80.c;
                                    x70Var = x70.PLAYLIST;
                                }
                            } else {
                                m80Var = m80.b;
                                x70Var = x70.ARTIST;
                            }
                        } else {
                            m80Var = m80.a;
                            x70Var = x70.ALBUM;
                        }
                        o80Var = new o80(new v70(x70Var, jkiVar.e(), jkiVar.a()), new l80(m80Var, jkiVar.e(), 1), str3);
                    } else if (gliVar instanceof eli) {
                        eli eliVar = (eli) gliVar;
                        o80Var = new o80(ot0.U((zii) eliVar.b().c, eliVar.a()), ot0.X(eliVar.b()), str3);
                    } else {
                        if (!(gliVar instanceof rji) && !(gliVar instanceof yji) && !(gliVar instanceof mki) && !(gliVar instanceof qki) && !(gliVar instanceof vki) && !(gliVar instanceof yki) && !(gliVar instanceof bli)) {
                            b6e.s();
                            break;
                        }
                        if (o80Var2 != 0) {
                            l80 l80Var = o80Var2.b;
                            nmb nmbVar = (nmb) imeVar.d;
                            pkb a0 = ime.a0(l80Var.a);
                            String str4 = l80Var.b;
                            int i8 = l80Var.c;
                            String G = ((fnb) imeVar.b).G();
                            wjb wjbVar = wjb.MusicHistoryScreen;
                            v70 v70Var = o80Var2.a;
                            w70 w70Var = v70Var.c;
                            nmb.p(nmbVar, G, wjbVar, null, null, null, null, null, a0, str4, 1, i8, w70Var.a.b(), w70Var.b, false, v70Var.a.a, v70Var.b, w70Var.c, 0, null, null, null, 0, o80Var2.c, 8134780);
                        }
                    }
                    o80Var2 = o80Var;
                    if (o80Var2 != 0) {
                    }
                }
                break;
            case 17:
                zdf zdfVar = (zdf) obj5;
                t36 t36Var = (t36) obj4;
                hq5 hq5Var11 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var11;
                if (oq5Var13.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean f7 = oq5Var13.f(zdfVar) | oq5Var13.f(t36Var);
                    Object K6 = oq5Var13.K();
                    if (f7 || K6 == obj3) {
                        K6 = new ydf(zdfVar, t36Var);
                        oq5Var13.k0(K6);
                    }
                    jf0.p((ydf) K6, null, oq5Var13, 0);
                } else {
                    oq5Var13.S();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                jf0.p((ydf) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                sff.a((vff) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 20:
                xff xffVar = (xff) obj5;
                dn9 dn9Var = (dn9) obj4;
                hq5 hq5Var12 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var12;
                if (oq5Var14.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean f8 = oq5Var14.f(xffVar) | oq5Var14.f(dn9Var);
                    Object K7 = oq5Var14.K();
                    if (f8 || K7 == obj3) {
                        K7 = new vff(dn9Var, xffVar);
                        oq5Var14.k0(K7);
                    }
                    sff.a((vff) K7, null, oq5Var14, 0);
                } else {
                    oq5Var14.S();
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                lg3.y((jgf) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                xv7.p((k2s) obj5, (Function2) obj4, (hq5) obj, rvf.R(1));
                break;
            case 23:
                wn5 wn5Var2 = (wn5) obj5;
                Object obj6 = (jkf) obj4;
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var15 = (oq5) hq5Var13;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        break;
                    }
                }
                oq5 oq5Var16 = (oq5) hq5Var13;
                Object K8 = oq5Var16.K();
                if (K8 == obj3) {
                    oq5Var16.k0(obj6);
                } else {
                    obj6 = K8;
                }
                vwb.u((jkf) obj6, wn5Var2, androidx.compose.ui.platform.a.a(yciVar, "landing_wave_block"), oq5Var16, 390);
            case 24:
                ((Float) obj).getClass();
                x97.y((mm6) obj5, null, null, new c90((fvf) obj4, ((Float) obj2).floatValue(), o80Var2, i4), 3);
                break;
            case 25:
                aqi aqiVar = (aqi) obj5;
                poi poiVar = (poi) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                if (floatValue >= 1.0f) {
                    aqiVar.setValue(Boolean.FALSE);
                }
                ((t6k) poiVar).h(floatValue);
                break;
            case 26:
                ((Integer) obj2).getClass();
                g0g.b((bci) obj5, (Function0) obj4, (hq5) obj, rvf.R(9));
                break;
            case 27:
                Album$AlbumType album$AlbumType2 = (Album$AlbumType) obj5;
                sui suiVar2 = (sui) obj4;
                hq5 hq5Var14 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var17 = (oq5) hq5Var14;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        break;
                    }
                }
                oq5 oq5Var18 = (oq5) hq5Var14;
                boolean d5 = oq5Var18.d(album$AlbumType2.ordinal()) | oq5Var18.f(suiVar2);
                Object K9 = oq5Var18.K();
                if (d5 || K9 == obj3) {
                    K9 = new i1g(suiVar2, album$AlbumType2);
                    oq5Var18.k0(K9);
                }
                ivf.o((i1g) K9, suiVar2, null, null, null, oq5Var18, 0, 28);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Album$AlbumType album$AlbumType3 = (Album$AlbumType) obj5;
                sui suiVar3 = (sui) obj4;
                hq5 hq5Var15 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var19 = (oq5) hq5Var15;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        break;
                    }
                }
                oq5 oq5Var20 = (oq5) hq5Var15;
                boolean d6 = oq5Var20.d(album$AlbumType3.ordinal()) | oq5Var20.f(suiVar3);
                Object K10 = oq5Var20.K();
                if (d6 || K10 == obj3) {
                    if (u2x.L(album$AlbumType3)) {
                        i = R.string.menu_element_like_podcast;
                    } else {
                        i = u2x.z(m20.NonMusic, album$AlbumType3.a) ? R.string.my_shelf_menu_like : R.string.menu_element_like;
                    }
                    K10 = new yrm(R.drawable.ic_like_unactive_24, i, "dialog_action_like", suiVar3);
                    oq5Var20.k0(K10);
                }
                ivf.o((yrm) K10, suiVar3, null, null, rvf.M(R.string.accessibility_check_action, oq5Var20), oq5Var20, 0, 12);
            default:
                w2g w2gVar = (w2g) obj5;
                qdc qdcVar = (qdc) obj4;
                hq5 hq5Var16 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var21 = (oq5) hq5Var16;
                if (oq5Var21.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean f9 = oq5Var21.f(w2gVar) | oq5Var21.f(qdcVar);
                    Object K11 = oq5Var21.K();
                    if (f9 || K11 == obj3) {
                        K11 = new j2g(w2gVar, qdcVar);
                        oq5Var21.k0(K11);
                    }
                    o2g.c((j2g) K11, null, oq5Var21, 0);
                } else {
                    oq5Var21.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ t1b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ t1b(fle fleVar, dle dleVar) {
        this.a = 14;
        this.b = fleVar;
        this.c = dleVar;
    }

    public /* synthetic */ t1b(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
