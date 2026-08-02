package com.squareup.cash.deposits.physical.view.map;

import com.squareup.cash.deposits.physical.viewmodels.map.AtmMarkerLocation;
import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.cash.maps.views.CashClusterItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AtmClusterItem extends CashClusterItem {
    public final AtmMarkerLocation viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtmClusterItem(AtmMarkerLocation atmMarkerLocation) {
        super(atmMarkerLocation);
        atmMarkerLocation.getClass();
        this.viewModel = atmMarkerLocation;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AtmClusterItem) && Intrinsics.areEqual(((AtmClusterItem) obj).viewModel, this.viewModel);
    }

    @Override // com.squareup.cash.maps.views.CashClusterItem
    public final double getLatitude() {
        Double d = this.viewModel.latitude;
        d.getClass();
        return d.doubleValue();
    }

    @Override // com.squareup.cash.maps.views.CashClusterItem
    public final double getLongitude() {
        Double d = this.viewModel.longitude;
        d.getClass();
        return d.doubleValue();
    }

    @Override // com.squareup.cash.maps.views.CashClusterItem
    public final MarkerLocation getViewModel() {
        return this.viewModel;
    }

    public final int hashCode() {
        return this.viewModel.retailerLocation.hashCode();
    }
}
