package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q2(ce ceVar, zpd zpdVar) {
        this.a = 21;
        this.b = zpdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v47 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        jlu jluVar;
        boolean z2;
        u9b u9bVar;
        String e;
        boolean z3 = false;
        int i = 0;
        switch (this.a) {
            case 0:
                zy zyVar = (zy) this.b;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean f = oq5Var2.f(zyVar);
                Object K = oq5Var2.K();
                if (f || K == gq5.a) {
                    K = new nbq(zyVar);
                    oq5Var2.k0(K);
                }
                ivf.o((nbq) K, zyVar, vci.a, null, null, oq5Var2, 384, 24);
                break;
            case 1:
                ((Integer) obj2).getClass();
                etn.a((t4) this.b, (hq5) obj, rvf.R(1));
                break;
            case 2:
                msj msjVar = (msj) this.b;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var2;
                boolean f2 = oq5Var4.f(msjVar);
                Object K2 = oq5Var4.K();
                if (f2 || K2 == gq5.a) {
                    K2 = new yrm(R.drawable.ic_add_tracks_24, R.string.playlist_add_tracks_to_current_playlist, "dialog_action_add_tracks", msjVar);
                    oq5Var4.k0(K2);
                }
                ivf.o((yrm) K2, msjVar, null, null, null, oq5Var4, 0, 28);
                break;
            case 3:
                klu kluVar = (klu) this.b;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                vci vciVar = vci.a;
                yci d = d.d(vciVar, 1.0f);
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var3, 0);
                oq5 oq5Var6 = (oq5) hq5Var3;
                int i2 = oq5Var6.P;
                a l = oq5Var6.l();
                yci H = vnj.H(hq5Var3, d);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var6.d0();
                if (oq5Var6.O) {
                    oq5Var6.k(grbVar);
                } else {
                    oq5Var6.n0();
                }
                g0g.U(hq5Var3, a, wp5.f);
                g0g.U(hq5Var3, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var6, i2, kb5Var);
                }
                g0g.U(hq5Var3, H, wp5.d);
                String str = kluVar.a;
                ges j = nu0.j();
                agr agrVar = eq0.a;
                oq5 oq5Var7 = (oq5) hq5Var3;
                xv7.j(str, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "wave_list_item_title"), ((dq0) oq5Var7.j(agrVar)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j, hq5Var3, 48, 3120, 55288);
                String str2 = kluVar.b;
                if (str2 == null || str2.length() == 0) {
                    z = false;
                    oq5Var6.Z(-1376169575);
                } else {
                    oq5Var6.Z(-1373328642);
                    u1g.l(hq5Var3, d.e(vciVar, mu0.a));
                    xv7.j(str2, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "wave_list_item_subtitle"), ((dq0) oq5Var7.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var3, 48, 3120, 55288);
                    z = false;
                }
                oq5Var6.p(z);
                oq5Var6.p(true);
                break;
            case 4:
                ((Integer) obj2).getClass();
                kg5.a((v40) this.b, (hq5) obj, rvf.R(1));
                break;
            case 5:
                qzm[] qzmVarArr = (qzm[]) this.b;
                ((Integer) obj2).getClass();
                oq5 oq5Var8 = (oq5) ((hq5) obj);
                oq5Var8.Z(-19073770);
                qzm[] qzmVarArr2 = (qzm[]) Arrays.copyOf(qzmVarArr, qzmVarArr.length);
                pz0 pz0Var = new pz0(2);
                ArrayList arrayList = pz0Var.a;
                qzm o = kkg.d.o(0, oq5Var8);
                qzm o2 = ajg.d.o(0, oq5Var8);
                qzm o3 = blg.d.o(0, oq5Var8);
                qzm o4 = pkg.d.o(0, oq5Var8);
                qzm o5 = alg.d.o(0, oq5Var8);
                qzm o6 = spg.d.o(0, oq5Var8);
                qs5 qs5Var = mpg.a;
                jyr jyrVar = ntp.e;
                oq5Var8.Z(-1726892970);
                if (((Boolean) oq5Var8.j(koe.a)).booleanValue()) {
                    jluVar = new jlu(false);
                    oq5Var8.p(false);
                } else {
                    Object K3 = oq5Var8.K();
                    if (K3 == gq5.a) {
                        ((vxb) ntp.e.getValue()).getClass();
                        l18 l18Var = l18.b;
                        bdt I = hag.I(byb.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        boolean h = ((ntp) ((byb) qdcVar.C(I)).c(ern.a(ntp.class))).h();
                        if (!h) {
                            if (h) {
                                b6e.s();
                                break;
                            } else {
                                z2 = false;
                                K3 = new jlu(false);
                            }
                        } else {
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar2 = l18Var.a;
                            qdcVar2.getClass();
                            K3 = new jlu(((ntp) ((byb) qdcVar2.C(I2)).c(ern.a(ntp.class))).h());
                            z2 = false;
                        }
                        oq5Var8.k0(K3);
                        z3 = z2;
                    }
                    jluVar = (jlu) K3;
                    oq5Var8.p(z3);
                    i = z3;
                }
                pz0Var.c(u75.h(o, o2, o3, o4, o5, o6, qs5Var.a(jluVar)).toArray(new qzm[i]));
                pz0Var.c(qzmVarArr2);
                qzm[] qzmVarArr3 = (qzm[]) arrayList.toArray(new qzm[arrayList.size()]);
                oq5Var8.p(i);
                break;
            case 6:
                t71 t71Var = (t71) this.b;
                hq5 hq5Var4 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var4;
                if (oq5Var9.P(intValue & 1, (intValue & 3) != 2)) {
                    boolean h2 = oq5Var9.h(t71Var);
                    Object K4 = oq5Var9.K();
                    if (h2 || K4 == gq5.a) {
                        zy zyVar2 = new zy(0, t71Var, t71.class, "onBackClick", "onBackClick()V", 0, 29);
                        oq5Var9.k0(zyVar2);
                        K4 = zyVar2;
                    }
                    zsd.g((Function0) ((h9f) K4), null, 0, 0L, 0, oq5Var9, 0, 30);
                } else {
                    oq5Var9.S();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ksw.g((ib1) this.b, (hq5) obj, rvf.R(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                c3x.r((wa1) this.b, (hq5) obj, rvf.R(1));
                break;
            case 9:
                eul eulVar = (eul) this.b;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var5;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                oq5 oq5Var11 = (oq5) hq5Var5;
                String str3 = (((Boolean) oq5Var11.j(koe.a)).booleanValue() || (u9bVar = eulVar.d) == null || (e = u9bVar.e(wct.s(), WebPath$Storage.AVATARS)) == null) ? "" : e;
                qo6 qo6Var = qo6.e;
                irf.y(str3, qo6Var, d.m(vci.a, qn6.b), false, false, null, null, irf.R(qo6Var, oq5Var11), oq5Var11, 432, 120);
                break;
            case 10:
                ug1 ug1Var = (ug1) this.b;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var12 = (oq5) hq5Var6;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        break;
                    }
                }
                yd5.c(ug1Var, null, hq5Var6, 0);
            case 11:
                i01 i01Var = (i01) this.b;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var13 = (oq5) hq5Var7;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        break;
                    }
                }
                xv7.a(i01Var, null, hq5Var7, 0);
            case 12:
                j76 j76Var = (j76) this.b;
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var8;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        break;
                    }
                }
                j76Var.getClass();
                oq5 oq5Var15 = (oq5) hq5Var8;
                oq5Var15.Z(565987853);
                jmj b = j76Var.e.b(bs4.h, j76Var.a, j76Var.b, j76Var.c, oq5Var15, 33280);
                oq5Var15.p(false);
                ivf.g(b, d.d(vci.a, 1.0f), false, hmj.b, hq5Var8, 3120, 4);
            case 13:
                xe1 xe1Var = (xe1) this.b;
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var9;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        break;
                    }
                }
                vq1.a(xe1Var, null, hq5Var9, 0);
            case 14:
                xn1 xn1Var = (xn1) this.b;
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var17 = (oq5) hq5Var10;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        break;
                    }
                }
                String str4 = xn1Var.e;
                if (str4 == null) {
                    oq5 oq5Var18 = (oq5) hq5Var10;
                    oq5Var18.Z(-715464328);
                    oq5Var18.p(false);
                } else {
                    oq5 oq5Var19 = (oq5) hq5Var10;
                    oq5Var19.Z(-715464327);
                    gdg.g(rvf.N(R.string.number_of_listeners_per_month_short, new Object[]{str4}, oq5Var19), null, 0L, null, oq5Var19, 0, 14);
                    oq5Var19.p(false);
                }
            case 15:
                ((Integer) obj2).getClass();
                bkp.I((dz1) this.b, (hq5) obj, rvf.R(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ot0.b((qn2) this.b, (hq5) obj, rvf.R(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                bkp.J((v83) this.b, (hq5) obj, rvf.R(1));
                break;
            case 18:
                ob3 ob3Var = (ob3) this.b;
                cb3 cb3Var = (cb3) obj;
                cb3 cb3Var2 = (cb3) obj2;
                if (cb3Var2 == null || (cb3Var2 instanceof wa3)) {
                    if (cb3Var instanceof wa3) {
                        if (cb3Var2 == null) {
                            break;
                        }
                    }
                    ob3Var.C.l(cb3Var);
                    break;
                }
                cb3Var = cb3Var2;
                ob3Var.C.l(cb3Var);
                break;
            case 19:
                sui suiVar = (sui) this.b;
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var20 = (oq5) hq5Var11;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        break;
                    }
                }
                oq5 oq5Var21 = (oq5) hq5Var11;
                boolean f3 = oq5Var21.f(suiVar);
                Object K5 = oq5Var21.K();
                if (f3 || K5 == gq5.a) {
                    K5 = new yrm(R.drawable.ic_close_mid_24, R.string.menu_element_cancel_download, "dialog_action_cancel_cache", suiVar);
                    oq5Var21.k0(K5);
                }
                ivf.o((yrm) K5, suiVar, null, null, null, oq5Var21, 0, 28);
                break;
            case 20:
                sui suiVar2 = (sui) this.b;
                hq5 hq5Var12 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var22 = (oq5) hq5Var12;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        break;
                    }
                }
                oq5 oq5Var23 = (oq5) hq5Var12;
                boolean f4 = oq5Var23.f(suiVar2);
                Object K6 = oq5Var23.K();
                if (f4 || K6 == gq5.a) {
                    K6 = new yrm(R.drawable.ic_download_24, R.string.dialog_action_download, "dialog_action_cache", suiVar2);
                    oq5Var23.k0(K6);
                }
                ivf.o((yrm) K6, suiVar2, null, null, null, oq5Var23, 0, 28);
                break;
            case 21:
                zpd zpdVar = (zpd) this.b;
                r04 r04Var = (r04) obj;
                f14 f14Var = (f14) obj2;
                r04Var.getClass();
                f14Var.getClass();
                g73 g73Var = new g73(r04Var.a().a, r04Var.a().b, new wn5(new m32(15, f14Var, zpdVar), -911779022, true), (cma) null, 24);
                String title = r04Var.getTitle();
                String description = r04Var.getDescription();
                r93 r93Var = new r93(11, f14Var);
                o43 b2 = r04Var.b();
                dqj Q = rzf.Q(g73Var, title, description, r93Var, szf.g0(Boolean.valueOf((b2 != null ? b2.a() : null) != null)), null, 48);
                xdr a2 = f14Var.a();
                a2.getClass();
                break;
            case 22:
                ((Integer) obj2).getClass();
                j66.i((u44) this.b, (hq5) obj, rvf.R(1));
                break;
            case 23:
                r34 r34Var = (r34) this.b;
                hq5 hq5Var13 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var24 = (oq5) hq5Var13;
                if (oq5Var24.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (r34Var.c) {
                        oq5Var24.Z(-1989148378);
                        x97.l(((dq0) oq5Var24.j(eq0.a)).a.a, oq5Var24, 0);
                    } else {
                        oq5Var24.Z(-1989147066);
                    }
                    oq5Var24.p(false);
                } else {
                    oq5Var24.S();
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                cxb.c((z74) this.b, (hq5) obj, rvf.R(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                h4a.d((vb4) this.b, (hq5) obj, rvf.R(1));
                break;
            case 26:
                eg4 eg4Var = (eg4) this.b;
                hq5 hq5Var14 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var25 = (oq5) hq5Var14;
                if (oq5Var25.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    bow.e(eg4Var, androidx.compose.ui.platform.a.a(vci.a, "chart_tracks_block"), oq5Var25, 48);
                } else {
                    oq5Var25.S();
                }
                break;
            case 27:
                i3 i3Var = (i3) this.b;
                mqs mqsVar = (mqs) obj;
                Function0 function0 = (Function0) obj2;
                mqsVar.getClass();
                function0.getClass();
                a0g.G(((bg4) i3Var.b).a, mqsVar, function0);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                rg4 rg4Var = (rg4) this.b;
                ywl ywlVar = (ywl) obj;
                ((Integer) obj2).getClass();
                ywlVar.getClass();
                sld sldVar = rg4Var.a;
                if (sldVar != null) {
                    oq oqVar = ywlVar.a.a;
                    oqVar.getClass();
                    ix6 ix6Var = (ix6) ((bw1) sldVar.b).d;
                    if (ix6Var != null) {
                        ff4 ff4Var = (ff4) ix6Var.b;
                        Context requireContext = ff4Var.requireContext();
                        requireContext.getClass();
                        ff4Var.startActivity(quj.T(requireContext, oqVar, ru.yandex.music.common.media.context.d.i()));
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qld.e((pu4) this.b, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ q2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ q2(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
