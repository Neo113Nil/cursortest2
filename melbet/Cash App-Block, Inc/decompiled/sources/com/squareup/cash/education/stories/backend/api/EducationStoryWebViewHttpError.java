package com.squareup.cash.education.stories.backend.api;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/education/stories/backend/api/EducationStoryWebViewHttpError;", "Lcom/squareup/cash/education/stories/backend/api/EducationStoryReportedError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EducationStoryWebViewHttpError extends EducationStoryReportedError {
    public final String message;
    public final Map metadata;
    public final Integer statusCode;
    public final String url;

    public EducationStoryWebViewHttpError(Integer num, String str) {
        this.url = str;
        this.statusCode = num;
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("response", MapsKt__MapsKt.mapOf(new Pair("url", str), new Pair("statusCode", num)));
        this.message = "Received HTTP Code '" + num + "' while loading a webview for education stories. Please report this to #cash-bitcoin-mobile";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationStoryWebViewHttpError)) {
            return false;
        }
        EducationStoryWebViewHttpError educationStoryWebViewHttpError = (EducationStoryWebViewHttpError) obj;
        return Intrinsics.areEqual(this.url, educationStoryWebViewHttpError.url) && Intrinsics.areEqual(this.statusCode, educationStoryWebViewHttpError.statusCode);
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
        int hashCode = this.url.hashCode() * 31;
        Integer num = this.statusCode;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "EducationStoryWebViewHttpError(url=" + this.url + ", statusCode=" + this.statusCode + ")";
    }
}
