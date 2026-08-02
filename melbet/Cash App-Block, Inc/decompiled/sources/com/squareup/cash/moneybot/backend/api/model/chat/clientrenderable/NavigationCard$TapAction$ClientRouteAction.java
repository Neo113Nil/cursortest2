package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NavigationCard$TapAction$ClientRouteAction {
    public final String clientRoute;

    public NavigationCard$TapAction$ClientRouteAction(String str) {
        str.getClass();
        this.clientRoute = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NavigationCard$TapAction$ClientRouteAction) && Intrinsics.areEqual(this.clientRoute, ((NavigationCard$TapAction$ClientRouteAction) obj).clientRoute);
    }

    public final int hashCode() {
        return this.clientRoute.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRouteAction(clientRoute=", this.clientRoute, ")");
    }
}
