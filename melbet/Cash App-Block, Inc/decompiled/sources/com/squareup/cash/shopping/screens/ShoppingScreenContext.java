package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ShoppingScreenContext implements Parcelable {

    public final class BrandsSearch extends ShoppingScreenContext {
        public static final Parcelable.Creator<BrandsSearch> CREATOR = new AutofillQuestion.Creator(21);
        public final String shopFlowToken;

        public BrandsSearch(String str) {
            str.getClass();
            this.shopFlowToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BrandsSearch) && Intrinsics.areEqual(this.shopFlowToken, ((BrandsSearch) obj).shopFlowToken);
        }

        public final int hashCode() {
            return this.shopFlowToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BrandsSearch(shopFlowToken=", this.shopFlowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.shopFlowToken);
        }
    }

    public final class CardTab extends ShoppingScreenContext {
        public static final Parcelable.Creator<CardTab> CREATOR = new AutofillQuestion.Creator(22);
        public final EntityInformation entityInformation;
        public final String flowToken;

        public CardTab(String str, EntityInformation entityInformation) {
            this.flowToken = str;
            this.entityInformation = entityInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardTab)) {
                return false;
            }
            CardTab cardTab = (CardTab) obj;
            return Intrinsics.areEqual(this.flowToken, cardTab.flowToken) && Intrinsics.areEqual(this.entityInformation, cardTab.entityInformation);
        }

        public final int hashCode() {
            String str = this.flowToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            EntityInformation entityInformation = this.entityInformation;
            return hashCode + (entityInformation != null ? entityInformation.hashCode() : 0);
        }

        public final String toString() {
            return "CardTab(flowToken=" + this.flowToken + ", entityInformation=" + this.entityInformation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
            EntityInformation entityInformation = this.entityInformation;
            if (entityInformation == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                entityInformation.writeToParcel(parcel, i);
            }
        }
    }

    public final class Directory extends ShoppingScreenContext {
        public static final Parcelable.Creator<Directory> CREATOR = new AutofillQuestion.Creator(23);
        public final String discoverFlowToken;
        public final EntityInformation entityInformation;

        public Directory(String str, EntityInformation entityInformation) {
            this.discoverFlowToken = str;
            this.entityInformation = entityInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Directory)) {
                return false;
            }
            Directory directory = (Directory) obj;
            return Intrinsics.areEqual(this.discoverFlowToken, directory.discoverFlowToken) && Intrinsics.areEqual(this.entityInformation, directory.entityInformation);
        }

        public final int hashCode() {
            String str = this.discoverFlowToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            EntityInformation entityInformation = this.entityInformation;
            return hashCode + (entityInformation != null ? entityInformation.hashCode() : 0);
        }

        public final String toString() {
            return "Directory(discoverFlowToken=" + this.discoverFlowToken + ", entityInformation=" + this.entityInformation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.discoverFlowToken);
            EntityInformation entityInformation = this.entityInformation;
            if (entityInformation == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                entityInformation.writeToParcel(parcel, i);
            }
        }
    }

    public final class DirectorySearch extends ShoppingScreenContext {
        public static final Parcelable.Creator<DirectorySearch> CREATOR = new AutofillQuestion.Creator(24);
        public final String discoverFlowToken;
        public final EntityInformation entityInformation;

        public DirectorySearch(String str, EntityInformation entityInformation) {
            this.discoverFlowToken = str;
            this.entityInformation = entityInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DirectorySearch)) {
                return false;
            }
            DirectorySearch directorySearch = (DirectorySearch) obj;
            return Intrinsics.areEqual(this.discoverFlowToken, directorySearch.discoverFlowToken) && Intrinsics.areEqual(this.entityInformation, directorySearch.entityInformation);
        }

        public final int hashCode() {
            String str = this.discoverFlowToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            EntityInformation entityInformation = this.entityInformation;
            return hashCode + (entityInformation != null ? entityInformation.hashCode() : 0);
        }

        public final String toString() {
            return "DirectorySearch(discoverFlowToken=" + this.discoverFlowToken + ", entityInformation=" + this.entityInformation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.discoverFlowToken);
            EntityInformation entityInformation = this.entityInformation;
            if (entityInformation == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                entityInformation.writeToParcel(parcel, i);
            }
        }
    }

    public final class DiscoverBnplCarousel extends ShoppingScreenContext {
        public static final Parcelable.Creator<DiscoverBnplCarousel> CREATOR = new AutofillQuestion.Creator(25);
        public final BrowserOrigin browserOrigin;
        public final String flowToken;
        public final String merchantToken;
        public final String suggestionId;

        public DiscoverBnplCarousel(String str, String str2, String str3, BrowserOrigin browserOrigin) {
            browserOrigin.getClass();
            this.flowToken = str;
            this.suggestionId = str2;
            this.merchantToken = str3;
            this.browserOrigin = browserOrigin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscoverBnplCarousel)) {
                return false;
            }
            DiscoverBnplCarousel discoverBnplCarousel = (DiscoverBnplCarousel) obj;
            return Intrinsics.areEqual(this.flowToken, discoverBnplCarousel.flowToken) && Intrinsics.areEqual(this.suggestionId, discoverBnplCarousel.suggestionId) && Intrinsics.areEqual(this.merchantToken, discoverBnplCarousel.merchantToken) && this.browserOrigin == discoverBnplCarousel.browserOrigin;
        }

        public final int hashCode() {
            String str = this.flowToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.suggestionId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.merchantToken;
            return this.browserOrigin.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DiscoverBnplCarousel(flowToken=", this.flowToken, ", suggestionId=", this.suggestionId, ", merchantToken=");
            m.append(this.merchantToken);
            m.append(", browserOrigin=");
            m.append(this.browserOrigin);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
            parcel.writeString(this.suggestionId);
            parcel.writeString(this.merchantToken);
            parcel.writeString(this.browserOrigin.name());
        }
    }

    public final class MerchantProfile extends ShoppingScreenContext {
        public static final Parcelable.Creator<MerchantProfile> CREATOR = new AutofillQuestion.Creator(26);
        public final String discoverFlowToken;
        public final EntityInformation entityInformation;
        public final MerchantBoostContext merchantBoostContext;

        public MerchantProfile(String str, MerchantBoostContext merchantBoostContext, EntityInformation entityInformation) {
            this.discoverFlowToken = str;
            this.merchantBoostContext = merchantBoostContext;
            this.entityInformation = entityInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchantProfile)) {
                return false;
            }
            MerchantProfile merchantProfile = (MerchantProfile) obj;
            return Intrinsics.areEqual(this.discoverFlowToken, merchantProfile.discoverFlowToken) && Intrinsics.areEqual(this.merchantBoostContext, merchantProfile.merchantBoostContext) && Intrinsics.areEqual(this.entityInformation, merchantProfile.entityInformation);
        }

        public final int hashCode() {
            String str = this.discoverFlowToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            MerchantBoostContext merchantBoostContext = this.merchantBoostContext;
            int hashCode2 = (hashCode + (merchantBoostContext == null ? 0 : merchantBoostContext.hashCode())) * 31;
            EntityInformation entityInformation = this.entityInformation;
            return hashCode2 + (entityInformation != null ? entityInformation.hashCode() : 0);
        }

        public final String toString() {
            return "MerchantProfile(discoverFlowToken=" + this.discoverFlowToken + ", merchantBoostContext=" + this.merchantBoostContext + ", entityInformation=" + this.entityInformation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.discoverFlowToken);
            parcel.writeParcelable(this.merchantBoostContext, i);
            EntityInformation entityInformation = this.entityInformation;
            if (entityInformation == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                entityInformation.writeToParcel(parcel, i);
            }
        }
    }

    public final class OffersTab extends ShoppingScreenContext {
        public static final Parcelable.Creator<OffersTab> CREATOR = new AutofillQuestion.Creator(27);
        public final String flowToken;
        public final Screen parentScreen;
        public final String searchFlowToken;

        public OffersTab(Screen screen, String str, String str2) {
            this.flowToken = str;
            this.searchFlowToken = str2;
            this.parentScreen = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OffersTab)) {
                return false;
            }
            OffersTab offersTab = (OffersTab) obj;
            return Intrinsics.areEqual(this.flowToken, offersTab.flowToken) && Intrinsics.areEqual(this.searchFlowToken, offersTab.searchFlowToken) && Intrinsics.areEqual(this.parentScreen, offersTab.parentScreen);
        }

        public final int hashCode() {
            String str = this.flowToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.searchFlowToken;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Screen screen = this.parentScreen;
            return hashCode2 + (screen != null ? screen.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersTab(flowToken=", this.flowToken, ", searchFlowToken=", this.searchFlowToken, ", parentScreen=");
            m.append(this.parentScreen);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
            parcel.writeString(this.searchFlowToken);
            parcel.writeParcelable(this.parentScreen, i);
        }
    }

    public final class OffersTimelineSheet extends ShoppingScreenContext {
        public static final Parcelable.Creator<OffersTimelineSheet> CREATOR = new AutofillQuestion.Creator(28);
        public final String flowToken;
        public final Screen parentScreen;

        public OffersTimelineSheet(Screen screen, String str) {
            this.flowToken = str;
            this.parentScreen = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OffersTimelineSheet)) {
                return false;
            }
            OffersTimelineSheet offersTimelineSheet = (OffersTimelineSheet) obj;
            return Intrinsics.areEqual(this.flowToken, offersTimelineSheet.flowToken) && Intrinsics.areEqual(this.parentScreen, offersTimelineSheet.parentScreen);
        }

        public final int hashCode() {
            String str = this.flowToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Screen screen = this.parentScreen;
            return hashCode + (screen != null ? screen.hashCode() : 0);
        }

        public final String toString() {
            return "OffersTimelineSheet(flowToken=" + this.flowToken + ", parentScreen=" + this.parentScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
            parcel.writeParcelable(this.parentScreen, i);
        }
    }

    public final class ProductSearch extends ShoppingScreenContext {
        public static final Parcelable.Creator<ProductSearch> CREATOR = new AutofillQuestion.Creator(29);
        public final ShoppingScreenContext referrerScreenContext;
        public final String shopFlowToken;

        public ProductSearch(ShoppingScreenContext shoppingScreenContext, String str) {
            str.getClass();
            this.shopFlowToken = str;
            this.referrerScreenContext = shoppingScreenContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductSearch)) {
                return false;
            }
            ProductSearch productSearch = (ProductSearch) obj;
            return Intrinsics.areEqual(this.shopFlowToken, productSearch.shopFlowToken) && Intrinsics.areEqual(this.referrerScreenContext, productSearch.referrerScreenContext);
        }

        public final int hashCode() {
            int hashCode = this.shopFlowToken.hashCode() * 31;
            ShoppingScreenContext shoppingScreenContext = this.referrerScreenContext;
            return hashCode + (shoppingScreenContext == null ? 0 : shoppingScreenContext.hashCode());
        }

        public final String toString() {
            return "ProductSearch(shopFlowToken=" + this.shopFlowToken + ", referrerScreenContext=" + this.referrerScreenContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.shopFlowToken);
            parcel.writeParcelable(this.referrerScreenContext, i);
        }
    }

    public final class ThirdPartyOffer extends ShoppingScreenContext {
        public static final Parcelable.Creator<ThirdPartyOffer> CREATOR = new ErrorScreen.Creator(1);
        public final EntityInformation entityInformation;
        public final String offerFlowToken;

        public ThirdPartyOffer(String str, EntityInformation entityInformation) {
            this.offerFlowToken = str;
            this.entityInformation = entityInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThirdPartyOffer)) {
                return false;
            }
            ThirdPartyOffer thirdPartyOffer = (ThirdPartyOffer) obj;
            return Intrinsics.areEqual(this.offerFlowToken, thirdPartyOffer.offerFlowToken) && Intrinsics.areEqual(this.entityInformation, thirdPartyOffer.entityInformation);
        }

        public final int hashCode() {
            String str = this.offerFlowToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            EntityInformation entityInformation = this.entityInformation;
            return hashCode + (entityInformation != null ? entityInformation.hashCode() : 0);
        }

        public final String toString() {
            return "ThirdPartyOffer(offerFlowToken=" + this.offerFlowToken + ", entityInformation=" + this.entityInformation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.offerFlowToken);
            EntityInformation entityInformation = this.entityInformation;
            if (entityInformation == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                entityInformation.writeToParcel(parcel, i);
            }
        }
    }
}
