package com.squareup.cash.deposits.physical.viewmodels.map;

import com.squareup.protos.franklin.api.RetailerMapBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ViewTextViewModel {
    public final RetailerMapBlocker.MapScreen mapScreen;

    public ViewTextViewModel(RetailerMapBlocker.MapScreen mapScreen) {
        mapScreen.getClass();
        this.mapScreen = mapScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewTextViewModel) && Intrinsics.areEqual(this.mapScreen, ((ViewTextViewModel) obj).mapScreen);
    }

    public final int hashCode() {
        return this.mapScreen.hashCode();
    }

    public final String toString() {
        return "ViewTextViewModel(mapScreen=" + this.mapScreen + ")";
    }
}
