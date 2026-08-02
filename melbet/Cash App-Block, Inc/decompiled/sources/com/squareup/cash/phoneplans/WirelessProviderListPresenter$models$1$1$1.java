package com.squareup.cash.phoneplans;

import android.app.Activity;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.AllowedAccountsSectionViewEvent$TapViewAll;
import com.squareup.cash.account.settings.viewmodels.BlockedAccountsSectionViewEvent$TapViewAll;
import com.squareup.cash.account.settings.viewmodels.PersonalScreenViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemConfirmed;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemSelected;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$Close;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$HelpClicked;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneyChanged;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$SystemBack;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.api.AsyncResult;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.businessprofile.BusinessProfileManageDowngradeToPersonal;
import com.squareup.cash.cdf.cashappscore.AppletState;
import com.squareup.cash.cdf.cashappscore.CashAppScoreEntrypointTap;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.p2pblocklist.P2PBlockListViewStart;
import com.squareup.cash.cdf.personalprofile.PersonalProfileManageUpgradeToBusiness;
import com.squareup.cash.cdf.promotions.PromotionState;
import com.squareup.cash.cdf.promotions.PromotionsTapAddPromoCode;
import com.squareup.cash.cdf.promotions.PromotionsTapInviteFriends;
import com.squareup.cash.cdf.promotions.PromotionsViewPromotionRow;
import com.squareup.cash.cdf.savingsfolder.SavingsFolderTransferInChooseAmount;
import com.squareup.cash.cdf.savingsfolder.SavingsFolderTransferOutChooseAmount;
import com.squareup.cash.cdf.savingsfolder.SavingsFolderViewTap;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.db.RecipientConfig;
import com.squareup.cash.data.profile.ReferralManager$RewardStatus;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.p2pblocking.screens.P2PListData;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.cash.p2pblocking.screens.P2PScreenMode;
import com.squareup.cash.passkeys.screens.PasskeyManagementScreen;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.phoneplans.applets.viewmodels.PhonePlansAppletTileEvent$Click;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTileEvent$ClickedAppletTile;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTileModel;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.screens.PoolsListScreen;
import com.squareup.cash.portfolio.graphs.RealInvestingCryptoGraphHeaderPresenter;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCashCardFAQPresenter;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewEvent;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerDeviceDetailsPresenter$DeleteState;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceDetailsScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerListScreen;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDetailsViewEvent;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.repo.api.CustomerProfileDetails;
import com.squareup.cash.profile.screens.PersonalInfoConfirmationDialogScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.promotionsreferrals.screens.PromotionsReferralsScreen$PromotionsReferralsHomeScreen;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewEvent;
import com.squareup.cash.qrcodes.viewmodels.CashtagQrScanViewEvent;
import com.squareup.cash.recipients.backend.api.RecipientSearchResults;
import com.squareup.cash.recipients.backend.api.SuggestedRecipients;
import com.squareup.cash.recipients.backend.real.RealRecipientVendor$sections$$inlined$map$1$2$1;
import com.squareup.cash.recipients.backend.real.RealSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1;
import com.squareup.cash.recipients.backend.real.RealSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.RealRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewEvent$SavingsAppletOnClickTile;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.savings.backend.api.model.TransferConfig;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1;
import com.squareup.cash.savings.db.SavingsGoalLocalStatus;
import com.squareup.cash.savings.presenters.FullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.savings.screens.TransferInScreen;
import com.squareup.cash.savings.screens.TransferOutScreen$Full;
import com.squareup.cash.savings.screens.TransferProcessingScreen;
import com.squareup.cash.savings.viewmodels.AmountSelectorViewModel;
import com.squareup.cash.savings.viewmodels.TransferOutViewEvent;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewEvent$Action;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.screens.Back;
import com.squareup.cash.securityhub.screens.BookletId;
import com.squareup.cash.securityhub.screens.BookletScreen;
import com.squareup.cash.securityhub.screens.RecoveryGuideId;
import com.squareup.cash.securityhub.screens.RecoveryGuideScreen;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewEvent;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.blockly.api.AllowlistCustomer;
import com.squareup.protos.cash.blockly.api.BlocklistDetails;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerResponse;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersResponse;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.C4BOnboardingFlowParameters;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.DowngradeBusinessAccountFlowParameters;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RecipientGroup;
import com.squareup.protos.franklin.common.SuggestedRecipientsData;
import com.squareup.protos.franklin.ui.PersonalInfoCTABanner;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.workflow1.ui.TextControllerKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.phoneplans.syncvalues.PhonePlanAppletV1;

