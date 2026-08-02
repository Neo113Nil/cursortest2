package app.cash.local.views.home;

import app.cash.local.viewmodels.home.LocalHomeGeoViewModel;
import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.cash.maps.views.CashClusterItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalHomeGeoClusterItem extends CashClusterItem {
    public final LocalHomeGeoViewModel.Location viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalHomeGeoClusterItem(LocalHomeGeoViewModel.Location location) {
        super(location);
        location.getClass();
        this.viewModel = location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalHomeGeoClusterItem) && Intrinsics.areEqual(this.viewModel, ((LocalHomeGeoClusterItem) obj).viewModel);
    }

    @Override // com.squareup.cash.maps.views.CashClusterItem
    public final double getLatitude() {
        return this.viewModel.latitude;
    }

    @Override // com.squareup.cash.maps.views.CashClusterItem
    public final double getLongitude() {
        return this.viewModel.longitude;
    }

    @Override // com.squareup.cash.maps.views.CashClusterItem
    public final MarkerLocation getViewModel() {
        return this.viewModel;
    }

    public final int hashCode() {
        return this.viewModel.hashCode();
    }

    public final String toString() {
        return "LocalHomeGeoClusterItem(viewModel=" + this.viewModel + ")";
    }
}
