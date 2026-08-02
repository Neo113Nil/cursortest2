package com.squareup.cash.benefits.activity;

import com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilter;
import com.squareup.protos.cash.activity.api.v1.PaymentStateSearchFilter;
import com.squareup.protos.cash.activity.api.v1.ProductClassifierAnyOfSearchFilter;
import com.squareup.protos.cash.activity.api.v1.ProductClassifierSearchFilter;
import com.squareup.protos.cash.activity.api.v1.SearchFilterContains;
import com.squareup.protos.cash.activity.api.v1.SearchFilterEquals;
import com.squareup.protos.franklin.ui.PaymentState;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes7.dex */
public abstract class BenefitsActivityRequestHandlerKt {
    public static final ActivitySearchFilter FAILED_PAYMENT_STATE_SEARCH_FILTER;
    public static final ActivitySearchFilter SENDER_CANCELED_PAYMENT_STATE_SEARCH_FILTER;
    public static final ActivitySearchFilter INCLUDE_PRODUCT_SEARCH_FILTER = new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.ProductClassifiersAnyOf(new ProductClassifierAnyOfSearchFilter(CollectionsKt__CollectionsKt.listOf((Object[]) new ActivityProductClassifier[]{ActivityProductClassifier.APC_CASH_CARD, ActivityProductClassifier.APC_CASH_APP_PAY_PAYMENT}))));
    public static final ActivitySearchFilter EXCLUDE_PRODUCT_SEARCH_FILTER = new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.ProductClassifier(new ProductClassifierSearchFilter(ActivityProductClassifier.APC_ATM, SearchFilterContains.DOES_NOT_CONTAIN, 4)));

    static {
        PaymentState paymentState = PaymentState.SENDER_CANCELED;
        SearchFilterEquals searchFilterEquals = SearchFilterEquals.DOES_NOT_EQUAL;
        SENDER_CANCELED_PAYMENT_STATE_SEARCH_FILTER = new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.PaymentState(new PaymentStateSearchFilter(paymentState, searchFilterEquals)));
        FAILED_PAYMENT_STATE_SEARCH_FILTER = new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.PaymentState(new PaymentStateSearchFilter(PaymentState.FAILED, searchFilterEquals)));
    }
}
