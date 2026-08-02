package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class TapBehavior$TapAction$Action$ClientRouteAction {
    public final String clientRoute;

    public TapBehavior$TapAction$Action$ClientRouteAction(String str) {
        this.clientRoute = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapBehavior$TapAction$Action$ClientRouteAction) && this.clientRoute.equals(((TapBehavior$TapAction$Action$ClientRouteAction) obj).clientRoute);
    }

    public final int hashCode() {
        return this.clientRoute.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRouteAction(clientRoute=", this.clientRoute, ")");
    }
}
