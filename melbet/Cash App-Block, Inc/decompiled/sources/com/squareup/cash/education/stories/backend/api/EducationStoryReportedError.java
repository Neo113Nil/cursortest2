package com.squareup.cash.education.stories.backend.api;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/cash/education/stories/backend/api/EducationStoryReportedError;", "Lcom/squareup/cash/observability/types/ReportedError;", "Lcom/squareup/cash/education/stories/backend/api/EducationStoryHttpError;", "Lcom/squareup/cash/education/stories/backend/api/EducationStoryWebViewHttpError;", "Lcom/squareup/cash/education/stories/backend/api/EducationStoryWebViewSslError;", "Lcom/squareup/cash/education/stories/backend/api/UnknownEducationStoryError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EducationStoryReportedError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.EducationStory.INSTANCE);

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }
}
