package com.squareup.cash.maps.views;

import com.squareup.cash.maps.viewmodels.MarkerLocation;

/* loaded from: classes6.dex */
public abstract class CashClusterItem {
    public final MarkerLocation viewModel;

    public CashClusterItem(MarkerLocation markerLocation) {
        markerLocation.getClass();
        this.viewModel = markerLocation;
    }

    public abstract double getLatitude();

    public abstract double getLongitude();

    public MarkerLocation getViewModel() {
        return this.viewModel;
    }
}
