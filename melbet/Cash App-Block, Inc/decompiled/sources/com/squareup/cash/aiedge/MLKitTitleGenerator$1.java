package com.squareup.cash.aiedge;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.foundation.lazy.LazyListState;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import coil3.network.NetworkFetcher$fetch$2;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.zxing.BinaryBitmap;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.account.screens.ThemeSwitcherScreen;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.advertising.presenters.FullscreenAdPresenter;
import com.squareup.cash.advertising.presenters.FullscreenAdPresenter$models$2$1;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayMerchantRepo;
import com.squareup.cash.afterpayapplet.db.AfterpayRecentlyViewedMerchantsQueries$getAll$2;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet;
import com.squareup.cash.agents.applets.presenters.RealAgentsRepository;
import com.squareup.cash.agents.applets.screens.AgentsHomeScreen;
import com.squareup.cash.appintro.presenters.SponsorshipRequestReferralIntroPresenter;
import com.squareup.cash.appintro.screens.SponsorshipRequestReferralIntroScreen;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.appmessages.db.SheetMessageQueries$messageByToken$2;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewEvent;
import com.squareup.cash.banking.presenters.BalanceHomePresenter;
import com.squareup.cash.banking.screens.ConfirmCashOutScreen;
import com.squareup.cash.benefits.presenters.BenefitsHomePresenter;
import com.squareup.cash.bitcoin.presenters.map.BitcoinMapPresenter;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinMapScreen;
import com.squareup.cash.bitcoin.screens.BitcoinSendRestrictionScreen;
import com.squareup.cash.bitcoin.screens.StablecoinDepositScreen;
import com.squareup.cash.blockers.actions.views.BlockerActionConfirmDialogView;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.CashtagPresenter;
import com.squareup.cash.blockers.presenters.FileBlockerPresenter;
import com.squareup.cash.blockers.presenters.InputCardInfoHelpersKt;
import com.squareup.cash.blockers.presenters.InputCardInfoPresenter;
import com.squareup.cash.blockers.presenters.PromotionPanePresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.CryptoTradeSide;
import com.squareup.cash.cdf.InstrumentType;
import com.squareup.cash.cdf.alias.AliasRegisterStart;
import com.squareup.cash.cdf.appmessage.AppMessageInteractView;
import com.squareup.cash.cdf.balancehome.BalanceHomeBrowseViewScreen;
import com.squareup.cash.cdf.bankingbenefitseligibletransactions.BankingBenefitsEligibleTransactionsViewOpen;
import com.squareup.cash.cdf.bankingbenefitshome.BankingBenefitsHomeViewOpen;
import com.squareup.cash.cdf.bankingbenefitspdsahalfsheet.BankingBenefitsPDSAHalfsheetViewOpen;
import com.squareup.cash.cdf.cash.CashWithdrawViewConfirmation;
import com.squareup.cash.cdf.crypto.CryptoSendShowRestrictionSheet;
import com.squareup.cash.cdf.crypto.CryptoSpendViewMap;
import com.squareup.cash.cdf.crypto.CryptoStablecoinDepositViewDestinationAddress;
import com.squareup.cash.cdf.crypto.CryptoTradeShowBankRecommendationSheet;
import com.squareup.cash.cdf.document.DocumentUploadStart;
import com.squareup.cash.cdf.instrument.InstrumentLinkStart;
import com.squareup.cash.cdf.outofnetworksponsor.OutOfNetworkSponsorShownWelcomeScreenStart;
import com.squareup.cash.cdf.themepicker.SourceLocation;
import com.squareup.cash.cdf.themepicker.ThemePickerManageView;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.presenters.OffersDetailsPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.common.scenarios.InvitationConfig;
import com.squareup.util.android.Intents;
import com.squareup.util.android.Keyboards;
import com.squareup.util.android.ToastKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class MLKitTitleGenerator$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MLKitTitleGenerator$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new MLKitTitleGenerator$1((BinaryBitmap) obj2, continuation, 0);
            case 1:
                return new MLKitTitleGenerator$1((LocalEditorialPresenter) obj2, continuation, 1);
            case 2:
                return new MLKitTitleGenerator$1((RealProfilePhotoManager) obj2, continuation, 2);
            case 3:
                return new MLKitTitleGenerator$1((FullscreenAdPresenter) obj2, continuation, 3);
            case 4:
                return new MLKitTitleGenerator$1((RealAfterpayMerchantRepo) obj2, continuation, 4);
            case 5:
                return new MLKitTitleGenerator$1((LocalHomePresenter) obj2, continuation, 5);
            case 6:
                return new MLKitTitleGenerator$1((AfterpayAppletPurchasesEmbeddedPresenter) obj2, continuation, 6);
            case 7:
                return new MLKitTitleGenerator$1((EndAppLockPresenter) obj2, continuation, 7);
            case 8:
                return new MLKitTitleGenerator$1((LazyListState) obj2, continuation, 8);
            case 9:
                return new MLKitTitleGenerator$1((LocalPosCheckInPresenter) obj2, continuation, 9);
            case 10:
                return new MLKitTitleGenerator$1((SponsorshipRequestReferralIntroPresenter) obj2, continuation, 10);
            case 11:
                return new MLKitTitleGenerator$1((RealAppMessageRepositoryWriter) obj2, continuation, 11);
            case 12:
                return new MLKitTitleGenerator$1((LocalCashBalancePresenter) obj2, continuation, 12);
            case 13:
                return new MLKitTitleGenerator$1((NetworkFetcher$fetch$2) obj2, continuation, 13);
            case 14:
                return new MLKitTitleGenerator$1((BalanceHomePresenter) obj2, continuation, 14);
            case 15:
                return new MLKitTitleGenerator$1((CardStudioPresenter) obj2, continuation, 15);
            case 16:
                return new MLKitTitleGenerator$1((BenefitsHomePresenter) obj2, continuation, 16);
            case 17:
                return new MLKitTitleGenerator$1((OffersDetailsPresenter) obj2, continuation, 17);
            case 18:
                return new MLKitTitleGenerator$1((LocalPosCheckInPresenter) obj2, continuation, 18);
            case 19:
                return new MLKitTitleGenerator$1((LocalHomePresenter) obj2, continuation, 19);
            case 20:
                return new MLKitTitleGenerator$1((BitcoinMapPresenter) obj2, continuation, 20);
            case 21:
                return new MLKitTitleGenerator$1((LocalEditorialPresenter) obj2, continuation, 21);
            case 22:
                return new MLKitTitleGenerator$1((CardStudioPresenter) obj2, continuation, 22);
            case 23:
                return new MLKitTitleGenerator$1((BitcoinTransferPresenter) obj2, continuation, 23);
            case 24:
                return new MLKitTitleGenerator$1((BlockerActionConfirmDialogView) obj2, continuation, 24);
            case 25:
                return new MLKitTitleGenerator$1((CashtagPresenter) obj2, continuation, 25);
            case 26:
                return new MLKitTitleGenerator$1((FileBlockerPresenter) obj2, continuation, 26);
            case 27:
                return new MLKitTitleGenerator$1((InputCardInfoPresenter) obj2, continuation, 27);
            case 28:
                return new MLKitTitleGenerator$1((PoolsListPresenter) obj2, continuation, 28);
            default:
                return new MLKitTitleGenerator$1((PromotionPanePresenter) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MLKitTitleGenerator$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SourceLocation sourceLocation;
        Object value;
        CryptoSpendViewMap.ViewMapSource viewMapSource;
        BlockersData.AnalyticsData.Source source;
        InstrumentType instrumentType;
        InstrumentLinkStart.LinkAction linkAction;
        int i = this.$r8$classId;
        int i2 = 19;
        int i3 = 2;
        int i4 = 1;
        ByteString byteString = null;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                Analytics analytics = (Analytics) localEditorialPresenter.installedStore;
                int ordinal = ((ThemeSwitcherScreen) localEditorialPresenter.service).source.ordinal();
                if (ordinal == 0) {
                    sourceLocation = SourceLocation.PROFILE;
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    sourceLocation = SourceLocation.DEEP_LINK;
                }
                analytics.track(new ThemePickerManageView(sourceLocation), null);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealAccountOutboundNavigator realAccountOutboundNavigator = ((RealProfilePhotoManager) obj2).accountOutboundNavigator;
                realAccountOutboundNavigator.getClass();
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                Intents.maybeStartActivityForResult((Activity) realAccountOutboundNavigator.activity, intent, 1);
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FullscreenAdPresenter fullscreenAdPresenter = (FullscreenAdPresenter) obj2;
                fullscreenAdPresenter.analytics.track(new AppMessageInteractView(null, AppMessageFormat.FULL_SCREEN, fullscreenAdPresenter.args.token, null, 19), null);
                JobKt.launch$default(fullscreenAdPresenter.scope, null, null, new FullscreenAdPresenter$models$2$1(i4, fullscreenAdPresenter, null == true ? 1 : 0), 3);
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SessionQueries sessionQueries = ((RealAfterpayMerchantRepo) obj2).queries;
                sessionQueries.getClass();
                AfterpayRecentlyViewedMerchantsQueries$getAll$2 afterpayRecentlyViewedMerchantsQueries$getAll$2 = AfterpayRecentlyViewedMerchantsQueries$getAll$2.INSTANCE;
                SqlDriver sqlDriver = sessionQueries.driver;
                ActivityTabViewKt$$ExternalSyntheticLambda17 activityTabViewKt$$ExternalSyntheticLambda17 = new ActivityTabViewKt$$ExternalSyntheticLambda17(i2);
                sqlDriver.getClass();
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj2;
                ((RealAfterpayAppletAnalytics) localHomePresenter.clearMarketingBadgesIfNeeded).trackViewedAllOrders(((AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen) localHomePresenter.syncer).orderActivityType == AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType.COMPLETED);
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((AfterpayAppletPurchasesEmbeddedPresenter) obj2).observabilityManager.logEvent("afterpay_applet_pull_to_refresh", AfterpayAppletPurchasesEmbeddedPresenter.refreshAttributePurchase);
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj2;
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = (RealAfterpayAppletAnalytics) endAppLockPresenter.accountOutboundNavigator;
                AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet afterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet = (AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet) endAppLockPresenter.navigatorSwitcher;
                String str = afterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet.merchantToken;
                String str2 = afterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet.merchantName;
                realAfterpayAppletAnalytics.merchantToken = str;
                realAfterpayAppletAnalytics.merchantName = str2;
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((LazyListState) obj2).getClass();
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj2;
                if (((AgentsHomeScreen) localPosCheckInPresenter.launcher).refreshAgentsOnStart) {
                    StateFlowImpl stateFlowImpl = ((RealAgentsRepository) localPosCheckInPresenter.store).refreshSignals;
                    do {
                        value = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.compareAndSet(value, Integer.valueOf(((Number) value).intValue() + 1)));
                }
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SponsorshipRequestReferralIntroPresenter sponsorshipRequestReferralIntroPresenter = (SponsorshipRequestReferralIntroPresenter) obj2;
                Analytics analytics2 = sponsorshipRequestReferralIntroPresenter.analytics;
                SponsorshipRequestReferralIntroScreen sponsorshipRequestReferralIntroScreen = sponsorshipRequestReferralIntroPresenter.args;
                analytics2.track(new OutOfNetworkSponsorShownWelcomeScreenStart(sponsorshipRequestReferralIntroScreen.deepLinkPayload, sponsorshipRequestReferralIntroScreen.content.inviter), null);
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = (RealAppMessageRepositoryWriter) obj2;
                LocalTabContentQueries localTabContentQueries = realAppMessageRepositoryWriter.inlineMessagesQueries;
                localTabContentQueries.driver.execute(1134230339, "DELETE FROM inlineMessage", null);
                localTabContentQueries.notifyQueries(1134230339, new CardMessageQueries$$ExternalSyntheticLambda7(7));
                LocalTabContentQueries localTabContentQueries2 = realAppMessageRepositoryWriter.popupMessageQueries;
                localTabContentQueries2.driver.execute(-1960189084, "DELETE FROM popupMessage", null);
                localTabContentQueries2.notifyQueries(-1960189084, new CardMessageQueries$$ExternalSyntheticLambda7(19));
                LocalTabContentQueries localTabContentQueries3 = realAppMessageRepositoryWriter.sheetMessageQueries;
                localTabContentQueries3.driver.execute(-845776745, "DELETE FROM sheetMessage", null);
                localTabContentQueries3.notifyQueries(-845776745, new CardMessageQueries$$ExternalSyntheticLambda7(23));
                LocalTabContentQueries localTabContentQueries4 = realAppMessageRepositoryWriter.inAppNotificationMessageQueries;
                localTabContentQueries4.driver.execute(-17856897, "DELETE FROM inAppNotificationMessage", null);
                localTabContentQueries4.notifyQueries(-17856897, new CardMessageQueries$$ExternalSyntheticLambda7(5));
                LocalTabContentQueries localTabContentQueries5 = realAppMessageRepositoryWriter.fullScreenMessageQueries;
                localTabContentQueries5.driver.execute(143724293, "DELETE FROM fullScreenMessage", null);
                localTabContentQueries5.notifyQueries(143724293, new CardMessageQueries$$ExternalSyntheticLambda7(1));
                LocalTabContentQueries localTabContentQueries6 = realAppMessageRepositoryWriter.tooltipMessageQueries;
                localTabContentQueries6.driver.execute(-57606277, "DELETE FROM tooltipMessage", null);
                localTabContentQueries6.notifyQueries(-57606277, new CardMessageQueries$$ExternalSyntheticLambda7(27));
                LocalTabContentQueries localTabContentQueries7 = realAppMessageRepositoryWriter.cardMessageQueries;
                QueryResult execute = localTabContentQueries7.driver.execute(-594507654, "DELETE FROM cardMessage", null);
                localTabContentQueries7.notifyQueries(-594507654, new CardMessageQueries$$ExternalSyntheticLambda1(false ? 1 : 0));
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj2;
                LocalTabContentQueries localTabContentQueries8 = ((CashAccountDatabaseImpl) localCashBalancePresenter.sessionManager).sheetMessageQueries;
                String str3 = ((SheetAppMessage) localCashBalancePresenter.syncer).messageToken;
                localTabContentQueries8.getClass();
                str3.getClass();
                SheetMessageQueries$messageByToken$2 sheetMessageQueries$messageByToken$2 = SheetMessageQueries$messageByToken$2.INSTANCE;
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((NetworkFetcher$fetch$2) obj2).invoke(BalanceAppletTileViewEvent.Viewed.INSTANCE);
                break;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((BalanceHomePresenter) obj2).analytics.track(new BalanceHomeBrowseViewScreen(), null);
                break;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                ((Analytics) cardStudioPresenter.analytics).track(new CashWithdrawViewConfirmation(((ConfirmCashOutScreen) cardStudioPresenter.args).blockersData.flowToken), null);
                break;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((BenefitsHomePresenter) obj2).analytics.track(new BankingBenefitsHomeViewOpen(), null);
                break;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((OffersDetailsPresenter) obj2).analyticsHelper).track(new BankingBenefitsEligibleTransactionsViewOpen(), null);
                break;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((LocalPosCheckInPresenter) obj2).launcher).track(new BankingBenefitsPDSAHalfsheetViewOpen(), null);
                break;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalHomePresenter localHomePresenter2 = (LocalHomePresenter) obj2;
                ((Analytics) localHomePresenter2.tabContentPresenterFactory).track(new CryptoSendShowRestrictionSheet(((BitcoinSendRestrictionScreen) localHomePresenter2.neighborhoodsTabContentEnabled$delegate).amount != null ? CryptoSendShowRestrictionSheet.RestrictionType.PARTIAL : CryptoSendShowRestrictionSheet.RestrictionType.FULL), null);
                break;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BitcoinMapPresenter bitcoinMapPresenter = (BitcoinMapPresenter) obj2;
                Analytics analytics3 = bitcoinMapPresenter.analytics;
                BitcoinMapScreen.Source source2 = bitcoinMapPresenter.screen.source;
                int i5 = source2 == null ? -1 : BitcoinMapPresenter.WhenMappings.$EnumSwitchMapping$0[source2.ordinal()];
                if (i5 == -1) {
                    viewMapSource = null;
                } else if (i5 == 1) {
                    viewMapSource = CryptoSpendViewMap.ViewMapSource.BITCOIN_APPLET_CARD;
                } else if (i5 == 2) {
                    viewMapSource = CryptoSpendViewMap.ViewMapSource.BITCOIN_APPLET_ITEM;
                } else if (i5 == 3) {
                    viewMapSource = CryptoSpendViewMap.ViewMapSource.BITCOIN_APPLET_HEADER;
                } else if (i5 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    viewMapSource = CryptoSpendViewMap.ViewMapSource.ROUTE;
                }
                analytics3.track(new CryptoSpendViewMap(viewMapSource), null);
                break;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalEditorialPresenter localEditorialPresenter2 = (LocalEditorialPresenter) obj2;
                Analytics analytics4 = (Analytics) localEditorialPresenter2.launcher;
                StablecoinNetwork stablecoinNetwork = ((StablecoinDepositScreen) localEditorialPresenter2.responseContextHandler).option.network;
                analytics4.track(new CryptoStablecoinDepositViewDestinationAddress(stablecoinNetwork.chain, stablecoinNetwork.asset), null);
                break;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics5 = (Analytics) ((CardStudioPresenter) obj2).analytics;
                CryptoTradeSide cryptoTradeSide = CryptoTradeSide.BUY;
                analytics5.track(new CryptoTradeShowBankRecommendationSheet(), null);
                break;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BitcoinTransferPresenter bitcoinTransferPresenter = (BitcoinTransferPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = bitcoinTransferPresenter.navigator;
                BlockersData copy$default = BlockersData.copy$default(BlockersData.DUMMY, null, null, null, null, null, null, new BitcoinHome(null, null, null, null, 15), null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, ColorModel.Bitcoin.INSTANCE, null, null, null, null, false, null, null, null, -65, 65407);
                FormBlocker.Element element = new FormBlocker.Element(null == true ? 1 : 0, new FormBlocker.Element.AbstractC0072Element.LocalImageElement(new FormBlocker.Element.LocalImageElement(FormBlocker.Element.LocalImageElement.Icon.PENDING, null, null, 6, null)), null, 5, null);
                AndroidStringManager androidStringManager = bitcoinTransferPresenter.stringManager;
                screenNavigator.goTo(new BlockersScreens.FormScreen(copy$default, CollectionsKt__CollectionsKt.listOf((Object[]) new FormBlocker.Element[]{element, new FormBlocker.Element(null == true ? 1 : 0, new FormBlocker.Element.AbstractC0072Element.TextElement(new FormBlocker.Element.TextElement(androidStringManager.get(R.string.bitcoin_presenters_outage_message), null == true ? 1 : 0, FormBlocker.Element.TextElement.Size.LARGE, null == true ? 1 : 0, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null)), null == true ? 1 : 0, 5, null == true ? 1 : 0), new FormBlocker.Element(null, new FormBlocker.Element.AbstractC0072Element.SpacerElement(new FormBlocker.Element.SpacerElement(1, byteString, i3, null == true ? 1 : 0)), null, 5, null == true ? 1 : 0)}), new BlockerAction(androidStringManager.get(R.string.ok), new BlockerAction.Action.EndFlowAction(new BlockerAction.EndFlowAction(null, null, null == true ? 1 : 0, 7, null == true ? 1 : 0)), 22), null, null, null, null, false, null, null, null, 524264));
                break;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Keyboards.hideKeyboard((BlockerActionConfirmDialogView) obj2);
                break;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CashtagPresenter cashtagPresenter = (CashtagPresenter) obj2;
                Analytics analytics6 = cashtagPresenter.analytics;
                AliasType aliasType = AliasType.CASHTAG;
                BlockersScreens.CashtagScreen cashtagScreen = cashtagPresenter.args;
                analytics6.track(new AliasRegisterStart(aliasType, cashtagScreen.blockersData.flowToken, Boolean.FALSE, Boolean.valueOf(cashtagScreen.suggestedCashTag.getValue() != null)), null);
                break;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FileBlockerPresenter fileBlockerPresenter = (FileBlockerPresenter) obj2;
                Analytics analytics7 = fileBlockerPresenter.analytics;
                BlockersScreens.FileBlockerScreen fileBlockerScreen = fileBlockerPresenter.args;
                BlockersData blockersData = fileBlockerScreen.blockersData;
                String str4 = blockersData.flowToken;
                ClientScenario clientScenario = blockersData.clientScenario;
                String name = clientScenario != null ? clientScenario.name() : null;
                String name2 = fileBlockerScreen.blockersData.ratePlan.name();
                BlockersData.AnalyticsData analyticsData = fileBlockerScreen.blockersData.analyticsData;
                analytics7.track(new DocumentUploadStart(name, str4, null, name2, (analyticsData == null || (source = analyticsData.source) == null) ? null : source.getAnalyticsName(), null, 74), null);
                break;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InputCardInfoPresenter inputCardInfoPresenter = (InputCardInfoPresenter) obj2;
                Analytics analytics8 = inputCardInfoPresenter.analytics;
                BlockersScreens.InputCardInfoScreen inputCardInfoScreen = inputCardInfoPresenter.args;
                CashInstrumentType cashInstrumentType = inputCardInfoScreen.instrumentType;
                cashInstrumentType.getClass();
                int i6 = InputCardInfoHelpersKt.WhenMappings.$EnumSwitchMapping$2[cashInstrumentType.ordinal()];
                if (i6 == 1) {
                    instrumentType = InstrumentType.DEBIT_CARD;
                } else if (i6 != 2) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(cashInstrumentType, "Received an unexpected instrument type: ");
                    break;
                } else {
                    instrumentType = InstrumentType.CREDIT_CARD;
                }
                InstrumentType instrumentType2 = instrumentType;
                ClientScenario clientScenario2 = inputCardInfoScreen.blockersData.clientScenario;
                String name3 = clientScenario2 != null ? clientScenario2.name() : null;
                BlockersData blockersData2 = inputCardInfoScreen.blockersData;
                String str5 = blockersData2.flowToken;
                String obj3 = blockersData2.ratePlan.toString();
                String valueOf = String.valueOf(inputCardInfoScreen.blockersData.analyticsData);
                TransferData transferData = inputCardInfoScreen.blockersData.transferData;
                if (transferData != null) {
                    linkAction = transferData.f1215type == TransferType.ADD_CASH ? InstrumentLinkStart.LinkAction.DEPOSIT : InstrumentLinkStart.LinkAction.WITHDRAW;
                } else {
                    linkAction = null;
                }
                analytics8.track(new InstrumentLinkStart(name3, InputCardInfoHelpersKt.toCdfEntryPoint(inputCardInfoPresenter.clientScenario), str5, obj3, valueOf, instrumentType2, linkAction, Boolean.valueOf(inputCardInfoScreen.sendingToBusinessWithCredit)), null);
                break;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj2;
                AppConfigManager appConfigManager = (AppConfigManager) poolsListPresenter.stringManager;
                InvitationConfig invitationConfig = ((BlockersScreens.InviteFriendsScreen) poolsListPresenter.dateFormatManager).inviteFriendsData.invitation_config;
                invitationConfig.getClass();
                RealAppConfigManager realAppConfigManager = (RealAppConfigManager) appConfigManager;
                realAppConfigManager.invitationConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(24, invitationConfig, realAppConfigManager));
                break;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ToastKt.toast(((PromotionPanePresenter) obj2).context, R.string.blockers_retrofit_error_message, 1);
                break;
        }
        return Unit.INSTANCE;
    }
}
