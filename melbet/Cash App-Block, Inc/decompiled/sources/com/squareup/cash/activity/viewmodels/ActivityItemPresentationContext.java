package com.squareup.cash.activity.viewmodels;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ActivityItemPresentationContext {
    public final ActivityScope activityScope;
    public final ActivityToken activityToken;
    public final ActivityItemOrigin origin;
    public final int rowIndex;
    public final Screen screen;
    public final int secondaryLabelMaxLines;

    public ActivityItemPresentationContext(ActivityItemOrigin activityItemOrigin, int i, Screen screen, ActivityScope activityScope, ActivityToken activityToken, int i2) {
        activityScope.getClass();
        activityToken.getClass();
        this.origin = activityItemOrigin;
        this.rowIndex = i;
        this.screen = screen;
        this.activityScope = activityScope;
        this.activityToken = activityToken;
        this.secondaryLabelMaxLines = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityItemPresentationContext)) {
            return false;
        }
        ActivityItemPresentationContext activityItemPresentationContext = (ActivityItemPresentationContext) obj;
        return this.origin == activityItemPresentationContext.origin && this.rowIndex == activityItemPresentationContext.rowIndex && Intrinsics.areEqual(this.screen, activityItemPresentationContext.screen) && this.activityScope == activityItemPresentationContext.activityScope && Intrinsics.areEqual(this.activityToken, activityItemPresentationContext.activityToken) && this.secondaryLabelMaxLines == activityItemPresentationContext.secondaryLabelMaxLines;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rowIndex, this.origin.hashCode() * 31, 31);
        Screen screen = this.screen;
        return Integer.hashCode(this.secondaryLabelMaxLines) + ((this.activityToken.hashCode() + ((this.activityScope.hashCode() + ((m + (screen == null ? 0 : screen.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ActivityItemPresentationContext(origin=" + this.origin + ", rowIndex=" + this.rowIndex + ", screen=" + this.screen + ", activityScope=" + this.activityScope + ", activityToken=" + this.activityToken + ", secondaryLabelMaxLines=" + this.secondaryLabelMaxLines + ")";
    }

    public /* synthetic */ ActivityItemPresentationContext(ActivityItemOrigin activityItemOrigin, int i, Screen screen, ActivityScope activityScope, ActivityToken activityToken) {
        this(activityItemOrigin, i, screen, activityScope, activityToken, 1);
    }
}
