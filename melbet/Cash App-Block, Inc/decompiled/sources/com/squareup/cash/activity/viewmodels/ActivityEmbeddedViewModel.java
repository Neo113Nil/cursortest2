package com.squareup.cash.activity.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ActivityEmbeddedViewModel {
    public final boolean compact;
    public final List feedEntries;
    public final boolean hasMore;
    public final boolean isRefreshing;
    public final LoadingError loadingError;
    public final boolean showLoadingIndicator;

    public final class LoadingError {
        public final String message;

        public LoadingError(String str) {
            str.getClass();
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingError) && Intrinsics.areEqual(this.message, ((LoadingError) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoadingError(message=", this.message, ")");
        }
    }

    public ActivityEmbeddedViewModel(boolean z, boolean z2, LoadingError loadingError, List list, boolean z3, boolean z4) {
        list.getClass();
        this.isRefreshing = z;
        this.hasMore = z2;
        this.loadingError = loadingError;
        this.feedEntries = list;
        this.compact = z3;
        this.showLoadingIndicator = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityEmbeddedViewModel)) {
            return false;
        }
        ActivityEmbeddedViewModel activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj;
        return this.isRefreshing == activityEmbeddedViewModel.isRefreshing && this.hasMore == activityEmbeddedViewModel.hasMore && Intrinsics.areEqual(this.loadingError, activityEmbeddedViewModel.loadingError) && Intrinsics.areEqual(this.feedEntries, activityEmbeddedViewModel.feedEntries) && this.compact == activityEmbeddedViewModel.compact && this.showLoadingIndicator == activityEmbeddedViewModel.showLoadingIndicator;
    }

    public final boolean getHasLoadingError() {
        return this.loadingError != null;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isRefreshing) * 31, 31, this.hasMore);
        LoadingError loadingError = this.loadingError;
        return Boolean.hashCode(this.showLoadingIndicator) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((m + (loadingError == null ? 0 : loadingError.message.hashCode())) * 31, 31, this.feedEntries), 31, this.compact);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("ActivityEmbeddedViewModel(isRefreshing=", ", hasMore=", ", loadingError=", this.isRefreshing, this.hasMore);
        m.append(this.loadingError);
        m.append(", feedEntries=");
        m.append(this.feedEntries);
        m.append(", compact=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.compact, ", showLoadingIndicator=", this.showLoadingIndicator, ")");
    }

    public /* synthetic */ ActivityEmbeddedViewModel(boolean z, List list) {
        this(false, z, null, list, false, true);
    }
}
