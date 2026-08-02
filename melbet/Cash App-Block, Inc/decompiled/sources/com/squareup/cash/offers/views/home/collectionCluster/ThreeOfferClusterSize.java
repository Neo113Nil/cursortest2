package com.squareup.cash.offers.views.home.collectionCluster;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class ThreeOfferClusterSize {
    public final float itemWidth;
    public final float largeCollectionItemHeight;
    public final float smallCollectionItemHeight;

    public ThreeOfferClusterSize(float f, float f2, float f3) {
        this.itemWidth = f;
        this.smallCollectionItemHeight = f2;
        this.largeCollectionItemHeight = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeOfferClusterSize)) {
            return false;
        }
        ThreeOfferClusterSize threeOfferClusterSize = (ThreeOfferClusterSize) obj;
        return Dp.m1037equalsimpl0(this.itemWidth, threeOfferClusterSize.itemWidth) && Dp.m1037equalsimpl0(this.smallCollectionItemHeight, threeOfferClusterSize.smallCollectionItemHeight) && Dp.m1037equalsimpl0(this.largeCollectionItemHeight, threeOfferClusterSize.largeCollectionItemHeight);
    }

    public final int hashCode() {
        return Float.hashCode(this.largeCollectionItemHeight) + CameraState$Type$EnumUnboxingLocalUtility.m(this.smallCollectionItemHeight, Float.hashCode(this.itemWidth) * 31, 31);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.itemWidth);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.smallCollectionItemHeight);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ThreeOfferClusterSize(itemWidth=", m1038toStringimpl, ", smallCollectionItemHeight=", m1038toStringimpl2, ", largeCollectionItemHeight="), Dp.m1038toStringimpl(this.largeCollectionItemHeight), ")");
    }
}
