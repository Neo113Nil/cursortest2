package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.BrandToken;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalAddBrandsViewEvent {

    public final class BrandClicked implements LocalAddBrandsViewEvent {
        public final String brandToken;
        public final String clientRoute;

        public BrandClicked(String str, String str2) {
            str.getClass();
            this.brandToken = str;
            this.clientRoute = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandClicked)) {
                return false;
            }
            BrandClicked brandClicked = (BrandClicked) obj;
            return Intrinsics.areEqual(this.brandToken, brandClicked.brandToken) && Intrinsics.areEqual(this.clientRoute, brandClicked.clientRoute);
        }

        public final int hashCode() {
            int hashCode = this.brandToken.hashCode() * 31;
            String str = this.clientRoute;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("BrandClicked(brandToken=", BrandToken.m1229toStringimpl(this.brandToken), ", clientRoute=", this.clientRoute, ")");
        }
    }

    public final class BrandToggled implements LocalAddBrandsViewEvent {
        public final String brandToken;
        public final boolean toggleValue;

        public BrandToggled(String str, boolean z) {
            str.getClass();
            this.brandToken = str;
            this.toggleValue = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandToggled)) {
                return false;
            }
            BrandToggled brandToggled = (BrandToggled) obj;
            return Intrinsics.areEqual(this.brandToken, brandToggled.brandToken) && this.toggleValue == brandToggled.toggleValue;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.toggleValue) + (this.brandToken.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("BrandToggled(brandToken=", BrandToken.m1229toStringimpl(this.brandToken), ", toggleValue=", ")", this.toggleValue);
        }
    }

    public final class CancelClicked implements LocalAddBrandsViewEvent {
        public static final CancelClicked INSTANCE = new CancelClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelClicked);
        }

        public final int hashCode() {
            return 514591076;
        }

        public final String toString() {
            return "CancelClicked";
        }
    }

    public final class DoneClicked implements LocalAddBrandsViewEvent {
        public static final DoneClicked INSTANCE = new DoneClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DoneClicked);
        }

        public final int hashCode() {
            return -2000079588;
        }

        public final String toString() {
            return "DoneClicked";
        }
    }
}
