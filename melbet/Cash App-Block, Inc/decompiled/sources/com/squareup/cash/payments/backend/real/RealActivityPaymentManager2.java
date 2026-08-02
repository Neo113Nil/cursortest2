package com.squareup.cash.payments.backend.real;

import androidx.room.util.DBUtil;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import com.google.android.gms.internal.mlkit_genai_prompt.zzms;
import com.squareup.cash.activity.backend.RealActivityUpdatesNotifier;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.activityhistory.ActivityHistoryViewLoad;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.ClientRoutesConfig;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealClientRouteToScreenMapping;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.contacts.RealContactSync$reset$2$1;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.activity.CashActivityQueries$RecentsQuery;
import com.squareup.cash.db2.activity.CashActivityQueries$recents$2;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.reactions.real.RealReactionManager;
import com.squareup.cash.recipients.backend.real.RealRecipientSearchController$search$$inlined$map$2;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager2;
import com.squareup.cash.treehouse.activity.ShareSheet;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import com.squareup.cash.ui.ScreenshotReportingManager$initialize$3$1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.coroutines.StateFlowKt;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import okio.ByteString;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;

/* loaded from: classes.dex */
public final class RealActivityPaymentManager2 implements ActivityPaymentManager2 {
    public final RealActivityUpdatesNotifier activityNotifierRelay;
    public final Analytics analytics;
    public final RealClientRouteParser clientRouteParser;
    public final RealClientRouteToScreenMapping clientRouteToScreenMapping;
    public final RealClientSyncer clientSyncer;
    public final RealContactRepository contactRepository;
    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 displayQuickAccessBar;
    public final CoroutineContext ioDispatcher;
    public final LoadTimeClock loadTimeClock;
    public final RealPaymentActionCompletionDispatcher paymentActionCompletionDispatcher;
    public final RealPaymentManager paymentManager;
    public final RealReactionManager reactionManager;
    public final Lazy scenarioPlanJsonAdapter$delegate;
    public final Lazy statusResultJsonAdapter$delegate;
    public final Lazy uiCustomerJsonAdapter$delegate;

