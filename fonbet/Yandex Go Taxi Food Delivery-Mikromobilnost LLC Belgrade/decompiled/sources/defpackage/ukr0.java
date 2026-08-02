package defpackage;

import android.view.ViewGroup;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.agreement.router.d;
import com.yandex.go.shortcuts.dto.response.ShortcutInfoListItem;
import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardFragment;
import com.ybsdk.feature.settings.api.SettingsTheme;
import java.util.List;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.c;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes13.dex */
public final /* synthetic */ class ukr0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ ukr0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 json$lambda$0;
        zy11 zy11Var;
        zy11 managementAdapter$lambda$6;
        zy11 cardAdditionalAdapter$lambda$11;
        int i = this.a;
        int i2 = 1;
        int i3 = 2;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
            case 0:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent.setPadding(0, 0, 0, (int) listItemComponent.getResources().getDimension(mrg0.bubble_component_corner_radius));
                return listItemComponent;
            case 1:
                ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemCheckComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return listItemCheckComponent;
            case 2:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                nzs.s(listItemComponent2, -1, -2);
                return listItemComponent2;
            case 3:
                return new uj70((ListItemComponent) obj, i2);
            case 4:
                ListItemSwitchComponent listItemSwitchComponent = new ListItemSwitchComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemSwitchComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return listItemSwitchComponent;
            case 5:
                ListGroupHeaderComponent listGroupHeaderComponent = new ListGroupHeaderComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listGroupHeaderComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return listGroupHeaderComponent;
            case 6:
                return new k5r0((ListGroupHeaderComponent) obj, i3);
            case 7:
                json$lambda$0 = ShimmerDivHandler.json$lambda$0((acx) obj);
                return json$lambda$0;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 9:
                PlaceholderView placeholderView = new PlaceholderView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                placeholderView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                placeholderView.setShimmering(true);
                placeholderView.setPlaceholderType(PlaceholderView.PlaceholderType.RECTANGLE);
                placeholderView.setRectCornerRadius(tje.r(dug0.discovery_organizations_chip_corner_radius, placeholderView.getContext()));
                return placeholderView;
            case 10:
                return new t5r0((PlaceholderView) obj, i3);
            case 11:
                gdd.a.getClass();
                ((ComposeView) obj).setContent(gdd.b);
                return zy11Var2;
            case 12:
                ShortcutInfoListItem shortcutInfoListItem = (ShortcutInfoListItem) obj;
                return g8e.p(shortcutInfoListItem.a, " ", shortcutInfoListItem.b);
            case 13:
                return zy11Var2;
            case 14:
                d.P(((cl1) obj).a, null);
                return zy11Var2;
            case 15:
                ((z1u0) obj).a.r(new qu(9));
                return zy11Var2;
            case 16:
                return new pbv((String) obj, (ccv) null, rev.j, (dcv) null, (vfv) null, 58);
            case 17:
                zy11Var = SingleCardFragment.settingsAdapter$lambda$1((SettingsTheme) obj);
                return zy11Var;
            case 18:
                managementAdapter$lambda$6 = SingleCardFragment.managementAdapter$lambda$6((SettingsTheme) obj);
                return managementAdapter$lambda$6;
            case 19:
                cardAdditionalAdapter$lambda$11 = SingleCardFragment.cardAdditionalAdapter$lambda$11((SettingsTheme) obj);
                return cardAdditionalAdapter$lambda$11;
            case 20:
                return new pbv((String) obj, new ccv(zxg0.ybsdk_card_skeleton), rev.f, (dcv) null, (vfv) null, 24);
            case 21:
                c2q0 c2q0Var = (c2q0) obj;
                kdd.a.getClass();
                c2q0.a(c2q0Var, null, null, false, null, kdd.b, 31);
                c2q0.a(c2q0Var, null, null, false, null, kdd.c, 31);
                c2q0.a(c2q0Var, null, null, false, null, kdd.d, 31);
                c2q0.a(c2q0Var, null, null, false, null, kdd.e, 31);
                return zy11Var2;
            case 22:
                lmt0 lmt0Var = (lmt0) obj;
                mdd.a.getClass();
                lmt0Var.a(0, 0, 6, 1, mdd.b);
                int v = jx81.v(0, 4, 2);
                if (v >= 0) {
                    int i4 = 0;
                    while (true) {
                        mdd.a.getClass();
                        lmt0Var.a(i4, 1, 2, 2, mdd.c);
                        if (i4 != v) {
                            i4 += 2;
                        }
                    }
                }
                mdd.a.getClass();
                lmt0Var.a(0, 3, 6, 4, mdd.d);
                lmt0Var.a(0, 7, 6, 4, mdd.e);
                return zy11Var2;
            case 23:
                c2q0 c2q0Var2 = (c2q0) obj;
                odd.a.getClass();
                c2q0.a(c2q0Var2, null, null, false, null, odd.b, 31);
                c2q0.a(c2q0Var2, null, null, false, null, odd.c, 31);
                c2q0.a(c2q0Var2, null, null, false, null, odd.d, 31);
                c2q0.a(c2q0Var2, null, null, false, null, odd.e, 31);
                return zy11Var2;
            case 24:
                return new c(((Number) ((List) obj).get(0)).floatValue());
            case 25:
                return new i(k.e(sb2.K(300, 0, null, 6), 2), k.f(sb2.K(300, 0, null, 6), 2));
            case 26:
                return qoi0.a(((tys0) obj).getClass());
            case 27:
                h0c h0cVar = (h0c) obj;
                quw quwVar = ruw.Companion;
                h0cVar.a("intervalStart", quwVar.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("intervalEnd", quwVar.serializer().getDescriptor(), (r3 & 8) == 0);
                return zy11Var2;
            case 28:
                return ((fnx0) obj).e.d;
            default:
                return Boolean.valueOf(((cne0) obj).g("ToggleState", true));
        }
    }
}
