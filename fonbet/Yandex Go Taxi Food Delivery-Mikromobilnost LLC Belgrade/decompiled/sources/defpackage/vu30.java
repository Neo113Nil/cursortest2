package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.address.models.Address;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.ui.items.DefaultOfferHeaderView;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.road_events_layer.RoadEvent;
import com.ybsdk.feature.cashback.impl.views.OpenCashbackSelectorButtonView;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import com.ybsdk.widgets.common.TraceIdErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import java.util.List;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.masstransit.ui.routeinfo.a;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final /* synthetic */ class vu30 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ vu30(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        o061 iconsAdapter$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return Boolean.valueOf(z81.b((Address) obj, (Address) obj2));
            case 1:
                ((Integer) obj2).getClass();
                a.e((fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                return Boolean.valueOf(jl40.l(((py30) obj).b, ((py30) obj2).b));
            case 3:
                ((Integer) obj2).getClass();
                im91.a((fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                im91.b((fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                return Boolean.valueOf(jl40.l(((j940) obj).a, ((j940) obj2).a));
            case 6:
                return Boolean.valueOf(jl40.l(((fnx0) obj).e, ((fnx0) obj2).e));
            case 7:
                ((Integer) obj2).getClass();
                yqb1.b((fid) obj, vng.O(7));
                return zy11Var;
            case 8:
                ((Integer) obj).getClass();
                return ((wj50) obj2).c;
            case 9:
                return ((md51) obj).g(new x240(29, (vv50) obj2));
            case 10:
                View inflate = ((LayoutInflater) obj).inflate(uuh0.organizations_shimmering_item, (ViewGroup) obj2, false);
                if (inflate == null) {
                    ny61.t("rootView");
                    return null;
                }
                LinearLayout linearLayout = (LinearLayout) inflate;
                px6 px6Var = new px6(linearLayout, 2);
                m2y p = m2y.p(linearLayout);
                e760 e760Var = new e760(px6Var);
                ((PlaceholderView) p.d).setVisibility(0);
                ((PlaceholderView) p.e).setVisibility(0);
                ((PlaceholderView) p.b).setVisibility(0);
                return e760Var;
            case 11:
                View inflate2 = ((LayoutInflater) obj).inflate(clh0.offer_with_text_body_view_holder, (ViewGroup) obj2, false);
                int i2 = s8h0.body_button;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate2);
                if (robotoTextView != null) {
                    i2 = s8h0.header_layout;
                    DefaultOfferHeaderView defaultOfferHeaderView = (DefaultOfferHeaderView) cma1.O(i2, inflate2);
                    if (defaultOfferHeaderView != null) {
                        i2 = s8h0.text_body;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate2);
                        if (robotoTextView2 != null) {
                            b0b b0bVar = new b0b(new xt60((GoConstraintLayout) inflate2, robotoTextView, defaultOfferHeaderView, robotoTextView2), 8);
                            cvw.a0(c.h(100, b0bVar.a), robotoTextView);
                            return b0bVar;
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                return null;
            case 12:
                ((Boolean) obj2).getClass();
                return zy11Var;
            case 13:
                ((List) obj).addAll(v891.f((List) obj2));
                return zy11Var;
            case 14:
                ((List) obj).addAll(v891.f((List) obj2));
                return zy11Var;
            case 15:
                ((List) obj).addAll(v891.f((List) obj2));
                return zy11Var;
            case 16:
                RoadEvent roadEvent = (RoadEvent) obj;
                RoadEvent roadEvent2 = (RoadEvent) obj2;
                return Boolean.valueOf(jl40.l(roadEvent != null ? roadEvent.getId() : null, roadEvent2 != null ? roadEvent2.getId() : null));
            case 17:
                dvx dvxVar = (dvx) obj;
                dvx dvxVar2 = (dvx) obj2;
                return Boolean.valueOf(jl40.l(dvxVar, dvxVar2) && dvxVar.a() == dvxVar2.a());
            case 18:
                iconsAdapter$lambda$0 = OpenCashbackSelectorButtonView.iconsAdapter$lambda$0((LayoutInflater) obj, (ViewGroup) obj2);
                return iconsAdapter$lambda$0;
            case 19:
                String str = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (!jl40.l(str, "light")) {
                    if (jl40.l(str, "dark")) {
                        r2 = false;
                    } else {
                        if (str != null) {
                            l970.d(SdkUri$QueryParam.STATUSBAR_STYLE.getParamValue(), str);
                        }
                        r2 = booleanValue;
                    }
                }
                return Boolean.valueOf(r2);
            case 20:
                return Boolean.valueOf(ru.yandex.taxi.map.utils.a.p((BoundingBox) obj, (BoundingBox) obj2));
            case 21:
                return Integer.valueOf(((x910) obj).V(((Integer) obj2).intValue()));
            case 22:
                return Integer.valueOf(((x910) obj).k0(((Integer) obj2).intValue()));
            case 23:
                return Integer.valueOf(((x910) obj).V(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((x910) obj).k0(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((x910) obj).y(((Integer) obj2).intValue()));
            case 26:
                return Integer.valueOf(((x910) obj).e0(((Integer) obj2).intValue()));
            case 27:
                return Integer.valueOf(((x910) obj).e0(((Integer) obj2).intValue()));
            case 28:
                return Integer.valueOf(((x910) obj).y(((Integer) obj2).intValue()));
            default:
                View inflate3 = ((LayoutInflater) obj).inflate(poh0.ybsdk_item_paging_error, (ViewGroup) obj2, false);
                int i3 = fch0.errorButton;
                YbButtonView ybButtonView = (YbButtonView) cma1.O(i3, inflate3);
                if (ybButtonView != null) {
                    i3 = fch0.errorSubtitle;
                    TextView textView = (TextView) cma1.O(i3, inflate3);
                    if (textView != null) {
                        i3 = fch0.errorTitle;
                        TextView textView2 = (TextView) cma1.O(i3, inflate3);
                        if (textView2 != null) {
                            i3 = fch0.errorTraceId;
                            TraceIdErrorView traceIdErrorView = (TraceIdErrorView) cma1.O(i3, inflate3);
                            if (traceIdErrorView != null) {
                                i3 = fch0.textsHolder;
                                if (((LinearLayout) cma1.O(i3, inflate3)) != null) {
                                    return new g261((ConstraintLayout) inflate3, ybButtonView, textView, textView2, traceIdErrorView);
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i3)));
                return null;
        }
    }

    public /* synthetic */ vu30(int i, int i2) {
        this.a = i2;
    }
}