    public RealActivityPaymentManager2(RealReactionManager realReactionManager, RealPaymentManager realPaymentManager, RealPaymentActionCompletionDispatcher realPaymentActionCompletionDispatcher, CoroutineContext coroutineContext, Moshi moshi, RealFlowTokenGenerator realFlowTokenGenerator, ClientRoutesConfig clientRoutesConfig, RealClientRouteParser realClientRouteParser, RealClientRouteToScreenMapping realClientRouteToScreenMapping, RealContactRepository realContactRepository, DoubleCheck doubleCheck, RealClientSyncer realClientSyncer, LoadTimeClock loadTimeClock, Analytics analytics, RealActivityUpdatesNotifier realActivityUpdatesNotifier, CashAccountDatabaseImpl cashAccountDatabaseImpl, AppConfigManager appConfigManager) {
        this.reactionManager = realReactionManager;
        this.paymentManager = realPaymentManager;
        this.paymentActionCompletionDispatcher = realPaymentActionCompletionDispatcher;
        this.ioDispatcher = coroutineContext;
        this.clientRouteParser = realClientRouteParser;
        this.clientRouteToScreenMapping = realClientRouteToScreenMapping;
        this.contactRepository = realContactRepository;
        this.clientSyncer = realClientSyncer;
        this.loadTimeClock = loadTimeClock;
        this.analytics = analytics;
        this.activityNotifierRelay = realActivityUpdatesNotifier;
        this.uiCustomerJsonAdapter$delegate = LazyKt.lazy(new ZiplineActivityItemFormatter$$ExternalSyntheticLambda0(moshi, 4));
        int i = 5;
        this.scenarioPlanJsonAdapter$delegate = LazyKt.lazy(new ZiplineActivityItemFormatter$$ExternalSyntheticLambda0(moshi, i));
        this.statusResultJsonAdapter$delegate = LazyKt.lazy(new ZiplineActivityItemFormatter$$ExternalSyntheticLambda0(moshi, 6));
        PaymentQueries paymentQueries = cashAccountDatabaseImpl.cashActivityQueries;
        BlockState blockState = BlockState.BLOCKED;
        PaymentState paymentState = PaymentState.COMPLETE;
        Orientation orientation = Orientation.BILL;
        Role role = Role.RECIPIENT;
        PaymentState paymentState2 = PaymentState.FAILED;
        paymentQueries.getClass();
        blockState.getClass();
        this.displayQuickAccessBar = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(DBUtil.mapToList(DBUtil.toFlow(new CashActivityQueries$RecentsQuery(paymentQueries, blockState, paymentState, orientation, role, paymentState2, new ViewTreeObservers$$ExternalSyntheticLambda3(3, CashActivityQueries$recents$2.INSTANCE, paymentQueries))), coroutineContext), ((RealAppConfigManager) appConfigManager).invitationConfig(), new ScreenshotReportingManager$initialize$3$1(3, null, i), 0);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object acceptCryptoPayment(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.acceptCryptoPayment$real(generateToken, str);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Flow activityUpdates() {
        return new MoneyTabPresenter$models$lambda$31$$inlined$map$1(this.activityNotifierRelay.notifications, 25);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object addReaction(String str, String str2, String str3, String str4, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        this.reactionManager.addReaction(str, str2, str3, str4, true, new RealContactSync$reset$2$1(cancellableContinuationImpl, 1));
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object callNumber(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.callNumber$real(generateToken, str, str2);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object cancel(String str, ByteString byteString, String str2, String str3, String str4, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.cancel$real(generateToken, str, (Money) Money.ADAPTER.decode(byteString), CollectionsKt__CollectionsKt.listOfNotNull(str2 != null ? (UiCustomer) ((JsonAdapter) this.uiCustomerJsonAdapter$delegate.getValue()).fromJson(str2) : null));
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object cancelCryptoOrder(String str, String str2, String str3, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.cancelCryptoOrder$real(generateToken, str, str2);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object cancelInvestmentOrder(String str, String str2, String str3, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.cancelInvestmentOrder$real(generateToken, str, str2);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object cancelRecurringPurchase(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2, String str3, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        ScheduledTransactionPreference.Type type2 = (ScheduledTransactionPreference.Type) ScheduledTransactionPreference.Type.ADAPTER.decode(byteString);
        RecurringSchedule.Frequency frequency = (RecurringSchedule.Frequency) RecurringSchedule.Frequency.ADAPTER.decode(byteString2);
        InvestmentEntityToken investmentEntityToken = str2 != null ? new InvestmentEntityToken(str2) : null;
        Money money = (Money) Money.ADAPTER.decode(byteString3);
        generateToken.getClass();
        type2.getClass();
        frequency.getClass();
        money.getClass();
        StateFlowKt.emitOrThrow(this.paymentManager.paymentActions, new PaymentAction.CancelRecurringPurchase(generateToken, type2, frequency, investmentEntityToken, money));
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object checkStatus(String str, ByteString byteString, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.checkStatus$real(generateToken, str, (Money) Money.ADAPTER.decode(byteString), CollectionsKt__CollectionsKt.listOfNotNull(str2 != null ? (UiCustomer) ((JsonAdapter) this.uiCustomerJsonAdapter$delegate.getValue()).fromJson(str2) : null));
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final void clearBadges(Set set) {
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object completeClientScenario(String str, String str2, String str3, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.completeClientScenario$real(ClientScenario.valueOf(str2), generateToken, str);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object completeScenarioPlan(String str, String str2, String str3, String str4, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.completeScenarioPlan(generateToken, str, str2 != null ? (ScenarioPlan) ((JsonAdapter) this.scenarioPlanJsonAdapter$delegate.getValue()).fromJson(str2) : null, str3 != null ? (StatusResult) ((JsonAdapter) this.statusResultJsonAdapter$delegate.getValue()).fromJson(str3) : null);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object confirm(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.confirm(generateToken, str);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Flow deviceContacts() {
        return new RealRecipientSearchController$search$$inlined$map$2(this.contactRepository.contacts(), 2);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final void finishedInitialRendering() {
        LoadTimeClock loadTimeClock = this.loadTimeClock;
        loadTimeClock.stop();
        this.analytics.track(new ActivityHistoryViewLoad(loadTimeClock.duration(), null, Boolean.TRUE, 58), null);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Flow getDisplayQuickAccessBar() {
        return this.displayQuickAccessBar;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object linkCard(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.linkCard$real(generateToken, str);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object makeLoanPayment(String str, ByteString byteString, String str2, String str3, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.makeLoanPayment$real((Money) Money.ADAPTER.decode(byteString), generateToken, str, str2);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object openShareSheet(String str, ShareSheet shareSheet, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        PaymentHistoryButton.ShareSheetDetails.Companion companion = PaymentHistoryButton.ShareSheetDetails.INSTANCE;
        PaymentHistoryButton.ShareSheetDetails.Builder builder = new PaymentHistoryButton.ShareSheetDetails.Builder();
        builder.title = shareSheet.getTitle();
        builder.default_phone_number = shareSheet.getDefaultPhoneNumber();
        builder.content = shareSheet.getContent();
        this.paymentManager.openShareSheet$real(generateToken, builder.build());
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object openUrl(ClientRouteUrl clientRouteUrl, String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.openUrl$real(generateToken, str, str2, clientRouteUrl != null ? toScreen(clientRouteUrl) : null);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object passcode(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.passcode$real(generateToken, str);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object refund(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.refund$real(generateToken, str);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object reportAbuse(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.reportAbuse(generateToken, str, str2, str3, str5 != null ? new PaymentHistoryButton.Dialog(str4, str5, "", null, 8, null) : null);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object reportProblem(ClientRouteUrl clientRouteUrl, String str, String str2, String str3, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.reportProblem$real(generateToken, str2, null, new HistoryScreens.PaymentReceipt(str2, null, null, null, null, 62));
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final void requestClientSync() {
        this.clientSyncer.sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object reverseDeposit(ClientRouteUrl clientRouteUrl, String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.reverseDeposit$real(toScreen(clientRouteUrl), generateToken, str);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object showContact(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        generateToken.getClass();
        StateFlowKt.emitOrThrow(this.paymentManager.paymentActions, new PaymentAction.ShowContact(generateToken, str2));
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object showPaymentDetailView(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.showPaymentDetailView$real(generateToken, str, true);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object showProfile(String str, String str2, String str3, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        PaymentManager.showProfile$default(this.paymentManager, generateToken, str, str2, str3);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object showThread(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(BlockersData.Flow.Companion.generateToken(), null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object skipLoanPayment(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.skipLoanPayment$real(generateToken, str);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object startSupportFlow(ClientRouteUrl clientRouteUrl, String str, String str2, String str3, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.startSupportFlow$real(generateToken, str, str2, null, toScreen(clientRouteUrl));
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    public final Screen toScreen(ClientRouteUrl clientRouteUrl) {
        String url = clientRouteUrl.getUrl();
        if (StringsKt__StringsJVMKt.startsWith(url, "/", false)) {
            url = "https://internal.cash.app".concat(url);
        }
        ClientRoute parse = this.clientRouteParser.parse(url);
        if (parse != null) {
            return this.clientRouteToScreenMapping.toScreen(parse);
        }
        Handlers$$ExternalSyntheticBUOutline0.m(clientRouteUrl, "unexpected url: ");
        return null;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object unreportAbuse(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.unreportAbuse(generateToken, str, str2, str3, str5 != null ? new PaymentHistoryButton.Dialog(str4, str5, "", null, 8, null) : null);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object verifyIdentity(String str, String str2, String str3, String str4, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        ScenarioPlan scenarioPlan = str2 != null ? (ScenarioPlan) ((JsonAdapter) this.scenarioPlanJsonAdapter$delegate.getValue()).fromJson(str2) : null;
        StatusResult statusResult = str3 != null ? (StatusResult) ((JsonAdapter) this.statusResultJsonAdapter$delegate.getValue()).fromJson(str3) : null;
        generateToken.getClass();
        this.paymentManager.completeScenarioPlan(generateToken, str, scenarioPlan, statusResult);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object reportAbuse(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.reportAbuse(generateToken, str, str2, null, null);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
    public final Object unreportAbuse(String str, String str2, Continuation continuation) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.unreportAbuse(generateToken, str, str2, null, null);
        Object m = Matcher$$ExternalSyntheticOutline0.m(this.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 4), continuation);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : Unit.INSTANCE;
    }
}
