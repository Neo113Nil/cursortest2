package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public enum AuditConfig {
    CUSTOMER(new Matcher$$ExternalSyntheticLambda9(4), "customer.customer.id"),
    PAYMENT(new Matcher$$ExternalSyntheticLambda9(5), "payment.payment.token"),
    LOAN_ACTIVITY(new Matcher$$ExternalSyntheticLambda9(6), "payment.payment.token", new Matcher$$ExternalSyntheticLambda9(7)),
    INVESTMENT_HOLDING(new Matcher$$ExternalSyntheticLambda9(8), "investment_holding.investment_entity_token", new Matcher$$ExternalSyntheticLambda9(9));

    public final Function1 payloadId;
    public final String payloadIdField;
    public final Function1 payloadIdTransform;

    /* synthetic */ AuditConfig(Function1 function1, String str) {
        this(function1, str, new Matcher$$ExternalSyntheticLambda9(10));
    }

    AuditConfig(Function1 function1, String str, Function1 function12) {
        this.payloadId = function1;
        this.payloadIdField = str;
        this.payloadIdTransform = function12;
    }
}
