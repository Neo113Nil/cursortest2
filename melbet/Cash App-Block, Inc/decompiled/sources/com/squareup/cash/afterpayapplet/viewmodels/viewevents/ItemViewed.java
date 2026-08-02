package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ItemViewed implements AfterpayAppletHomeViewEvent, AfterpayAppletInfoSheetViewEvent, AfterpayAppletRetroOrderSelectionViewEvent {
    public final List analyticsEventSpecs;
    public final String sectionId;

    public ItemViewed(List list, String str) {
        list.getClass();
        this.analyticsEventSpecs = list;
        this.sectionId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemViewed)) {
            return false;
        }
        ItemViewed itemViewed = (ItemViewed) obj;
        return Intrinsics.areEqual(this.analyticsEventSpecs, itemViewed.analyticsEventSpecs) && Intrinsics.areEqual(this.sectionId, itemViewed.sectionId);
    }

    public final int hashCode() {
        int hashCode = this.analyticsEventSpecs.hashCode() * 31;
        String str = this.sectionId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ItemViewed(analyticsEventSpecs=" + this.analyticsEventSpecs + ", sectionId=" + this.sectionId + ")";
    }
}
