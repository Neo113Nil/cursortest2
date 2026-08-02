package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.payments.cards.ui.LoyaltyProgramView;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;
import ru.yandex.taxi.design.LoadingComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.widget.ShimmeringImageView;

/* loaded from: classes8.dex */
public final /* synthetic */ class qz10 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ qz10(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        long j;
        int i = this.a;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        int i3 = 1;
        switch (i) {
            case 0:
                return (OkHttpClient.a) obj;
            case 1:
                return new xr20(null, null, null, null, null, null, null, null, null, null, null, null, null, 65535);
            case 2:
                return kp50.i();
            case 3:
                return kp50.i();
            case 4:
                return zy11Var;
            case 5:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.g = true;
                return zy11Var;
            case 6:
                return Boolean.valueOf(!((azt0) obj).w());
            case 7:
                return Boolean.valueOf(!((azt0) obj).w());
            case 8:
                return Boolean.valueOf(((x43) obj).isEmpty());
            case 9:
                acx acxVar2 = (acx) obj;
                acxVar2.c = true;
                acxVar2.a = true;
                acxVar2.k = true;
                return zy11Var;
            case 10:
                ((c760) obj).c();
                return zy11Var;
            case 11:
                a160 a160Var = (a160) obj;
                if (a160Var instanceof y060) {
                    j = 0;
                } else {
                    if (!(a160Var instanceof z060)) {
                        w511.b();
                        return null;
                    }
                    j = 500;
                }
                return Long.valueOf(j);
            case 12:
                return (w3j0) obj;
            case 13:
                return zy11Var;
            case 14:
                return 0;
            case 15:
                ym00 ym00Var = (ym00) obj;
                f4c0 g = ym00Var.g();
                Object obj2 = g.d;
                pp60 pp60Var = (pp60) (obj2 instanceof pp60 ? obj2 : null);
                if (pp60Var == null) {
                    pp60Var = oyr.c(g);
                }
                pp60Var.g(ym00Var);
                return zy11Var;
            case 16:
                return zy11Var;
            case 17:
                u0k u0kVar = ((nea0) obj).a;
                h8b0 h8b0Var = u0kVar instanceof h8b0 ? (h8b0) u0kVar : null;
                return Boolean.valueOf(h8b0Var != null ? h8b0Var.j instanceof f8b0 : false);
            case 18:
                return ((nea0) obj).a.toString();
            case 19:
                CardDivider cardDivider = new CardDivider(((ViewGroup) obj).getContext(), null, 0, 6, null);
                cardDivider.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                cardDivider.setFocusable(false);
                cardDivider.setImportantForAccessibility(4);
                return cardDivider;
            case 20:
                return new haa0((CardDivider) obj, null == true ? 1 : 0);
            case 21:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent.setBackgroundColor(new bdc(xng0.bgMain));
                return listItemComponent;
            case 22:
                return new vaa0((ListItemComponent) obj);
            case 23:
                LoadingComponent loadingComponent = new LoadingComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                loadingComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return loadingComponent;
            case 24:
                return new haa0((LoadingComponent) obj, i3);
            case 25:
                return new qc6((LoyaltyProgramView) obj, i2);
            case 26:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent2.setBackgroundResource(y2h0.bg_reject_delete_notification);
                listItemComponent2.setLeadImage(y2h0.ic_reject_delete_card);
                listItemComponent2.setUseAutoAccessibilityDelegate(false);
                listItemComponent2.setImportantForAccessibility(2);
                listItemComponent2.title().setImportantForAccessibility(1);
                b.q(listItemComponent2.title(), true);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(tje.r(utg0.payment_methods_notification_horizontal_margin, listItemComponent2.getContext()), tje.r(utg0.payment_methods_notification_vertical_margin, listItemComponent2.getContext()), tje.r(utg0.payment_methods_notification_horizontal_margin, listItemComponent2.getContext()), tje.r(utg0.payment_methods_notification_vertical_margin, listItemComponent2.getContext()));
                listItemComponent2.setLayoutParams(layoutParams);
                return listItemComponent2;
            case 27:
                return new rc6((ListItemComponent) obj, i2);
            case 28:
                ListItemWithBadgeComponent listItemWithBadgeComponent = new ListItemWithBadgeComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemWithBadgeComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return listItemWithBadgeComponent;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                ShimmeringImageView shimmeringImageView = new ShimmeringImageView(viewGroup.getContext(), null, 0, 6, null);
                shimmeringImageView.setImportantForAccessibility(2);
                shimmeringImageView.setLoading(true);
                shimmeringImageView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1((int) tje.w(44, shimmeringImageView.getContext())));
                shimmeringImageView.setClipToOutline(true);
                ListItemComponent listItemComponent3 = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
                listItemComponent3.leadFrame.setView(shimmeringImageView);
                listItemComponent3.setTitleTypeface(3);
                listItemComponent3.setTitleTextSizePx(tje.r(mrg0.component_text_size_body, listItemComponent3.getContext()));
                listItemComponent3.setSubtitleTextSizePx(tje.r(mrg0.component_text_size_caption, listItemComponent3.getContext()));
                listItemComponent3.setTrailContentDescription(listItemComponent3.getContext().getString(kyh0.payment_methods_hide));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(tje.r(utg0.payment_methods_notification_horizontal_margin, listItemComponent3.getContext()), tje.r(utg0.payment_methods_notification_vertical_margin, listItemComponent3.getContext()), tje.r(utg0.payment_methods_notification_horizontal_margin, listItemComponent3.getContext()), tje.r(utg0.payment_methods_notification_vertical_margin, listItemComponent3.getContext()));
                listItemComponent3.setLayoutParams(layoutParams2);
                listItemComponent3.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.r(utg0.payment_methods_banner_corner_radius, listItemComponent3.getContext())));
                listItemComponent3.setClipToOutline(true);
                return listItemComponent3;
        }
    }
}
