package com.squareup.cash.offers.presenters;

import android.app.Activity;
import android.content.Intent;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.squareup.cash.NavigationModule$Companion;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.backend.BoostAction;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.CryptoTradeSide;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.benefitleaflet.BenefitLeafletClickClickLink;
import com.squareup.cash.cdf.benefitleaflet.BenefitLeafletClickClickPrimary;
import com.squareup.cash.cdf.benefitleaflet.BenefitLeafletDismissDismissLeaflet;
import com.squareup.cash.cdf.benefitleaflet.BenefitType;
import com.squareup.cash.cdf.browser.BrowserViewDismissRedemptionSheet;
import com.squareup.cash.cdf.browser.SheetDismissMechanism;
import com.squareup.cash.cdf.crypto.CryptoTradeSelectAutoInvest;
import com.squareup.cash.cdf.crypto.CryptoTradeSelectLimitOrder;
import com.squareup.cash.cdf.limits.LimitsInteractTapLimitTypeRow;
import com.squareup.cash.cdf.offers.AppLocation;
import com.squareup.cash.cdf.offers.OffersDismissTimelineSheet;
import com.squareup.cash.cdf.offers.OffersLockedOfferUpsellTappedCTA;
import com.squareup.cash.cdf.offers.Origin;
import com.squareup.cash.cdf.offers.SheetDismissOrigin;
import com.squareup.cash.cdf.stock.StockTradeCancelOrder;
import com.squareup.cash.cdf.stock.StockTradeSelectAutoInvest;
import com.squareup.cash.cdf.stock.StockTradeSelectCustomOrder;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.UtilsKt$toCdfEvent$2;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.presenters.custom.order.InvestingOrderTypeSelectionPresenter;
import com.squareup.cash.investing.presenters.families.InvestingDependentAutoInvestPresenter;
import com.squareup.cash.investing.presenters.metrics.InvestingKeyStatsPresenter;
import com.squareup.cash.investing.presenters.stockdetails.LastSelectedRange;
import com.squareup.cash.investing.presenters.teengraduation.StocksTransferEtaSheetPresenter;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingDetailTileViewEvent$KeyStatsDetailsClicked;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.SectionMoreInfoViewEvent;
import com.squareup.cash.investing.viewmodels.activity.InvestingEntityActivityHistoryViewEvent$TapBack;
import com.squareup.cash.investing.viewmodels.custom.order.CancelOrderViewEvent;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentLearnMoreSheetViewEvent$CloseClicked;
import com.squareup.cash.investing.viewmodels.keystats.InvestingKeyStatsDetailsViewEvent$Back;
import com.squareup.cash.investing.viewmodels.ordertype.InvestingOrderTypeSelectionViewEvent;
import com.squareup.cash.investing.viewmodels.teengraduation.StocksTransferEtaViewEvent$BackClicked;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.invitations.InviteErrorViewEvent$Close;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.limits.screens.LimitsSectionScreen;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitsSectionType;
import com.squareup.cash.limits.viewmodels.LimitsViewEvent;
import com.squareup.cash.marketcapabilities.viewmodels.MarketCapabilitiesErrorViewEvent$PositiveButtonClicked;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantBlockingScreen;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewEvent;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltyDetailsViewEvent;
import com.squareup.cash.moneybot.backend.api.managers.MoneybotDebugSettingsManager;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.presenters.MoneybotDebugOverlayState;
import com.squareup.cash.moneybot.screens.HomeSourceContext;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotPendingSheet$TransferOptionPicker;
import com.squareup.cash.moneybot.screens.MoneybotPreambleEditorScreen;
import com.squareup.cash.moneybot.screens.MoneybotTextInputAnswer;
import com.squareup.cash.moneybot.screens.MoneybotTextInputScreen;
import com.squareup.cash.moneybot.screens.RawMessagesScreen;
import com.squareup.cash.moneybot.viewmodels.MoneybotAutomationsViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotDebugOverlayViewEvent;
import com.squareup.cash.moneybot.viewmodels.RawMessagesViewEvent$Back;
import com.squareup.cash.moneybot.viewmodels.textinput.MoneybotTextInputViewEvent;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.nearby.viewmodels.NearbyOrderedListsViewEvent$OnBackClicked;
import com.squareup.cash.nfc.presenters.NfcNotAvailablePresenter;
import com.squareup.cash.nfc.viewmodels.NfcNotAvailableViewEvent;
import com.squareup.cash.observability.backend.real.bugsnag.BugsnagClientSandboxSetupTeardown;
import com.squareup.cash.observability.types.MetadataSection$SessionInfoSection;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$RewardMetadata;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersGreenStatusScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersRedemptionScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreen;
import com.squareup.cash.offers.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersGreenStatusViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersNotificationEvent$Dismiss;
import com.squareup.cash.offers.viewmodels.viewevents.OffersRedemptionViewEvents$Close;
import com.squareup.cash.offers.viewmodels.viewevents.OffersTimelineViewEvent;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.screens.Back;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.Intents;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import okio.internal.ZipFilesKt;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public final class OffersDetailsPresenterV2$models$1$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public OffersDetailsPresenterV2$models$1$1$1(CoroutineScope coroutineScope, InvestingKeyStatsPresenter investingKeyStatsPresenter, MutableState mutableState) {
        this.$r8$classId = 8;
        this.this$0 = investingKeyStatsPresenter;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Screen recurringFrequencyPickerFullScreen;
        CryptoTradeSide cryptoTradeSide;
        LimitsInteractTapLimitTypeRow.LimitType limitType;
        int i = this.$r8$classId;
        LimitsViewEvent.ExitFlow exitFlow = LimitsViewEvent.ExitFlow.INSTANCE;
        Back back = Back.INSTANCE;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                BoostAction boostAction = (BoostAction) obj;
                if (!(boostAction instanceof BoostAction.Blockers)) {
                    if (!(boostAction instanceof BoostAction.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    ((CardLockPresenter) obj2).navigator.goTo(((BoostAction.Blockers) boostAction).screen);
                }
                break;
            case 1:
                MusicPresenter musicPresenter = (MusicPresenter) obj2;
                SectionMoreInfoViewEvent sectionMoreInfoViewEvent = (SectionMoreInfoViewEvent) obj;
                if (!Intrinsics.areEqual(sectionMoreInfoViewEvent, SectionMoreInfoViewEvent.CloseClick.INSTANCE)) {
                    if (!Intrinsics.areEqual(sectionMoreInfoViewEvent, SectionMoreInfoViewEvent.UrlTextClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        IntentLauncher intentLauncher = (IntentLauncher) musicPresenter.musicRepository;
                        String str = ((InvestingScreens.MoreInfoSheet) musicPresenter.args).moreInfo.url;
                        str.getClass();
                        intentLauncher.launchUrlInInternalBrowser(str);
                    }
                } else {
                    ((BetterNavigator.ScreenNavigator) musicPresenter.navigator).goTo(back);
                }
                break;
            case 2:
                if (((InvestingEntityActivityHistoryViewEvent$TapBack) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((LocalHomePresenter) obj2).navigator).goTo(back);
                    break;
                }
            case 3:
                MusicPresenter musicPresenter2 = (MusicPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) musicPresenter2.navigator;
                PaymentManager paymentManager = (PaymentManager) musicPresenter2.musicRepository;
                RealInvestingAnalytics realInvestingAnalytics = (RealInvestingAnalytics) musicPresenter2.musicPlayer;
                InvestingScreens.CancelScheduledOrderScreen cancelScheduledOrderScreen = (InvestingScreens.CancelScheduledOrderScreen) musicPresenter2.args;
                CancelOrderViewEvent cancelOrderViewEvent = (CancelOrderViewEvent) obj;
                if (!(cancelOrderViewEvent instanceof CancelOrderViewEvent.Confirm)) {
                    if (!Intrinsics.areEqual(cancelOrderViewEvent, CancelOrderViewEvent.Cancel.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        String str2 = cancelScheduledOrderScreen.paymentToken;
                        String str3 = cancelScheduledOrderScreen.flowToken;
                        str2.getClass();
                        str3.getClass();
                        realInvestingAnalytics.analytics.track(new StockTradeCancelOrder(str3, str2, Boolean.FALSE), null);
                        screenNavigator.goTo(back);
                    }
                } else {
                    String str4 = cancelScheduledOrderScreen.paymentToken;
                    String str5 = cancelScheduledOrderScreen.flowToken;
                    str4.getClass();
                    str5.getClass();
                    realInvestingAnalytics.analytics.track(new StockTradeCancelOrder(str5, str4, Boolean.TRUE), null);
                    int ordinal = cancelScheduledOrderScreen.f1156type.ordinal();
                    if (ordinal == 0) {
                        CancelOrderViewEvent.Confirm confirm = (CancelOrderViewEvent.Confirm) cancelOrderViewEvent;
                        String str6 = confirm.flowToken;
                        String str7 = confirm.paymentToken;
                        str6.getClass();
                        str7.getClass();
                        StateFlowKt.emitOrThrow(((RealPaymentManager) paymentManager).paymentActions, new PaymentAction.SendCancelInvestmentOrderAction(str6, str7));
                    } else if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        CancelOrderViewEvent.Confirm confirm2 = (CancelOrderViewEvent.Confirm) cancelOrderViewEvent;
                        String str8 = confirm2.flowToken;
                        String str9 = confirm2.paymentToken;
                        str8.getClass();
                        str9.getClass();
                        StateFlowKt.emitOrThrow(((RealPaymentManager) paymentManager).paymentActions, new PaymentAction.SendCancelCryptoOrderAction(str8, str9));
                    }
                    screenNavigator.goTo(back);
                }
                break;
            case 4:
                InvestingOrderTypeSelectionPresenter investingOrderTypeSelectionPresenter = (InvestingOrderTypeSelectionPresenter) obj2;
                IntentLauncher intentLauncher2 = investingOrderTypeSelectionPresenter.launcher;
                BetterNavigator.ScreenNavigator screenNavigator2 = investingOrderTypeSelectionPresenter.navigator;
                InvestingScreens.OrderTypeSelectionScreen orderTypeSelectionScreen = investingOrderTypeSelectionPresenter.args;
                InvestingOrderTypeSelectionViewEvent investingOrderTypeSelectionViewEvent = (InvestingOrderTypeSelectionViewEvent) obj;
                if (!Intrinsics.areEqual(investingOrderTypeSelectionViewEvent, InvestingOrderTypeSelectionViewEvent.CloseClick.INSTANCE)) {
                    if (!Intrinsics.areEqual(investingOrderTypeSelectionViewEvent, InvestingOrderTypeSelectionViewEvent.HelpClick.INSTANCE)) {
                        if (!(investingOrderTypeSelectionViewEvent instanceof InvestingOrderTypeSelectionViewEvent.OrderTypeClick)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            InvestingOrderTypeSelectionViewEvent.OrderTypeClick.Type type2 = ((InvestingOrderTypeSelectionViewEvent.OrderTypeClick) investingOrderTypeSelectionViewEvent).f1165type;
                            Analytics analytics = investingOrderTypeSelectionPresenter.analytics;
                            InvestingScreens.OrderTypeSelectionScreen.Type type3 = orderTypeSelectionScreen.f1159type;
                            OrderSide orderSide = orderTypeSelectionScreen.orderSide;
                            if (type3 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin) {
                                int ordinal2 = type2.ordinal();
                                if (ordinal2 == 0) {
                                    analytics.track(new CryptoTradeSelectAutoInvest(ZipFilesKt.getBitcoinTargetAsset(orderSide), ZipFilesKt.getBitcoinSourceAsset(orderSide)), null);
                                } else if (ordinal2 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    int ordinal3 = orderSide.ordinal();
                                    if (ordinal3 == 0) {
                                        cryptoTradeSide = CryptoTradeSide.BUY;
                                    } else if (ordinal3 != 1 && ordinal3 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        cryptoTradeSide = CryptoTradeSide.SELL;
                                    }
                                    analytics.track(new CryptoTradeSelectLimitOrder(cryptoTradeSide, ZipFilesKt.getBitcoinTargetAsset(orderSide), ZipFilesKt.getBitcoinSourceAsset(orderSide)), null);
                                }
                            }
                            RealInvestingAnalytics realInvestingAnalytics2 = investingOrderTypeSelectionPresenter.investingAnalytics;
                            InvestingScreens.OrderTypeSelectionScreen.Type type4 = orderTypeSelectionScreen.f1159type;
                            OrderSide orderSide2 = orderTypeSelectionScreen.orderSide;
                            InvestingScreens.OrderTypeSelectionScreen.Type.Equity equity = type4 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity ? (InvestingScreens.OrderTypeSelectionScreen.Type.Equity) type4 : null;
                            if (equity != null) {
                                String str10 = equity.symbol;
                                InvestmentEntityToken investmentEntityToken = equity.entityToken;
                                int ordinal4 = type2.ordinal();
                                if (ordinal4 == 0) {
                                    com.squareup.cash.cdf.stock.OrderSide cdf = ProcessPhoenix.toCdf(orderSide2);
                                    investmentEntityToken.getClass();
                                    str10.getClass();
                                    realInvestingAnalytics2.analytics.track(new StockTradeSelectAutoInvest(cdf, str10), null);
                                } else if (ordinal4 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    com.squareup.cash.cdf.stock.OrderSide cdf2 = ProcessPhoenix.toCdf(orderSide2);
                                    investmentEntityToken.getClass();
                                    str10.getClass();
                                    realInvestingAnalytics2.analytics.track(new StockTradeSelectCustomOrder(cdf2, str10), null);
                                }
                            }
                            int ordinal5 = type2.ordinal();
                            if (ordinal5 == 0) {
                                recurringFrequencyPickerFullScreen = new InvestingScreens.RecurringFrequencyPickerFullScreen(orderTypeSelectionScreen.f1159type, orderTypeSelectionScreen.prevScreenBottomSheet.getFrequency(), orderTypeSelectionScreen.accentColor, orderTypeSelectionScreen.prevScreenBottomSheet, orderTypeSelectionScreen.orderSide, orderTypeSelectionScreen.exitScreen, 192);
                            } else if (ordinal5 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                recurringFrequencyPickerFullScreen = new InvestingScreens.CustomOrderScreen(orderTypeSelectionScreen.f1159type, orderTypeSelectionScreen.orderSide, orderTypeSelectionScreen.accentColor);
                            }
                            screenNavigator2.goTo(recurringFrequencyPickerFullScreen);
                        }
                    } else {
                        InvestingScreens.OrderTypeSelectionScreen.Type type5 = orderTypeSelectionScreen.f1159type;
                        if (!(type5 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity)) {
                            if (!(type5 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                intentLauncher2.launchUrlInInternalBrowser("https://cash.app/help/us/en-us/3109-bitcoin-custom-orders");
                            }
                        } else {
                            intentLauncher2.launchUrlInInternalBrowser("https://cash.app/help/us/en-us/5028-order-types");
                        }
                    }
                } else {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, screenNavigator2);
                    screenNavigator2.goTo(orderTypeSelectionScreen.prevScreenBottomSheet);
                }
                break;
            case 5:
                if (!Intrinsics.areEqual((DividendReinvestmentLearnMoreSheetViewEvent$CloseClicked) obj, DividendReinvestmentLearnMoreSheetViewEvent$CloseClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((CardStudioUndoDialogPresenter) obj2).navigator.goTo(back);
                    break;
                }
            case 6:
                InvestingDependentAutoInvestPresenter investingDependentAutoInvestPresenter = (InvestingDependentAutoInvestPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator3 = investingDependentAutoInvestPresenter.navigator;
                InvestingHomeViewEvent investingHomeViewEvent = (InvestingHomeViewEvent) obj;
                if (investingHomeViewEvent instanceof InvestingHomeViewEvent.DependentAutoInvestClicked) {
                    String str11 = ((InvestingHomeViewEvent.DependentAutoInvestClicked) investingHomeViewEvent).recurringId;
                    screenNavigator3.goTo(new InvestingScreens.RecurringPurchaseReceipt(str11, ColorModel.Investing.INSTANCE, new InvestingScreens.RecurringPurchaseReceipt.Type.Stock(null, new InvestmentEntityToken(str11))));
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.DependentAutoInvestInfoClicked) {
                    String str12 = investingDependentAutoInvestPresenter.screen.dependentName;
                    str12.getClass();
                    screenNavigator3.goTo(new InvestingScreens.DependentAutoInvestBottomSheet(str12));
                }
                break;
            case 7:
                if (!Intrinsics.areEqual((InvestingKeyStatsDetailsViewEvent$Back) obj, InvestingKeyStatsDetailsViewEvent$Back.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((WorkHomePresenter) obj2).payPresenter).goTo(back);
                    break;
                }
            case 8:
                if (!(((InvestingDetailTileViewEvent$KeyStatsDetailsClicked) obj) instanceof InvestingDetailTileViewEvent$KeyStatsDetailsClicked)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    InvestingKeyStatsPresenter investingKeyStatsPresenter = (InvestingKeyStatsPresenter) obj2;
                    investingKeyStatsPresenter.navigator.goTo(new InvestingScreens.KeyStatsDetailsScreen(investingKeyStatsPresenter.entityToken));
                    break;
                }
            case 9:
                ((LastSelectedRange) obj2).range$delegate.setValue(null);
                break;
            case 10:
                if (((StocksTransferEtaViewEvent$BackClicked) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((StocksTransferEtaSheetPresenter) obj2).navigator.goTo(back);
                    break;
                }
            case 11:
                if (((StocksTransferEtaViewEvent$BackClicked) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((StocksTransferEtaSheetPresenter) obj2).navigator.goTo(back);
                    break;
                }
            case 12:
                if (!Intrinsics.areEqual((InviteErrorViewEvent$Close) obj, InviteErrorViewEvent$Close.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((InviteErrorPresenter) obj2).navigator);
                    break;
                }
            case 13:
                MusicPresenter musicPresenter3 = (MusicPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) musicPresenter3.navigator;
                LimitsViewEvent limitsViewEvent = (LimitsViewEvent) obj;
                if (!Intrinsics.areEqual(limitsViewEvent, exitFlow)) {
                    if (!(limitsViewEvent instanceof LimitsViewEvent.LimitsInlineMessageEvent)) {
                        if (!(limitsViewEvent instanceof LimitsViewEvent.LimitsSectionSelectedEvent)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            LimitViewModel limitViewModel = ((LimitsViewEvent.LimitsSectionSelectedEvent) limitsViewEvent).model;
                            LimitsSectionType limitsSectionType = limitViewModel.sectionType;
                            if (limitsSectionType == LimitsSectionType.UNKNOWN) {
                                a$$ExternalSyntheticBUOutline0.m$1("LimitsSectionType is UNKNOWN");
                                break;
                            } else {
                                Analytics analytics2 = (Analytics) musicPresenter3.musicPlayer;
                                limitsSectionType.getClass();
                                int ordinal6 = limitsSectionType.ordinal();
                                if (ordinal6 == 0) {
                                    limitType = null;
                                } else if (ordinal6 == 1) {
                                    limitType = LimitsInteractTapLimitTypeRow.LimitType.SEND_AND_RECEIVE;
                                } else if (ordinal6 == 2) {
                                    limitType = LimitsInteractTapLimitTypeRow.LimitType.DEPOSIT_AND_WITHDRAW;
                                } else if (ordinal6 == 3) {
                                    limitType = LimitsInteractTapLimitTypeRow.LimitType.CASH_CARD;
                                } else if (ordinal6 == 4) {
                                    limitType = LimitsInteractTapLimitTypeRow.LimitType.BITCOIN;
                                } else if (ordinal6 != 5) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    limitType = LimitsInteractTapLimitTypeRow.LimitType.STOCKS;
                                }
                                analytics2.track(new LimitsInteractTapLimitTypeRow(limitType), null);
                                screenNavigator4.goTo(new LimitsSectionScreen(NavigationModule$Companion.toSectionData(limitViewModel)));
                            }
                        }
                    }
                } else {
                    screenNavigator4.goTo(back);
                }
                break;
            case 14:
                if (Intrinsics.areEqual((LimitsViewEvent) obj, exitFlow)) {
                    ((BetterNavigator.ScreenNavigator) ((InviteErrorPresenter) obj2).navigator).goTo(back);
                }
                break;
            case 15:
                if (!Intrinsics.areEqual((MarketCapabilitiesErrorViewEvent$PositiveButtonClicked) obj, MarketCapabilitiesErrorViewEvent$PositiveButtonClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((AndroidActivityFinisher) ((VerifyCheckDialogPresenter) obj2).args).finish();
                    break;
                }
            case 16:
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj2;
                MerchantBlockingViewEvent merchantBlockingViewEvent = (MerchantBlockingViewEvent) obj;
                if (!Intrinsics.areEqual(merchantBlockingViewEvent, MerchantBlockingViewEvent.CloseClicked.INSTANCE)) {
                    if (!(merchantBlockingViewEvent instanceof MerchantBlockingViewEvent.RouterClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        MerchantBlockingViewEvent.RouterClicked routerClicked = (MerchantBlockingViewEvent.RouterClicked) merchantBlockingViewEvent;
                        ((RealRouter) localCashBalancePresenter.timestampFormatter).route(new RoutingParams((MerchantScreen$MerchantBlockingScreen) localCashBalancePresenter.service, null, null, null, null, null, 510), routerClicked.clientRoute);
                        CdfEvent cdfEvent = routerClicked.cdfEvent;
                        if (cdfEvent != null) {
                            ((Analytics) localCashBalancePresenter.analytics).track(new UtilsKt$toCdfEvent$2(cdfEvent, new Pair[0]), null);
                        }
                    }
                } else {
                    ((BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator).goTo(back);
                }
                break;
            case 17:
                ((BetterNavigator.ScreenNavigator) ((ShareSheetPresenter) obj2).navigator).goTo(((BoostAction.Blockers) obj).screen);
                break;
            case 18:
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj2;
                Analytics analytics3 = (Analytics) shareSheetPresenter.analytics;
                SquareLoyaltyDetailsViewEvent squareLoyaltyDetailsViewEvent = (SquareLoyaltyDetailsViewEvent) obj;
                if (!(squareLoyaltyDetailsViewEvent instanceof SquareLoyaltyDetailsViewEvent.LoyaltyGenericTreeElementsViewEvent)) {
                    if (!(squareLoyaltyDetailsViewEvent instanceof SquareLoyaltyDetailsViewEvent.GoBack)) {
                        if (!(squareLoyaltyDetailsViewEvent instanceof SquareLoyaltyDetailsViewEvent.SquareLoyaltyDetailsPlaceholderView)) {
                            if (!(squareLoyaltyDetailsViewEvent instanceof SquareLoyaltyDetailsViewEvent.SquareLoyaltyDetailsPlaceholderAction)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                SquareLoyaltyDetailsViewEvent.SquareLoyaltyDetailsPlaceholderAction squareLoyaltyDetailsPlaceholderAction = (SquareLoyaltyDetailsViewEvent.SquareLoyaltyDetailsPlaceholderAction) squareLoyaltyDetailsViewEvent;
                                final AnalyticsEvent analyticsEvent = squareLoyaltyDetailsPlaceholderAction.analytics;
                                if (analyticsEvent != null) {
                                    analytics3.track(new Event(analyticsEvent) { // from class: com.squareup.cash.integration.analytics.UtilsKt$toCdfEvent$1
                                        public final String name;
                                        public final Map parameters;

                                        {
                                            this.name = String.valueOf(analyticsEvent.name);
                                            this.parameters = analyticsEvent.parameters;
                                        }

                                        @Override // com.squareup.cash.cdf.Event
                                        public final String getName() {
                                            return this.name;
                                        }

                                        @Override // com.squareup.cash.cdf.Event
                                        public final Map getParameters() {
                                            return this.parameters;
                                        }
                                    }, null);
                                }
                                ((RealRouter) shareSheetPresenter.modelUpdates).route(new RoutingParams(null, null, null, null, null, null, 511), squareLoyaltyDetailsPlaceholderAction.url);
                            }
                        } else {
                            final AnalyticsEvent analyticsEvent2 = ((SquareLoyaltyDetailsViewEvent.SquareLoyaltyDetailsPlaceholderView) squareLoyaltyDetailsViewEvent).analytics;
                            if (analyticsEvent2 != null) {
                                analytics3.track(new Event(analyticsEvent2) { // from class: com.squareup.cash.integration.analytics.UtilsKt$toCdfEvent$1
                                    public final String name;
                                    public final Map parameters;

                                    {
                                        this.name = String.valueOf(analyticsEvent2.name);
                                        this.parameters = analyticsEvent2.parameters;
                                    }

                                    @Override // com.squareup.cash.cdf.Event
                                    public final String getName() {
                                        return this.name;
                                    }

                                    @Override // com.squareup.cash.cdf.Event
                                    public final Map getParameters() {
                                        return this.parameters;
                                    }
                                }, null);
                            }
                        }
                    } else {
                        ((BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator).goTo(back);
                    }
                }
                break;
            case 19:
                MoneybotAutomationsViewEvent moneybotAutomationsViewEvent = (MoneybotAutomationsViewEvent) obj;
                VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) obj2;
                if (!(moneybotAutomationsViewEvent instanceof MoneybotAutomationsViewEvent.SuggestionTapped)) {
                    if (!(moneybotAutomationsViewEvent instanceof MoneybotAutomationsViewEvent.TabToolbarEvent)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    ((BetterNavigator.ScreenNavigator) verifyCheckDialogPresenter.navigator).goTo(new MoneybotChatScreen(new ChatKickoffParams(null, CollectionsKt__CollectionsJVMKt.listOf(new Message.TextMessage(null, Message.Role.ROLE_USER, null, ((MoneybotAutomationsViewEvent.SuggestionTapped) moneybotAutomationsViewEvent).suggestion, false, false, 48)), 12), (MoneybotChatEntryPoint) null, (HomeSourceContext) null, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 62));
                }
                break;
            case 20:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) disclosurePresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                MoneybotDebugOverlayViewEvent moneybotDebugOverlayViewEvent = (MoneybotDebugOverlayViewEvent) obj;
                if (!Intrinsics.areEqual(moneybotDebugOverlayViewEvent, MoneybotDebugOverlayViewEvent.Dismiss.INSTANCE)) {
                    if (!Intrinsics.areEqual(moneybotDebugOverlayViewEvent, MoneybotDebugOverlayViewEvent.OpenTokenUsageOverlay.INSTANCE)) {
                        if (!Intrinsics.areEqual(moneybotDebugOverlayViewEvent, MoneybotDebugOverlayViewEvent.OpenMoneybotPreambleEditor.INSTANCE)) {
                            if (!(moneybotDebugOverlayViewEvent instanceof MoneybotDebugOverlayViewEvent.CopySessionId)) {
                                if (!Intrinsics.areEqual(moneybotDebugOverlayViewEvent, MoneybotDebugOverlayViewEvent.ShowOpenSessionByIdDialog.INSTANCE)) {
                                    if (!(moneybotDebugOverlayViewEvent instanceof MoneybotDebugOverlayViewEvent.OpenSessionById)) {
                                        if (!(moneybotDebugOverlayViewEvent instanceof MoneybotDebugOverlayViewEvent.ShowRawMessages)) {
                                            if (!Intrinsics.areEqual(moneybotDebugOverlayViewEvent, MoneybotDebugOverlayViewEvent.ToggleRawMarkdown.INSTANCE)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                ((MoneybotDebugSettingsManager) disclosurePresenter.blockersNavigator)._showRawMarkdown.updateState(null, Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                            }
                                        } else {
                                            screenNavigator5.goTo(new RawMessagesScreen(((MoneybotDebugOverlayViewEvent.ShowRawMessages) moneybotDebugOverlayViewEvent).sessionId));
                                        }
                                    } else {
                                        screenNavigator5.goTo(new MoneybotChatScreen(new ChatKickoffParams(((MoneybotDebugOverlayViewEvent.OpenSessionById) moneybotDebugOverlayViewEvent).sessionId, null, 11), (MoneybotChatEntryPoint) null, (HomeSourceContext) null, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 62));
                                    }
                                } else {
                                    parcelableSnapshotMutableState.setValue(MoneybotDebugOverlayState.OpenChatSessionDialog);
                                }
                            } else {
                                RealClipboardManager realClipboardManager = (RealClipboardManager) disclosurePresenter.launcher;
                                String str13 = ((MoneybotDebugOverlayViewEvent.CopySessionId) moneybotDebugOverlayViewEvent).sessionId;
                                realClipboardManager.copy(str13, str13);
                            }
                        } else {
                            screenNavigator5.goTo(MoneybotPreambleEditorScreen.INSTANCE);
                        }
                    } else {
                        parcelableSnapshotMutableState.setValue(MoneybotDebugOverlayState.TokenUsage);
                    }
                } else {
                    screenNavigator5.goTo(back);
                }
                break;
            case 21:
                VerifyCheckDialogPresenter verifyCheckDialogPresenter2 = (VerifyCheckDialogPresenter) obj2;
                MoneybotTextInputScreen moneybotTextInputScreen = (MoneybotTextInputScreen) verifyCheckDialogPresenter2.args;
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) verifyCheckDialogPresenter2.navigator;
                MoneybotTextInputViewEvent moneybotTextInputViewEvent = (MoneybotTextInputViewEvent) obj;
                if (!(moneybotTextInputViewEvent instanceof MoneybotTextInputViewEvent.ContinueTapped)) {
                    if (!Intrinsics.areEqual(moneybotTextInputViewEvent, MoneybotTextInputViewEvent.Dismissed.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator6.giveAnswer(moneybotTextInputScreen.askedQuestion, MoneybotTextInputAnswer.Dismissed.INSTANCE);
                    }
                } else {
                    screenNavigator6.giveAnswer(moneybotTextInputScreen.askedQuestion, new MoneybotTextInputAnswer.Selected(((MoneybotTextInputViewEvent.ContinueTapped) moneybotTextInputViewEvent).text));
                }
                break;
            case 22:
                if (!Intrinsics.areEqual((RawMessagesViewEvent$Back) obj, RawMessagesViewEvent$Back.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((WorkHomePresenter) obj2).payPresenter).goTo(back);
                    break;
                }
            case 23:
                if (((NearbyOrderedListsViewEvent$OnBackClicked) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator).goTo(back);
                    break;
                }
            case 24:
                NfcNotAvailablePresenter nfcNotAvailablePresenter = (NfcNotAvailablePresenter) obj2;
                NfcNotAvailableViewEvent nfcNotAvailableViewEvent = (NfcNotAvailableViewEvent) obj;
                if (!Intrinsics.areEqual(nfcNotAvailableViewEvent, NfcNotAvailableViewEvent.Dismiss.INSTANCE)) {
                    if (!Intrinsics.areEqual(nfcNotAvailableViewEvent, NfcNotAvailableViewEvent.GoToNfcSettings.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        Activity activity = nfcNotAvailablePresenter.launcher.activity;
                        String packageName = activity.getPackageName();
                        packageName.getClass();
                        Intent putExtra = new Intent("android.settings.NFC_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", packageName);
                        putExtra.getClass();
                        Intents.maybeStartActivity(activity, putExtra, new CameraX$$ExternalSyntheticLambda0(activity, 12));
                    }
                } else {
                    nfcNotAvailablePresenter.navigator.goTo(nfcNotAvailablePresenter.screen.exitScreen);
                }
                break;
            case 25:
                ((BugsnagClientSandboxSetupTeardown) obj2).bugsnagClient.addMetadata(MetadataSection$SessionInfoSection.INSTANCE, MetadataSection$SessionInfoSection.RegionKey.INSTANCE, (String) obj);
                break;
            case 26:
                DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) obj2;
                RealRouter realRouter = (RealRouter) disclosurePresenter2.args;
                Analytics analytics4 = (Analytics) disclosurePresenter2.analytics;
                OffersScreen$OffersGreenStatusScreen offersScreen$OffersGreenStatusScreen = (OffersScreen$OffersGreenStatusScreen) disclosurePresenter2.launcher;
                OffersGreenStatusViewEvent offersGreenStatusViewEvent = (OffersGreenStatusViewEvent) obj;
                if (!Intrinsics.areEqual(offersGreenStatusViewEvent, OffersGreenStatusViewEvent.SheetDismissed.INSTANCE$1)) {
                    if (!Intrinsics.areEqual(offersGreenStatusViewEvent, OffersGreenStatusViewEvent.SheetDismissed.INSTANCE)) {
                        if (!(offersGreenStatusViewEvent instanceof OffersGreenStatusViewEvent.UrlClicked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            analytics4.track(new BenefitLeafletClickClickLink(BenefitType.CUSTOM_WEEKLY_OFFERS), null);
                            realRouter.route(new RoutingParams(new OffersScreen$OffersGreenStatusScreen(offersScreen$OffersGreenStatusScreen.rewardToken), null, null, null, null, null, 510), ((OffersGreenStatusViewEvent.UrlClicked) offersGreenStatusViewEvent).url);
                        }
                    } else {
                        analytics4.track(new BenefitLeafletDismissDismissLeaflet(BenefitType.CUSTOM_WEEKLY_OFFERS), null);
                        ((BetterNavigator.ScreenNavigator) disclosurePresenter2.navigator).goTo(back);
                    }
                } else {
                    RealOffersAnalyticsV2 realOffersAnalyticsV2 = (RealOffersAnalyticsV2) disclosurePresenter2.blockersNavigator;
                    String str14 = offersScreen$OffersGreenStatusScreen.rewardToken;
                    str14.getClass();
                    RealOffersAnalyticsHelper realOffersAnalyticsHelper = realOffersAnalyticsV2.offersAnalyticsHelper;
                    OffersAnalyticsHelper$RewardMetadata offersAnalyticsHelper$RewardMetadata = (OffersAnalyticsHelper$RewardMetadata) realOffersAnalyticsHelper.getRewardMetadataDict().get(str14);
                    Analytics analytics5 = realOffersAnalyticsV2.analytics;
                    String str15 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.merchantToken : null;
                    String str16 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.merchantName : null;
                    String str17 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.offerToken : null;
                    String str18 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.offerName : null;
                    String referrerFlowToken = realOffersAnalyticsHelper.getReferrerFlowToken();
                    AppLocation appLocation = AppLocation.Browser;
                    analytics5.track(new OffersLockedOfferUpsellTappedCTA(str15, str16, str17, str18, referrerFlowToken), null);
                    analytics4.track(new BenefitLeafletClickClickPrimary(BenefitType.CUSTOM_WEEKLY_OFFERS), null);
                    ClientRoute.ViewBenefitsHome viewBenefitsHome = new ClientRoute.ViewBenefitsHome();
                    RoutingParams routingParams = new RoutingParams(new OffersScreen$OffersGreenStatusScreen(offersScreen$OffersGreenStatusScreen.rewardToken), null, null, null, null, null, 510);
                    realRouter.getClass();
                    realRouter.clientRouteRouter.route(viewBenefitsHome, routingParams);
                }
                break;
            case 27:
                if (!Intrinsics.areEqual((OffersNotificationEvent$Dismiss) obj, OffersNotificationEvent$Dismiss.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator).goTo(back);
                    break;
                }
            case 28:
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj2;
                OffersRedemptionViewEvents$Close offersRedemptionViewEvents$Close = (OffersRedemptionViewEvents$Close) obj;
                if (offersRedemptionViewEvents$Close == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    Analytics analytics6 = (Analytics) taxReturnsPresenter.args;
                    SheetDismissMechanism sheetDismissMechanism = offersRedemptionViewEvents$Close.dismissMechanism;
                    OffersScreen$OffersRedemptionScreen offersScreen$OffersRedemptionScreen = (OffersScreen$OffersRedemptionScreen) taxReturnsPresenter.router;
                    analytics6.track(new BrowserViewDismissRedemptionSheet(offersScreen$OffersRedemptionScreen.infoContext, offersScreen$OffersRedemptionScreen.origin, sheetDismissMechanism, offersScreen$OffersRedemptionScreen.referrerFlowToken, offersScreen$OffersRedemptionScreen.entityToken, offersScreen$OffersRedemptionScreen.entryUrl), null);
                    ((BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator).goTo(back);
                    break;
                }
            default:
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj2;
                RealOffersAnalyticsHelper realOffersAnalyticsHelper2 = (RealOffersAnalyticsHelper) poolsListPresenter.dateFormatManager;
                RealOffersAnalytics realOffersAnalytics = (RealOffersAnalytics) poolsListPresenter.flowToken;
                OffersTimelineViewEvent offersTimelineViewEvent = (OffersTimelineViewEvent) obj;
                if (!(offersTimelineViewEvent instanceof ItemViewed)) {
                    if (!(offersTimelineViewEvent instanceof OffersTimelineViewEvent.CloseTimelineSheet)) {
                        if (!(offersTimelineViewEvent instanceof OffersTimelineViewEvent.ActionUrl)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            realOffersAnalyticsHelper2.refreshFlowToken(OffersAnalyticsHelper$Flow.BOOST_PLASMA);
                            RealRouter realRouter2 = (RealRouter) poolsListPresenter.moneyFormatter;
                            String str19 = ((OffersTimelineViewEvent.ActionUrl) offersTimelineViewEvent).url;
                            OffersScreen$OffersTimelineScreen offersScreen$OffersTimelineScreen = (OffersScreen$OffersTimelineScreen) poolsListPresenter.sessionManager;
                            String str20 = offersScreen$OffersTimelineScreen.referrerFlowToken;
                            if (str20 == null && (str20 = realOffersAnalyticsHelper2.getReferrerFlowToken()) == null) {
                                str20 = realOffersAnalyticsHelper2.getFlowToken(OffersAnalyticsHelper$Flow.SHOP);
                            }
                            realRouter2.route(new RoutingParams(offersScreen$OffersTimelineScreen, BlockersData.AnalyticsData.Source.SHOPPING.getAnalyticsName(), null, null, new AnalyticsParams.OffersTabAnalyticsParams(str20, false), null, 476), str19);
                        }
                    } else {
                        SheetDismissOrigin sheetDismissOrigin = ((OffersTimelineViewEvent.CloseTimelineSheet) offersTimelineViewEvent).sheetDismissOrigin;
                        realOffersAnalytics.getClass();
                        RealOffersAnalyticsHelper realOffersAnalyticsHelper3 = realOffersAnalytics.offersAnalyticsHelper;
                        Analytics analytics7 = realOffersAnalytics.analytics;
                        Origin origin = realOffersAnalyticsHelper3.origin;
                        String referrerFlowToken2 = realOffersAnalyticsHelper3.getReferrerFlowToken();
                        String flowToken = realOffersAnalyticsHelper3.getFlowToken(OffersAnalyticsHelper$Flow.SHOP);
                        String flowToken2 = realOffersAnalyticsHelper3.getFlowToken(OffersAnalyticsHelper$Flow.BROWSE);
                        String flowToken3 = realOffersAnalyticsHelper3.getFlowToken(OffersAnalyticsHelper$Flow.SEARCH);
                        AppLocation appLocation2 = realOffersAnalytics.appLocation;
                        String str21 = (String) realOffersAnalyticsHelper3.currentMerchantTokenFlow.$$delegate_0.getValue();
                        String str22 = (String) realOffersAnalyticsHelper3.currentMerchantNameFlow.$$delegate_0.getValue();
                        String str23 = (String) realOffersAnalyticsHelper3.currentOfferTokenFlow.$$delegate_0.getValue();
                        Screen screen = realOffersAnalytics.currentScreen;
                        analytics7.track(new OffersDismissTimelineSheet(flowToken, flowToken2, flowToken3, referrerFlowToken2, appLocation2, sheetDismissOrigin, str21, str22, str23, origin, screen instanceof OffersScreen$OffersDetailsScreen ? ((OffersScreen$OffersDetailsScreen) screen).sourceSection : realOffersAnalyticsHelper3.searchSourceSection), null);
                        ((BetterNavigator.ScreenNavigator) poolsListPresenter.navigator).goTo(back);
                    }
                } else {
                    RealOffersAnalytics.trackImpressionAnalyticsEvents$default(realOffersAnalytics, ((ItemViewed) offersTimelineViewEvent).analyticsEventSpecs);
                }
                if (offersTimelineViewEvent instanceof OffersAnalyticsViewEvent) {
                    RealOffersAnalytics.trackGenericAnalyticsEvents$default(realOffersAnalytics, ((OffersAnalyticsViewEvent) offersTimelineViewEvent).getAnalyticsActionEventSpecs());
                }
                break;
        }
        return null;
    }

    public /* synthetic */ OffersDetailsPresenterV2$models$1$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
    }

    public /* synthetic */ OffersDetailsPresenterV2$models$1$1$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
