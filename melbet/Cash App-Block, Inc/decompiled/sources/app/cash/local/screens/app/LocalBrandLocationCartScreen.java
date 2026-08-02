package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.SingleInstanceScreen;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.screens.app.LocalLoyaltySheet;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LocalBrandLocationCartScreen implements LocalBrandProfileSubScreen, SingleInstanceScreen {
    public static final Parcelable.Creator<LocalBrandLocationCartScreen> CREATOR = new LocalLoyaltySheet.Creator(2);
    public final AttributionKey attributionKey;
    public final BrandSpot brandSpot;
    public final boolean isProfileSheetInline;
    public final LocalActionOrdering.PastOrder pastOrder;
    public final Long pastOrderIndex;
    public final BrandSpotSyncTokens syncTokens;

    public LocalBrandLocationCartScreen(BrandSpot brandSpot, AttributionKey attributionKey, boolean z, LocalActionOrdering.PastOrder pastOrder, Long l, BrandSpotSyncTokens brandSpotSyncTokens) {
        brandSpot.getClass();
        attributionKey.getClass();
        brandSpotSyncTokens.getClass();
        this.brandSpot = brandSpot;
        this.attributionKey = attributionKey;
        this.isProfileSheetInline = z;
        this.pastOrder = pastOrder;
        this.pastOrderIndex = l;
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
        if (!(obj instanceof LocalBrandLocationCartScreen)) {
            return false;
        }
        LocalBrandLocationCartScreen localBrandLocationCartScreen = (LocalBrandLocationCartScreen) obj;
        return Intrinsics.areEqual(this.brandSpot, localBrandLocationCartScreen.brandSpot) && Intrinsics.areEqual(this.attributionKey, localBrandLocationCartScreen.attributionKey) && this.isProfileSheetInline == localBrandLocationCartScreen.isProfileSheetInline && Intrinsics.areEqual(this.pastOrder, localBrandLocationCartScreen.pastOrder) && Intrinsics.areEqual(this.pastOrderIndex, localBrandLocationCartScreen.pastOrderIndex) && Intrinsics.areEqual(this.syncTokens, localBrandLocationCartScreen.syncTokens);
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
        LocalActionOrdering.PastOrder pastOrder = this.pastOrder;
        int hashCode = (m + (pastOrder == null ? 0 : pastOrder.hashCode())) * 31;
        Long l = this.pastOrderIndex;
        return this.syncTokens.hashCode() + ((hashCode + (l != null ? l.hashCode() : 0)) * 31);
    }

    @Override // app.cash.local.screens.app.LocalBrandProfileSubScreen
    public final boolean isProfileSheetInline() {
        return this.isProfileSheetInline;
    }

    public final String toString() {
        return "LocalBrandLocationCartScreen(brandSpot=" + this.brandSpot + ", attributionKey=" + this.attributionKey + ", isProfileSheetInline=" + this.isProfileSheetInline + ", pastOrder=" + this.pastOrder + ", pastOrderIndex=" + this.pastOrderIndex + ", syncTokens=" + this.syncTokens + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.brandSpot, i);
        parcel.writeParcelable(this.attributionKey, i);
        parcel.writeInt(this.isProfileSheetInline ? 1 : 0);
        parcel.writeParcelable(this.pastOrder, i);
        Long l = this.pastOrderIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeParcelable(this.syncTokens, i);
    }

    public /* synthetic */ LocalBrandLocationCartScreen(BrandSpot brandSpot, AttributionKey attributionKey, boolean z, LocalActionOrdering.PastOrder pastOrder, Long l, BrandSpotSyncTokens brandSpotSyncTokens, int i) {
        this(brandSpot, attributionKey, z, (i & 8) != 0 ? null : pastOrder, (i & 16) != 0 ? null : l, (i & 32) != 0 ? new BrandSpotSyncTokens((String) null, (String) null, 7) : brandSpotSyncTokens);
    }
}
