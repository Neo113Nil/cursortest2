package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class MenuItemAvailability {

    public final class Available extends MenuItemAvailability {
        public final String originalPriceBeforeDeal;
        public final String price;

        public Available(String str, String str2) {
            this.price = str;
            this.originalPriceBeforeDeal = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Available)) {
                return false;
            }
            Available available = (Available) obj;
            return Intrinsics.areEqual(this.price, available.price) && Intrinsics.areEqual(this.originalPriceBeforeDeal, available.originalPriceBeforeDeal);
        }

        public final int hashCode() {
            String str = this.price;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.originalPriceBeforeDeal;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Available(price=", this.price, ", originalPriceBeforeDeal=", this.originalPriceBeforeDeal, ")");
        }
    }

    public final class SoldOut extends MenuItemAvailability {
        public static final SoldOut INSTANCE = new SoldOut();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SoldOut);
        }

        public final int hashCode() {
            return -149004633;
        }

        public final String toString() {
            return "SoldOut";
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDirectDepositSetupWithStatusRedirect.deepLinkSpecs;
    }
}
