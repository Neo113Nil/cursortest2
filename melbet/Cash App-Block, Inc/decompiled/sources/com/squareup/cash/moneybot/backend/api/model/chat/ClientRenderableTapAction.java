package com.squareup.cash.moneybot.backend.api.model.chat;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class ClientRenderableTapAction {
    public final String clientRoute;

    public ClientRenderableTapAction(String str) {
        this.clientRoute = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientRenderableTapAction) && this.clientRoute.equals(((ClientRenderableTapAction) obj).clientRoute);
    }

    public final int hashCode() {
        return this.clientRoute.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRenderableTapAction(clientRoute=", this.clientRoute, ")");
    }
}
