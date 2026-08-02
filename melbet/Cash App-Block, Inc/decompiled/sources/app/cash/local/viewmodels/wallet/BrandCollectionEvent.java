package app.cash.local.viewmodels.wallet;

import app.cash.local.primitives.BrandSpot;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface BrandCollectionEvent extends LocalHomeViewEvent, BrandCollectionMapViewEvent {

    public final class BrandFollowToggled implements BrandCollectionEvent {
        public final BrandSpot brandSpot;

        public BrandFollowToggled(BrandSpot brandSpot) {
            brandSpot.getClass();
            this.brandSpot = brandSpot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BrandFollowToggled) && Intrinsics.areEqual(this.brandSpot, ((BrandFollowToggled) obj).brandSpot);
        }

        public final int hashCode() {
            return this.brandSpot.hashCode();
        }

        public final String toString() {
            return "BrandFollowToggled(brandSpot=" + this.brandSpot + ")";
        }
    }

    public final class LocationRowClicked implements BrandCollectionEvent {
        public final String clientRoute;

        public LocationRowClicked(String str) {
            this.clientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationRowClicked) && this.clientRoute.equals(((LocationRowClicked) obj).clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocationRowClicked(clientRoute=", this.clientRoute, ")");
        }
    }

    public final class PrimaryCtaClicked implements BrandCollectionEvent {
        public final String clientRoute;

        public PrimaryCtaClicked(String str) {
            str.getClass();
            this.clientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrimaryCtaClicked) && Intrinsics.areEqual(this.clientRoute, ((PrimaryCtaClicked) obj).clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PrimaryCtaClicked(clientRoute=", this.clientRoute, ")");
        }
    }

    public final class SearchInputChanged implements BrandCollectionEvent {
        public final String text;

        public SearchInputChanged(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchInputChanged) && Intrinsics.areEqual(this.text, ((SearchInputChanged) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchInputChanged(text=", this.text, ")");
        }
    }
}
