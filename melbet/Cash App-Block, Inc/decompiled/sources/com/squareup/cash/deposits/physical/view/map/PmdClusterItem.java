package com.squareup.cash.deposits.physical.view.map;

import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.cash.maps.views.CashClusterItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PmdClusterItem extends CashClusterItem {
    public final PmdMarkerLocation viewModel;

    public PmdClusterItem(PmdMarkerLocation pmdMarkerLocation) {
        super(pmdMarkerLocation);
        this.viewModel = pmdMarkerLocation;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof PmdClusterItem) && Intrinsics.areEqual(((PmdClusterItem) obj).viewModel, this.viewModel);
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
        return this.viewModel.hashCode();
    }
}
