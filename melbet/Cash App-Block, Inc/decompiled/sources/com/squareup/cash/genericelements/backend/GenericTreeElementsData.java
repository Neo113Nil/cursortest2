package com.squareup.cash.genericelements.backend;

import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GenericTreeElementsData {
    public final AnalyticsEvent dismissEvent;
    public final List genericElementTree;
    public final String toolbarTitle;
    public final AnalyticsEvent viewEvent;

    public GenericTreeElementsData(List list, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, String str) {
        list.getClass();
        this.genericElementTree = list;
        this.viewEvent = analyticsEvent;
        this.dismissEvent = analyticsEvent2;
        this.toolbarTitle = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericTreeElementsData)) {
            return false;
        }
        GenericTreeElementsData genericTreeElementsData = (GenericTreeElementsData) obj;
        return Intrinsics.areEqual(this.genericElementTree, genericTreeElementsData.genericElementTree) && Intrinsics.areEqual(this.viewEvent, genericTreeElementsData.viewEvent) && Intrinsics.areEqual(this.dismissEvent, genericTreeElementsData.dismissEvent) && Intrinsics.areEqual(this.toolbarTitle, genericTreeElementsData.toolbarTitle);
    }

    public final int hashCode() {
        int hashCode = this.genericElementTree.hashCode() * 31;
        AnalyticsEvent analyticsEvent = this.viewEvent;
        int hashCode2 = (hashCode + (analyticsEvent == null ? 0 : analyticsEvent.hashCode())) * 31;
        AnalyticsEvent analyticsEvent2 = this.dismissEvent;
        int hashCode3 = (hashCode2 + (analyticsEvent2 == null ? 0 : analyticsEvent2.hashCode())) * 31;
        String str = this.toolbarTitle;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "GenericTreeElementsData(genericElementTree=" + this.genericElementTree + ", viewEvent=" + this.viewEvent + ", dismissEvent=" + this.dismissEvent + ", toolbarTitle=" + this.toolbarTitle + ")";
    }
}
