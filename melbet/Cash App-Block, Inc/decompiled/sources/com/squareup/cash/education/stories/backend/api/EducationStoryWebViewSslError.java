package com.squareup.cash.education.stories.backend.api;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/education/stories/backend/api/EducationStoryWebViewSslError;", "Lcom/squareup/cash/education/stories/backend/api/EducationStoryReportedError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EducationStoryWebViewSslError extends EducationStoryReportedError {
    public final String message = "Received an ssl error while loading a webview for education stories. Please report this to #cash-bitcoin-mobile";
    public final Map metadata;
    public final String url;

    public EducationStoryWebViewSslError(String str) {
        this.url = str;
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("response", Thread$State$EnumUnboxingLocalUtility.m("url", str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationStoryWebViewSslError) && Intrinsics.areEqual(this.url, ((EducationStoryWebViewSslError) obj).url);
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
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EducationStoryWebViewSslError(url=", this.url, ")");
    }
}
