package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.lazy.grid.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.mapkit.geometry.Point;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import java.util.Map;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.favorites.list.ui.HeaderView;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.plus.badge.CashbackHorizontalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes14.dex */
public final /* synthetic */ class w9u implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ w9u(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        View O;
        int i = this.a;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                p2x p2xVar = ((q2x) obj2).b;
                HeaderView headerView = ((x9u) obj).R;
                headerView.setTitle(p2xVar.a);
                CharSequence charSequence = p2xVar.b;
                if (charSequence == null || evu0.J(charSequence)) {
                    headerView.hideBadge();
                } else {
                    headerView.showBadge(charSequence);
                }
                return zy11Var;
            case 1:
                return Boolean.valueOf(!jl40.l(((q2x) obj).c, ((q2x) obj2).c));
            case 2:
                ((x9u) obj).R.setSubtitle(((q2x) obj2).c);
                return zy11Var;
            case 3:
                View inflate = ((LayoutInflater) obj).inflate(zjh0.scooters_zones_legend_header_item, (ViewGroup) obj2, false);
                int i3 = p7h0.description_text_view;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate);
                if (robotoTextView != null) {
                    i3 = p7h0.title_text_view;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, inflate);
                    if (robotoTextView2 != null) {
                        return new b0b(new kap0((ConstraintLayout) inflate, robotoTextView, robotoTextView2), i2);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 4:
                View inflate2 = ((LayoutInflater) obj).inflate(zkh0.modal_default_header_item, (ViewGroup) obj2, false);
                int i4 = p8h0.bullets_order_popup_header_big_image;
                RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) cma1.O(i4, inflate2);
                if (roundedCornersImageView != null) {
                    i4 = p8h0.bullets_order_popup_header_image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i4, inflate2);
                    if (appCompatImageView != null) {
                        i4 = p8h0.bullets_order_popup_header_subtitle;
                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i4, inflate2);
                        if (robotoTextView3 != null) {
                            i4 = p8h0.bullets_order_popup_header_title;
                            RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i4, inflate2);
                            if (robotoTextView4 != null) {
                                i4 = p8h0.divider;
                                DividerAwareComponent dividerAwareComponent = (DividerAwareComponent) cma1.O(i4, inflate2);
                                if (dividerAwareComponent != null) {
                                    return new b0b(new ky20((LinearLayout) inflate2, roundedCornersImageView, appCompatImageView, robotoTextView3, robotoTextView4, dividerAwareComponent), 3);
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
                return null;
            case 5:
                ((Integer) obj2).getClass();
                q0b1.a((fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                return Boolean.valueOf(((fnx0) obj).a((fnx0) obj2));
            case 7:
                View inflate3 = ((LayoutInflater) obj).inflate(clh0.hub_header_view_holder, (ViewGroup) obj2, false);
                if (inflate3 != null) {
                    return new b0b(new kyu((RobotoTextView) inflate3), 4);
                }
                ny61.t("rootView");
                return null;
            case 8:
                CashbackHorizontalView cashbackHorizontalView = (CashbackHorizontalView) obj;
                Drawable drawable = (Drawable) obj2;
                if (drawable != null) {
                    cashbackHorizontalView.setCustomIcon(drawable);
                }
                return zy11Var;
            case 9:
                return Integer.valueOf(((z69) obj2).b.getIntValue());
            case 10:
                ((yf7) obj2).cancel();
                return zy11Var;
            case 11:
                View inflate4 = ((LayoutInflater) obj).inflate(clh0.hub_filter_view, (ViewGroup) obj2, false);
                int i5 = s8h0.icon_view;
                GoImageView goImageView = (GoImageView) cma1.O(i5, inflate4);
                if (goImageView != null) {
                    i5 = s8h0.text_view;
                    RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i5, inflate4);
                    if (robotoTextView5 != null) {
                        GoLinearLayout goLinearLayout = (GoLinearLayout) inflate4;
                        b0b b0bVar = new b0b(new ayu(goImageView, goLinearLayout, robotoTextView5), 5);
                        cvw.a0(100, goLinearLayout);
                        return b0bVar;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i5)));
                return null;
            case 12:
                return of91.c(((Integer) obj).intValue(), (g0v) obj2);
            case 13:
                View inflate5 = ((LayoutInflater) obj).inflate(rsh0.chargers_multi_order_in_progress_item, (ViewGroup) obj2, false);
                int i6 = rhh0.label;
                RobotoTextView robotoTextView6 = (RobotoTextView) cma1.O(i6, inflate5);
                if (robotoTextView6 != null && (O = cma1.O((i6 = rhh0.separator), inflate5)) != null) {
                    return new b0b(new e4a((GoFrameLayout) inflate5, robotoTextView6, O), 6);
                }
                ny61.t("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i6)));
                return null;
            case 14:
                return Boolean.valueOf(!jl40.l(((r2x) obj).c.a, ((r2x) obj2).c.a));
            case 15:
                ((otv) obj).R.renderLead(((r2x) obj2).c.a);
                return zy11Var;
            case 16:
                return Boolean.valueOf(!jl40.l(((r2x) obj).c.b, ((r2x) obj2).c.b));
            case 17:
                ((otv) obj).R.renderBody(((r2x) obj2).c.b);
                return zy11Var;
            case 18:
                return Boolean.valueOf(!jl40.l(((r2x) obj).c.c, ((r2x) obj2).c.c));
            case 19:
                ((otv) obj).R.renderTrail(((r2x) obj2).c.c, new uz1(2));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                x6b1.a((fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                yfw yfwVar = (yfw) obj;
                yfw yfwVar2 = (yfw) obj2;
                return Boolean.valueOf(jl40.l(yfwVar.g, yfwVar2.g) && yfwVar2.g != null && jl40.l(yfwVar.j, yfwVar2.j));
            case 22:
                return Boolean.valueOf(a.y((Point) obj, (Point) obj2));
            case 23:
                ((Integer) obj2).getClass();
                return new a1u(1L);
            case 24:
                b bVar = (b) obj2;
                tig0 tig0Var = b.w;
                return scc.g(Integer.valueOf(bVar.d.a.getIntValue()), Integer.valueOf(bVar.d.b.getIntValue()));
            case 25:
                androidx.compose.foundation.lazy.b bVar2 = (androidx.compose.foundation.lazy.b) obj2;
                tig0 tig0Var2 = androidx.compose.foundation.lazy.b.y;
                return scc.g(Integer.valueOf(bVar2.h()), Integer.valueOf(bVar2.i()));
            case 26:
                Map a = ((e7y) obj2).a();
                if (a.isEmpty()) {
                    return null;
                }
                return a;
            case 27:
                View inflate6 = ((LayoutInflater) obj).inflate(rmh0.ybsdk_item_divider, (ViewGroup) obj2, false);
                if (inflate6 != null) {
                    return new c1t0(inflate6, 1);
                }
                ny61.t("rootView");
                return null;
            case 28:
                View inflate7 = ((LayoutInflater) obj).inflate(qnh0.ybsdk_item_partners_list_content, (ViewGroup) obj2, false);
                int i7 = ibh0.endIcon;
                ImageView imageView = (ImageView) cma1.O(i7, inflate7);
                if (imageView != null) {
                    i7 = ibh0.startIcon;
                    ImageView imageView2 = (ImageView) cma1.O(i7, inflate7);
                    if (imageView2 != null) {
                        i7 = ibh0.subtitle;
                        TextView textView = (TextView) cma1.O(i7, inflate7);
                        if (textView != null) {
                            i7 = ibh0.title;
                            TextView textView2 = (TextView) cma1.O(i7, inflate7);
                            if (textView2 != null) {
                                return new h261((ShimmerFrameLayout) inflate7, imageView, imageView2, textView, textView2);
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate7.getResources().getResourceName(i7)));
                return null;
            default:
                return a361.o((LayoutInflater) obj, (ViewGroup) obj2);
        }
    }

    public /* synthetic */ w9u(int i, int i2) {
        this.a = i2;
    }
}
