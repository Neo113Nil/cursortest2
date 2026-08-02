package com.squareup.cash.cdf.experiment;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ExperimentActivateView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.LAUNCH_DARKLY, EventDestination.SNOWFLAKE});
    public final String experiment_id;
    public final ExperimentSource experiment_source;
    public final LinkedHashMap parameters;
    public final String variation_id;

    public ExperimentActivateView(String str, String str2, ExperimentSource experimentSource) {
        this.experiment_id = str;
        this.variation_id = str2;
        this.experiment_source = experimentSource;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Experiment", "cdf_action", "Activate");
        Countries.putSafe(m, "experiment_id", str);
        Countries.putSafe(m, "variation_id", str2);
        Countries.putSafe(m, "experiment_source", experimentSource);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExperimentActivateView)) {
            return false;
        }
        ExperimentActivateView experimentActivateView = (ExperimentActivateView) obj;
        return this.experiment_id.equals(experimentActivateView.experiment_id) && Intrinsics.areEqual(this.variation_id, experimentActivateView.variation_id) && this.experiment_source == experimentActivateView.experiment_source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Experiment Activate View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.experiment_id.hashCode() * 31;
        String str = this.variation_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ExperimentSource experimentSource = this.experiment_source;
        return hashCode2 + (experimentSource != null ? experimentSource.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ExperimentActivateView(experiment_id=", this.experiment_id, ", variation_id=", this.variation_id, ", experiment_source=");
        m.append(this.experiment_source);
        m.append(")");
        return m.toString();
    }
}
