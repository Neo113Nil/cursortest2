package com.squareup.cash.payments.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NearbyPayersSheetViewModel {
    public final String headerText;
    public final List payers;

    public NearbyPayersSheetViewModel(String str, List list) {
        list.getClass();
        this.headerText = str;
        this.payers = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPayersSheetViewModel)) {
            return false;
        }
        NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj;
        return this.headerText.equals(nearbyPayersSheetViewModel.headerText) && Intrinsics.areEqual(this.payers, nearbyPayersSheetViewModel.payers);
    }

    public final int hashCode() {
        return this.payers.hashCode() + (this.headerText.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("NearbyPayersSheetViewModel(headerText=", this.headerText, ", payers=", ")", this.payers);
    }
}
