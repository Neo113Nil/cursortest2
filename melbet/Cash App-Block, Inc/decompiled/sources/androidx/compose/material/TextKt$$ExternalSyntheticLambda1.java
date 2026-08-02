package androidx.compose.material;

import androidx.compose.foundation.lazy.LazyListItemProviderImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.RenavigationKt;
import app.cash.broadway.presenter.molecule.SwipeKt;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.CardManagementSheetModel;
import app.cash.local.viewmodels.LocalCashAllActivityViewModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentMethodViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.LocalOrderStatusViewModel;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel$TabContent$Widget$Portfolio$Followed;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.brand.orders.LocalOrderStatusViewKt;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.local.views.wallet.LocalHomeViewKt;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.google.maps.android.compose.MapEffectKt;
import com.squareup.address.typeahead.views.AddressTypeaheadKt;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cash.account.components.AccountSettingsKt;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ TextKt$$ExternalSyntheticLambda1(LocalCashAllActivityViewModel localCashAllActivityViewModel, Function1 function1, int i) {
        this.$r8$classId = 16;
        this.f$0 = localCashAllActivityViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TextKt.ProvideTextStyle((TextStyle) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((LazyListItemProviderImpl) obj4).Item(i2, Updater.updateChangedFlags(1), (Composer) obj, obj3);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((LazyGridItemProviderImpl) obj4).Item(i2, Updater.updateChangedFlags(1), (Composer) obj, obj3);
                break;
            case 3:
                LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    lazyLayoutItemProvider.Item(i2, 0, gapComposer, obj3);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((PagerLazyLayoutItemProvider) obj4).Item(i2, Updater.updateChangedFlags(1), (Composer) obj, obj3);
                break;
            case 5:
                ((Integer) obj2).intValue();
                AnnotatedStringResolveInlineContentKt.InlineChildren((AnnotatedString) obj4, (List) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                DatePickerKt.WeekDays((DatePickerColors) obj4, (CalendarModelImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                RenavigationKt.RenavigationHandler((MoleculePresenter) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                SwipeKt.SwipeHandler((MoleculePresenter) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((UiCallbackModel) obj4).Show((ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                CheckoutTipSectionKt.SinglePaymentMethodSection((String) obj4, (LocalCheckoutPaymentMethodViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.LocalMenuComboDetailsView((LocalMenuComboDetailsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                LocalCaloriesTextKt.FreeTextEntryOption((LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                LocalOrderStatusViewKt.FulfillmentMap((LocalOrderStatusViewModel.Loaded.FulfillmentDetails) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                LocalBrandLocationRowKt.AddRemoveButton((BrandFollowViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                LocalAddBrandsViewKt.CardRow((CardManagementSheetModel.Card) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                LocalAddBrandsViewKt.LocalCashAllActivityView((LocalCashAllActivityViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                LocalAddBrandsViewKt.LocalCashBalanceComposeUi((LocalCashBalanceViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                FulfillmentRadioCellKt.SchedulingDayTimeOptions((SchedulingDayTimePickerViewModel.ModelState.LoadedDays) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                MarketingMessageKt.MessageCard((MarketingMessagesViewModel.MessageTile) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.FollowedWidget((LocalHomeViewModel$TabContent$Widget$Portfolio$Followed) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.LocalCashWidget((LocalHomeViewModel.TabContent.Widget.LocalCash) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.MarketingMessageWidget((LocalHomeViewModel.TabContent.Widget.MarketingMessage) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.LocalCashIncentiveWidget((LocalHomeViewModel.TabContent.Widget.LocalCashIncentive) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.PastOrderWidget((LocalHomeViewModel.TabContent.Widget.PastOrders) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ((EndAppLockPresenter) obj4).m1348models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                MapEffectKt.MapEffect(obj4, (Function3) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                AddressTypeaheadKt.SearchResults((AddressTypeaheadState) obj4, (List) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                AccountSettingsKt.SettingsContent((AccountSettingsViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AccountToDoKt.AccountToDos((AccountViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextKt$$ExternalSyntheticLambda1(LazyLayoutItemProvider lazyLayoutItemProvider, int i, Object obj, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = lazyLayoutItemProvider;
        this.f$2 = i;
        this.f$1 = obj;
    }

    public /* synthetic */ TextKt$$ExternalSyntheticLambda1(int i, LazyLayoutItemProvider lazyLayoutItemProvider, Object obj) {
        this.$r8$classId = 3;
        this.f$0 = lazyLayoutItemProvider;
        this.f$2 = i;
        this.f$1 = obj;
    }

    public /* synthetic */ TextKt$$ExternalSyntheticLambda1(LocalCashBalanceViewModel localCashBalanceViewModel, Function1 function1, int i) {
        this.$r8$classId = 17;
        this.f$0 = localCashBalanceViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ TextKt$$ExternalSyntheticLambda1(LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel, Function1 function1, int i) {
        this.$r8$classId = 11;
        this.f$0 = localMenuComboDetailsViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ TextKt$$ExternalSyntheticLambda1(AccountSettingsViewModel.Content content, Function1 function1, int i) {
        this.$r8$classId = 28;
        this.f$0 = content;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ TextKt$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
