package com.squareup.cash.db2.profile;

import app.cash.sqldelight.EnumColumnAdapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ScenarioPlan {
    public final ClientScenario client_scenario;
    public final com.squareup.protos.franklin.common.scenarios.ScenarioPlan scenario_plan;

    public ScenarioPlan(ClientScenario clientScenario, com.squareup.protos.franklin.common.scenarios.ScenarioPlan scenarioPlan) {
        clientScenario.getClass();
        scenarioPlan.getClass();
        this.client_scenario = clientScenario;
        this.scenario_plan = scenarioPlan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScenarioPlan)) {
            return false;
        }
        ScenarioPlan scenarioPlan = (ScenarioPlan) obj;
        return this.client_scenario == scenarioPlan.client_scenario && Intrinsics.areEqual(this.scenario_plan, scenarioPlan.scenario_plan);
    }

    public final int hashCode() {
        return this.scenario_plan.hashCode() + (this.client_scenario.hashCode() * 31);
    }

    public final String toString() {
        return "ScenarioPlan(client_scenario=" + this.client_scenario + ", scenario_plan=" + this.scenario_plan + ")";
    }

    /* loaded from: classes.dex */
    public final class Adapter {
        public final EnumColumnAdapter client_scenarioAdapter;
        public final WireAdapter scenario_planAdapter;

        public /* synthetic */ Adapter(EnumColumnAdapter enumColumnAdapter, WireAdapter wireAdapter) {
            this.client_scenarioAdapter = enumColumnAdapter;
            this.scenario_planAdapter = wireAdapter;
        }

        public Adapter(WireAdapter wireAdapter, EnumColumnAdapter enumColumnAdapter) {
            this.scenario_planAdapter = wireAdapter;
            this.client_scenarioAdapter = enumColumnAdapter;
        }
    }
}
