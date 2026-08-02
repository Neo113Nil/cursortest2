package com.squareup.cash.history.presenters;

import com.squareup.cash.activity.backend.loader.OrderActivityData;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/history/presenters/OrderActivityDataFormattingError;", "Lcom/squareup/cash/observability/types/ReportedError;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OrderActivityDataFormattingError extends ReportedError {
    public final Exception cause;
    public final Map metadata;
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Activity.INSTANCE);
    public final Set targets = ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.LOGS, ReportedError.ErrorReportingTarget.BUGSNAG, ReportedError.ErrorReportingTarget.DATADOG});
    public final String message = "Order Activity item formatting failed";

    public OrderActivityDataFormattingError(Exception exc, OrderActivityData orderActivityData) {
        Map m;
        this.cause = exc;
        if (orderActivityData == null) {
            m = EmptyMap.INSTANCE;
            m.getClass();
        } else {
            CashAppPayOrderRenderData cashAppPayOrderRenderData = orderActivityData.orderRenderData;
            Pair pair = new Pair("Order Id", cashAppPayOrderRenderData.order_id);
            Pair pair2 = new Pair("Activity Item Global Id", orderActivityData.activityItemGlobalId);
            Pair pair3 = new Pair("Client Id", cashAppPayOrderRenderData.client_id);
            CashAppPayMerchantRenderData cashAppPayMerchantRenderData = cashAppPayOrderRenderData.merchant;
            m = BalanceFeedKt$$ExternalSyntheticOutline0.m("Order Activity", MapsKt__MapsKt.mapOf(pair, pair2, pair3, new Pair("Merchant Id", cashAppPayMerchantRenderData != null ? cashAppPayMerchantRenderData.merchant_id : null)));
        }
        this.metadata = m;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Set getTargets() {
        return this.targets;
    }
}
