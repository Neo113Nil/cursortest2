package app.cash.local.views.map;

import app.cash.local.viewmodels.map.BrandCollectionMapViewModel;
import com.squareup.cash.maps.views.CashClusterItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocationClusterItem extends CashClusterItem {
    public final BrandCollectionMapViewModel.Location location;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationClusterItem(BrandCollectionMapViewModel.Location location) {
        super(location);
        location.getClass();
        this.location = location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocationClusterItem) && Intrinsics.areEqual(this.location, ((LocationClusterItem) obj).location);
    }

    @Override // com.squareup.cash.maps.views.CashClusterItem
    public final double getLatitude() {
        return this.location.latitude;
    }

    @Override // com.squareup.cash.maps.views.CashClusterItem
    public final double getLongitude() {
        return this.location.longitude;
    }

    public final int hashCode() {
        return this.location.hashCode();
    }

    public final String toString() {
        return "LocationClusterItem(location=" + this.location + ")";
    }
}
