package com.squareup.cash.offers.viewmodels.itemviewmodels;

import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.viewmodels.ImpressionReportable;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public final class InfoTileViewModel implements ImpressionReportable {
    public final String actionUrl;
    public final Color backgroundColor;
    public final Button button;
    public final OffersAnalyticsEventSpec impressionEventSpec;
    public final ImmutableList impressionEventSpecs;
    public final ImmutableList tapEventSpecs;
    public final StyledText titleText;

    public InfoTileViewModel(OffersAnalyticsEventSpec offersAnalyticsEventSpec, Color color, StyledText styledText, Button button, String str, AbstractPersistentList abstractPersistentList) {
        styledText.getClass();
        button.getClass();
        abstractPersistentList.getClass();
        this.impressionEventSpec = offersAnalyticsEventSpec;
        this.backgroundColor = color;
        this.titleText = styledText;
        this.button = button;
        this.actionUrl = str;
        this.tapEventSpecs = abstractPersistentList;
        this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.listOf(offersAnalyticsEventSpec));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoTileViewModel)) {
            return false;
        }
        InfoTileViewModel infoTileViewModel = (InfoTileViewModel) obj;
        return this.impressionEventSpec.equals(infoTileViewModel.impressionEventSpec) && Intrinsics.areEqual(this.backgroundColor, infoTileViewModel.backgroundColor) && Intrinsics.areEqual(this.titleText, infoTileViewModel.titleText) && Intrinsics.areEqual(this.button, infoTileViewModel.button) && this.actionUrl.equals(infoTileViewModel.actionUrl) && Intrinsics.areEqual(this.tapEventSpecs, infoTileViewModel.tapEventSpecs);
    }

    @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
    public final ImmutableList getImpressionEventSpecs() {
        return this.impressionEventSpecs;
    }

    public final int hashCode() {
        int hashCode = this.impressionEventSpec.hashCode() * 31;
        Color color = this.backgroundColor;
        return this.tapEventSpecs.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.button.hashCode() + ((this.titleText.hashCode() + ((hashCode + (color == null ? 0 : color.hashCode())) * 31)) * 961)) * 31, 31, this.actionUrl);
    }

    public final String toString() {
        return "InfoTileViewModel(impressionEventSpec=" + this.impressionEventSpec + ", backgroundColor=" + this.backgroundColor + ", titleText=" + this.titleText + ", subtitle=null, button=" + this.button + ", actionUrl=" + this.actionUrl + ", tapEventSpecs=" + this.tapEventSpecs + ")";
    }
}
