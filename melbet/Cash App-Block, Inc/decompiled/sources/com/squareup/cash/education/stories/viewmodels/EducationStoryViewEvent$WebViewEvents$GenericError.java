package com.squareup.cash.education.stories.viewmodels;

import android.webkit.WebResourceRequest;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EducationStoryViewEvent$WebViewEvents$GenericError implements EducationStoryViewEvent {
    public final String error;
    public final Integer errorCode;
    public final WebResourceRequest request;

    public EducationStoryViewEvent$WebViewEvents$GenericError(WebResourceRequest webResourceRequest, String str, Integer num) {
        this.request = webResourceRequest;
        this.error = str;
        this.errorCode = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationStoryViewEvent$WebViewEvents$GenericError)) {
            return false;
        }
        EducationStoryViewEvent$WebViewEvents$GenericError educationStoryViewEvent$WebViewEvents$GenericError = (EducationStoryViewEvent$WebViewEvents$GenericError) obj;
        return Intrinsics.areEqual(this.request, educationStoryViewEvent$WebViewEvents$GenericError.request) && Intrinsics.areEqual(this.error, educationStoryViewEvent$WebViewEvents$GenericError.error) && Intrinsics.areEqual(this.errorCode, educationStoryViewEvent$WebViewEvents$GenericError.errorCode);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.request;
        int hashCode = (webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31;
        String str = this.error;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.errorCode;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenericError(request=");
        sb.append(this.request);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", errorCode=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.errorCode, ")");
    }
}
