package app.cash.local.primitives;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.local.client.v1.BrandBanner$Action$ApplySingleOffer;
import com.squareup.protos.cash.local.client.v1.BrandBanner$Subtitle$SubtitleText;
import com.squareup.protos.cash.local.client.v1.BrandBanner$Title$TitleText;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.Offer;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandBanner {
    public final Action action;
    public final String body;
    public final LocalImage image;
    public final String label;

    public abstract class Action {

        public final class ApplySingleOffer extends Action {
            public final List cartLines;
            public final String discountCode;
            public final String offerToken;

            public ApplySingleOffer(String str, String str2, List list) {
                str.getClass();
                list.getClass();
                this.offerToken = str;
                this.discountCode = str2;
                this.cartLines = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ApplySingleOffer)) {
                    return false;
                }
                ApplySingleOffer applySingleOffer = (ApplySingleOffer) obj;
                return Intrinsics.areEqual(this.offerToken, applySingleOffer.offerToken) && this.discountCode.equals(applySingleOffer.discountCode) && Intrinsics.areEqual(this.cartLines, applySingleOffer.cartLines);
            }

            public final int hashCode() {
                return this.cartLines.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.offerToken.hashCode() * 31, 31, this.discountCode);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ApplySingleOffer(offerToken=", OfferToken.m1279toStringimpl(this.offerToken), ", discountCode=", this.discountCode, ", cartLines="), this.cartLines, ")");
            }
        }

        public final class ShowLoyaltyRewards extends Action {
            public static final ShowLoyaltyRewards INSTANCE = new ShowLoyaltyRewards();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowLoyaltyRewards);
            }

            public final int hashCode() {
                return -2041179042;
            }

            public final String toString() {
                return "ShowLoyaltyRewards";
            }
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewCustomerProfileWithButtonsConfig.deepLinkSpecs;
        }
    }

    public abstract class Companion {
        public static LocalBrandBanner brandBannerForSpot(GetBuyerInfoResponse.BuyerInfo buyerInfo, Spot spot) {
            int ordinal = spot.ordinal();
            if (ordinal == 0) {
                BrandBanner brandBanner = buyerInfo.profile_banner;
                if (brandBanner != null) {
                    return toModel(brandBanner);
                }
            } else if (ordinal == 1) {
                BrandBanner brandBanner2 = buyerInfo.cart_banner;
                if (brandBanner2 != null) {
                    return toModel(brandBanner2);
                }
            } else if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            return null;
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewDependent.deepLinkSpecs;
        }

        public static LocalBrandBanner toModel(BrandBanner brandBanner) {
            Action.ApplySingleOffer applySingleOffer;
            BrandBanner$Action$ApplySingleOffer brandBanner$Action$ApplySingleOffer = brandBanner.action;
            if (brandBanner$Action$ApplySingleOffer == null) {
                applySingleOffer = null;
            } else {
                Offer offer = brandBanner$Action$ApplySingleOffer.value;
                String str = offer.offer_token;
                str.getClass();
                String str2 = offer.coupon_code;
                if (str2 == null) {
                    str2 = "";
                }
                applySingleOffer = new Action.ApplySingleOffer(str, str2, offer.offer_lines);
            }
            LocalImage localImage = brandBanner.icon;
            LocalImage copy$default = localImage != null ? LocalImage.copy$default(localImage, brandBanner.icon_background_color, null, 47) : null;
            BrandBanner$Title$TitleText brandBanner$Title$TitleText = brandBanner.title;
            String str3 = brandBanner$Title$TitleText == null ? "" : brandBanner$Title$TitleText.value;
            BrandBanner$Subtitle$SubtitleText brandBanner$Subtitle$SubtitleText = brandBanner.subtitle;
            return new LocalBrandBanner(copy$default, str3, brandBanner$Subtitle$SubtitleText != null ? brandBanner$Subtitle$SubtitleText.value : "", applySingleOffer);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Spot {
        public static final /* synthetic */ Spot[] $VALUES;
        public static final Spot CART;
        public static final Spot PROFILE;

        static {
            Spot spot = new Spot("PROFILE", 0);
            PROFILE = spot;
            Spot spot2 = new Spot("CART", 1);
            CART = spot2;
            $VALUES = new Spot[]{spot, spot2, new Spot("CHECKOUT", 2)};
        }

        public static Spot valueOf(String str) {
            return (Spot) Enum.valueOf(Spot.class, str);
        }

        public static Spot[] values() {
            return (Spot[]) $VALUES.clone();
        }
    }

    public LocalBrandBanner(LocalImage localImage, String str, String str2, Action.ApplySingleOffer applySingleOffer) {
        str.getClass();
        str2.getClass();
        this.image = localImage;
        this.label = str;
        this.body = str2;
        this.action = applySingleOffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandBanner)) {
            return false;
        }
        LocalBrandBanner localBrandBanner = (LocalBrandBanner) obj;
        return Intrinsics.areEqual(this.image, localBrandBanner.image) && Intrinsics.areEqual(this.label, localBrandBanner.label) && Intrinsics.areEqual(this.body, localBrandBanner.body) && Intrinsics.areEqual(this.action, localBrandBanner.action);
    }

    public final int hashCode() {
        LocalImage localImage = this.image;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localImage == null ? 0 : localImage.hashCode()) * 31, 31, this.label), 31, this.body);
        Action action = this.action;
        return m + (action != null ? action.hashCode() : 0);
    }

    public final String toString() {
        return "LocalBrandBanner(image=" + this.image + ", label=" + this.label + ", body=" + this.body + ", action=" + this.action + ")";
    }
}
