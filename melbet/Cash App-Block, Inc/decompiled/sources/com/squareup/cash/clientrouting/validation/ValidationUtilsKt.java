package com.squareup.cash.clientrouting.validation;

import com.squareup.cash.cdf.clientroute.ClientRouteInteractFailCheck;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.validation.ValidatorResult;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.UiAlias;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes6.dex */
public abstract class ValidationUtilsKt {
    public static final Set BYPASS_FLOW_TYPES;

    static {
        UiAlias.Type.Companion companion = Flow$Type.Companion;
        BYPASS_FLOW_TYPES = SetsKt__SetsJVMKt.setOf("ACCOUNT_RECOVERY");
    }

    public static final boolean isClientRouteAFlowOrFlowTypeRoute(ClientRoute clientRoute) {
        clientRoute.getClass();
        if (clientRoute instanceof ClientRoute.Flow) {
            return true;
        }
        if (clientRoute instanceof ClientRoute.FlowType) {
            return !BYPASS_FLOW_TYPES.contains(((ClientRoute.FlowType) clientRoute).flowType);
        }
        return false;
    }

    public static final ClientRouteInteractFailCheck.ClientRouteNotAllowedReason toCdfReason(ValidatorResult.NotAllowed.Reason reason) {
        reason.getClass();
        int ordinal = reason.ordinal();
        if (ordinal == 0) {
            return ClientRouteInteractFailCheck.ClientRouteNotAllowedReason.ACCOUNT_IDENTIFIER_NOT_SUPPLIED;
        }
        if (ordinal == 1) {
            return ClientRouteInteractFailCheck.ClientRouteNotAllowedReason.BTCX_ROUTE_NOT_ALLOWED;
        }
        if (ordinal == 2) {
            return ClientRouteInteractFailCheck.ClientRouteNotAllowedReason.CASH_APP_PAY_ONBOARDING;
        }
        if (ordinal == 3) {
            return ClientRouteInteractFailCheck.ClientRouteNotAllowedReason.LOGGED_IN_ROUTE_ACCOUNT_NOT_AUTHENTICATED;
        }
        if (ordinal == 4) {
            return ClientRouteInteractFailCheck.ClientRouteNotAllowedReason.LOGGED_OUT_ROUTE_ACCOUNT_AUTHENTICATED;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
