package com.squareup.cash.history.navigation;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.presenters.LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.PaymentActionResult;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.activity.InvestmentActivityQueries$entityColorForPayment$2;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.entities.PaymentQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.db2.entities.PaymentQueries$forToken$2;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.screens.AddFavorites;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.money.applets.sections.AppletTileSectionProvider;
import com.squareup.cash.money.applets.sections.RealMoneyContentSpanTrackingService;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$2$2;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.backend.api.RecipientVendor$Section;
import com.squareup.cash.recipients.backend.real.RealSuggestedRecipientsVendor;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.SafeCollector;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentActionHandler$transform$$inlined$flatMapLatest$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public FlowCollector L$2;
    public Object L$4;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentActionHandler$transform$$inlined$flatMapLatest$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
        this.L$4 = obj3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.this$0;
        FlowCollector flowCollector = (FlowCollector) obj;
        switch (i) {
            case 0:
                PaymentActionHandler$transform$$inlined$flatMapLatest$2 paymentActionHandler$transform$$inlined$flatMapLatest$2 = new PaymentActionHandler$transform$$inlined$flatMapLatest$2((Continuation) obj3, (PaymentActionHandler) obj4);
                paymentActionHandler$transform$$inlined$flatMapLatest$2.L$0 = flowCollector;
                paymentActionHandler$transform$$inlined$flatMapLatest$2.L$1 = obj2;
                return paymentActionHandler$transform$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
            case 1:
                PaymentActionHandler$transform$$inlined$flatMapLatest$2 paymentActionHandler$transform$$inlined$flatMapLatest$22 = new PaymentActionHandler$transform$$inlined$flatMapLatest$2((LocalHomePresenter) this.L$0, (MutableState) obj4, (MutableState) this.L$4, (Continuation) obj3, 1);
                paymentActionHandler$transform$$inlined$flatMapLatest$22.L$2 = flowCollector;
                paymentActionHandler$transform$$inlined$flatMapLatest$22.L$1 = obj2;
                return paymentActionHandler$transform$$inlined$flatMapLatest$22.invokeSuspend(Unit.INSTANCE);
            case 2:
                PaymentActionHandler$transform$$inlined$flatMapLatest$2 paymentActionHandler$transform$$inlined$flatMapLatest$23 = new PaymentActionHandler$transform$$inlined$flatMapLatest$2((InvestingGraphContentModel$AccentColorType$UptoDateData) this.L$0, (Flow) obj4, (InvestingPortfolioPresenter) this.L$4, (Continuation) obj3, 2);
                paymentActionHandler$transform$$inlined$flatMapLatest$23.L$2 = flowCollector;
                paymentActionHandler$transform$$inlined$flatMapLatest$23.L$1 = obj2;
                return paymentActionHandler$transform$$inlined$flatMapLatest$23.invokeSuspend(Unit.INSTANCE);
            case 3:
                PaymentActionHandler$transform$$inlined$flatMapLatest$2 paymentActionHandler$transform$$inlined$flatMapLatest$24 = new PaymentActionHandler$transform$$inlined$flatMapLatest$2((AppletTileSectionProvider) this.L$0, (Applet) obj4, (Lazy) this.L$4, (Continuation) obj3, 3);
                paymentActionHandler$transform$$inlined$flatMapLatest$24.L$2 = flowCollector;
                paymentActionHandler$transform$$inlined$flatMapLatest$24.L$1 = obj2;
                return paymentActionHandler$transform$$inlined$flatMapLatest$24.invokeSuspend(Unit.INSTANCE);
            case 4:
                PaymentActionHandler$transform$$inlined$flatMapLatest$2 paymentActionHandler$transform$$inlined$flatMapLatest$25 = new PaymentActionHandler$transform$$inlined$flatMapLatest$2((AppletTileSectionProvider) this.L$0, (AppletId) obj4, (AppletTile) this.L$4, (Continuation) obj3, 4);
                paymentActionHandler$transform$$inlined$flatMapLatest$25.L$2 = flowCollector;
                paymentActionHandler$transform$$inlined$flatMapLatest$25.L$1 = obj2;
                return paymentActionHandler$transform$$inlined$flatMapLatest$25.invokeSuspend(Unit.INSTANCE);
            default:
                PaymentActionHandler$transform$$inlined$flatMapLatest$2 paymentActionHandler$transform$$inlined$flatMapLatest$26 = new PaymentActionHandler$transform$$inlined$flatMapLatest$2((ToolbarTuckTargets) this.L$0, (Orientation) obj4, (Flow) this.L$4, (Continuation) obj3, 5);
                paymentActionHandler$transform$$inlined$flatMapLatest$26.L$2 = flowCollector;
                paymentActionHandler$transform$$inlined$flatMapLatest$26.L$1 = obj2;
                return paymentActionHandler$transform$$inlined$flatMapLatest$26.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x07fa, code lost:
    
        if (r0 == r4) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0450, code lost:
    
        if (r3 == r4) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x056a, code lost:
    
        if (r3 == r4) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0588, code lost:
    
        if (r3 == r4) goto L262;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x07f8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PaymentAction paymentAction;
        int i;
        Flow appLockMonitor$special$$inlined$map$2;
        SafeCollector safeCollector;
        Screen profileFor;
        Flow realActivityInvitePresenter;
        Screen bitcoin;
        boolean z;
        Object access$sendRefund;
        Object access$sendConfirm;
        Object route;
        Object access$passcode;
        Flow safeFlow;
        PaymentActionResult.IntentResult intentResult;
        Object collect;
        FlowCollector flowCollector;
        Flow flow;
        int i2 = this.$r8$classId;
        int i3 = 2;
        int i4 = 0;
        int i5 = 4;
        int i6 = 3;
        Object obj2 = this.this$0;
        int i7 = 19;
        switch (i2) {
            case 0:
                PaymentActionHandler paymentActionHandler = (PaymentActionHandler) obj2;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                Object obj3 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    paymentAction = (PaymentAction) obj3;
                    if (paymentAction instanceof PaymentAction.CallNumberAction) {
                        String str = ((PaymentAction.CallNumberAction) paymentAction).number;
                        paymentActionHandler.getClass();
                        if (StringsKt.isBlank(str)) {
                            intentResult = null;
                        } else {
                            str.getClass();
                            intentResult = new PaymentActionResult.IntentResult(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, null)));
                        }
                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(intentResult, 19);
                    } else if (paymentAction instanceof PaymentAction.CancelAction) {
                        PaymentAction.CancelAction cancelAction = (PaymentAction.CancelAction) paymentAction;
                        paymentActionHandler.getClass();
                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(new HistoryScreens.CancelPayment(cancelAction.flowToken, cancelAction.paymentToken, cancelAction.paymentAmount, cancelAction.getters)), 19);
                    } else {
                        if (paymentAction instanceof PaymentAction.CompleteClientScenarioAction) {
                            z = false;
                            appLockMonitor$special$$inlined$map$2 = new SafeFlow(new PaymentActionHandler$transform$5$result$1(paymentActionHandler, paymentAction, false ? 1 : 0, i4));
                        } else {
                            Continuation continuation = null;
                            if (!(paymentAction instanceof PaymentAction.CompleteScenarioPlanAction)) {
                                if (!(paymentAction instanceof PaymentAction.ConfirmAction)) {
                                    if (!(paymentAction instanceof PaymentAction.ErrorAction)) {
                                        if (!(paymentAction instanceof PaymentAction.LinkCardAction)) {
                                            if (!(paymentAction instanceof PaymentAction.OpenUrlAction)) {
                                                if (!(paymentAction instanceof PaymentAction.OpenDialogAction)) {
                                                    if (!(paymentAction instanceof PaymentAction.StartPaymentSupportFlowAction)) {
                                                        if (paymentAction instanceof PaymentAction.PasscodeAction) {
                                                            this.L$0 = null;
                                                            this.L$1 = null;
                                                            this.L$2 = flowCollector2;
                                                            this.L$4 = paymentAction;
                                                            this.label = 1;
                                                            access$passcode = PaymentActionHandler.access$passcode(paymentActionHandler, (PaymentAction.PasscodeAction) paymentAction, this);
                                                            break;
                                                        } else if (paymentAction instanceof PaymentAction.RefundAction) {
                                                            PaymentAction.RefundAction refundAction = (PaymentAction.RefundAction) paymentAction;
                                                            paymentActionHandler.getClass();
                                                            appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(new HistoryScreens.RefundPayment(refundAction.flowToken, refundAction.paymentToken)), 19);
                                                        } else if (paymentAction instanceof PaymentAction.ReportAbuseAction) {
                                                            PaymentAction.ReportAbuseAction reportAbuseAction = (PaymentAction.ReportAbuseAction) paymentAction;
                                                            paymentActionHandler.getClass();
                                                            String str2 = reportAbuseAction.flowToken;
                                                            String str3 = reportAbuseAction.customerToken;
                                                            String str4 = reportAbuseAction.paymentToken;
                                                            String str5 = reportAbuseAction.url;
                                                            PaymentHistoryButton.Dialog dialog = reportAbuseAction.dialog;
                                                            appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(new HistoryScreens.ReportAbuse(true, str2, str3, str4, (RedactedString) null, str5, dialog != null ? dialog.title : null, dialog != null ? dialog.content : null, (Screen) null, 784)), 19);
                                                        } else if (paymentAction instanceof PaymentAction.UnreportAbuseAction) {
                                                            PaymentAction.UnreportAbuseAction unreportAbuseAction = (PaymentAction.UnreportAbuseAction) paymentAction;
                                                            paymentActionHandler.getClass();
                                                            String str6 = unreportAbuseAction.url;
                                                            if (str6 == null) {
                                                                String str7 = unreportAbuseAction.flowToken;
                                                                String str8 = unreportAbuseAction.customerToken;
                                                                String str9 = unreportAbuseAction.paymentToken;
                                                                PaymentHistoryButton.Dialog dialog2 = unreportAbuseAction.dialog;
                                                                route = new PaymentActionResult.GoToScreen(new HistoryScreens.ReportAbuse(false, str7, str8, str9, (RedactedString) null, (String) null, dialog2 != null ? dialog2.title : null, dialog2 != null ? dialog2.content : null, (Screen) null, 816));
                                                            } else {
                                                                route = new PaymentActionResult.Route(new RoutingParams((Screen) paymentActionHandler.activeArgs.invoke(), null, Back.INSTANCE, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str6);
                                                            }
                                                            appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(route, 19);
                                                        } else if (paymentAction instanceof PaymentAction.CheckStatusAction) {
                                                            PaymentAction.CheckStatusAction checkStatusAction = (PaymentAction.CheckStatusAction) paymentAction;
                                                            paymentActionHandler.getClass();
                                                            appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(new HistoryScreens.CheckPaymentStatus(checkStatusAction.flowToken, checkStatusAction.paymentToken, checkStatusAction.paymentAmount, checkStatusAction.paymentGetters)), 19);
                                                        } else if (paymentAction instanceof PaymentAction.SendConfirmAction) {
                                                            Role role = Role.SENDER;
                                                            this.L$0 = null;
                                                            this.L$1 = null;
                                                            this.L$2 = flowCollector2;
                                                            this.L$4 = paymentAction;
                                                            this.label = 2;
                                                            access$sendConfirm = PaymentActionHandler.access$sendConfirm(paymentActionHandler, (PaymentAction.SendConfirmAction) paymentAction, role, this);
                                                            break;
                                                        } else if (paymentAction instanceof PaymentAction.SendRefundAction) {
                                                            this.L$0 = null;
                                                            this.L$1 = null;
                                                            this.L$2 = flowCollector2;
                                                            this.L$4 = paymentAction;
                                                            this.label = 3;
                                                            access$sendRefund = PaymentActionHandler.access$sendRefund(paymentActionHandler, (PaymentAction.SendRefundAction) paymentAction, this);
                                                            break;
                                                        } else {
                                                            int i9 = 14;
                                                            if (paymentAction instanceof PaymentAction.ReverseDepositAction) {
                                                                PaymentAction.ReverseDepositAction reverseDepositAction = (PaymentAction.ReverseDepositAction) paymentAction;
                                                                appLockMonitor$special$$inlined$map$2 = FlowKt.flowOn(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.take(new RealActivityInvitePresenter(i9, paymentActionHandler.activityEntityManager.renderedPayment(reverseDepositAction.paymentToken), paymentActionHandler, reverseDepositAction), 1), new RealProfileManager$profileOrNull$2(paymentActionHandler, null, 23), 3), paymentActionHandler.ioDispatcher);
                                                            } else {
                                                                if (!(paymentAction instanceof PaymentAction.CancelInvestmentOrderAction)) {
                                                                    if (!(paymentAction instanceof PaymentAction.SendCancelInvestmentOrderAction)) {
                                                                        if (!(paymentAction instanceof PaymentAction.CancelCryptoOrderAction)) {
                                                                            if (!(paymentAction instanceof PaymentAction.SendCancelCryptoOrderAction)) {
                                                                                Continuation continuation2 = null;
                                                                                if (!(paymentAction instanceof PaymentAction.MakeLoanPayment)) {
                                                                                    if (!(paymentAction instanceof PaymentAction.SkipLoanPayment)) {
                                                                                        if (!(paymentAction instanceof PaymentAction.SendSkipLoanPayment)) {
                                                                                            if (!(paymentAction instanceof PaymentAction.CancelRecurringPurchase)) {
                                                                                                if (!(paymentAction instanceof PaymentAction.ShowPaymentDetailView)) {
                                                                                                    if (!(paymentAction instanceof PaymentAction.AcceptCryptoPayment)) {
                                                                                                        if (!(paymentAction instanceof PaymentAction.ShowShareSheet)) {
                                                                                                            if (!(paymentAction instanceof PaymentAction.InitiatePaymentAction) && !(paymentAction instanceof PaymentAction.InitiatePaymentPendingAction)) {
                                                                                                                if (!(paymentAction instanceof PaymentAction.ShowProfile)) {
                                                                                                                    if (!(paymentAction instanceof PaymentAction.ShowContact)) {
                                                                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        paymentActionHandler.getClass();
                                                                                                                        LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                                                                                                                        ProfileScreens.ProfileScreen.Customer.CashCustomer cashCustomer = new ProfileScreens.ProfileScreen.Customer.CashCustomer(((PaymentAction.ShowContact) paymentAction).theirId);
                                                                                                                        ProfileScreens.ProfileScreen.Action.ActionType actionType = ProfileScreens.ProfileScreen.Action.ActionType.PAY;
                                                                                                                        i = 1;
                                                                                                                        profileFor = ProfileLauncher.profileFor((ProfileScreens.ProfileScreen.Customer) cashCustomer, ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST, ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE, RealUuidGenerator.generate(), GetProfileDetailsContext.UNKNOWN, CustomerProfileViewOpen.EntryPoint.CELL_AVATAR, (Screen) ActivityScreen.INSTANCE, false, (ProfileScreens.ProfileScreen.ProfileAnalytics) null, (String) null, true, (BlockersData.MoneybotContext) null);
                                                                                                                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(profileFor), 19);
                                                                                                                        safeCollector = 0;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    PaymentAction.ShowProfile showProfile = (PaymentAction.ShowProfile) paymentAction;
                                                                                                                    PaymentQueries paymentQueries = paymentActionHandler.cashDatabase.paymentQueries;
                                                                                                                    String str10 = showProfile.paymentToken;
                                                                                                                    paymentQueries.getClass();
                                                                                                                    PaymentQueries$forToken$2 paymentQueries$forToken$2 = PaymentQueries$forToken$2.INSTANCE;
                                                                                                                    realActivityInvitePresenter = new RealActivityInvitePresenter(15, DBUtil.mapToOneOrNull(FlowKt.take(DBUtil.toFlow(new PaymentQueries.ForTokenQuery(paymentQueries, str10, new PaymentQueries$$ExternalSyntheticLambda3(paymentQueries, i4))), 1), paymentActionHandler.ioDispatcher), paymentActionHandler, showProfile);
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = 1;
                                                                                                                safeCollector = 0;
                                                                                                                appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                                                                                                            }
                                                                                                            FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(appLockMonitor$special$$inlined$map$2, i);
                                                                                                            GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1(paymentActionHandler, paymentAction, safeCollector, 24);
                                                                                                            this.L$0 = safeCollector;
                                                                                                            this.L$1 = safeCollector;
                                                                                                            this.L$2 = safeCollector;
                                                                                                            this.L$4 = safeCollector;
                                                                                                            this.label = 4;
                                                                                                            FlowKt.ensureActive(flowCollector2);
                                                                                                            collect = take.collect(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector2, 16), gLSceneScopeProvider$SceneScope$2$1$1, 1), this);
                                                                                                            if (collect != coroutineSingletons) {
                                                                                                                collect = Unit.INSTANCE;
                                                                                                            }
                                                                                                            if (collect != coroutineSingletons) {
                                                                                                                collect = Unit.INSTANCE;
                                                                                                            }
                                                                                                            if (collect != coroutineSingletons) {
                                                                                                                collect = Unit.INSTANCE;
                                                                                                                break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            RealIntentFactory realIntentFactory = paymentActionHandler.intentFactory;
                                                                                                            PaymentHistoryButton.ShareSheetDetails shareSheetDetails = ((PaymentAction.ShowShareSheet) paymentAction).details;
                                                                                                            appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.IntentResult(RealIntentFactory.createTextIntent$default(realIntentFactory, shareSheetDetails.content, shareSheetDetails.title, 4)), 19);
                                                                                                        }
                                                                                                    } else {
                                                                                                        paymentActionHandler.getClass();
                                                                                                        appLockMonitor$special$$inlined$map$2 = new SafeFlow(new GLThread$start$2((PaymentAction.AcceptCryptoPayment) paymentAction, paymentActionHandler, (Continuation) null, i6));
                                                                                                    }
                                                                                                } else {
                                                                                                    paymentActionHandler.getClass();
                                                                                                    appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(new HistoryScreens.PaymentReceipt(((PaymentAction.ShowPaymentDetailView) paymentAction).paymentToken, null, null, null, null, 62)), 19);
                                                                                                }
                                                                                            } else {
                                                                                                PaymentAction.CancelRecurringPurchase cancelRecurringPurchase = (PaymentAction.CancelRecurringPurchase) paymentAction;
                                                                                                RecurringSchedule.Frequency frequency = cancelRecurringPurchase.frequency;
                                                                                                paymentActionHandler.getClass();
                                                                                                int i10 = PaymentActionHandler.WhenMappings.$EnumSwitchMapping$3[cancelRecurringPurchase.f1182type.ordinal()];
                                                                                                if (i10 == 1) {
                                                                                                    bitcoin = new InvestingScreens.CancelRecurringPurchase.Bitcoin(cancelRecurringPurchase.flowToken, frequency);
                                                                                                } else if (i10 == 2) {
                                                                                                    InvestmentEntityToken investmentEntityToken = cancelRecurringPurchase.investmentEntityToken;
                                                                                                    investmentEntityToken.getClass();
                                                                                                    bitcoin = new InvestingScreens.CancelRecurringPurchase.Equity(frequency, investmentEntityToken, cancelRecurringPurchase.amount, null);
                                                                                                } else if (i10 == 3) {
                                                                                                    a$$ExternalSyntheticBUOutline0.m$1("shouldn't reach here");
                                                                                                    break;
                                                                                                } else {
                                                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                                    break;
                                                                                                }
                                                                                                appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(bitcoin), 19);
                                                                                            }
                                                                                        } else {
                                                                                            paymentActionHandler.getClass();
                                                                                            appLockMonitor$special$$inlined$map$2 = new SafeFlow(new GLThread$start$2((PaymentAction.SendSkipLoanPayment) paymentAction, paymentActionHandler, (Continuation) null, 5));
                                                                                        }
                                                                                    } else {
                                                                                        PaymentAction.SkipLoanPayment skipLoanPayment = (PaymentAction.SkipLoanPayment) paymentAction;
                                                                                        paymentActionHandler.getClass();
                                                                                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(new HistoryScreens.SkipPayment(skipLoanPayment.flowToken, skipLoanPayment.loanTransactionToken)), 19);
                                                                                    }
                                                                                } else {
                                                                                    paymentActionHandler.getClass();
                                                                                    appLockMonitor$special$$inlined$map$2 = new SafeFlow(new GLThread$start$2(paymentActionHandler, (PaymentAction.MakeLoanPayment) paymentAction, continuation2, i5));
                                                                                }
                                                                            } else {
                                                                                paymentActionHandler.getClass();
                                                                                z = false;
                                                                                appLockMonitor$special$$inlined$map$2 = new SafeFlow(new PasscodeDialogPresenter$models$1$1((Object) paymentActionHandler, paymentAction, (Continuation) (false ? 1 : 0), 1));
                                                                            }
                                                                        } else {
                                                                            PaymentAction.CancelCryptoOrderAction cancelCryptoOrderAction = (PaymentAction.CancelCryptoOrderAction) paymentAction;
                                                                            paymentActionHandler.getClass();
                                                                            appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(new InvestingScreens.CancelScheduledOrderScreen(cancelCryptoOrderAction.flowToken, cancelCryptoOrderAction.orderToken, cancelCryptoOrderAction.cancellationText, InvestingScreens.CancelScheduledOrderScreen.CancelType.CRYPTO, ColorModel.Bitcoin.INSTANCE)), 19);
                                                                        }
                                                                    } else {
                                                                        paymentActionHandler.getClass();
                                                                        appLockMonitor$special$$inlined$map$2 = new SafeFlow(new PasscodeDialogPresenter$models$1$1(paymentActionHandler, (PaymentAction.SendCancelInvestmentOrderAction) paymentAction, (Continuation) null, i3));
                                                                    }
                                                                } else {
                                                                    PaymentAction.CancelInvestmentOrderAction cancelInvestmentOrderAction = (PaymentAction.CancelInvestmentOrderAction) paymentAction;
                                                                    RewardSlotQueries rewardSlotQueries = paymentActionHandler.cashDatabase.investmentActivityQueries;
                                                                    String str11 = cancelInvestmentOrderAction.orderToken;
                                                                    rewardSlotQueries.getClass();
                                                                    int i11 = InvestmentActivityQueries$entityColorForPayment$2.$r8$clinit;
                                                                    realActivityInvitePresenter = new Transform$special$$inlined$map$1(FlowKt.take(DBUtil.mapToOneOrNull(DBUtil.toFlow(new RewardQueries.ForIdsQuery(rewardSlotQueries, str11, new StampsConfigQueries$$ExternalSyntheticLambda0(rewardSlotQueries), 20)), paymentActionHandler.ioDispatcher), 1), cancelInvestmentOrderAction, i9);
                                                                }
                                                                appLockMonitor$special$$inlined$map$2 = realActivityInvitePresenter;
                                                            }
                                                        }
                                                        break;
                                                    } else {
                                                        PaymentAction.StartPaymentSupportFlowAction startPaymentSupportFlowAction = (PaymentAction.StartPaymentSupportFlowAction) paymentAction;
                                                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(RealSupportNavigator.startSupportFlow$default(paymentActionHandler.supportNavigator, startPaymentSupportFlowAction.nodeToken, startPaymentSupportFlowAction.paymentToken, startPaymentSupportFlowAction.exitScreen, SupportNavigator$Source.RECEIPT, null, null, 96)), 19);
                                                    }
                                                } else {
                                                    paymentActionHandler.getClass();
                                                    appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(new HistoryScreens.PaymentReceiptDialogScreen(((PaymentAction.OpenDialogAction) paymentAction).dialog)), 19);
                                                }
                                            } else {
                                                safeFlow = new SafeFlow(new PaymentActionHandler$transform$5$result$1(paymentActionHandler, paymentAction, null, 1));
                                            }
                                        } else {
                                            PaymentAction.LinkCardAction linkCardAction = (PaymentAction.LinkCardAction) paymentAction;
                                            safeFlow = new RealGooglePayer$createWallet$$inlined$filter$1(FlowKt.flowOn(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.transformLatest(FlowKt.take(paymentActionHandler.activityEntityManager.renderedPayment(linkCardAction.paymentToken), 1), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) null, paymentActionHandler, linkCardAction, 13)), 24), paymentActionHandler.ioDispatcher), 29);
                                        }
                                    } else {
                                        paymentActionHandler.getClass();
                                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new PaymentActionResult.GoToScreen(new HistoryScreens.Error(new RedactedString(((PaymentAction.ErrorAction) paymentAction).message))), 19);
                                    }
                                } else {
                                    PaymentAction.ConfirmAction confirmAction = (PaymentAction.ConfirmAction) paymentAction;
                                    safeFlow = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(FlowKt.flowOn(FlowKt.transformLatest(FlowKt.take(paymentActionHandler.activityEntityManager.renderedPayment(confirmAction.paymentToken), 1), new PaymentActionHandler$confirmPayment$$inlined$flatMapLatest$1((Continuation) null, paymentActionHandler, confirmAction)), paymentActionHandler.ioDispatcher), new PaymentActionHandler$confirmPayment$$inlined$flatMapLatest$1((Continuation) null, confirmAction, paymentActionHandler)), 4);
                                }
                            } else {
                                safeFlow = new SafeFlow(new PasscodeDialogPresenter$models$1$1(paymentActionHandler, paymentAction, continuation, i6));
                            }
                            appLockMonitor$special$$inlined$map$2 = safeFlow;
                        }
                        i = 1;
                        safeCollector = z;
                        FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take2 = FlowKt.take(appLockMonitor$special$$inlined$map$2, i);
                        GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$12 = new GLSceneScopeProvider$SceneScope$2$1$1(paymentActionHandler, paymentAction, safeCollector, 24);
                        this.L$0 = safeCollector;
                        this.L$1 = safeCollector;
                        this.L$2 = safeCollector;
                        this.L$4 = safeCollector;
                        this.label = 4;
                        FlowKt.ensureActive(flowCollector2);
                        collect = take2.collect(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector2, 16), gLSceneScopeProvider$SceneScope$2$1$12, 1), this);
                        if (collect != coroutineSingletons) {
                        }
                        if (collect != coroutineSingletons) {
                        }
                        if (collect != coroutineSingletons) {
                        }
                    }
                } else if (i8 == 1) {
                    PaymentAction paymentAction2 = (PaymentAction) this.L$4;
                    FlowCollector flowCollector3 = this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    paymentAction = paymentAction2;
                    flowCollector2 = flowCollector3;
                    access$passcode = obj;
                    appLockMonitor$special$$inlined$map$2 = (Flow) access$passcode;
                } else if (i8 == 2) {
                    PaymentAction paymentAction3 = (PaymentAction) this.L$4;
                    FlowCollector flowCollector4 = this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    paymentAction = paymentAction3;
                    flowCollector2 = flowCollector4;
                    access$sendConfirm = obj;
                    appLockMonitor$special$$inlined$map$2 = (Flow) access$sendConfirm;
                } else if (i8 == 3) {
                    PaymentAction paymentAction4 = (PaymentAction) this.L$4;
                    FlowCollector flowCollector5 = this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    paymentAction = paymentAction4;
                    flowCollector2 = flowCollector5;
                    access$sendRefund = obj;
                    appLockMonitor$special$$inlined$map$2 = (Flow) access$sendRefund;
                } else if (i8 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                z = false;
                i = 1;
                safeCollector = z;
                FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take22 = FlowKt.take(appLockMonitor$special$$inlined$map$2, i);
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$122 = new GLSceneScopeProvider$SceneScope$2$1$1(paymentActionHandler, paymentAction, safeCollector, 24);
                this.L$0 = safeCollector;
                this.L$1 = safeCollector;
                this.L$2 = safeCollector;
                this.L$4 = safeCollector;
                this.label = 4;
                FlowKt.ensureActive(flowCollector2);
                collect = take22.collect(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector2, 16), gLSceneScopeProvider$SceneScope$2$1$122, 1), this);
                if (collect != coroutineSingletons) {
                }
                if (collect != coroutineSingletons) {
                }
                if (collect != coroutineSingletons) {
                }
                break;
            case 1:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.L$0;
                FlowCollector flowCollector6 = this.L$2;
                Object obj4 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair pair = (Pair) obj4;
                    InputFieldText inputFieldText = (InputFieldText) pair.first;
                    Region region = (Region) pair.second;
                    ((MutableState) obj2).setValue(Boolean.TRUE);
                    RealFavoritesManager realFavoritesManager = (RealFavoritesManager) localHomePresenter.store;
                    String obj5 = inputFieldText.getValue().toString();
                    UUID uuid = ((AddFavorites) localHomePresenter.neighborhoodsTabContentEnabled$delegate).externalId;
                    Orientation orientation = Orientation.CASH;
                    obj5.getClass();
                    orientation.getClass();
                    Flow search$default = RealRecipientRepository.search$default(realFavoritesManager.recipientRepository, obj5, orientation, uuid, region, null, 15360);
                    this.L$2 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector6);
                    Object collect2 = search$default.collect(new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(flowCollector6, localHomePresenter, region, (MutableState) this.L$4, (MutableState) obj2, 21), this);
                    if (collect2 != coroutineSingletons2) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons2) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons2) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                InvestingPortfolioPresenter investingPortfolioPresenter = (InvestingPortfolioPresenter) this.L$4;
                FlowCollector flowCollector7 = this.L$2;
                Object obj6 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Triple triple = (Triple) obj6;
                    HistoricalRange historicalRange = (HistoricalRange) triple.first;
                    boolean booleanValue = ((Boolean) triple.second).booleanValue();
                    boolean booleanValue2 = ((Boolean) triple.third).booleanValue();
                    TextGeometricTransformKt textGeometricTransformKt = booleanValue ? InvestingGraphContentModel$AccentColorType$StaleData.INSTANCE : (InvestingGraphContentModel$AccentColorType$UptoDateData) this.L$0;
                    Flow flowOn = FlowKt.flowOn(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new CheckStatusPresenter.AnonymousClass1(textGeometricTransformKt, null, 21), new InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1((Flow) obj2, investingPortfolioPresenter, historicalRange, textGeometricTransformKt, booleanValue2)), investingPortfolioPresenter.computationDispatcher);
                    this.L$2 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector7, flowOn, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                FlowCollector flowCollector8 = this.L$2;
                Object obj7 = this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int ordinal = ((AppletAvailabilityState) obj7).ordinal();
                    if (ordinal == 0) {
                        flowCollector = null;
                        flow = (StateFlow) ((Lazy) this.L$4).getValue();
                    } else if (ordinal == 1) {
                        flowCollector = null;
                        ((AppletTileSectionProvider) this.L$0).missingAppletIds.remove(((Applet) obj2).id);
                        flow = new AppLockMonitor$special$$inlined$map$2(null, 19);
                    } else if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        flowCollector = null;
                        flow = new AppLockMonitor$special$$inlined$map$2(null, 19);
                    }
                    this.L$2 = flowCollector;
                    this.L$1 = flowCollector;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector8, flow, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                AppletTileSectionProvider appletTileSectionProvider = (AppletTileSectionProvider) this.L$0;
                FlowCollector flowCollector9 = this.L$2;
                Object obj8 = this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppletTileInstallationState appletTileInstallationState = (AppletTileInstallationState) obj8;
                    RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService = appletTileSectionProvider.appletSpanTrackingService;
                    AppletId appletId = (AppletId) obj2;
                    if (!(appletTileInstallationState instanceof AppletTileInstallationState.Loading)) {
                        if (!(appletTileInstallationState instanceof AppletTileInstallationState.Installed) && !(appletTileInstallationState instanceof AppletTileInstallationState.Uninstalled) && !(appletTileInstallationState instanceof AppletTileInstallationState.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            appletId.getClass();
                            realMoneyContentSpanTrackingService.endSpan(appletId, RealMoneyContentSpanTrackingService.AppletTileOperation.INSTALLATION_LOAD);
                            realMoneyContentSpanTrackingService.endSpan(appletId, RealMoneyContentSpanTrackingService.AppletTileOperation.TOTAL_LOAD);
                        }
                    } else {
                        appletId.getClass();
                        realMoneyContentSpanTrackingService.endSpan(appletId, RealMoneyContentSpanTrackingService.AppletTileOperation.AVAILABILITY_LOAD);
                    }
                    StateFlow section = AppletTileSectionProvider.section((AppletTile) this.L$4, appletTileInstallationState);
                    this.L$2 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector9, section, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            default:
                FlowCollector flowCollector10 = this.L$2;
                Object obj9 = this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair pair2 = (Pair) obj9;
                    RecipientVendor$Section recipientVendor$Section = (RecipientVendor$Section) pair2.first;
                    RecipientVendor$Section recipientVendor$Section2 = (RecipientVendor$Section) pair2.second;
                    RealSuggestedRecipientsVendor realSuggestedRecipientsVendor = (RealSuggestedRecipientsVendor) ((ToolbarTuckTargets) this.L$0).startCornerCenterX$delegate;
                    Flow flow2 = (Flow) this.L$4;
                    RealAppConfigManager realAppConfigManager = (RealAppConfigManager) realSuggestedRecipientsVendor.appConfigManager;
                    InstrumentQueries instrumentQueries = realAppConfigManager.recipientConfigQueries;
                    RealAppConfigManager$$ExternalSyntheticLambda7 realAppConfigManager$$ExternalSyntheticLambda7 = new RealAppConfigManager$$ExternalSyntheticLambda7(0);
                    instrumentQueries.getClass();
                    SqlDriver sqlDriver = instrumentQueries.driver;
                    InstrumentQueries$$ExternalSyntheticLambda0 instrumentQueries$$ExternalSyntheticLambda0 = new InstrumentQueries$$ExternalSyntheticLambda0(i7, realAppConfigManager$$ExternalSyntheticLambda7, instrumentQueries);
                    sqlDriver.getClass();
                    ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new FlowExtensionsKt$combine$$inlined$combine$1(3, new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(419767373, new String[]{"recipientConfig"}, sqlDriver, "RecipientConfig.sq", "select", "SELECT recipientConfig.pay_data, recipientConfig.request_data, recipientConfig.confirm_cashtag_recipient\nFROM recipientConfig", instrumentQueries$$ExternalSyntheticLambda0)), realAppConfigManager.ioDispatcher), (Orientation) obj2)), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) null, flow2, realSuggestedRecipientsVendor, 21));
                    this.L$2 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector10);
                    Object collect3 = transformLatest.collect(new AndroidPermissionChecker$granted$$inlined$map$2$2(24, flowCollector10, recipientVendor$Section, recipientVendor$Section2), this);
                    if (collect3 != coroutineSingletons6) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 != coroutineSingletons6) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 == coroutineSingletons6) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentActionHandler$transform$$inlined$flatMapLatest$2(Continuation continuation, PaymentActionHandler paymentActionHandler) {
        super(3, continuation);
        this.$r8$classId = 0;
        this.this$0 = paymentActionHandler;
    }
}
