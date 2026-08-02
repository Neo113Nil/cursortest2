package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.media3.ui.PlayerControlView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.go.payments.shared.members.list.MembersListView;
import com.yandex.go.places.base.ui.views.MapButtonsView;
import com.yandex.go.promocodes.base.impl.ui.share.v1.PromocodeSharingView;
import com.yandex.go.routestops.RouteStopsModalView;
import com.yandex.go.scooters.offers.v2.ScootersCardV2ModalView;
import com.yandex.go.shortcuts.impl.view.adapter.s;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;
import com.yandex.messaging.internal.view.timeline.overlay.a;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.order.view.OrderView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2ModalView;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes13.dex */
public final /* synthetic */ class yln implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yln(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        int i9 = this.a;
        int i10 = 2;
        Object obj = this.b;
        switch (i9) {
            case 0:
                xm2 xm2Var = new xm2((amn) obj, i4 - i2, 8);
                Rect rect = xw31.a;
                xm2Var.run();
                view.post(xm2Var);
                break;
            case 1:
                ((a) obj).p();
                break;
            case 2:
                ((MapButtonsView) obj).updateButtonsMargins();
                break;
            case 3:
                MembersListView.buttonContainerLayoutListener$lambda$0((MembersListView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                ((MtRoutesModalView) obj).actualizeAnchorOffset();
                break;
            case 5:
                MultiBannerControlsContainer.a((MultiBannerControlsContainer) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                ((NavigationBarItemView) obj).lambda$new$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 7:
                OrderView.cardLayoutChangeListener$lambda$0((OrderView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 8:
                ((lun) obj).h(i, i2, i3, i4);
                break;
            case 9:
                PfmFragment.onViewCreated$lambda$13$lambda$12((PfmFragment) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 10:
                ((ipb0) obj).a();
                break;
            case 11:
                ((PlayerControlView) obj).onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 12:
                androidx.media3.ui.a aVar = (androidx.media3.ui.a) obj;
                PlayerControlView playerControlView = aVar.a;
                int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                int height3 = (playerControlView.getHeight() - playerControlView.getPaddingBottom()) - playerControlView.getPaddingTop();
                ViewGroup viewGroup = aVar.c;
                int c = androidx.media3.ui.a.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int max = Math.max(c, androidx.media3.ui.a.c(aVar.k) + androidx.media3.ui.a.c(aVar.i));
                ViewGroup viewGroup2 = aVar.d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z = width <= max || height3 <= (height2 * 2) + paddingBottom;
                if (aVar.A != z) {
                    aVar.A = z;
                    view.post(new nyc0(aVar, r2));
                }
                r2 = i3 - i == i7 - i5 ? 0 : 1;
                if (!aVar.A && r2 != 0) {
                    view.post(new nyc0(aVar, i10));
                    break;
                }
                break;
            case 13:
                ((PreviewView) obj).lambda$new$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 14:
                PromocodeSharingView.bottomViewsBackgroundOnLayoutChangeListener$lambda$0((PromocodeSharingView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 15:
                ((rai0) obj).q();
                break;
            case 16:
                ebi0 ebi0Var = (ebi0) obj;
                lg lgVar = ebi0Var.B;
                if (lgVar != null) {
                    lgVar.h((ebi0Var.a().getWidth() - ebi0Var.a().getPaddingStart()) - ebi0Var.a().getPaddingEnd());
                    break;
                }
                break;
            case 17:
                rji0 rji0Var = (rji0) obj;
                if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
                    rji0Var.b();
                    break;
                }
            case 18:
                xm2 xm2Var2 = new xm2((o3j0) obj, i4 - i2, 14);
                Rect rect2 = xw31.a;
                xm2Var2.run();
                view.post(xm2Var2);
                break;
            case 19:
                RouteStopsModalView.onLayoutChangeListener$lambda$0((RouteStopsModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 20:
                ((ScootersCardV2ModalView) obj).updateHeights();
                break;
            case 21:
                nan0 nan0Var = (nan0) obj;
                int u = tje.u(16, nan0Var.k);
                Rect rect3 = new Rect(u, u, nan0Var.j().m.getWidth() - u, nan0Var.j().m.getHeight() - u);
                nan0Var.j().m.setActive(true);
                nan0Var.j().m.setTargetRect(rect3);
                break;
            case 22:
                ((ScootersDetailedOrderV2ModalView) obj).updateFocusCoordinatorMargins();
                break;
            case 23:
                ((avo0) obj).a();
                break;
            case 24:
                ((d7p0) obj).a();
                break;
            case 25:
                s sVar = (s) obj;
                int i11 = n4q0.a[sVar.b0.ordinal()];
                if (i11 == 1) {
                    sVar.i0();
                    break;
                } else if (i11 != 2) {
                    w511.b();
                    break;
                } else {
                    sVar.h0();
                    break;
                }
            case 26:
                ((qgr0) obj).a();
                break;
            case 27:
                xm2 xm2Var3 = new xm2((nor0) obj, i4 - i2, 19);
                Rect rect4 = xw31.a;
                xm2Var3.run();
                view.post(xm2Var3);
                break;
            case 28:
                ((ShortcutsModalView) obj).updateHeights();
                break;
            default:
                ((ShortcutsView) obj).onLayoutChangeListener();
                break;
        }
    }
}
