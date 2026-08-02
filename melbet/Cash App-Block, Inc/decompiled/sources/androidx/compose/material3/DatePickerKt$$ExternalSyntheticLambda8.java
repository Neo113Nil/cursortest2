package androidx.compose.material3;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.navigation.NavBackStackEntry;
import androidx.room.TransactorKt;
import app.cash.local.viewmodels.AppliedGiftCard;
import app.cash.local.viewmodels.ComboSlotViewModel;
import app.cash.local.viewmodels.CreateCartErrorViewModel;
import app.cash.local.viewmodels.CurbsidePickupCarViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalBrandLocationMarketingMessagesContentModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewModel;
import app.cash.local.viewmodels.LocalOrderStatusViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt;
import app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt;
import app.cash.local.views.brand.checkout.LocalOpenTabCheckoutViewKt;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.brand.orders.LocalOrderStatusViewKt;
import app.cash.local.views.brand.profile.CheckedInSheetAnimationStage;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.cart.CartBannerViewKt;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt;
import coil3.size.DimensionKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScopeInstance;
import com.squareup.cash.ui.CashInsetsListenerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda8(TooltipStateImpl tooltipStateImpl, MutableState mutableState, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 10;
        this.f$0 = tooltipStateImpl;
        this.f$2 = mutableState;
        this.f$3 = composableLambdaImpl;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$3;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(7);
                DatePickerKt.m527DisplayModeToggleButtoniUJLfQg((Modifier) obj5, this.f$1, (Function1) obj3, (DatePickerColors) obj4, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ContextMenuUiKt.ContextMenuColumnBuilder((Modifier) obj5, (ContextMenuColors) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1), this.f$1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ContextMenuUiKt.ContextMenuColumn((ContextMenuColors) obj3, (Modifier) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                LazyLayoutKt.m322SkippableItemJVlU9Rs((LazyLayoutItemProvider) obj5, this.f$2, this.f$1, this.f$3, (Composer) obj, updateChangedFlags2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((LazySaveableStateHolder) obj5).SaveableStateProvider(obj3, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((TextLinkScope) obj5).StyleAnnotation((Object[]) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu((TextContextMenuSession) obj5, (TextContextMenuDataProvider) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                TransactorKt.ProvideBasicTextContextMenu((Modifier) obj5, (ProvidableCompositionLocal) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                SimpleLayoutKt.HandlePopup((OffsetProvider) obj5, (Alignment) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                CardKt.SnackbarHost((SnackbarHostState) obj3, (Modifier) obj5, (Function3) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                Icons$Filled.WrappedAnchor((TooltipStateImpl) obj5, (MutableState) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                DimensionKt.LifecycleResumeEffectImpl((LifecycleOwner) obj5, (LifecycleResumePauseEffectScope) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                CashInsetsListenerKt.LocalOwnersProvider((NavBackStackEntry) obj5, (SaveableStateHolder) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                CheckoutTipSectionKt.AppliedGiftCardChip((Modifier) obj5, (AppliedGiftCard) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                CurbsidePickupCarSheetKt.CurbsidePickupCarSheet((Modifier) obj5, (CurbsidePickupCarViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                LocalBrandLocationCheckoutViewKt.LocalBrandLocationCheckoutView((Modifier) obj5, (LocalBrandLocationCheckoutViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                LocalOpenTabCheckoutViewKt.LocalOpenTabCheckoutView((Modifier) obj5, (LocalOpenTabCheckoutViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                LocalCaloriesTextKt.CategorySearchBar((CollapsingToolbarScopeInstance) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                LocalCaloriesTextKt.ComboSlotOptionView((LocalMenuComboDetailsViewModel.ComboSlot) obj5, (LocalMenuComboDetailsViewModel.ComboSlotOption) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                LocalCaloriesTextKt.LocalMenuItemDetailsView((Modifier) obj5, (LocalMenuItemDetailsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                LocalOrderStatusViewKt.LocalOrderStatusView((Modifier) obj5, (LocalOrderStatusViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                LocalOrderStatusViewKt.FulfillmentDetailsView((LocalOrderStatusViewModel.Loaded.FulfillmentDetails) obj5, (String) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.CheckedInButton((Modifier) obj5, (CheckedInSheetAnimationStage) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.LocalBrandLocationMarketingMessagesView((LocalBrandLocationMarketingMessagesContentModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.m1314LocalBrandLocationStatusRowet4HrQ((Modifier) obj5, (LocationStatus) obj3, (TextStyle) obj4, (Composer) obj, Updater.updateChangedFlags(1), this.f$1);
                break;
            case 25:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.MoreOptionsInlineView((Modifier) obj5, (Function1) obj3, (LocalBrandProfileViewModel.MoreOptionsMenuModel) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                CartBannerViewKt.CreateCartErrorBanner((Modifier) obj5, (CreateCartErrorViewModel) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                CartBannerViewKt.CreateCartErrorBanner((Modifier) obj5, (CreateCartErrorViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                LocalBrandLocationCartViewKt.SelectionSlotView((Modifier) obj5, (ComboSlotViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                LocalBrandLocationCartViewKt.LocalBrandLocationCartView((Modifier) obj5, (LocalBrandLocationCartViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda8(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = 3;
        this.f$0 = lazyLayoutItemProvider;
        this.f$2 = obj;
        this.f$1 = i;
        this.f$3 = obj2;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda8(Modifier modifier, int i, Function1 function1, DatePickerColors datePickerColors, int i2) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$1 = i;
        this.f$2 = function1;
        this.f$3 = datePickerColors;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda8(Modifier modifier, ContextMenuColors contextMenuColors, Function1 function1, int i, int i2) {
        this.$r8$classId = 1;
        this.f$0 = modifier;
        this.f$3 = contextMenuColors;
        this.f$2 = function1;
        this.f$1 = i2;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda8(Modifier modifier, LocationStatus locationStatus, TextStyle textStyle, int i, int i2) {
        this.$r8$classId = 24;
        this.f$0 = modifier;
        this.f$2 = locationStatus;
        this.f$3 = textStyle;
        this.f$1 = i2;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda8(LocalBrandLocationMarketingMessagesContentModel localBrandLocationMarketingMessagesContentModel, Function1 function1, Modifier modifier, int i) {
        this.$r8$classId = 23;
        this.f$3 = localBrandLocationMarketingMessagesContentModel;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$1 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda8(Object obj, Modifier modifier, Function3 function3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = obj;
        this.f$0 = modifier;
        this.f$3 = function3;
        this.f$1 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$2 = function1;
        this.f$1 = i;
    }
}
