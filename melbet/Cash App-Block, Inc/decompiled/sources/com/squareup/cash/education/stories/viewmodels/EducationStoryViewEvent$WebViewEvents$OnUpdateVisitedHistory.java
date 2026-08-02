package com.squareup.cash.education.stories.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EducationStoryViewEvent$WebViewEvents$OnUpdateVisitedHistory implements EducationStoryViewEvent {
    public final String url;

    public EducationStoryViewEvent$WebViewEvents$OnUpdateVisitedHistory(String str) {
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationStoryViewEvent$WebViewEvents$OnUpdateVisitedHistory) && Intrinsics.areEqual(this.url, ((EducationStoryViewEvent$WebViewEvents$OnUpdateVisitedHistory) obj).url);
    }

    public final int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OnUpdateVisitedHistory(url=", this.url, ")");
    }
}
