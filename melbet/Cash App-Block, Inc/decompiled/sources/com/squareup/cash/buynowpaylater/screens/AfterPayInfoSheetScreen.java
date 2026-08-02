package com.squareup.cash.buynowpaylater.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.cash.buynowpaylater.viewmodels.InfoSheetViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterPayInfoSheetScreen implements BottomSheetScreen {
    public static final Parcelable.Creator<AfterPayInfoSheetScreen> CREATOR = new BorrowLimitHub.Creator(9);
    public final AfterPaySheetAnalyticsContext analyticsContext;
    public final InfoSheetViewModel infoSheetViewModel;

    public AfterPayInfoSheetScreen(InfoSheetViewModel infoSheetViewModel, AfterPaySheetAnalyticsContext afterPaySheetAnalyticsContext) {
        infoSheetViewModel.getClass();
        afterPaySheetAnalyticsContext.getClass();
        this.infoSheetViewModel = infoSheetViewModel;
        this.analyticsContext = afterPaySheetAnalyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterPayInfoSheetScreen)) {
            return false;
        }
        AfterPayInfoSheetScreen afterPayInfoSheetScreen = (AfterPayInfoSheetScreen) obj;
        return Intrinsics.areEqual(this.infoSheetViewModel, afterPayInfoSheetScreen.infoSheetViewModel) && Intrinsics.areEqual(this.analyticsContext, afterPayInfoSheetScreen.analyticsContext);
    }

    public final int hashCode() {
        return this.analyticsContext.hashCode() + (this.infoSheetViewModel.stackableContent.hashCode() * 31);
    }

    public final String toString() {
        return "AfterPayInfoSheetScreen(infoSheetViewModel=" + this.infoSheetViewModel + ", analyticsContext=" + this.analyticsContext + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.infoSheetViewModel, i);
        parcel.writeParcelable(this.analyticsContext, i);
    }
}
