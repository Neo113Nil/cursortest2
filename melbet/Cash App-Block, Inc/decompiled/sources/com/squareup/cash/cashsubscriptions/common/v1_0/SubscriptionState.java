package com.squareup.cash.cashsubscriptions.common.v1_0;

import com.google.mlkit.vision.text.zzd;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes4.dex */
public enum SubscriptionState implements WireEnum {
    SUBSCRIPTION_STATE_UNKNOWN(0),
    PENDING_BILLING(1),
    PENDING_PAYMENT(2),
    ACTIVE(3),
    PAST_DUE(4),
    CANCELLED(5),
    EXPIRED(6),
    GRANT_REVOKED(7),
    PENDING_ACTIVATION(8);

    public static final SubscriptionState$Companion$ADAPTER$1 ADAPTER;
    public static final zzd Companion;
    public final int value;

    static {
        SubscriptionState subscriptionState = SUBSCRIPTION_STATE_UNKNOWN;
        Companion = new zzd(20);
        ADAPTER = new SubscriptionState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SubscriptionState.class), Syntax.PROTO_2, subscriptionState);
    }

    SubscriptionState(int i) {
        this.value = i;
    }

    public static final SubscriptionState fromValue(int i) {
        Companion.getClass();
        return zzd.m2071fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
