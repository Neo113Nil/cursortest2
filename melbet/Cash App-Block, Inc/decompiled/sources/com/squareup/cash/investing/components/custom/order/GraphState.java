package com.squareup.cash.investing.components.custom.order;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.multiplatform.investing.PriceValue;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class GraphState {
    public long currentPrice;
    public final ParcelableSnapshotMutableIntState graphHeight$delegate;
    public final ParcelableSnapshotMutableState graphPosition$delegate;
    public final Function1 onSelectPrice;
    public final ParcelableSnapshotMutableState priceModel$delegate;
    public final ParcelableSnapshotMutableFloatState priceWidgetOffsetY$delegate;
    public final ParcelableSnapshotMutableState selectedPrice$delegate;

    public GraphState(Function1 function1) {
        function1.getClass();
        this.onSelectPrice = function1;
        this.graphHeight$delegate = new ParcelableSnapshotMutableIntState(0);
        this.graphPosition$delegate = Updater.mutableStateOf$default(new Offset(0L));
        this.currentPrice = 0L;
        this.selectedPrice$delegate = Updater.mutableStateOf$default(new PriceValue(0L));
        this.priceWidgetOffsetY$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
        this.priceModel$delegate = Updater.mutableStateOf$default(null);
    }

    /* renamed from: pointForPrice-nM2_iWI, reason: not valid java name */
    public final float m3582pointForPricenM2_iWI(long j) {
        CustomOrderGraphPriceModel customOrderGraphPriceModel = (CustomOrderGraphPriceModel) this.priceModel$delegate.getValue();
        if (customOrderGraphPriceModel == null) {
            return RecyclerView.DECELERATION_RATE;
        }
        int intValue = this.graphHeight$delegate.getIntValue();
        long j2 = customOrderGraphPriceModel.topPrice;
        return (int) ((intValue * ((j - j2) / (customOrderGraphPriceModel.bottomPrice - j2))) + RecyclerView.DECELERATION_RATE);
    }

    public final void tick(int i) {
        List list;
        CustomOrderGraphPriceModel customOrderGraphPriceModel = (CustomOrderGraphPriceModel) this.priceModel$delegate.getValue();
        if (customOrderGraphPriceModel == null || (list = customOrderGraphPriceModel.ticks) == null) {
            return;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.selectedPrice$delegate;
        int binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(list, new PriceValue(((PriceValue) parcelableSnapshotMutableState.getValue()).value));
        if (binarySearch$default < 0) {
            binarySearch$default = (-binarySearch$default) - 1;
        }
        int i2 = binarySearch$default + i;
        if (i2 < 0 || i2 >= list.size()) {
            return;
        }
        long j = ((PriceValue) list.get(i2)).value;
        this.onSelectPrice.invoke(new PriceValue(j));
        parcelableSnapshotMutableState.setValue(new PriceValue(j));
        this.priceWidgetOffsetY$delegate.setFloatValue(m3582pointForPricenM2_iWI(j));
    }
}
