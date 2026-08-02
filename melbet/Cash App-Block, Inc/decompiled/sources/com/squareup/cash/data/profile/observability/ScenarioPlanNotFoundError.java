package com.squareup.cash.data.profile.observability;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.franklin.api.ClientScenario;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/data/profile/observability/ScenarioPlanNotFoundError;", "Lcom/squareup/cash/observability/types/ReportedError;", "impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ScenarioPlanNotFoundError extends ReportedError {
    public final ClientScenario clientScenario;
    public final String context;
    public final Set features;
    public final String groupingDescriptor;
    public final Map metadata;
    public final String title;

    public ScenarioPlanNotFoundError(ClientScenario clientScenario) {
        clientScenario.getClass();
        this.clientScenario = clientScenario;
        this.features = ArraysKt___ArraysKt.toSet(new ErrorFeature[]{ErrorFeature.ClientSync.INSTANCE, ErrorFeature.ProfileSync.INSTANCE});
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Client Sync", Thread$State$EnumUnboxingLocalUtility.m("clientScenario", clientScenario.name()));
        this.context = "Profile SPM Migration";
        this.title = "Scenario Plan Not Found";
        this.groupingDescriptor = "Scenario Plan Not Found";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScenarioPlanNotFoundError) && this.clientScenario == ((ScenarioPlanNotFoundError) obj).clientScenario;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getContext() {
        return this.context;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        return this.groupingDescriptor;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Set getTargets() {
        return ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.DATADOG, ReportedError.ErrorReportingTarget.LOGS});
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.clientScenario.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ScenarioPlanNotFoundError(clientScenario=" + this.clientScenario + ")";
    }
}
