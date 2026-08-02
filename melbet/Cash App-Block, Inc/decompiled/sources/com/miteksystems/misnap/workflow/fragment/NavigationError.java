package com.miteksystems.misnap.workflow.fragment;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;

/* loaded from: classes4.dex */
public final class NavigationError {
    public final MultipartBody.Part.Companion a;
    public final NavigationErrorInfo b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationError(Exception exc, Class cls, int i, MultipartBody.Part.Companion companion) {
        this(companion, new NavigationErrorInfo(exc, cls, i));
        companion.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationError)) {
            return false;
        }
        NavigationError navigationError = (NavigationError) obj;
        return Intrinsics.areEqual(this.a, navigationError.a) && Intrinsics.areEqual(this.b, navigationError.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        NavigationErrorInfo navigationErrorInfo = this.b;
        return hashCode + (navigationErrorInfo == null ? 0 : navigationErrorInfo.hashCode());
    }

    public final String toString() {
        return "NavigationError(action=" + this.a + ", navigationErrorInfo=" + this.b + ')';
    }

    public NavigationError(MultipartBody.Part.Companion companion, NavigationErrorInfo navigationErrorInfo) {
        companion.getClass();
        this.a = companion;
        this.b = navigationErrorInfo;
    }
}
