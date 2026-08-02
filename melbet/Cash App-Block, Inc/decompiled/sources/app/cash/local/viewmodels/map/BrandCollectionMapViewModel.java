package app.cash.local.viewmodels.map;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import com.squareup.cash.maps.viewmodels.MarkerLocation;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class BrandCollectionMapViewModel {
    public final UiCallbackModel cashMapUiCallbackModel;
    public final List locations;
    public final Sheet sheet;
    public final String title;

    public final class Location extends MarkerLocation {
        public final String artworkUrl;
        public final LocalColor backgroundColor;
        public final GpsCoordinates gpsCoordinates;
        public final double latitude;
        public final double longitude;
        public final BrandCollectionModel.Location sheetLocation;
        public final String title;
        public final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Location(String str, String str2, GpsCoordinates gpsCoordinates, LocalColor localColor, String str3, BrandCollectionModel.Location location) {
            super(null, null, str, str2);
            str2.getClass();
            location.getClass();
            this.token = str;
            this.title = str2;
            this.gpsCoordinates = gpsCoordinates;
            this.backgroundColor = localColor;
            this.artworkUrl = str3;
            this.sheetLocation = location;
            this.latitude = gpsCoordinates.latitude;
            this.longitude = gpsCoordinates.longitude;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return Intrinsics.areEqual(this.token, location.token) && Intrinsics.areEqual(this.title, location.title) && Intrinsics.areEqual(this.gpsCoordinates, location.gpsCoordinates) && Intrinsics.areEqual(this.backgroundColor, location.backgroundColor) && Intrinsics.areEqual(this.artworkUrl, location.artworkUrl) && Intrinsics.areEqual(this.sheetLocation, location.sheetLocation);
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
            String str = this.token;
            int hashCode = (this.gpsCoordinates.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.title)) * 31;
            LocalColor localColor = this.backgroundColor;
            int hashCode2 = (hashCode + (localColor == null ? 0 : localColor.hashCode())) * 31;
            String str2 = this.artworkUrl;
            return this.sheetLocation.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Location(token=", this.token, ", title=", this.title, ", gpsCoordinates=");
            m.append(this.gpsCoordinates);
            m.append(", backgroundColor=");
            m.append(this.backgroundColor);
            m.append(", artworkUrl=");
            m.append(this.artworkUrl);
            m.append(", sheetLocation=");
            m.append(this.sheetLocation);
            m.append(")");
            return m.toString();
        }
    }

    public interface Sheet {

        public final class Brand implements Sheet {
            public final BrandCollectionModel.Location location;

            public Brand(BrandCollectionModel.Location location) {
                this.location = location;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Brand) && this.location.equals(((Brand) obj).location);
            }

            public final int hashCode() {
                return this.location.hashCode();
            }

            public final String toString() {
                return "Brand(location=" + this.location + ")";
            }
        }

        public final class BrandCollection implements Sheet {
            public final BrandCollectionModel model;

            public BrandCollection(BrandCollectionModel brandCollectionModel) {
                this.model = brandCollectionModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BrandCollection) && this.model.equals(((BrandCollection) obj).model);
            }

            public final int hashCode() {
                return this.model.hashCode();
            }

            public final String toString() {
                return "BrandCollection(model=" + this.model + ")";
            }
        }
    }

    public BrandCollectionMapViewModel(String str, List list, UiCallbackModel uiCallbackModel, Sheet sheet) {
        list.getClass();
        this.title = str;
        this.locations = list;
        this.cashMapUiCallbackModel = uiCallbackModel;
        this.sheet = sheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandCollectionMapViewModel)) {
            return false;
        }
        BrandCollectionMapViewModel brandCollectionMapViewModel = (BrandCollectionMapViewModel) obj;
        return Intrinsics.areEqual(this.title, brandCollectionMapViewModel.title) && Intrinsics.areEqual(this.locations, brandCollectionMapViewModel.locations) && Intrinsics.areEqual(this.cashMapUiCallbackModel, brandCollectionMapViewModel.cashMapUiCallbackModel) && Intrinsics.areEqual(this.sheet, brandCollectionMapViewModel.sheet);
    }

    public final int hashCode() {
        String str = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.locations);
        UiCallbackModel uiCallbackModel = this.cashMapUiCallbackModel;
        int hashCode = (m + (uiCallbackModel == null ? 0 : uiCallbackModel.hashCode())) * 31;
        Sheet sheet = this.sheet;
        return hashCode + (sheet != null ? sheet.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("BrandCollectionMapViewModel(title=", this.title, ", locations=", ", cashMapUiCallbackModel=", this.locations);
        m.append(this.cashMapUiCallbackModel);
        m.append(", sheet=");
        m.append(this.sheet);
        m.append(")");
        return m.toString();
    }
}
