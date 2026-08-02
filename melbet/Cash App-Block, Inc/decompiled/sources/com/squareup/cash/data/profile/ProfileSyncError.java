package com.squareup.cash.data.profile;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/data/profile/ProfileSyncError;", "Lcom/squareup/cash/observability/types/ReportedError;", "impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileSyncError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.ProfileSync.INSTANCE);

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }
}
