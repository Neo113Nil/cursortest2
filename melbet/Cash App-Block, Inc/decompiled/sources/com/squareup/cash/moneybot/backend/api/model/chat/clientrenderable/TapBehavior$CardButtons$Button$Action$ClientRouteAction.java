package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class TapBehavior$CardButtons$Button$Action$ClientRouteAction {
    public final String clientRoute;

    public TapBehavior$CardButtons$Button$Action$ClientRouteAction(String str) {
        this.clientRoute = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapBehavior$CardButtons$Button$Action$ClientRouteAction) && this.clientRoute.equals(((TapBehavior$CardButtons$Button$Action$ClientRouteAction) obj).clientRoute);
    }

    public final int hashCode() {
        return this.clientRoute.hashCode() * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRouteAction(clientRoute=", this.clientRoute, ", cdfEvent=null)");
    }
}
