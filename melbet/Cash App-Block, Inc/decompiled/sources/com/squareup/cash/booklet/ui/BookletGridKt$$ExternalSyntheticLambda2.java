package com.squareup.cash.booklet.ui;

import androidx.camera.video.internal.DebugUtils;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.BackwardsCompatNodeKt;
import androidx.compose.ui.text.TextStyle;
import app.cash.arcade.values.TitleBarAction;
import coil3.RealImageLoader;
import coil3.network.NetworkFetcher$fetch$2;
import com.google.android.gms.internal.common.zzj;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.InputDropdownScope;
import com.squareup.cash.arcade.components.input.SelectionCardColors;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.treehouse.TitleBarCoreBinding;
import com.squareup.cash.arcade.treehouse.TitleBarSubBinding;
import com.squareup.cash.avatar.components.StackedAvatarsKt;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.viewmodels.AccountDetailsContent;
import com.squareup.cash.banking.views.BankingDialogKt;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewModel$Loaded;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.borrow.views.BorrowHomeKt;
import com.squareup.cash.card.onboarding.CardPreviewViewKt;
import com.squareup.cash.card.onboarding.CardPreviewViewModel;
import com.squareup.cash.card.onboarding.ProductDetailsPageViewModel;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.cashapppay.views.LegacyGrantSheetKt;
import com.squareup.cash.checks.CaptureCheckFaceKt;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.checks.MiSnapState;
import com.squareup.cash.common.composeui.InfoUpsellContentScope;
import com.squareup.cash.common.composeui.widgets.LinkStyle;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewModel;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.graphics.views.TextureViewFpsTracker;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.ui.util.RealCashScreenBrightness;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.StackedAvatarView$TextSize;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.util.coroutines.FirstOrNullOnTimeoutKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import squareup.cash.ui.arcade.elements.PageHeader;

