package com.squareup.cash.payments.backend.real;

import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.activityhistory.ActivityHistoryViewLoad;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.ClientRoutesConfig;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealClientRouteToScreenMapping;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.reactions.real.RealReactionManager;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager;
import com.squareup.cash.treehouse.activity.ShareSheet;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import com.squareup.cash.util.cache.Cache;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.coroutines.StateFlowKt;
import dev.zacsweers.metro.Provider;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.ByteString;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class RealActivityPaymentManager implements ActivityPaymentManager {
    public final AtomicInteger activityFeedUpdatesCounter;
    public final SharedFlowImpl activityFeedUpdatesFlow;
    public final SharedFlowImpl activityItemUpdatesFlow;
    public final RealActivityPaymentManager2 activityPaymentManager2;
    public final Analytics analytics;
    public final RealClientRouteParser clientRouteParser;
    public final RealClientRouteToScreenMapping clientRouteToScreenMapping;
    public final LoadTimeClock loadTimeClock;
    public final RealPaymentActionCompletionDispatcher paymentActionCompletionDispatcher;
    public final RealPaymentManager paymentManager;
    public final Provider reactionManager;
    public final Lazy scenarioPlanJsonAdapter$delegate;
    public final CoroutineScope scope;
    public final Lazy statusResultJsonAdapter$delegate;
    public final Lazy uiCustomerJsonAdapter$delegate;

    public RealActivityPaymentManager(RealPaymentManager realPaymentManager, RealClientRouteParser realClientRouteParser, RealClientRouteToScreenMapping realClientRouteToScreenMapping, Provider provider, ClientRoutesConfig clientRoutesConfig, Analytics analytics, LoadTimeClock loadTimeClock, RealPaymentActionCompletionDispatcher realPaymentActionCompletionDispatcher, CoroutineScope coroutineScope, CoroutineContext coroutineContext, Moshi moshi, RealActivityPaymentManager2 realActivityPaymentManager2) {
        provider.getClass();
        this.paymentManager = realPaymentManager;
        this.clientRouteParser = realClientRouteParser;
        this.clientRouteToScreenMapping = realClientRouteToScreenMapping;
        this.reactionManager = provider;
        this.analytics = analytics;
        this.loadTimeClock = loadTimeClock;
        this.paymentActionCompletionDispatcher = realPaymentActionCompletionDispatcher;
        this.scope = coroutineScope;
        this.activityPaymentManager2 = realActivityPaymentManager2;
        int i = 1;
        this.uiCustomerJsonAdapter$delegate = LazyKt.lazy(new ZiplineActivityItemFormatter$$ExternalSyntheticLambda0(moshi, i));
        this.scenarioPlanJsonAdapter$delegate = LazyKt.lazy(new ZiplineActivityItemFormatter$$ExternalSyntheticLambda0(moshi, 2));
        this.statusResultJsonAdapter$delegate = LazyKt.lazy(new ZiplineActivityItemFormatter$$ExternalSyntheticLambda0(moshi, 3));
        this.activityFeedUpdatesCounter = new AtomicInteger(0);
        this.activityFeedUpdatesFlow = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
        this.activityItemUpdatesFlow = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
        JobKt.launch$default(coroutineScope, coroutineContext, null, new Cache.AnonymousClass1(this, null, i), 2);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void acceptCryptoPayment(String str) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.acceptCryptoPayment$real(BlockersData.Flow.Companion.generateToken(), str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final Flow activityFeedUpdates() {
        return this.activityFeedUpdatesFlow;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final Flow activityItemUpdates() {
        return this.activityItemUpdatesFlow;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void addReaction(String str, String str2, String str3, String str4) {
        ((RealReactionManager) this.reactionManager.invoke()).addReaction(str, str2, str3, str4, true, new OffersHomeV2Kt$$ExternalSyntheticLambda7(24, this, str));
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void callNumber(String str, String str2) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.callNumber$real(BlockersData.Flow.Companion.generateToken(), str, str2);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancel(String str, Integer num, String str2, ByteString byteString) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.cancel$real(BlockersData.Flow.Companion.generateToken(), str, (Money) Money.ADAPTER.decode(byteString), CollectionsKt__CollectionsKt.listOfNotNull(str2 != null ? (UiCustomer) ((JsonAdapter) this.uiCustomerJsonAdapter$delegate.getValue()).fromJson(str2) : null));
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelCryptoOrder(String str, String str2) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.cancelCryptoOrder$real(BlockersData.Flow.Companion.generateToken(), str, str2);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelInvestmentOrder(String str, String str2) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.cancelInvestmentOrder$real(BlockersData.Flow.Companion.generateToken(), str, str2);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelRecurringPurchase(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2) {
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
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void checkStatus(String str, String str2, ByteString byteString) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.checkStatus$real(BlockersData.Flow.Companion.generateToken(), str, (Money) Money.ADAPTER.decode(byteString), CollectionsKt__CollectionsKt.listOfNotNull(str2 != null ? (UiCustomer) ((JsonAdapter) this.uiCustomerJsonAdapter$delegate.getValue()).fromJson(str2) : null));
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void clearBadges(List list) {
        CollectionsKt.toSet(list).getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void completeClientScenario(int i, String str) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.completeClientScenario$real((ClientScenario) ClientScenario.getEntries().get(i), generateToken, str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void completeScenarioPlan(String str, String str2, String str3) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.completeScenarioPlan(BlockersData.Flow.Companion.generateToken(), str, str2 != null ? (ScenarioPlan) ((JsonAdapter) this.scenarioPlanJsonAdapter$delegate.getValue()).fromJson(str2) : null, str3 != null ? (StatusResult) ((JsonAdapter) this.statusResultJsonAdapter$delegate.getValue()).fromJson(str3) : null);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void confirm(String str) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.confirm(BlockersData.Flow.Companion.generateToken(), str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final Flow deviceContacts() {
        return this.activityPaymentManager2.deviceContacts();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void finishedInitialRendering() {
        LoadTimeClock loadTimeClock = this.loadTimeClock;
        loadTimeClock.stop();
        this.analytics.track(new ActivityHistoryViewLoad(loadTimeClock.duration(), null, Boolean.TRUE, 58), null);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void linkCard(String str) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.linkCard$real(BlockersData.Flow.Companion.generateToken(), str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void makeLoanPayment(String str, String str2, ByteString byteString) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.makeLoanPayment$real((Money) Money.ADAPTER.decode(byteString), generateToken, str, str2);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void openShareSheet(String str, ShareSheet shareSheet) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.openShareSheet$real(BlockersData.Flow.Companion.generateToken(), new PaymentHistoryButton.ShareSheetDetails.Builder().title(shareSheet.getTitle()).default_phone_number(shareSheet.getDefaultPhoneNumber()).content(shareSheet.getContent()).build());
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void openUrl(ClientRouteUrl clientRouteUrl, String str, String str2) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.openUrl$real(BlockersData.Flow.Companion.generateToken(), str, str2, clientRouteUrl != null ? toScreen$1(clientRouteUrl) : null);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void passcode(String str) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.passcode$real(BlockersData.Flow.Companion.generateToken(), str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void refund(String str) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.refund$real(BlockersData.Flow.Companion.generateToken(), str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void reportAbuse(String str, String str2) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.reportAbuse(BlockersData.Flow.Companion.generateToken(), str, str2, null, null);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void reportProblem(ClientRouteUrl clientRouteUrl, String str, String str2, String str3) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.reportProblem$real(BlockersData.Flow.Companion.generateToken(), str2, null, new HistoryScreens.PaymentReceipt(str2, null, null, null, null, 62));
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void reverseDeposit(String str, ClientRouteUrl clientRouteUrl) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.reverseDeposit$real(toScreen$1(clientRouteUrl), generateToken, str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void showContact(String str, String str2) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        generateToken.getClass();
        StateFlowKt.emitOrThrow(this.paymentManager.paymentActions, new PaymentAction.ShowContact(generateToken, str2));
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void showPaymentDetailView(String str, String str2) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.showPaymentDetailView$real(BlockersData.Flow.Companion.generateToken(), str, true);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void showProfile(String str, String str2, String str3) {
        BlockersData.Flow.INSTANCE.getClass();
        PaymentManager.showProfile$default(this.paymentManager, BlockersData.Flow.Companion.generateToken(), str, str2, str3);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void showThread(String str, String str2) {
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void skipLoanPayment(String str) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.skipLoanPayment$real(BlockersData.Flow.Companion.generateToken(), str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void startSupportFlow(ClientRouteUrl clientRouteUrl, String str, String str2) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.startSupportFlow$real(BlockersData.Flow.Companion.generateToken(), str, str2, null, toScreen$1(clientRouteUrl));
    }

    public final Screen toScreen$1(ClientRouteUrl clientRouteUrl) {
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

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void unreportAbuse(String str, String str2) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.unreportAbuse(BlockersData.Flow.Companion.generateToken(), str, str2, null, null);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void verifyIdentity(String str, String str2, String str3) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        ScenarioPlan scenarioPlan = str2 != null ? (ScenarioPlan) ((JsonAdapter) this.scenarioPlanJsonAdapter$delegate.getValue()).fromJson(str2) : null;
        StatusResult statusResult = str3 != null ? (StatusResult) ((JsonAdapter) this.statusResultJsonAdapter$delegate.getValue()).fromJson(str3) : null;
        generateToken.getClass();
        this.paymentManager.completeScenarioPlan(generateToken, str, scenarioPlan, statusResult);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void acceptCryptoPayment(String str, String str2) {
        acceptCryptoPayment(str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelCryptoOrder(String str, String str2, String str3) {
        cancelCryptoOrder(str, str2);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelInvestmentOrder(String str, String str2, String str3) {
        cancelInvestmentOrder(str, str2);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void confirm(String str, String str2) {
        confirm(str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void linkCard(String str, String str2) {
        linkCard(str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void passcode(String str, String str2) {
        passcode(str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void refund(String str, String str2) {
        refund(str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void skipLoanPayment(String str, String str2) {
        skipLoanPayment(str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void reverseDeposit(ClientRouteUrl clientRouteUrl, String str, String str2) {
        reverseDeposit(str, clientRouteUrl);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void startSupportFlow(ClientRouteUrl clientRouteUrl, String str, String str2, String str3) {
        startSupportFlow(clientRouteUrl, str, str2);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void makeLoanPayment(String str, String str2, String str3, ByteString byteString) {
        makeLoanPayment(str, str2, byteString);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void addReaction(String str, String str2, String str3) {
        addReaction(str, str2, str3, null);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void completeClientScenario(String str, String str2) {
        BlockersData.Flow.INSTANCE.getClass();
        String generateToken = BlockersData.Flow.Companion.generateToken();
        this.paymentManager.completeClientScenario$real(ClientScenario.valueOf(str2), generateToken, str);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void completeClientScenario(String str, String str2, String str3) {
        completeClientScenario(str, str2);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancel(String str, String str2, String str3, ByteString byteString) {
        BlockersData.Flow.INSTANCE.getClass();
        this.paymentManager.cancel$real(BlockersData.Flow.Companion.generateToken(), str, (Money) Money.ADAPTER.decode(byteString), CollectionsKt__CollectionsKt.listOfNotNull(str2 != null ? (UiCustomer) ((JsonAdapter) this.uiCustomerJsonAdapter$delegate.getValue()).fromJson(str2) : null));
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancel(String str, String str2, String str3, String str4, ByteString byteString) {
        cancel(str, str2, str3, byteString);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void completeScenarioPlan(String str, String str2, String str3, String str4) {
        completeScenarioPlan(str, str2, str3);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void verifyIdentity(String str, String str2, String str3, String str4) {
        verifyIdentity(str, str2, str3);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelRecurringPurchase(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2, String str3) {
        cancelRecurringPurchase(str, byteString, byteString2, byteString3, str2);
    }
}
