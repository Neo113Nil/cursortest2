package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.SingleInstanceScreen;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.screens.app.LocalLoyaltySheet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationOpenTabScreen implements LocalBrandProfileSubScreen, SingleInstanceScreen {
    public static final Parcelable.Creator<LocalBrandLocationOpenTabScreen> CREATOR = new LocalLoyaltySheet.Creator(6);
    public final AttributionKey attributionKey;
    public final BrandSpot brandSpot;
    public final boolean isProfileSheetInline;
    public final BrandSpotSyncTokens syncTokens;

    public LocalBrandLocationOpenTabScreen(BrandSpot brandSpot, AttributionKey attributionKey, boolean z, BrandSpotSyncTokens brandSpotSyncTokens) {
        brandSpot.getClass();
        attributionKey.getClass();
        brandSpotSyncTokens.getClass();
        this.brandSpot = brandSpot;
        this.attributionKey = attributionKey;
        this.isProfileSheetInline = z;
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
        if (!(obj instanceof LocalBrandLocationOpenTabScreen)) {
            return false;
        }
        LocalBrandLocationOpenTabScreen localBrandLocationOpenTabScreen = (LocalBrandLocationOpenTabScreen) obj;
        return Intrinsics.areEqual(this.brandSpot, localBrandLocationOpenTabScreen.brandSpot) && Intrinsics.areEqual(this.attributionKey, localBrandLocationOpenTabScreen.attributionKey) && this.isProfileSheetInline == localBrandLocationOpenTabScreen.isProfileSheetInline && Intrinsics.areEqual(this.syncTokens, localBrandLocationOpenTabScreen.syncTokens);
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
        return this.syncTokens.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.attributionKey.hashCode() + (this.brandSpot.hashCode() * 31)) * 31, 31, this.isProfileSheetInline);
    }

    @Override // app.cash.local.screens.app.LocalBrandProfileSubScreen
    public final boolean isProfileSheetInline() {
        return this.isProfileSheetInline;
    }

    public final String toString() {
        return "LocalBrandLocationOpenTabScreen(brandSpot=" + this.brandSpot + ", attributionKey=" + this.attributionKey + ", isProfileSheetInline=" + this.isProfileSheetInline + ", syncTokens=" + this.syncTokens + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.brandSpot, i);
        parcel.writeParcelable(this.attributionKey, i);
        parcel.writeInt(this.isProfileSheetInline ? 1 : 0);
        parcel.writeParcelable(this.syncTokens, i);
    }
}
