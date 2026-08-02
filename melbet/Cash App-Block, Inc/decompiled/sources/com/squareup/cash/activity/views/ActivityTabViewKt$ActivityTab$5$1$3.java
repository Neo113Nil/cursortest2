package com.squareup.cash.activity.views;

import android.content.ComponentName;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.zxing.Result;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.R;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.OrderActivityData;
import com.squareup.cash.activity.presenters.ActivityFeedCallbackEvent$RefreshFeed;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.BalanceFeedPresenter$WhenMappings;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter$models$3$1;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.activity.screens.BalanceFeedScreen;
import com.squareup.cash.activity.viewmodels.ActivityCustomerModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.BalanceFeedViewEvent;
import com.squareup.cash.activity.viewmodels.BalanceFeedViewModel;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewEvent;
import com.squareup.cash.advertising.presenters.FullscreenAdPresenter;
import com.squareup.cash.advertising.presenters.FullscreenAdPresenter$models$2$1;
import com.squareup.cash.advertising.presenters.FullscreenAdPresenter$models$2$2;
import com.squareup.cash.advertising.viewmodels.FullscreenAdEvent;
import com.squareup.cash.afterpayapplet.backend.HomeResult;
import com.squareup.cash.afterpayapplet.backend.RetroOrderSelectionResult;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1;
import com.squareup.cash.afterpayapplet.presenters.FilteredActivitiesManager;
import com.squareup.cash.afterpayapplet.presenters.FilteredActivitiesManager$activities$$inlined$map$1$2$1;
import com.squareup.cash.afterpayapplet.presenters.FilteredActivitiesManager$activities$lambda$0$1$$inlined$sortedBy$1;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletInfoSheet;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletRetroOrderSelectionViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletUpsellSheetViewEvent;
import com.squareup.cash.agents.applets.screens.AgentsHomeScreen;
import com.squareup.cash.agents.applets.viewmodels.AgentsAppletTileViewEvent$AgentsAppletOnClickTile;
import com.squareup.cash.agents.applets.viewmodels.AgentsAppletTileViewModel;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.db.CardMessage;
import com.squareup.cash.appmessages.db.InlineMessage;
import com.squareup.cash.appmessages.db.InlineMessageV2;
import com.squareup.cash.appmessages.db.PopupMessage;
import com.squareup.cash.appmessages.db.SheetMessage;
import com.squareup.cash.appmessages.holders.PendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.appmessages.holders.PendingInlineMessageHolder;
import com.squareup.cash.appmessages.holders.PendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.appmessages.holders.PendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.appmessages.holders.PendingPopupMessageHolder$CardTabPlacementHolder;
import com.squareup.cash.appmessages.holders.PendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewEvent;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.banking.viewmodels.ConfirmCashOutDialogViewEvent$TapButton;
import com.squareup.cash.benefits.presenters.BankingBenefitsBookletPresenter;
import com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewEvent;
import com.squareup.cash.benefits.viewmodels.PdsaBenefitsExplainerViewEvent;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphPresenter$State;
import com.squareup.cash.bitcoin.presenters.BitcoinKeypadStateStore$State;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter$models$5$2;
import com.squareup.cash.bitcoin.presenters.RealBitcoinKeypadStateStore;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinNoteQuestion;
import com.squareup.cash.bitcoin.screens.BitcoinPerformanceDetailsScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountPickerResult;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewEvent;
import com.squareup.cash.bitcoin.viewmodels.BitcoinPayInUsdSettingsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.disabled.DependentBitcoinDisabledViewEvent$CtaClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.pendingidv.BitcoinHomePendingIdvWidgetViewEvent$PendingIdvClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.performance.BitcoinPerformanceSummaryViewEvent$DetailsClicked;
import com.squareup.cash.bitcoin.viewmodels.keypad.BitcoinAmountEntrySource;
import com.squareup.cash.bitcoin.viewmodels.keypad.BitcoinKeypadEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.screens.LiteAddMoneyScreen;
import com.squareup.cash.cashapplite.screens.LiteBalanceHomeScreen;
import com.squareup.cash.cashapplite.screens.LiteCashOutScreen;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.QABItemOrigin;
import com.squareup.cash.cdf.QABItemType;
import com.squareup.cash.cdf.appmessage.AppMessageInteractClick;
import com.squareup.cash.cdf.appmessage.AppMessageInteractShareCompleted;
import com.squareup.cash.cdf.bankingbenefitsbooklet.BankingBenefitsBookletTapClose;
import com.squareup.cash.cdf.bankingbenefitsbooklet.BankingBenefitsBookletTapPrimaryButton;
import com.squareup.cash.cdf.bankingbenefitspdsahalfsheet.BankingBenefitsPDSAHalfsheetTapButton;
import com.squareup.cash.cdf.crypto.CryptoInteractPerformanceDetails;
import com.squareup.cash.cdf.crypto.CryptoSendSubmitAmount;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractShareCompleted;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.sponsoredaccount.DependentBalanceType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountBalanceDetailGraphTimeUnitChange;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.crypto.primitives.BitcoinFeature;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.earnings.screens.PayerTaggingPromptSheet;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.family.familyhub.screens.DependentControlsAndLimitsScreen;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.merchant.screens.BackNavigationAction;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.work.presenters.WorkReviewTermsBanner$configFlow$$inlined$map$1;
import com.squareup.protos.cash.activity.api.v1.OrderRow;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.util.android.ShareResultsReceiver$ShareResult;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.GrpcStatus;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.bankingbenefits.ui.GreenBookletV1;
import squareup.cash.bankingbenefits.ui.VersionedGreenBooklet;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public final class ActivityTabViewKt$ActivityTab$5$1$3 implements FlowCollector {
    public final /* synthetic */ Object $feedEntries$delegate;
    public final /* synthetic */ Object $lazyListState;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ActivityTabViewKt$ActivityTab$5$1$3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$lazyListState = obj;
        this.$feedEntries$delegate = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$bitcoin$presenters$RealBitcoinKeypadStateStore$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Money money;
        String str;
        RealBitcoinKeypadStateStore realBitcoinKeypadStateStore = (RealBitcoinKeypadStateStore) this.$lazyListState;
        RealProfileManager realProfileManager = realBitcoinKeypadStateStore.profileManager;
        Analytics analytics = realBitcoinKeypadStateStore.analytics;
        MutableState mutableState = (MutableState) this.$feedEntries$delegate;
        BitcoinKeypadEvent bitcoinKeypadEvent = (BitcoinKeypadEvent) obj;
        if (bitcoinKeypadEvent instanceof BitcoinKeypadEvent.UpdateRateStrategy) {
            BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State = (BitcoinKeypadStateStore$State) mutableState.getValue();
            BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy rateStrategy = BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy.POLL;
            mutableState.setValue(BitcoinKeypadStateStore$State.copy$default(bitcoinKeypadStateStore$State, null, null, null, null, null, null, null, null, false, 3967));
        } else if (bitcoinKeypadEvent instanceof BitcoinKeypadEvent.SwitchCurrency) {
            CurrencyCode currencyCode = ((BitcoinKeypadStateStore$State) mutableState.getValue()).getConvertedAmount().currency_code;
            BitcoinDisplayUnits bitcoinDisplayUnits = ((BitcoinKeypadStateStore$State) mutableState.getValue()).displayUnits;
            currencyCode.getClass();
            realProfileManager.setBitcoinAmountEntryCurrencyPreference(currencyCode);
            RealBitcoinKeypadStateStore.lastCurrency = currencyCode;
            AndroidAccessibilityManager androidAccessibilityManager = realBitcoinKeypadStateStore.accessibilityManager;
            bitcoinDisplayUnits.getClass();
            String name = RealBitcoinKeypadStateStore.WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()] == 1 ? bitcoinDisplayUnits.name() : currencyCode.name();
            AndroidStringManager androidStringManager = realBitcoinKeypadStateStore.stringManager;
            name.getClass();
            Resources resources = androidStringManager.resources;
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.switch_currency_announcement)).format(new Object[]{name});
            format2.getClass();
            androidAccessibilityManager.announceForAccessibility(format2);
            mutableState.setValue(BitcoinKeypadStateStore$State.copy$default((BitcoinKeypadStateStore$State) mutableState.getValue(), ((BitcoinKeypadStateStore$State) mutableState.getValue()).getConvertedAmount(), null, null, null, null, null, null, null, false, 4092));
        } else if (bitcoinKeypadEvent instanceof BitcoinKeypadEvent.AmountChanged) {
            BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State2 = (BitcoinKeypadStateStore$State) mutableState.getValue();
            String str2 = ((BitcoinKeypadEvent.AmountChanged) bitcoinKeypadEvent).rawAmount;
            CurrencyCode currencyCode2 = RealBitcoinKeypadStateStore.lastCurrency;
            BitcoinDisplayUnits bitcoinDisplayUnits2 = bitcoinKeypadStateStore$State2.displayUnits;
            Money money2 = bitcoinKeypadStateStore$State2.transferAmount;
            if (bitcoinDisplayUnits2 != null && money2 != null) {
                if (currencyCode2 != null) {
                    money2.getClass();
                    CurrencyCode currencyCode3 = money2.currency_code;
                    currencyCode3.getClass();
                    if (currencyCode2 != currencyCode3) {
                        currencyCode2.getClass();
                        money = BitcoinKeypadStateStore$State.copy$default(bitcoinKeypadStateStore$State2, realBitcoinKeypadStateStore.toMoney(str2, currencyCode2, bitcoinDisplayUnits2), null, null, null, null, null, null, null, false, 4094).getConvertedAmount();
                        Money money3 = money;
                        if (currencyCode2 != null) {
                            money2.getClass();
                            CurrencyCode currencyCode4 = money2.currency_code;
                            currencyCode4.getClass();
                            if (currencyCode2 != currencyCode4) {
                                str = null;
                                bitcoinKeypadStateStore$State2 = BitcoinKeypadStateStore$State.copy$default(bitcoinKeypadStateStore$State2, money3, str, null, null, null, null, null, null, false, 4092);
                            }
                        }
                        str = str2;
                        bitcoinKeypadStateStore$State2 = BitcoinKeypadStateStore$State.copy$default(bitcoinKeypadStateStore$State2, money3, str, null, null, null, null, null, null, false, 4092);
                    }
                }
                CurrencyCode currencyCode5 = money2.currency_code;
                currencyCode5.getClass();
                money = realBitcoinKeypadStateStore.toMoney(str2, currencyCode5, bitcoinDisplayUnits2);
                Money money32 = money;
                if (currencyCode2 != null) {
                }
                str = str2;
                bitcoinKeypadStateStore$State2 = BitcoinKeypadStateStore$State.copy$default(bitcoinKeypadStateStore$State2, money32, str, null, null, null, null, null, null, false, 4092);
            }
            mutableState.setValue(bitcoinKeypadStateStore$State2);
        } else if (bitcoinKeypadEvent instanceof BitcoinKeypadEvent.Transfer) {
            BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State3 = (BitcoinKeypadStateStore$State) mutableState.getValue();
            CryptoPaymentOrigin cryptoPaymentOrigin = ((BitcoinKeypadEvent.Transfer) bitcoinKeypadEvent).origin;
            boolean isReady = bitcoinKeypadStateStore$State3.isReady();
            Money money4 = bitcoinKeypadStateStore$State3.minimumWithdrawalLimit;
            Money money5 = bitcoinKeypadStateStore$State3.availableBalance;
            if (isReady) {
                if (Moneys.compareTo(bitcoinKeypadStateStore$State3.getBitcoinAmount(), money5) <= 0 && Moneys.compareTo(bitcoinKeypadStateStore$State3.getBitcoinAmount(), money4) >= 0) {
                    analytics.track(new CryptoSendSubmitAmount(), null);
                    realBitcoinKeypadStateStore.navigator.goTo(new PaymentScreens.MainPayment(bitcoinKeypadStateStore$State3.getBitcoinAmount(), Orientation.CASH, AppCreationActivity.HOMESCREEN, RealUuidGenerator.generate(), PaymentScreens.MainPayment.SendCryptoCurrencyType.BTC, cryptoPaymentOrigin, null, null, 118264));
                } else if (Moneys.compareTo(bitcoinKeypadStateStore$State3.getBitcoinAmount(), money5) > 0) {
                    analytics.track(new CryptoSendSubmitAmount(), null);
                } else if (Moneys.compareTo(bitcoinKeypadStateStore$State3.getBitcoinAmount(), money4) < 0) {
                    analytics.track(new CryptoSendSubmitAmount(), null);
                }
            }
            mutableState.setValue(bitcoinKeypadStateStore$State3);
        } else {
            if (!(bitcoinKeypadEvent instanceof BitcoinKeypadEvent.SetMaxAmount)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State4 = (BitcoinKeypadStateStore$State) mutableState.getValue();
            if (bitcoinKeypadStateStore$State4.isReady()) {
                CurrencyCode currencyCode6 = CurrencyCode.BTC;
                realProfileManager.setBitcoinAmountEntryCurrencyPreference(currencyCode6);
                RealBitcoinKeypadStateStore.lastCurrency = currencyCode6;
                bitcoinKeypadStateStore$State4 = BitcoinKeypadStateStore$State.copy$default(bitcoinKeypadStateStore$State4, bitcoinKeypadStateStore$State4.availableBalance, null, null, null, null, null, null, null, false, 4092);
            }
            mutableState.setValue(bitcoinKeypadStateStore$State4);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0566  */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v49 */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        String key;
        Object obj2;
        UiCustomer uiSender;
        String str;
        Money money;
        GetProfileDetailsContext getProfileDetailsContext;
        Screen profileFor;
        FilteredActivitiesManager$activities$$inlined$map$1$2$1 filteredActivitiesManager$activities$$inlined$map$1$2$1;
        int i;
        List list;
        boolean contains;
        PendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1 pendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1;
        int i2;
        PendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1 pendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1;
        int i3;
        PendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1 pendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1;
        int i4;
        PendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1 pendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1;
        int i5;
        Event appMessageInteractShareCompleted;
        HalfSheetMessage halfSheetMessage;
        zzjr zzjrVar;
        DetailsPage access$getDetailsPage;
        GreenBookletV1 greenBookletV1;
        GreenBookletV1.BookletFooterButton bookletFooterButton;
        RealBitcoinGraphPresenter$State copy$default;
        int i6 = this.$r8$classId;
        int i7 = 2;
        int i8 = 9;
        Back back = Back.INSTANCE;
        Object obj3 = this.$feedEntries$delegate;
        Object obj4 = this.$lazyListState;
        PayerTaggingPromptSheet payerTaggingPromptSheet = 0;
        r14 = null;
        r14 = null;
        String str2 = null;
        r14 = null;
        PopupMessage popupMessage = null;
        r14 = null;
        InlineMessageV2 inlineMessageV2 = null;
        r14 = null;
        InlineMessage inlineMessage = null;
        r14 = null;
        CardMessage cardMessage = null;
        MerchantScreen$MerchantProfileScreen merchantScreen$MerchantProfileScreen = null;
        r14 = null;
        String str3 = null;
        BalanceFeedViewModel.InfoSheet infoSheet = null;
        payerTaggingPromptSheet = 0;
        switch (i6) {
            case 0:
                Pair pair = (Pair) obj;
                String str4 = (String) pair.first;
                String str5 = (String) pair.second;
                int i9 = ActivityTabViewKt.$r8$clinit;
                LazyListState lazyListState = (LazyListState) obj4;
                ActivityFeedEntry activityFeedEntry = (ActivityFeedEntry) CollectionsKt.getOrNull(lazyListState.scrollPosition.index$delegate.getIntValue(), (List) ((MutableState) obj3).getValue());
                if (activityFeedEntry != null && (key = activityFeedEntry.getKey()) != null) {
                    if (!key.equals(str4) || Intrinsics.areEqual(str4, str5)) {
                        break;
                    } else {
                        Object animateScrollToItem = lazyListState.animateScrollToItem(0, 0, continuation);
                        if (animateScrollToItem != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                    }
                } else {
                    break;
                }
                break;
            case 1:
                Iterable iterable = ((Activities) obj).recentActivities;
                if (iterable == null) {
                    iterable = EmptyList.INSTANCE;
                }
                iterable.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : iterable) {
                    if (obj5 instanceof PaymentHistoryActivityItem) {
                        arrayList.add(obj5);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        PaymentHistoryActivityItem paymentHistoryActivityItem = (PaymentHistoryActivityItem) obj2;
                        if (!Intrinsics.areEqual(paymentHistoryActivityItem.getUiPayment().show_customer_tagging_prompt, Boolean.TRUE) || paymentHistoryActivityItem.getUiPayment().amount == null || paymentHistoryActivityItem.getRole() != Role.RECIPIENT) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                PaymentHistoryActivityItem paymentHistoryActivityItem2 = (PaymentHistoryActivityItem) obj2;
                if (paymentHistoryActivityItem2 != null && (str = (uiSender = paymentHistoryActivityItem2.getUiSender()).id) != null) {
                    String str6 = uiSender.full_name;
                    String str7 = str6 != null ? str6 : "";
                    Character monogram = GrpcStatus.Companion.monogram(str6);
                    Color uiColor = ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, str, uiSender.full_name, null, null));
                    String str8 = uiSender.photo_url;
                    Money money2 = paymentHistoryActivityItem2.getUiPayment().amount;
                    money2.getClass();
                    payerTaggingPromptSheet = new PayerTaggingPromptSheet(str, str7, monogram, uiColor, str8, money2);
                }
                if (payerTaggingPromptSheet != 0 && ((Set) obj4).add(payerTaggingPromptSheet.payerToken)) {
                    ((ActivityTabPresenter) obj3).navigator.goTo(payerTaggingPromptSheet);
                }
                break;
            case 2:
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj4;
                BalanceFeedViewEvent balanceFeedViewEvent = (BalanceFeedViewEvent) obj;
                if (Intrinsics.areEqual(balanceFeedViewEvent, BalanceFeedViewEvent.Exit.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator).goTo(back);
                } else if (!(balanceFeedViewEvent instanceof BalanceFeedViewEvent.ToggleInfoSheet)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    MutableState mutableState = (MutableState) obj3;
                    if (((BalanceFeedViewEvent.ToggleInfoSheet) balanceFeedViewEvent).open) {
                        AndroidStringManager androidStringManager = (AndroidStringManager) cardStudioPresenter.ioContext;
                        if (BalanceFeedPresenter$WhenMappings.$EnumSwitchMapping$0[((BalanceFeedScreen) cardStudioPresenter.args).balanceType.ordinal()] != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            infoSheet = new BalanceFeedViewModel.InfoSheet(androidStringManager.get(R.string.balance_feed_sheet_title_cash), androidStringManager.get(R.string.balance_feed_sheet_body_cash));
                        }
                    }
                    mutableState.setValue(infoSheet);
                }
                break;
            case 3:
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj;
                ProduceStateScope produceStateScope = (ProduceStateScope) obj4;
                if (balanceSnapshot != null && (money = balanceSnapshot.balance) != null) {
                    str3 = ((MoneyFormatter) ((CardStudioPresenter) obj3).appConfig).format(money);
                }
                produceStateScope.setValue(str3);
                break;
            case 4:
                ContactHeaderViewEvent contactHeaderViewEvent = (ContactHeaderViewEvent) obj;
                if (contactHeaderViewEvent instanceof ContactHeaderViewEvent.ContactClickById) {
                    for (ActivityCustomerModel activityCustomerModel : (List) ((State) obj3).getValue()) {
                        if (Intrinsics.areEqual(activityCustomerModel.customerId, ((ContactHeaderViewEvent.ContactClickById) contactHeaderViewEvent).customerId)) {
                            DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj4;
                            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                            ActivityAnalyticsService activityAnalyticsService = (ActivityAnalyticsService) disclosurePresenter.appService;
                            boolean z = ((Screen) disclosurePresenter.launcher) instanceof GlobalSearchScreen;
                            GetProfileDetailsContext getProfileDetailsContext2 = z ? GetProfileDetailsContext.GLOBAL_SEARCH : GetProfileDetailsContext.ACTIVITY_OTHER;
                            MerchantData merchantData = activityCustomerModel.merchantData;
                            String str9 = activityCustomerModel.customerId;
                            boolean z2 = (merchantData == null && activityCustomerModel.isLoyaltyOnly) ? false : true;
                            if (z2) {
                                if (str9 == null || !(StringsKt__StringsJVMKt.startsWith(str9, "M_", false) || StringsKt__StringsJVMKt.startsWith(str9, "BRAND_", false))) {
                                    getProfileDetailsContext = getProfileDetailsContext2;
                                } else {
                                    getProfileDetailsContext = getProfileDetailsContext2;
                                    merchantScreen$MerchantProfileScreen = new MerchantScreen$MerchantProfileScreen(new RedactedString(str9), getProfileDetailsContext2, null, BackNavigationAction.CLOSE, null);
                                }
                                if (merchantScreen$MerchantProfileScreen != null) {
                                    ((RealActivityAnalyticsService) activityAnalyticsService).trackSelectQabItem(QABItemType.MERCHANT, str9, z ? QABItemOrigin.GLOBAL_SEARCH : QABItemOrigin.ACTIVITY);
                                    screenNavigator.goTo(merchantScreen$MerchantProfileScreen);
                                }
                            } else {
                                getProfileDetailsContext = getProfileDetailsContext2;
                            }
                            ((RealActivityAnalyticsService) activityAnalyticsService).trackSelectQabItem(QABItemType.P2P, str9, z ? QABItemOrigin.GLOBAL_SEARCH : QABItemOrigin.ACTIVITY);
                            LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                            ProfileScreens.ProfileScreen.Customer.CashCustomer cashCustomer = new ProfileScreens.ProfileScreen.Customer.CashCustomer(str9, activityCustomerModel.isBusiness);
                            ProfileScreens.ProfileScreen.Action.ActionType actionType = ProfileScreens.ProfileScreen.Action.ActionType.PAY;
                            profileFor = ProfileLauncher.profileFor((ProfileScreens.ProfileScreen.Customer) cashCustomer, ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST, ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE, RealUuidGenerator.generate(), getProfileDetailsContext, CustomerProfileViewOpen.EntryPoint.QUICK_ACCESS_AVATAR, (Screen) ActivityScreen.INSTANCE, false, (ProfileScreens.ProfileScreen.ProfileAnalytics) null, (String) null, !z2, (BlockersData.MoneybotContext) null);
                            screenNavigator.goTo(profileFor);
                        }
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                    break;
                }
                break;
            case 5:
                CoroutineScope coroutineScope = (CoroutineScope) obj4;
                if (Intrinsics.areEqual((ActivityFeedCallbackEvent$RefreshFeed) obj, ActivityFeedCallbackEvent$RefreshFeed.INSTANCE)) {
                    JobKt.launch$default(coroutineScope, null, null, new ReceiptPresenter$models$3$1((ReceiptPresenter) obj3, null, 0), 3);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 6:
                ScrollState scrollState = (ScrollState) obj3;
                ((ProduceStateScope) obj4).setValue(Boolean.valueOf((((Number) obj).intValue() >= 0 && scrollState.getCanScrollForward() && scrollState.getCanScrollBackward()) ? false : true));
                break;
            case 7:
                FullscreenAdPresenter fullscreenAdPresenter = (FullscreenAdPresenter) obj3;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj4;
                FullscreenAdEvent fullscreenAdEvent = (FullscreenAdEvent) obj;
                if (fullscreenAdEvent instanceof FullscreenAdEvent.Close) {
                    JobKt.launch$default(coroutineScope2, null, null, new FullscreenAdPresenter$models$2$1(r10 ? 1 : 0, fullscreenAdPresenter, payerTaggingPromptSheet), 3);
                } else if (fullscreenAdEvent instanceof FullscreenAdEvent.TapActionButton) {
                    JobKt.launch$default(coroutineScope2, null, null, new FullscreenAdPresenter$models$2$2(fullscreenAdPresenter, fullscreenAdEvent, null, 0), 3);
                } else if (fullscreenAdEvent instanceof FullscreenAdEvent.Retry) {
                    fullscreenAdPresenter.analytics.track(new AppMessageInteractClick(null, null, AppMessageFormat.FULL_SCREEN, fullscreenAdPresenter.args.token, null, 39), null);
                } else if (fullscreenAdEvent instanceof FullscreenAdEvent.VolumeChange) {
                    JobKt.launch$default(coroutineScope2, null, null, new FullscreenAdPresenter$models$2$2(fullscreenAdPresenter, fullscreenAdEvent, null, 1), 3);
                } else if (fullscreenAdEvent instanceof FullscreenAdEvent.HasAudioTrack) {
                    JobKt.launch$default(coroutineScope2, null, null, new FullscreenAdPresenter$models$2$1(i7, fullscreenAdPresenter, payerTaggingPromptSheet), 3);
                } else if (!(fullscreenAdEvent instanceof FullscreenAdEvent.PlaybackBuffer)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    fullscreenAdPresenter.bufferMillis += ((FullscreenAdEvent.PlaybackBuffer) fullscreenAdEvent).durationMillis;
                }
                break;
            case 8:
                HomeResult homeResult = (HomeResult) obj;
                if (homeResult instanceof HomeResult.Empty) {
                    ((AfterpayAppletPurchasesEmbeddedPresenter) obj4).navigator.goTo(new MoneyTabScreen(null));
                }
                Map map = AfterpayAppletPurchasesEmbeddedPresenter.refreshAttributePurchase;
                ((MutableState) obj3).setValue(homeResult);
                break;
            case 9:
                break;
            case 10:
                AfterpayAppletUpsellSheetViewModel afterpayAppletUpsellSheetViewModel = (AfterpayAppletUpsellSheetViewModel) obj3;
                DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) obj4;
                RealRouter realRouter = (RealRouter) disclosurePresenter2.args;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) disclosurePresenter2.navigator;
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = (RealAfterpayAppletAnalytics) disclosurePresenter2.appService;
                AfterpayAppletUpsellSheetViewEvent afterpayAppletUpsellSheetViewEvent = (AfterpayAppletUpsellSheetViewEvent) obj;
                boolean z3 = afterpayAppletUpsellSheetViewEvent instanceof AfterpayAppletHomeViewEvent.TapActionEvent;
                Back back2 = Back.INSTANCE;
                if (z3) {
                    AfterpayAppletHomeViewEvent.TapActionEvent tapActionEvent = (AfterpayAppletHomeViewEvent.TapActionEvent) afterpayAppletUpsellSheetViewEvent;
                    Tap tap = tapActionEvent.tap;
                    List list2 = tapActionEvent.analyticsAppletTappedEvent;
                    if (list2 != null) {
                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                        realAfterpayAppletAnalytics.trackGenericAnalyticsEvents(list2, emptyMap);
                    }
                    if (tap instanceof Tap.Url) {
                        realRouter.route(new RoutingParams((AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen) disclosurePresenter2.analytics, null, back2, null, null, null, HttpStatusCode.BAD_GATEWAY_502), ((Tap.Url) tap).actionUrl);
                    } else if (tap instanceof Tap.Info) {
                        InfoSheet infoSheet2 = ((Tap.Info) tap).info;
                        LocalizedString localizedString = infoSheet2.title;
                        String translated = localizedString != null ? StringsKt.translated(localizedString) : "";
                        LocalizedString localizedString2 = infoSheet2.subtitle;
                        screenNavigator2.goTo(new AfterpayAppletScreen$AfterpayAppletInfoSheet("AfterpayAppletUpsellSheet", translated, localizedString2 != null ? StringsKt.translated(localizedString2) : null, null, infoSheet2.cta_button, infoSheet2.analytic_view_event, infoSheet2.analytic_dismiss_event, infoSheet2.avatar));
                    } else if (tap instanceof Tap.Dismiss) {
                        screenNavigator2.goTo(back2);
                    } else if (!(tap instanceof Tap.ScrollTo)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        AskedQuestion askedQuestion = ((AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen) disclosurePresenter2.analytics).question;
                        if (askedQuestion != null) {
                            screenNavigator2.giveAnswer(askedQuestion, ((Tap.ScrollTo) tap).id);
                        } else {
                            screenNavigator2.goTo(back2);
                        }
                    }
                } else if (afterpayAppletUpsellSheetViewEvent instanceof AfterpayAppletUpsellSheetViewEvent.UrlTapped) {
                    realRouter.route(new RoutingParams((AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen) disclosurePresenter2.analytics, null, null, null, null, null, 510), ((AfterpayAppletUpsellSheetViewEvent.UrlTapped) afterpayAppletUpsellSheetViewEvent).url);
                } else if (afterpayAppletUpsellSheetViewEvent instanceof AfterpayAppletUpsellSheetViewEvent.SheetViewed) {
                    List list3 = afterpayAppletUpsellSheetViewModel.analyticsViewEvent;
                    if (list3 != null) {
                        EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                        emptyMap2.getClass();
                        realAfterpayAppletAnalytics.trackImpressionAnalyticsEvents(list3, emptyMap2);
                    }
                } else if (!(afterpayAppletUpsellSheetViewEvent instanceof AfterpayAppletUpsellSheetViewEvent.Dismiss)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    List list4 = afterpayAppletUpsellSheetViewModel.analyticsDismissEvent;
                    if (list4 != null) {
                        EmptyMap emptyMap3 = EmptyMap.INSTANCE;
                        emptyMap3.getClass();
                        realAfterpayAppletAnalytics.trackGenericAnalyticsEvents(list4, emptyMap3);
                    }
                    screenNavigator2.goTo(back2);
                }
                break;
            case 11:
                AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType orderActivityType = ((FilteredActivitiesManager) obj3).orderActivityType;
                if (continuation instanceof FilteredActivitiesManager$activities$$inlined$map$1$2$1) {
                    filteredActivitiesManager$activities$$inlined$map$1$2$1 = (FilteredActivitiesManager$activities$$inlined$map$1$2$1) continuation;
                    int i10 = filteredActivitiesManager$activities$$inlined$map$1$2$1.label;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        filteredActivitiesManager$activities$$inlined$map$1$2$1.label = i10 - PKIFailureInfo.systemUnavail;
                        Object obj6 = filteredActivitiesManager$activities$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = filteredActivitiesManager$activities$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            FlowCollector flowCollector = (FlowCollector) obj4;
                            Activities activities = (Activities) obj;
                            List list5 = activities.recentActivities;
                            if (list5 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj7 : list5) {
                                    if (obj7 instanceof OrderActivityData) {
                                        arrayList2.add(obj7);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    OrderActivityData orderActivityData = (OrderActivityData) next;
                                    int ordinal = orderActivityType.ordinal();
                                    if (ordinal == 0) {
                                        contains = ArraysKt___ArraysKt.toSet(new OrderRow.OrderRowLoanUiState[]{OrderRow.OrderRowLoanUiState.DUE, OrderRow.OrderRowLoanUiState.OVERDUE}).contains(orderActivityData.orderRowState);
                                    } else if (ordinal != 1) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        contains = ArraysKt___ArraysKt.toSet(new OrderRow.OrderRowLoanUiState[]{OrderRow.OrderRowLoanUiState.COMPLETED, OrderRow.OrderRowLoanUiState.REFUNDED, OrderRow.OrderRowLoanUiState.CANCELLED}).contains(orderActivityData.orderRowState);
                                    }
                                    if (contains) {
                                        arrayList3.add(next);
                                    }
                                }
                                list = arrayList3;
                                if (orderActivityType == AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType.UPCOMING) {
                                    list = CollectionsKt.sortedWith(arrayList3, new FilteredActivitiesManager$activities$lambda$0$1$$inlined$sortedBy$1(0));
                                }
                            } else {
                                list = null;
                            }
                            Activities copy$default2 = Activities.copy$default(activities, list, null, 30);
                            filteredActivitiesManager$activities$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(copy$default2, filteredActivitiesManager$activities$$inlined$map$1$2$1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                filteredActivitiesManager$activities$$inlined$map$1$2$1 = new FilteredActivitiesManager$activities$$inlined$map$1$2$1(this, continuation);
                Object obj62 = filteredActivitiesManager$activities$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = filteredActivitiesManager$activities$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
            case 12:
                if (Intrinsics.areEqual((AgentsAppletTileViewEvent$AgentsAppletOnClickTile) obj, AgentsAppletTileViewEvent$AgentsAppletOnClickTile.INSTANCE)) {
                    EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj4;
                    AgentsAppletTileViewModel agentsAppletTileViewModel = (AgentsAppletTileViewModel) ((State) obj3).getValue();
                    Navigator navigator = (Navigator) endAppLockPresenter.accountOutboundNavigator;
                    if (agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Installed) {
                        navigator.goTo(new AgentsHomeScreen(false));
                    } else if (agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Uninstalled) {
                        navigator.goTo(FlowStarter.startPlasmaFlow$default((FlowStarter) endAppLockPresenter.appLockState, Flow$Type.AGENT_CREATION, new AgentsHomeScreen(true), null, null, 12));
                    } else if (!(agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Loading) && !(agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
                break;
            case 13:
                if (continuation instanceof PendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1) {
                    pendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1 = (PendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1) continuation;
                    int i11 = pendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                    if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                        pendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                        Object obj8 = pendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = pendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            FlowCollector flowCollector2 = (FlowCollector) obj4;
                            CardMessage cardMessage2 = (CardMessage) CollectionsKt.firstOrNull((List) obj);
                            if (cardMessage2 != null && cardMessage2.placement == ((CardMessage.Placement) ((WorkReviewTermsBanner$configFlow$$inlined$map$1) obj3).$this_unsafeTransform$inlined)) {
                                cardMessage = cardMessage2;
                            }
                            pendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector2.emit(cardMessage, pendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj8);
                        }
                        break;
                    }
                }
                pendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1 = new PendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj82 = pendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = pendingCardMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                break;
            case 14:
                if (continuation instanceof PendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1) {
                    pendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1 = (PendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1) continuation;
                    int i12 = pendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                    if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                        pendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                        Object obj9 = pendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = pendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            FlowCollector flowCollector3 = (FlowCollector) obj4;
                            InlineMessage inlineMessage2 = (InlineMessage) CollectionsKt.firstOrNull((List) obj);
                            if (inlineMessage2 != null && inlineMessage2.placement == ((PendingInlineMessageHolder) obj3).placement) {
                                inlineMessage = inlineMessage2;
                            }
                            pendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector3.emit(inlineMessage, pendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1) == coroutineSingletons4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj9);
                        }
                        break;
                    }
                }
                pendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1 = new PendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj92 = pendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = pendingInlineMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
                break;
            case 15:
                if (continuation instanceof PendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1) {
                    pendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1 = (PendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1) continuation;
                    int i13 = pendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                    if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                        pendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1.label = i13 - PKIFailureInfo.systemUnavail;
                        Object obj10 = pendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = pendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            FlowCollector flowCollector4 = (FlowCollector) obj4;
                            InlineMessageV2 inlineMessageV22 = (InlineMessageV2) CollectionsKt.firstOrNull((List) obj);
                            if (inlineMessageV22 != null && inlineMessageV22.placement == ((InlineV2Message.Placement) ((WorkReviewTermsBanner$configFlow$$inlined$map$1) obj3).$this_unsafeTransform$inlined)) {
                                inlineMessageV2 = inlineMessageV22;
                            }
                            pendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector4.emit(inlineMessageV2, pendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1) == coroutineSingletons5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj10);
                        }
                        break;
                    }
                }
                pendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1 = new PendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj102 = pendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = pendingInlineMessageV2Holder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
                break;
            case 16:
                if (continuation instanceof PendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1) {
                    pendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1 = (PendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1) continuation;
                    int i14 = pendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                    if ((i14 & PKIFailureInfo.systemUnavail) != 0) {
                        pendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label = i14 - PKIFailureInfo.systemUnavail;
                        Object obj11 = pendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = pendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            FlowCollector flowCollector5 = (FlowCollector) obj4;
                            PopupMessage popupMessage2 = (PopupMessage) CollectionsKt.firstOrNull((List) obj);
                            if (popupMessage2 != null && popupMessage2.placement == ((PendingPopupMessageHolder$CardTabPlacementHolder) obj3).placement) {
                                popupMessage = popupMessage2;
                            }
                            pendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector5.emit(popupMessage, pendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1) == coroutineSingletons6) {
                                break;
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj11);
                        }
                        break;
                    }
                }
                pendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1 = new PendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj112 = pendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = pendingPopupMessageHolder$current_delegate$lambda$0$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
                break;
            case 17:
                CardStudioPresenter cardStudioPresenter2 = (CardStudioPresenter) obj3;
                CoroutineContext coroutineContext = (CoroutineContext) cardStudioPresenter2.ioContext;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj4;
                AppMessageViewEvent appMessageViewEvent = (AppMessageViewEvent) obj;
                if (Intrinsics.areEqual(appMessageViewEvent, AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) cardStudioPresenter2.navigator);
                } else if (appMessageViewEvent instanceof AppMessageViewEvent.AppMessageActionTaken) {
                    JobKt.launch$default(coroutineScope3, coroutineContext, null, new SearchBarBinding$Content$1$1(appMessageViewEvent, cardStudioPresenter2, payerTaggingPromptSheet, 23), 2);
                } else if (appMessageViewEvent instanceof AppMessageViewEvent.AppMessageViewed) {
                    JobKt.launch$default(coroutineScope3, coroutineContext, null, new MLKitTitleGenerator$prepareModel$1(cardStudioPresenter2, appMessageViewEvent, payerTaggingPromptSheet, i8), 2);
                }
                break;
            case 18:
                ShareResultsReceiver$ShareResult shareResultsReceiver$ShareResult = (ShareResultsReceiver$ShareResult) obj;
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj4;
                Analytics analytics = (Analytics) localCashBalancePresenter.analytics;
                String str10 = (String) localCashBalancePresenter.screen;
                String str11 = ((SheetAppMessage) localCashBalancePresenter.syncer).messageToken;
                MutableState mutableState2 = (MutableState) obj3;
                SheetMessage sheetMessage = (SheetMessage) mutableState2.getValue();
                String str12 = (sheetMessage == null || (halfSheetMessage = sheetMessage.message_format) == null || (zzjrVar = halfSheetMessage.secondaryNavigationAction) == null || (access$getDetailsPage = QuirkSettingsLoader.access$getDetailsPage(zzjrVar)) == null) ? null : access$getDetailsPage.token;
                ComponentName componentName = shareResultsReceiver$ShareResult.componentName;
                String packageName = componentName != null ? componentName.getPackageName() : null;
                SheetMessage sheetMessage2 = (SheetMessage) mutableState2.getValue();
                String str13 = sheetMessage2 != null ? sheetMessage2.metadata_id : null;
                if (str12 != null) {
                    appMessageInteractShareCompleted = new DetailsPageInteractShareCompleted(null, null, str12, str10, null, packageName, 19);
                } else {
                    AppMessageFormat appMessageFormat = AppMessageFormat.FULL_SCREEN;
                    appMessageInteractShareCompleted = new AppMessageInteractShareCompleted(str13, str11, packageName);
                }
                analytics.track(appMessageInteractShareCompleted, null);
                break;
            case 19:
                TransfersPresenter transfersPresenter = (TransfersPresenter) obj4;
                Navigator navigator2 = (Navigator) transfersPresenter.featureFlagManager;
                BalanceAppletTileViewEvent balanceAppletTileViewEvent = (BalanceAppletTileViewEvent) obj;
                if (Intrinsics.areEqual(balanceAppletTileViewEvent, BalanceAppletTileViewEvent.BalanceAppletObfuscationToggled.INSTANCE)) {
                    JobKt.launch$default((CoroutineScope) transfersPresenter.issuedCardManager, null, null, new AmountPickerCondensedView.AnonymousClass14(transfersPresenter, null, 9), 3);
                } else {
                    boolean areEqual = Intrinsics.areEqual(balanceAppletTileViewEvent, BalanceAppletTileViewEvent.BalanceAppletOnClickAddCash.INSTANCE);
                    LiteAddMoneyScreen liteAddMoneyScreen = LiteAddMoneyScreen.INSTANCE;
                    if (areEqual) {
                        navigator2.goTo(liteAddMoneyScreen);
                    } else if (Intrinsics.areEqual(balanceAppletTileViewEvent, BalanceAppletTileViewEvent.BalanceAppletOnClickUninstalledRow.INSTANCE)) {
                        ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) transfersPresenter.syncValueReader)).submitSelectItemEvent(ItemId.LITE_UNINSTALLED_BALANCE.INSTANCE, null, MoneySelectAction.TAP);
                        navigator2.goTo(liteAddMoneyScreen);
                    } else if (Intrinsics.areEqual(balanceAppletTileViewEvent, BalanceAppletTileViewEvent.BalanceAppletOnClickCashOut.INSTANCE)) {
                        BalanceAppletTileViewModel balanceAppletTileViewModel = (BalanceAppletTileViewModel) ((State) obj3).getValue();
                        BalanceAppletTileViewModel.Loaded loaded = balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loaded ? (BalanceAppletTileViewModel.Loaded) balanceAppletTileViewModel : null;
                        if (loaded != null) {
                            navigator2.goTo(new LiteCashOutScreen(new Money(new Long(loaded.getRawBalance()), CurrencyCode.USD, 4)));
                        }
                    } else if (Intrinsics.areEqual(balanceAppletTileViewEvent, BalanceAppletTileViewEvent.BalanceAppletOnClickTile.INSTANCE)) {
                        navigator2.goTo(LiteBalanceHomeScreen.INSTANCE);
                    }
                }
                break;
            case 20:
                CoroutineScope coroutineScope4 = (CoroutineScope) obj4;
                ConfirmCashOutDialogViewEvent$TapButton confirmCashOutDialogViewEvent$TapButton = (ConfirmCashOutDialogViewEvent$TapButton) obj;
                if (confirmCashOutDialogViewEvent$TapButton != null) {
                    JobKt.launch$default(coroutineScope4, null, null, new MLKitTitleGenerator$prepareModel$1(confirmCashOutDialogViewEvent$TapButton, (CardStudioPresenter) obj3, payerTaggingPromptSheet, 19), 3);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 21:
                BankingBenefitsBookletPresenter bankingBenefitsBookletPresenter = (BankingBenefitsBookletPresenter) obj4;
                RealRouter realRouter2 = bankingBenefitsBookletPresenter.router;
                Analytics analytics2 = bankingBenefitsBookletPresenter.analytics;
                BankingBenefitsBookletViewEvent bankingBenefitsBookletViewEvent = (BankingBenefitsBookletViewEvent) obj;
                if (Intrinsics.areEqual(bankingBenefitsBookletViewEvent, BankingBenefitsBookletViewEvent.Close.INSTANCE)) {
                    analytics2.track(new BankingBenefitsBookletTapClose(), null);
                    bankingBenefitsBookletPresenter.navigator.goTo(back);
                } else if (Intrinsics.areEqual(bankingBenefitsBookletViewEvent, BankingBenefitsBookletViewEvent.PrimaryFooterButtonClick.INSTANCE)) {
                    analytics2.track(new BankingBenefitsBookletTapPrimaryButton(), null);
                    VersionedGreenBooklet versionedGreenBooklet = (VersionedGreenBooklet) ((MutableState) obj3).getValue();
                    if (versionedGreenBooklet != null && (greenBookletV1 = versionedGreenBooklet.green_booklet_v1) != null && (bookletFooterButton = greenBookletV1.primary_footer_button) != null) {
                        str2 = bookletFooterButton.client_route;
                    }
                    realRouter2.route(new RoutingParams(null, null, null, null, null, null, 511), str2);
                } else if (bankingBenefitsBookletViewEvent instanceof BankingBenefitsBookletViewEvent.UrlClick) {
                    realRouter2.route(new RoutingParams(null, null, null, null, null, null, 511), ((BankingBenefitsBookletViewEvent.UrlClick) bankingBenefitsBookletViewEvent).url);
                }
                break;
            case 22:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj4;
                PdsaBenefitsExplainerViewEvent pdsaBenefitsExplainerViewEvent = (PdsaBenefitsExplainerViewEvent) obj;
                if (Intrinsics.areEqual(pdsaBenefitsExplainerViewEvent, PdsaBenefitsExplainerViewEvent.Close.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator).goTo(back);
                } else if (!Intrinsics.areEqual(pdsaBenefitsExplainerViewEvent, PdsaBenefitsExplainerViewEvent.PrimaryButtonClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((Analytics) localPosCheckInPresenter.launcher).track(new BankingBenefitsPDSAHalfsheetTapButton(), null);
                    RealRouter realRouter3 = (RealRouter) localPosCheckInPresenter.cameraPermissions;
                    CashGreenV1 cashGreenV1 = (CashGreenV1) ((State) obj3).getValue();
                    realRouter3.route(new RoutingParams(null, null, null, null, null, null, 511), cashGreenV1 != null ? cashGreenV1.client_route : null);
                }
                break;
            case 23:
                InvestingGraphViewEvent investingGraphViewEvent = (InvestingGraphViewEvent) obj;
                MutableState mutableState3 = (MutableState) obj3;
                if (investingGraphViewEvent instanceof InvestingGraphViewEvent.SelectRange) {
                    HistoricalRange historicalRange = ((InvestingGraphViewEvent.SelectRange) investingGraphViewEvent).range;
                    RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager = (RealDependentBalanceDetailLoggingManager) ((ErrorPresenter) obj4).navigator;
                    historicalRange.getClass();
                    String customerToken = realDependentBalanceDetailLoggingManager.dependentCustomerTokenRepository.getCustomerToken();
                    if (customerToken != null) {
                        realDependentBalanceDetailLoggingManager.analytics.track(new SponsoredAccountBalanceDetailGraphTimeUnitChange(DependentBalanceType.Bitcoin, customerToken, RealDependentBalanceDetailLoggingManager.mapHistoricalRange(historicalRange)), null);
                    }
                    copy$default = RealBitcoinGraphPresenter$State.copy$default((RealBitcoinGraphPresenter$State) mutableState3.getValue(), historicalRange, null, ((RealBitcoinGraphPresenter$State) mutableState3.getValue()).selectedRange != historicalRange, 10);
                } else if (!(investingGraphViewEvent instanceof InvestingGraphViewEvent.ScrubPoint)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    copy$default = RealBitcoinGraphPresenter$State.copy$default((RealBitcoinGraphPresenter$State) mutableState3.getValue(), null, null, false, 7);
                }
                mutableState3.setValue(copy$default);
                break;
            case 24:
                CardStudioPresenter cardStudioPresenter3 = (CardStudioPresenter) obj4;
                BitcoinPayInUsdSettingsViewEvent bitcoinPayInUsdSettingsViewEvent = (BitcoinPayInUsdSettingsViewEvent) obj;
                if (Intrinsics.areEqual(bitcoinPayInUsdSettingsViewEvent, BitcoinPayInUsdSettingsViewEvent.BackClick.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) cardStudioPresenter3.navigator).goTo(back);
                } else if (!(bitcoinPayInUsdSettingsViewEvent instanceof BitcoinPayInUsdSettingsViewEvent.ToggleClick)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    JobKt.launch$default((CoroutineScope) cardStudioPresenter3.appConfig, null, null, new MLKitTitleGenerator$prepareModel$1(cardStudioPresenter3, (State) obj3, payerTaggingPromptSheet, 22), 3);
                }
                break;
            case 25:
                MutableState mutableState4 = (MutableState) obj3;
                RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter = (RealBitcoinAmountPickerPresenter) obj4;
                SharedFlowImpl sharedFlowImpl = (SharedFlowImpl) realBitcoinAmountPickerPresenter.keypadEvents;
                Navigator navigator3 = (Navigator) realBitcoinAmountPickerPresenter.navigator;
                BitcoinAmountViewEvent bitcoinAmountViewEvent = (BitcoinAmountViewEvent) obj;
                if (bitcoinAmountViewEvent instanceof BitcoinAmountViewEvent.SwitchCurrency) {
                    StateFlowKt.emitOrThrow(sharedFlowImpl, new BitcoinKeypadEvent.SwitchCurrency(BitcoinAmountEntrySource.BITCOIN_SEND_TO_ADDRESS));
                } else if (!(bitcoinAmountViewEvent instanceof BitcoinAmountViewEvent.ConfirmPressed)) {
                    if (bitcoinAmountViewEvent instanceof BitcoinAmountViewEvent.AmountChanged) {
                        realBitcoinAmountPickerPresenter.initialAmount = null;
                        StateFlowKt.emitOrThrow(sharedFlowImpl, new BitcoinKeypadEvent.AmountChanged(((BitcoinAmountViewEvent.AmountChanged) bitcoinAmountViewEvent).rawAmount));
                    } else if (bitcoinAmountViewEvent instanceof BitcoinAmountViewEvent.BackPressed) {
                        navigator3.goTo(back);
                    } else if (!(bitcoinAmountViewEvent instanceof BitcoinAmountViewEvent.AddNote)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        navigator3.askQuestion(new BitcoinNoteQuestion(((RealBitcoinAmountPickerPresenter.State) mutableState4.getValue()).note), RealBitcoinAmountPickerPresenter$models$5$2.INSTANCE);
                    }
                } else if (!realBitcoinAmountPickerPresenter.hasError) {
                    BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State = ((RealBitcoinAmountPickerPresenter.State) mutableState4.getValue()).bitcoinKeypadState;
                    Money bitcoinAmount = bitcoinKeypadStateStore$State.getBitcoinAmount();
                    Money money3 = bitcoinKeypadStateStore$State.transferAmount;
                    money3.getClass();
                    BitcoinAmountPickerResult bitcoinAmountPickerResult = new BitcoinAmountPickerResult(bitcoinAmount, money3, ((RealBitcoinAmountPickerPresenter.State) mutableState4.getValue()).note);
                    AskedQuestion askedQuestion2 = ((BitcoinAmountPickerScreen) realBitcoinAmountPickerPresenter.args).askedQuestion;
                    if (askedQuestion2 == null) {
                        navigator3.goTo(new Finish(bitcoinAmountPickerResult));
                    } else {
                        navigator3.giveAnswer(askedQuestion2, bitcoinAmountPickerResult);
                    }
                    mutableState4.setValue(RealBitcoinAmountPickerPresenter.State.copy$default((RealBitcoinAmountPickerPresenter.State) mutableState4.getValue(), null, null, 5));
                }
                break;
            case 26:
                break;
            case 27:
                if (((BitcoinHomeViewEvent) obj) instanceof DependentBitcoinDisabledViewEvent$CtaClicked) {
                    String customerToken2 = ((RealDependentCustomerTokenRepository) ((Result) obj3).resultMetadata).getCustomerToken();
                    customerToken2.getClass();
                    ((BetterNavigator.ScreenNavigator) obj4).goTo(new DependentControlsAndLimitsScreen(customerToken2, false));
                }
                break;
            case 28:
                if (Intrinsics.areEqual((BitcoinHomePendingIdvWidgetViewEvent$PendingIdvClicked) obj, BitcoinHomePendingIdvWidgetViewEvent$PendingIdvClicked.INSTANCE)) {
                    ((RealCryptoFlowStarter) ((CryptoFlowStarter) ((n) obj4).c)).startCryptoIdvFlow(new BitcoinHome(null, null, null, null, 15), (BetterNavigator.ScreenNavigator) obj3, BitcoinFeature.FEATURE_UNSPECIFIED);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            default:
                if (Intrinsics.areEqual((BitcoinPerformanceSummaryViewEvent$DetailsClicked) obj, BitcoinPerformanceSummaryViewEvent$DetailsClicked.INSTANCE)) {
                    ((Analytics) ((e0) obj4).i).track(new CryptoInteractPerformanceDetails(), null);
                    ((BetterNavigator.ScreenNavigator) obj3).goTo(BitcoinPerformanceDetailsScreen.INSTANCE);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
        }
        return null;
    }

    public /* synthetic */ ActivityTabViewKt$ActivityTab$5$1$3(CoroutineScope coroutineScope, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.$lazyListState = obj;
        this.$feedEntries$delegate = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(RetroOrderSelectionResult retroOrderSelectionResult, Continuation continuation) {
        AfterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1 afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1;
        int i;
        MutableState mutableState;
        PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.$lazyListState;
        if (continuation instanceof AfterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1) {
            afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1 = (AfterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1) continuation;
            int i2 = afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (retroOrderSelectionResult instanceof RetroOrderSelectionResult.Empty) {
                        ((BetterNavigator.ScreenNavigator) poolsListPresenter.navigator).goTo(new MoneyTabScreen(null));
                    }
                    mutableState = (MutableState) this.$feedEntries$delegate;
                    afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1.L$1 = mutableState;
                    afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1.label = 1;
                    obj = PoolsListPresenter.access$toRetroOrderSelectionViewModel(poolsListPresenter, retroOrderSelectionResult, afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue((AfterpayAppletRetroOrderSelectionViewModel) obj);
                return Unit.INSTANCE;
            }
        }
        afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1 = new AfterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1(this, continuation);
        Object obj2 = afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = afterpayAppletRetroOrderSelectionPresenter$models$1$1$1$emit$1.label;
        if (i != 0) {
        }
        mutableState.setValue((AfterpayAppletRetroOrderSelectionViewModel) obj2);
        return Unit.INSTANCE;
    }
}