/* loaded from: classes5.dex */
public final /* synthetic */ class BookletGridKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$5;

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(InfoUpsellContentScope infoUpsellContentScope, Icons icons, String str, String str2, int i) {
        this.$r8$classId = 26;
        this.f$0 = infoUpsellContentScope;
        this.f$2 = icons;
        this.f$1 = str;
        this.f$3 = str2;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$3;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                BookletGridKt.BookletGrid((Modifier) obj6, (String) obj4, (Function0) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1), this.f$5);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((SheetAppMessageView) obj6).Content((RealSheetState) obj4, (SheetAppMessageModel) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                SwitchViewKt.PageHeaderProtoBinding((PageHeader) obj4, (Function2) obj3, (Modifier) obj6, (TextStyle) obj5, (Composer) obj, Updater.updateChangedFlags(1), this.f$5);
                break;
            case 3:
                ((Integer) obj2).getClass();
                DebugUtils.AvatarCarousel((ImmutableList) obj4, (Function1) obj5, (Modifier) obj6, (LazyListState) obj3, (Composer) obj, Updater.updateChangedFlags(1), this.f$5);
                break;
            case 4:
                ((Integer) obj2).getClass();
                InputChipKt.InputDropdownItem((InputDropdownScope) obj4, (Function0) obj3, (Modifier) obj6, (ComposableLambdaImpl) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                InputChipKt.SelectionCardContent((ComposableLambdaImpl) obj4, (ComposableLambdaImpl) obj3, (SelectionCardColors) obj5, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((TitleBarCoreBinding) obj6).Action((TitleBarActionScope) obj4, (TitleBarAction) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                int i3 = TitleBarSubBinding.$r8$clinit;
                ((TitleBarSubBinding) obj6).Action$1((TitleBarActionScope) obj4, (TitleBarAction) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                StackedAvatarsKt.Single((StackedAvatarViewModel.Single) obj4, (Modifier) obj6, (Function3) obj3, (StackedAvatarView$TextSize) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                StackedAvatarsKt.Trio((StackedAvatarViewModel.Trio) obj4, (Modifier) obj6, (Function3) obj3, (StackedAvatarView$TextSize) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                StackedAvatarsKt.Duo((StackedAvatarViewModel.Duo) obj4, (Modifier) obj6, (Function3) obj3, (StackedAvatarView$TextSize) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                PagerKt.BalanceAppletTileUI((BalanceAppletTileViewModel) obj6, (AppletTile.AppletTileAppearance) obj4, (NetworkFetcher$fetch$2) obj3, (ElementBoundsRegistry) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                BankingDialogKt.AccountAndRoutingNumbersSection((String) obj4, (AccountDetailsContent) obj6, (Function0) obj3, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                BitcoinDepositsViewKt.BitcoinDepositsView((BitcoinDepositsViewModel) obj4, (Function1) obj5, (RealCashScreenBrightness) obj3, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                BitcoinExchangeViewKt.BitcoinExchangeContent((BitcoinTransferViewModel) obj6, (Function1) obj5, (RealImageLoader) obj4, (BitcoinTransferScreen) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                SendStablecoinViewKt.SendStablecoinView((SendStablecoinModel) obj4, (Function1) obj5, (RealCashVibrator) obj3, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                SendStablecoinViewKt.StablecoinDepositView((StablecoinDepositViewModel$Loaded) obj4, (Function1) obj5, (RealCashScreenBrightness) obj3, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                BackwardsCompatNodeKt.BitcoinExchangeFullScreenUi((BitcoinTransferViewModel) obj4, (Function1) obj5, (RealImageLoader) obj3, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                AmountBlockerViewKt.AmountBlocker((AmountPickerViewModel) obj6, (Function1) obj5, (RealCashVibrator) obj4, (AmountConfig) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                BorrowHomeKt.BorrowHome((BorrowHomeViewModel) obj4, (Function1) obj5, (Modifier) obj6, (LazyListState) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                BorrowHomeKt.LoadableFirstTimeBorrow((FirstTimeBorrowViewModel) obj4, (Function1) obj5, (Modifier) obj6, (ScrollState) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                BorrowHomeKt.FirstTimeBorrow((FirstTimeBorrowViewModel.Content) obj4, (Function1) obj5, (Modifier) obj6, (ScrollState) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                CardPreviewViewKt.CardPreview((Modifier) obj6, (CardPreviewViewModel) obj4, (Function1) obj5, (TextureViewFpsTracker) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                HeroSectionKt.ProductDetailsPageOverlay((ProductDetailsPageViewModel) obj4, (Function1) obj5, (Modifier) obj6, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                LegacyGrantSheetKt.LegacyGrantSheet((Modifier) obj6, (GrantViewModel.Main) obj4, (Function1) obj5, (MoneyFormatter) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                CaptureCheckFaceKt.MiSnap((Modifier) obj6, (MiSnapState) obj4, (CaptureCheckFaceViewModel.Loaded.ShowMiSnap) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ((InfoUpsellContentScope) obj6).InfoCell((Icons) obj3, (String) obj4, (String) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                FirstOrNullOnTimeoutKt.UpSellButton((Modifier) obj6, (LinkStyle) obj4, (Function0) obj3, (ComposableLambdaImpl) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                zzj.PromotionDetailsUi((PromotionDetailsViewModel) obj6, (Function1) obj5, (RealImageLoader) obj4, (CashTreehouseLayout) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                EarningsHeaderKt.EarningsHeader((EarningsHeaderViewModel) obj6, (Function1) obj5, (LocalizedMoneyFormatter.Factory) obj4, (ScreenScaffoldContentScope) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, SelectionCardColors selectionCardColors, Modifier modifier, int i) {
        this.$r8$classId = 5;
        this.f$1 = composableLambdaImpl;
        this.f$2 = composableLambdaImpl2;
        this.f$3 = selectionCardColors;
        this.f$0 = modifier;
        this.f$5 = i;
    }

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(Modifier modifier, String str, Function0 function0, Function1 function1, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = function0;
        this.f$3 = function1;
        this.f$5 = i2;
    }

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(InputDropdownScope inputDropdownScope, Function0 function0, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 4;
        this.f$1 = inputDropdownScope;
        this.f$2 = function0;
        this.f$0 = modifier;
        this.f$3 = composableLambdaImpl;
        this.f$5 = i;
    }

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = obj4;
        this.f$5 = i;
    }

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$5 = i;
    }

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Function function, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = obj2;
        this.f$2 = function;
        this.f$3 = obj3;
        this.f$5 = i;
    }

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(Object obj, Function1 function1, Modifier modifier, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$3 = function1;
        this.f$0 = modifier;
        this.f$2 = obj2;
        this.f$5 = i;
    }

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(Object obj, Function1 function1, Object obj2, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$3 = function1;
        this.f$2 = obj2;
        this.f$0 = modifier;
        this.f$5 = i;
    }

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(Object obj, Function1 function1, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = function1;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$5 = i;
    }

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(ImmutableList immutableList, Function1 function1, Modifier modifier, LazyListState lazyListState, int i, int i2) {
        this.$r8$classId = 3;
        this.f$1 = immutableList;
        this.f$3 = function1;
        this.f$0 = modifier;
        this.f$2 = lazyListState;
        this.f$5 = i2;
    }

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda2(PageHeader pageHeader, Function2 function2, Modifier modifier, TextStyle textStyle, int i, int i2) {
        this.$r8$classId = 2;
        this.f$1 = pageHeader;
        this.f$2 = function2;
        this.f$0 = modifier;
        this.f$3 = textStyle;
        this.f$5 = i2;
    }
}
