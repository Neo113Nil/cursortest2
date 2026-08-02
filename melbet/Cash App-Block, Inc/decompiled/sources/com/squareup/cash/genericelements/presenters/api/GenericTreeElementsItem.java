package com.squareup.cash.genericelements.presenters.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.genericelements.viewmodels.GenericAnalyticsData;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GenericTreeElementsItem {
    public final GenericAnalyticsData dismissAnalytics;
    public final List elements;
    public final String entityToken;
    public final GenericTreeElementsAnalyticsData overrideAnalytics;
    public final Action passiveAction;
    public final ProtoAdapter placeholderAdapter;
    public final GenericAnalyticsData viewAnalytics;

    public GenericTreeElementsItem(String str, List list, GenericTreeElementsAnalyticsData genericTreeElementsAnalyticsData, GenericAnalyticsData genericAnalyticsData, GenericAnalyticsData genericAnalyticsData2, Action action, ProtoAdapter protoAdapter, int i) {
        genericAnalyticsData2 = (i & 16) != 0 ? null : genericAnalyticsData2;
        action = (i & 32) != 0 ? null : action;
        protoAdapter = (i & 64) != 0 ? null : protoAdapter;
        str.getClass();
        list.getClass();
        this.entityToken = str;
        this.elements = list;
        this.overrideAnalytics = genericTreeElementsAnalyticsData;
        this.viewAnalytics = genericAnalyticsData;
        this.dismissAnalytics = genericAnalyticsData2;
        this.passiveAction = action;
        this.placeholderAdapter = protoAdapter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericTreeElementsItem)) {
            return false;
        }
        GenericTreeElementsItem genericTreeElementsItem = (GenericTreeElementsItem) obj;
        return Intrinsics.areEqual(this.entityToken, genericTreeElementsItem.entityToken) && Intrinsics.areEqual(this.elements, genericTreeElementsItem.elements) && this.overrideAnalytics.equals(genericTreeElementsItem.overrideAnalytics) && Intrinsics.areEqual(this.viewAnalytics, genericTreeElementsItem.viewAnalytics) && Intrinsics.areEqual(this.dismissAnalytics, genericTreeElementsItem.dismissAnalytics) && Intrinsics.areEqual(this.passiveAction, genericTreeElementsItem.passiveAction) && Intrinsics.areEqual(this.placeholderAdapter, genericTreeElementsItem.placeholderAdapter);
    }

    public final int hashCode() {
        int hashCode = (this.overrideAnalytics.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.entityToken.hashCode() * 31, 31, this.elements)) * 31;
        GenericAnalyticsData genericAnalyticsData = this.viewAnalytics;
        int hashCode2 = (hashCode + (genericAnalyticsData == null ? 0 : genericAnalyticsData.hashCode())) * 31;
        GenericAnalyticsData genericAnalyticsData2 = this.dismissAnalytics;
        int hashCode3 = (hashCode2 + (genericAnalyticsData2 == null ? 0 : genericAnalyticsData2.hashCode())) * 31;
        Action action = this.passiveAction;
        int hashCode4 = (hashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        ProtoAdapter protoAdapter = this.placeholderAdapter;
        return hashCode4 + (protoAdapter != null ? protoAdapter.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("GenericTreeElementsItem(entityToken=", this.entityToken, ", elements=", ", overrideAnalytics=", this.elements);
        m.append(this.overrideAnalytics);
        m.append(", viewAnalytics=");
        m.append(this.viewAnalytics);
        m.append(", dismissAnalytics=");
        m.append(this.dismissAnalytics);
        m.append(", passiveAction=");
        m.append(this.passiveAction);
        m.append(", placeholderAdapter=");
        m.append(this.placeholderAdapter);
        m.append(")");
        return m.toString();
    }
}
