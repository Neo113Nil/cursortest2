package app.cash.local.primitives;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.Location;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class BrandCollectionData {
    public final String caption;
    public final ArrayList locations;
    public final LocalImage mastheadImage;
    public final String primaryCtaButtonLabel;
    public final String primaryCtaClientRoute;
    public final String subtitle;
    public final String title;

    public final class Location {
        public final String address;
        public final String artworkUrl;
        public final LocalColor backgroundColor;
        public final LocalBrand.Banner banner;
        public final BrandSpot brandSpot;
        public final String category;
        public final String clientRoute;
        public final LocalColor foregroundColor;
        public final GpsCoordinates gpsCoordinates;
        public final LocalImage heroImage;
        public final String name;
        public final Location.OpenState openState;
        public final String promoDescription;
        public final String promoTag;

        public Location(BrandSpot brandSpot, String str, LocalColor localColor, LocalColor localColor2, String str2, Location.OpenState openState, String str3, String str4, String str5, LocalBrand.Banner banner, GpsCoordinates gpsCoordinates, LocalImage localImage, String str6, String str7) {
            str.getClass();
            localColor.getClass();
            localColor2.getClass();
            str5.getClass();
            this.brandSpot = brandSpot;
            this.name = str;
            this.backgroundColor = localColor;
            this.foregroundColor = localColor2;
            this.artworkUrl = str2;
            this.openState = openState;
            this.category = str3;
            this.address = str4;
            this.clientRoute = str5;
            this.banner = banner;
            this.gpsCoordinates = gpsCoordinates;
            this.heroImage = localImage;
            this.promoTag = str6;
            this.promoDescription = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return this.brandSpot.equals(location.brandSpot) && Intrinsics.areEqual(this.name, location.name) && Intrinsics.areEqual(this.backgroundColor, location.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, location.foregroundColor) && Intrinsics.areEqual(this.artworkUrl, location.artworkUrl) && this.openState.equals(location.openState) && Intrinsics.areEqual(this.category, location.category) && Intrinsics.areEqual(this.address, location.address) && Intrinsics.areEqual(this.clientRoute, location.clientRoute) && this.banner == location.banner && this.gpsCoordinates.equals(location.gpsCoordinates) && Intrinsics.areEqual(this.heroImage, location.heroImage) && Intrinsics.areEqual(this.promoTag, location.promoTag) && Intrinsics.areEqual(this.promoDescription, location.promoDescription);
        }

        public final int hashCode() {
            int hashCode = (this.foregroundColor.hashCode() + ((this.backgroundColor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.brandSpot.hashCode() * 31, 31, this.name)) * 31)) * 31;
            String str = this.artworkUrl;
            int hashCode2 = (this.openState.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.category;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.address;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.clientRoute);
            LocalBrand.Banner banner = this.banner;
            int hashCode4 = (this.gpsCoordinates.hashCode() + ((m + (banner == null ? 0 : banner.hashCode())) * 31)) * 31;
            LocalImage localImage = this.heroImage;
            int hashCode5 = (hashCode4 + (localImage == null ? 0 : localImage.hashCode())) * 31;
            String str4 = this.promoTag;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.promoDescription;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
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
            sb.append(", artworkUrl=");
            sb.append(this.artworkUrl);
            sb.append(", openState=");
            sb.append(this.openState);
            sb.append(", category=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.category, ", address=", this.address, ", clientRoute=");
            sb.append(this.clientRoute);
            sb.append(", banner=");
            sb.append(this.banner);
            sb.append(", gpsCoordinates=");
            sb.append(this.gpsCoordinates);
            sb.append(", heroImage=");
            sb.append(this.heroImage);
            sb.append(", promoTag=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.promoTag, ", promoDescription=", this.promoDescription, ")");
        }
    }

    public BrandCollectionData(String str, String str2, String str3, ArrayList arrayList, LocalImage localImage, String str4, String str5) {
        this.title = str;
        this.subtitle = str2;
        this.caption = str3;
        this.locations = arrayList;
        this.mastheadImage = localImage;
        this.primaryCtaButtonLabel = str4;
        this.primaryCtaClientRoute = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandCollectionData)) {
            return false;
        }
        BrandCollectionData brandCollectionData = (BrandCollectionData) obj;
        return Intrinsics.areEqual(this.title, brandCollectionData.title) && Intrinsics.areEqual(this.subtitle, brandCollectionData.subtitle) && Intrinsics.areEqual(this.caption, brandCollectionData.caption) && this.locations.equals(brandCollectionData.locations) && Intrinsics.areEqual(this.mastheadImage, brandCollectionData.mastheadImage) && Intrinsics.areEqual(this.primaryCtaButtonLabel, brandCollectionData.primaryCtaButtonLabel) && Intrinsics.areEqual(this.primaryCtaClientRoute, brandCollectionData.primaryCtaClientRoute);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.caption;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.locations, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        LocalImage localImage = this.mastheadImage;
        int hashCode3 = (m + (localImage == null ? 0 : localImage.hashCode())) * 31;
        String str4 = this.primaryCtaButtonLabel;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.primaryCtaClientRoute;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BrandCollectionData(title=", this.title, ", subtitle=", this.subtitle, ", caption=");
        m.append(this.caption);
        m.append(", locations=");
        m.append(this.locations);
        m.append(", mastheadImage=");
        m.append(this.mastheadImage);
        m.append(", primaryCtaButtonLabel=");
        m.append(this.primaryCtaButtonLabel);
        m.append(", primaryCtaClientRoute=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.primaryCtaClientRoute, ")");
    }
}
