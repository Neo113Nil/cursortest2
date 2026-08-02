package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.viewmodels.internal.AddRemoveIcon;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class LocalEditorialContent {

    public final class BrandCarousel extends LocalEditorialContent {
        public final AddRemoveIcon addRemoveIcon;
        public final BrandSpot brandSpot;
        public final ArrayList carouselImages;
        public final String description;
        public final LocationStatus locationStatus;
        public final String name;
        public final String shareProfileUrl;

        public final class CarouselImage {
            public final LocalImage image;
            public final String overlayText;
            public final String url;

            public CarouselImage(LocalImage localImage, String str, String str2) {
                localImage.getClass();
                this.image = localImage;
                this.url = str;
                this.overlayText = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CarouselImage)) {
                    return false;
                }
                CarouselImage carouselImage = (CarouselImage) obj;
                return Intrinsics.areEqual(this.image, carouselImage.image) && Intrinsics.areEqual(this.url, carouselImage.url) && Intrinsics.areEqual(this.overlayText, carouselImage.overlayText);
            }

            public final int hashCode() {
                int hashCode = this.image.hashCode() * 31;
                String str = this.url;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.overlayText;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CarouselImage(image=");
                sb.append(this.image);
                sb.append(", url=");
                sb.append(this.url);
                sb.append(", overlayText=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.overlayText, ")");
            }
        }

        public BrandCarousel(BrandSpot brandSpot, String str, LocationStatus locationStatus, String str2, String str3, AddRemoveIcon addRemoveIcon, ArrayList arrayList) {
            str.getClass();
            this.brandSpot = brandSpot;
            this.name = str;
            this.locationStatus = locationStatus;
            this.description = str2;
            this.shareProfileUrl = str3;
            this.addRemoveIcon = addRemoveIcon;
            this.carouselImages = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandCarousel)) {
                return false;
            }
            BrandCarousel brandCarousel = (BrandCarousel) obj;
            return this.brandSpot.equals(brandCarousel.brandSpot) && Intrinsics.areEqual(this.name, brandCarousel.name) && Intrinsics.areEqual(this.locationStatus, brandCarousel.locationStatus) && Intrinsics.areEqual(this.description, brandCarousel.description) && Intrinsics.areEqual(this.shareProfileUrl, brandCarousel.shareProfileUrl) && this.addRemoveIcon == brandCarousel.addRemoveIcon && this.carouselImages.equals(brandCarousel.carouselImages);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.brandSpot.hashCode() * 31, 31, this.name);
            LocationStatus locationStatus = this.locationStatus;
            int hashCode = (m + (locationStatus == null ? 0 : locationStatus.hashCode())) * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.shareProfileUrl;
            return this.carouselImages.hashCode() + ((this.addRemoveIcon.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BrandCarousel(brandSpot=");
            sb.append(this.brandSpot);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", locationStatus=");
            sb.append(this.locationStatus);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", shareProfileUrl=");
            sb.append(this.shareProfileUrl);
            sb.append(", addRemoveIcon=");
            sb.append(this.addRemoveIcon);
            sb.append(", carouselImages=");
            return Recorder$$ExternalSyntheticOutline1.m(")", sb, this.carouselImages);
        }
    }

    public final class Image extends LocalEditorialContent {
        public final LocalImage value;

        public Image(LocalImage localImage) {
            localImage.getClass();
            this.value = localImage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Image) && Intrinsics.areEqual(this.value, ((Image) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "Image(value=" + this.value + ")";
        }
    }

    public final class Spacer extends LocalEditorialContent {
        public final boolean divider;
        public final int height;

        public Spacer(int i, boolean z) {
            this.height = i;
            this.divider = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Spacer)) {
                return false;
            }
            Spacer spacer = (Spacer) obj;
            return this.height == spacer.height && this.divider == spacer.divider;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.divider) + (Integer.hashCode(this.height) * 31);
        }

        public final String toString() {
            return "Spacer(height=" + this.height + ", divider=" + this.divider + ")";
        }
    }

    public final class Text extends LocalEditorialContent {
        public final LocalEditorialText value;

        public Text(LocalEditorialText localEditorialText) {
            this.value = localEditorialText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && this.value.equals(((Text) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "Text(value=" + this.value + ")";
        }
    }
}
