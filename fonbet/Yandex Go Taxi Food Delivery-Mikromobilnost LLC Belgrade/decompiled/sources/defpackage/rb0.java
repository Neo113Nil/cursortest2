package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.user_profile.ui.am.u;
import com.yandex.messaging.ui.settings.folder.addChat.i;
import com.yandex.passport.api.c;
import com.yandex.passport.api.c3;
import defpackage.bts;
import defpackage.cuj0;
import defpackage.did;
import defpackage.fid;
import defpackage.ldc;
import defpackage.mx00;
import defpackage.n4u0;
import defpackage.nx00;
import defpackage.ox00;
import defpackage.oz40;
import defpackage.qfc;
import defpackage.qti;
import defpackage.rr4;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tfx;
import defpackage.tls;
import defpackage.u3b1;
import defpackage.uq4;
import defpackage.vq4;
import defpackage.vr4;
import defpackage.w3b1;
import defpackage.wzg0;
import defpackage.xhc;
import defpackage.xq4;
import defpackage.xr4;
import defpackage.yfa;
import defpackage.zrf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.logistics.sdk.promotions.impl.ui.b;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes11.dex */
public final /* synthetic */ class rb0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ rb0(drm drmVar, crm crmVar, crm crmVar2, wls wlsVar, f530 f530Var, int i) {
        this.a = 24;
        this.b = crmVar;
        this.w = crmVar2;
        this.x = wlsVar;
        this.c = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        o430 o430Var = did.a;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xb0.a((f530) obj3, (tls) obj6, (sls) obj5, (i) obj4, (fid) obj, vng.O(385));
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                ki0.a((rh0) obj3, (String) obj5, (String) obj4, (tls) obj6, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                coa1.d((String) obj3, (hw0) obj5, (tls) obj6, (tls) obj4, (fid) obj, vng.O(3073));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                jpa1.c((z91) obj5, (f530) obj3, (yur) obj4, (tls) obj6, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                yx40 yx40Var = (yx40) obj6;
                oz40 oz40Var = (oz40) obj5;
                m3u0 m3u0Var = (m3u0) obj4;
                AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection = (AiWidgetEvaluationSwipeDirection) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                do1 do1Var = (do1) a.S(yx40Var.getIntValue(), (List) obj3);
                if (do1Var != null) {
                    oz40Var.setValue(do1Var);
                    ((zls) m3u0Var.getValue()).invoke(do1Var, aiWidgetEvaluationSwipeDirection, bool);
                    yx40Var.setIntValue(yx40Var.getIntValue() + 1);
                }
                return zy11Var;
            case 5:
                c cVar = (c) obj3;
                c3 c3Var = (c3) obj5;
                tls tlsVar = (tls) obj6;
                lz40 lz40Var = (lz40) obj4;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    cVar.a(null, c3Var, tlsVar, lz40Var, btsVar, 32768);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                ((u) obj3).b((Long) obj5, (String) obj4, (tls) obj6, (fid) obj, vng.O(1));
                return zy11Var;
            case 7:
                final xr4 xr4Var = (xr4) obj3;
                hwy0 hwy0Var = xr4Var.c;
                final rr4 rr4Var = (rr4) obj6;
                final Set set = (Set) obj5;
                final Set set2 = (Set) obj4;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qti.c(hwy0Var.c(btsVar2), hwy0Var.a, false, wwg.S(-1492861652, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.promotions.impl.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj7, Object obj8) {
                            mx00 mx00Var;
                            fid fidVar3 = (fid) obj7;
                            int intValue3 = ((Integer) obj8).intValue();
                            int i3 = 1;
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Object Q = btsVar3.Q();
                                final xr4 xr4Var2 = xr4Var;
                                Object obj9 = did.a;
                                if (Q == obj9) {
                                    Q = xr4Var2.b.i;
                                    btsVar3.o0(Q);
                                }
                                oz40 b = f.b((n4u0) Q, btsVar3);
                                btsVar3.e0(-120962628);
                                List<xq4> list = ((zrf0) b.getValue()).a;
                                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                                for (xq4 xq4Var : list) {
                                    boolean booleanValue = ((Boolean) btsVar3.m(qti.e)).booleanValue();
                                    boolean k = btsVar3.k(xq4Var);
                                    Object Q2 = btsVar3.Q();
                                    if (k || Q2 == obj9) {
                                        Q2 = new vr4(xq4Var, xr4Var2);
                                        btsVar3.o0(Q2);
                                    }
                                    sls slsVar = (sls) Q2;
                                    boolean k2 = btsVar3.k(xq4Var);
                                    Object Q3 = btsVar3.Q();
                                    if (k2 || Q3 == obj9) {
                                        Q3 = new vr4(xr4Var2, xq4Var, i3);
                                        btsVar3.o0(Q3);
                                    }
                                    sls slsVar2 = (sls) Q3;
                                    yfa yfaVar = xr4Var2.B;
                                    String str = xq4Var.a;
                                    vq4 vq4Var = xq4Var.d;
                                    u3b1 u3b1Var = vq4Var.g;
                                    w3b1 a = u3b1Var != null ? xr4Var2.C.a(u3b1Var, booleanValue) : null;
                                    String str2 = vq4Var.a;
                                    String str3 = vq4Var.b;
                                    qfc qfcVar = vq4Var.c;
                                    ldc e = qfcVar != null ? yfaVar.e(qfcVar, booleanValue) : null;
                                    qfc qfcVar2 = vq4Var.d;
                                    nx00 nx00Var = new nx00(a, str2, e, str3, qfcVar2 != null ? yfaVar.e(qfcVar2, booleanValue) : null, vq4Var.f);
                                    long j = xq4Var.b * 1000;
                                    uq4 uq4Var = vq4Var.e;
                                    if (uq4Var != null) {
                                        String str4 = uq4Var.a;
                                        qfc qfcVar3 = uq4Var.b;
                                        ldc e2 = qfcVar3 != null ? yfaVar.e(qfcVar3, booleanValue) : null;
                                        ldc e3 = yfaVar.e(uq4Var.c, booleanValue);
                                        mx00Var = new mx00(str4, e2, e3 != null ? new xhc(e3.a, null) : null, new cuj0(wzg0.ic_action_dots, null, null, null, 30), slsVar);
                                    } else {
                                        mx00Var = null;
                                    }
                                    arrayList.add(new ox00(str, nx00Var, j, mx00Var, slsVar2));
                                    i3 = 1;
                                }
                                final int i4 = 0;
                                btsVar3.t(false);
                                boolean z = ((zrf0) b.getValue()).b;
                                rr4 rr4Var2 = rr4.this;
                                Integer num = rr4Var2.a;
                                Integer num2 = rr4Var2.b;
                                Object Q4 = btsVar3.Q();
                                if (Q4 == obj9) {
                                    final Set set3 = set;
                                    Q4 = new tls() { // from class: wr4
                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj10) {
                                            b bVar;
                                            xbp0 xbp0Var;
                                            int i5 = i4;
                                            zy11 zy11Var2 = zy11.a;
                                            xr4 xr4Var3 = xr4Var2;
                                            Set set4 = set3;
                                            String str5 = (String) obj10;
                                            switch (i5) {
                                                case 0:
                                                    if (set4.add(str5)) {
                                                        b bVar2 = xr4Var3.y;
                                                        bVar2.c.b(str5);
                                                        xbp0 xbp0Var2 = bVar2.f;
                                                        if (xbp0Var2 != null) {
                                                            lr4 lr4Var = bVar2.d;
                                                            lr4Var.getClass();
                                                            lr4Var.b(lr4.a(xbp0Var2), "Shown", str5);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (set4.add(str5) && (xbp0Var = (bVar = xr4Var3.y).f) != null) {
                                                        lr4 lr4Var2 = bVar.d;
                                                        lr4Var2.getClass();
                                                        lr4Var2.b(lr4.a(xbp0Var), "AdTag.Shown", str5);
                                                        break;
                                                    }
                                                    break;
                                            }
                                            return zy11Var2;
                                        }
                                    };
                                    btsVar3.o0(Q4);
                                }
                                tls tlsVar2 = (tls) Q4;
                                Object Q5 = btsVar3.Q();
                                if (Q5 == obj9) {
                                    Object bannerCarouselViewImpl$Content$1$1$3$1 = new BannerCarouselViewImpl$Content$1$1$3$1(1, xr4Var2.y, b.class, "onTapped", "onTapped(Ljava/lang/String;)V", 0);
                                    btsVar3.o0(bannerCarouselViewImpl$Content$1$1$3$1);
                                    Q5 = bannerCarouselViewImpl$Content$1$1$3$1;
                                }
                                tls tlsVar3 = (tls) ((tfx) Q5);
                                Object Q6 = btsVar3.Q();
                                if (Q6 == obj9) {
                                    Object bannerCarouselViewImpl$Content$1$1$4$1 = new BannerCarouselViewImpl$Content$1$1$4$1(1, xr4Var2.y, b.class, "onRightScroll", "onRightScroll(Ljava/lang/String;)V", 0);
                                    btsVar3.o0(bannerCarouselViewImpl$Content$1$1$4$1);
                                    Q6 = bannerCarouselViewImpl$Content$1$1$4$1;
                                }
                                tls tlsVar4 = (tls) ((tfx) Q6);
                                Object Q7 = btsVar3.Q();
                                if (Q7 == obj9) {
                                    Object bannerCarouselViewImpl$Content$1$1$5$1 = new BannerCarouselViewImpl$Content$1$1$5$1(1, xr4Var2.y, b.class, "onLeftScroll", "onLeftScroll(Ljava/lang/String;)V", 0);
                                    btsVar3.o0(bannerCarouselViewImpl$Content$1$1$5$1);
                                    Q7 = bannerCarouselViewImpl$Content$1$1$5$1;
                                }
                                tls tlsVar5 = (tls) ((tfx) Q7);
                                Object Q8 = btsVar3.Q();
                                if (Q8 == obj9) {
                                    final Set set4 = set2;
                                    final int i5 = 1;
                                    Q8 = new tls() { // from class: wr4
                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj10) {
                                            b bVar;
                                            xbp0 xbp0Var;
                                            int i52 = i5;
                                            zy11 zy11Var2 = zy11.a;
                                            xr4 xr4Var3 = xr4Var2;
                                            Set set42 = set4;
                                            String str5 = (String) obj10;
                                            switch (i52) {
                                                case 0:
                                                    if (set42.add(str5)) {
                                                        b bVar2 = xr4Var3.y;
                                                        bVar2.c.b(str5);
                                                        xbp0 xbp0Var2 = bVar2.f;
                                                        if (xbp0Var2 != null) {
                                                            lr4 lr4Var = bVar2.d;
                                                            lr4Var.getClass();
                                                            lr4Var.b(lr4.a(xbp0Var2), "Shown", str5);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (set42.add(str5) && (xbp0Var = (bVar = xr4Var3.y).f) != null) {
                                                        lr4 lr4Var2 = bVar.d;
                                                        lr4Var2.getClass();
                                                        lr4Var2.b(lr4.a(xbp0Var), "AdTag.Shown", str5);
                                                        break;
                                                    }
                                                    break;
                                            }
                                            return zy11Var2;
                                        }
                                    };
                                    btsVar3.o0(Q8);
                                }
                                tls tlsVar6 = (tls) Q8;
                                Object Q9 = btsVar3.Q();
                                if (Q9 == obj9) {
                                    Q9 = new BannerCarouselViewImpl$Content$1$1$7$1(1, xr4Var2.y, b.class, "onAdTagTapped", "onAdTagTapped(Ljava/lang/String;)V", 0);
                                    btsVar3.o0(Q9);
                                }
                                tls tlsVar7 = (tls) ((tfx) Q9);
                                Object Q10 = btsVar3.Q();
                                if (Q10 == obj9) {
                                    Q10 = new BannerCarouselViewImpl$Content$1$1$8$1(1, xr4Var2.y, b.class, "onAutoScroll", "onAutoScroll(Ljava/lang/String;)V", 0);
                                    btsVar3.o0(Q10);
                                }
                                ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.b.d(arrayList, z, num, num2, tlsVar2, tlsVar3, tlsVar4, tlsVar5, tlsVar6, tlsVar7, (tls) ((tfx) Q10), btsVar3, 920346624);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar2), btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 4);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 8:
                f530 f530Var = (f530) obj3;
                oz40 oz40Var2 = (oz40) obj6;
                androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) obj5;
                androidx.compose.foundation.text.contextmenu.provider.a aVar2 = (androidx.compose.foundation.text.contextmenu.provider.a) obj4;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object Q = btsVar3.Q();
                    if (Q == o430Var) {
                        Q = new w5(10, oz40Var2);
                        btsVar3.o0(Q);
                    }
                    f530 y = eja1.y(f530Var, (tls) Q);
                    z910 d = pi6.d(x4c.b, true);
                    int hashCode = Long.hashCode(btsVar3.T);
                    r1b0 o = btsVar3.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar3, y);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, d);
                    qje.W(btsVar3, d.e, o);
                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar3, d.h);
                    qje.W(btsVar3, d.d, d2);
                    aVar.invoke(btsVar3, 0);
                    Object Q2 = btsVar3.Q();
                    if (Q2 == o430Var) {
                        Q2 = new w01(i2, oz40Var2);
                        btsVar3.o0(Q2);
                    }
                    aVar2.b((sls) Q2, btsVar3, 6);
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 9:
                j611 j611Var = (j611) obj3;
                ety0 ety0Var = (ety0) obj5;
                String str = (String) obj4;
                tls tlsVar2 = (tls) obj6;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    c530 c530Var = c530.a;
                    f530 o2 = an91.o(c530Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                    sic a = qic.a(lr20.c, x4c.G, btsVar4, 0);
                    int hashCode2 = Long.hashCode(btsVar4.T);
                    r1b0 o3 = btsVar4.o();
                    f530 d3 = androidx.compose.ui.b.d(btsVar4, o2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar2);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, a);
                    qje.W(btsVar4, d.e, o3);
                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar4, d.h);
                    qje.W(btsVar4, d.d, d3);
                    qgy.b(j611Var.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 0, 0, ety0Var, null, btsVar4, 805309440, 0, 11766);
                    if (str.length() > 0) {
                        btsVar4.e0(-1857903928);
                        jeb1.f(str, an91.o(c530Var, 0.0f, 3.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 2, false, 0, 0, null, xya1.e(btsVar4).h.a, btsVar4, 805306800, 0, 15864);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(-1857656641);
                        btsVar4.t(false);
                    }
                    u611 u611Var = j611Var.l;
                    if (u611Var == null) {
                        btsVar4.e0(-1857604438);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(-1857604437);
                        f530 o4 = an91.o(c530Var, 0.0f, 8.0f, 0.0f, 12.0f, 5);
                        boolean k = btsVar4.k(tlsVar2);
                        Object Q3 = btsVar4.Q();
                        if (k || Q3 == o430Var) {
                            Q3 = new a0(12, tlsVar2);
                            btsVar4.o0(Q3);
                        }
                        wkb1.d(u611Var, (tls) Q3, o4, btsVar4, 384);
                        boolean k2 = btsVar4.k(tlsVar2);
                        Object Q4 = btsVar4.Q();
                        if (k2 || Q4 == o430Var) {
                            Q4 = new sg0(4, tlsVar2);
                            btsVar4.o0(Q4);
                        }
                        wls wlsVar = (wls) Q4;
                        boolean k3 = btsVar4.k(tlsVar2);
                        Object Q5 = btsVar4.Q();
                        if (k3 || Q5 == o430Var) {
                            Q5 = new a0(13, tlsVar2);
                            btsVar4.o0(Q5);
                        }
                        wkb1.b(u611Var, wlsVar, (tls) Q5, null, btsVar4, 0);
                        boolean k4 = btsVar4.k(tlsVar2);
                        Object Q6 = btsVar4.Q();
                        if (k4 || Q6 == o430Var) {
                            Q6 = new o0(26, tlsVar2);
                            btsVar4.o0(Q6);
                        }
                        wkb1.c(u611Var, (sls) Q6, null, btsVar4, 0);
                        btsVar4.t(false);
                    }
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.a.a((l9e0) obj3, (zii0) obj6, (zii0) obj4, (sls) obj5, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.a.d((hz8) obj5, (f530) obj3, (tls) obj6, (tpr) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.b.g((CharSequence) obj6, (CharSequence) obj5, (ContentAlignment) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 13:
                ((Integer) obj2).getClass();
                zhb1.a((CharSequence) obj6, (CharSequence) obj5, (String) obj4, (f530) obj3, (fid) obj, vng.O(3073));
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                cib1.c((f530) obj3, (CharSequence) obj6, (CharSequence) obj5, (tn9) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.offer.ui.compose.ui.a.c((f530) obj3, (paa) obj5, (nc3) obj4, (tls) obj6, (fid) obj, vng.O(1));
                return zy11Var;
            case 16:
                ((Integer) obj2).getClass();
                xib1.a((dha) obj3, (z0a0) obj5, (String) obj4, (tls) obj6, (fid) obj, vng.O(1));
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                djb1.d((qla) obj3, (z0a0) obj5, (String) obj4, (tls) obj6, (fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                qpb1.a((zvd) obj5, (f530) obj3, (tls) obj6, (tls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui.b.c((e4e) obj3, (sls) obj5, (sls) obj6, (sls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                urb1.b((String) obj3, (wls) obj5, (String) obj4, (tls) obj6, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                osb1.a((ekj) obj3, (hoy0) obj5, (yur) obj4, (tls) obj6, (fid) obj, vng.O(385));
                return zy11Var;
            case 22:
                s0i s0iVar = (s0i) obj3;
                gbi gbiVar = (gbi) obj6;
                mai maiVar = (mai) obj5;
                qnh qnhVar = (qnh) obj4;
                View inflate = ((LayoutInflater) obj).inflate(hqh0.item_delivery_block_address_default, (ViewGroup) obj2, false);
                int i3 = deh0.call_icon;
                if (((GoImageView) cma1.O(i3, inflate)) != null) {
                    i3 = deh0.contact_group;
                    FrameLayout frameLayout = (FrameLayout) cma1.O(i3, inflate);
                    if (frameLayout != null) {
                        i3 = deh0.delivery_contact_autofill_bubble;
                        BubbleTextComponent bubbleTextComponent = (BubbleTextComponent) cma1.O(i3, inflate);
                        if (bubbleTextComponent != null) {
                            i3 = deh0.delivery_phone_select;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate);
                            if (robotoTextView != null) {
                                i3 = deh0.delivery_phone_subtitle_text;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, inflate);
                                if (robotoTextView2 != null) {
                                    i3 = deh0.delivery_point_address;
                                    ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i3, inflate);
                                    if (listItemComponent != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                        i3 = deh0.delivery_point_title;
                                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i3, inflate);
                                        if (robotoTextView3 != null) {
                                            return new rvh(new c1x(constraintLayout, frameLayout, bubbleTextComponent, robotoTextView, robotoTextView2, listItemComponent, constraintLayout, robotoTextView3), s0iVar, gbiVar, maiVar, qnhVar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 23:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.delivery_sdd_slots_selector.ui.b.a((vbu) obj3, (qws0) obj6, (bms) obj5, (wls) obj4, (fid) obj, vng.O(7));
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                mrm.a(null, (crm) obj6, (crm) obj5, (wls) obj4, (f530) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                yrm.e((String) obj6, (wls) obj5, (xjg) obj4, (f530) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 26:
                String str2 = (String) obj;
                ((tum) obj5).a((sum) obj2, ((Map) obj6).get(str2), (fq90) obj4, g8e.p((String) obj3, Extension.DOT_CHAR, str2));
                return zy11Var;
            case 27:
                ((Integer) obj2).getClass();
                oy91.b((fvm) obj3, (fvm) obj6, (sls) obj5, (sls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 28:
                ((Integer) obj2).getClass();
                ((u5r) obj3).a((d6r) obj4, (tls) obj6, (sls) obj5, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                tra1.a((m5f) obj6, (sls) obj5, (pa90) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ rb0(z91 z91Var, f530 f530Var, yur yurVar, tls tlsVar, int i) {
        this.a = 3;
        this.w = z91Var;
        this.c = f530Var;
        this.x = yurVar;
        this.b = tlsVar;
    }

    public /* synthetic */ rb0(int i, int i2, tls tlsVar, f530 f530Var, Object obj, Object obj2) {
        this.a = i2;
        this.w = obj;
        this.c = f530Var;
        this.b = tlsVar;
        this.x = obj2;
    }

    public /* synthetic */ rb0(u5r u5rVar, d6r d6rVar, tls tlsVar, sls slsVar, int i) {
        this.a = 28;
        this.c = u5rVar;
        this.x = d6rVar;
        this.b = tlsVar;
        this.w = slsVar;
    }

    public /* synthetic */ rb0(l9e0 l9e0Var, zii0 zii0Var, zii0 zii0Var2, sls slsVar, int i) {
        this.a = 10;
        this.c = l9e0Var;
        this.b = zii0Var;
        this.x = zii0Var2;
        this.w = slsVar;
    }

    public /* synthetic */ rb0(j611 j611Var, ety0 ety0Var, String str, tls tlsVar) {
        this.a = 9;
        this.c = j611Var;
        this.w = ety0Var;
        this.x = str;
        this.b = tlsVar;
    }

    public /* synthetic */ rb0(c cVar, c3 c3Var, tls tlsVar, lz40 lz40Var) {
        this.a = 5;
        this.c = cVar;
        this.w = c3Var;
        this.b = tlsVar;
        this.x = lz40Var;
    }

    public /* synthetic */ rb0(Object obj, f530 f530Var, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.w = obj2;
        this.x = obj3;
        this.c = f530Var;
    }

    public /* synthetic */ rb0(Object obj, Object obj2, cms cmsVar, cms cmsVar2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = cmsVar;
        this.x = cmsVar2;
    }

    public /* synthetic */ rb0(Object obj, Object obj2, Object obj3, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = tlsVar;
    }

    public /* synthetic */ rb0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    public /* synthetic */ rb0(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
        this.w = obj3;
        this.x = obj4;
    }
}
