package app.cash.local.primitives;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface DiscountCode {

    public final class BannerOffer implements DiscountCode {
        public final String code;
        public final ArrayList entries;
        public final String offerToken;

        public BannerOffer(String str, String str2, ArrayList arrayList) {
            str2.getClass();
            this.code = str;
            this.offerToken = str2;
            this.entries = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerOffer)) {
                return false;
            }
            BannerOffer bannerOffer = (BannerOffer) obj;
            return this.code.equals(bannerOffer.code) && Intrinsics.areEqual(this.offerToken, bannerOffer.offerToken) && this.entries.equals(bannerOffer.entries);
        }

        @Override // app.cash.local.primitives.DiscountCode
        public final String getCode() {
            return this.code;
        }

        public final int hashCode() {
            return this.entries.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.code.hashCode() * 31, 31, this.offerToken);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BannerOffer(code=", this.code, ", offerToken=", OfferToken.m1279toStringimpl(this.offerToken), ", entries="), this.entries);
        }
    }

    public final class Entered implements DiscountCode {
        public final String code;

        public Entered(String str) {
            str.getClass();
            this.code = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Entered) && Intrinsics.areEqual(this.code, ((Entered) obj).code);
        }

        @Override // app.cash.local.primitives.DiscountCode
        public final String getCode() {
            return this.code;
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Entered(code=", this.code, ")");
        }
    }

    public final class MarketingOffer implements DiscountCode {
        public final String code;
        public final ArrayList entries;
        public final MarketingMessageOfferDetails offerDetails;

        public MarketingOffer(String str, MarketingMessageOfferDetails marketingMessageOfferDetails, ArrayList arrayList) {
            str.getClass();
            marketingMessageOfferDetails.getClass();
            this.code = str;
            this.offerDetails = marketingMessageOfferDetails;
            this.entries = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketingOffer)) {
                return false;
            }
            MarketingOffer marketingOffer = (MarketingOffer) obj;
            return Intrinsics.areEqual(this.code, marketingOffer.code) && Intrinsics.areEqual(this.offerDetails, marketingOffer.offerDetails) && this.entries.equals(marketingOffer.entries);
        }

        @Override // app.cash.local.primitives.DiscountCode
        public final String getCode() {
            return this.code;
        }

        public final int hashCode() {
            return this.entries.hashCode() + ((this.offerDetails.hashCode() + (this.code.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketingOffer(code=");
            sb.append(this.code);
            sb.append(", offerDetails=");
            sb.append(this.offerDetails);
            sb.append(", entries=");
            return Recorder$$ExternalSyntheticOutline1.m(")", sb, this.entries);
        }
    }

    String getCode();
}
