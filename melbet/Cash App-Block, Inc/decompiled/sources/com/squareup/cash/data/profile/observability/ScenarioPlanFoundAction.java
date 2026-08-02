package com.squareup.cash.data.profile.observability;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.observability.backend.api.Action;
import com.squareup.protos.franklin.api.ClientScenario;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ScenarioPlanFoundAction implements Action {
    public final Map attributes;
    public final ClientScenario clientScenario;

    /* renamed from: type, reason: collision with root package name */
    public final Action.Type f1119type;

    public ScenarioPlanFoundAction(ClientScenario clientScenario) {
        clientScenario.getClass();
        this.clientScenario = clientScenario;
        this.f1119type = Action.Type.CUSTOM;
        this.attributes = Thread$State$EnumUnboxingLocalUtility.m("client_scenario", clientScenario.name());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScenarioPlanFoundAction) && this.clientScenario == ((ScenarioPlanFoundAction) obj).clientScenario;
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public final Map getAttributes() {
        return this.attributes;
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public final String getName() {
        return "scenario_plan_found_in_map";
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public final Action.Type getType() {
        return this.f1119type;
    }

    public final int hashCode() {
        return this.clientScenario.hashCode();
    }

    public final String toString() {
        return "ScenarioPlanFoundAction(clientScenario=" + this.clientScenario + ")";
    }
}
