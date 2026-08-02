package app.cash.local.primitives;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuHours;
import app.cash.local.viewmodels.CreateCartErrorViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentMethodViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.home.LocalHomeGeoViewModel;
import com.google.android.gms.maps.model.Marker;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.maps.views.CashCluster;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocationMenu$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LocationMenu$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MenuHours.State state;
        switch (this.$r8$classId) {
            case 0:
                LocationMenu.Menu menu = (LocationMenu.Menu) obj;
                menu.getClass();
                MenuHours menuHours = menu.hours;
                if (menuHours == null || (state = menuHours.state) == null) {
                    state = MenuHours.State.Unspecified;
                }
                return Boxes$$ExternalSyntheticOutline1.m("{\"menu_token\": \"", menu.token, "\", \"availability\": \"", state.analyticsString, "\"}");
            case 1:
                CartEntry.ModifierSelection modifierSelection = (CartEntry.ModifierSelection) obj;
                modifierSelection.getClass();
                return modifierSelection.selectionToken;
            case 2:
                CartEntry.ModifierSelection modifierSelection2 = (CartEntry.ModifierSelection) obj;
                modifierSelection2.getClass();
                return modifierSelection2.listToken;
            case 3:
                CartEntry.ModifierSelection modifierSelection3 = (CartEntry.ModifierSelection) obj;
                modifierSelection3.getClass();
                return modifierSelection3.quantity;
            case 4:
                LocalCart.Line.Selection.ComboSlot comboSlot = (LocalCart.Line.Selection.ComboSlot) obj;
                comboSlot.getClass();
                String str = comboSlot.menu_item_token;
                str.getClass();
                return str;
            case 5:
                LocalCart.Line.Selection.ComboSlot comboSlot2 = (LocalCart.Line.Selection.ComboSlot) obj;
                comboSlot2.getClass();
                String str2 = comboSlot2.menu_item_token;
                str2.getClass();
                return str2;
            case 6:
                OrderBuilderModel.BuyerInfo.UiReady uiReady = (OrderBuilderModel.BuyerInfo.UiReady) obj;
                uiReady.getClass();
                return uiReady.getClass().getName();
            case 7:
                LocalCheckoutPaymentMethodViewModel localCheckoutPaymentMethodViewModel = (LocalCheckoutPaymentMethodViewModel) obj;
                localCheckoutPaymentMethodViewModel.getClass();
                return localCheckoutPaymentMethodViewModel.token;
            case 8:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl.maxLineSpan));
            case 9:
                ((LocalBrandLocationMenuViewModel.MenuCategory.MenuItem) obj).getClass();
                return "content_type_item";
            case 10:
                LocalBrandLocationMenuViewModel.MenuCategory menuCategory = (LocalBrandLocationMenuViewModel.MenuCategory) obj;
                return Boxes$$ExternalSyntheticOutline1.m(menuCategory.label, "[token:", MenuCategoryToken.m1259toStringimpl(menuCategory.token), "]");
            case 11:
                ((Marker) obj).getClass();
                return Boolean.TRUE;
            case 12:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 15:
                ((CreateCartErrorViewModel) obj).getClass();
                return "error_banner";
            case 16:
                ((LocalBrandLocationCartViewModel.Selection) obj).getClass();
                return "cart_selection_item";
            case 17:
                ((CreateCartErrorViewModel) obj).getClass();
                return "open_tab_error_banner";
            case 18:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(2));
            case 19:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(2));
            case 20:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(2));
            case 21:
                SchedulingDay schedulingDay = (SchedulingDay) obj;
                schedulingDay.getClass();
                String str3 = schedulingDay.scheduling_day_token;
                str3.getClass();
                return str3;
            case 22:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver2, 1);
                return Unit.INSTANCE;
            case 23:
                LocalHomeGeoViewModel.Location location = (LocalHomeGeoViewModel.Location) obj;
                location.getClass();
                String str4 = location.sheetModel.artwork;
                if (str4 != null) {
                    return new LocalImage(str4, (String) null, (Long) null, (Long) null, (LocalColor) null, 62);
                }
                return null;
            case 24:
                ((CashCluster) obj).getClass();
                return RoundedCornerShapeKt.CircleShape;
            case 25:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(1, new LocationMenu$$ExternalSyntheticLambda6(27)).plus(EnterExitTransitionKt.fadeIn$default(null, 3)), EnterExitTransitionKt.slideOutVertically$default(1, new LocationMenu$$ExternalSyntheticLambda6(28)).plus(EnterExitTransitionKt.fadeOut$default(null, 3)));
            case 27:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 28:
                return Integer.valueOf((-((Integer) obj).intValue()) / 2);
            default:
                ((Placeable.PlacementScope) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
