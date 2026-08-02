package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardStatusItemView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.companion_buffer_serch.RideCardCompanionBufferSearchView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.tips_selector.RideCardTipsSelectorView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.tips_selector.RideCardTipsWishSelectorView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.progress_bar.RideCardProgressBarItemView;
import com.yandex.go.taxi.order.util.accordion.AccordionComponent;

/* loaded from: classes14.dex */
public final /* synthetic */ class vz1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bts0 b;

    public /* synthetic */ vz1(bts0 bts0Var, int i) {
        this.a = i;
        this.b = bts0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        switch (this.a) {
            case 0:
                SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(viewGroup.getContext(), null, 0, ((grs0) this.b).a, 6, null);
                slotItemViewComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return slotItemViewComponent.asView();
            case 1:
                SlotItemViewComponent slotItemViewComponent2 = new SlotItemViewComponent(viewGroup.getContext(), null, 0, ((grs0) this.b).a, 6, null);
                slotItemViewComponent2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return slotItemViewComponent2.asView();
            case 2:
                SlotItemViewComponent slotItemViewComponent3 = new SlotItemViewComponent(viewGroup.getContext(), null, 0, ((grs0) this.b).a, 6, null);
                slotItemViewComponent3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return slotItemViewComponent3.asView();
            case 3:
                SlotItemViewComponent slotItemViewComponent4 = new SlotItemViewComponent(viewGroup.getContext(), null, 0, ((grs0) this.b).a, 6, null);
                slotItemViewComponent4.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return slotItemViewComponent4.asView();
            case 4:
                AccordionComponent accordionComponent = new AccordionComponent(viewGroup.getContext(), null, 0, 0, this.b, 14, null);
                accordionComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                accordionComponent.setFocusable(false);
                accordionComponent.setImportantForAccessibility(1);
                return accordionComponent;
            case 5:
                RideCardCompanionBufferSearchView rideCardCompanionBufferSearchView = new RideCardCompanionBufferSearchView(viewGroup.getContext(), null, 0, this.b, 6, null);
                rideCardCompanionBufferSearchView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rideCardCompanionBufferSearchView.setOrientation(1);
                rideCardCompanionBufferSearchView.setFocusable(false);
                rideCardCompanionBufferSearchView.setImportantForAccessibility(1);
                return rideCardCompanionBufferSearchView;
            case 6:
                SlotItemViewComponent slotItemViewComponent5 = new SlotItemViewComponent(viewGroup.getContext(), null, 0, ((grs0) this.b).a, 6, null);
                slotItemViewComponent5.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return slotItemViewComponent5.asView();
            case 7:
                SlotItemViewComponent slotItemViewComponent6 = new SlotItemViewComponent(viewGroup.getContext(), null, 0, ((grs0) this.b).a, 6, null);
                slotItemViewComponent6.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return slotItemViewComponent6.asView();
            case 8:
                RideCardProgressBarItemView rideCardProgressBarItemView = new RideCardProgressBarItemView(viewGroup.getContext(), null, 0, this.b, 6, null);
                rideCardProgressBarItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return rideCardProgressBarItemView;
            case 9:
                SlotItemViewComponent slotItemViewComponent7 = new SlotItemViewComponent(viewGroup.getContext(), null, 0, ((grs0) this.b).a, 6, null);
                slotItemViewComponent7.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return slotItemViewComponent7.asView();
            case 10:
                RideCardStatusItemView rideCardStatusItemView = new RideCardStatusItemView(viewGroup.getContext(), null, 0, this.b, 6, null);
                rideCardStatusItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rideCardStatusItemView.setAccessibilityHeading(true);
                return rideCardStatusItemView;
            case 11:
                RideCardTipsSelectorView rideCardTipsSelectorView = new RideCardTipsSelectorView(viewGroup.getContext(), null, 0, this.b, 6, null);
                rideCardTipsSelectorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return rideCardTipsSelectorView;
            case 12:
                RideCardTipsWishSelectorView rideCardTipsWishSelectorView = new RideCardTipsWishSelectorView(viewGroup.getContext(), null, 0, this.b, 6, null);
                rideCardTipsWishSelectorView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                xw31.A(tje.r(mrg0.go_design_m_space, rideCardTipsWishSelectorView.getContext()), rideCardTipsWishSelectorView);
                rideCardTipsWishSelectorView.setClipToOutline(true);
                return rideCardTipsWishSelectorView;
            case 13:
                SlotItemViewComponent slotItemViewComponent8 = new SlotItemViewComponent(viewGroup.getContext(), null, 0, ((grs0) this.b).a, 6, null);
                slotItemViewComponent8.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return slotItemViewComponent8.asView();
            case 14:
                SlotItemViewComponent slotItemViewComponent9 = new SlotItemViewComponent(viewGroup.getContext(), null, 0, ((grs0) this.b).a, 6, null);
                slotItemViewComponent9.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return slotItemViewComponent9.asView();
            default:
                SlotItemViewComponent slotItemViewComponent10 = new SlotItemViewComponent(viewGroup.getContext(), null, 0, ((grs0) this.b).a, 6, null);
                slotItemViewComponent10.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return slotItemViewComponent10.asView();
        }
    }
}
