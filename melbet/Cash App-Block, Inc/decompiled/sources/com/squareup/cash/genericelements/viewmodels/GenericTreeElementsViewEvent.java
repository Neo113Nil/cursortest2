package com.squareup.cash.genericelements.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class GenericTreeElementsViewEvent {

    public final class DismissEvent extends GenericTreeElementsViewEvent {
        public final GenericAnalyticsData analyticsData;

        public DismissEvent(GenericAnalyticsData genericAnalyticsData) {
            this.analyticsData = genericAnalyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DismissEvent) && Intrinsics.areEqual(this.analyticsData, ((DismissEvent) obj).analyticsData);
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent
        public final GenericAnalyticsData getAnalyticsData() {
            return this.analyticsData;
        }

        public final int hashCode() {
            GenericAnalyticsData genericAnalyticsData = this.analyticsData;
            if (genericAnalyticsData == null) {
                return 0;
            }
            return genericAnalyticsData.hashCode();
        }

        public final String toString() {
            return "DismissEvent(analyticsData=" + this.analyticsData + ")";
        }
    }

    public final class OpenUrlEvent extends GenericTreeElementsViewEvent {
        public final GenericAnalyticsData analyticsData;
        public final String url;

        public OpenUrlEvent(String str, GenericAnalyticsData genericAnalyticsData) {
            str.getClass();
            this.url = str;
            this.analyticsData = genericAnalyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenUrlEvent)) {
                return false;
            }
            OpenUrlEvent openUrlEvent = (OpenUrlEvent) obj;
            return Intrinsics.areEqual(this.url, openUrlEvent.url) && Intrinsics.areEqual(this.analyticsData, openUrlEvent.analyticsData);
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent
        public final GenericAnalyticsData getAnalyticsData() {
            return this.analyticsData;
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            GenericAnalyticsData genericAnalyticsData = this.analyticsData;
            return hashCode + (genericAnalyticsData == null ? 0 : genericAnalyticsData.hashCode());
        }

        public final String toString() {
            return "OpenUrlEvent(url=" + this.url + ", analyticsData=" + this.analyticsData + ")";
        }
    }

    /* loaded from: classes8.dex */
    public final class PromptOverlayEvent extends GenericTreeElementsViewEvent {
        public final GenericAnalyticsData analyticsData;
        public final ContainerElement errorTreeElement;
        public final String genericElementsContext;
        public final List overlayTreeElements;

        public PromptOverlayEvent(String str, List list, ContainerElement containerElement, GenericAnalyticsData genericAnalyticsData) {
            list.getClass();
            this.genericElementsContext = str;
            this.overlayTreeElements = list;
            this.errorTreeElement = containerElement;
            this.analyticsData = genericAnalyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromptOverlayEvent)) {
                return false;
            }
            PromptOverlayEvent promptOverlayEvent = (PromptOverlayEvent) obj;
            return this.genericElementsContext.equals(promptOverlayEvent.genericElementsContext) && Intrinsics.areEqual(this.overlayTreeElements, promptOverlayEvent.overlayTreeElements) && Intrinsics.areEqual(this.errorTreeElement, promptOverlayEvent.errorTreeElement) && Intrinsics.areEqual(this.analyticsData, promptOverlayEvent.analyticsData);
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent
        public final GenericAnalyticsData getAnalyticsData() {
            return this.analyticsData;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.genericElementsContext.hashCode() * 31, 31, this.overlayTreeElements);
            ContainerElement containerElement = this.errorTreeElement;
            int hashCode = (m + (containerElement == null ? 0 : containerElement.hashCode())) * 31;
            GenericAnalyticsData genericAnalyticsData = this.analyticsData;
            return hashCode + (genericAnalyticsData != null ? genericAnalyticsData.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("PromptOverlayEvent(genericElementsContext=", this.genericElementsContext, ", overlayTreeElements=", ", errorTreeElement=", this.overlayTreeElements);
            m.append(this.errorTreeElement);
            m.append(", analyticsData=");
            m.append(this.analyticsData);
            m.append(")");
            return m.toString();
        }
    }

    public final class ViewAnalyticsEvent extends GenericTreeElementsViewEvent {
        public final GenericAnalyticsData analyticsData;

        public ViewAnalyticsEvent(GenericAnalyticsData genericAnalyticsData) {
            this.analyticsData = genericAnalyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewAnalyticsEvent) && this.analyticsData.equals(((ViewAnalyticsEvent) obj).analyticsData);
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent
        public final GenericAnalyticsData getAnalyticsData() {
            return this.analyticsData;
        }

        public final int hashCode() {
            return this.analyticsData.hashCode();
        }

        public final String toString() {
            return "ViewAnalyticsEvent(analyticsData=" + this.analyticsData + ")";
        }
    }

    public abstract GenericAnalyticsData getAnalyticsData();
}
