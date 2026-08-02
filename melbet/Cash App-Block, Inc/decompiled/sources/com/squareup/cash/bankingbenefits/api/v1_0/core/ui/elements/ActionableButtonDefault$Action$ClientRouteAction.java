package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ActionableButtonDefault$Action$ClientRouteAction {
    public final ActionableButtonDefault.ClientRouteAction value;

    public ActionableButtonDefault$Action$ClientRouteAction(ActionableButtonDefault.ClientRouteAction clientRouteAction) {
        clientRouteAction.getClass();
        this.value = clientRouteAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionableButtonDefault$Action$ClientRouteAction) && Intrinsics.areEqual(this.value, ((ActionableButtonDefault$Action$ClientRouteAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ClientRouteAction(value=" + this.value + ")";
    }
}
