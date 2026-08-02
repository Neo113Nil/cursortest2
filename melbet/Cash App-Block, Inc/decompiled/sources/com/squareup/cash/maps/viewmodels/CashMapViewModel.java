package com.squareup.cash.maps.viewmodels;

import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashMapViewModel {
    public final LatLngBounds cameraBounds;
    public final boolean hasLocationPermission;
    public final CashMapViewEvent.MapMovementFinished latestMapMovement;
    public final LocationViewModel locationViewModel;
    public final SearchLocation searchedLocation;
    public final LocationSelection selectedLocation;
    public final boolean userLocationInBoundary;

    public CashMapViewModel(LocationViewModel locationViewModel, boolean z, LatLngBounds latLngBounds, CashMapViewEvent.MapMovementFinished mapMovementFinished, LocationSelection locationSelection, boolean z2, SearchLocation searchLocation) {
        locationViewModel.getClass();
        this.locationViewModel = locationViewModel;
        this.hasLocationPermission = z;
        this.cameraBounds = latLngBounds;
        this.latestMapMovement = mapMovementFinished;
        this.selectedLocation = locationSelection;
        this.userLocationInBoundary = z2;
        this.searchedLocation = searchLocation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashMapViewModel)) {
            return false;
        }
        CashMapViewModel cashMapViewModel = (CashMapViewModel) obj;
        return Intrinsics.areEqual(this.locationViewModel, cashMapViewModel.locationViewModel) && this.hasLocationPermission == cashMapViewModel.hasLocationPermission && Intrinsics.areEqual(this.cameraBounds, cashMapViewModel.cameraBounds) && Intrinsics.areEqual(this.latestMapMovement, cashMapViewModel.latestMapMovement) && Intrinsics.areEqual(this.selectedLocation, cashMapViewModel.selectedLocation) && this.userLocationInBoundary == cashMapViewModel.userLocationInBoundary && Intrinsics.areEqual(this.searchedLocation, cashMapViewModel.searchedLocation);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.locationViewModel.hashCode() * 31, 31, this.hasLocationPermission);
        LatLngBounds latLngBounds = this.cameraBounds;
        int hashCode = (m + (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 31;
        CashMapViewEvent.MapMovementFinished mapMovementFinished = this.latestMapMovement;
        int hashCode2 = (hashCode + (mapMovementFinished == null ? 0 : mapMovementFinished.hashCode())) * 31;
        LocationSelection locationSelection = this.selectedLocation;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (locationSelection == null ? 0 : locationSelection.hashCode())) * 31, 31, this.userLocationInBoundary);
        SearchLocation searchLocation = this.searchedLocation;
        return m2 + (searchLocation != null ? searchLocation.hashCode() : 0);
    }

    public final String toString() {
        return "CashMapViewModel(locationViewModel=" + this.locationViewModel + ", hasLocationPermission=" + this.hasLocationPermission + ", cameraBounds=" + this.cameraBounds + ", latestMapMovement=" + this.latestMapMovement + ", selectedLocation=" + this.selectedLocation + ", userLocationInBoundary=" + this.userLocationInBoundary + ", searchedLocation=" + this.searchedLocation + ")";
    }
}
