package app.cash.local.viewmodels.wallet;

import app.cash.local.primitives.BrandSpot;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface BrandSheetViewEvent extends BrandCollectionMapViewEvent {

    public final class AddBrandClicked implements BrandSheetViewEvent {
        public final BrandSpot brandSpot;

        public AddBrandClicked(BrandSpot brandSpot) {
            brandSpot.getClass();
            this.brandSpot = brandSpot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddBrandClicked) && Intrinsics.areEqual(this.brandSpot, ((AddBrandClicked) obj).brandSpot);
        }

        public final int hashCode() {
            return this.brandSpot.hashCode();
        }

        public final String toString() {
            return "AddBrandClicked(brandSpot=" + this.brandSpot + ")";
        }
    }

    public final class CheckInClicked implements BrandSheetViewEvent {
        public static final CheckInClicked INSTANCE = new CheckInClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckInClicked);
        }

        public final int hashCode() {
            return 433689682;
        }

        public final String toString() {
            return "CheckInClicked";
        }
    }

    public final class Dismissed implements BrandSheetViewEvent {
        public static final Dismissed INSTANCE = new Dismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -1815598991;
        }

        public final String toString() {
            return "Dismissed";
        }
    }

    public final class ProfileClicked implements BrandSheetViewEvent {
        public static final ProfileClicked INSTANCE = new ProfileClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProfileClicked);
        }

        public final int hashCode() {
            return -1531488394;
        }

        public final String toString() {
            return "ProfileClicked";
        }
    }
}
