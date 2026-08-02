package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.sharing_personal_goals.SharingPersonalGoalsProgressStyle;
import com.ybsdk.core.transfer.utils.UnconditionalWidget;
import com.ybsdk.widgets.common.StadiumButtonView;
import java.util.Calendar;
import ru.yandex.logistics.care.ui.e;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.TileStyle;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.scooters.presentation.finish_info.info.ScootersFinishInfoCard;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final /* synthetic */ class zhb0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ zhb0(g400 g400Var, CharSequence charSequence, String str, tls tlsVar, int i) {
        this.a = 17;
        this.c = g400Var;
        this.w = charSequence;
        this.b = str;
        this.x = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 createV1RecyclerViewAdapter$lambda$1$0;
        int i = this.a;
        int i2 = 7;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mn91.b((String) obj6, (String) obj5, (String) obj4, (bu8) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                e eVar = (e) obj4;
                bu8 bu8Var = (bu8) obj3;
                String str = (String) obj6;
                String str2 = (String) obj5;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    c530 c530Var = c530.a;
                    f530 k = an91.k(ljs0.c(c530Var, 1.0f), 16.0f);
                    sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, k);
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
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d);
                    f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), 56.0f);
                    a7u0 a7u0Var = qm51.a;
                    a.b(eVar, e, ((YandexShapes) btsVar.m(a7u0Var)).b(), 0L, 0L, null, null, null, false, null, null, null, wwg.S(-1125660992, true, new jk30(str, i2), btsVar), btsVar, 0, 384, 4088);
                    a.b(bu8Var, ljs0.e(ljs0.c(c530Var, 1.0f), 56.0f), ((YandexShapes) btsVar.m(a7u0Var)).b(), 0L, 0L, null, null, null, false, null, null, null, wwg.S(-1713513673, true, new jk30(str2, 8), btsVar), btsVar, 0, 384, 4088);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                g1a1.b((String) obj6, (String) obj5, (f530) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.a.a((yfe0) obj6, (sls) obj5, (sls) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                p0f0.b((f530) obj6, (t7k0) obj5, (sls) obj4, (sls) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                xnf0.a((uqf0) obj6, (f530) obj5, (qor) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                o9a1.c((f530) obj6, (a8a) obj5, (sls) obj4, (wls) obj3, (fid) obj, vng.O(71));
                return zy11Var;
            case 7:
                ((Integer) obj2).getClass();
                cra1.c((xuk0) obj6, (wg6) obj5, (f530) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                ut91.i((w2l0) obj6, (tls) obj5, (sls) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                createV1RecyclerViewAdapter$lambda$1$0 = ScootersFinishInfoCard.createV1RecyclerViewAdapter$lambda$1$0((ScootersFinishInfoCard) obj6, (pav) obj5, (wls) obj4, (tls) obj3, (ListItemComponent) obj, (emn0) obj2);
                return createV1RecyclerViewAdapter$lambda$1$0;
            case 10:
                ((Integer) obj2).getClass();
                n2b1.a((sun0) obj6, (tls) obj5, (yx40) obj4, (oip0) obj3, (fid) obj, vng.O(3079));
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items.a.e((lvi0) obj6, (yjp0) obj5, (CharSequence) obj4, (CharSequence) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                pav pavVar = (pav) obj6;
                k7x0 k7x0Var = (k7x0) obj5;
                c cVar = (c) obj4;
                tls tlsVar = (tls) obj3;
                View inflate = ((LayoutInflater) obj).inflate(bph0.address_clarification_content_item_selectable_option, (ViewGroup) obj2, false);
                if (inflate != null) {
                    return new ru.yandex.taxi.address.clarification.impl.ui.recycler.a(pavVar, k7x0Var, cVar, tlsVar, new ir0((ListItemComponent) inflate));
                }
                ny61.t("rootView");
                return null;
            case 13:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.common.selector.a.d((omq0) obj6, (f530) obj5, (tls) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.common.selector.a.b((mmq0) obj6, (f530) obj5, (tls) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                ccb1.d((Integer) obj6, (Integer) obj5, (SharingPersonalGoalsProgressStyle) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 16:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.dashboard.ui.widget.tile.a.c((x2y) obj6, (mcu) obj5, (t4z0) obj4, (TileStyle) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                xz91.a((g400) obj5, (CharSequence) obj4, (String) obj6, (tls) obj3, (fid) obj, vng.O(9));
                return zy11Var;
            case 18:
                hbp0 hbp0Var = (hbp0) obj6;
                ru.yandex.taxi.widget.utils.e eVar2 = (ru.yandex.taxi.widget.utils.e) obj5;
                tt2 tt2Var = (tt2) obj4;
                tls tlsVar2 = (tls) obj3;
                View inflate2 = ((LayoutInflater) obj).inflate(skh0.super_app_discovery_map_filter_item, (ViewGroup) obj2, false);
                int i3 = i8h0.icon;
                GoImageView goImageView = (GoImageView) cma1.O(i3, inflate2);
                if (goImageView != null) {
                    i3 = i8h0.title;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate2);
                    if (robotoTextView != null) {
                        return new com.yandex.go.superapp.discovery.map.impl.ui.main.filters.adapter.a(new auv0(goImageView, (GoLinearLayout) inflate2, robotoTextView), hbp0Var, eVar2, tt2Var, tlsVar2);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                return null;
            case 19:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.c.b((ob5) obj6, (ob5) obj5, (androidx.compose.foundation.lazy.b) obj4, (lz40) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.text_input_screen.ui.a.d((tpy0) obj6, (tls) obj5, (sls) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                g2z0.b((f530) obj6, (iqx) obj5, (wp2) obj4, (sls) obj3, (fid) obj, vng.O(3079));
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.communications.ticket.ui.component.b.i((f530) obj6, (Calendar) obj5, (Calendar) obj4, (f4z0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 23:
                f530 f530Var = (f530) obj6;
                wls wlsVar2 = (wls) obj5;
                to5 to5Var = x4c.E;
                wls wlsVar3 = (wls) obj4;
                wls wlsVar4 = (wls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    crb1.a(i9a1.f(m4m0.b(f530Var, ((ldc) btsVar2.m(k2z.b)).a, qke.q)), wlsVar2, to5Var, wlsVar3, to5Var, wlsVar4, to5Var, btsVar2, 0, 0);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                erb1.d((psz0) obj6, (f530) obj5, (yur) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                erb1.c((msz0) obj6, (f530) obj5, (yur) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.common.tooltip.a.a((String) obj6, (quz0) obj5, (f530) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(3073));
                return zy11Var;
            case 27:
                f530 f530Var2 = (f530) obj6;
                oz40 oz40Var = (oz40) obj5;
                androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) obj4;
                zls zlsVar = (zls) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object Q = btsVar3.Q();
                    if (Q == did.a) {
                        Q = new uny0(5, oz40Var);
                        btsVar3.o0(Q);
                    }
                    f530 y = eja1.y(f530Var2, (tls) Q);
                    z910 d2 = pi6.d(x4c.b, false);
                    int hashCode2 = Long.hashCode(btsVar3.T);
                    r1b0 o2 = btsVar3.o();
                    f530 d3 = b.d(btsVar3, y);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar2);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, d2);
                    qje.W(btsVar3, d.e, o2);
                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar3, d.h);
                    qje.W(btsVar3, d.d, d3);
                    aVar.invoke(cj6.a, btsVar3, 6);
                    jrb1.c(oz40Var, zlsVar, btsVar3, 6);
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 28:
                tj01 tj01Var = (tj01) obj6;
                tj01 tj01Var2 = (tj01) obj5;
                tj01 tj01Var3 = (tj01) obj4;
                tj01 tj01Var4 = (tj01) obj3;
                View inflate3 = ((LayoutInflater) obj).inflate(umh0.ybsdk_transfer_main_stadium_button, (ViewGroup) obj2, false);
                int i4 = mah0.stadiumButton;
                StadiumButtonView stadiumButtonView = (StadiumButtonView) cma1.O(i4, inflate3);
                if (stadiumButtonView != null) {
                    i4 = mah0.widgetView;
                    UnconditionalWidget unconditionalWidget = (UnconditionalWidget) cma1.O(i4, inflate3);
                    if (unconditionalWidget != null) {
                        x961 x961Var = new x961((ConstraintLayout) inflate3, stadiumButtonView, unconditionalWidget);
                        unconditionalWidget.setClickListener(new pxy0(22, tj01Var));
                        stadiumButtonView.onClick(new pxy0(23, tj01Var2));
                        stadiumButtonView.widgetWithToggleSpanEndOnClick(new pxy0(24, tj01Var3));
                        stadiumButtonView.widgetWithToggleSwitchOnClick(new pxy0(25, tj01Var4));
                        return x961Var;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i4)));
                return null;
            default:
                ((Integer) obj2).getClass();
                lub1.b((flq0) obj6, (androidx.compose.foundation.lazy.b) obj5, (tls) obj4, (bpl0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ zhb0(Object obj, Object obj2, Object obj3, cms cmsVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = cmsVar;
    }

    public /* synthetic */ zhb0(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    public /* synthetic */ zhb0(e eVar, bu8 bu8Var, String str, String str2) {
        this.a = 1;
        this.w = eVar;
        this.x = bu8Var;
        this.b = str;
        this.c = str2;
    }
}
