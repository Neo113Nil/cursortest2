package app.cash.local.viewmodels.wallet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuj;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class BrandCollectionModel implements LocalHomeViewModel.TabContent.Widget {
    public final String caption;
    public final List locations;
    public final LocalImage mastheadImage;
    public final String primaryCtaButtonLabel;
    public final String primaryCtaClientRoute;
    public final boolean showMapButton;
    public final String subtitle;
    public final String title;

    public final class Location {
        public final BrandFollowViewModel addRemoveState;
        public final String address;
        public final String artwork;
        public final LocalColor backgroundColor;
        public final BrandSpot brandSpot;
        public final String clientRoute;
        public final LocalColor foregroundColor;
        public final LocalImage heroImage;
        public final String name;
        public final String promoDescription;
        public final String promoTag;
        public final LocationStatus status;

        public Location(BrandSpot brandSpot, String str, LocalColor localColor, LocalColor localColor2, String str2, LocationStatus locationStatus, String str3, String str4, BrandFollowViewModel brandFollowViewModel, LocalImage localImage, String str5, String str6, zzuj zzujVar) {
            brandSpot.getClass();
            str.getClass();
            localColor.getClass();
            localColor2.getClass();
            this.brandSpot = brandSpot;
            this.name = str;
            this.backgroundColor = localColor;
            this.foregroundColor = localColor2;
            this.artwork = str2;
            this.status = locationStatus;
            this.address = str3;
            this.clientRoute = str4;
            this.addRemoveState = brandFollowViewModel;
            this.heroImage = localImage;
            this.promoTag = str5;
            this.promoDescription = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return Intrinsics.areEqual(this.brandSpot, location.brandSpot) && Intrinsics.areEqual(this.name, location.name) && Intrinsics.areEqual(this.backgroundColor, location.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, location.foregroundColor) && Intrinsics.areEqual(this.artwork, location.artwork) && Intrinsics.areEqual(this.status, location.status) && Intrinsics.areEqual(this.address, location.address) && Intrinsics.areEqual(this.clientRoute, location.clientRoute) && Intrinsics.areEqual(this.addRemoveState, location.addRemoveState) && Intrinsics.areEqual(this.heroImage, location.heroImage) && Intrinsics.areEqual(this.promoTag, location.promoTag) && Intrinsics.areEqual(this.promoDescription, location.promoDescription) && Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            int hashCode = (this.foregroundColor.hashCode() + ((this.backgroundColor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.brandSpot.hashCode() * 31, 31, this.name)) * 31)) * 31;
            String str = this.artwork;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            LocationStatus locationStatus = this.status;
            int hashCode3 = (hashCode2 + (locationStatus == null ? 0 : locationStatus.hashCode())) * 31;
            String str2 = this.address;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.clientRoute;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BrandFollowViewModel brandFollowViewModel = this.addRemoveState;
            int hashCode6 = (hashCode5 + (brandFollowViewModel == null ? 0 : brandFollowViewModel.hashCode())) * 31;
            LocalImage localImage = this.heroImage;
            int hashCode7 = (hashCode6 + (localImage == null ? 0 : localImage.hashCode())) * 31;
            String str4 = this.promoTag;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.promoDescription;
            return ((hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31) + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Location(brandSpot=");
            sb.append(this.brandSpot);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", backgroundColor=");
            sb.append(this.backgroundColor);
            sb.append(", foregroundColor=");
            sb.append(this.foregroundColor);
            sb.append(", artwork=");
            sb.append(this.artwork);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", address=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.address, ", clientRoute=", this.clientRoute, ", addRemoveState=");
            sb.append(this.addRemoveState);
            sb.append(", heroImage=");
            sb.append(this.heroImage);
            sb.append(", promoTag=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.promoTag, ", promoDescription=", this.promoDescription, ", banner=");
            sb.append((Object) null);
            sb.append(")");
            return sb.toString();
        }
    }

    public BrandCollectionModel(String str, String str2, String str3, List list, LocalImage localImage, String str4, String str5, boolean z) {
        list.getClass();
        this.title = str;
        this.subtitle = str2;
        this.caption = str3;
        this.locations = list;
        this.mastheadImage = localImage;
        this.primaryCtaButtonLabel = str4;
        this.primaryCtaClientRoute = str5;
        this.showMapButton = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandCollectionModel)) {
            return false;
        }
        BrandCollectionModel brandCollectionModel = (BrandCollectionModel) obj;
        return Intrinsics.areEqual(this.title, brandCollectionModel.title) && Intrinsics.areEqual(this.subtitle, brandCollectionModel.subtitle) && Intrinsics.areEqual(this.caption, brandCollectionModel.caption) && Intrinsics.areEqual(this.locations, brandCollectionModel.locations) && Intrinsics.areEqual(this.mastheadImage, brandCollectionModel.mastheadImage) && Intrinsics.areEqual(this.primaryCtaButtonLabel, brandCollectionModel.primaryCtaButtonLabel) && Intrinsics.areEqual(this.primaryCtaClientRoute, brandCollectionModel.primaryCtaClientRoute) && this.showMapButton == brandCollectionModel.showMapButton;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.caption;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.locations);
        LocalImage localImage = this.mastheadImage;
        int hashCode3 = (m + (localImage == null ? 0 : localImage.hashCode())) * 31;
        String str4 = this.primaryCtaButtonLabel;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.primaryCtaClientRoute;
        return Boolean.hashCode(this.showMapButton) + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BrandCollectionModel(title=", this.title, ", subtitle=", this.subtitle, ", caption=");
        NavAction$$ExternalSyntheticOutline0.m(this.caption, ", locations=", ", mastheadImage=", m, this.locations);
        m.append(this.mastheadImage);
        m.append(", primaryCtaButtonLabel=");
        m.append(this.primaryCtaButtonLabel);
        m.append(", primaryCtaClientRoute=");
        return re$$ExternalSyntheticOutline0.m(m, this.primaryCtaClientRoute, ", showMapButton=", this.showMapButton, ")");
    }
}
