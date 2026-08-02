package com.squareup.cash.education.stories.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EducationStoryViewEvent$WebViewEvents$SSLError implements EducationStoryViewEvent {
    public final String url;

    public EducationStoryViewEvent$WebViewEvents$SSLError(String str) {
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationStoryViewEvent$WebViewEvents$SSLError) && Intrinsics.areEqual(this.url, ((EducationStoryViewEvent$WebViewEvents$SSLError) obj).url);
    }

    public final int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SSLError(url=", this.url, ")");
    }
}
