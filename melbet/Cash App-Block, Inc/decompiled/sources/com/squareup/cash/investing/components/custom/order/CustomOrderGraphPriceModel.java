package com.squareup.cash.investing.components.custom.order;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.multiplatform.investing.PriceValue;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomOrderGraphPriceModel {
    public final long bottomPrice;
    public final List ticks;
    public final long topPrice;

    public CustomOrderGraphPriceModel(long j, long j2, List list) {
        list.getClass();
        this.topPrice = j;
        this.bottomPrice = j2;
        this.ticks = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomOrderGraphPriceModel)) {
            return false;
        }
        CustomOrderGraphPriceModel customOrderGraphPriceModel = (CustomOrderGraphPriceModel) obj;
        return PriceValue.m3663equalsimpl0(this.topPrice, customOrderGraphPriceModel.topPrice) && PriceValue.m3663equalsimpl0(this.bottomPrice, customOrderGraphPriceModel.bottomPrice) && Intrinsics.areEqual(this.ticks, customOrderGraphPriceModel.ticks);
    }

    public final int hashCode() {
        return this.ticks.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.topPrice) * 31, 31, this.bottomPrice);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomOrderGraphPriceModel(topPrice=", PriceValue.m3664toStringimpl(this.topPrice), ", bottomPrice=", PriceValue.m3664toStringimpl(this.bottomPrice), ", ticks="), this.ticks, ")");
    }
}
