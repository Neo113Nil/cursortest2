package com.squareup.cash.education.stories.viewmodels;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EducationStoryViewEvent$WebViewEvents$HttpError implements EducationStoryViewEvent {
    public final WebResourceResponse error;
    public final WebResourceRequest request;

    public EducationStoryViewEvent$WebViewEvents$HttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.request = webResourceRequest;
        this.error = webResourceResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationStoryViewEvent$WebViewEvents$HttpError)) {
            return false;
        }
        EducationStoryViewEvent$WebViewEvents$HttpError educationStoryViewEvent$WebViewEvents$HttpError = (EducationStoryViewEvent$WebViewEvents$HttpError) obj;
        return Intrinsics.areEqual(this.request, educationStoryViewEvent$WebViewEvents$HttpError.request) && Intrinsics.areEqual(this.error, educationStoryViewEvent$WebViewEvents$HttpError.error);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.request;
        int hashCode = (webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31;
        WebResourceResponse webResourceResponse = this.error;
        return hashCode + (webResourceResponse != null ? webResourceResponse.hashCode() : 0);
    }

    public final String toString() {
        return "HttpError(request=" + this.request + ", error=" + this.error + ")";
    }
}
