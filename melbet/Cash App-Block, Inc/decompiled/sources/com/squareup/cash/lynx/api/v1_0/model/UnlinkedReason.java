package com.squareup.cash.lynx.api.v1_0.model;

import com.fillr.e;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes4.dex */
public enum UnlinkedReason implements WireEnum {
    UNKNOWN_REASON(0),
    UNLINK(1),
    REPLACE(2),
    COMPLIANCE(3),
    FRAUD(4),
    RTAU(5),
    RTAU_UNLINKED(6),
    CUSTOMER_ACCOUNT_DEACTIVATED(7),
    PUSH_FAILURE(8),
    PLAID_USER_PERMISSION_REVOKED(9),
    PLAID_USER_ACCOUNT_REVOKED(10),
    NETWORK_TOKEN_UPDATE(11),
    BANKLIN_SYNC(12),
    MULTI_LINK_CLEAN_UP(13),
    P2P_POOL_CLOSED(14),
    ASYNC_ACCOUNT_UPDATE(15);

    public static final UnlinkedReason$Companion$ADAPTER$1 ADAPTER;
    public static final e Companion;
    public final int value;

    static {
        UnlinkedReason unlinkedReason = UNKNOWN_REASON;
        Companion = new e();
        ADAPTER = new UnlinkedReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UnlinkedReason.class), Syntax.PROTO_2, unlinkedReason);
    }

    UnlinkedReason(int i) {
        this.value = i;
    }

    public static final UnlinkedReason fromValue(int i) {
        Companion.getClass();
        return e.m1941fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
