package com.squareup.cash.clientrouting.routers.activity;

import app.cash.broadway.navigation.Navigator;
import app.cash.history.screens.HistoryScreens;
import com.squareup.cash.activity.presenters.RealActivityScreenInitialArgumentsSupplier;
import com.squareup.cash.activity.primitives.ActivityItemKey;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.FeatureContextKt;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.protos.cash.activity.api.v1.ActivityGetRequest;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityReceiptClientRouteParameters;
import com.squareup.wire.ProtoAdapter;
import java.net.URLEncoder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ActivityRouter {
    public final RealActivityScreenInitialArgumentsSupplier activityScreenInitialArgumentsSupplier;
    public final CashAccountDatabaseImpl cashDatabase;
    public final CoroutineContext ioDispatcher;
    public final Navigator navigator;
    public final CoroutineScope scope;

    public ActivityRouter(CashAccountDatabaseImpl cashAccountDatabaseImpl, Analytics analytics, CoroutineContext coroutineContext, Navigator navigator, RealActivityScreenInitialArgumentsSupplier realActivityScreenInitialArgumentsSupplier, CoroutineScope coroutineScope, RealUuidGenerator realUuidGenerator) {
        navigator.getClass();
        this.cashDatabase = cashAccountDatabaseImpl;
        this.ioDispatcher = coroutineContext;
        this.navigator = navigator;
        this.activityScreenInitialArgumentsSupplier = realActivityScreenInitialArgumentsSupplier;
        this.scope = coroutineScope;
    }

    public final void route(ClientRoute.ViewActivityReceiptOnRequestV2 viewActivityReceiptOnRequestV2) {
        viewActivityReceiptOnRequestV2.getClass();
        ProtoAdapter protoAdapter = ActivityReceiptClientRouteParameters.ADAPTER;
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewActivityReceiptOnRequestV2.routeParameters);
        decodeBase64.getClass();
        ActivityReceiptClientRouteParameters activityReceiptClientRouteParameters = (ActivityReceiptClientRouteParameters) protoAdapter.decode(decodeBase64);
        ActivityGetRequest activityGetRequest = activityReceiptClientRouteParameters.activity_get_request;
        ActivityItemGlobalId activityItemGlobalId = activityGetRequest != null ? activityGetRequest.activityItemGlobalId : null;
        activityItemGlobalId.getClass();
        ActivityItemKey activityItemKey = new ActivityItemKey(activityItemGlobalId, activityGetRequest.activity_token, activityGetRequest.activity_scope);
        String str = activityReceiptClientRouteParameters.exit_url;
        this.navigator.goTo(new HistoryScreens.PaymentReceipt(activityItemKey, str != null ? URLEncoder.encode(str, Charsets.UTF_8.name()) : null, 4));
    }

    public final void route(ClientRoute.DeprecatedViewCancelPendingSingleUsePayment deprecatedViewCancelPendingSingleUsePayment) {
        deprecatedViewCancelPendingSingleUsePayment.getClass();
        this.navigator.goTo(new HistoryScreens.CancelPendingSupPaymentScreen(deprecatedViewCancelPendingSingleUsePayment.paymentToken));
    }

    public final void route(ClientRoute.ViewActivity viewActivity) {
        viewActivity.getClass();
        this.navigator.goTo(ActivityScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewActivitySearch viewActivitySearch) {
        viewActivitySearch.getClass();
        JobKt.launch$default(this.scope, null, null, new EntitySyncerKt$hasSyncedFlow$1(this, viewActivitySearch, (Continuation) null, 6), 3);
        this.navigator.goTo(new GlobalSearchScreen(SearchOrigin.ACTIVITY_TAB, true));
    }

    public final void route(ClientRoute.ViewThreadedCustomerActivity viewThreadedCustomerActivity) {
        viewThreadedCustomerActivity.getClass();
        this.navigator.goTo(ActivityScreen.INSTANCE);
        JobKt.launch$default(this.scope, null, null, new EntitySyncerKt$hasSyncedFlow$1(this, viewThreadedCustomerActivity, (Continuation) null, 7), 3);
    }

    public final void route(ClientRoute.ViewInvestingRoundupsSkippedConfirmation viewInvestingRoundupsSkippedConfirmation) {
        viewInvestingRoundupsSkippedConfirmation.getClass();
        this.navigator.goTo(HistoryScreens.InvestingRoundUpsSkippedConfirmationScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewInvestingRoundupsFailedConfirmation viewInvestingRoundupsFailedConfirmation) {
        viewInvestingRoundupsFailedConfirmation.getClass();
        this.navigator.goTo(HistoryScreens.InvestingRoundUpsFailedConfirmationScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewPaymentDetailsReceipt viewPaymentDetailsReceipt) {
        viewPaymentDetailsReceipt.getClass();
        ActivityScreen activityScreen = ActivityScreen.INSTANCE;
        Navigator navigator = this.navigator;
        navigator.goTo(activityScreen);
        navigator.goTo(new HistoryScreens.PaymentReceipt(viewPaymentDetailsReceipt.paymentToken, null, null, null, null, 62));
    }

    public final void route(ClientRoute.ViewActivityReceiptOnRequest viewActivityReceiptOnRequest) {
        viewActivityReceiptOnRequest.getClass();
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewActivityReceiptOnRequest.activityGetRequest);
        decodeBase64.getClass();
        ActivityGetRequest activityGetRequest = (ActivityGetRequest) ActivityGetRequest.ADAPTER.decode(decodeBase64);
        ActivityItemGlobalId activityItemGlobalId = activityGetRequest.activityItemGlobalId;
        activityItemGlobalId.getClass();
        this.navigator.goTo(new HistoryScreens.PaymentReceipt(new ActivityItemKey(activityItemGlobalId, activityGetRequest.activity_token, activityGetRequest.activity_scope), (String) null, 6));
    }

    public final void route(ClientRoute.ViewPendingInvestmentOrderRollupActivity viewPendingInvestmentOrderRollupActivity, RoutingParams routingParams) {
        viewPendingInvestmentOrderRollupActivity.getClass();
        routingParams.getClass();
        boolean isMoneybot = FeatureContextKt.isMoneybot(routingParams.featureContext);
        Navigator navigator = this.navigator;
        if (!isMoneybot) {
            navigator.goTo(ActivityScreen.INSTANCE);
        }
        navigator.goTo(HistoryScreens.InvestingPendingTransactionsScreen.INSTANCE);
    }
}
