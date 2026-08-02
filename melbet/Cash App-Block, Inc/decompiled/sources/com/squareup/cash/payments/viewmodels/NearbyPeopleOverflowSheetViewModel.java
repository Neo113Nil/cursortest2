package com.squareup.cash.payments.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes6.dex */
public final class NearbyPeopleOverflowSheetViewModel {
    public final List people;
    public final String title;

    public NearbyPeopleOverflowSheetViewModel(String str, List list) {
        this.title = str;
        this.people = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPeopleOverflowSheetViewModel)) {
            return false;
        }
        NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj;
        return this.title.equals(nearbyPeopleOverflowSheetViewModel.title) && this.people.equals(nearbyPeopleOverflowSheetViewModel.people);
    }

    public final int hashCode() {
        return this.people.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("NearbyPeopleOverflowSheetViewModel(title=", this.title, ", people=", ")", this.people);
    }
}
