package com.squareup.cash.offers.viewmodels.itemviewmodels;

import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.viewmodels.ImpressionReportable;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public final class PillViewModel implements ImpressionReportable {
    public final OffersAnalyticsEventSpec impressionEventSpec;
    public final ImmutableList impressionEventSpecs;
    public final Color selectedColor;
    public final String tapActionUrl;
    public final ImmutableList tapEventSpecs;
    public final String text;
    public final Color unSelectedColor;

    public PillViewModel(OffersAnalyticsEventSpec offersAnalyticsEventSpec, String str, Color color, Color color2, String str2, AbstractPersistentList abstractPersistentList) {
        str.getClass();
        str2.getClass();
        abstractPersistentList.getClass();
        this.impressionEventSpec = offersAnalyticsEventSpec;
        this.text = str;
        this.selectedColor = color;
        this.unSelectedColor = color2;
        this.tapActionUrl = str2;
        this.tapEventSpecs = abstractPersistentList;
        this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.listOf(offersAnalyticsEventSpec));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PillViewModel)) {
            return false;
        }
        PillViewModel pillViewModel = (PillViewModel) obj;
        return this.impressionEventSpec.equals(pillViewModel.impressionEventSpec) && Intrinsics.areEqual(this.text, pillViewModel.text) && Intrinsics.areEqual(this.selectedColor, pillViewModel.selectedColor) && Intrinsics.areEqual(this.unSelectedColor, pillViewModel.unSelectedColor) && Intrinsics.areEqual(this.tapActionUrl, pillViewModel.tapActionUrl) && Intrinsics.areEqual(this.tapEventSpecs, pillViewModel.tapEventSpecs);
    }

    @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
    public final ImmutableList getImpressionEventSpecs() {
        return this.impressionEventSpecs;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.impressionEventSpec.hashCode() * 31, 31, this.text);
        Color color = this.selectedColor;
        int hashCode = (m + (color == null ? 0 : color.hashCode())) * 31;
        Color color2 = this.unSelectedColor;
        return this.tapEventSpecs.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (color2 == null ? 0 : color2.hashCode())) * 31, 31, false), 31, this.tapActionUrl);
    }

    public final String toString() {
        return "PillViewModel(impressionEventSpec=" + this.impressionEventSpec + ", text=" + this.text + ", selectedColor=" + this.selectedColor + ", unSelectedColor=" + this.unSelectedColor + ", selected=false, tapActionUrl=" + this.tapActionUrl + ", tapEventSpecs=" + this.tapEventSpecs + ")";
    }
}
