package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import app.cash.local.screens.app.LocalLoyaltySheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCurbsidePickupCarScreen implements LocalScreen, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<LocalCurbsidePickupCarScreen> CREATOR = new LocalLoyaltySheet.Creator(11);
    public final VehicleDescription previousDescription;
    public final AskedQuestion question;

    public LocalCurbsidePickupCarScreen(AskedQuestion askedQuestion, VehicleDescription vehicleDescription) {
        askedQuestion.getClass();
        this.question = askedQuestion;
        this.previousDescription = vehicleDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCurbsidePickupCarScreen)) {
            return false;
        }
        LocalCurbsidePickupCarScreen localCurbsidePickupCarScreen = (LocalCurbsidePickupCarScreen) obj;
        return Intrinsics.areEqual(this.question, localCurbsidePickupCarScreen.question) && Intrinsics.areEqual(this.previousDescription, localCurbsidePickupCarScreen.previousDescription);
    }

    public final int hashCode() {
        int hashCode = this.question.hashCode() * 31;
        VehicleDescription vehicleDescription = this.previousDescription;
        return hashCode + (vehicleDescription == null ? 0 : vehicleDescription.hashCode());
    }

    public final String toString() {
        return "LocalCurbsidePickupCarScreen(question=" + this.question + ", previousDescription=" + this.previousDescription + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.question, i);
        VehicleDescription vehicleDescription = this.previousDescription;
        if (vehicleDescription == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vehicleDescription.writeToParcel(parcel, i);
        }
    }
}
