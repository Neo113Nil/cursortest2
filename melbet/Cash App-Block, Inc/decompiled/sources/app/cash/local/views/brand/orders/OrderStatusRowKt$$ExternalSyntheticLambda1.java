package app.cash.local.views.brand.orders;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewModel;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.google.android.gms.internal.mlkit_genai_prompt.zzie;
import com.squareup.address.typeahead.views.AddressTypeaheadKt;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampMovingListener;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountSwitcherViewModel;
import com.squareup.cash.activity.views.SectionHeaderScope;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewModel;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDisplayCurrencyViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.performance.BitcoinPerformanceSummaryViewModel;
import com.squareup.cash.bitcoin.viewmodels.deposits.copy.BitcoinDepositCopyViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationFilter;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewModel$Loaded;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt;
import com.squareup.cash.bitcoin.views.applet.performance.BitcoinPerformanceSummaryViewKt;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetViewKt;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewModel;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.card.onboarding.core.instancing.GridLayout;
import com.squareup.cash.cashapppay.views.CashAppPayStackedAvatarKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.common.viewmodels.LoadingAnimationAssets;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositEditPaycheckAmountViewModel;
import com.squareup.cash.directdeposit.viewmodels.PaycheckDepositAllocationType;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.earningstracker.views.components.LoadingErrorKt;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMemberRowViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import org.intellij.markdown.ast.ASTUtilKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class OrderStatusRowKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ OrderStatusRowKt$$ExternalSyntheticLambda1(int i, int i2, String str, Function0 function0, ComposableLambdaImpl composableLambdaImpl, int i3) {
        this.$r8$classId = 24;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$0 = str;
        this.f$1 = function0;
        this.f$2 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        int i3 = this.f$3;
        Object obj3 = this.f$0;
        Object obj4 = this.f$1;
        Object obj5 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                BrandPinsKt.OrderStatusRow((ColumnScope) obj3, (Modifier) obj4, (OrderStatus) obj5, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 1:
                ((Integer) obj2).getClass();
                LazyLayoutKt.LazyLayoutPinnableItem(this.f$0, this.f$3, (LazyLayoutPinnedItemList) obj4, (ComposableLambdaImpl) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.LocalBrandLocationCheckedInSheet((Modifier) obj4, (LocalBrandProfileViewModel.Fulfillment.InStore) obj3, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 3:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.MoreOptionsDropdownMenu((Modifier) obj4, (Function1) obj3, (LocalBrandProfileViewModel.MoreOptionsMenuModel) obj5, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                LocalMenuHoursViewKt.LocalMenuHoursView((Modifier) obj4, (MenuHours) obj3, (TextStyle) obj5, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 5:
                ((Integer) obj2).getClass();
                MarketingMessageKt.MarketingMessage((Modifier) obj4, (MarketingMessageViewModel) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 6:
                ((Integer) obj2).getClass();
                MarketingMessageKt.MarketingMessages((Modifier) obj4, (MarketingMessagesViewModel) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 7:
                ((Integer) obj2).getClass();
                AddressTypeaheadKt.AddressTypeahead((AddressTypeaheadState) obj3, (Modifier) obj4, (String) obj5, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(4097);
                ASTUtilKt.PatternStamps((Modifier) obj4, this.f$3, this.f$4, (PatternStampState) obj3, (StampMovingListener) obj5, (Composer) obj, updateChangedFlags);
                break;
            case 9:
                ((Integer) obj2).getClass();
                BadgeTitleKt.AccountSwitcherContent((AccountSwitcherViewModel) obj3, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((SectionHeaderScope) obj3).DefaultHeaderContainer((Modifier) obj4, (ComposableLambdaImpl) obj5, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 11:
                ((Integer) obj2).getClass();
                LegalSectionKt.MoneyBarCreditHeaderSection((AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader) obj3, (Modifier) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 12:
                ((Integer) obj2).getClass();
                ModalKt.ProgressBranded((Modifier) obj4, (LoadingAnimationAssets) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 13:
                ((Integer) obj2).getClass();
                zzabw.HorizontalStackedAvatars((AvatarSize) obj3, (ImmutableList) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 14:
                ((Integer) obj2).getClass();
                LazyListLayoutInfoKt.Timeline((TimelineState) obj3, (ImmutableList) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 15:
                ((Integer) obj2).getClass();
                BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencyContent((BitcoinDisplayCurrencyViewModel) obj3, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 16:
                ((Integer) obj2).getClass();
                BitcoinPerformanceSummaryViewKt.BitcoinPerformanceSummaryView((BitcoinPerformanceSummaryViewModel) obj3, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 17:
                ((Integer) obj2).getClass();
                BitcoinDepositsViewKt.BitcoinDepositContent((BitcoinDepositsViewModel) obj3, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 18:
                ((Integer) obj2).getClass();
                BitcoinAddressCopySheetViewKt.DepositCopyError((BitcoinDepositCopyViewModel.Error) obj3, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 19:
                ((Integer) obj2).getClass();
                BitcoinExchangeViewKt.BitcoinExchangeAtmPicker((BitcoinTransferViewModel.Content.BottomSheetContent) obj3, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 20:
                ((Integer) obj2).getClass();
                BitcoinMapViewKt.BitcoinLocationFilterSheet((BitcoinLocationFilter) obj3, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 21:
                ((Integer) obj2).getClass();
                SendStablecoinViewKt.StablecoinDepositOptionsContent((Modifier) obj4, (StablecoinDepositOptionsViewModel) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 22:
                ((Integer) obj2).getClass();
                SendStablecoinViewKt.StablecoinDepositContent((StablecoinDepositViewModel$Loaded) obj3, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 23:
                ((Integer) obj2).getClass();
                SsnViewKt.Content((SavingsTransferOptionSelectionViewModel.Content) obj3, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 24:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(24577);
                GridLayout.AccessibleCardCell(this.f$3, this.f$4, (String) obj3, (Function0) obj4, (ComposableLambdaImpl) obj5, (Composer) obj, updateChangedFlags2);
                break;
            case 25:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(7);
                CashAppPayStackedAvatarKt.m3445InTransactionTopUpInfoSheetOWMNXiA((Modifier) obj4, this.f$3, this.f$4, (TextStyle) obj3, (Function1) obj5, (Composer) obj, updateChangedFlags3);
                break;
            case 26:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(49);
                DirectDepositFormErrorKt.PaycheckInputCard((DirectDepositEditPaycheckAmountViewModel) obj3, (PaycheckDepositAllocationType) obj4, this.f$3, this.f$4, (Function1) obj5, (Composer) obj, updateChangedFlags4);
                break;
            case 27:
                ((Integer) obj2).getClass();
                LoadingErrorKt.KeyStatsSection((EarningsTrackerViewModel.Loaded) obj3, (Function0) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 28:
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                zzie.EducationStoryContent(this.f$3, (EducationStoryViewModel) obj3, (Function1) obj4, (ColorModel) obj5, composer, updateChangedFlags5);
                break;
            default:
                ((Integer) obj2).getClass();
                AllowanceViewKt.FamilyMemberCard((FamilyMemberRowViewModel) obj3, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OrderStatusRowKt$$ExternalSyntheticLambda1(int i, EducationStoryViewModel educationStoryViewModel, Function1 function1, ColorModel colorModel, int i2) {
        this.$r8$classId = 28;
        this.f$3 = i;
        this.f$0 = educationStoryViewModel;
        this.f$1 = function1;
        this.f$2 = colorModel;
        this.f$4 = i2;
    }

    public /* synthetic */ OrderStatusRowKt$$ExternalSyntheticLambda1(Modifier modifier, int i, int i2, Object obj, Object obj2, int i3, int i4) {
        this.$r8$classId = i4;
        this.f$1 = modifier;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
    }

    public /* synthetic */ OrderStatusRowKt$$ExternalSyntheticLambda1(Modifier modifier, Object obj, Object obj2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = modifier;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = i;
        this.f$4 = i2;
    }

    public /* synthetic */ OrderStatusRowKt$$ExternalSyntheticLambda1(DirectDepositEditPaycheckAmountViewModel directDepositEditPaycheckAmountViewModel, PaycheckDepositAllocationType paycheckDepositAllocationType, int i, int i2, Function1 function1, int i3) {
        this.$r8$classId = 26;
        this.f$0 = directDepositEditPaycheckAmountViewModel;
        this.f$1 = paycheckDepositAllocationType;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$2 = function1;
    }

    public /* synthetic */ OrderStatusRowKt$$ExternalSyntheticLambda1(Object obj, int i, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, ComposableLambdaImpl composableLambdaImpl, int i2) {
        this.$r8$classId = 1;
        this.f$0 = obj;
        this.f$3 = i;
        this.f$1 = lazyLayoutPinnedItemList;
        this.f$2 = composableLambdaImpl;
        this.f$4 = i2;
    }

    public /* synthetic */ OrderStatusRowKt$$ExternalSyntheticLambda1(Object obj, Modifier modifier, Object obj2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = modifier;
        this.f$2 = obj2;
        this.f$3 = i;
        this.f$4 = i2;
    }

    public /* synthetic */ OrderStatusRowKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Modifier modifier, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = modifier;
        this.f$3 = i;
        this.f$4 = i2;
    }
}
