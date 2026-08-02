package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.d;
import com.yandex.go.ai_widget.ui.component.b;
import com.yandex.go.ai_widget.ui.component.e;
import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.icon.IconSpotStyle;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.requirements.comment.summary.ui.v3.ui.a;
import com.yandex.go.summary.ui.compose.common.bottomsheet.i;
import com.ybsdk.rconfig.configs.QrScannerGuidelinesConfigSchema;
import java.util.List;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes11.dex */
public final /* synthetic */ class t0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ t0(wj90 wj90Var, hfa0 hfa0Var, z0a0 z0a0Var, String str, tls tlsVar, sls slsVar, int i) {
        this.a = 10;
        this.b = wj90Var;
        this.w = hfa0Var;
        this.y = z0a0Var;
        this.x = str;
        this.z = tlsVar;
        this.c = slsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00de, code lost:
    
        if (defpackage.jl40.l(r1.Q(), java.lang.Integer.valueOf(r10)) == false) goto L27;
     */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        f530 c;
        f530 f530Var;
        boolean z;
        View O;
        zy11 zy11Var;
        int i = this.a;
        g43 g43Var = lr20.c;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        zy11 zy11Var2 = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        Object obj7 = this.w;
        Object obj8 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.b((f530) obj8, (c47) obj7, (String) obj6, (String) obj5, (qor) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 1:
                ((Integer) obj2).getClass();
                aka1.a((nvi0) obj7, (CharSequence) obj6, (wp2) obj5, (wp2) obj4, (f530) obj8, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 2:
                ((Integer) obj2).getClass();
                e.c((List) obj7, (b) obj6, (f530) obj8, (zls) obj5, (sls) obj3, (zls) obj4, (fid) obj, vng.O(196993));
                return zy11Var2;
            case 3:
                ((Integer) obj2).getClass();
                r0b1.a((nvi0) obj7, (f530) obj8, (IconSpotSize) obj6, (IconSpotStyle) obj5, (wls) obj4, (wls) obj3, (fid) obj, vng.O(221185));
                return zy11Var2;
            case 4:
                f530 f530Var2 = (f530) obj8;
                BadgeSize badgeSize = (BadgeSize) obj7;
                mm4 mm4Var = (mm4) obj6;
                l690 l690Var = (l690) obj5;
                androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) obj4;
                oz40 oz40Var = (oz40) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 a = ljs0.a(f530Var2, badgeSize.getSize(), badgeSize.getSize());
                    dm4 dm4Var = mm4Var.c;
                    boolean z2 = dm4Var instanceof cm4;
                    c530 c530Var2 = c530.a;
                    if (z2) {
                        btsVar.e0(-20757458);
                        btsVar.t(false);
                        c = c530Var2;
                        f530Var = c;
                    } else {
                        if (dm4Var instanceof bm4) {
                            btsVar.e0(-20755647);
                            c = hbb1.c(c530Var2, dbb1.a(btsVar), false, 0.0f, null, 14);
                            btsVar.t(false);
                        } else {
                            if (!(dm4Var instanceof am4)) {
                                throw unr0.y(-20759374, btsVar, false);
                            }
                            btsVar.e0(-20753217);
                            btsVar.t(false);
                            c = hbb1.c(c530Var2, igr0.a(jgr0.b, ((am4) dm4Var).a, 14), false, 0.0f, null, 14);
                        }
                        f530Var = c530Var2;
                    }
                    f530 k = a.k(c);
                    btsVar.e0(-643107460);
                    f530 b = m4m0.b(f530Var, ((ldc) btsVar.m(k2z.b)).a, cyk0.a);
                    btsVar.t(false);
                    f530 j = an91.j(k.k(b), l690Var);
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar, j);
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
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d2);
                    Object Q = btsVar.Q();
                    if (Q == o430Var) {
                        Q = new yl4(oz40Var);
                        btsVar.o0(Q);
                    }
                    aVar.invoke((yl4) Q, btsVar, 6);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            case 5:
                g611 g611Var = (g611) obj8;
                ety0 ety0Var = (ety0) obj7;
                ib11 ib11Var = (ib11) obj6;
                oz40 oz40Var2 = (oz40) obj5;
                ety0 ety0Var2 = (ety0) obj4;
                oz40 oz40Var3 = (oz40) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sic a2 = qic.a(g43Var, x4c.G, btsVar2, 0);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    f530 d3 = androidx.compose.ui.b.d(btsVar2, c530Var);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar2);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a2);
                    qje.W(btsVar2, d.e, o2);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d3);
                    qgy.b(g611Var.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 0, 0, ety0Var, null, btsVar2, 805309440, 0, 11766);
                    if (g611Var.d == null) {
                        btsVar2.e0(1069512024);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(1069512025);
                        oeb1.c(btsVar2, ljs0.e(c530Var, 16.0f));
                        Object Q2 = btsVar2.Q();
                        if (Q2 == o430Var) {
                            Q2 = new w5(13, oz40Var2);
                            btsVar2.o0(Q2);
                        }
                        ptb1.b(ib11Var, true, eja1.y(c530Var, (tls) Q2), null, true, null, g611Var.e, null, null, null, btsVar2, 25008, 936);
                        btsVar2.t(false);
                    }
                    String str = g611Var.f;
                    Integer num = g611Var.g;
                    if (str == null || num == null) {
                        z = false;
                        btsVar2.e0(1281450809);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(1281445359);
                        str = ohb1.d(kyh0.mobility_hub_multimodality_scooter_price_amount, new Object[]{"~".concat(str), String.valueOf(num.intValue())}, btsVar2);
                        z = false;
                        btsVar2.t(false);
                    }
                    String str2 = str;
                    if (str2 == null) {
                        btsVar2.e0(1070316040);
                        btsVar2.t(z);
                    } else {
                        btsVar2.e0(1070316041);
                        oeb1.c(btsVar2, ljs0.e(c530Var, 8.0f));
                        Object Q3 = btsVar2.Q();
                        if (Q3 == o430Var) {
                            Q3 = new w5(14, oz40Var3);
                            btsVar2.o0(Q3);
                        }
                        jeb1.f(str2, eja1.y(c530Var, (tls) Q3), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var2, btsVar2, 432, 0, 16376);
                        btsVar2.t(false);
                    }
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var2;
            case 6:
                ety0 ety0Var3 = (ety0) obj8;
                j611 j611Var = (j611) obj7;
                ib11 ib11Var2 = (ib11) obj6;
                oz40 oz40Var4 = (oz40) obj5;
                ety0 ety0Var4 = (ety0) obj4;
                oz40 oz40Var5 = (oz40) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    c530 c530Var3 = c530.a;
                    f530 o3 = an91.o(c530Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                    sic a3 = qic.a(g43Var, x4c.G, btsVar3, 0);
                    int hashCode3 = Long.hashCode(btsVar3.T);
                    r1b0 o4 = btsVar3.o();
                    f530 d4 = androidx.compose.ui.b.d(btsVar3, o3);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar3);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, a3);
                    qje.W(btsVar3, d.e, o4);
                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar3, d.h);
                    qje.W(btsVar3, d.d, d4);
                    jeb1.f(ohb1.e(btsVar3, kyh0.mobility_hub_multimodality_taxi), null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 2, false, 0, 0, null, ety0Var3, btsVar3, 805306752, 0, 15866);
                    oeb1.c(btsVar3, ljs0.e(c530Var3, 16.0f));
                    Object Q4 = btsVar3.Q();
                    if (Q4 == o430Var) {
                        Q4 = new w5(16, oz40Var4);
                        btsVar3.o0(Q4);
                    }
                    ptb1.b(ib11Var2, true, eja1.y(c530Var3, (tls) Q4), null, true, null, j611Var.h, null, new ldc(yj5.a), null, btsVar3, 100688304, QrScannerGuidelinesConfigSchema.MIN_SCREEN_HEIGHT_TO_SHOW_GUIDELINES);
                    String str3 = j611Var.i;
                    if (str3 == null) {
                        btsVar3.e0(-545054223);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-545054222);
                        oeb1.c(btsVar3, ljs0.e(c530Var3, 8.0f));
                        Object Q5 = btsVar3.Q();
                        if (Q5 == o430Var) {
                            Q5 = new w5(17, oz40Var5);
                            btsVar3.o0(Q5);
                        }
                        jeb1.f(ohb1.d(kyh0.scooters_offer_card_v2_a11y_tariff_price, new Object[]{str3}, btsVar3), eja1.y(c530Var3, (tls) Q5), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 2, false, 0, 0, null, ety0Var4, btsVar3, 805306800, 0, 15864);
                        btsVar3.t(false);
                    }
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var2;
            case 7:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.a.a((f530) obj8, (jj2) obj7, (ButtonSize) obj6, (gz6) obj5, (ButtonForm) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(196993));
                return zy11Var2;
            case 8:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui.a.c((String) obj6, (String) obj5, (String) obj8, (tls) obj7, (sls) obj3, (tls) obj4, (fid) obj, vng.O(1));
                return zy11Var2;
            case 9:
                ((Integer) obj2).getClass();
                pqb1.a((f530) obj8, (v3y0) obj7, (zr40) obj6, (z0a0) obj5, (lz6) obj4, (tls) obj3, (fid) obj, vng.O(577));
                return zy11Var2;
            case 10:
                ((Integer) obj2).getClass();
                iub1.a((wj90) obj8, (hfa0) obj7, (z0a0) obj5, (String) obj6, (tls) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 11:
                pav pavVar = (pav) obj8;
                xvq xvqVar = (xvq) obj7;
                tls tlsVar = (tls) obj6;
                Integer num2 = (Integer) obj5;
                Integer num3 = (Integer) obj4;
                Integer num4 = (Integer) obj3;
                View inflate = ((LayoutInflater) obj).inflate(uuh0.organizations_preview_image_item, (ViewGroup) obj2, false);
                int i2 = o6h0.icon;
                GoImageView goImageView = (GoImageView) cma1.O(i2, inflate);
                if (goImageView != null && (O = cma1.O((i2 = o6h0.icon_bg), inflate)) != null) {
                    i2 = o6h0.image;
                    GoImageView goImageView2 = (GoImageView) cma1.O(i2, inflate);
                    if (goImageView2 != null) {
                        i2 = o6h0.loading_bar;
                        PlaceholderView placeholderView = (PlaceholderView) cma1.O(i2, inflate);
                        if (placeholderView != null) {
                            i2 = o6h0.retry_icon;
                            GoImageView goImageView3 = (GoImageView) cma1.O(i2, inflate);
                            if (goImageView3 != null) {
                                return new com.yandex.go.places.impl.ui.organizations.recycler.viewholders.images.a(new ap80((GoFrameLayout) inflate, goImageView, O, goImageView2, placeholderView, goImageView3), pavVar, xvqVar, tlsVar, num2, num3, num4);
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 12:
                ((Integer) obj2).getClass();
                mn91.a((String) obj6, (String) obj5, (String) obj8, (String) obj7, (bu8) obj4, (ru.yandex.logistics.care.ui.e) obj3, (fid) obj, vng.O(1));
                return zy11Var2;
            case 13:
                ((Integer) obj2).getClass();
                d9b1.b((String) obj6, (String) obj5, (String) obj7, (sls) obj3, (sls) obj4, (f530) obj8, (fid) obj, vng.O(1));
                return zy11Var2;
            case 14:
                ((Integer) obj2).getClass();
                i.e((jtz0) obj7, (qor) obj4, (wg6) obj6, (yur) obj5, (tls) obj3, (f530) obj8, (fid) obj, vng.O(1));
                return zy11Var2;
            case 15:
                oz40 oz40Var6 = (oz40) obj8;
                m3u0 m3u0Var = (m3u0) obj7;
                m3u0 m3u0Var2 = (m3u0) obj6;
                m3u0 m3u0Var3 = (m3u0) obj5;
                androidx.compose.runtime.internal.a aVar2 = (androidx.compose.runtime.internal.a) obj4;
                ovz0 ovz0Var = (ovz0) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                boolean V = btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2);
                dmw0 dmw0Var = btsVar4.a;
                if (!V) {
                    btsVar4.Y();
                    return zy11Var2;
                }
                Object Q6 = btsVar4.Q();
                if (Q6 == o430Var) {
                    Q6 = new uny0(4, oz40Var6);
                    btsVar4.o0(Q6);
                }
                f530 y = eja1.y(c530Var, (tls) Q6);
                uo5 uo5Var = x4c.b;
                z910 d5 = pi6.d(uo5Var, false);
                int S = cma1.S(btsVar4);
                r1b0 o5 = btsVar4.o();
                f530 d6 = androidx.compose.ui.b.d(btsVar4, y);
                ohd.G1.getClass();
                sls slsVar4 = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar4.i0();
                if (btsVar4.S) {
                    btsVar4.n(slsVar4);
                } else {
                    btsVar4.r0();
                }
                wls wlsVar = d.f;
                qje.W(btsVar4, wlsVar, d5);
                wls wlsVar2 = d.e;
                qje.W(btsVar4, wlsVar2, o5);
                wls wlsVar3 = d.g;
                if (!btsVar4.S) {
                    zy11Var = zy11Var2;
                    break;
                } else {
                    zy11Var = zy11Var2;
                }
                b64.z(S, btsVar4, S, wlsVar3);
                wls wlsVar4 = d.d;
                qje.W(btsVar4, wlsVar4, d6);
                btsVar4.c0(-1350495383, Integer.valueOf(((Number) m3u0Var3.getValue()).intValue()));
                boolean k2 = btsVar4.k(m3u0Var) | btsVar4.k(m3u0Var2);
                Object Q7 = btsVar4.Q();
                if (k2 || Q7 == o430Var) {
                    Q7 = new gex0(m3u0Var, m3u0Var2, 1);
                    btsVar4.o0(Q7);
                }
                f530 a4 = androidx.compose.ui.graphics.d.a(c530Var, (tls) Q7);
                z910 d7 = pi6.d(uo5Var, false);
                int S2 = cma1.S(btsVar4);
                r1b0 o6 = btsVar4.o();
                f530 d8 = androidx.compose.ui.b.d(btsVar4, a4);
                btsVar4.i0();
                if (btsVar4.S) {
                    btsVar4.n(slsVar4);
                } else {
                    btsVar4.r0();
                }
                qje.W(btsVar4, wlsVar, d7);
                qje.W(btsVar4, wlsVar2, o6);
                if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(S2))) {
                    b64.z(S2, btsVar4, S2, wlsVar3);
                }
                qje.W(btsVar4, wlsVar4, d8);
                aVar2.invoke(ovz0Var, btsVar4, 6);
                btsVar4.t(true);
                btsVar4.t(false);
                btsVar4.t(true);
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                ((h701) obj8).a((qkg) obj7, (qkg) obj6, (zvz0) obj5, (tls) obj4, (tls) obj3, (fid) obj, vng.O(27649));
                return zy11Var2;
        }
    }

    public /* synthetic */ t0(nvi0 nvi0Var, f530 f530Var, IconSpotSize iconSpotSize, IconSpotStyle iconSpotStyle, wls wlsVar, wls wlsVar2, int i) {
        this.a = 3;
        this.w = nvi0Var;
        this.b = f530Var;
        this.x = iconSpotSize;
        this.y = iconSpotStyle;
        this.z = wlsVar;
        this.c = wlsVar2;
    }

    public /* synthetic */ t0(nvi0 nvi0Var, CharSequence charSequence, wp2 wp2Var, wp2 wp2Var2, f530 f530Var, sls slsVar, int i) {
        this.a = 1;
        this.w = nvi0Var;
        this.x = charSequence;
        this.y = wp2Var;
        this.z = wp2Var2;
        this.b = f530Var;
        this.c = slsVar;
    }

    public /* synthetic */ t0(jtz0 jtz0Var, qor qorVar, wg6 wg6Var, yur yurVar, tls tlsVar, f530 f530Var, int i) {
        this.a = 14;
        this.w = jtz0Var;
        this.z = qorVar;
        this.x = wg6Var;
        this.y = yurVar;
        this.c = tlsVar;
        this.b = f530Var;
    }

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, cms cmsVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.z = obj5;
        this.c = cmsVar;
    }

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.z = obj5;
        this.c = obj6;
    }

    public /* synthetic */ t0(String str, String str2, String str3, sls slsVar, sls slsVar2, f530 f530Var, int i) {
        this.a = 13;
        this.x = str;
        this.y = str2;
        this.w = str3;
        this.c = slsVar;
        this.z = slsVar2;
        this.b = f530Var;
    }

    public /* synthetic */ t0(String str, String str2, String str3, tls tlsVar, sls slsVar, tls tlsVar2, int i) {
        this.a = 8;
        this.x = str;
        this.y = str2;
        this.b = str3;
        this.w = tlsVar;
        this.c = slsVar;
        this.z = tlsVar2;
    }

    public /* synthetic */ t0(String str, String str2, String str3, String str4, bu8 bu8Var, ru.yandex.logistics.care.ui.e eVar, int i) {
        this.a = 12;
        this.x = str;
        this.y = str2;
        this.b = str3;
        this.w = str4;
        this.z = bu8Var;
        this.c = eVar;
    }

    public /* synthetic */ t0(List list, b bVar, f530 f530Var, zls zlsVar, sls slsVar, zls zlsVar2, int i) {
        this.a = 2;
        this.w = list;
        this.x = bVar;
        this.b = f530Var;
        this.y = zlsVar;
        this.c = slsVar;
        this.z = zlsVar2;
    }
}
