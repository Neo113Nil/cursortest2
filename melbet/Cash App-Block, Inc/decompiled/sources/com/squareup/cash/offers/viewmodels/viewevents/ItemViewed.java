package com.squareup.cash.offers.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ItemViewed implements OffersHomeViewEvent, OffersSearchViewEvent, OffersFullscreenCollectionViewEvent, OffersDetailsSheetViewEvent, OffersTimelineViewEvent {
    public final List analyticsEventSpecs;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemViewed(OffersAnalyticsEventSpec offersAnalyticsEventSpec) {
        this(CollectionsKt__CollectionsJVMKt.listOf(offersAnalyticsEventSpec));
        offersAnalyticsEventSpec.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ItemViewed) && Intrinsics.areEqual(this.analyticsEventSpecs, ((ItemViewed) obj).analyticsEventSpecs);
    }

    public final int hashCode() {
        return this.analyticsEventSpecs.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("ItemViewed(analyticsEventSpecs=", ")", this.analyticsEventSpecs);
    }

    public ItemViewed(List list) {
        list.getClass();
        this.analyticsEventSpecs = list;
    }
}
