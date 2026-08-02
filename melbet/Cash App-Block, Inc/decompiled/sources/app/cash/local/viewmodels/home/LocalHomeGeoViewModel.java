package app.cash.local.viewmodels.home;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.MapboxConfiguration;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalHomeGeoViewModel {
    public final UiCallbackModel cashMapUiCallbackModel;
    public final List locations;
    public final MapboxConfiguration mapboxConfiguration;
    public final Function0 onDismissSellerSheet;
    public final Location selectedLocation;
    public final UiCallbackModel selectedLocationBrandProfileUiCallbackModel;
    public final LocalHomeViewModel.TabContent tabContent;
    public final TabSheetUpperContent tabSheetUpperContent;
    public final TabToolbarInternalViewModel toolbarInternalModel;

    public final class Location extends MarkerLocation {
        public final double latitude;
        public final double longitude;
        public final LocalColor markerColor;
        public final String neighborhood;
        public final BrandCollectionModel.Location sheetModel;
        public final String status;
        public final String subtitle;
        public final String title;
        public final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Location(String str, String str2, String str3, String str4, String str5, LocalColor localColor, BrandCollectionModel.Location location, double d, double d2) {
            super(Double.valueOf(d), Double.valueOf(d2), str, str2);
            str.getClass();
            str2.getClass();
            this.token = str;
            this.title = str2;
            this.subtitle = str3;
            this.status = str4;
            this.neighborhood = str5;
            this.markerColor = localColor;
            this.sheetModel = location;
            this.latitude = d;
            this.longitude = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return Intrinsics.areEqual(this.token, location.token) && Intrinsics.areEqual(this.title, location.title) && Intrinsics.areEqual(this.subtitle, location.subtitle) && Intrinsics.areEqual(this.status, location.status) && Intrinsics.areEqual(this.neighborhood, location.neighborhood) && Intrinsics.areEqual(this.markerColor, location.markerColor) && Intrinsics.areEqual(this.sheetModel, location.sheetModel) && Double.compare(this.latitude, location.latitude) == 0 && Double.compare(this.longitude, location.longitude) == 0;
        }

        @Override // com.squareup.cash.maps.viewmodels.MarkerLocation
        public final String getTitle() {
            return this.title;
        }

        @Override // com.squareup.cash.maps.viewmodels.MarkerLocation
        public final String getToken() {
            return this.token;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title), 31, this.subtitle);
            String str = this.status;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.neighborhood);
            LocalColor localColor = this.markerColor;
            return Double.hashCode(this.longitude) + Fragment$5$$ExternalSyntheticOutline0.m(this.latitude, (this.sheetModel.hashCode() + ((m2 + (localColor != null ? localColor.hashCode() : 0)) * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Location(token=", this.token, ", title=", this.title, ", subtitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", status=", this.status, ", neighborhood=");
            m.append(this.neighborhood);
            m.append(", markerColor=");
            m.append(this.markerColor);
            m.append(", sheetModel=");
            m.append(this.sheetModel);
            m.append(", latitude=");
            m.append(this.latitude);
            m.append(", longitude=");
            m.append(this.longitude);
            m.append(")");
            return m.toString();
        }
    }

    public LocalHomeGeoViewModel(TabToolbarInternalViewModel tabToolbarInternalViewModel, UiCallbackModel uiCallbackModel, List list, TabSheetUpperContent tabSheetUpperContent, LocalHomeViewModel.TabContent tabContent, Location location, UiCallbackModel uiCallbackModel2, MapboxConfiguration mapboxConfiguration, Function0 function0) {
        tabToolbarInternalViewModel.getClass();
        list.getClass();
        function0.getClass();
        this.toolbarInternalModel = tabToolbarInternalViewModel;
        this.cashMapUiCallbackModel = uiCallbackModel;
        this.locations = list;
        this.tabSheetUpperContent = tabSheetUpperContent;
        this.tabContent = tabContent;
        this.selectedLocation = location;
        this.selectedLocationBrandProfileUiCallbackModel = uiCallbackModel2;
        this.mapboxConfiguration = mapboxConfiguration;
        this.onDismissSellerSheet = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalHomeGeoViewModel)) {
            return false;
        }
        LocalHomeGeoViewModel localHomeGeoViewModel = (LocalHomeGeoViewModel) obj;
        return Intrinsics.areEqual(this.toolbarInternalModel, localHomeGeoViewModel.toolbarInternalModel) && this.cashMapUiCallbackModel.equals(localHomeGeoViewModel.cashMapUiCallbackModel) && Intrinsics.areEqual(this.locations, localHomeGeoViewModel.locations) && Intrinsics.areEqual(this.tabSheetUpperContent, localHomeGeoViewModel.tabSheetUpperContent) && this.tabContent.equals(localHomeGeoViewModel.tabContent) && Intrinsics.areEqual(this.selectedLocation, localHomeGeoViewModel.selectedLocation) && Intrinsics.areEqual(this.selectedLocationBrandProfileUiCallbackModel, localHomeGeoViewModel.selectedLocationBrandProfileUiCallbackModel) && Intrinsics.areEqual(this.mapboxConfiguration, localHomeGeoViewModel.mapboxConfiguration) && Intrinsics.areEqual(this.onDismissSellerSheet, localHomeGeoViewModel.onDismissSellerSheet);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m((this.cashMapUiCallbackModel.hashCode() + (this.toolbarInternalModel.hashCode() * 31)) * 31, 31, this.locations);
        TabSheetUpperContent tabSheetUpperContent = this.tabSheetUpperContent;
        int hashCode = (this.tabContent.hashCode() + ((m + (tabSheetUpperContent == null ? 0 : tabSheetUpperContent.hashCode())) * 31)) * 31;
        Location location = this.selectedLocation;
        int hashCode2 = (hashCode + (location == null ? 0 : location.hashCode())) * 31;
        UiCallbackModel uiCallbackModel = this.selectedLocationBrandProfileUiCallbackModel;
        int hashCode3 = (hashCode2 + (uiCallbackModel == null ? 0 : uiCallbackModel.hashCode())) * 31;
        MapboxConfiguration mapboxConfiguration = this.mapboxConfiguration;
        return this.onDismissSellerSheet.hashCode() + ((hashCode3 + (mapboxConfiguration != null ? mapboxConfiguration.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LocalHomeGeoViewModel(toolbarInternalModel=" + this.toolbarInternalModel + ", cashMapUiCallbackModel=" + this.cashMapUiCallbackModel + ", locations=" + this.locations + ", tabSheetUpperContent=" + this.tabSheetUpperContent + ", tabContent=" + this.tabContent + ", selectedLocation=" + this.selectedLocation + ", selectedLocationBrandProfileUiCallbackModel=" + this.selectedLocationBrandProfileUiCallbackModel + ", mapboxConfiguration=" + this.mapboxConfiguration + ", onDismissSellerSheet=" + this.onDismissSellerSheet + ")";
    }
}
