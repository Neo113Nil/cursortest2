package com.squareup.cash.activity.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.inputfieldtext.InputFieldText;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ActivityTabViewModel {
    public final AlertBannerViewModel alertBannerViewModel;
    public final boolean attachScrollLogging;
    public final CardAppMessageViewModel.Ready dismissedCardMessage;
    public final InlineAppMessageV2ViewModel.Ready dismissedInlineMessage;
    public final List feedEntries;
    public final boolean hasLoadingError;
    public final boolean hasMore;
    public final boolean isRefreshing;
    public final ScrollToTop scrollToTopCounter;
    public final InputFieldText searchQuery;
    public final boolean showInlineMessageTooltip;
    public final TabToolbarInternalViewModel tabToolbarModel;

    public final class ScrollToTop {
        public static final ScrollToTop Initial = new ScrollToTop(0, false);
        public final boolean animate;
        public final int id;

        public ScrollToTop(int i, boolean z) {
            this.id = i;
            this.animate = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScrollToTop)) {
                return false;
            }
            ScrollToTop scrollToTop = (ScrollToTop) obj;
            return this.id == scrollToTop.id && this.animate == scrollToTop.animate;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.animate) + (Integer.hashCode(this.id) * 31);
        }

        public final String toString() {
            return "ScrollToTop(id=" + this.id + ", animate=" + this.animate + ")";
        }
    }

    public ActivityTabViewModel(TabToolbarInternalViewModel tabToolbarInternalViewModel, AlertBannerViewModel alertBannerViewModel, boolean z, boolean z2, boolean z3, InputFieldText inputFieldText, List list, ScrollToTop scrollToTop, InlineAppMessageV2ViewModel.Ready ready, CardAppMessageViewModel.Ready ready2, boolean z4, boolean z5) {
        tabToolbarInternalViewModel.getClass();
        inputFieldText.getClass();
        list.getClass();
        scrollToTop.getClass();
        this.tabToolbarModel = tabToolbarInternalViewModel;
        this.alertBannerViewModel = alertBannerViewModel;
        this.isRefreshing = z;
        this.hasMore = z2;
        this.hasLoadingError = z3;
        this.searchQuery = inputFieldText;
        this.feedEntries = list;
        this.scrollToTopCounter = scrollToTop;
        this.dismissedInlineMessage = ready;
        this.dismissedCardMessage = ready2;
        this.showInlineMessageTooltip = z4;
        this.attachScrollLogging = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTabViewModel)) {
            return false;
        }
        ActivityTabViewModel activityTabViewModel = (ActivityTabViewModel) obj;
        return Intrinsics.areEqual(this.tabToolbarModel, activityTabViewModel.tabToolbarModel) && Intrinsics.areEqual(this.alertBannerViewModel, activityTabViewModel.alertBannerViewModel) && this.isRefreshing == activityTabViewModel.isRefreshing && this.hasMore == activityTabViewModel.hasMore && this.hasLoadingError == activityTabViewModel.hasLoadingError && Intrinsics.areEqual(this.searchQuery, activityTabViewModel.searchQuery) && Intrinsics.areEqual(this.feedEntries, activityTabViewModel.feedEntries) && Intrinsics.areEqual(this.scrollToTopCounter, activityTabViewModel.scrollToTopCounter) && Intrinsics.areEqual(this.dismissedInlineMessage, activityTabViewModel.dismissedInlineMessage) && Intrinsics.areEqual(this.dismissedCardMessage, activityTabViewModel.dismissedCardMessage) && this.showInlineMessageTooltip == activityTabViewModel.showInlineMessageTooltip && this.attachScrollLogging == activityTabViewModel.attachScrollLogging;
    }

    public final int hashCode() {
        int hashCode = this.tabToolbarModel.hashCode() * 31;
        AlertBannerViewModel alertBannerViewModel = this.alertBannerViewModel;
        int hashCode2 = (this.scrollToTopCounter.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.searchQuery.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (alertBannerViewModel == null ? 0 : alertBannerViewModel.hashCode())) * 31, 31, this.isRefreshing), 31, this.hasMore), 31, this.hasLoadingError)) * 31, 31, this.feedEntries)) * 31;
        InlineAppMessageV2ViewModel.Ready ready = this.dismissedInlineMessage;
        int hashCode3 = (hashCode2 + (ready == null ? 0 : ready.hashCode())) * 31;
        CardAppMessageViewModel.Ready ready2 = this.dismissedCardMessage;
        return Boolean.hashCode(this.attachScrollLogging) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (ready2 != null ? ready2.hashCode() : 0)) * 31, 31, this.showInlineMessageTooltip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityTabViewModel(tabToolbarModel=");
        sb.append(this.tabToolbarModel);
        sb.append(", alertBannerViewModel=");
        sb.append(this.alertBannerViewModel);
        sb.append(", isRefreshing=");
        re$$ExternalSyntheticOutline0.m(sb, this.isRefreshing, ", hasMore=", this.hasMore, ", hasLoadingError=");
        sb.append(this.hasLoadingError);
        sb.append(", searchQuery=");
        sb.append(this.searchQuery);
        sb.append(", feedEntries=");
        sb.append(this.feedEntries);
        sb.append(", scrollToTopCounter=");
        sb.append(this.scrollToTopCounter);
        sb.append(", dismissedInlineMessage=");
        sb.append(this.dismissedInlineMessage);
        sb.append(", dismissedCardMessage=");
        sb.append(this.dismissedCardMessage);
        sb.append(", showInlineMessageTooltip=");
        return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.showInlineMessageTooltip, ", attachScrollLogging=", this.attachScrollLogging, ")");
    }
}
