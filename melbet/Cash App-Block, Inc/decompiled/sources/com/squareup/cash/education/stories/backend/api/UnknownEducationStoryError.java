package com.squareup.cash.education.stories.backend.api;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/education/stories/backend/api/UnknownEducationStoryError;", "Lcom/squareup/cash/education/stories/backend/api/EducationStoryReportedError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UnknownEducationStoryError extends EducationStoryReportedError {
    public final Throwable cause;
    public final String message;
    public final Map metadata;
    public final String serviceName;

    public UnknownEducationStoryError(String str, Throwable th) {
        th.getClass();
        this.serviceName = str;
        this.cause = th;
        this.message = "An unknown error occurred while fetching education stories. Please report this to #cash-bitcoin-mobile";
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("response", Thread$State$EnumUnboxingLocalUtility.m("serviceName", str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownEducationStoryError)) {
            return false;
        }
        UnknownEducationStoryError unknownEducationStoryError = (UnknownEducationStoryError) obj;
        return Intrinsics.areEqual(this.serviceName, unknownEducationStoryError.serviceName) && Intrinsics.areEqual(this.cause, unknownEducationStoryError.cause);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
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
        return this.cause.hashCode() + (this.serviceName.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "UnknownEducationStoryError(serviceName=" + this.serviceName + ", cause=" + this.cause + ")";
    }
}
