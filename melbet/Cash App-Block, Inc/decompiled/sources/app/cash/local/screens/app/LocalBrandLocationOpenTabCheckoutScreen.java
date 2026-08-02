package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.SingleInstanceScreen;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.LocalErrorResponse;
import app.cash.local.screens.app.LocalLoyaltySheet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationOpenTabCheckoutScreen implements LocalBrandProfileSubScreen, SingleInstanceScreen {
    public static final Parcelable.Creator<LocalBrandLocationOpenTabCheckoutScreen> CREATOR = new LocalLoyaltySheet.Creator(5);
    public final AttributionKey attributionKey;
    public final BrandSpot brandSpot;
    public final LocalErrorResponse errors;
    public final Fulfillment fulfillment;
    public final boolean isProfileSheetInline;
    public final BrandSpotSyncTokens syncTokens;

    public LocalBrandLocationOpenTabCheckoutScreen(BrandSpot brandSpot, AttributionKey attributionKey, boolean z, Fulfillment fulfillment, LocalErrorResponse localErrorResponse, BrandSpotSyncTokens brandSpotSyncTokens) {
        brandSpot.getClass();
        attributionKey.getClass();
        brandSpotSyncTokens.getClass();
        this.brandSpot = brandSpot;
        this.attributionKey = attributionKey;
        this.isProfileSheetInline = z;
        this.fulfillment = fulfillment;
        this.errors = localErrorResponse;
        this.syncTokens = brandSpotSyncTokens;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationOpenTabCheckoutScreen)) {
            return false;
        }
        LocalBrandLocationOpenTabCheckoutScreen localBrandLocationOpenTabCheckoutScreen = (LocalBrandLocationOpenTabCheckoutScreen) obj;
        return Intrinsics.areEqual(this.brandSpot, localBrandLocationOpenTabCheckoutScreen.brandSpot) && Intrinsics.areEqual(this.attributionKey, localBrandLocationOpenTabCheckoutScreen.attributionKey) && this.isProfileSheetInline == localBrandLocationOpenTabCheckoutScreen.isProfileSheetInline && Intrinsics.areEqual(this.fulfillment, localBrandLocationOpenTabCheckoutScreen.fulfillment) && Intrinsics.areEqual(this.errors, localBrandLocationOpenTabCheckoutScreen.errors) && Intrinsics.areEqual(this.syncTokens, localBrandLocationOpenTabCheckoutScreen.syncTokens);
    }

    @Override // app.cash.local.screens.app.HasAttributionKeyScreenScreen
    public final AttributionKey getAttributionKey() {
        return this.attributionKey;
    }

    @Override // app.cash.local.screens.app.LocalBrandProfileSubScreen
    public final BrandSpot getBrandSpot() {
        return this.brandSpot;
    }

    @Override // app.cash.local.screens.app.LocalBrandProfileSubScreen
    public final BrandSpotSyncTokens getSyncTokens() {
        return this.syncTokens;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.attributionKey.hashCode() + (this.brandSpot.hashCode() * 31)) * 31, 31, this.isProfileSheetInline);
        Fulfillment fulfillment = this.fulfillment;
        int hashCode = (m + (fulfillment == null ? 0 : fulfillment.hashCode())) * 31;
        LocalErrorResponse localErrorResponse = this.errors;
        return this.syncTokens.hashCode() + ((hashCode + (localErrorResponse != null ? localErrorResponse.errors.hashCode() : 0)) * 31);
    }

    @Override // app.cash.local.screens.app.LocalBrandProfileSubScreen
    public final boolean isProfileSheetInline() {
        return this.isProfileSheetInline;
    }

    public final String toString() {
        return "LocalBrandLocationOpenTabCheckoutScreen(brandSpot=" + this.brandSpot + ", attributionKey=" + this.attributionKey + ", isProfileSheetInline=" + this.isProfileSheetInline + ", fulfillment=" + this.fulfillment + ", errors=" + this.errors + ", syncTokens=" + this.syncTokens + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.brandSpot, i);
        parcel.writeParcelable(this.attributionKey, i);
        parcel.writeInt(this.isProfileSheetInline ? 1 : 0);
        parcel.writeParcelable(this.fulfillment, i);
        parcel.writeParcelable(this.errors, i);
        parcel.writeParcelable(this.syncTokens, i);
    }
}
