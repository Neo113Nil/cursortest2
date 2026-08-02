package com.squareup.cash.activity.presenters;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.backend.ActivityFeedProducer;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class ActivityEmbeddedPresenter$Configuration {
    public final ActivitiesManager.Factory activitiesManagerFactory;
    public final ActivitiesCache activityCache;
    public final ActivitiesManager.ActivityContext activityContext;
    public final ActivityFeedProducer activityFeedProducer;
    public final ActivityItemEventHandler.Factory activityItemEventHandlerFactory;
    public final ActivityItemPresenter.Factory activityItemPresenterFactory;
    public final boolean compact;
    public final String customEmptyMessage;
    public final String customErrorMessage;
    public final ActivityEmbeddedPresenter$RefreshMode refreshMode;
    public final Screen screenArgs;
    public final int secondaryLabelMaxLines;
    public final boolean showFeedFooter;
    public final boolean showFeedHeader;
    public final boolean showLoadingIndicator;
    public final Function0 showMoreCallback;
    public final int showMoreThreshold;
    public final boolean showSectionHeaders;

    public ActivityEmbeddedPresenter$Configuration(ActivitiesManager.ActivityContext activityContext, ActivitiesCache activitiesCache, Screen screen, ActivityEmbeddedPresenter$RefreshMode activityEmbeddedPresenter$RefreshMode, boolean z, boolean z2, Function0 function0, int i, boolean z3, boolean z4, String str, String str2, ActivityItemEventHandler.Factory factory, ActivityItemPresenter.Factory factory2, ActivitiesManager.Factory factory3, ActivityFeedProducer activityFeedProducer, int i2, int i3) {
        boolean z5 = (i3 & 64) != 0;
        boolean z6 = (i3 & 1024) == 0 ? z4 : false;
        String str3 = (i3 & 2048) != 0 ? null : str;
        String str4 = (i3 & 4096) != 0 ? null : str2;
        ActivityItemPresenter.Factory factory4 = (i3 & 16384) != 0 ? null : factory2;
        ActivitiesManager.Factory factory5 = (32768 & i3) != 0 ? null : factory3;
        ActivityFeedProducer activityFeedProducer2 = (65536 & i3) == 0 ? activityFeedProducer : null;
        int i4 = (i3 & PKIFailureInfo.unsupportedVersion) == 0 ? i2 : 1;
        activityContext.getClass();
        this.activityContext = activityContext;
        this.activityCache = activitiesCache;
        this.screenArgs = screen;
        this.refreshMode = activityEmbeddedPresenter$RefreshMode;
        this.showFeedHeader = z;
        this.showFeedFooter = z2;
        this.showLoadingIndicator = z5;
        this.showMoreCallback = function0;
        this.showMoreThreshold = i;
        this.showSectionHeaders = z3;
        this.compact = z6;
        this.customEmptyMessage = str3;
        this.customErrorMessage = str4;
        this.activityItemEventHandlerFactory = factory;
        this.activityItemPresenterFactory = factory4;
        this.activitiesManagerFactory = factory5;
        this.activityFeedProducer = activityFeedProducer2;
        this.secondaryLabelMaxLines = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityEmbeddedPresenter$Configuration)) {
            return false;
        }
        ActivityEmbeddedPresenter$Configuration activityEmbeddedPresenter$Configuration = (ActivityEmbeddedPresenter$Configuration) obj;
        return Intrinsics.areEqual(this.activityContext, activityEmbeddedPresenter$Configuration.activityContext) && Intrinsics.areEqual(this.activityCache, activityEmbeddedPresenter$Configuration.activityCache) && Intrinsics.areEqual(this.screenArgs, activityEmbeddedPresenter$Configuration.screenArgs) && this.refreshMode == activityEmbeddedPresenter$Configuration.refreshMode && this.showFeedHeader == activityEmbeddedPresenter$Configuration.showFeedHeader && this.showFeedFooter == activityEmbeddedPresenter$Configuration.showFeedFooter && this.showLoadingIndicator == activityEmbeddedPresenter$Configuration.showLoadingIndicator && Intrinsics.areEqual(this.showMoreCallback, activityEmbeddedPresenter$Configuration.showMoreCallback) && this.showMoreThreshold == activityEmbeddedPresenter$Configuration.showMoreThreshold && this.showSectionHeaders == activityEmbeddedPresenter$Configuration.showSectionHeaders && this.compact == activityEmbeddedPresenter$Configuration.compact && Intrinsics.areEqual(this.customEmptyMessage, activityEmbeddedPresenter$Configuration.customEmptyMessage) && Intrinsics.areEqual(this.customErrorMessage, activityEmbeddedPresenter$Configuration.customErrorMessage) && Intrinsics.areEqual(this.activityItemEventHandlerFactory, activityEmbeddedPresenter$Configuration.activityItemEventHandlerFactory) && Intrinsics.areEqual(this.activityItemPresenterFactory, activityEmbeddedPresenter$Configuration.activityItemPresenterFactory) && Intrinsics.areEqual(this.activitiesManagerFactory, activityEmbeddedPresenter$Configuration.activitiesManagerFactory) && Intrinsics.areEqual(this.activityFeedProducer, activityEmbeddedPresenter$Configuration.activityFeedProducer) && this.secondaryLabelMaxLines == activityEmbeddedPresenter$Configuration.secondaryLabelMaxLines;
    }

    public final int hashCode() {
        int hashCode = (this.activityCache.hashCode() + (this.activityContext.hashCode() * 31)) * 31;
        Screen screen = this.screenArgs;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.refreshMode.hashCode() + ((hashCode + (screen == null ? 0 : screen.hashCode())) * 31)) * 31, 31, this.showFeedHeader), 31, this.showFeedFooter), 31, this.showLoadingIndicator);
        Function0 function0 = this.showMoreCallback;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.showMoreThreshold, (m + (function0 == null ? 0 : function0.hashCode())) * 31, 31), 31, this.showSectionHeaders), 31, this.compact);
        String str = this.customEmptyMessage;
        int hashCode2 = (m2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customErrorMessage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ActivityItemEventHandler.Factory factory = this.activityItemEventHandlerFactory;
        int hashCode4 = (hashCode3 + (factory == null ? 0 : factory.hashCode())) * 31;
        ActivityItemPresenter.Factory factory2 = this.activityItemPresenterFactory;
        int hashCode5 = (hashCode4 + (factory2 == null ? 0 : factory2.hashCode())) * 31;
        ActivitiesManager.Factory factory3 = this.activitiesManagerFactory;
        int hashCode6 = (hashCode5 + (factory3 == null ? 0 : factory3.hashCode())) * 31;
        ActivityFeedProducer activityFeedProducer = this.activityFeedProducer;
        return Integer.hashCode(this.secondaryLabelMaxLines) + ((hashCode6 + (activityFeedProducer != null ? activityFeedProducer.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(activityContext=");
        sb.append(this.activityContext);
        sb.append(", activityCache=");
        sb.append(this.activityCache);
        sb.append(", screenArgs=");
        sb.append(this.screenArgs);
        sb.append(", refreshMode=");
        sb.append(this.refreshMode);
        sb.append(", showFeedHeader=");
        re$$ExternalSyntheticOutline0.m(sb, this.showFeedHeader, ", showFeedFooter=", this.showFeedFooter, ", showLoadingIndicator=");
        sb.append(this.showLoadingIndicator);
        sb.append(", showMoreCallback=");
        sb.append(this.showMoreCallback);
        sb.append(", showMoreThreshold=");
        sb.append(this.showMoreThreshold);
        sb.append(", showSectionHeaders=");
        sb.append(this.showSectionHeaders);
        sb.append(", compact=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.compact, ", customEmptyMessage=", this.customEmptyMessage, ", customErrorMessage=");
        sb.append(this.customErrorMessage);
        sb.append(", activityItemEventHandlerFactory=");
        sb.append(this.activityItemEventHandlerFactory);
        sb.append(", activityItemPresenterFactory=");
        sb.append(this.activityItemPresenterFactory);
        sb.append(", activitiesManagerFactory=");
        sb.append(this.activitiesManagerFactory);
        sb.append(", activityFeedProducer=");
        sb.append(this.activityFeedProducer);
        sb.append(", secondaryLabelMaxLines=");
        sb.append(this.secondaryLabelMaxLines);
        sb.append(")");
        return sb.toString();
    }
}
