package com.squareup.cash.education.stories.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/education/stories/backend/api/EducationStoryHttpError;", "Lcom/squareup/cash/education/stories/backend/api/EducationStoryReportedError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EducationStoryHttpError extends EducationStoryReportedError {
    public final String message;
    public final Map metadata;
    public final String serviceName;
    public final int statusCode;

    public EducationStoryHttpError(String str, int i) {
        this.serviceName = str;
        this.statusCode = i;
        this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Received HTTP Code ", " while fetching education stories. Please report this to #cash-bitcoin-mobile");
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("response", MapsKt__MapsKt.mapOf(new Pair("serviceName", str), new Pair("statusCode", Integer.valueOf(i))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationStoryHttpError)) {
            return false;
        }
        EducationStoryHttpError educationStoryHttpError = (EducationStoryHttpError) obj;
        return Intrinsics.areEqual(this.serviceName, educationStoryHttpError.serviceName) && this.statusCode == educationStoryHttpError.statusCode;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    public final int hashCode() {
        return Integer.hashCode(this.statusCode) + (this.serviceName.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m("EducationStoryHttpError(serviceName=", this.statusCode, this.serviceName, ", statusCode=", ")");
    }
}
