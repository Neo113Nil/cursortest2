package com.squareup.cash.activity.backend.loader;

import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/activity/backend/loader/ActivitiesManagerError;", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivitiesManagerError extends ReportedError {
    public final Set features;
    public final String message;
    public final Map metadata;

    public ActivitiesManagerError(ActivitiesManager.ActivityContext activityContext, Pair... pairArr) {
        activityContext.getClass();
        this.message = "Duplicate Activity items found in page";
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Activity.INSTANCE);
        Headers.Builder builder = new Headers.Builder(3);
        builder.add(new Pair("Activity scope", activityContext.activityScope.name()));
        ActivityTokenType activityTokenType = activityContext.activityToken.activity_token_type;
        builder.add(new Pair("Activity token type", activityTokenType != null ? activityTokenType.name() : null));
        builder.addSpread(pairArr);
        ArrayList arrayList = builder.namesAndValues;
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Activity", MapsKt__MapsKt.mapOf((Pair[]) arrayList.toArray(new Pair[arrayList.size()])));
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }
}