/* loaded from: classes6.dex */
public final class WirelessProviderListPresenter$models$1$1$1 implements FlowCollector {
    public final /* synthetic */ Object $loading$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ WirelessProviderListPresenter$models$1$1$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$loading$delegate = obj2;
        this.this$0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$sharesheet$ShareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2(Object obj, Continuation continuation) {
        ShareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 shareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ShareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) {
            shareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = (ShareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = shareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = shareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.this$0;
                    AndroidStringManager androidStringManager = (AndroidStringManager) ((ShareSheetPresenter) this.$loading$delegate).stringManager;
                    Object[] objArr = {Moneys.symbol((CurrencyCode) obj)};
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.share_your_cashtag)).format(objArr);
                    format2.getClass();
                    shareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(format2, shareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        shareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = new ShareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = shareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x04d6, code lost:
    
        if (r4.emit(r0, r2) != r1) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04c1, code lost:
    
        if (r0 == r1) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x08b1, code lost:
    
        if (r6.emit(r0, r2) == r1) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0874, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L432;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0859  */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.squareup.cash.clientrouting.RealRouter] */
    /* JADX WARN: Type inference failed for: r0v54, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v72 */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        boolean z;
        ProfilePresenter$models$lambda$0$$inlined$map$1$2$1 profilePresenter$models$lambda$0$$inlined$map$1$2$1;
        int i;
        FlowCollector flowCollector;
        AsyncResult asyncResult;
        CustomerProfileDetails customerProfileDetails;
        P2PListData.AllowListData allowListData;
        PromotionState promotionState;
        RealRecipientVendor$sections$$inlined$map$1$2$1 realRecipientVendor$sections$$inlined$map$1$2$1;
        int i2;
        RealSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1 realSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1;
        int i3;
        RealSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1 realSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1;
        int i4;
        RealRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1 realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1;
        int i5;
        FlowCollector flowCollector2;
        PersistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1 persistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1;
        int i6;
        FullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 fullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1;
        int i7;
        Money money;
        String str;
        BookletId bookletId;
        SupportScreens startSupportHome;
        RealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1 realSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1;
        int i8;
        int i9 = this.$r8$classId;
        int i10 = 9;
        int i11 = 0;
        Back back = Back.INSTANCE;
        Object obj2 = this.$loading$delegate;
        Object obj3 = this.this$0;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        Object obj4 = null;
        P2PListData.BlockListData blockListData = null;
        switch (i9) {
            case 0:
                BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) obj;
                WirelessProviderListPresenter wirelessProviderListPresenter = (WirelessProviderListPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator = wirelessProviderListPresenter.navigator;
                if (blockersAction instanceof BlockersHelper.BlockersAction.ToggleSpinner) {
                    ((MutableState) obj2).setValue(Boolean.valueOf(((BlockersHelper.BlockersAction.ToggleSpinner) blockersAction).show));
                } else if (blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen) {
                    screenNavigator.goTo(((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen);
                } else {
                    if (!(blockersAction instanceof BlockersHelper.BlockersAction.ShowError)) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) blockersAction, "Unexpected action: ");
                        return null;
                    }
                    screenNavigator.goTo(new FailureMessageBlockerScreen(wirelessProviderListPresenter.args.blockersData, ((BlockersHelper.BlockersAction.ShowError) blockersAction).message, null, 4));
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                if (((PhonePlansNewLineLoadingViewEvent$Close) obj) != null) {
                    JobKt.launch$default(coroutineScope, null, null, new PhonePlansNewLineLoadingPresenter$models$1$1((PhonePlansNewLineLoadingPresenter) obj2, r3, i11), 3);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 2:
                PhonePlansAppletTileEvent$Click phonePlansAppletTileEvent$Click = (PhonePlansAppletTileEvent$Click) obj;
                if (phonePlansAppletTileEvent$Click == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj3;
                PhonePlanAppletV1 phonePlanAppletV1 = (PhonePlanAppletV1) ((State) obj2).getValue();
                ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) workHomePresenter.titleBarPresenter)).submitSelectItemEvent(phonePlansAppletTileEvent$Click.itemId, null, MoneySelectAction.TAP);
                ((RealRouter) workHomePresenter.youPresenter).route(new RoutingParams(RealMoneyNavigatorHelper.moneyTabScreen(), null, null, null, null, null, 510), phonePlanAppletV1 != null ? phonePlanAppletV1.client_route_url : 0);
                return Unit.INSTANCE;
            case 3:
                WorkHomePresenter workHomePresenter2 = (WorkHomePresenter) obj3;
                if (!Intrinsics.areEqual((PoolsAppletTileEvent$ClickedAppletTile) obj, PoolsAppletTileEvent$ClickedAppletTile.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) workHomePresenter2.shiftSection2Presenter)).submitSelectItemEvent(ItemId.POOLS.INSTANCE, null, MoneySelectAction.TAP);
                PoolsAppletTileModel poolsAppletTileModel = (PoolsAppletTileModel) ((State) obj2).getValue();
                ((Navigator) workHomePresenter2.payPresenter).goTo(new PoolsListScreen(null, poolsAppletTileModel instanceof PoolsAppletTileModel.Uninstalled ? PoolsListScreen.AppletState.UNINSTALLED : poolsAppletTileModel instanceof PoolsAppletTileModel.Installed ? PoolsListScreen.AppletState.INSTALLED : PoolsListScreen.AppletState.UNKNOWN, 1));
                return Unit.INSTANCE;
            case 4:
                MutableState mutableState = (MutableState) obj2;
                mutableState.setValue(RealInvestingCryptoGraphHeaderPresenter.State.copy$default((RealInvestingCryptoGraphHeaderPresenter.State) mutableState.getValue(), null, null, ((RealCurrencyConverter.Factory) ((RealInvestingCryptoGraphHeaderPresenter) obj3).currencyConverterFactory).get((CurrencyCode) obj), null, null, false, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE));
                return Unit.INSTANCE;
            case 5:
                CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) obj;
                MutableState mutableState2 = (MutableState) obj2;
                mutableState2.setValue(RealInvestingCryptoGraphHeaderPresenter.State.copy$default((RealInvestingCryptoGraphHeaderPresenter.State) mutableState2.getValue(), null, null, null, cryptoBalance$BitcoinBalance != null ? TextControllerKt.toMoney(cryptoBalance$BitcoinBalance) : new Money(new Long(0L), (CurrencyCode) obj3, 4), null, false, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE));
                return Unit.INSTANCE;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                MutableState mutableState3 = (MutableState) obj2;
                RealInvestingCryptoGraphHeaderPresenter.State state = (RealInvestingCryptoGraphHeaderPresenter.State) mutableState3.getValue();
                if (!booleanValue) {
                    Long l = ((Money) obj3).amount;
                    l.getClass();
                    if (l.longValue() <= 0) {
                        z = false;
                        mutableState3.setValue(RealInvestingCryptoGraphHeaderPresenter.State.copy$default(state, null, null, null, null, null, z, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE));
                        return Unit.INSTANCE;
                    }
                }
                z = true;
                mutableState3.setValue(RealInvestingCryptoGraphHeaderPresenter.State.copy$default(state, null, null, null, null, null, z, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE));
                return Unit.INSTANCE;
            case 7:
                PrepurchaseCashCardFAQPresenter prepurchaseCashCardFAQPresenter = (PrepurchaseCashCardFAQPresenter) obj2;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj3;
                PrepurchaseCardFAQViewEvent prepurchaseCardFAQViewEvent = (PrepurchaseCardFAQViewEvent) obj;
                if (Intrinsics.areEqual(prepurchaseCardFAQViewEvent, PrepurchaseCardFAQViewEvent.CloseClicked.INSTANCE)) {
                    BlockersDataNavigator blockersDataNavigator = prepurchaseCashCardFAQPresenter.blockersDataNavigator;
                    BlockersScreens.PrepurchaseCashCardFAQBlockerScreen prepurchaseCashCardFAQBlockerScreen = prepurchaseCashCardFAQPresenter.args;
                    ?? back2 = blockersDataNavigator.getBack(prepurchaseCashCardFAQBlockerScreen, prepurchaseCashCardFAQBlockerScreen.blockersData);
                    if (back2 != 0) {
                        back = back2;
                    }
                    prepurchaseCashCardFAQPresenter.navigator.goTo(back);
                } else if (prepurchaseCardFAQViewEvent instanceof PrepurchaseCardFAQViewEvent.PrimaryButtonClicked) {
                    JobKt.launch$default(coroutineScope2, null, null, new RingtoneView.AnonymousClass1(prepurchaseCashCardFAQPresenter, prepurchaseCardFAQViewEvent, r3, i10), 3);
                } else {
                    if (!(prepurchaseCardFAQViewEvent instanceof PrepurchaseCardFAQViewEvent.UrlClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    prepurchaseCashCardFAQPresenter.router.route(new RoutingParams(prepurchaseCashCardFAQPresenter.args, null, null, null, null, null, 510), ((PrepurchaseCardFAQViewEvent.UrlClicked) prepurchaseCardFAQViewEvent).url);
                }
                return Unit.INSTANCE;
            case 8:
                ToggleEntryPointData toggleEntryPointData = (ToggleEntryPointData) obj;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                ToggleEntryPointData.ToggleState toggleState = toggleEntryPointData != null ? toggleEntryPointData.toggle_state : null;
                Object obj5 = ref$ObjectRef.element;
                if (obj5 == ToggleEntryPointData.ToggleState.TURNED_ON && toggleState != obj5) {
                    ((BetterNavigator.ScreenNavigator) ((LocalEditorialPresenter) obj2).navigator).goTo(back);
                }
                ref$ObjectRef.element = toggleState;
                return Unit.INSTANCE;
            case 9:
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj3;
                DeviceManagerDetailsViewEvent deviceManagerDetailsViewEvent = (DeviceManagerDetailsViewEvent) obj;
                if (Intrinsics.areEqual(deviceManagerDetailsViewEvent, DeviceManagerDetailsViewEvent.DeleteDevice.INSTANCE)) {
                    MutableState mutableState4 = (MutableState) obj2;
                    DeviceManagerDeviceDetailsPresenter$DeleteState deviceManagerDeviceDetailsPresenter$DeleteState = (DeviceManagerDeviceDetailsPresenter$DeleteState) mutableState4.getValue();
                    String str2 = ((DeviceManagerDeviceDetailsScreen) pdfPreviewPresenter.pdfFile$delegate).deviceAppToken;
                    boolean z2 = deviceManagerDeviceDetailsPresenter$DeleteState.isInProgress;
                    deviceManagerDeviceDetailsPresenter$DeleteState.getClass();
                    mutableState4.setValue(new DeviceManagerDeviceDetailsPresenter$DeleteState(str2, z2));
                } else {
                    if (!Intrinsics.areEqual(deviceManagerDetailsViewEvent, DeviceManagerDetailsViewEvent.GoBack.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    pdfPreviewPresenter.navigator.goTo(back);
                }
                return Unit.INSTANCE;
            case 10:
                ProfilePresenter profilePresenter = (ProfilePresenter) obj2;
                if (continuation instanceof ProfilePresenter$models$lambda$0$$inlined$map$1$2$1) {
                    profilePresenter$models$lambda$0$$inlined$map$1$2$1 = (ProfilePresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i12 = profilePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePresenter$models$lambda$0$$inlined$map$1$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                        Object obj6 = profilePresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = profilePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            flowCollector = (FlowCollector) obj3;
                            asyncResult = (AsyncResult) obj;
                            StateFlowImpl stateFlowImpl = (StateFlowImpl) profilePresenter.profileDetailsProvider;
                            profilePresenter$models$lambda$0$$inlined$map$1$2$1.L$4 = flowCollector;
                            profilePresenter$models$lambda$0$$inlined$map$1$2$1.L$6 = asyncResult;
                            profilePresenter$models$lambda$0$$inlined$map$1$2$1.I$0 = 0;
                            profilePresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            stateFlowImpl.setValue(asyncResult);
                            break;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    SafeTrace.throwOnFailure(obj6);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i11 = profilePresenter$models$lambda$0$$inlined$map$1$2$1.I$0;
                            asyncResult = profilePresenter$models$lambda$0$$inlined$map$1$2$1.L$6;
                            flowCollector = profilePresenter$models$lambda$0$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj6);
                        }
                        if (!Intrinsics.areEqual(asyncResult, AsyncResult.Loading.INSTANCE)) {
                            if (!(asyncResult instanceof AsyncResult.Failure)) {
                                if (!(asyncResult instanceof AsyncResult.Success)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                customerProfileDetails = (CustomerProfileDetails) ((AsyncResult.Success) asyncResult).response;
                                profilePresenter$models$lambda$0$$inlined$map$1$2$1.L$4 = null;
                                profilePresenter$models$lambda$0$$inlined$map$1$2$1.L$6 = null;
                                profilePresenter$models$lambda$0$$inlined$map$1$2$1.I$0 = i11;
                                profilePresenter$models$lambda$0$$inlined$map$1$2$1.label = 2;
                                break;
                            } else {
                                profilePresenter.navigator.goTo(new ProfileScreens.ErrorScreen(((AndroidStringManager) profilePresenter.stringManager).get(R.string.profile_loading_error_message), null, 6));
                            }
                        }
                        customerProfileDetails = null;
                        profilePresenter$models$lambda$0$$inlined$map$1$2$1.L$4 = null;
                        profilePresenter$models$lambda$0$$inlined$map$1$2$1.L$6 = null;
                        profilePresenter$models$lambda$0$$inlined$map$1$2$1.I$0 = i11;
                        profilePresenter$models$lambda$0$$inlined$map$1$2$1.label = 2;
                    }
                }
                profilePresenter$models$lambda$0$$inlined$map$1$2$1 = new ProfilePresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj62 = profilePresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profilePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                if (!Intrinsics.areEqual(asyncResult, AsyncResult.Loading.INSTANCE)) {
                }
                customerProfileDetails = null;
                profilePresenter$models$lambda$0$$inlined$map$1$2$1.L$4 = null;
                profilePresenter$models$lambda$0$$inlined$map$1$2$1.L$6 = null;
                profilePresenter$models$lambda$0$$inlined$map$1$2$1.I$0 = i11;
                profilePresenter$models$lambda$0$$inlined$map$1$2$1.label = 2;
            case 11:
                ProfilePrivacyPresenter profilePrivacyPresenter = (ProfilePrivacyPresenter) obj2;
                JobKt.launch$default((CoroutineScope) obj3, profilePrivacyPresenter.ioDispatcher, null, new RingtoneView.AnonymousClass1(profilePrivacyPresenter, (ProfilePrivacyViewEvent.ToggleContactsSync) obj, r3, 13), 2);
                return Unit.INSTANCE;
            case 12:
                if (!Intrinsics.areEqual((AllowedAccountsSectionViewEvent$TapViewAll) obj, AllowedAccountsSectionViewEvent$TapViewAll.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SetDefaultInstrumentPresenter setDefaultInstrumentPresenter = (SetDefaultInstrumentPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator2 = setDefaultInstrumentPresenter.navigator;
                String str3 = (String) setDefaultInstrumentPresenter.args;
                GetAllowlistForCustomerResponse getAllowlistForCustomerResponse = (GetAllowlistForCustomerResponse) ((MutableState) obj2).getValue();
                if (getAllowlistForCustomerResponse != null) {
                    List list = getAllowlistForCustomerResponse.allowed_customers;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : list) {
                        if (Intrinsics.areEqual(((AllowlistCustomer) obj7).is_in_allowlist, Boolean.TRUE)) {
                            arrayList.add(obj7);
                        }
                    }
                    allowListData = new P2PListData.AllowListData(arrayList);
                } else {
                    allowListData = null;
                }
                screenNavigator2.goTo(new P2PListScreen(str3, allowListData, new P2PScreenMode.AllowList(null), null));
                return Unit.INSTANCE;
            case 13:
                WorkHomePresenter workHomePresenter3 = (WorkHomePresenter) obj3;
                String str4 = (String) workHomePresenter3.youPresenter;
                if (!Intrinsics.areEqual((BlockedAccountsSectionViewEvent$TapViewAll) obj, BlockedAccountsSectionViewEvent$TapViewAll.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Analytics analytics = (Analytics) workHomePresenter3.shiftSection2Presenter;
                BlockingContext blockingContext = BlockingContext.BLOCKLIST;
                analytics.track(new P2PBlockListViewStart(str4, "BLOCKLIST"), null);
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) workHomePresenter3.payPresenter;
                GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) ((MutableState) obj2).getValue();
                if (getBlockedCustomersResponse != null) {
                    List list2 = getBlockedCustomersResponse.blocked_customers;
                    BlocklistDetails blocklistDetails = getBlockedCustomersResponse.blocklist_details;
                    blockListData = new P2PListData.BlockListData(list2, blocklistDetails != null ? blocklistDetails.support_page_client_route_url : null);
                }
                screenNavigator3.goTo(new P2PListScreen(str4, blockListData, P2PScreenMode.BlockList.INSTANCE, blockingContext));
                return Unit.INSTANCE;
            case 14:
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj3;
                FlowStarter flowStarter = (FlowStarter) localCashBalancePresenter.syncer;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator;
                PersonalScreenViewEvent personalScreenViewEvent = (PersonalScreenViewEvent) obj;
                if (Intrinsics.areEqual(personalScreenViewEvent, PersonalScreenViewEvent.Close.INSTANCE)) {
                    if (((PersonalInfoCTABanner) ((State) obj2).getValue()) == null) {
                        screenNavigator4.goTo(back);
                    } else {
                        screenNavigator4.goTo(PersonalInfoConfirmationDialogScreen.INSTANCE);
                    }
                } else if (personalScreenViewEvent instanceof PersonalScreenViewEvent.ProUpgradeClick) {
                    ProfileScreens.AccountInfoScreen accountInfoScreen = (ProfileScreens.AccountInfoScreen) localCashBalancePresenter.service;
                    Analytics analytics2 = (Analytics) localCashBalancePresenter.analytics;
                    if (((PersonalScreenViewEvent.ProUpgradeClick) personalScreenViewEvent).isBusiness) {
                        BlockersData.Flow.INSTANCE.getClass();
                        analytics2.track(new BusinessProfileManageDowngradeToPersonal(BusinessProfileManageDowngradeToPersonal.DowngradeToPersonalEntrypoint.PERSONAL, BlockersData.Flow.Companion.generateToken()), null);
                        screenNavigator4.goTo(((RealFlowStarter) flowStarter).startBusinessAccountDowngradeFlow(DowngradeBusinessAccountFlowParameters.EntryPoint.IN_APP_PERSONAL_SECTION, accountInfoScreen));
                    } else {
                        BlockersData.Flow.INSTANCE.getClass();
                        String generateToken = BlockersData.Flow.Companion.generateToken();
                        analytics2.track(new PersonalProfileManageUpgradeToBusiness(PersonalProfileManageUpgradeToBusiness.UpgradeToBusinessEntrypoint.ACCOUNT_INFO_SETTING, generateToken), null);
                        screenNavigator4.goTo(((RealFlowStarter) flowStarter).startBusinessAccountOnboardingFlow(accountInfoScreen, C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_ACCOUNT_INFO_SETTING, generateToken));
                    }
                } else if (personalScreenViewEvent instanceof PersonalScreenViewEvent.ReplaceAddress) {
                    screenNavigator4.goTo(FlowStarter.startSetAddressFlow$default(flowStarter, 3));
                } else if (!(personalScreenViewEvent instanceof PersonalScreenViewEvent.AliasEvent) && !(personalScreenViewEvent instanceof PersonalScreenViewEvent.AppMessageEvent) && !(personalScreenViewEvent instanceof PersonalScreenViewEvent.AutoFillEvent)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 15:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj3;
                FlowStarter flowStarter2 = (FlowStarter) cardLockPresenter.flowStarter;
                BetterNavigator.ScreenNavigator screenNavigator5 = cardLockPresenter.navigator;
                Analytics analytics3 = (Analytics) cardLockPresenter.analytics;
                PromotionsReferralsScreen$PromotionsReferralsHomeScreen promotionsReferralsScreen$PromotionsReferralsHomeScreen = (PromotionsReferralsScreen$PromotionsReferralsHomeScreen) cardLockPresenter.args;
                PromotionsReferralsHomeViewEvent promotionsReferralsHomeViewEvent = (PromotionsReferralsHomeViewEvent) obj;
                if (promotionsReferralsHomeViewEvent instanceof PromotionsReferralsHomeViewEvent.InviteFriendTapped) {
                    analytics3.track(new PromotionsTapInviteFriends(promotionsReferralsScreen$PromotionsReferralsHomeScreen.sourceScreen), null);
                    screenNavigator5.goTo(((RealFlowStarter) flowStarter2).startInviteFlow(back, BlockersScreens.StartFlowEntryPointScreen.Origin.PROMOTION_HUB));
                } else if (promotionsReferralsHomeViewEvent instanceof PromotionsReferralsHomeViewEvent.EnterCodeTapped) {
                    analytics3.track(new PromotionsTapAddPromoCode(promotionsReferralsScreen$PromotionsReferralsHomeScreen.sourceScreen), null);
                    ReferralManager$RewardStatus referralManager$RewardStatus = (ReferralManager$RewardStatus) ((MutableState) obj2).getValue();
                    if (referralManager$RewardStatus != null) {
                        String str5 = referralManager$RewardStatus.code_entry_client_route;
                        if (str5 != null) {
                            ((RealRouter) cardLockPresenter.deviceLockAnimationBus).route(new RoutingParams((PromotionsReferralsScreen$PromotionsReferralsHomeScreen) cardLockPresenter.args, null, promotionsReferralsScreen$PromotionsReferralsHomeScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str5);
                        } else {
                            promotionsReferralsScreen$PromotionsReferralsHomeScreen.getClass();
                            screenNavigator5.goTo(FlowStarter.startPlasmaFlow$default((RealFlowStarter) flowStarter2, Flow$Type.PROMOTION_OPT_IN, promotionsReferralsScreen$PromotionsReferralsHomeScreen, promotionsReferralsScreen$PromotionsReferralsHomeScreen, null, 8));
                        }
                    }
                } else if (promotionsReferralsHomeViewEvent instanceof PromotionsReferralsHomeViewEvent.AvailablePromotionTapped) {
                    CardLockPresenter.access$trackTapPromotionRow(cardLockPresenter, promotionsReferralsHomeViewEvent);
                    ((RealRouter) cardLockPresenter.deviceLockAnimationBus).route(new RoutingParams((PromotionsReferralsScreen$PromotionsReferralsHomeScreen) cardLockPresenter.args, null, (PromotionsReferralsScreen$PromotionsReferralsHomeScreen) cardLockPresenter.args, null, null, null, HttpStatusCode.BAD_GATEWAY_502), ((PromotionsReferralsHomeViewEvent.AvailablePromotionTapped) promotionsReferralsHomeViewEvent).actionUrl);
                } else if (promotionsReferralsHomeViewEvent instanceof PromotionsReferralsHomeViewEvent.ActivePromotionTapped) {
                    CardLockPresenter.access$trackTapPromotionRow(cardLockPresenter, promotionsReferralsHomeViewEvent);
                    ((RealRouter) cardLockPresenter.deviceLockAnimationBus).route(new RoutingParams((PromotionsReferralsScreen$PromotionsReferralsHomeScreen) cardLockPresenter.args, null, (PromotionsReferralsScreen$PromotionsReferralsHomeScreen) cardLockPresenter.args, null, null, null, HttpStatusCode.BAD_GATEWAY_502), ((PromotionsReferralsHomeViewEvent.ActivePromotionTapped) promotionsReferralsHomeViewEvent).actionUrl);
                } else if (promotionsReferralsHomeViewEvent instanceof PromotionsReferralsHomeViewEvent.PromotionItemViewed) {
                    PromotionsReferralsHomeViewEvent.PromotionItemViewed promotionItemViewed = (PromotionsReferralsHomeViewEvent.PromotionItemViewed) promotionsReferralsHomeViewEvent;
                    String str6 = promotionItemViewed.campaignToken;
                    String str7 = promotionItemViewed.campaignVariantToken;
                    int ordinal = promotionItemViewed.state.ordinal();
                    if (ordinal == 0) {
                        promotionState = PromotionState.ACTIVE;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        promotionState = PromotionState.AVAILABLE;
                    }
                    analytics3.track(new PromotionsViewPromotionRow(str6, str7, promotionState), null);
                } else {
                    if (!(promotionsReferralsHomeViewEvent instanceof PromotionsReferralsHomeViewEvent.GoBack)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator5.goTo(back);
                }
                return Unit.INSTANCE;
            case 16:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj3;
                CashtagQrScanViewEvent cashtagQrScanViewEvent = (CashtagQrScanViewEvent) obj;
                if (cashtagQrScanViewEvent instanceof CashtagQrScanViewEvent.CodeScanned) {
                    JobKt.launch$default(coroutineScope3, null, null, new RingtoneView.AnonymousClass1(localEditorialPresenter, cashtagQrScanViewEvent, r3, 24), 3);
                } else {
                    if (!(cashtagQrScanViewEvent instanceof CashtagQrScanViewEvent.Exit)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(back);
                }
                return Unit.INSTANCE;
            case 17:
                ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) obj2;
                if (continuation instanceof RealRecipientVendor$sections$$inlined$map$1$2$1) {
                    realRecipientVendor$sections$$inlined$map$1$2$1 = (RealRecipientVendor$sections$$inlined$map$1$2$1) continuation;
                    int i13 = realRecipientVendor$sections$$inlined$map$1$2$1.label;
                    if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecipientVendor$sections$$inlined$map$1$2$1.label = i13 - PKIFailureInfo.systemUnavail;
                        Object obj8 = realRecipientVendor$sections$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realRecipientVendor$sections$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            Pair pair = (Pair) obj;
                            Pair pair2 = new Pair(ToolbarTuckTargets.access$mapResult(toolbarTuckTargets, (RecipientSearchResults) pair.first), ToolbarTuckTargets.access$mapResult(toolbarTuckTargets, (RecipientSearchResults) pair.second));
                            realRecipientVendor$sections$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj3).emit(pair2, realRecipientVendor$sections$$inlined$map$1$2$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj8);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realRecipientVendor$sections$$inlined$map$1$2$1 = new RealRecipientVendor$sections$$inlined$map$1$2$1(this, continuation);
                Object obj82 = realRecipientVendor$sections$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realRecipientVendor$sections$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
            case 18:
                if (continuation instanceof RealSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1) {
                    realSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1 = (RealSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1) continuation;
                    int i14 = realSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1.label;
                    if ((i14 & PKIFailureInfo.systemUnavail) != 0) {
                        realSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1.label = i14 - PKIFailureInfo.systemUnavail;
                        Object obj9 = realSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = realSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            FlowCollector flowCollector3 = (FlowCollector) obj3;
                            SuggestedRecipients suggestedRecipients = ((SuggestedRecipientsData) obj2).groups.contains(RecipientGroup.RECENTS) ? new SuggestedRecipients((List) obj) : new SuggestedRecipients(EmptyList.INSTANCE);
                            realSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector3.emit(suggestedRecipients, realSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1) == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                        } else {
                            if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj9);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1 = new RealSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1(this, continuation);
                Object obj92 = realSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = realSuggestedRecipientsVendor$recipients$lambda$0$0$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
                return Unit.INSTANCE;
            case 19:
                if (continuation instanceof RealSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1) {
                    realSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1 = (RealSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1) continuation;
                    int i15 = realSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1.label;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        realSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1.label = i15 - PKIFailureInfo.systemUnavail;
                        Object obj10 = realSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            FlowCollector flowCollector4 = (FlowCollector) obj3;
                            RecipientConfig recipientConfig = (RecipientConfig) obj;
                            SuggestedRecipientsData suggestedRecipientsData = recipientConfig.pay_data;
                            SuggestedRecipientsData suggestedRecipientsData2 = recipientConfig.request_data;
                            if (((Orientation) obj2) != Orientation.CASH) {
                                suggestedRecipientsData = suggestedRecipientsData2;
                            }
                            realSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1.label = 1;
                            if (flowCollector4.emit(suggestedRecipientsData, realSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1) == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                        } else {
                            if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj10);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1 = new RealSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1(this, continuation);
                Object obj102 = realSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realSuggestedRecipientsVendor$recipientsConfig$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
                return Unit.INSTANCE;
            case 20:
                if (continuation instanceof RealRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1) {
                    realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1 = (RealRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1) continuation;
                    int i16 = realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.label;
                    if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.label = i16 - PKIFailureInfo.systemUnavail;
                        Object obj11 = realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            flowCollector2 = (FlowCollector) obj3;
                            RealCryptoInvoiceParser realCryptoInvoiceParser = ((RealRecipientRepository) obj2).cryptoInvoiceParser;
                            realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.L$4 = flowCollector2;
                            realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.I$0 = 0;
                            realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.label = 1;
                            obj11 = realCryptoInvoiceParser.parse((String) obj, false, realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1);
                            break;
                        } else {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    SafeTrace.throwOnFailure(obj11);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i11 = realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.I$0;
                            flowCollector2 = realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj11);
                        }
                        BitcoinPayments.Stablecoin stablecoin = !(obj11 instanceof BitcoinPayments.Stablecoin) ? (BitcoinPayments.Stablecoin) obj11 : null;
                        realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.L$4 = null;
                        realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.I$0 = i11;
                        realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.label = 2;
                        break;
                    }
                }
                realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1 = new RealRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1(this, continuation);
                Object obj112 = realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
                if (!(obj112 instanceof BitcoinPayments.Stablecoin)) {
                }
                realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.L$4 = null;
                realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.I$0 = i11;
                realRecipientRepository$stablecoinClipboardParses$$inlined$map$1$2$1.label = 2;
            case 21:
                if (!Intrinsics.areEqual((SavingsAppletTileViewEvent$SavingsAppletOnClickTile) obj, SavingsAppletTileViewEvent$SavingsAppletOnClickTile.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SavingsAppletTileViewModel savingsAppletTileViewModel = (SavingsAppletTileViewModel) ((MutableState) obj2).getValue();
                ClientRoute clientRoute = savingsAppletTileViewModel instanceof SavingsAppletTileViewModel.Installed ? ((SavingsAppletTileViewModel.Installed) savingsAppletTileViewModel).getClientRoute() : savingsAppletTileViewModel instanceof SavingsAppletTileViewModel.Uninstalled ? ((SavingsAppletTileViewModel.Uninstalled) savingsAppletTileViewModel).clientRoute : null;
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj3;
                ((Analytics) poolsListPresenter.analytics).track(new SavingsFolderViewTap(), null);
                ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) poolsListPresenter.sessionManager)).submitSelectItemEvent(ItemId.SAVINGS.INSTANCE, null, MoneySelectAction.TAP);
                RealRouter realRouter = (RealRouter) poolsListPresenter.args;
                if (clientRoute == null) {
                    clientRoute = new ClientRoute.ViewSavingsNuxOrHome(ClientRoute.ViewSavingsNuxOrHome.spec, ClientRoute.ViewSavingsNuxOrHome.deepLinkSpecs, null);
                }
                RoutingParams routingParams = new RoutingParams(RealMoneyNavigatorHelper.moneyTabScreen(), null, null, null, null, null, 510);
                realRouter.getClass();
                realRouter.clientRouteRouter.route(clientRoute, routingParams);
                return Unit.INSTANCE;
            case 22:
                if (continuation instanceof PersistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1) {
                    persistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1 = (PersistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1) continuation;
                    int i17 = persistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1.label;
                    if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                        persistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1.label = i17 - PKIFailureInfo.systemUnavail;
                        Object obj12 = persistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = persistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            Object invoke = ((OpenSourceKt$$ExternalSyntheticLambda11) obj2).invoke((SavingsGoalLocalStatus) obj);
                            persistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj3).emit(invoke, persistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1) == coroutineSingletons7) {
                                return coroutineSingletons7;
                            }
                        } else {
                            if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj12);
                        }
                        return Unit.INSTANCE;
                    }
                }
                persistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1 = new PersistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1(this, continuation);
                Object obj122 = persistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = persistentActiveGoalStore$providerFromLocalStatus$$inlined$map$1$2$1.label;
                if (i6 != 0) {
                }
                return Unit.INSTANCE;
            case 23:
                if (continuation instanceof FullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) {
                    fullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = (FullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                    int i18 = fullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                    if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                        fullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = i18 - PKIFailureInfo.systemUnavail;
                        Object obj13 = fullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = fullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            FlowCollector flowCollector5 = (FlowCollector) obj3;
                            AmountPickerViewEvent amountPickerViewEvent = (AmountPickerViewEvent) obj;
                            if (Intrinsics.areEqual(amountPickerViewEvent, AmountPickerViewEvent$Full$Close.INSTANCE) || Intrinsics.areEqual(amountPickerViewEvent, AmountPickerViewEvent$Full$SystemBack.INSTANCE)) {
                                ((ErrorPresenter) obj2).navigator.goTo(back);
                            } else if (!Intrinsics.areEqual(amountPickerViewEvent, AmountPickerViewEvent$Full$HelpClicked.INSTANCE) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemConfirmed) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemSelected)) {
                                if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneyChanged) {
                                    obj4 = new TransferOutViewEvent.AmountChanged(((AmountPickerViewEvent$Full$MoneyChanged) amountPickerViewEvent).amount);
                                } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneySubmitted) {
                                    obj4 = new TransferOutViewEvent.Submit(((AmountPickerViewEvent$Full$MoneySubmitted) amountPickerViewEvent).amount);
                                } else if (!(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$PercentSubmitted)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                            }
                            if (obj4 != null) {
                                fullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector5.emit(obj4, fullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1) == coroutineSingletons8) {
                                    return coroutineSingletons8;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj13);
                        }
                        return Unit.INSTANCE;
                    }
                }
                fullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1 = new FullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj132 = fullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = fullScreenTransferOutPresenter$models$lambda$0$$inlined$mapNotNull$1$2$1.label;
                if (i7 != 0) {
                }
                return Unit.INSTANCE;
            case 24:
                MutableState mutableState5 = (MutableState) obj2;
                WorkHomePresenter workHomePresenter4 = (WorkHomePresenter) obj3;
                Analytics analytics4 = (Analytics) workHomePresenter4.payPresenter;
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) workHomePresenter4.titleBarPresenter;
                TransferInScreen transferInScreen = (TransferInScreen) workHomePresenter4.shiftsAnalytics;
                AmountPickerViewEvent amountPickerViewEvent2 = (AmountPickerViewEvent) obj;
                if (amountPickerViewEvent2 instanceof AmountPickerViewEvent$Full$MoneySubmitted) {
                    SavingsFolderTransferInChooseAmount.SelectionType selectionType = SavingsFolderTransferInChooseAmount.SelectionType.CUSTOM_AMOUNT;
                    Money money2 = ((AmountPickerViewEvent$Full$MoneySubmitted) amountPickerViewEvent2).amount;
                    Long l2 = money2.amount;
                    Integer num = l2 != null ? new Integer((int) l2.longValue()) : null;
                    CurrencyCode currencyCode = money2.currency_code;
                    analytics4.track(new SavingsFolderTransferInChooseAmount(selectionType, num, currencyCode != null ? currencyCode.name() : null), null);
                    screenNavigator6.goTo(new TransferProcessingScreen(TransferProcessingScreen.Direction.IN, money2, transferInScreen.getSavingsFolderToken(), transferInScreen.getOrigin(), transferInScreen.getContext()));
                } else if (amountPickerViewEvent2 instanceof AmountPickerViewEvent$Condensed$ItemConfirmed) {
                    AmountSelectorWidgetModel.Item item = ((AmountPickerViewEvent$Condensed$ItemConfirmed) amountPickerViewEvent2).item;
                    AmountSelectorViewModel.Amount amount = item instanceof AmountSelectorViewModel.Amount ? (AmountSelectorViewModel.Amount) item : null;
                    if (amount == null || (money = amount.amount) == null) {
                        money = (Money) mutableState5.getValue();
                    }
                    Money money3 = money;
                    if (money3 != null) {
                        SavingsFolderTransferInChooseAmount.SelectionType selectionType2 = SavingsFolderTransferInChooseAmount.SelectionType.ATM_AMOUNT;
                        Long l3 = money3.amount;
                        Integer num2 = l3 != null ? new Integer((int) l3.longValue()) : null;
                        CurrencyCode currencyCode2 = money3.currency_code;
                        analytics4.track(new SavingsFolderTransferInChooseAmount(selectionType2, num2, currencyCode2 != null ? currencyCode2.name() : null), null);
                        screenNavigator6.goTo(new TransferProcessingScreen(TransferProcessingScreen.Direction.IN, money3, transferInScreen.getSavingsFolderToken(), transferInScreen.getOrigin(), transferInScreen.getContext()));
                    }
                } else if (amountPickerViewEvent2 instanceof AmountPickerViewEvent$Condensed$ItemSelected) {
                    AmountSelectorWidgetModel.Item item2 = ((AmountPickerViewEvent$Condensed$ItemSelected) amountPickerViewEvent2).item;
                    item2.getClass();
                    AmountSelectorViewModel amountSelectorViewModel = (AmountSelectorViewModel) item2;
                    if (amountSelectorViewModel instanceof AmountSelectorViewModel.Amount) {
                        mutableState5.setValue(((AmountSelectorViewModel.Amount) amountSelectorViewModel).amount);
                    } else {
                        if (!(amountSelectorViewModel instanceof AmountSelectorViewModel.CustomAmount)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        TransferConfig.TransferInConfig config = transferInScreen.getConfig();
                        List list3 = config.quickAmounts;
                        Money money4 = config.minimumAmount;
                        Money money5 = config.maximumAmount;
                        CdfEvent cdfEvent = config.cdfEvent;
                        TransferConfig.ClientRouteTemplate clientRouteTemplate = config.clientRouteTemplate;
                        list3.getClass();
                        money4.getClass();
                        money5.getClass();
                        screenNavigator6.goTo(new TransferInScreen.Full(new TransferConfig.TransferInConfig(list3, null, money4, money5, cdfEvent, clientRouteTemplate), transferInScreen.getSavingsFolderToken(), transferInScreen.getOrigin(), transferInScreen.getContext()));
                    }
                } else if (!(amountPickerViewEvent2 instanceof AmountPickerViewEvent$Full$MoneyChanged) && !(amountPickerViewEvent2 instanceof AmountPickerViewEvent$Full$PercentSubmitted)) {
                    if ((amountPickerViewEvent2 instanceof AmountPickerViewEvent$Full$Close) || (amountPickerViewEvent2 instanceof AmountPickerViewEvent$Full$SystemBack)) {
                        screenNavigator6.goTo(back);
                    } else if (!(amountPickerViewEvent2 instanceof AmountPickerViewEvent$Full$HelpClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return Unit.INSTANCE;
            case 25:
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj3;
                TransferOutViewEvent transferOutViewEvent = (TransferOutViewEvent) obj;
                if (transferOutViewEvent instanceof TransferOutViewEvent.AmountChanged) {
                    ((MutableState) obj2).setValue(((TransferOutViewEvent.AmountChanged) transferOutViewEvent).amount);
                } else {
                    if (!(transferOutViewEvent instanceof TransferOutViewEvent.Submit)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Analytics analytics5 = (Analytics) shareSheetPresenter.analytics;
                    SavingsFolderTransferOutChooseAmount.SelectionType selectionType3 = SavingsFolderTransferOutChooseAmount.SelectionType.CUSTOM_AMOUNT;
                    Money money6 = ((TransferOutViewEvent.Submit) transferOutViewEvent).amount;
                    Long l4 = money6.amount;
                    Integer num3 = l4 != null ? new Integer((int) l4.longValue()) : null;
                    CurrencyCode currencyCode3 = money6.currency_code;
                    analytics5.track(new SavingsFolderTransferOutChooseAmount(num3, currencyCode3 != null ? currencyCode3.name() : null), null);
                    BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator;
                    TransferProcessingScreen.Direction direction = TransferProcessingScreen.Direction.OUT;
                    TransferOutScreen$Full transferOutScreen$Full = (TransferOutScreen$Full) shareSheetPresenter.shareTargetsManager;
                    screenNavigator7.goTo(new TransferProcessingScreen(direction, money6, transferOutScreen$Full.savingsFolderToken, transferOutScreen$Full.origin, transferOutScreen$Full.context));
                }
                return Unit.INSTANCE;
            case 26:
                ScoreAppletTileViewEvent$Action scoreAppletTileViewEvent$Action = (ScoreAppletTileViewEvent$Action) obj;
                if (scoreAppletTileViewEvent$Action == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ShareSheetPresenter shareSheetPresenter2 = (ShareSheetPresenter) obj3;
                ScoreAppletTileViewModel scoreAppletTileViewModel = (ScoreAppletTileViewModel) ((MutableState) obj2).getValue();
                final CashCreditScoreEntryPointData.Action action = scoreAppletTileViewEvent$Action.proto;
                ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) shareSheetPresenter2.profileManager)).submitSelectItemEvent(ItemId.SCORE.INSTANCE, null, MoneySelectAction.TAP);
                Analytics analytics6 = (Analytics) shareSheetPresenter2.analytics;
                AppletState cdfAppletState = ShareSheetPresenter.toCdfAppletState(scoreAppletTileViewModel);
                ScoreAppletTileViewModel.Installed installed = scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Installed ? (ScoreAppletTileViewModel.Installed) scoreAppletTileViewModel : null;
                analytics6.track(new CashAppScoreEntrypointTap(cdfAppletState, (installed == null || (str = installed.scoreText) == null) ? null : StringsKt.toIntOrNull(str)), null);
                MoneyTabScreen moneyTabScreen = RealMoneyNavigatorHelper.moneyTabScreen();
                String str8 = action.uri;
                if (str8 != null) {
                    ((RealRouter) shareSheetPresenter2.modelUpdates).route(new RoutingParams(moneyTabScreen, BlockersData.AnalyticsData.Source.MONEY_TAB.getAnalyticsName(), moneyTabScreen, null, null, null, 500), str8);
                } else {
                    ((ErrorReporter) shareSheetPresenter2.navigator).report(new ReportedError(action) { // from class: com.squareup.cash.score.applets.presenters.ScoreAppletTilePresenter$UnknownActionError
                        public final CashCreditScoreEntryPointData.Action action;
                        public final Set features;
                        public final String message;

                        {
                            action.getClass();
                            this.action = action;
                            this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.CashCreditScore.INSTANCE);
                            this.message = "Unknown action type: " + action;
                        }

                        public final boolean equals(Object obj14) {
                            if (this == obj14) {
                                return true;
                            }
                            return (obj14 instanceof ScoreAppletTilePresenter$UnknownActionError) && Intrinsics.areEqual(this.action, ((ScoreAppletTilePresenter$UnknownActionError) obj14).action);
                        }

                        @Override // com.squareup.cash.observability.types.FeatureError
                        public final Set getFeatures() {
                            return this.features;
                        }

                        @Override // java.lang.Throwable
                        public final String getMessage() {
                            return this.message;
                        }

                        public final int hashCode() {
                            return this.action.hashCode();
                        }

                        @Override // java.lang.Throwable
                        public final String toString() {
                            return "UnknownActionError(action=" + this.action + ")";
                        }
                    }, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                }
                return Unit.INSTANCE;
            case 27:
                LocalEditorialPresenter localEditorialPresenter2 = (LocalEditorialPresenter) obj2;
                Activity activity = (Activity) localEditorialPresenter2.screen;
                RealIntentFactory realIntentFactory = (RealIntentFactory) localEditorialPresenter2.clock;
                BetterNavigator.ScreenNavigator screenNavigator8 = (BetterNavigator.ScreenNavigator) localEditorialPresenter2.navigator;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj3;
                RecoveryGuideViewEvent recoveryGuideViewEvent = (RecoveryGuideViewEvent) obj;
                if (Intrinsics.areEqual(recoveryGuideViewEvent, RecoveryGuideViewEvent.NavigateBack.INSTANCE)) {
                    screenNavigator8.goTo(back);
                } else if (recoveryGuideViewEvent instanceof RecoveryGuideViewEvent.RowTapped) {
                    int ordinal2 = ((RecoveryGuideViewEvent.RowTapped) recoveryGuideViewEvent).id.ordinal();
                    if (ordinal2 != 3) {
                        if (ordinal2 != 9) {
                            if (ordinal2 == 5) {
                                JobKt.launch$default(coroutineScope4, null, null, new ShoppingWebBridge.AnonymousClass1(localEditorialPresenter2, (Continuation) r3, 18), 3);
                            } else if (ordinal2 == 6) {
                                screenNavigator8.goTo(new DeviceManagerListScreen());
                            } else if (ordinal2 != 7) {
                                switch (ordinal2) {
                                    case 12:
                                        realIntentFactory.maybeStartUrlIntent("https://reportfraud.ftc.gov", activity, true);
                                        break;
                                    case 13:
                                        realIntentFactory.maybeStartUrlIntent("https://www.ic3.gov", activity, true);
                                        break;
                                }
                            } else {
                                screenNavigator8.goTo(PasskeyManagementScreen.INSTANCE);
                            }
                        }
                        RealSupportNavigator realSupportNavigator = (RealSupportNavigator) localEditorialPresenter2.service;
                        RecoveryGuideScreen recoveryGuideScreen = (RecoveryGuideScreen) localEditorialPresenter2.launcher;
                        SupportNavigator$Source supportNavigator$Source = SupportNavigator$Source.PROFILE;
                        startSupportHome = realSupportNavigator.startSupportHome(null, recoveryGuideScreen, SupportNavigator$Source.PROFILE, null, null);
                        screenNavigator8.goTo(startSupportHome);
                    } else {
                        screenNavigator8.goTo(new RecoveryGuideScreen(RecoveryGuideId.IVE_BEEN_HACKED));
                    }
                } else {
                    if (!(recoveryGuideViewEvent instanceof RecoveryGuideViewEvent.BookletTapped)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    int ordinal3 = ((RecoveryGuideViewEvent.BookletTapped) recoveryGuideViewEvent).id.ordinal();
                    if (ordinal3 == 0) {
                        bookletId = BookletId.BUILT_IN_PROTECTIONS;
                    } else if (ordinal3 == 1) {
                        bookletId = BookletId.COMMON_SCAMS;
                    } else if (ordinal3 == 2) {
                        bookletId = BookletId.SPOT_SCAMS;
                    } else if (ordinal3 == 3) {
                        bookletId = BookletId.PREVENT_FRAUD;
                    } else {
                        if (ordinal3 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        bookletId = BookletId.SECURITY_FEATURES;
                    }
                    screenNavigator8.goTo(new BookletScreen(bookletId));
                }
                return Unit.INSTANCE;
            case 28:
                return emit$com$squareup$cash$sharesheet$ShareSheetPresenter$models$1$1$invokeSuspend$$inlined$map$1$2(obj, continuation);
            default:
                if (continuation instanceof RealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1) {
                    realSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1 = (RealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1) continuation;
                    int i19 = realSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.label;
                    if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                        realSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.label = i19 - PKIFailureInfo.systemUnavail;
                        Object obj14 = realSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = realSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            FlowCollector flowCollector6 = (FlowCollector) obj3;
                            SheetPosition sheetPosition = SheetPosition.Hidden;
                            int i20 = RealSheetState.$r8$clinit;
                            ((RealSheetState) obj2).getClass();
                            Float positionOfOrNull = RealSheetState.positionOfOrNull((DefaultDraggableAnchors) obj, sheetPosition);
                            if (positionOfOrNull != null) {
                                realSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector6.emit(positionOfOrNull, realSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1) == coroutineSingletons9) {
                                    return coroutineSingletons9;
                                }
                            }
                        } else {
                            if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj14);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1 = new RealSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj142 = realSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = realSheetState$awaitDismissalDragEnabled$$inlined$mapNotNull$1$2$1.label;
                if (i8 != 0) {
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ WirelessProviderListPresenter$models$1$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, State state, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$loading$delegate = state;
    }
}
