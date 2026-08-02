package com.squareup.cash.businessaccount.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class KybRestrictionBannerScreen implements Screen {
    public static final Parcelable.Creator<KybRestrictionBannerScreen> CREATOR = new BorrowLimitHub.Creator(8);
    public final Screen exitScreen;
    public final KybEligibilityWarning.RestrictedFeature restrictedFeature;

    public KybRestrictionBannerScreen(Screen screen, KybEligibilityWarning.RestrictedFeature restrictedFeature) {
        screen.getClass();
        restrictedFeature.getClass();
        this.exitScreen = screen;
        this.restrictedFeature = restrictedFeature;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KybRestrictionBannerScreen)) {
            return false;
        }
        KybRestrictionBannerScreen kybRestrictionBannerScreen = (KybRestrictionBannerScreen) obj;
        return Intrinsics.areEqual(this.exitScreen, kybRestrictionBannerScreen.exitScreen) && this.restrictedFeature == kybRestrictionBannerScreen.restrictedFeature;
    }

    public final int hashCode() {
        return this.restrictedFeature.hashCode() + (this.exitScreen.hashCode() * 31);
    }

    public final String toString() {
        return "KybRestrictionBannerScreen(exitScreen=" + this.exitScreen + ", restrictedFeature=" + this.restrictedFeature + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exitScreen, i);
        parcel.writeString(this.restrictedFeature.name());
    }
}
