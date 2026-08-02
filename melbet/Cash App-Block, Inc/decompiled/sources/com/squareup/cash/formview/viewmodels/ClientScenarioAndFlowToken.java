package com.squareup.cash.formview.viewmodels;

import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ClientScenarioAndFlowToken {
    public final ClientScenario clientScenario;
    public final String flowToken;

    public ClientScenarioAndFlowToken(ClientScenario clientScenario, String str) {
        clientScenario.getClass();
        str.getClass();
        this.clientScenario = clientScenario;
        this.flowToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientScenarioAndFlowToken)) {
            return false;
        }
        ClientScenarioAndFlowToken clientScenarioAndFlowToken = (ClientScenarioAndFlowToken) obj;
        return this.clientScenario == clientScenarioAndFlowToken.clientScenario && Intrinsics.areEqual(this.flowToken, clientScenarioAndFlowToken.flowToken);
    }

    public final int hashCode() {
        return this.flowToken.hashCode() + (this.clientScenario.hashCode() * 31);
    }

    public final String toString() {
        return "ClientScenarioAndFlowToken(clientScenario=" + this.clientScenario + ", flowToken=" + this.flowToken + ")";
    }
}
