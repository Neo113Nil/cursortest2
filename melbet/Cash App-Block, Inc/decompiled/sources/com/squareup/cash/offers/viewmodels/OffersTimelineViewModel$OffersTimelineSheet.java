package com.squareup.cash.offers.viewmodels;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.viewmodels.viewevents.OffersTimelineViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes6.dex */
public final class OffersTimelineViewModel$OffersTimelineSheet implements ArcadeOffersTimelineViewModels {
    public final String buttonText;
    public final OffersTimelineViewEvent event;
    public final OffersAnalyticsEventSpec impressionEvent;
    public final ImmutableList offersTimeline;
    public final String titleText;

    public OffersTimelineViewModel$OffersTimelineSheet(String str, String str2, AbstractPersistentList abstractPersistentList, OffersTimelineViewEvent offersTimelineViewEvent, OffersAnalyticsEventSpec offersAnalyticsEventSpec) {
        str.getClass();
        abstractPersistentList.getClass();
        this.titleText = str;
        this.buttonText = str2;
        this.offersTimeline = abstractPersistentList;
        this.event = offersTimelineViewEvent;
        this.impressionEvent = offersAnalyticsEventSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersTimelineViewModel$OffersTimelineSheet)) {
            return false;
        }
        OffersTimelineViewModel$OffersTimelineSheet offersTimelineViewModel$OffersTimelineSheet = (OffersTimelineViewModel$OffersTimelineSheet) obj;
        return Intrinsics.areEqual(this.titleText, offersTimelineViewModel$OffersTimelineSheet.titleText) && this.buttonText.equals(offersTimelineViewModel$OffersTimelineSheet.buttonText) && Intrinsics.areEqual(this.offersTimeline, offersTimelineViewModel$OffersTimelineSheet.offersTimeline) && this.event.equals(offersTimelineViewModel$OffersTimelineSheet.event) && Intrinsics.areEqual(this.impressionEvent, offersTimelineViewModel$OffersTimelineSheet.impressionEvent);
    }

    public final int hashCode() {
        int hashCode = (this.event.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.offersTimeline, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.titleText.hashCode() * 31, 31, this.buttonText), 31)) * 31;
        OffersAnalyticsEventSpec offersAnalyticsEventSpec = this.impressionEvent;
        return hashCode + (offersAnalyticsEventSpec == null ? 0 : offersAnalyticsEventSpec.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersTimelineSheet(titleText=", this.titleText, ", buttonText=", this.buttonText, ", offersTimeline=");
        m.append(this.offersTimeline);
        m.append(", event=");
        m.append(this.event);
        m.append(", impressionEvent=");
        m.append(this.impressionEvent);
        m.append(")");
        return m.toString();
    }
}
