package app.cash.local.viewmodels;

import app.cash.local.primitives.BrandSpot;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class LocalEditorialViewEvent {

    public final class AddBrandClicked extends LocalEditorialViewEvent {
        public final BrandSpot brandSpot;

        public AddBrandClicked(BrandSpot brandSpot) {
            this.brandSpot = brandSpot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddBrandClicked) && this.brandSpot.equals(((AddBrandClicked) obj).brandSpot);
        }

        public final int hashCode() {
            return this.brandSpot.hashCode();
        }

        public final String toString() {
            return "AddBrandClicked(brandSpot=" + this.brandSpot + ")";
        }
    }

    public final class BackClicked extends LocalEditorialViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 1163097181;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CarouselItemClicked extends LocalEditorialViewEvent {
        public final String url;

        public CarouselItemClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CarouselItemClicked) && Intrinsics.areEqual(this.url, ((CarouselItemClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CarouselItemClicked(url=", this.url, ")");
        }
    }

    public final class RemoveBrandClicked extends LocalEditorialViewEvent {
        public final BrandSpot brandSpot;

        public RemoveBrandClicked(BrandSpot brandSpot) {
            this.brandSpot = brandSpot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveBrandClicked) && this.brandSpot.equals(((RemoveBrandClicked) obj).brandSpot);
        }

        public final int hashCode() {
            return this.brandSpot.hashCode();
        }

        public final String toString() {
            return "RemoveBrandClicked(brandSpot=" + this.brandSpot + ")";
        }
    }

    public final class ShareClicked extends LocalEditorialViewEvent {
        public static final ShareClicked INSTANCE = new ShareClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareClicked);
        }

        public final int hashCode() {
            return 2011963339;
        }

        public final String toString() {
            return "ShareClicked";
        }
    }

    public final class UrlClicked extends LocalEditorialViewEvent {
        public final String url;

        public UrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlClicked) && Intrinsics.areEqual(this.url, ((UrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlClicked(url=", this.url, ")");
        }
    }
}
