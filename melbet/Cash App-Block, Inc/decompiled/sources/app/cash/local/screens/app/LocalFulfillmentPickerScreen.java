package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.screens.app.LocalLoyaltySheet;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LocalFulfillmentPickerScreen implements LocalScreen, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<LocalFulfillmentPickerScreen> CREATOR = new LocalLoyaltySheet.Creator(17);
    public final String brandToken;
    public final FulfillmentConfiguration currentConfiguration;
    public final LocalScreen exitScreen;
    public final LocalFulfillmentType selectedType;

    public LocalFulfillmentPickerScreen(String str, LocalFulfillmentType localFulfillmentType, FulfillmentConfiguration fulfillmentConfiguration, LocalScreen localScreen) {
        str.getClass();
        localFulfillmentType.getClass();
        localScreen.getClass();
        this.brandToken = str;
        this.selectedType = localFulfillmentType;
        this.currentConfiguration = fulfillmentConfiguration;
        this.exitScreen = localScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalFulfillmentPickerScreen)) {
            return false;
        }
        LocalFulfillmentPickerScreen localFulfillmentPickerScreen = (LocalFulfillmentPickerScreen) obj;
        return BrandToken.m1227equalsimpl0(this.brandToken, localFulfillmentPickerScreen.brandToken) && this.selectedType == localFulfillmentPickerScreen.selectedType && Intrinsics.areEqual(this.currentConfiguration, localFulfillmentPickerScreen.currentConfiguration) && Intrinsics.areEqual(this.exitScreen, localFulfillmentPickerScreen.exitScreen);
    }

    public final int hashCode() {
        int hashCode = (this.selectedType.hashCode() + (BrandToken.m1228hashCodeimpl(this.brandToken) * 31)) * 31;
        FulfillmentConfiguration fulfillmentConfiguration = this.currentConfiguration;
        return this.exitScreen.hashCode() + ((hashCode + (fulfillmentConfiguration == null ? 0 : fulfillmentConfiguration.hashCode())) * 31);
    }

    public final String toString() {
        return "LocalFulfillmentPickerScreen(brandToken=" + BrandToken.m1229toStringimpl(this.brandToken) + ", selectedType=" + this.selectedType + ", currentConfiguration=" + this.currentConfiguration + ", exitScreen=" + this.exitScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(BrandToken.m1226boximpl(this.brandToken), i);
        parcel.writeString(this.selectedType.name());
        parcel.writeParcelable(this.currentConfiguration, i);
        parcel.writeParcelable(this.exitScreen, i);
    }
}
